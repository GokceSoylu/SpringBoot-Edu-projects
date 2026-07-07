package com.gokce.colours_component;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.java.Log;
import lombok.RequiredArgsConstructor;
import main.java.com.gokce.colours_component.Services.ColourPrinter;
import main.java.com.gokce.colours_component.Services.impl.ColourPrinterImpl;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
@Log
@ComponentScan(basePackages = { "com.gokce.colours_component", "main.java.com.gokce.colours_component" })
public class ColoursComponentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ColoursComponentApplication.class, args);
	}

	private ColourPrinter colourPrinter;

	public ColoursComponentApplication(ColourPrinter colourPrinter) {
		this.colourPrinter = colourPrinter;
	}

	@Override
	public void run(final String... args) {

		log.info(colourPrinter.print());
	}
}
