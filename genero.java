import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
public class genero {

    public static void main(String args[]) {

        //Calculo cal = new Calculo();
        //Pessoa pe  = new Pessoa();
        Scanner sc = new Scanner(System.in);
        java.util.List<Pessoa> h = new ArrayList<>();
        java.util.List<Pessoa> m = new ArrayList<>();
        java.util.List<Pessoa> o = new ArrayList<>();
        Set<String> lista = new HashSet<String>();

       while (true) {

           Pessoa pe = new Pessoa();
           System.out.println("Digite o seu nome completo: ");
           //Set<String> lista = new HashSet<String>();
           String no = sc.next();
           if (no.equalsIgnoreCase("sair")) {
               break;
           }
           pe.setNome(no);
           lista.add(pe.getNome());
           //}
           System.out.println("Digite o seu gênero: ((F)Feminino,(M)Masculino,(O)Outro: ");
           java.util.List<String> gen = new ArrayList<String>();
           String ge = sc.next();
           pe.setGenero(ge);
           gen.add(pe.getGenero());

           if (ge.equalsIgnoreCase("M")) {
               h.add(pe);

           } else if (ge.equalsIgnoreCase("F")) {
               m.add(pe);
           } else if (ge.equalsIgnoreCase("O")) {
               o.add(pe);
           }
       }
        //lista.forEach(list -> System.out.println("Nome: " + lista + "Genero:" + pe.getNome()));
        //lista.forEach(list ->  System.out.println("Obrigado " + lista + " por informar o seu nome, o seu gênero e a sua orientação sexual  " + gen + " " ));

         for (Pessoa pessoa:h){
             System.out.println("Masculino : ");
             System.out.println(pessoa.getNome());
         }
         for (Pessoa pessoa:m){
             System.out.println("Feminino : ");
             System.out.println(pessoa.getNome());
         }
        for (Pessoa pessoa:o){
            System.out.println("Outro : ");
            System.out.println(pessoa.getNome());
        }


    }
}



