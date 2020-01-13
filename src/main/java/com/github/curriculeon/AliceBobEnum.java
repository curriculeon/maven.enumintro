package com.github.curriculeon;

public enum AliceBobEnum {
    ALICE("Alice", "Hey, my name is ALICE!"),
    BOB("Bob", "Hey, my name is BOB!");
    private String name;
    private String phrase;
    private AliceBobEnum(String name, String phrase){
        this.name=name;
        this.phrase=phrase;
    }

    public String getCatchPhrase() {return this.phrase;
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
