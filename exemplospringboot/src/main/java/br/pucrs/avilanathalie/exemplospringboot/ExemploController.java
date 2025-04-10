package br.pucrs.avilanathalie.exemplospringboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/biblioteca")
public class ExemploController {

    private List<Livro> livros;

    public ExemploController() {
        livros = new ArrayList<>();
        livros.add(new Livro(1, "Dom Casmurro", "Machado de Assis", 1899));
        livros.add(new Livro(2, "O Hobbit", "J.R.R. Tolkien", 1937));
        livros.add(new Livro(3, "A Revolução dos Bichos", "George Orwell", 1945));
    }

    @GetMapping("/")
    public String getMensagemInicial() {
        return "Aplicacao Spring-Boot funcionando!";
    }

    @GetMapping("/livros")
    public List<Livro> getLivros() {
        return livros;
    }

    @GetMapping("/titulos")
public List<String> getTitulos() {
    List<String> titulos = new ArrayList<>();
    for (Livro livro : livros) {
        titulos.add(livro.getTitulo());
    }
    return titulos;
}

@GetMapping("/autores")
public List<String> getAutores() {
    List<String> autores = new ArrayList<>();
    for (Livro livro : livros) {
        autores.add(livro.getAutor());
    }
    return autores;
}
}
