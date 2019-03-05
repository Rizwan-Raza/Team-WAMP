package com.wampinfotech.teamwamp.notifications;

public class Sender {
    private Data data;
    private String to;

    public Sender() {
    }

    public Sender(Data data, String to) {
        this.data = data;
        this.to = to;
    }
}
