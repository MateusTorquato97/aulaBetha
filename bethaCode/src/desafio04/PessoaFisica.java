package desafio04;

public class PessoaFisica extends Pessoa{
    private String cpf;
    private String rg;
    private String sexo;

    public PessoaFisica(Integer id, String nome, String endereco, String telefone, String cpf, String rg, String sexo) {
        super(id, nome, endereco, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDocumentoPrincipal(){
        return getCpf();
    }
}
