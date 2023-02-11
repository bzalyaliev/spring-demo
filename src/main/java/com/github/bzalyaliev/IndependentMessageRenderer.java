package com.github.bzalyaliev;

import org.springframework.beans.factory.annotation.Autowired;

// 1. Spring находит в context.xml bean IndependentMessageRenderer
// 2. Видит, что стоит @Autowired
// 3. Видит, что есть поле MessageRenderer
// 4. Он находит автоматически в контейнере бин с подходящей реализацией MessageRenderer, например, MessageRendererStandardImpl
// 5. Создаёт экземпляр MessageRendererStandardImpl и подставляет в конструктор IndependentMessageRenderer.
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
