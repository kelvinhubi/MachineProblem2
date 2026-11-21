package org.example.Service.impl;

import org.example.Model.BusInfo;
import org.example.Service.CodingService;

public class CodingEvaluator implements CodingService {

    @Override
    public int processCoding(BusInfo info) {
        String plateNo = info.getPlateNo();
        int num = Integer.parseInt(plateNo.substring(plateNo.length() - 1));
        int result = 0;
        switch (num) {
            case 1, 2 -> result = 1;
            case 3, 4 -> result = 2;
            case 5, 6 -> result = 3;
            case 7, 8 -> result = 4;
            case 9, 0 -> result = 5;
        }
        return result;
    }
}
