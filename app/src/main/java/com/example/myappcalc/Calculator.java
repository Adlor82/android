package com.example.myappcalc;

import androidx.constraintlayout.solver.state.State;

public class Calculator {

    private int firstArg;
    private int secondArg;

    StringBuilder inputStr = new StringBuilder();

    private State state;

    private enum State {
        firstArgInput;
    }

    public Calculator() {
        state = State.firstArgInput;
    }

    public void onNumPress (int buttonNumId) {
            }

    public void onActPress (int buttonAvtId) {
            }

    public String getText() {
        return inputStr.toString();
    }
}
