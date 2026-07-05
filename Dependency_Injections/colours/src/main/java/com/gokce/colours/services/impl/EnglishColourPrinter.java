package main.java.com.gokce.colours.services.impl;

import main.java.com.gokce.colours.services.BluePrinter;
import main.java.com.gokce.colours.services.ColourPrinter;
import main.java.com.gokce.colours.services.GreenPrinter;
import main.java.com.gokce.colours.services.RedPrinter;

public class EnglishColourPrinter implements ColourPrinter {
    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public EnglishColourPrinter() {
        this.bluePrinter = new EnglishBluePrinter();
        this.redPrinter = new EnglishRedPrinter();
        this.greenPrinter = new EnglishGreenPrinter();
    }

    @Override
    public String print() {
        return String.join(", ", bluePrinter.print(), redPrinter.print(), greenPrinter.print());
    }
}
