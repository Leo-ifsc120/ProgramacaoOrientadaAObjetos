package Main;

import javax.swing.*;
import java.awt.event.*;

public class Show extends JDialog
{
    private JPanel contentPane;
    private JLabel placa;
    private JLabel cor;
    private JLabel modelo;
    private JLabel marca;
    private JLabel potencia;
    private JLabel categoria;
    private JLabel combustivel;
    private JButton gravarNovamenteButton;
    private JButton cancelarButton;
    private JButton buttonOK;

    public Show()
    {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(gravarNovamenteButton);


        gravarNovamenteButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                onOK();
            }
        });

        cancelarButton.addActionListener(new ActionListener()
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

    public void setPlaca(String placa)
    {
        this.placa.setText(placa);
    }

    public void setCor(String cor)
    {
        this.cor.setText(cor);
    }

    public void setModelo(String modelo)
    {
        this.modelo.setText(modelo);
    }

    public void setMarca(String marca)
    {
        this.marca.setText(marca);
    }

    public void setPotencia(String potencia)
    {
        this.potencia.setText(potencia);
    }

    public void setCategoria(String categoria)
    {
        this.categoria.setText(categoria);
    }

    public void setCombustivel(String combustivel)
    {
        this.combustivel.setText(combustivel);
    }
}
