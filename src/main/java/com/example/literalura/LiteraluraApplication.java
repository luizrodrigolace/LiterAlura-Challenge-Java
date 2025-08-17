package com.example.literalura;

import com.example.literalura.principal.Principal;
import com.example.literalura.repository.AutorRepository;
import com.example.literalura.repository.LivroRepository;
import com.example.literalura.service.ConsumoAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

	// Injeção de dependência para o repositório de livros
	@Autowired
	private LivroRepository livroRepository;

	// Injeção de dependência para o repositório de autores
	@Autowired
	private AutorRepository autorRepository;

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Cria a instância de Principal passando os dois repositórios injetados
		Principal principal = new Principal(livroRepository, autorRepository);
		principal.exibeMenu();
	}
}