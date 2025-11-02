# ⚙️ CRUD EiTruck

Este repositório contém a **implementação da camada de persistência do sistema Ei Truck**, responsável pela **conexão com o banco de dados, modelagem das entidades e operações CRUD (Create, Read, Update, Delete)** realizadas pelas classes DAO.

O módulo serve como base para o projeto principal, porteriormente é integrada com o **Servlet Ei Truck** e a **interface web JSP** e aprimorada posteriormente no repositório **Servlet**.

---

## Estrutura do Projeto

A estrutura do repositório segue a arquitetura MVC, concentrando-se nas camadas **Model** e **DAO**:

| Pasta / Arquivo | Descrição |
|-----------------|------------|
| **model/**      | Contém as classes Java que representam as entidades do banco (Administrador, Analista, Unidade, Segmento, Endereco, TipoOcorrencia, etc). |
| **dao/**        | Implementa as operações CRUD e consultas personalizadas para cada entidade. |
| **conexao/**    | Inclui a classe de conexão com o banco de dados responsável por gerenciar o acesso ao PostgreSQL. |

---

## Classes Model

| Model              | Função |
|--------------------|--------|
| **Administrador**  | Representa os administradores do sistema. |
| **Analista**       | Profissionais responsáveis pela análise das ocorrências. |
| **Endereco**       | Informações de localização associadas a unidades e segmentos. |
| **Unidade**        | Unidades operacionais cadastradas no sistema. |
| **Segmento**       | Setores e áreas internas das unidades. |
| **TipoOcorrencia** | Classificação dos eventos e infrações monitoradas. |

---

## Classes DAO

Cada entidade possui uma classe DAO dedicada para gerenciar as operações de banco de dados, seguindo o padrão **Data Access Object (DAO)**:

| DAO | Responsabilidade |
|------|------------------|
| `AdministradorDAO` | Inserção, exclusão, listagem e atualização de administradores. |
| `AnalistaDAO` | Controle dos registros de analistas. |
| `EnderecoDAO` | Manipulação de dados de endereço vinculados a unidades e segmentos. |
| `UnidadeDAO` | Operações sobre as unidades do sistema. |
| `SegmentoDAO` | Persistência de dados de segmentos. |
| `TipoOcorrenciaDAO` | Controle de categorias de ocorrência. |

---

## Dependências Principais

- **PostgreSQL Driver (42.7+)**
- **Maven** (para build e dependências)
- **.env** (para conectar a um BD)
- **Java 17+**

---

## Autores

Equipe **Ei Truck**  
Desenvolvido como parte do **projeto interdisciplinar de análise e automação de telemetria de transportes**.
"""