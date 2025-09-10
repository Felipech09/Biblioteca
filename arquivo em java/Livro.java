public class Livro {
  private String titulo;
  private String autor;
  private int ano;
  private boolean emprestado;
  
  public Livro(String titulo, String autor, int ano) {
    this.titulo = titulo;
    this.autor = autor;
    this.ano = ano;
    this.emprestado = false;
  }
  
  public boolean isEmprestado(){
    return emprestado;
  }
  
  public void emprestar(){
    this.emprestado = true;
  }
  
  public void devolver(){
    this.emprestado = false;
  }
  
  public String toString(){
    return titulo + " - " + autor + "(" + ano + ")";
  }
}
