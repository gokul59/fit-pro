package com.carvedrock.ft.api.commands;

import com.carvedrock.ft.api.model.Machine;

import java.util.ArrayList;

public class GetSupportedMachines {

    public static ArrayList<Machine> getMachines() {
        ArrayList<Machine> machines = new ArrayList<>();
        machines.add(new Machine("squat", "Squat Machine", "Acme"));
        machines.add(new Machine("bicep-seated-curl", "Seated Bicep Curl", "Acme"));
        return machines;
    }
}
