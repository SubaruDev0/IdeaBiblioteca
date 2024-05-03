import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    public List<Libro> libros;

       Biblioteca() {
        libros = new ArrayList<>();
    }

     void añadirLibro(Libro libro) {
        libros.add(libro);
    }
          void prestarLibro(Libro libro) {
        libros.remove(libro);
    }

public int buscarLibroPorAutor(Autor autor) { // recibe un parámetro de tipo Autor llamado autor y devuelve un valor de tipo int.
    int contador = 0;
    for (Libro libro : libros) { //for each  (tipo elemento : colección) sirve para recorrer toda la lista
        List<Autor> autores = libro.autores; // se obtiene la lista de autores del libro actual y se asigna a la variable autores.
        for (Autor a : autores) {
            if (a.nombre.equals(autor.nombre) && a.apellido.equals(autor.apellido)) { //se compara el nombre y apellido del autor actual  con el nombre y apellido del autor buscado, si ambos son iguales, suma 1 al cont.
                contador++;
            }
        }
    }
    return contador;
} 

        int buscarLibroPorTitulo(String titulo) { // recibe un parámetro de tipo String llamado titulo y devuelve un valor de tipo int.
        for (int i = 0; i < libros.size(); i++) { //no uso each por que necesito los indices
            Libro libro = libros.get(i); // Se obtiene el libro en la posición i de la lista y se asigna a la variable libro.

            if (libro.titulo.equals(titulo)) { //Si se encuentra un libro con el título buscado, se devuelve el índice de ese libro en la lista.
                return i; 
            }
        }

        return -1; // Si el bucle termina sin encontrar el libro buscado, se devuelve -1 para indicar que no se encontró. Nota: CREAR MEJOR CASO PARA CUANDO NO SE ENCUENTRE
    }

        int cantidadDeLibros() {
            return libros.size();
    }

 }
