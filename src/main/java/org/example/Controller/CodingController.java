package org.example.Controller;

import org.example.Exceptions.InvalidPlateNumberException;
import org.example.Model.BusInfo;
import org.example.Service.CodingService;
import org.example.Service.InputValidator;
import org.example.View.Display;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class CodingController {
    private final Display display;
    private final BufferedReader br;
    private final InputValidator validator;
    private final CodingService cs;
    private List<BusInfo> bsArrList;
    private List<BusInfo> bsLinkedList;
    private List<BusInfo> bsVectorList;
    private Set<BusInfo> bsTreeSet;
    private Deque<BusInfo> bsArrayDeque;

    public CodingController(Display display, BufferedReader br, InputValidator validator, CodingService cs) {
        this.display = display;
        this.br = br;
        this.validator = validator;
        this.cs = cs;
        this.bsArrList = new ArrayList<>();
        this.bsLinkedList = new LinkedList<>();
        this.bsVectorList = new Vector<>();
        this.bsTreeSet = new TreeSet<>();
        this.bsArrayDeque = new ArrayDeque<>();
    }

    public void runProgram() {
        boolean loop = true;
        try {
            while (loop) {
                display.text("Enter bus name: ");
                String busName = br.readLine();
                display.text("Plate No: ");
                String plateNo = br.readLine();
                display.text("Driver assigned: ");
                String driverName = br.readLine();
                if (validator.isFormatValid(plateNo)) {
                    BusInfo bs = new BusInfo(busName, plateNo, driverName);
                    int result = cs.processCoding(bs);
                    switch (result) {
                        case 1 -> bsArrList.add(bs);
                        case 2 -> bsLinkedList.add(bs);
                        case 3 -> bsVectorList.add(bs);
                        case 4 -> bsTreeSet.add(bs);
                        case 5 -> bsArrayDeque.add(bs);
                    }
                } else {
                    throw new InvalidPlateNumberException("Invalid Plate Number");
                }
                display.codingStatistics(bsArrList, bsLinkedList, bsVectorList, bsTreeSet, bsArrayDeque);
                display.text("Do you want to process another coding [Y/N]? ");
                String choice = br.readLine();
                if (!choice.equalsIgnoreCase("y")) {
                    loop = false;
                }
            }
            display.codingList(bsArrList, bsLinkedList, bsVectorList, bsTreeSet, bsArrayDeque);
        } catch (InvalidPlateNumberException e) {
            System.out.print(e.getMessage());
        } catch (IOException e) {
            System.out.print("Error IO" + e);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.print("BufferedReader is null");
            }
        }
    }

}
