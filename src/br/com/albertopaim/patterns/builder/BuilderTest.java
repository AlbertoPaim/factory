package br.com.albertopaim.patterns.builder;

public class BuilderTest {
    public static void main(String[] args) {
        PacienteBuilder builder = new PacienteBuilder();
        builder.setName("Alberto");
        builder.setCpf("2013213");
        builder.setEmail("asdasd@gmail.com");

        Paciente Alberto = builder.getResult();
        System.out.println(Alberto.getName());

    }
}
