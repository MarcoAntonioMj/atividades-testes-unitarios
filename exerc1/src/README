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
5. Chame o método media() compare o resultado com expectedMedia usando o método assertEquals() de Assertions..

### Segundo teste 
Na segunda função de teste, que chamamos de testMediaInteirosNegativo(), eu quis verificar se a classe Calculo consegue lidar corretamente com números negativos. Para isso, eu criei um objeto da classe Calculo passando como argumentos dois números negativos (-5 e -5), que devem resultar em uma média negativa.

Em seguida, eu defini o resultado esperado como -5.0 e usei o método Assertions.assertEquals() para comparar esse resultado com o resultado real da chamada do método media() da classe Calculo.

Com isso, eu consegui testar se a classe Calculo está funcionando corretamente em um cenário específico de números negativos, e assim garantir que o código esteja mais robusto.

### Terceiro teste 
O meu terceiro teste foi o primeiro a da erro se tratava de um teste de numeros longos :
```
 @Test
    void testMediaNumeroLongos() {
         double numero1 = Double.MAX_VALUE -1;
         double numero2 = Double.MAX_VALUE ;
        Calculo calculo = new Calculo(numero1 , numero2);
        double expectedMedia = Double.MAX_VALUE   ;
        Assertions.assertEquals(expectedMedia, calculo.media());
    }
```
Tiver que alterar o meu metodo : 
```
 public double media() {
        double soma = numero1 + numero2;
        if (soma >= Double.MAX_VALUE) {
            return Double.MAX_VALUE;
        } else {
            return soma / 2;
        }
    
    }
```
Método media() verifica se a soma dos valores ultrapassa o limite de Double.MAX_VALUE antes de calcular a média aritmética. Se a soma ultrapassar o limite, o método retorna Double.MAX_VALUE. Caso contrário, ele calcula a média aritmética normalmente. Com essa verificação, é possível evitar o overflow e retornar um resultado mais preciso para a média aritmética desses dois valores.
## Quarto teste
O quarto teste também deu erro, já que o valor mínimo foi ultrapassado. Tive que usar Double.NaN e Double.isInfinite() que aprendi graças ao erro no teste unitário. Corrigi o método media() para lidar com esses casos.
```
    public double media() {
        double soma = numero1 + numero2;
        if (Double.isInfinite(soma)) {
            // Soma ultrapassou o limite máximo, retorna o valor máximo possível
            System.out.println("O resultado da soma ultrapassou o limite máximo. Retornando o valor máximo possível.");
            return Double.MAX_VALUE;
        } else if (Double.isNaN(soma)) {
            // Soma é NaN, provavelmente devido a um valor NaN de entrada, retorna NaN
            return Double.NaN;
        } else if (soma == 0.0) {
            // Ambos os números são iguais a zero, retorna zero
            return 0.0;
        } else {
            return soma / 2.0;
        }
    }
```
## Quinto teste

Teste de cálculo de média com números decimais iguais, esperando que o resultado seja igual ao valor de entrada de 0.5 para ambos os números. .

## Sexto teste
Teste de cálculo de média com números decimais diferentes, esperando que o resultado seja igual ao valor de entrada da variavel expectedMedia .

## Setimo teste 
Teste de cálculo de média com números decimais diferentes negativos, esperando que o resultado seja igual ao valor de entrada da variavel expectedMedia .

## Oitavo teste 
Teste de cálculo de média com números inteiros Iguais , esperando que o resultado seja igual ao valor de entrada da variavel expectedMedia .

## Nono teste
Para o nono teste, tive que importar na classe CalculoTeste:

```
import java.util.InputMismatchException;
import java.util.Scanner;
```

Para melhorar o meu App.java, tive que aprender sobre o try-catch:


```
O try-catch é uma estrutura de controle utilizada na programação para tratar exceções (erros) que podem ocorrer durante a execução de um programa. O try-catch permite que o programa capture e trate as exceções de forma apropriada, sem interromper a execução do programa de forma abrupta.

O try é utilizado para envolver um bloco de código que pode gerar uma exceção. Caso uma exceção seja gerada dentro do bloco try, o programa desvia o controle para o bloco catch correspondente à exceção gerada.

O catch é o bloco de código que trata a exceção gerada pelo bloco try. Ele pode receber como parâmetro a exceção gerada e, a partir daí, tratar a exceção de acordo com a necessidade do programa.

```
Exception e é a declaração de uma variável do tipo Exception chamada "e". Ela é usada dentro do bloco catch para capturar e lidar com possíveis exceções que podem ser lançadas pelo bloco try. Quando uma exceção é lançada, o objeto Exception é criado e armazenado na variável "e", permitindo que o programador possa acessar informações sobre a exceção e tomar decisões com base nelas.

Estava tendo um problema com "return" que estava ficando amarelo na linha, tive que usar o "finally"
```
O bloco "finally" é opcional, mas quando utilizado, é executado sempre ao final do bloco "try-catch", independentemente se houve ou não uma exceção. Ele é geralmente utilizado para realizar tarefas que devem ser feitas, independentemente de ocorrer ou não uma exceção, como fechar conexões com bancos de dados, arquivos, sockets, entre outros.

```