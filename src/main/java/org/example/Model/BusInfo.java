package org.example.Model;

import java.io.Serializable;

public class BusInfo implements Serializable,Comparable<BusInfo> {
    private final String busName;
    private final String plateNo;
    private final String driverName;
    public BusInfo(String busName, String plateNo, String driverName) {
        this.busName = busName;
        this.plateNo = plateNo;
        this.driverName = driverName;
    }
    public String getDriverName() {
        return driverName;
    }
    public String getPlateNo() {
        return plateNo;
    }
    public String getBusName() {
        return busName;
    }

    @Override
    public int compareTo(BusInfo other) {
        if (this.plateNo == null && other.plateNo == null) return 0;
        if (this.plateNo == null) return -1; // Puts nulls at the beginning
        if (other.plateNo == null) return 1;

        return this.plateNo.compareTo(other.plateNo);
    }
}
