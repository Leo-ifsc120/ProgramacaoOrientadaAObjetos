package mainApp;

import domain.Funcionario;

public class MainApp
{
    public static void main(String[] args)
    {

        Funcionario f1 = new Funcionario(1, "Fulano", 2000.0F);
        Funcionario f2 = new Funcionario(2, "Ciclano", 12000.0F);
        Funcionario f3 = new Funcionario(3, "Beltrano", 20000.0F);
        Funcionario f4 = new Funcionario(4, "Deltrano", 122000.0F);


        print(f1);
        print(f2);
        print(f3);
        print(f4);

    }
    public static void print(Funcionario func)
    {

    }

}

