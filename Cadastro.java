//Bibliotecas
import javax.swing.*;
import java.awt.*;

//Declaração dos componentes/elementos da tela
public class Cadastro {
    private JPanel panel;
    private JTextField[] campoTexto = new JTextField[13];  
    private JPasswordField[] campoSenha = new JPasswordField[2]; 
    private JRadioButton rbAtivo, rbInativo;
    private JComboBox<String> tipoCombo;
    private JButton confirmarBtn, excluirBtn, limparBtn;

    private JRadioButton fornecedor;

    public Cadastro() {//Construtor
        panel = new JPanel();//Criação de objeto
        panel.setLayout(null);//Ajuste de layout manual
        panel.setPreferredSize(new Dimension(600, 500));//encarrega-se do tamanho do paiunel
        Font fonteLabel = new Font("Arial", Font.PLAIN, 12);//escolha da fonte utilizada

        JLabel titulo = new JLabel("Cadastro");// Objeto cadastro
        titulo.setFont(new Font("Arial", Font.BOLD, 30));//Fonte
        titulo.setForeground(new Color(246, 120, 40));
        titulo.setBounds(180, 10, 500, 30);//posicionamento
        panel.add(titulo);// Adiciona ao painel/tela que será exibida

        int y = 50;// variável usada para indicar a posição y dos itens na tela

        
        adicionarLabel("Tipo:", 30, y, panel, fonteLabel);// metodo que chama a label tipo
        tipoCombo = new JComboBox<>(new String[]{"Física", "Jurídica"});// opção de escolha 
        tipoCombo.setBounds(100, y, 150, 25);//posicionamento
        panel.add(tipoCombo);//adiciona a tela

        adicionarLabel("CPF/CNPJ:", 310, y, panel, fonteLabel);//metodo que chama a label cpf/cnpj
        campoSenha[0] = new JPasswordField();// Objeto passwordfield
        campoSenha[0].setBounds(400, y, 150, 25);// posicionamento do campo de senha
        panel.add(campoSenha[0]);// adicionando ao painel

        
        y += 35;//atualização no valor de y
        adicionarLabel("RG/Inscrição:", 30, y, panel, fonteLabel);//metodo que chama a leabel
        campoSenha[1] = new JPasswordField();//mais um campo de senha
        campoSenha[1].setBounds(130, y, 120, 25);// posicionamento
        panel.add(campoSenha[1]);// acrescenta a tela

        adicionarLabel("Fornecedor:", 310, y, panel, fonteLabel);// metodo que chama a label
        fornecedor = new JRadioButton();// botao radio sem texto
        fornecedor.setBounds(400, y, 20, 25);// posicionamento
        panel.add(fornecedor);
        
        y += 35;
        adicionarLabel("Email:", 30, y, panel, fonteLabel);
        campoTexto[0] = new JTextField();
        campoTexto[0].setBounds(100, y, 150, 25);
        panel.add(campoTexto[0]);

        adicionarLabel("Órgão Expedidor:", 310, y, panel, fonteLabel);
        campoTexto[1] = new JTextField();
        campoTexto[1].setBounds(430, y, 120, 25);
        panel.add(campoTexto[1]);

        
        y += 35;
        adicionarLabel("País:", 30, y, panel, fonteLabel);
        campoTexto[2] = new JTextField();
        campoTexto[2].setBounds(100, y, 150, 25);
        panel.add(campoTexto[2]);

        adicionarLabel("CEP:", 310, y, panel, fonteLabel);
        campoTexto[3] = new JTextField();
        campoTexto[3].setBounds(400, y, 150, 25);
        panel.add(campoTexto[3]);

        
        y += 35;
        adicionarLabel("Município:", 30, y, panel, fonteLabel);
        campoTexto[4] = new JTextField();
        campoTexto[4].setBounds(100, y, 150, 25);
        panel.add(campoTexto[4]);

        adicionarLabel("UF:", 310, y, panel, fonteLabel);
        campoTexto[5] = new JTextField();
        campoTexto[5].setBounds(400, y, 50, 25);
        panel.add(campoTexto[5]);

        
        y += 35;
        adicionarLabel("Logradouro:", 30, y, panel, fonteLabel);
        campoTexto[6] = new JTextField();
        campoTexto[6].setBounds(120, y, 200, 25);
        panel.add(campoTexto[6]);

        adicionarLabel("Número:", 350, y, panel, fonteLabel);
        campoTexto[7] = new JTextField();
        campoTexto[7].setBounds(420, y, 60, 25);
        panel.add(campoTexto[7]);

        
        y += 35;
        adicionarLabel("Bairro:", 30, y, panel, fonteLabel);
        campoTexto[8] = new JTextField();
        campoTexto[8].setBounds(100, y, 150, 25);
        panel.add(campoTexto[8]);

        adicionarLabel("Complemento:", 310, y, panel, fonteLabel);
        campoTexto[9] = new JTextField();
        campoTexto[9].setBounds(420, y, 130, 25);
        panel.add(campoTexto[9]);

        
        y += 35;
        adicionarLabel("Telefone:", 30, y, panel, fonteLabel);
        campoTexto[10] = new JTextField();
        campoTexto[10].setBounds(100, y, 150, 25);
        panel.add(campoTexto[10]);

        
        y += 35;
        adicionarLabel("Situação:", 30, y, panel, fonteLabel);
        rbAtivo = new JRadioButton("Ativo");
        rbInativo = new JRadioButton("Inativo");
        rbAtivo.setBounds(100, y, 80, 25);
        rbInativo.setBounds(180, y, 80, 25);
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rbAtivo);
        grupo.add(rbInativo);
        panel.add(rbAtivo);
        panel.add(rbInativo);

       
        confirmarBtn = new JButton("Confirmar");
        excluirBtn = new JButton("Excluir");
        limparBtn = new JButton("Limpar");

