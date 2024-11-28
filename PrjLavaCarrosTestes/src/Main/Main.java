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


        Main dialog = new Main();
        dialog.setSize(480,360);
        dialog.setLocationRelativeTo(null);
        dialog.setTitle("Insira os dados do carro");
        dialog.setVisible(true);
        Show print = new Show();
        print.setSize(720,360);
        print.setLocationRelativeTo(null);
        print.setTitle("Dados informados");
        print.setPlaca(dialog.placa.getText());
        print.setCor(dialog.cor.getText());
        print.setModelo(dialog.modelo.getText());
        print.setMarca(dialog.marca.getText());
        print.setPotencia(dialog.potencia.getText());
        print.setVisible(true);
        System.exit(0);



    }
}
