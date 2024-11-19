package br.com.albertopaim.patterns.singleton;

public class SingleTonTest {
    public static void main(String[] args) {
        Conexao conexao = Conexao.getInstance("google");
        Conexao conexao2 = Conexao.getInstance("facebook");
        System.out.println(conexao.bancoDeDados);
        System.out.println(conexao2.bancoDeDados);
    }
}
