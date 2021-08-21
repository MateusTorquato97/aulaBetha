import model.Diretor;
import model.Funcionario;
import repository.DiretorRepository;
import repository.FuncionarioRepository;
import service.DiretorService;
import service.FuncionarioService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("----- Adicionando Funcionarios -------");
        Funcionario funcionario = new Funcionario(3, "Mateus", "09275499993", 4900.00);
        Funcionario funcionario2 = new Funcionario(4, "Emily", "09275499994", 3900.00);
        Funcionario funcionario3 = new Funcionario(5, "Renan", "09275499995", 9900.00);

        FuncionarioService service = new FuncionarioService();

        service.save(funcionario);
        service.save(funcionario2);
        service.save(funcionario3);

        System.out.println("------ Alterando terceiro funcionario --------");
        funcionario3.setNome(funcionario3.getNome() + " - alterado");
        service.update(funcionario3);

        System.out.println("------ Buscando Funcionarios --------");
        FuncionarioRepository repository = new FuncionarioRepository();
        repository.findAll();
        repository.findById(4);

        System.out.println("------ Adicionando Diretores -------");
        Diretor diretor = new Diretor(3, "Aldo", "0958547999", 10000.00, 2000.00);
        Diretor diretor2 = new Diretor(4, "José", "0958547999", 20000.00, 1000.00);

        DiretorService service2 = new DiretorService();

        service2.save(diretor);
        service2.save(diretor2);

        System.out.println("------ Alterando primeiro diretor --------");
        diretor.setNome(diretor.getNome() + " - alterado");
        service2.update(diretor);

        System.out.println("------ Buscando Diretores --------");
        DiretorRepository repository2 = new DiretorRepository();
        repository2.findAll();
        repository2.findById(3);
    }
}
