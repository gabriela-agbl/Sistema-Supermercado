package supermercado;

import java.util.List;
import javax.swing.table.DefaultTableModel;


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
    
    public DefaultTableModel buscarProdutos(String filtro) 
    {
        ProdutoDAO dao = new ProdutoDAO(); // Chama o DAO
        List<ProdutoEntity> produtos = dao.buscarProdutos(filtro); // Busca produtos filtrados

        // Definir colunas da tabela
        String[] colunas = {"ID", "Nome", "Preço"};

        // Preencher dados da tabela
        Object[][] dados = new Object[produtos.size()][3];
        
        for (int i = 0; i < produtos.size(); i++) 
        {
            ProdutoEntity produto = produtos.get(i);
            dados[i][0] = produto.getId();
            dados[i][1] = produto.getNome();
            dados[i][2] = produto.getPreco();
        }

        return new DefaultTableModel(dados, colunas); // Retorna o modelo da tabela
    } 
}
