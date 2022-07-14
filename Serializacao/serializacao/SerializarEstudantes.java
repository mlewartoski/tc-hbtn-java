import java.io.*;
import java.util.*;

public class SerializarEstudantes<Estudante> {
    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) {
        try {
            FileOutputStream file = new FileOutputStream(nomeArquivo);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(estudantes);

            out.close();
            file.close();
        }

        catch(Exception e) {
            System.out.println("Nao foi possivel serializar");
        }
    }

    @SuppressWarnings("unchecked")
    public List<Estudante> desserializar() {
        List<Estudante> estudantes = new ArrayList<>();

        try {
            FileInputStream file = new FileInputStream(nomeArquivo);
            ObjectInputStream in = new ObjectInputStream(file);

            estudantes = (List<Estudante>) in.readObject();

            in.close();
            file.close();
        }

        catch(Exception e) {
            System.out.println("Nao foi possivel desserializar");
        }


        return estudantes;
    }
}
