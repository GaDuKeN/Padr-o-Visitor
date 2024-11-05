import java.util.ArrayList;
import java.util.List;

public class AplicacaoVisitor {
    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Livro("Design Patterns", 59.90));
        produtos.add(new Eletronico("Smartphone", 1200.00));


        ImpostoProduto impostoProduto = new ImpostoProduto();
        for (Produto produto : produtos) {
            produto.aceitar(impostoProduto);
        }
        System.out.println("Total de impostos: R$ " + impostoProduto.getTotalImposto());


        RelatorioProduto relatorioProduto = new RelatorioProduto();
        for (Produto produto : produtos) {
            produto.aceitar(relatorioProduto);
        }
    }
}
