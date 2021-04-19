package com.carvedrock.ft.api.model;

public class Machine {

    private final String machineKey;
    private final String name;
    private final String manufacturer;

    public Machine(String machineKey, String name, String manufacturer) {
        this.machineKey = machineKey;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public String getMachineKey() {
        return machineKey;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
