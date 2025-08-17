package com.example.literalura.principal;

import com.example.literalura.model.Autor;
import com.example.literalura.model.DadosAutor;
import com.example.literalura.model.DadosLivro;
import com.example.literalura.model.DadosResposta;
import com.example.literalura.model.Livro;
import com.example.literalura.repository.AutorRepository;
import com.example.literalura.repository.LivroRepository;
import com.example.literalura.service.ConsumoAPI;
import com.example.literalura.service.ConverteDados;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Principal {
    private final LivroRepository livroRepository;
    private final AutorRepository autorRepository;
    private Scanner leitura = new Scanner(System.in);
    private ConsumoAPI consumo = new ConsumoAPI();
    private ConverteDados conversor = new ConverteDados();
    private final String ENDERECO = "https://gutendex.com/books/?search=";

    public Principal(LivroRepository livroRepository, AutorRepository autorRepository) {
        this.livroRepository = livroRepository;
        this.autorRepository = autorRepository;
    }

    public void exibeMenu() {
        var opcao = -1;
        while(opcao != 0) {
            var menu = """
                    Escolha o número de sua opção:
                    1 - Buscar livro pelo título
                    2 - Listar livros registrados
                    3 - Listar autores registrados
                    4 - Listar autores vivos em um determinado ano
                    5 - Listar livros em um determinado idioma
                                    
                    0 - Sair                                 
                    """;

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    buscarLivroWeb();
                    break;
                case 2:
                    listarLivrosRegistrados();
                    break;
                case 3:
                    listarAutoresRegistrados();
                    break;
                case 4:
                    listarAutoresVivosEmDeterminadoAno();
                    break;
                case 5:
                    listarLivrosPorIdioma();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private void buscarLivroWeb() {
        // Lógica para buscar e salvar livro (sem alterações aqui)
    }

    private void listarLivrosRegistrados() {
        // Lógica para listar livros (sem alterações aqui)
    }

    private void listarAutoresRegistrados() {
        // Lógica para listar autores (sem alterações aqui)
    }

    private void listarAutoresVivosEmDeterminadoAno() {
        // Lógica para listar autores vivos (sem alterações aqui)
    }

    private void listarLivrosPorIdioma() {
        System.out.println("Escolha o idioma para buscar:");
        System.out.println("es - espanhol");
        System.out.println("en - inglês");
        System.out.println("pt - português");

        var idioma = leitura.nextLine().toLowerCase();

        List<Livro> livrosPorIdioma = livroRepository.findByIdiomas(idioma);

        if (livrosPorIdioma.isEmpty()) {
            System.out.println("Nenhum livro encontrado para o idioma " + idioma + ".");
        } else {
            System.out.println("--- LIVROS EM " + idioma.toUpperCase() + " ---");
            livrosPorIdioma.forEach(System.out::println);
            System.out.println("------------------------------------");
        }
    }
}