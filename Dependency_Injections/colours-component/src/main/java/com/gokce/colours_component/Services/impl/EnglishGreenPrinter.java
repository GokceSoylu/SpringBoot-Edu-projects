package main.java.com.gokce.colours_component.Services.impl;

import main.java.com.gokce.colours_component.Services.GreenPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishGreenPrinter implements GreenPrinter {
    @Override
    public String print() {
        return "Green";
    }
}
