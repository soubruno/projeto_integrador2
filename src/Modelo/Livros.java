package Modelo;

/**
 *  Dados de entrada com encapsulamento e acesso indireto aos valores desses dados com os métodos "get" e "set"
 *  em razão do uso de modificadores de acesso
 *  @author Victor Hugo
 */
public class Livros {
    
    private String Autor;
    private String Titulo;
    private String ISBN;
    private String Editora;   
    private String Volume;
    private String Quantidade;
    private String Status;

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        this.Autor = autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String isbn) {
        this.ISBN = isbn;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String editora) { 
        this.Editora = editora;
    }

    public String getVolume() {
        return Volume;
    }

    public void setVolume(String volume) {
        this.Volume = volume;
    }

    public String getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.Quantidade = quantidade;
    }
    
    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        this.Status = status;
    }
     
}
