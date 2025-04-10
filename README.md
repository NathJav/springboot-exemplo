# springboot-exemplo
# Biblioteca de Livros

Este projeto é um exemplo de aplicação web desenvolvida com Spring Boot, criado para a disciplina Projeto e Arquitetura de Software.

A aplicação simula uma pequena API REST para uma biblioteca fictícia, permitindo a consulta de livros, títulos e autores.

- Java 21
- Spring Boot 3.4.4
- Maven
- VSCode com Codespaces

---

## 🚀 Funcionalidades da API

A aplicação expõe os seguintes endpoints via protocolo HTTP:

| Método | Rota                         | Descrição                              |
|--------|------------------------------|----------------------------------------|
| `GET`  | `/biblioteca/`               | Mensagem de boas-vindas                |
| `GET`  | `/biblioteca/livros`         | Retorna todos os livros (formato JSON) |
| `GET`  | `/biblioteca/titulos`        | Retorna apenas os títulos dos livros   |
| `GET`  | `/biblioteca/autores`        | Retorna apenas os autores dos livros   |

---

### `/biblioteca/livros`

```json
[
  {
    "id": 1,
    "titulo": "Dom Casmurro",
    "autor": "Machado de Assis",
    "ano": 1899
  },
  {
    "id": 2,
    "titulo": "O Hobbit",
    "autor": "J.R.R. Tolkien",
    "ano": 1937
  },
  {
    "id": 3,
    "titulo": "A Revolução dos Bichos",
    "autor": "George Orwell",
    "ano": 1945
  }
]
```

### `/biblioteca/titulos`

```json
[
  "Dom Casmurro",
  "O Hobbit",
  "A Revolução dos Bichos"
]
```

### `/biblioteca/autores`

```json
[
  "Machado de Assis",
  "J.R.R. Tolkien",
  "George Orwell"
]
```

---

## ▶️ Como executar o projeto

1. Clone o repositório:

```bash
git clone https://github.com/NathJav/springboot-exemplo
```

2. Acesse a pasta do projeto:

```bash
cd springboot-exemplo
```

3. Execute o projeto:

```bash
./mvnw spring-boot:run
```

4. Acesse no navegador:

```
http://localhost:8080/biblioteca/livros
```

---

## 👩‍💻 Desenvolvido por

**Nathalie**  
Curso de Engenharia de Software — PUCRS
