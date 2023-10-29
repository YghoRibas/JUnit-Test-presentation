import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerenciadorDeNotas {

    private List<Double> notas = new ArrayList<>();

    public static void main(String[] args) {

    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public List<Double> getNotas() {
        return notas;
    }

    public double calcularMedia() {
        if (notas.isEmpty()) {
            return 0;
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public double encontrarMaiorNota() {
        if (notas.isEmpty()) {
            throw new IllegalStateException("A lista de notas está vazia");
        }
        return Collections.max(notas);
    }

    public double encontrarMenorNota() {
        if (notas.isEmpty()) {
            throw new IllegalStateException("A lista de notas está vazia");
        }
        return Collections.min(notas);
    }
}
