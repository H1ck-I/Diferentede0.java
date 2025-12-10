📘 Programa de Verificação de Resto da Divisão (Java)

Este repositório contém um programa simples em Java que realiza operações de módulo (%), permitindo ao usuário testar múltiplas divisões até que o resultado seja diferente de zero.

O código demonstra o uso de:

Entrada de dados com Scanner;

Laço while;

Uso dos comandos continue e break;

Operador de módulo %.

🚀 Funcionalidade

O programa funciona da seguinte forma:

O usuário informa um número inicial.

Em um loop contínuo, o usuário fornece números para realizar a operação:

divisao % numeroInicial


O programa só aceita números maiores ou iguais ao número inicial.

O resultado da operação é exibido.

Se o resto da divisão for diferente de zero, o programa informa e encerra.

📝 Exemplo de Execução
Informe um número inicial: 5

Informe um número para divisão: 10
10 % 5 = 0

Informe um número para divisão: 17
17 % 5 = 2 resultado diferente de zero.

🧠 Lógica do Código

Validação: impede que o usuário informe números menores que o inicial.

Operador %: calcula o resto da divisão.

continue: força o usuário a repetir a entrada caso o número seja inválido.

break: encerra o loop quando o resto não é zero.

🛠️ Tecnologias Utilizadas

Java 17+

Classe Scanner

Estruturas de controle (while, if, continue, break)
