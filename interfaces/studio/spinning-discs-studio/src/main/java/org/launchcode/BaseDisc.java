package org.launchcode;

import java.util.ArrayList;

public abstract class BaseDisc {
    private String name;
    private double storageCapacity;

    private double remainingCapacity;

    private double capacityUsed;

    private String discType;

    private ArrayList<String> contents;



    public BaseDisc( String name , double storageCapacity , double remainingCapacity , double capacityUsed , String discType) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.remainingCapacity = remainingCapacity;
        this.capacityUsed = capacityUsed;
        this.discType = discType;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
