package org.designpatterns.structural.flyweight_10;

public class UserExtrinsicState {
    // These properties except flyweight are changes for every multiple users instances created
    // The personal information wil be same which is kept as a flyweight
    private Colour coinColour;
    private int currentGameStreak;
    private UserIntrinsicState flyWeight;

    public UserExtrinsicState(Colour coinColour, int currentGameStreak, UserIntrinsicState flyWeight) {
        this.coinColour = coinColour;
        this.currentGameStreak = currentGameStreak;
        this.flyWeight = flyWeight;
    }
}
