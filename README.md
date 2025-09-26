# Cadastro de Ninjas API

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-green)
![Maven](https://img.shields.io/badge/Maven-4.0-red)
![GitHub](https://img.shields.io/badge/GitHub-Actions-black?logo=github)

API REST para um sistema de cadastro de Ninjas e Missões, desenvolvida como parte de um projeto de aprofundamento em Java e Spring Boot.

## 🎯 Objetivo do Projeto

O objetivo principal deste projeto é demonstrar o conhecimento prático na construção de uma API REST completa, seguindo as melhores práticas de arquitetura de software (Controller, Service, Repository) e utilizando as tecnologias mais requisitadas no mercado para desenvolvimento backend Java.

## ✨ Funcionalidades

O sistema permite o gerenciamento completo (CRUD) de duas entidades principais: Ninjas e Missões.

### Ninjas
- **Criar** um novo Ninja (`POST /ninjas`)
- **Listar** todos os Ninjas cadastrados (`GET /ninjas`)
- **Buscar** um Ninja específico por seu ID (`GET /ninjas/{id}`)
- **Atualizar** os dados de um Ninja (`PUT /ninjas/{id}`)
- **Deletar** um Ninja (`DELETE /ninjas/{id}`)

### Missões
- **Criar** uma nova Missão (`POST /missoes`)
- **Listar** todas as Missões (`GET /missoes`)
- **Buscar** uma Missão por ID (`GET /missoes/{id}`)
- **Atualizar** os dados de uma Missão (`PUT /missoes/{id}`)
- **Deletar** uma Missão (`DELETE /missoes/{id}`)

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 17
* **Framework:** Spring Boot 3
* **Acesso a Dados:** Spring Data JPA / Hibernate
* **Banco de Dados:** H2 Database (banco em memória para desenvolvimento)
* **Gerenciador de Dependências:** Maven
* **Versionamento:** Git & GitHub

## 🚀 Como Executar o Projeto

1.  **Pré-requisitos:**
    * Java 17 (ou superior)
    * Maven 3.x

2.  **Clonar o repositório:**
    ```bash
    git clone [https://github.com/Luan1412/CadastroDeNinjas.git](https://github.com/Luan1412/CadastroDeNinjas.git)
    ```

3.  **Executar a aplicação:**
    * Navegue até a pasta raiz do projeto.
    * Execute o seguinte comando no terminal:
    ```bash
    ./mvnw spring-boot:run
    ```

4.  **Acessar a API:**
    * A aplicação estará rodando em `http://localhost:8080`.
    * Use uma ferramenta como o Postman ou Thunder Client para interagir com os endpoints listados acima.

## 🗺️ Próximos Passos

- [ ] Implementar a camada de Validações (`Bean Validation`).
- [ ] Trocar o banco de dados H2 por um banco permanente (PostgreSQL).
- [ ] Adicionar testes unitários com JUnit e Mockito.
- [ ] Fazer o deploy da aplicação na nuvem (Render/Heroku).
