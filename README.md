Plano de Teste - API Calculadora

Este documento descreve o plano de teste para a API Calculadora, abrangendo os testes unitários e de API.

Versão: 1.0

Última atualização: 04 de dezembro de 2023

Objetivo: Validar a funcionalidade da API Calculadora, garantindo que ela realiza as operações de soma, subtração, multiplicação e divisão corretamente.
Testes Unitários
Soma
Entrada	Saída esperada
2, 3	5
-5, 10	5
0, 0	0
-12, -4	-16
Subtração
Entrada	Saída esperada
5, 3	2
10, -2	12
0, 0	0
-8, 4	-12
Multiplicação
Entrada	Saída esperada
2, 3	6
5, 0	0
-2, -4	8
10, 10	100
Divisão
Entrada	Saída esperada
10, 2	5
12, 3	4
-9, -3	3
0, 10	0 (divisão por zero deve retornar uma exceção)
Testes de API
Soma
URL	Código de status	Corpo da resposta
http://localhost:8080/calculator/sum/2/3	200	5
http://localhost:8080/calculator/sum/-5/10	200	5
http://localhost:8080/calculator/sum/0/0	200	0
http://localhost:8080/calculator/sum/-12/-4	200	-16
Subtração
URL	Código de status	Corpo da resposta
http://localhost:8080/calculator/subtract/5/3	200	2
http://localhost:8080/calculator/subtract/10/-2	200	12
http://localhost:8080/calculator/subtract/0/0	200	0
http://localhost:8080/calculator/subtract/-8/4	200	-12
Multiplicação
URL	Código de status	Corpo da resposta
http://localhost:8080/calculator/multiply/2/3	200	6
http://localhost:8080/calculator/multiply/5/0	200	0
http://localhost:8080/calculator/multiply/-2/-4	200	8
http://localhost:8080/calculator/multiply/10/10	200	100
Divisão
URL	Código de status	Corpo da resposta
http://localhost:8080/calculator/divide/10/2	200	5
http://localhost:8080/calculator/divide/12/3	200	4
http://localhost:8080/calculator/divide/-9/-3	200	3
http://localhost:8080/calculator/divide/0/10	400	"Divisão por zero!"