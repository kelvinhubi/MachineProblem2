package org.example.View;

import org.example.Model.BusInfo;

import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Display {
    public void text(String value) {
        System.out.print(value);
    }

    public void codingStatistics(List<BusInfo> bsArrList, List<BusInfo> bsLinkedList, List<BusInfo> bsVectorList,
            Set<BusInfo> bsTreeSet, Deque<BusInfo> bsArrayDeque) {
        // Display ArrayList size for Monday Coding
        System.out.printf("Monday Coding %d\n", bsArrList.size());
        // Display LinkedList size for Tuesday Coding
        System.out.printf("Tuesday Coding %d\n", bsLinkedList.size());
        // Display VectorList size for Wednesday Coding
        System.out.printf("Wednesday Coding %d\n", bsVectorList.size());
        // Display TreeSet size for Thursday Coding
        System.out.printf("Thursday Coding %d\n", bsTreeSet.size());
        // Display ArrayDeque size for Friday Coding
        System.out.printf("Friday Coding %d\n", bsArrayDeque.size());
    }

    // Final output display all list
    public void codingList(List<BusInfo> bsArrList, List<BusInfo> bsLinkedList, List<BusInfo> bsVectorList,
            Set<BusInfo> bsTreeSet, Deque<BusInfo> bsArrayDeque) {
        // Display ArrayList size for Monday Coding
        text("Monday Coding:\n");
        for (BusInfo info : bsArrList) {
            System.out.printf("Bus Name: %s\nPlateNo: %s\nDriver Name: %s\n", info.getBusName(), info.getPlateNo(),
                    info.getDriverName());
        }
        // Display LinkedList size for Tuesday Coding
        text("Tuesday Coding:\n");
        Iterator<BusInfo> ibsLinkedList = bsLinkedList.iterator();
        while (ibsLinkedList.hasNext()) {
            BusInfo info = ibsLinkedList.next();
            System.out.printf("Bus Name: %s\nPlateNo: %s\nDriver Name: %s\n", info.getBusName(), info.getPlateNo(),
                    info.getDriverName());
        }
        // Display VectorList size for Wednesday Coding
        text("Wednesday Coding:\n");
        for (BusInfo info : bsVectorList) {
            System.out.printf("Bus Name: %s\nPlateNo: %s\nDriver Name: %s\n", info.getBusName(), info.getPlateNo(),
                    info.getDriverName());
        }
        // Display TreeSet size for Thursday Coding
        text("Thursday Coding:\n");
        Iterator<BusInfo> ibsTreeSet = bsTreeSet.iterator();
        while (ibsTreeSet.hasNext()) {
            BusInfo info = ibsTreeSet.next();
            System.out.printf("Bus Name: %s\nPlateNo: %s\nDriver Name: %s\n", info.getBusName(), info.getPlateNo(),
                    info.getDriverName());
        }
        // Display ArrayDeque size for Friday Coding
        text("Friday Coding:\n");
        for (BusInfo info : bsArrayDeque) {
            System.out.printf("Bus Name: %s\nPlateNo: %s\nDriver Name: %s\n", info.getBusName(), info.getPlateNo(),
                    info.getDriverName());
        }
    }

}
