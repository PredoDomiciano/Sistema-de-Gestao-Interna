# 📦 Sistema de Gestão Interna — Quarteto Fantástico

Este projeto é o resultado de um trabalho interdisciplinar desenvolvido no 3º semestre do curso de Tecnologia em Informática para Negócios da Fatec São José do Rio Preto. O sistema tem como objetivo otimizar a gestão de funcionários, controle de holerites e administração de produtos de estoque.

## 🎯 Objetivo

Desenvolver um MVP funcional que integre áreas como Recursos Humanos, Financeiro e Controle de Estoque, permitindo:
- Cadastro e gerenciamento de funcionários e cargos;
- Geração e consulta de holerites;
- Registro e controle de produtos;
- Visualização de relatórios e dados relevantes.

## 🧱 Tecnologias Utilizadas

- **Java 17**
- **SQL Server** (Workbench para modelagem e execução)
- **JavaFX** (interface gráfica)
- **Git & GitHub** (versionamento e colaboração)
- **Lucidchart / Draw.io** (modelagem visual do banco)
- **Google Docs** (organização de tarefas e documentação)

## 🗂 Estrutura do Projeto

- `/model`: contém as classes de entidade do sistema (Funcionario, Produto, Holerite, RH).
- `/controller`: lida com a lógica de negócio.
- `/view`: interface desenvolvida com JavaFX.
- `/sql`: scripts de criação e inserção do banco de dados.
- `README.md`: este arquivo.

## 🧠 Funcionalidades Implementadas

- Cadastro e edição de funcionários, com vínculo ao RH.
- Emissão de holerite com cálculo de descontos e salário líquido.
- Cadastro de produtos no estoque, com rastreabilidade por funcionário.
- Geração de relatórios simples (via SQL).
- Validação de dados, integridade referencial e unicidade de CPF.

## 📊 Modelo de Dados (Simplificado)

```text
rh(id_rh, id_quadro, descricao, ...)
quadro_funcionarios(id, nome, cargo, salario, fk_rh)
holerites(id, mes, ano, salario_bruto, descontos, salario_liquido, fk_funcionario)
produtos(id, nome, descricao, quantidade, preco, fk_funcionario)
