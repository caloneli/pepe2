import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        
        Player strale = new Player();
        int s=-1;
        Scanner sc = new Scanner(System.in);
        while(s!=0){
            
            System.out.println("Zdravo " + strale.imeIgraca+ ", sta zelite da uradite? Pritisnite 0 da izadjete iz programa.");
            strale.prikaziFunkcije();
            s = sc.nextInt();
            switch (s){
                case 1: strale.pretrazi();break;
                case 2: strale.birajPosao();break;
                case 3: strale.getPosao();break;
                case 4: strale.radiPosao();break;
                case 5: strale.prikaziBalans();break;
                case 6:strale.dajOtkaz();break;
                
                
            }
            

            
            

        }
        
        

        sc.close();
    }
    
}
