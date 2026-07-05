package com.gokce.colours;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import main.java.com.gokce.colours.services.impl.EnglishColourPrinter;
import main.java.com.gokce.colours.services.ColourPrinter;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
@Log
public class ColoursApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ColoursApplication.class, args);
	}

	@Override
	public void run(final String... args) {
		final ColourPrinter colourPrinter = new EnglishColourPrinter();
		log.info(colourPrinter.print());
	}
}
