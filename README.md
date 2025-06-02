<div align="center">
<h2>✨ Projeto Supermercado ✨</h2>

Bem-vindo ao repositório do projeto **Supermercado**! Este projeto é uma aplicação simples que simula o cadastro de produtos em um sistema utilizando Java. ☕
</div>

<div align="center">
<h2>⚖️ Funcionalidades</h2>
</div>

- 🖊️ Criar e gerenciar objetos de produtos com atributos como **id**, **nome** e **preço**.
- ✅ Validar produtos antes de salvá-los.
- 📊 Exibir mensagens de sucesso ou erro ao salvar os produtos.

<div align="center">
<h2>🔧 Estrutura do Projeto</h2>

O projeto está dividido nas seguintes classes:
</div>

1. **ProdutoEntity**
   - Representa o modelo de dados do produto.
   - Contém atributos: `id`, `nome`, e `preco`.
   - Métodos: `getId()`, `getNome()`, e `getPreco()`.

2. **ProdutoController**
   - Contém a lógica de validação e salvamento do produto.
   - Método principal: `salvarProduto()`.
  
3. **ProdutoDAO**
   - Responsável pela interação com o banco de dados.
   - Métodos: `produtoExiste()`, `inserirProduto()`, e uma rápida conexão com o banco de dados.
  
4. **ProdutoView**
   - Interface gráfica do sistema, construída com Swing.
   - Permite cadastrar produtos e exibe mensagens de sucesso ou erro.

5. **Supermercado**
   - Classe principal com o método `main()`.
   - Inicializa a interface gráfica

<div align="center">
<h2>📚 Como usar</h2>
</div>

1. Clone este repositório:
   ```bash
   git clone https://github.com/Agbl09/Sistema-Supermercado.git
   ```
2. Configure o banco de dados MySQL:
   - Crie uma base de dados chamada `supermercado`.
   - Execute o script SQL para criar a tabela de produtos:
     ```sql
     CREATE TABLE produtos (
     id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
     nome VARCHAR(100) NOT NULL,
     preco DOUBLE NOT NULL
     );
     ```
3. Compile e execute o projeto em um ambiente Java:
   ```bash 
   javac -d . *.java
   java supermercado.Supermercado
   ```
4. Use a interface gráfica para cadastrar produtos
   
<div align="center">
<h2>🌐 Melhorias futuras</h2>
</div>

- 💳 Adicionar integração com banco de dados. ✅
- 🔍 Implementar mais validações, como verificar duplicidade de produtos. ✅
- 🛠️ Criar uma interface gráfica para facilitar o uso. ✅
- 🔄 Implementar funcionalidades de atualização e exclusão de produtos. ✅
- 🔍 Adicionar filtros para pesquisa de produtos. ✅
- 🛠️ Melhorar a interface gráfica para torná-la mais amigável. ✅

<div align="center">
<h2>🚀 Tecnologias usadas</h2>
</div>

- Java: Linguagem principal do projeto.
- Git: Controle de versão.
- MySQL: Banco de dados utilizado.
- Swing: Biblioteca gráfica para a interface de usuário.

<div align="center">
<h2>📢 Contribuições</h2>

Contribuições são bem-vindas! Siga os passos:
</div>

1. Faça um fork do repositório.
2. Crie uma branch para sua funcionalidade: `git checkout -b minha-feature`.
3. Submeta um pull request explicando suas alterações. 📝

<div align="center">
<h2>📊 Status do projeto</h2>

Atualmente em desenvolvimento 🟡.<br> 
Mais recursos serão adicionados em breve!
</div>

<div align="center">
<h2>📝 Licença</h2>
   Este projeto foi desenvolvido para fins educacionais e está disponível para uso e modificação conforme necessário.<br>

   Feito por [Gabriela Rodrigues](https://github.com/Agbl09)

</div>
