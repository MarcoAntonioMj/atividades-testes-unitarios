## Testes realizados na classe Validador
Foram realizados testes na classe Validador para validar a entrada de dados nos métodos validaNome, validaIdade e validaCPF. Seguem abaixo os testes realizados em cada um desses métodos:
Foi utilizado o método Assertions.assertThrows em conjunto com IllegalArgumentException.class para verificar se o método  estava retornando a mensagem correta quando ocorriam erros.
## Teste validaNome
- Teste para verificar se o nome está em branco.
- Teste para verificar se o nome contém caracteres especiais.
- Teste para verificar se o nome contém algum tipo de string.
## Teste validaIdade
- Teste para verificar se a idade é menor que zero.
- Teste para verificar se a idade é maior que 120.
- Teste para verificar se a idade contém caracteres especiais.
- Teste para verificar se a idade contém números fracionados.
- Teste para verificar se a idade contém algum tipo de string.
## Testes do método CPF
- Teste para verificar se o CPF tem mais de 11 números.
- Teste para verificar se o CPF tem menos de 11 números.
- Teste para verificar se o CPF contém caracteres especiais.
- Teste para verificar se o CPF contém algum tipo de string.
