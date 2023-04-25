# Atividades testes unitarios

Este repositório contém um projeto com 4 atividades distintas, cada uma com seus próprios testes unitários.

Atividade 1: O objetivo desta atividade é criar um programa que colete informações do usuário (nome, CPF e idade), verifique se as informações são válidas e, em seguida, imprima esses dados na tela. Além disso, deve ser criado testes unitários para garantir que o programa está funcionando corretamente.

Atividade 2: O objetivo desta atividade é criar um algoritmo que calcule a média aritmética de dois números informados pelo usuário e, em seguida, apresente o resultado na tela. Além disso, deve ser criado testes unitários para garantir que o programa está funcionando corretamente.

Atividade 3: O objetivo desta atividade é criar um programa que leia o preço de um produto informado pelo usuário, acrescente 10% ao valor original e, em seguida, imprima o novo valor na tela. O programa deve verificar se o número informado pelo usuário é válido e, se não for, imprimir uma mensagem de erro. Além disso, deve ser criado testes unitários para garantir que o programa está funcionando corretamente.

Atividade 4: O objetivo desta atividade é criar um programa que leia uma temperatura em graus Fahrenheit fornecida pelo usuário e a converta para graus Celsius usando a fórmula °C = (°F − 32) / 1,8. O programa deve garantir que o número informado pelo usuário é válido e, se não for, imprimir uma mensagem de erro. Além disso, deve ser criado testes unitários para garantir que o programa está funcionando corretamente.

Para acessar as atividades [clique aqui](https://github.com/MarcoAntonioMj/atividades-testes-unitarios/blob/main/1_5062547508790559469.pdf)
 
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
4. Defina uma variável expectedMedia com o valor esperado da média dos números passados como parâmetros.
5. Chame o método media na instância de "Calculo" criada no passo 4 e armazene o resultado em uma variável actualMedia.
6. Use o método assertEquals de Assertions para verificar se actualMedia é igual a expectedMedia.

Faria os seguintes teste nesse codigo.
- Números inteiros positivos que ja foi feito
- Números inteiros negativos
- Números decimais
- Números iguais
- Números muito grandes
- Números muito pequenos
Os proximo teste desse exercicio ficara dentro de um outro readme juntamente a pasta com oscodigo.