        //Estilização dos botoes e dos textos contidos neles
        Color laranja = new Color(255, 102, 0);
        confirmarBtn.setBackground(laranja);
        excluirBtn.setBackground(laranja);
        limparBtn.setBackground(laranja);

        confirmarBtn.setForeground(Color.WHITE);
        excluirBtn.setForeground(Color.WHITE);
        limparBtn.setForeground(Color.WHITE);

        confirmarBtn.setBounds(130, y + 40, 100, 30);
        excluirBtn.setBounds(240, y + 40, 100, 30);
        limparBtn.setBounds(350, y + 40, 100, 30);

        //Adição deles ao painel
        panel.add(confirmarBtn);
        panel.add(excluirBtn);
        panel.add(limparBtn);

        //Eventos
        confirmarBtn.addActionListener(e -> confirmar());
        excluirBtn.addActionListener(e -> excluir());
        limparBtn.addActionListener(e -> limpar());
    }

    private void adicionarLabel(String texto, int x, int y, JPanel p, Font fonte) {// cuida da aparencia das labels
        JLabel label = new JLabel(texto);
        label.setFont(fonte);
        label.setBounds(x, y, 100, 25);
        p.add(label);
    }

    private void confirmar() {
        String cpfCnpj = new String(campoSenha[0].getPassword());
        String rg = new String(campoSenha[1].getPassword());

        if (cpfCnpj.isEmpty() || campoTexto[0].getText().isEmpty()) {//validaçaõ de campos
            JOptionPane.showMessageDialog(panel, "Preencha os campos obrigatórios.");//Mensagem de campos obrigatórios caso não estejam preenchidos
        } else {
            JOptionPane.showMessageDialog(panel, "Cadastro confirmado.");// mensagem de sucesso se o cadastro for realizado
        }
    }

    private void excluir() {
        limpar();// limpa os elementos da tela
        JOptionPane.showMessageDialog(panel, "Dados excluídos.");// exibe mensagem que os dados foram excluidos
    }

    private void limpar() {// Limpa todos os campos
        for (JTextField campo : campoTexto) {// percorre todos os campos de texto
            if (campo != null) campo.setText("");// verificação de preenchimento ou não, e apaga eles
        }
        for (JPasswordField campoSenha : campoSenha) {// percorre os campos colocados como senha
            if (campoSenha != null) campoSenha.setText("");// verificação de preenchimento ou não, e apaga eles
        }
        tipoCombo.setSelectedIndex(0);
        rbAtivo.setSelected(false);// desmarca o botão de opção ativo
        rbInativo.setSelected(false);// desmarca o botao de opção inativo
        fornecedor.setSelected(false);//limpa a escolha em fornecedor
    }

    public JPanel getPanel() {
        return panel;
    }
}
