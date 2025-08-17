# LiterAlura

### 📖 Descrição

LiterAlura é uma aplicação de console desenvolvida em Java com Spring Boot que interage com a API **Gutendex** para buscar informações sobre livros e autores. O projeto permite persistir os dados em um banco de dados PostgreSQL, oferecendo funcionalidades de busca, listagem e consulta avançada para enriquecer o catálogo de obras.

---

### 💻 Tecnologias Utilizadas

* **Linguagem:** Java 17+
* **Framework:** Spring Boot 3
* **Persistência:** Spring Data JPA
* **Banco de Dados:** PostgreSQL
* **HTTP Client:** `java.net.http.HttpClient` (Java nativo)
* **Parser JSON:** Jackson

---

### ✨ Funcionalidades

O projeto oferece as seguintes funcionalidades no menu principal:

* **Busca de Livro por Título:** Busca um livro na API do Gutendex, salva o primeiro resultado no banco de dados (junto com o autor) e exibe seus detalhes.
* **Listagem de Livros Registrados:** Exibe todos os livros salvos no banco de dados.
* **Listagem de Autores Registrados:** Exibe todos os autores salvos no banco de dados.
* **Listagem de Autores Vivos em um Ano:** Permite que o usuário insira um ano e a aplicação retorna uma lista de todos os autores que estavam vivos naquele período.
* **Listagem de Livros por Idioma:** Permite filtrar e listar livros com base em seu idioma.

---

### 🚀 Como Executar

Para rodar a aplicação, siga os seguintes passos:

1.  **Clone o Repositório:**
    ```bash
    git clone [https://github.com/seu-usuario/seu-projeto.git](https://github.com/seu-usuario/seu-projeto.git)
    ```

2.  **Configurar o Banco de Dados:**
    * Certifique-se de que o PostgreSQL está instalado e em execução na sua máquina.
    * Crie um novo banco de dados. Por exemplo, `literalura_db`.
    * Atualize o arquivo `src/main/resources/application.properties` com as credenciais do seu banco de dados:
        ```properties
        spring.datasource.url=jdbc:postgresql://localhost:5432/literalura_db
        spring.datasource.username=seu_usuario
        spring.datasource.password=sua_senha
        spring.jpa.hibernate.ddl-auto=update
        spring.jpa.show-sql=true
        ```

3.  **Rodar a Aplicação:**
    * Abra o projeto em sua IDE (como IntelliJ ou VS Code).
    * Execute a classe principal `LiteraluraApplication.java`.
    * O menu da aplicação será exibido no console, e você poderá interagir com as funcionalidades.

---

### 👤 Autor

* **Seu Nome**
* **GitHub:** [Link para seu GitHub](https://github.com/seu-usuario)
* **LinkedIn:** [Link para seu LinkedIn](https://linkedin.com/in/seu-perfil)
