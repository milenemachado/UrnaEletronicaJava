# Urna Eletronica Java 
Este projeto simula uma urna eletrônica simplificada, com leitura de votos através do console.
Ele permite registrar votos, calcular resultados, identificar o vencedor (ou empates), e exibir 
estatísticas da eleição.

## Aplicações 
- Candidatos pré-Configurados com números e nomes;
- Entrada de dados de 10 votos que deverá ser informado pelo console;
- Validação de votos válidos, mensagem de erro caso entrada de dados incorreta e votos nulo;
- Apuração dos resultados e exibição clara de todos dados da votação.

## Quesitos 

### Arquivo Candidatos.java

#### Classe
- `Candidato`: Reproduz um candidato com nome e número de voto.

#### Atributos
- `_nome`: Nome do candidato - privado;
- `_numero`: Número de voto do candidato - privado;
- `_voto` : Numero de votos que um determinado candidado recebeu - privado.

#### Métodos/Funções
- `Candidato(String nome, int numero)`: Construtor para criar um candidato;
- `String getNome()`: Retorna o nome do candidato;
- `int getNumero()`: Retorna o número do candidato;
- `int getVoto()`: Retorna o número de votos que um determinado candidato recebeu;
- `void incrementarVotos()`: Aumenta em 1 o número de votos recebidos por um candidato específico no código.


### Arquivo UrnaEletronicaJava.java

#### Classe
- `UrnaEletronicaJava`: Reproduz uma Urna Eletronica que irá receber os votos.

#### Atributos
- `_candidatos`: Vetor de candidatos - privado;
- `_votosNulos`: votos nulos - privado;
- `_votosValidos`: votos validos - privado.

#### Métodos/Funções
- `UrnaEletronicaJava()`: Construtor para criar uma Urna Eletronica;
- `void inicializarCandidato()`: Adiciona os candidatos à lista de candidatos na urna;
- `void exibirCandidatos()`: Exibe a lista de candidatos e as regras de votação no console;
- `int receberVoto(String numero)`: Registra o voto de um eleitor;
- `void exibirResultados()`: Calcula e exibe os resultados da eleição;
- `Main`: Método que irá Exercutar o Programa.

## Pré-requisitos

Antes de executar o projeto, certifique-se de ter:

1. **Java Development Kit (JDK)** instalado.
   - Recomendado: JDK 17 ou superior.
   
2. **Apache Maven** versão 3.9.9 instalado.
   - Você pode baixar o Apache Maven [aqui](https://maven.apache.org/download.cgi).
   - Siga as instruções de instalação na documentação oficial.

3. **Visual Studio Code (VS Code)** instalado.

4. **Extensão Java para VS Code**:
   - Abra o VS Code.
   - Navegue até a aba **Extensões** (Ctrl+Shift+X).
   - Pesquise por "Extension Pack for Java" e instale.

## Dependências

Na sua máquina, adicione os arquivos binários do JDK e do Maven nas variáveis de ambiente do PATH.

Em seguida, abra o Visual Studio Code (VS Code) e baixe as seguintes extensões:

- **Language Support for Java(TM) by Red Hat**
- **Gradle for Java**
- **Debugger for Java**
- **Java Extension Pack**
- **Java Test Runner**
- **Maven for Java**
  
## Visualização do projeto 
Para Visualização do Projeto, primeiro clone ele em seu ambiente de desenvolvimento local.

```bash 
git clone https://github.com/milenemachado/UrnaEletronicaJava.git 
```
## Execução

No VS Code, dentro da pasta do repositório, execute os seguintes comandos no terminal:

```bash
javac UrnaEletronicaJava.java 
```
E

```bash
java UrnaEletronicaJava
```
OU

```bash
javac UrnaEletronicaJava.java  &&  java UrnaEletronicaJava
```
Alternativamente, navegue para dentro da pasta onde estão os seguintes arquivos:

-`Candidato.java`;

-`UrnaEletronicaJava.java`;


## Autor(a):

- **Milene Machado** - https://github.com/milenemachado

## LICENSE

Creative Commons Zero v1.0 Universal
- Creative Commons Legal Code [aqui](https://github.com/milenemachado/UrnaEletronicaJava/blob/main/LICENSE).

