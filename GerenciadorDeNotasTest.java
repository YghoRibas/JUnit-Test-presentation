import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GerenciadorDeNotasTest {

    private GerenciadorDeNotas gerenciador;

    @BeforeEach
    public void setUp() {
        gerenciador = new GerenciadorDeNotas();
    }

    @Test
    public void testAdicionarNota() {
        gerenciador.adicionarNota(8.5);
        assertEquals(1, gerenciador.getNotas().size());
        assertEquals(8.5, gerenciador.getNotas().get(0));
    }

    @Test
    public void testCalcularMedia() {
        gerenciador.adicionarNota(8.5);
        gerenciador.adicionarNota(7.0);
        gerenciador.adicionarNota(9.2);
        gerenciador.adicionarNota(6.8);
        double media = gerenciador.calcularMedia();
        assertEquals(7.875, media, 0.001); //aqui o terceiro argumento é o delta, ou seja o quanto os valores podem diferir
    }

    @Test
    public void testCalcularMediaListaVazia() {
        double media = gerenciador.calcularMedia();
        assertEquals(0, media, 0.001);
    }

    @Test
    public void testEncontrarMaiorNota() {
        gerenciador.adicionarNota(8.5);
        gerenciador.adicionarNota(9.2);
        gerenciador.adicionarNota(7.0);
        double maiorNota = gerenciador.encontrarMaiorNota();
        assertEquals(9.2, maiorNota, 0.001);
    }

    @Test
    public void testEncontrarMenorNota() {
        gerenciador.adicionarNota(8.5);
        gerenciador.adicionarNota(9.2);
        gerenciador.adicionarNota(7.0);
        double menorNota = gerenciador.encontrarMenorNota();
        assertEquals(7.0, menorNota, 0.001);
    }

}
