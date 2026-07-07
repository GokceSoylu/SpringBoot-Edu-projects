package com.gokce.colours_config.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gokce.colours_config.Services.SpanishBluePrinter;
import com.gokce.colours_config.Services.SpanishGreenPrinter;
import com.gokce.colours_config.Services.SpanishRedPrinter;

import main.java.com.gokce.colours_config.Services.BluePrinter;
import main.java.com.gokce.colours_config.Services.ColourPrinter;
import main.java.com.gokce.colours_config.Services.GreenPrinter;
import main.java.com.gokce.colours_config.Services.RedPrinter;
import main.java.com.gokce.colours_config.Services.impl.ColourPrinterImpl;
import main.java.com.gokce.colours_config.Services.impl.EnglishBluePrinter;
import main.java.com.gokce.colours_config.Services.impl.EnglishGreenPrinter;
import main.java.com.gokce.colours_config.Services.impl.EnglishRedPrinter;

@Configuration
public class PrinterConfig {

    @Bean
    public BluePrinter blueprinter() {
        return new SpanishBluePrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new SpanishGreenPrinter();
    }

    @Bean
    public RedPrinter redPrinter() {
        return new SpanishRedPrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
        return new ColourPrinterImpl(redPrinter, bluePrinter, greenPrinter);
    }
}
