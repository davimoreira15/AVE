
import java.util.ArrayList;
import java.util.Date;


public class Pessoa {
private String nome;
private String CPF;

private String telefone;

private String senha;


    public Pessoa(String nome, String CPF, String telefone, String senha) {
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.senha = senha;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}


