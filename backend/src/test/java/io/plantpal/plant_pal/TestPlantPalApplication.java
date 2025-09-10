package io.plantpal.plant_pal;

import org.springframework.boot.SpringApplication;

public class TestPlantPalApplication {

	public static void main(String[] args) {
		SpringApplication.from(PlantPalApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
