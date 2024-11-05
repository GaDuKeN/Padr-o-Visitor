// ProdutoVisitorTest.java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProdutoVisitorTest {

    private Livro livro;
    private Eletronico eletronico;
    private ImpostoProduto impostoProduto;
    private RelatorioProduto relatorioProduto;

    @Before
    public void setup() {
        // Instância dos produtos
        livro = new Livro("Design Patterns", 59.90);
        eletronico = new Eletronico("Smartphone", 1200.00);

        // Instância dos visitantes
        impostoProduto = new ImpostoProduto();
        relatorioProduto = new RelatorioProduto();
    }

    @Test
    public void testImpostoParaLivro() {
        // Aplicar o visitante de imposto ao livro
        livro.aceitar(impostoProduto);

        // Imposto esperado: 10% de 59.90 = 5.99
        double impostoEsperado = 5.99;
        assertEquals(impostoEsperado, impostoProduto.getTotalImposto(), 0.01);
    }

    @Test
    public void testImpostoParaEletronico() {
        // Aplicar o visitante de imposto ao eletrônico
        eletronico.aceitar(impostoProduto);


        double impostoEsperado = 240.00;
        assertEquals(impostoEsperado, impostoProduto.getTotalImposto(), 0.01);
    }

    @Test
    public void testRelatorioParaLivro() {

        java.io.ByteArrayOutputStream saidaCapturada = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(saidaCapturada));


        livro.aceitar(relatorioProduto);


        String saidaEsperada = "Livro: Design Patterns - Preço: R$ 59.9\n";
        assertEquals(saidaEsperada, saidaCapturada.toString());
    }

    @Test
    public void testRelatorioParaEletronico() {

        java.io.ByteArrayOutputStream saidaCapturada = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(saidaCapturada));


        eletronico.aceitar(relatorioProduto);


        String saidaEsperada = "Eletrônico: Smartphone - Preço: R$ 1200.0\n";
        assertEquals(saidaEsperada, saidaCapturada.toString());
    }
}
