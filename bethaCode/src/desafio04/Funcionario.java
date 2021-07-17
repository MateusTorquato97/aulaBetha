package desafio04;

public class Funcionario extends PessoaFisica{
    private Double salarioBruto;
    private Double salarioLiquido;

    public Funcionario(Integer id, String nome, String endereco, String telefone, String cpf, String rg, String sexo, Double salarioBruto, Double salarioLiquido) {
        super(id, nome, endereco, telefone, cpf, rg, sexo);
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public Double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public void setSalarioLiquido(Double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public void aplicaDissidio(Double dissidio){
        Double salarioAtualizado = (this.getSalarioBruto() + (this.getSalarioBruto() * (dissidio / 100)));
        this.setSalarioBruto(salarioAtualizado);
    }
}
