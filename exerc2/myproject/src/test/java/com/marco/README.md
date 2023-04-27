## Primeiros testes do método CPF
Para testar o método validaCPF da classe Validador, foram utilizados os seguintes testes:

- Teste para verificar se o CPF tem mais de 11 números.
- Teste para verificar se o CPF tem menos de 11 números.
- Teste para verificar se o CPF contém caracteres especiais.
- Teste para verificar se o CPF contém algum tipo de string.
- Foi utilizado o método Assertions.assertThrows em conjunto com IllegalArgumentException.class para verificar se o método validaCPF estava retornando a mensagem correta quando ocorriam erros.
## Segundo testes  método Nome
- Teste para verificar se o nome não contém nada.
- Teste para verificar se o nome contém algum tipo de Numero.
- Teste para verificar se o nome contém algum caracteresespeciais
Deu erro no nome_caracteresespeciais testnome_entradaComInt
Para resolver adicionei uma logica que tambem usei no valida cpf

```
 public static void validaNome(String nome) throws IllegalArgumentException {
        if (nome.isEmpty()|| !nome.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Nome inválido");
        }
    }
```
## Terceiro teste método idade
- Teste para verificar se a idade não contém numero maior que 120 ou menor que 0 .
- Teste para verificar se a idade contém algum tipo de String.
- Teste para verificar se A idade contém algum caracteresespeciais
para evitar o msm erro que deu no segundo teste mudei o metodo idade que tava assim :
```
public static void validaIdade(int idade) throws IllegalArgumentException {
        if (idade < 0 || idade > 120) {
            throw new IllegalArgumentException("Idade inválida");
        }
    }
```
Deixei assim :
```
 public static void validaIdade(int idade) throws IllegalArgumentException {
        if (idade < 0 || idade > 120 || !String.valueOf(idade).matches("\\d+")) {
            throw new IllegalArgumentException("Idade inválida");
        }
    }
```
O método matches só funciona em String, então tive que usar o !String.valueOf(idade) para converter para String. 
Tentei testar se o programa aceita Numeros fracionados e o teste resultou em erro novamente vou ter que alterar o metodo.
```
public static void validaIdade(double idade) throws IllegalArgumentException {
    int idadeInt = (int) Math.round(idade);
    if (idadeInt < 0 || idadeInt > 120 || idade != idadeInt) {
        throw new IllegalArgumentException("Idade inválida");
    }
}
```
Tive que pesquisar na internet para conseguir resolver esse problema .
Nesse código, a função Math.round(idade) arredonda o valor idade para o inteiro mais próximo, e o casting para int converte o valor arredondado em um número inteiro.
Texto que peguei na internet explicando :
A função Math.round() é uma função matemática que arredonda um valor para o inteiro mais próximo. Ela recebe um valor numérico como argumento e retorna um valor inteiro.

O arredondamento funciona da seguinte maneira:

Se a parte fracionária do valor for menor do que 0,5, o valor é arredondado para o inteiro mais próximo menor ou igual ao valor original.
Se a parte fracionária do valor for maior ou igual a 0,5, o valor é arredondado para o inteiro mais próximo maior ou igual ao valor original.
Por exemplo, se você chamar a função Math.round(3.4), ela vai retornar o valor 3, pois 3 é o inteiro mais próximo de 3.4. Da mesma forma, se você chamar a função Math.round(3.6), ela vai retornar o valor 4, pois 4 é o inteiro mais próximo de 3.6.

No caso da função validaIdade, a chamada Math.round(idade) é usada para arredondar o valor idade para o inteiro mais próximo. Em seguida, o casting para int é usado para converter o valor arredondado em um número inteiro.

Isso garante que a função validaIdade aceite valores fracionados e os arredonde corretamente para o inteiro mais próximo antes de fazer a validação de idade. Se o valor fracionado não pode ser arredondado para um inteiro válido (por exemplo, se for maior do que 120, ou se a parte fracionária for maior ou igual a 0,5 e o valor arredondado for menor do que 0), a função lança a exceção "Idade inválida".

Mesmo assim ainda tava dando erro quando eu insiria numeros fracionador retornava erro em ves de retorna a mensagem do IllegalArgumentException
Tive que alterar o arquivo app
```
System.out.print("Digite sua idade: ");
        String input = sc.next();
        double idadeDouble = Double.parseDouble(input);
        try {
            Validador.validaIdade(idadeDouble);
            idade = (int) idadeDouble;
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
            return;
        }
```
Nesse trecho de código, o programa solicita que o usuário digite sua idade, e armazena essa entrada como uma string na variável input. Em seguida, o programa tenta validar a idade chamando o método validaIdade() da classe Validador, passando a idade como um valor double. Se a idade for válida, o programa converte a idade para um valor inteiro (int) Caso contrário, ou seja, se a idade for inválida, o programa captura a exceção lançada pelo método validaIdade() e imprime a mensagem de erro correspondente no console, antes de encerrar o programa usando o comando return.