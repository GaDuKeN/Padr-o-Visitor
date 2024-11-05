public class RelatorioProduto implements VisitanteProduto {

    @Override
    public void visitarLivro(Livro livro) {
        System.out.println("Livro: " + livro.getTitulo() + " - Preço: R$ " + livro.getPreco());
    }

    @Override
    public void visitarEletronico(Eletronico eletronico) {
        System.out.println("Eletrônico: " + eletronico.getMarca() + " - Preço: R$ " + eletronico.getPreco());
    }
}
