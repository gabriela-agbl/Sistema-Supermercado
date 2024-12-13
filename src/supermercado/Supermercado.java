
package supermercado;


public class Supermercado {

    
    public static void main(String[] args) {
        
        
        ProdutoEntity produto = new ProdutoEntity(1, "Refrigerante", 10.90);
        
        ProdutoController cp = new ProdutoController();
        
        if (cp.salvarProduto(produto))
        {
            System.out.println("Produto salvo com sucesso: " + produto.getNome());
        } 
        
        else 
        {
            System.out.println("Erro ao salvar produto");
        }
        
    }


}
