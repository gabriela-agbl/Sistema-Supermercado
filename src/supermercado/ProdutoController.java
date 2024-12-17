package supermercado;


public class ProdutoController 
{

    private ProdutoDAO produtoDAO = new ProdutoDAO();

    public boolean salvarProduto(ProdutoEntity produto) 
    {
        if (produto.getNome() == null || produto.getNome().isEmpty()) 
        {
            System.out.println("O nome do produto não pode ser vazio.");
            return false;
        }

        if (produto.getPreco() <= 0) 
        {
            System.out.println("O preço deve ser maior que zero.");
            return false;
        }

        if (produtoDAO.produtoExiste(produto.getNome())) 
        {
            System.out.println("Produto já existe no banco de dados.");
            return false;
        }

        if (produtoDAO.inserirProduto(produto)) 
        {
            System.out.println("Produto salvo com sucesso!");
            return true;
        } 
        else 
        {
            System.out.println("Erro ao salvar o produto.");
            return false;
        }
    }
      
}
