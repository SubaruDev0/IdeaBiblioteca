import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Libro {
    public String titulo;
    public List<Autor> autores;

    public Libro(String titulo, Autor... autores) {
        this.titulo = titulo;
        this.autores = new ArrayList<>();
        this.autores.addAll(Arrays.asList(autores));

    }
}