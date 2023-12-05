# Plano de Teste - Calculadora

# Relatório de Análise Estática - PMD

A análise identificou violações relacionadas à documentação de classes e métodos no código.

## Exemplo de Violação.

   - **Método `sum` em CalculatorClient**
   - **Linha:** 15
   - **Regra Violada:** CommentRequired
   - **Descrição:** Comentários são obrigatórios para métodos públicos e construtores.

## Testes Unitários (CalculatorServiceTest)

### 1. Teste da Função de Soma (testSum)

- **Descrição:** Verificar se a função de soma da calculadora está calculando corretamente.
- **Entrada:** 2, 3
- **Saída Esperada:** 5

### 2. Teste da Função de Subtração (testSubtract)

- **Descrição:** Verificar se a função de subtração da calculadora está calculando corretamente.
- **Entrada:** 5, 3
- **Saída Esperada:** 2

### 3. Teste da Função de Multiplicação (testMultiply)

- **Descrição:** Verificar se a função de multiplicação da calculadora está calculando corretamente.
- **Entrada:** 2, 3
- **Saída Esperada:** 6

### 4. Teste da Função de Divisão (testDivide)

- **Descrição:** Verificar se a função de divisão da calculadora está calculando corretamente.
- **Entrada:** 10, 2
- **Saída Esperada:** "5" (como String, devido ao tipo de retorno)

## Testes de Integração (CalculatorApiTest)

### 1. Teste do Endpoint de Soma (testSumEndpoint)

- **Descrição:** Verificar se o endpoint de soma da API retorna o resultado esperado.
- **Chamada API:** GET /sum/2/3
- **Saída Esperada:** Corpo da resposta igual a "5" e código de status 200.

### 2. Teste do Endpoint de Subtração (testSubtractEndpoint)

- **Descrição:** Verificar se o endpoint de subtração da API retorna o resultado esperado.
- **Chamada API:** GET /subtract/5/2
- **Saída Esperada:** Corpo da resposta igual a "3" e código de status 200.

### 3. Teste do Endpoint de Multiplicação (testMultiplyEndpoint)

- **Descrição:** Verificar se o endpoint de multiplicação da API retorna o resultado esperado.
- **Chamada API:** GET /multiply/4/3
- **Saída Esperada:** Corpo da resposta igual a "12" e código de status 200.

### 4. Teste do Endpoint de Divisão (testDivideEndpoint)

- **Descrição:** Verificar se o endpoint de divisão da API retorna o resultado esperado.
- **Chamada API:** GET /divide/10/2
- **Saída Esperada:** Corpo da resposta igual a "5" e código de status 200.