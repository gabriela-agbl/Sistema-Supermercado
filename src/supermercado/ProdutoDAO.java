package supermercado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO 
{
    private conectaDAO conexao = new conectaDAO();

    // Método para inserir um produto no banco
    public boolean inserirProduto(ProdutoEntity produto) 
    {
        String sql = "INSERT INTO produtos (nome, preco) VALUES (?, ?)";
        
        try (Connection conn = conexao.connectDB();
             PreparedStatement stmt = conn.prepareStatement(sql)) 
        {
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.executeUpdate();
            return true;

        } 
        catch (SQLException e) 
        {
            System.out.println("Erro ao inserir produto: " + e.getMessage());
            return false;
        }
    }
    
    //Método para atualizar um produto no banco
    public boolean atualizarProduto(ProdutoEntity produto)
    {
        String sql = "UPDATE produtos SET nome= ?, preco= ? WHERE id= ?";
        
        try(Connection conn = conexao.connectDB();
            PreparedStatement stmt = conn.prepareStatement(sql))    
        {
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getId());
            stmt.executeUpdate();
            return true;
        }
        
        catch(SQLException e)
        {
            System.out.println("Erro ao atualizar produto: " + e.getMessage());
            return false;
        }
    }
    
    //Método para excluir um produto no banco
    public boolean excluirProduto(int id)
    {
       String sql = "DELETE FROM produtos WHERE id= ?";
       
       try(Connection conn = conexao.connectDB();
           PreparedStatement stmt = conn.prepareStatement(sql))
       {
           stmt.setInt(1, id);
           stmt.executeUpdate();
           return true;
       }
       
       catch(SQLException e)
       {
          System.out.println("Erro ao excluir produto: " + e.getMessage());
          return false;
       }
    }
    
    //Método para buscar produtos no banco e listar
    public List<ProdutoEntity> buscarProdutos(String filtro)
    {
        String sql = "SELECT * FROM produtos WHERE nome LIKE ?";
        List<ProdutoEntity> produtos = new ArrayList<>();
        
        try(Connection conn = conexao.connectDB();
            PreparedStatement stmt = conn.prepareStatement(sql))
        {
            stmt.setString(1, "%" + filtro + "%");
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next())
        {
            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            double preco = rs.getDouble("preco");
            
            produtos.add(new ProdutoEntity(id, nome, preco));
        }
        }
       
        catch(SQLException e)
        {
            System.out.println("Erro ao buscar produtos: " + e.getMessage());
        }
        
        return produtos;
    }

    // Método para verificar se o produto já existe
    public boolean produtoExiste(String nome) 
    {
        String sql = "SELECT * FROM produtos WHERE nome = ?";
        
        try (Connection conn = conexao.connectDB();
             PreparedStatement stmt = conn.prepareStatement(sql)) 
        {
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            return rs.next(); // Se encontrar, retorna true

        } 
        catch (SQLException e) 
        {
            System.out.println("Erro ao verificar produto: " + e.getMessage());
            return false;
        }
    }
}
