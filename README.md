# 📋 dsList

O **dsList** é uma aplicação desenvolvida em Java com Spring Boot que lista jogos (games). O projeto utiliza um banco de dados para armazenar as informações dos games e expõe uma API para gerenciamento e visualização dessas listas. Ele também conta com suporte a **CORS** e está preparado para rodar em ambientes de homologação.

## 📚 Funcionalidades

- [x] Listar todos os games cadastrados.
- [x] Buscar detalhes de um game específico.
- [x] Adicionar novos games à lista.
- [x] Reordenar ou organizar os games em diferentes listas.
- [x] Suporte a **CORS** para integração com aplicações frontend.
- [x] Configuração para ambientes de **homologação** e produção.

## 🚀 Tecnologias Utilizadas

- **Java 21**: Linguagem de programação principal.
- **Spring Boot**: Framework para criação da aplicação.
  - Spring Data JPA: Para interação com o banco de dados.
  - Spring Web: Para criação da API REST.
  - Spring DevTools: Para facilitar o desenvolvimento.
- **H2 Database**: Banco de dados em memória para testes e desenvolvimento.
- **PostgreSQL (via Docker)**: Banco de dados relacional usado em homologação e produção.
- **CORS (Cross-Origin Resource Sharing)**: Para permitir o acesso da API por diferentes origens.
- **Docker**: Para containerização do banco de dados PostgreSQL.
- **Maven**: Gerenciador de dependências.

## ⚙️ Pré-requisitos

- Java 21+
- Maven 3.8+
- Docker (para execução do PostgreSQL)

## 🛠️ Como Executar o Projeto

### 1. Clone o repositório
```bash
git clone https://github.com/nieledm/dslist.git
