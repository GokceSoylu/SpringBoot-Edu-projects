package com.gokce.colours;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.java.Log;
import main.java.com.gokce.colours.serives.ColourPrinter;
import main.java.com.gokce.colours.serives.impl.ColourPrinterImpl;

@SpringBootApplication
@Log
public class ColoursApplication {

	public static void main(String[] args) {
		SpringApplication.run(ColoursApplication.class, args);
	}

	@Override
	public void run(final String... args) {
		final ColourPrinter clourPrinter = new ColourPrinterImpl();
		log.info(colourPrinter.print());
	}
}
