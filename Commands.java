import java.util.Scanner;

public class Commands  {
    int trenutniBalans = 0;
    Scanner sc = new Scanner(System.in);
    private int trenutniId=0;


    public Player[] nizIgraca;
    public void dodajIgraca(int kolicina){
        for (int i = 0; i < kolicina; i++) {
            nizIgraca[i].idIgraca=trenutniId++;
            System.out.println("Ime igraca:");
            String ime = sc.nextLine();
            nizIgraca[i].imeIgraca=ime;
            
            
        }
    }

    

    




}
