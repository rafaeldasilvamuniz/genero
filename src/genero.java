import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
public class genero {

    public static void main(String args[]) {

        //Calculo cal = new Calculo();
        Pessoa pe  = new Pessoa();
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o seu nome completo: ");
        Set<String> lista = new HashSet<String>();
        String no = sc.next();
        pe.setNome(no);
        lista.add(pe.getNome());

        System.out.println("Digite o seu gênero e a sua orientação sexual: ");
        java.util.List<String> gen = new ArrayList<String>();
        String ge = sc.next();
        pe.setGenero(ge);
        gen.add(pe.getGenero());

        //System.out.println("Obrigado " + pe.getNome() + " por informar o seu nome  e o seu gênero ( " + pe.getGenero() + " )" );
        System.out.println("Obrigado " + lista + " por informar o seu nome, o seu gênero e a sua orientação sexual  " + gen + " " );
        System.out.println(" ");

    }
}



