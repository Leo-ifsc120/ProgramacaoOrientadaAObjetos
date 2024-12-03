package Main;

import domain.*;

import javax.swing.*;
import java.awt.event.*;


public class Main extends JDialog
{
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField placa;
    private JTextField cor;
    private JTextField modelo;
    private JTextField marca;
    private JTextField potencia;
    private JComboBox categoria;
    private JComboBox combustivel;
    private JTextField textField1;

    public Main()
    {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);



        buttonOK.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK()
    {
        dispose();
    }

    private void onCancel()
    {
        // add your code here if necessary
        dispose();
        System.exit(0);
    }

    public static void main(String[] args)
    {

        Marca marca1 = new Marca();
        Modelo modelo1 = new Modelo();
        Veiculo veiculo1 = new Veiculo();
        Cor cor1 = new Cor();


        Main dialog = new Main();
        dialog.setSize(480,360);
        dialog.setLocationRelativeTo(null);
        dialog.setTitle("Insira os dados do carro");
        dialog.setVisible(true);

        veiculo1.setPlaca(dialog.placa.getText());
        marca1.setNome(dialog.marca.getText());
        modelo1.setDescricao(dialog.modelo.getText());
        cor1.setNome(dialog.cor.getText());

        veiculo1.setModelo(modelo1);
        veiculo1.getModelo().setMarca(marca1);
        veiculo1.setCor(cor1);
        veiculo1.getModelo().getMotor().setPotencia(Integer.parseInt(dialog.potencia.getText()));

        switch(dialog.categoria.getSelectedIndex())
        {
            case 0:
                veiculo1.getModelo().setCategoria(ECategoria.eCategoria.Pequeno);
                break;
            case 1:
                veiculo1.getModelo().setCategoria(ECategoria.eCategoria.Padrao);
                break;
            case 2:
                veiculo1.getModelo().setCategoria(ECategoria.eCategoria.Medio);
                break;
            case 3:
                veiculo1.getModelo().setCategoria(ECategoria.eCategoria.Grande);
                break;
            case 4:
                veiculo1.getModelo().setCategoria(ECategoria.eCategoria.Moto);
                break;
        }

        switch(dialog.combustivel.getSelectedIndex())
        {
            case 0:
                veiculo1.getModelo().getMotor().setTipoCombustivel(ETipoCombustivel.eTipoCombustivel.Gasolina);
                break;
            case 1:
                veiculo1.getModelo().getMotor().setTipoCombustivel(ETipoCombustivel.eTipoCombustivel.Etanol);
                break;
            case 2:
                veiculo1.getModelo().getMotor().setTipoCombustivel(ETipoCombustivel.eTipoCombustivel.Flex);
                break;
            case 3:
                veiculo1.getModelo().getMotor().setTipoCombustivel(ETipoCombustivel.eTipoCombustivel.Diesel);
                break;
            case 4:
                veiculo1.getModelo().getMotor().setTipoCombustivel(ETipoCombustivel.eTipoCombustivel.GNV);
                break;
            case 5:
                veiculo1.getModelo().getMotor().setTipoCombustivel(ETipoCombustivel.eTipoCombustivel.Outro);
                break;
        }


        Show print = new Show();
        print.setSize(720,360);
        print.setLocationRelativeTo(null);
        print.setTitle("Dados informados");
        print.setPlaca(veiculo1.getPlaca());
        print.setCor(veiculo1.getCor().getNome());
        print.setModelo(veiculo1.getModelo().getDescricao());
        print.setMarca(veiculo1.getModelo().getMarca().getNome());
        print.setPotencia(String.valueOf(veiculo1.getModelo().getMotor().getPotencia()));
        print.setCategoria(veiculo1.getModelo().getCategoria().toString());
        print.setCombustivel(veiculo1.getModelo().getMotor().getTipoCombustivel().toString());
        print.setVisible(true);
        System.exit(0);



    }
}
