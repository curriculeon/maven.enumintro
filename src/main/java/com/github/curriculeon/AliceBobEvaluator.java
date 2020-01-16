package com.github.curriculeon;

public class AliceBobEvaluator {
    private String name;
    public AliceBobEvaluator(String input) {
        this.name = input;
    }

    public boolean isAlice() {
        if(this.name.equals("Alice")){
            return true;
        }
        return false;
    }

    public boolean isBob() {
        if(this.name.equals("Bob")){
            return true;
        }
        return false;
    }
}
