# 🚀 ConvIQ - Inteligência Conversacional

Projeto desenvolvido para o Challenge FIAP × TOTVS 2026.

---

## 🧠 Sobre o projeto

O **ConvIQ** é um sistema que analisa transcrições de reuniões de vendas e extrai informações importantes automaticamente.

Ele identifica:

* ⚠️ Risco de churn (cliente pode cancelar)
* 💰 Oportunidades de venda (upsell)
* 🧾 Informações relevantes da conversa
* 😊 Sentimento do cliente

---

## 🛠️ Tecnologias utilizadas

* Java 17+
* Programação Orientada a Objetos (POO)
* Conceitos de Domain Driven Design (DDD)
* IntelliJ IDEA

---

## 📂 Estrutura do projeto

```
com.conviq
 ├── Main.java
 ├── Reuniao.java
 ├── Transcricao.java
 ├── Participante.java
 ├── ProdutoTotvs.java
 ├── Sinal.java
 ├── SinalChurn.java
 ├── SinalOportunidade.java
 └── AnalisadorTexto.java
```

---

## ▶️ Como executar

1. Abrir o projeto no IntelliJ
2. Rodar a classe `Main.java`
3. Digitar uma transcrição de reunião no terminal

### 💡 Exemplo de entrada:

```
O cliente demonstrou interesse em comprar outro produto, mas mencionou concorrente
```

### 📌 Saída esperada:

```
⚠️ Risco de churn detectado
💰 Oportunidade detectada
```

---

## ⚙️ Funcionalidades implementadas

* Leitura de entrada com Scanner
* Análise de texto baseada em palavras-chave
* Identificação de sinais de negócio
* Uso de herança e polimorfismo
* Estrutura orientada a objetos

---

## 🔄 Comandos Git

```
git add .
git commit -m "mensagem"
git push
```

---

## 📌 Status do projeto

🚧 Em desenvolvimento
(Próximos passos: melhoria da análise de texto e organização em DDD completo)

---

## 👨‍💻 Autor

José — Engenharia de Software
