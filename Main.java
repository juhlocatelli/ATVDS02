import javax.swing.*;//Biblioteca

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {//evita que a tela trave
            JFrame frame = new JFrame("Tela de Cadastro");//criando a janela
            Cadastro cadastro = new Cadastro();// criando um objeto Cadastro
            frame.setContentPane(cadastro.getPanel());// conteudo da janela sendo retornado pelo método get
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cuida da saída
            frame.pack();//cuida do ajuste para o tamanho da tela
            frame.setLocationRelativeTo(null);//responsável por centralizar no computador
            frame.setVisible(true);// torna visivel
        });
    }
}
