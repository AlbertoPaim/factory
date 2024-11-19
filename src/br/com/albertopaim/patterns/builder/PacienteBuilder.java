package br.com.albertopaim.patterns.builder;

public class PacienteBuilder implements IpacienteBuilder {
    private String name;
    private String email;
    private String cpf;

    @Override
    public void setName(String name) {
    this.name = name;
    }

    @Override
    public void setEmail(String email) {
    this.email = email;
    }

    @Override
    public void setCpf(String cpf) {
    this.cpf = cpf;
    }

    public Paciente getResult () {
        return  new Paciente(name, email, cpf);
    }
}

