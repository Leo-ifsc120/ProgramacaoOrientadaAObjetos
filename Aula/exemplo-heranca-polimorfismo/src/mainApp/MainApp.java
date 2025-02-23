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
        System.out.println("ID...: " + fornecedor.getId());
        System.out.println("Nome.: " + fornecedor.getNome());
        System.out.println("Email: " + fornecedor.getEmail());
        System.out.println("Fone.: " + fornecedor.getFone());

        if(fornecedor instanceof Nacional)
        {

            System.out.println("CNPJ.: " + ((Nacional)fornecedor).getCnpj());

        }
        else
        {

            System.out.println("Pais.: " + ((Internacinal)fornecedor).getPais());
            System.out.println("NIF..: " + ((Internacinal)fornecedor).getNif());

        }

        System.out.println("------------------------------\n");

    }

}
