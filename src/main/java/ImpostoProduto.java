public class ImpostoProduto implements VisitanteProduto {
    private double totalImposto;

    @Override
    public void visitarLivro(Livro livro) {
        double imposto = livro.getPreco() * 0.10;
        totalImposto += imposto;
        System.out.println("Imposto para o livro \"" + livro.getTitulo() + "\": R$ " + imposto);
    }

    @Override
    public void visitarEletronico(Eletronico eletronico) {
        double imposto = eletronico.getPreco() * 0.20;
        totalImposto += imposto;
        System.out.println("Imposto para o eletrônico de marca \"" + eletronico.getMarca() + "\": R$ " + imposto);
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
