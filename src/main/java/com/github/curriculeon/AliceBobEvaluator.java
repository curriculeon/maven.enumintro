package com.github.curriculeon;

public class AliceBobEvaluator {
    String name;
    public AliceBobEvaluator(){
        this.name="";
    }
    public AliceBobEvaluator(String input) {
        this.name=input;
    }

    public boolean isBob() {
        if("bob".equals(this.name.toLowerCase()))
            return true;
        return false;
    }

    public boolean isAlice() {
        if("alice".equals(this.name.toLowerCase()))
            return true;
        return false;
    }
}
