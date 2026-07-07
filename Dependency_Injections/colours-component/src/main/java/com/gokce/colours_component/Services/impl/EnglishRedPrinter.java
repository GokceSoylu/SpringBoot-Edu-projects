package main.java.com.gokce.colours_component.Services.impl;

import main.java.com.gokce.colours_component.Services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinter implements RedPrinter {
    @Override
    public String print() {
        return "Red";
    }
}
