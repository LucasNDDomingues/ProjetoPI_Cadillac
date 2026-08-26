Projeto Integrador — Sistema de Cadastro de Clientes e Contatos
<p align="center"> Sistema CRUD desenvolvido em Java Console utilizando matrizes bidimensionais para gerenciamento de clientes e contatos. </p> <p align="center"> <img alt="Java" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"> <img alt="Status" src="https://img.shields.io/badge/status-em%20desenvolvimento-yellow?style=for-the-badge"> <img alt="GitHub" src="https://img.shields.io/badge/versionamento-GitHub-black?style=for-the-badge&logo=github"> <img alt="License" src="https://img.shields.io/badge/license-Acad%C3%AAmico-blue?style=for-the-badge"> </p>
📖 Sobre o Projeto

Este projeto foi desenvolvido como parte do Projeto Integrador (PI) com o objetivo de implementar um sistema completo de gerenciamento de clientes e contatos utilizando exclusivamente recursos fundamentais da linguagem Java.

A aplicação funciona totalmente em ambiente console e utiliza matrizes bidimensionais (String[][]) como estrutura principal de armazenamento de dados, sem utilização de banco de dados, coleções ou bibliotecas externas.

O sistema implementa um relacionamento 1:N (um para muitos), onde um cliente pode possuir múltiplos contatos vinculados.

🎯 Objetivos do Projeto
Desenvolver um sistema CRUD completo em Java
Aplicar conceitos de lógica de programação
Trabalhar manipulação manual de matrizes
Implementar relacionamento entre entidades
Desenvolver ordenação manual sem métodos prontos
Simular um sistema de gerenciamento real
Aplicar versionamento com Git/GitHub
Trabalhar desenvolvimento colaborativo em equipe
🚀 Funcionalidades
👤 Clientes
✅ Incluir cliente
✅ Listar clientes em formato de tabela
✅ Consultar cliente por código
✅ Alterar cliente
✅ Apagar cliente
✅ Ordenar clientes por nome
📞 Contatos
✅ Incluir contato
✅ Listar contatos
✅ Listar contatos por cliente
✅ Alterar contato
✅ Apagar contato
📊 Relatórios
✅ Total de clientes
✅ Total de contatos
✅ Média de contatos por cliente
✅ Clientes sem contatos
✅ Quantidade total de registros
🧠 Conceitos Aplicados
Programação Estruturada
CRUD em Java
Manipulação de Matrizes
Crescimento Dinâmico Manual
Relacionamento 1:N
Algoritmos de Ordenação
Comparação manual de Strings
Modularização
Estruturas Condicionais
Estruturas de Repetição
Menus interativos
Versionamento com Git
🏗️ Estrutura das Matrizes
Clientes
Índice	Campo
[0]	Código
[1]	Nome
[2]	CPF/CNPJ
[3]	Data de nascimento
[4]	Sexo
[5]	Cidade
[6]	Estado
[7]	Status
Contatos
Índice	Campo
[0]	Código contato
[1]	Código cliente
[2]	Tipo
[3]	Valor
[4]	Status
🔗 Relacionamento do Sistema

O sistema implementa uma relação:

1 Cliente → N Contatos

Cada contato é vinculado a um cliente através do código do cliente armazenado na matriz de contatos.

⚠️ Regras Técnicas
✅ Permitido
Scanner
String
String[][]
int
if / else
switch
for
while / do while
funções static
charAt()
length()
toUpperCase()
❌ Proibido
ArrayList
List
Map / HashMap
Banco de dados
Arquivos
Classes de entidade
Objetos Cliente/Contato
compareTo()
Arrays.sort()
Collections.sort()
Bibliotecas externas
🧩 Funcionalidades Técnicas Obrigatórias
Clientes
aumentarMatrizClientes
incluirCliente
listarClientesTabela
buscarClientePorCodigo
alterarCliente
apagarCliente
ordenarClientesPorNome
Contatos
aumentarMatrizContatos
incluirContato
listarContatosTabela
listarContatosPorCliente
alterarContato
apagarContato
Auxiliares
compararNomeCharPorChar
copiarLinha
limparLinha
trocarLinhas
📂 Estrutura do Projeto
src/
 ├── Main.java
 ├── MenuCliente.java
 ├── MenuContato.java
 ├── Relatorios.java
 ├── Utils.java
 └── README.md
▶️ Como Executar
# Clonar o repositório
git clone <repositorio>

# Abrir no IntelliJ IDEA

# Executar a classe principal
Main.java
👥 Equipe

Projeto desenvolvido em equipe para fins acadêmicos.

📅 Status do Projeto
🚧 Em desenvolvimento
📌 Objetivo Acadêmico

Este projeto tem como foco consolidar conhecimentos em:

Java
Estruturas de Dados
Lógica de Programação
Organização de Código
Desenvolvimento Colaborativo
Controle de Versionamento
📄 Licença

Projeto desenvolvido exclusivamente para fins acadêmicos.
