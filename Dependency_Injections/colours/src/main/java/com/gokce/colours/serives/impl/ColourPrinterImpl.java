package main.java.com.gokce.colours.serives.impl;

import main.java.com.gokce.colours.serives.BluePrinter;
import main.java.com.gokce.colours.serives.ColourPrinter;
import main.java.com.gokce.colours.serives.GreenPrinter;
import main.java.com.gokce.colours.serives.RedPrinter;

public class ColourPrinterImpl implements ColourPrinter {
    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public ColourPrinterImpl() {
        this.redPrinter = new EnglishRedPrinter();
        this.bluePrinter = new EnglishBluePrinter();
        this.greenPrinter = new EnglishGreenPrinter();
    }

    @Override
    public String print() {
        return String.join(", ", redPrinter.print(), greenPrinter.print(), bluePrinter.print());

    }
}
