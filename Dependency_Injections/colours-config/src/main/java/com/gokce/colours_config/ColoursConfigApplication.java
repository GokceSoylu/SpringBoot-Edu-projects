package com.gokce.colours_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.java.Log;
import lombok.RequiredArgsConstructor;
import main.java.com.gokce.colours_config.Services.ColourPrinter;
import main.java.com.gokce.colours_config.Services.impl.ColourPrinterImpl;

import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
@Log
public class ColoursConfigApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ColoursConfigApplication.class, args);
	}

	@Override
	public void run(final String... args) {
		final ColourPrinter colourPrinter = new ColourPrinterImpl();
		log.info(colourPrinter.print());
	}
}
