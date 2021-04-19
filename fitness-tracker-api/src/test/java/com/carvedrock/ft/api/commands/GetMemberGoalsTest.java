package com.carvedrock.ft.api.commands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetMemberGoalsTest {

    @Test
    public void returnsGoals() {
        assertNotNull(GetMemberGoals.getGoals());
    }

}