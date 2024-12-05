package mainApp;

import domain.Fornecedor;
import domain.Internacinal;
import domain.Nacional;


public class MainApp
{

    public static void main(String[] args)
    {

        Nacional fornecedorNacional = new Nacional();
        fornecedorNacional.setId(1);
        fornecedorNacional.setNome("abc");
        fornecedorNacional.setEmail("abc@contato.com");
        fornecedorNacional.setFone("123321");
        fornecedorNacional.setCnpj("343433434");

        print(fornecedorNacional);


        Internacinal fornecedorInternacional = new Internacinal();
        fornecedorInternacional.setId(2);
        fornecedorInternacional.setNome("def");
        fornecedorInternacional.setEmail("def@contato.com");
        fornecedorInternacional.setFone("345543");
        fornecedorInternacional.setPais("USA");
        fornecedorInternacional.setNif("343434343");

        print(fornecedorInternacional);

    }

    public static void print(Fornecedor fornecedor)
    {


        System.out.println("---------Fornecedores---------");
        System.out.print(fornecedor.getDados());
        System.out.println("------------------------------\n");

    }

}
