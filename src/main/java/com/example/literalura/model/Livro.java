package com.example.literalura.model;

import jakarta.persistence.*;

@Entity
@Table(name = "livros")
public class Livro {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(unique = true)
        private String titulo;

        @ManyToOne
        private Autor autor;

        private String idiomas;

        private Integer nDownloads;

        public Livro() {}

        public Livro(DadosLivro dados, Autor autor) {
                this.titulo = dados.titulo();
                this.autor = autor;

                if (!dados.idiomas().isEmpty()) {
                        this.idiomas = dados.idiomas().get(0);
                }

                this.nDownloads = dados.nDownloads();
        }

        // Getters e Setters
        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getTitulo() {
                return titulo;
        }

        public void setTitulo(String titulo) {
                this.titulo = titulo;
        }

        public Autor getAutor() {
                return autor;
        }

        public void setAutor(Autor autor) {
                this.autor = autor;
        }

        public String getIdiomas() {
                return idiomas;
        }

        public void setIdiomas(String idiomas) {
                this.idiomas = idiomas;
        }

        public Integer getnDownloads() {
                return nDownloads;
        }

        public void setnDownloads(Integer nDownloads) {
                this.nDownloads = nDownloads;
        }

        @Override
        public String toString() {
                return  "---------- LIVRO ----------\n" +
                        "Título: " + titulo + "\n" +
                        "Autor: " + autor.getNome() + "\n" +
                        "Idioma: " + idiomas + "\n" +
                        "Número de Downloads: " + nDownloads + "\n" +
                        "---------------------------\n";
        }
}