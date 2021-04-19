package com.carvedrock.ft.api;

import com.carvedrock.ft.api.commands.GetMemberGoals;
import io.javalin.Javalin;

public class App {

    public static void main(String[] args) {
        Javalin app = Javalin.create().start(getPort());

        // get member goals
        app.get("/goals", ctx -> ctx.json(GetMemberGoals.getGoals()));

        //get supported machines

        //new machine session

    }

    private static int getPort() {
        String herokuPort = System.getenv("PORT");
        if (herokuPort != null) {
            return Integer.parseInt(herokuPort);
        }
        return 7000;
    }

}
