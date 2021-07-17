package desafio04;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String inscricaoEstadual;
    private String cnae;

    public PessoaJuridica(Integer id, String nome, String endereco, String telefone, String cnpj, String inscricaoEstadual, String cnae) {
        super(id, nome, endereco, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.cnae = cnae;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public String getCnae() {
        return cnae;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public void setCnae(String cnae) {
        this.cnae = cnae;
    }

    public String getDocumentoPrincipal(){
        return getCnpj();
    }
}
