package br.com.albertopaim.patterns.factory;

public class MoedaFabrica {

    public static Moeda getInstance(String pais) {
        return switch (pais) {
            case "BR" -> new Real();
            case "EUA" -> new Dolar();
            default -> throw new IllegalArgumentException("Pais não encontrado");
        };
    }
}