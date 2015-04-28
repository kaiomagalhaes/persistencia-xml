package main.java.zeroglosa;


public class Aluno {
    private String nome;
    private String email;

    public Aluno(String nome,String email){
        this.setNome(nome);
        this.setEmail(email);
    }

    public Aluno(){}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
