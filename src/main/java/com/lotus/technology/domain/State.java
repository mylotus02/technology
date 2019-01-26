package com.lotus.technology.domain;

public enum State {
    VALID(0), DELETE(1);
    private int state;
    State(int state) {
        this.state = state;
    }
    public int getState() {
        return state;
    }
}
