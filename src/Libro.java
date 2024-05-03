import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Libro {
    public String titulo;
    public List<Autor> autores;

    public Libro(String titulo, Autor... autores) {
        this.titulo = titulo;
        this.autores = new ArrayList<>();
        for (Autor autor : autores) { // me sugiere cambiar a  this.autores.addAll(Arrays.asList(autores));
        this.autores.add(autor); 
}

    }
}
