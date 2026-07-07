package main.java.com.gokce.colours_component.Services.impl;

import main.java.com.gokce.colours_component.Services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishBluePrinter implements BluePrinter {
    @Override
    public String print() {
        return "Blue";
    }
}
