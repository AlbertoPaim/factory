package br.com.albertopaim.patterns.builder;

public class Paciente {
    private String name;
    private String email;
    private String cpf;

    public Paciente(String name, String emamil, String cpf) {
        this.name = name;
        this.email = emamil;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmamil() {
        return email;
    }

    public void setEmamil(String emamil) {
        this.email = emamil;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
