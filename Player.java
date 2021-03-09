import java.util.Scanner;

public class Player {
    String imeIgraca;
    int idIgraca;
    private int trenutniBalans = 0;
    String posao = "";
    Scanner sc = new Scanner(System.in);
    boolean imaPosao = false;

    public Player() {
        System.out.println("Koje je vase ime?");
        String ime = sc.next();
        this.imeIgraca = ime;

    }

    public void pretrazi() {
        System.out.println("Sta zelite da pretrazite? :\norman, psa, travu?");

        String s = sc.nextLine();

        switch (s) {
        case "orman":
            trenutniBalans += 120;
            System.out.println("Nasli ste 120 novcica!");
            break;
        case "pas":
            trenutniBalans += 120;
            System.out.println("Uzeli ste psu 200 novcica, nice");
            break;
        case "trava":
            trenutniBalans += 120;
            System.out.println("U travi je bilo 300 novcica");
            break;

        }
    }

    enum Poslovi {
        PROGRAMER, CISTAC, UCITELJ;
    }

    public void birajPosao() {
        if (imaPosao == true) {
            System.out.println("Vec imas posao, moras prvo da das otkaz!");
            return;
        }
        System.out.println("Gde zelite da se zaposlite?");

        for (Poslovi svi : Poslovi.values()) {
            System.out.println(svi);

        }
        String posao = sc.nextLine();

        while (imaPosao == false) {
            switch (posao) {
            case "PROGRAMER":
                System.out.println("Zaposlili ste se kao programer! Vasa mesecna plata je 989e");
                imaPosao = true;
                this.posao = "PROGRAMER";
                break;
            case "CISTAC":
                System.out.println("Zaposlili ste se kao programer! Vasa mesecna plata je 489e");
                imaPosao = true;
                this.posao = "CISTAC";
                break;
            case "UCITELJ":
                System.out.println("Zaposlili ste se kao ucitelj! Vasa mesecna plata je 898");
                imaPosao = true;
                this.posao = "UCITELJ";
                break;
            }
            if (imaPosao == false)
                System.out.println("GRESKA, pogresno unet posao");
            return;
        }

    }

    public String getPosao() {
        System.out.println("Zaposleni ste kao " + this.posao);
        return this.posao;
    }

    public void radiPosao() {
        String trenutniPosao = this.posao;
        if (trenutniPosao == "")
            System.out.println("Nemate posao, zaposlite se!");
        switch (trenutniPosao) {
        case "PROGRAMER":
            System.out.println("Napisite dekoder unazad!");
            String igrica = sc.next();
            if (igrica.equals("redoked")) {
                this.trenutniBalans += 989;
                System.out.println("E bravo, zaradio si 989, tvoj novi balans je " + this.trenutniBalans);
            } else {
                this.trenutniBalans += 596;
                System.out.println(
                        "Lose uradjeno.. dobio si 596, uradi bolje sledeci put. Sada imas" + this.trenutniBalans);

            }
            break;
        case "CISTAC":
            System.out.println("Volim da metlam i koristim metle, 1 za da 2 za ne");
            int volimDaMetlam = sc.nextInt();
            if (volimDaMetlam == 1) {
                this.trenutniBalans += 489;
                System.out.println("E bravo, dobijas + 489 za dobro uradjen posao. Tvoj trenutni balans je: "
                        + this.trenutniBalans);
                break;
            } else {
                this.trenutniBalans += 320;
                System.out.println("Lose uradjen posao, dobio si samo 320, trenutni balans:" + this.trenutniBalans);
                break;
            }
            case "UCITELJ":
            System.out.println("Ko je bio Albert Einstein?");
            String albert = sc.next();
            if (albert.equals("fizicar")) {
                this.trenutniBalans += 898;
                System.out.println("E bravo, dobijas + 898 jer si znao odgovor. Tvoj trenutni balans je: "
                        + this.trenutniBalans);
            }else {
                this.trenutniBalans+=698;
                System.out.println("Kako bre to ne znas? Dobices samo 698, strasno, vrati se u skolu! Trenutni balans:"+this.trenutniBalans);
            }

        }
    }

    public enum Funkcije {
        PRETRAZI, NADJI_POSAO, PRIKAZI_POSAO, RADI, BALANS, DAJ_OTKAZ, DODAJ_JOS_IGRACA;
    }

    public void prikaziFunkcije() {
        int i = 1;
        for (Funkcije myVar : Funkcije.values()) {

            System.out.println(i + ": " + myVar + "\t");
            i++;

        }
    }

    public void prikaziBalans() {
        System.out.println("Vas trenutni balans je: " + this.trenutniBalans);
    }

    public void dajOtkaz() {
        System.out.println("E super, sada mozes da trazis novi posao!");
        imaPosao = false;
    }

}