package com.github.bzalyaliev;

public class IndependentMessageRenderer {
    private MessageRenderer renderer;

    public IndependentMessageRenderer(MessageRenderer renderer) {
        this.renderer = renderer;
    }

    public void print() {
        renderer.printMessage();

    }

}
