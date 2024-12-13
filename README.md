# ✨ Projeto Supermercado ✨

Bem-vindo ao repositório do projeto **Supermercado**! Este projeto é uma aplicação simples que simula o cadastro de produtos em um sistema utilizando Java. ☕

## ⚖️ Funcionalidades

- 🖊️ Criar e gerenciar objetos de produtos com atributos como **id**, **nome** e **preço**.
- ✅ Validar produtos antes de salvá-los.
- 📊 Exibir mensagens de sucesso ou erro ao salvar os produtos.

## 🔧 Estrutura do Projeto

O projeto está dividido nas seguintes classes:

1. **ProdutoEntity**
   - Representa o modelo de dados do produto.
   - Contém atributos: `id`, `nome`, e `preco`.
   - Métodos: `getId()`, `getNome()`, e `getPreco()`.

2. **ProdutoController**
   - Contém a lógica de validação e salvamento do produto.
   - Método principal: `salvarProduto()`.

3. **Supermercado**
   - Classe principal com o método `main()`.
   - Cria produtos e utiliza o `ProdutoController` para gerenciá-los.

## 📚 Como usar

1. Clone este repositório:
   ```bash
   git clone https://github.com/Agbl09/Sistema-Supermercado.git
   ```
2. Compile e execute o projeto em um ambiente Java:
   ```bash 
   javac -d . *.java
   java supermercado.Supermercado
   ```
3. Observe a saída no console:
   - Caso o produto seja válido, você verá: `Produto salvo com sucesso: nome do produto`
   - Caso contrário: `Erro ao salvar produto`

## 🌐 Melhorias futuras

- 💳 Adicionar integração com banco de dados.
- 🔍 Implementar mais validações, como verificar duplicidade de produtos.
- 🛠️ Criar uma interface gráfica para facilitar o uso.

## 🚀 Tecnologias usadas

- Java: Linguagem principal do projeto.
- Git: Controle de versão.

## 📢 Contribuições

Contribuições são bem-vindas! Siga os passos:

1. Faça um fork do repositório.
2. Crie uma branch para sua funcionalidade: `git checkout -b minha-feature`.
3. Submeta um pull request explicando suas alterações. 📝

## 📊 Status do projeto

Atualmente em desenvolvimento 🟡. Mais recursos serão adicionados em breve!

## 📝 Licença
   Este projeto foi desenvolvido para fins educacionais e está disponível para uso e modificação conforme necessário.

   Feito por [Gabriela Rodrigues](https://github.com/Agbl09)