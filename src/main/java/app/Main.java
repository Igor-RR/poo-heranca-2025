package app;

import java.time.LocalDate;
import java.time.Month;

public class Main{
    public static void main(String[] args){
        PessoaFisica[] pf = new PessoaFisica[5];

        //public PessoaFisica(String nome, 
        // String endereco, LocalDate dataNascimento, 
        // String cpf)//

        pf[0] =  new PessoaFisica("Marco", "Almira - SP",
        LocalDate.of(1980, Month.MARCH, 29), "xxxx.xxxx");
        
        System.out.println(pf[0].exibirInformações());

        // public PessoaJuridica(String nome,
        // String endereco, String nomeFantasia, 
        // String cnpj) //

        PessoaJuridica pj = new PessoaJuridica("Alex", "Rua pão", "XP corretora de Pantera", "7657464764");

        System.out.println(pj.exibirInformações());
    }
}