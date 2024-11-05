public class Eletronico implements Produto {
    private String marca;
    private double preco;

    public Eletronico(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public void aceitar(VisitanteProduto visitante) {
        visitante.visitarEletronico(this);
    }
}
