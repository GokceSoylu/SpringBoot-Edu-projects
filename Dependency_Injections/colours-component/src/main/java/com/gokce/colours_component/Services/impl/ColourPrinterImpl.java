package main.java.com.gokce.colours_component.Services.impl;

import main.java.com.gokce.colours_component.Services.BluePrinter;
import main.java.com.gokce.colours_component.Services.ColourPrinter;
import main.java.com.gokce.colours_component.Services.RedPrinter;
import main.java.com.gokce.colours_component.Services.GreenPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColourPrinterImpl implements ColourPrinter {

    private GreenPrinter greenPrinter;
    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;

    public ColourPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
        this.redPrinter = redPrinter;

    }

    @Override
    public String print() {
        return String.join(", ", bluePrinter.print(), greenPrinter.print(), redPrinter.print());
    }
}
