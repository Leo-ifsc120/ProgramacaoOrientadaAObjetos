package Main;

import javax.swing.*;

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
    private JButton buttonOK;

    public Show()
    {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
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
