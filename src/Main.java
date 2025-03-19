import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Teatro teatro=new Teatro("Multiplex", 10);



        while(true){
            System.out.println(teatro.toString());

            //teatro.guardaposti();
            System.out.println("\nInserisci il numero di posto tra 1 e "+teatro.numPosti()+" che voui prenotare:");
            int p;

            try{p=sc.nextInt();
                teatro.prenotaPosto(p);}
            catch(PostoNonValidoException | PostoGiaOccupatoException e){System.out.println(e);}
            catch(Exception e){System.out.println("Errore di input! Inserisci un numero valido.");
                sc.nextLine();
                continue;
            }
            teatro.guardaposti();
        }


    }



}
