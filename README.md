# Exercícios de Lógica e Testes em Java

Este projeto consiste na implementação de três exercícios de lógica utilizando a linguagem Java, com gerenciamento de dependências via Maven e validação através de testes unitários com JUnit.

## Atividades

### 1. CalendarDay
Implementação da classe `CalendarDay` contendo o método `findDay`.
* **Descrição:** O método recebe três números inteiros (dia, mês e ano) e retorna uma String com o dia da semana correspondente.
* **Assinatura:** `String findDay(int day, int month, int year)`

### 2. CompareSubstrings
Implementação da classe `CompareSubstrings` contendo o método `getSmallestAndLargest`.
* **Descrição:** O método recebe uma String `s` e um inteiro `k`. Ele deve encontrar todas as substrings de tamanho `k`, identificando a menor e a maior em ordem lexicográfica.
* **Assinatura:** `String getSmallestAndLargest(String s, int k)`

### 3. ValidateIP
Implementação da classe `ValidateIP` contendo o método `validate`.
* **Descrição:** O método utiliza expressões regulares (Regex) para verificar se uma String representa um endereço IPv4 válido.
* **Assinatura:** `boolean validate(String ip)`

---

## Estrutura de Pastas

A organização do projeto segue o padrão Maven:

```
Projeto-Exemplo
├── pom.xml
└── src
    ├── main
    │   └── java
    │       ├── Calendario
    │       │   └── CalendarDay.java
    │       ├── ComparaSubstrings
    │       │   └── CompareSubstrings.java
    │       └── ValidaIP
    │           └── ValidateIP.java
    └── test
        └── java
            ├── Calendario
            │   └── CalendarDayTest.java
            ├── ComparaSubstrings
            │   └── CompareSubstringsTest.java
            └── ValidaIP
                └── ValidateIPTest.java
```

---

## Requisitos e Execução

* **Tecnologias:** Java JDK 11 ou superior, Maven e JUnit 5.
* **Compilação:** `mvn clean compile`
* **Execução de Testes:** `mvn test`
