package com.github.curriculeon;

public enum AliceBobEnum{
    ALICE("ALICE", "Hey, my name is ALICE!"), BOB("BOB", "Hey, my name is BOB!");
    private String name;
    private String catchPhrase = "Hey, my name is";
    AliceBobEnum(String name, String catchPhrase){
        this.name = name;
        this.catchPhrase = catchPhrase;
    }
    AliceBobEnum() {
    }
    public String getCatchPhrase() {
        return this.catchPhrase;
    }

    public boolean isBob() {
        if(this.name.equals("BOB")){
            return true;
        }
        return false;
    }

    public boolean isAlice() {
        if(this.name.equals("ALICE")){
            return true;
        }
        return false;
    }
}
