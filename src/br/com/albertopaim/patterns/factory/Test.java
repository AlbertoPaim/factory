package br.com.albertopaim.patterns.factory;

public class Test {
    public static void main (String[] args){
    Moeda moeda = MoedaFabrica.getInstance("EUA");
        System.out.println(moeda.moedaCifrao());
    }
}
