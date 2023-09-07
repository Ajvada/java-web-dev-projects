package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {
    public DVD(String name, double storageCapacity, double remainingCapacity, double capacityUsed, String discType) {
        super(name, storageCapacity, remainingCapacity, capacityUsed, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println(" Really fast");

    }

    @Override
    public void readData() {

    }

    @Override
    public void destroyMicrowave() {

    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
