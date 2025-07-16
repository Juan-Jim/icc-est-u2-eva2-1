package controller;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import models.Book;

public class LibroController {
    public Set<Book> procesarLibros(List<Book> libros) {
        Set<Book> conjuntoOrdenado = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                int cmpTitulo = b2.getTitulo().compareTo(b1.getTitulo()); 
                if (cmpTitulo != 0) return cmpTitulo;

                int cmpAnio = Integer.compare(b1.getAnio(), b2.getAnio()); 
                if (cmpAnio != 0) return cmpAnio;

                return 0; 
            }
        });
        conjuntoOrdenado.addAll(libros);
        return conjuntoOrdenado;
    }
}
