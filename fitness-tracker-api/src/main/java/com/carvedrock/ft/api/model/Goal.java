package com.carvedrock.ft.api.model;

public class Goal {

    private final String name;
    private final String machineKey;
    private final int repsGoal;

    public Goal(String name, String machineKey, int repsGoal) {
        this.name = name;
        this.machineKey = machineKey;
        this.repsGoal = repsGoal;
    }

    public String getName() {
        return name;
    }

    public String getMachineKey() {
        return machineKey;
    }

    public int getRepsGoal() {
        return repsGoal;
    }
}
