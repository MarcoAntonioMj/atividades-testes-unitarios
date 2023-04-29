## Exercício de Juros sobre o produto :

- A classe Main é a classe principal do programa que contém o método main, que é o ponto de entrada do programa.

- Dentro do método main, é declarada uma variável valorP que será usada para armazenar o valor do produto.

- Em seguida, é declarada uma constante TAXA_DE_JUROS que representa a taxa de juros a ser aplicada ao valor do produto.

- É criado um objeto Scanner na classe Main que será usado para ler o valor do produto a partir da entrada padrão.

- A classe Juros representa a lógica de cálculo do valor do produto com juros.

- A classe Juros possui um construtor que recebe como parâmetro o valor do produto.

- A classe Juros possui um método valorAlterado que calcula o valor do produto com juros.

- O método valorAlterado da classe Juros utiliza a constante TAXA_DE_JUROS para calcular o valor do produto com juros e retorna o resultado.
# Farei os seguintes teste nesse codigo.
- Strings deve retorna erro .
- Valor inteiro positivo
- Valor inteiro negativos
- Valor com numeros decimais
- Valor menor que 0 ou igual 0

#### Usei o seguint para fazer os codigos de teste .
Para garantir que o programa funcione corretamente, foi implementado o uso de exceções.
- A exceção -IllegalArgumentException é lançada caso o valor do produto passado para o construtor da classe Juros seja negativo ou igual a zero. Isso é feito para garantir que o valor do produto seja válido antes de realizar qualquer cálculo. 
- A exceção InputMismatchException é capturada no bloco catch (Exception e) e indica que o usuário forneceu uma entrada inválida, que não pode ser convertida para um tipo de dado numérico válido. 
 
Essas exceções são importantes para identificar e corrigir erros de programação e erros de entrada de dados, tornando o programa mais robusto e fácil de manter
Ambas as exceções são usadas para indicar que algo deu errado durante a execução do programa e são geralmente usadas para ajudar a identificar e corrigir erros de programação ou erros de entrada de dados. É uma boa prática usar exceções para lidar com erros, pois isso pode ajudar a tornar o programa mais robusto e fácil de manter.