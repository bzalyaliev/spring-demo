package com.github.bzalyaliev;

import org.springframework.beans.factory.annotation.Autowired;

public class IndependentMessageRenderer {

    @Autowired
    private MessageRenderer renderer;

    public IndependentMessageRenderer(MessageRenderer renderer) {
        this.renderer = renderer;
    }

    public void print() {
        renderer.printMessage();

    }

}
