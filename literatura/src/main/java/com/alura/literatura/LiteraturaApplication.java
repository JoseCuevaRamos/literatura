package com.alura.literatura;

import com.alura.literatura.principal.Principal;
import com.alura.literatura.repository.IAutoresRepository;
import com.alura.literatura.repository.ILibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraturaApplication implements CommandLineRunner {

	@Autowired
	private IAutoresRepository autoresRepositorio;

	@Autowired
	private ILibrosRepository librosRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(LiteraturaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Crear una instancia de la clase Principal y pasarle los repositorios
		Principal principal = new Principal(autoresRepositorio, librosRepositorio);
		principal.muestraElMenu(); // Llamar al método que maneja el flujo de la aplicación
	}
}
