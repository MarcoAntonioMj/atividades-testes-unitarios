# Atividades testes unitarios

Este repositório contém um projeto com 4 atividades distintas, cada uma com seus próprios testes unitários.

Atividade 1: O objetivo desta atividade é criar um algoritmo que calcule a média aritmética de dois números informados pelo usuário e, em seguida, apresente o resultado na tela. Além disso, deve ser criado testes unitários para garantir que o programa está funcionando corretamente.

Atividade 2: O objetivo desta atividade é criar um programa que colete informações do usuário (nome, CPF e idade), verifique se as informações são válidas e, em seguida, imprima esses dados na tela. Além disso, deve ser criado testes unitários para garantir que o programa está funcionando corretamente.

Atividade 3: O objetivo desta atividade é criar um programa que leia o preço de um produto informado pelo usuário, acrescente 10% ao valor original e, em seguida, imprima o novo valor na tela. O programa deve verificar se o número informado pelo usuário é válido e, se não for, imprimir uma mensagem de erro. Além disso, deve ser criado testes unitários para garantir que o programa está funcionando corretamente.

Atividade 4: O objetivo desta atividade é criar um programa que leia uma temperatura em graus Fahrenheit fornecida pelo usuário e a converta para graus Celsius usando a fórmula °C = (°F − 32) / 1,8. O programa deve garantir que o número informado pelo usuário é válido e, se não for, imprimir uma mensagem de erro. Além disso, deve ser criado testes unitários para garantir que o programa está funcionando corretamente.

Para acessar as atividades [clique aqui](https://github.com/MarcoAntonioMj/atividades-testes-unitarios/blob/main/1_5062547508790559469.pdf)
## throws IllegalArgumentException e método matches()

[Clique aqui para saber mais sobre cláusula  e sobre o método](https://github.com/MarcoAntonioMj/atividades-testes-unitarios/blob/main/metodos.pdf)

Os testes unitários foram implementados utilizando Junit. Para executar os testes, é necessário ter requisitos de ambiente configurados.

# Requisitos de ambiente
Para executar os testes unitários neste projeto, é necessário ter o seguinte software instalado em sua máquina:

[Java SE Development Kit (JDK) versão 8 ou superio](https://www.oracle.com/java/technologies/downloads/)

[Apache Maven versão 3.6 ou superior](https://maven.apache.org/download.cgi)

A IDE ultizada foi o [Visual Studio Code](https://code.visualstudio.com)

## Exercício de Cálculo de Média
#### Passo a Passo
- Crie um novo projeto Java em seu ambiente de desenvolvimento integrado (IDE) de sua escolha.
- Crie uma classe principal chamada "App".
- Crie uma classe "Calculo" para encapsular o cálculo de média.
- Defina as variáveis numero1 e numero2 como private na classe "Calculo".
- Crie métodos getter e setter para as variáveis numero1 e numero2.
- Crie um construtor na classe "Calculo" que receba dois parâmetros: numero1 e numero2.
- Implemente o método media na classe "Calculo" que calcula a média entre numero1 e numero2.
- Na classe "App", instancie um objeto da classe "Calculo", passando os dois números inseridos pelo usuário como parâmetros.
- Chame o método media na instância de "Calculo" criada e imprima o resultado na tela.
### Primeito teste 
1. Crie uma classe de teste Java 
2. Importe as classes "Calculo", "Test" e "Assertions" usando a seguinte sintaxe:
```
package com.marco.myproject;
import com.marco.myproject.Calculo.Calculo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

```
3. Instancie um objeto da classe "Calculo", passando dois números inteiros positivos como parâmetros.
4. Defina uma variável expectedMedia com o valor esperado da média dos dois números passados
5. Chame o método media() compare o resultado com expectedMedia usando o método assertEquals() de Assertions.

Farei os seguintes teste nesse codigo.
- Números inteiros positivos que ja foi feito
- Números inteiros negativos
- Números decimais
- Números iguais
- Números muito grandes
- Números muito pequenos

Os próximos testes deste exercício ficarão dentro de um outro  [readme](https://github.com/MarcoAntonioMj/atividades-testes-unitarios/tree/main/exerc1) Juntamente com a pasta com os códigos.

## Alguns aprendizados ao fazer o Exercício de Cálculo de Média
1. Importância da entrada de dados: o exercício mostrou a importância de se ter uma entrada de dados confiável e tratada, já que uma entrada inválida pode levar a erros na execução do programa.

2. Uso de exceções: o uso de exceções (como a InputMismatchException) pode ser útil para tratar situações inesperadas e prevenir que o programa pare de funcionar.

3. Encapsulamento: a utilização do encapsulamento (com getters e setters) pode ajudar a proteger os dados da classe e facilitar a manutenção do código.

4. Tratamento de valores especiais: o exercício mostrou a importância de se tratar valores especiais, como o caso de soma que ultrapassa o limite máximo, NaN ou valores muito pequenos.

5. Boas práticas de programação: durante o exercício, foram utilizadas diversas boas práticas de programação, como a organização do código em pacotes, a utilização de métodos para realizar operações específicas, e a separação de responsabilidades entre diferentes classes.

## Exercício do Cpf
#### Passo a Passo
1. Comecei criando um arquivo chamado "Main.java", que contém o método "main" para executar o programa.

2. No "Main.java", criei um objeto Scanner para ler entradas do usuário e declarei três variáveis para armazenar as informações do usuário: "cpf", "nome" e "idade".

3. Em seguida, utilizei a classe "Validador.java" para validar o CPF, nome e idade inseridos pelo usuário, usando o try-catch para lidar com possíveis exceções.

4. Depois, instanciei um objeto "Validador" com as informações válidas do usuário.

5. Por fim, utilizei os métodos "get" para exibir as informações do usuário na tela.

6. Em seguida, criei o arquivo "Validador.java" para implementar a lógica de validação das informações do usuário.

7. Na classe "Validador.java", criei três métodos estáticos para validar o CPF, nome e idade do usuário, lançando uma exceção caso alguma das informações seja inválida.

8. Também criei os métodos "get" e "set" para as informações do usuário.

9. Voltei para o "Main.java" e utilizei os métodos "set" para armazenar as informações válidas do usuário no objeto "Validador".

10. Por fim, utilizei novamente os métodos "get" para exibir as informações do usuário na tela.

Um readme com os teste estara disponivel juntos com os arquivos 

