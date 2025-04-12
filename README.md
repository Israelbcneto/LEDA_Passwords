# Projeto de Análise e Ordenação de Senhas - LEDA

## 📋 Sobre o Projeto
Este projeto foi desenvolvido como parte da disciplina de Laboratório de Estrutura de Dados (LEDA) e tem como objetivo principal a análise e ordenação de um conjunto de dados contendo informações sobre senhas. O sistema implementa diversos algoritmos de ordenação e realiza processamento de dados para classificação e formatação de senhas.

## 🎯 Objetivos
- Implementar e analisar diferentes algoritmos de ordenação
- Processar e classificar dados de senhas
- Formatar e padronizar informações de datas
- Realizar análise de desempenho dos algoritmos implementados

## 🛠️ Funcionalidades

### 1. Processamento de Dados
- **Classificação de Senhas** (`Password_Classificador.java`)
  - Classifica senhas com base em critérios específicos
  - Gera arquivo com senhas classificadas

- **Formatação de Datas** (`PasswordFormatador_Data.java`)
  - Padroniza o formato das datas
  - Converte para o formato dd/mm/aaaa

- **Filtragem de Senhas** (`PasswordFiltrar_Classificador.java`)
  - Filtra senhas de acordo com classificações definidas
  - Gera arquivos específicos para análise

### 2. Algoritmos de Ordenação
O projeto implementa os seguintes algoritmos de ordenação:
- Counting Sort
- Heap Sort
- Insertion Sort
- Merge Sort
- Quick Sort
- Quick Sort com Mediana de Três
- Selection Sort

### 3. Testes e Análise
- **Execução de Testes** (`ExecutandoTestes.java`)
  - Testes de desempenho para diferentes tamanhos de entrada
  - Análise por tamanho de senha
  - Análise por mês
  - Análise por data

## 📁 Estrutura do Projeto
```
.
├── src/
│   ├── Main.java                    # Ponto de entrada do programa
│   ├── Password_Classificador.java  # Classificação de senhas
│   ├── PasswordFormatador_Data.java # Formatação de datas
│   ├── PasswordFiltrar_Classificador.java # Filtragem de senhas
│   ├── ExecutandoTestes.java       # Execução de testes
│   ├── [Algoritmos de Ordenação]   # Implementações dos algoritmos
│   └── [Classes de Geração de Casos] # Geração de casos de teste
├── dataset/
│   ├── passwords.csv               # Dataset original
│   ├── passwords_formated_9k.csv   # Dataset reduzido para testes
│   └── [Arquivos processados]      # Arquivos gerados pelo sistema
└── Relatório LEDA.pdf              # Documentação completa
```

## 🚀 Como Executar

### Pré-requisitos
- Java 8 ou superior
- IDE de sua preferência (recomendado IntelliJ ou Eclipse)
- Suficiente memória RAM para processar grandes conjuntos de dados

### Execução
1. Clone o repositório:
   ```bash
   git clone https://github.com/Israelbcneto/LEDA_Passwords.git
   ```

2. Compile os arquivos Java:
   ```bash
   javac src/*.java
   ```

3. Execute o programa principal:
   ```bash
   java -cp src Main
   ```

### Opções de Execução
- Para usar o dataset completo:
  - Modifique o parâmetro em `GetInput.java` para "dataset/passwords_formated_data.csv"
- Para testes rápidos:
  - Use o arquivo reduzido "passwords_formated_9k.csv"

## 📊 Arquivos de Dados
- `passwords.csv`: Dataset original com todas as senhas
- `passwords_formated_9k.csv`: Dataset reduzido com 9.000 amostras para testes rápidos
- Arquivos gerados durante o processamento:
  - `password_classifier.csv`: Senhas classificadas
  - `passwords_formated_data.csv`: Senhas com datas formatadas
  - `passwords_classifier.csv`: Senhas filtradas

## 📝 Relatório
O arquivo `Relatório LEDA.pdf` contém:
- Análise teórica dos algoritmos implementados
- Resultados dos testes de desempenho
- Comparações entre os diferentes algoritmos
- Conclusões e observações sobre o projeto

## 🤝 Contribuições
Este projeto foi desenvolvido como parte de um trabalho acadêmico. Contribuições são bem-vindas, mas devem ser discutidas com os mantenedores do projeto.

## 📄 Licença
Este projeto é parte de um trabalho acadêmico e está sujeito às regras da instituição de ensino.

