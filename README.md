# Minha idade

Programa em Java que calcula a idade pelo ano de nascimento e classifica a pessoa: criança, adolescente ou adulto.

## Como funciona
- O programa pede o ano de nascimento pelo teclado.
- Calcula a idade com o ano atual: `ano atual - ano de nascimento`.
- Como só usa o ano, mostra a idade que a pessoa tem ou vai fazer no ano atual.
- Se a entrada não for um número, ou der uma idade fora de 0 a 130, mostra "Ano inválido".
- Depois compara a idade com as faixas:
  - até 11 anos: Criança
  - de 12 a 17 anos: Adolescente
  - 18 anos ou mais: Adulto

## Como rodar
1. Abra o projeto no IntelliJ IDEA.
2. Abra `src/Main.java`.
3. Clique no botão verde de executar.
4. Digite o ano em que você nasceu no console e aperte Enter.

Requer Java 25 ou mais recente.

## O que pratiquei
- Variáveis e tipos (`int`)
- Leitura do teclado com `Scanner`
- Data atual com `java.time.Year`
- Validação de entrada
- Estruturas condicionais `if`, `else if` e `else`

Exercício feito durante o bootcamp DIO + Santander.
