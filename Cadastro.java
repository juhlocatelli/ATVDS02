import javax.swing.*;
import java.awt.*;

public class Cadastro {
    private JPanel panel;
    private JTextField[] campoTexto = new JTextField[13];  
    private JPasswordField[] campoSenha = new JPasswordField[2]; 
    private JRadioButton rbAtivo, rbInativo;
    private JComboBox<String> tipoCombo;
    private JButton confirmarBtn, excluirBtn, limparBtn;

    private JRadioButton fornecedor;
    private ButtonGroup grupoFornecedor;

    public Cadastro() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(600, 500));
        Font fonteLabel = new Font("Arial", Font.PLAIN, 12);

        JLabel titulo = new JLabel("Cadastro");
        titulo.setFont(new Font("Arial", Font.BOLD, 30));
        titulo.setForeground(new Color(246, 120, 40));
        titulo.setBounds(180, 10, 500, 30);
        panel.add(titulo);

        int y = 50;

        
        adicionarLabel("Tipo:", 30, y, panel, fonteLabel);
        tipoCombo = new JComboBox<>(new String[]{"Física", "Jurídica"});
        tipoCombo.setBounds(100, y, 150, 25);
        panel.add(tipoCombo);

        adicionarLabel("CPF/CNPJ:", 310, y, panel, fonteLabel);
        campoSenha[0] = new JPasswordField();
        campoSenha[0].setBounds(400, y, 150, 25);
        panel.add(campoSenha[0]);

        
        y += 35;
        adicionarLabel("RG/Inscrição:", 30, y, panel, fonteLabel);
        campoSenha[1] = new JPasswordField();
        campoSenha[1].setBounds(130, y, 120, 25);
        panel.add(campoSenha[1]);

        adicionarLabel("Fornecedor:", 310, y, panel, fonteLabel);
        fornecedor = new JRadioButton();
        fornecedor.setBounds(400, y, 20, 25);
        

        grupoFornecedor = new ButtonGroup();
        grupoFornecedor.add(fornecedor);

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

        panel.add(confirmarBtn);
        panel.add(excluirBtn);
        panel.add(limparBtn);

        
        confirmarBtn.addActionListener(e -> confirmar());
        excluirBtn.addActionListener(e -> excluir());
        limparBtn.addActionListener(e -> limpar());
    }

    private void adicionarLabel(String texto, int x, int y, JPanel p, Font fonte) {
        JLabel label = new JLabel(texto);
        label.setFont(fonte);
        label.setBounds(x, y, 100, 25);
        p.add(label);
    }

    private void confirmar() {
        String cpfCnpj = new String(campoSenha[0].getPassword());
        String rg = new String(campoSenha[1].getPassword());

        if (cpfCnpj.isEmpty() || campoTexto[0].getText().isEmpty()) { 
            JOptionPane.showMessageDialog(panel, "Preencha os campos obrigatórios.");
        } else {
            JOptionPane.showMessageDialog(panel, "Cadastro confirmado.");
        }
    }

    private void excluir() {
        limpar();
        JOptionPane.showMessageDialog(panel, "Dados excluídos.");
    }

    private void limpar() {
        for (JTextField campo : campoTexto) {
            if (campo != null) campo.setText("");
        }
        for (JPasswordField campoSenha : campoSenha) {
            if (campoSenha != null) campoSenha.setText("");
        }
        tipoCombo.setSelectedIndex(0);
        rbAtivo.setSelected(false);
        rbInativo.setSelected(false);
        grupoFornecedor.clearSelection();
    }

    public JPanel getPanel() {
        return panel;
    }
}
