package com.carvedrock.ft.api.commands;

import com.carvedrock.ft.api.model.Goal;

import java.util.ArrayList;
import java.util.List;

public class GetMemberGoals {

    public static List<Goal> getGoals() {
        ArrayList<Goal> goals = new ArrayList<>();
        goals.add(new Goal("Squat Reps 50 Pounds", "squat", 10));
        goals.add(new Goal("Biceps Curl 30 Pounds", "bicep-seated-curl", 20));
        return goals;
    }


}
