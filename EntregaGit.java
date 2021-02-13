import javax.swing.JOptionPane;
public class EntregaGit{
  public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog("Qual o seu nome?");
    JOptionPane.showMessageDialog(null, String.format("Bem vindo, %s", nome));
  }
}