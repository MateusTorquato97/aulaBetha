package OrientacaoObjetos;

public class OrientacaoMain {
    public static void main(String[] args) {
        Documento doc1;
        doc1 = new Documento();

        doc1.nome = "Mateus";
        doc1.codigo = 1;
        doc1.foto = "Img1.png";
        doc1.dataNascimento = "21/04/1997";

        System.out.println("Código do documento: " + doc1.codigo);
    }

    static class Documento{
        String foto;
        String nome;
        Integer codigo;
        String dataNascimento;
    }
}
