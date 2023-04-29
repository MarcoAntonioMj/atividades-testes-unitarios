# Passo a Passo exer 4
1. Importe a classe Scanner.
2. Crie um objeto Scanner para obter entrada do usuário.
3. Exiba uma mensagem pedindo ao usuário para inserir o valor em Fahrenheit.
4. Leia o valor inserido pelo usuário usando o objeto Scanner.
5. Crie um objeto da classe Calculo passando o valor lido como argumento.
6. Chame o método celsius() do objeto Calculo para converter o valor em Fahrenheit em Celsius.
7. Use a função Math.round() para arredondar o valor em Celsius para o número inteiro mais próximo.
8. Exiba o valor em Celsius arredondado.
   
## Teste que foram feitos :
- test_Valor_Positivo: verifica se o valor 32°F é convertido corretamente para 0°C.
- test_Valor_Negativo: verifica se o valor -40°F é convertido corretamente para -40°C.
- test_Valor_Aleatorio: verifica se o valor 68°F é convertido corretamente para 20°C.
- test_Valor_Aredondado: verifica se o valor 20.5°F é convertido corretamente para -6°C.

### EXTRA Math.round
 Math.round() é utilizado para arredondar o resultado da conversão de temperatura de Fahrenheit para Celsius antes de exibi-lo na saída do programa. Isso é importante para evitar valores quebrados ou com muitas casas decimais, tornando a saída mais legível e fácil de entender.

 O Math.round() é um método da classe Math em Java que arredonda um valor decimal para o inteiro mais próximo. Ele funciona da seguinte maneira:

- Se o valor decimal for igual ou maior que x.5, o Math.round() arredonda para o próximo inteiro maior.

- Se o valor decimal for menor que x.5, o Math.round() arredonda para o inteiro anterior.

Por exemplo, se aplicarmos o método Math.round() ao valor 4.6, ele retornará 5, enquanto se aplicarmos ao valor 4.4, ele retornará 4.