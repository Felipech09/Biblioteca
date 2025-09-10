import java.util.ArrayList;

public class Biblioteca {
  private ArrayList<Livrio> livros = new ArrayList<>();
  private ArrayList<Usuario> usuarios = new ArrayList<>();
  
  
  public void cadastrarLivrio (Livrio livro) {
    livros.add(livro);
  }
  
  public void cadastrarUsuario(Usuario usuario) {
    usuarios.add(usuario);
  }
  
  public void emprestarLivro (String titulo, String matricula) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo) && !livro.isEmprestado()) {
                livro.emprestar();
                System.out.println("Livro emprestado para " + buscarUsuario(matricula));
                return;
            }
        }
        System.out.println("Livro não disponível ou não encontrado.");
    }
}
