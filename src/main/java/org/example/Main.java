package org.example;

import org.example.Controller.CodingController;
import org.example.Service.InputValidator;
import org.example.Service.impl.CodingEvaluator;
import org.example.Service.impl.PlateNumberValidator;
import org.example.View.Display;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        InputValidator iv = new PlateNumberValidator();
        CodingController cc = new CodingController(new Display(), br, iv, new CodingEvaluator());
        cc.runProgram();
    }
}