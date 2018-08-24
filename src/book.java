import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class book {

    String name;
    String surename;
    String title;
    int pages;
    String description;

    public book(String name, String surename, String title, int pages, String description) {

        this.name = name;
        this.surename = surename;
        this.title = title;
        this.pages = pages;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getSurename() {
        return surename;
    }


    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return (this.getName() + " " + this.getSurename() + " " + this.getTitle() + " " + this.getPages() + " " + this.getDescription());
    }

    public static void main(String[] args) {

        book one = new book("Remigiusz", "Mroz", "Zerwa", 496, "\nOstatnia część pentalogii z Wiktorem Forstem. Zbocza gór znów spłynęły krwią.\nW środku sezonu turystycznego na Rysach odnalezione zostają zwłoki starszego mężczyzny, a sposób działania sprawcy prowadzi wyłącznie do jednego wniosku: wrócił ten, którego wszyscy się obawiali.\nOprócz monety w ustach, na nagim torsie ofiary znajduje się wycięty w skórze, krwawy napis: Revertar ad Ierusalem in misericordiis.\nSytuacje komplikuje fakt, że ofiarę umieszczono na samym środku słupka granicznego, przez co śledztwo zamierzają prowadzić zarówno Polacy, jak i Słowacy.\nW mieście i na szlakach wybucha panika, tymczasem Wiktor Forst budzi się w zakopiańskim szpitalu. Nie pamięta, co działo się z nim, od kiedy opuścił Polskę, by sprawdzić, co znajduje się w pewnej skrytce pocztowej");
       System.out.println(one.toString());
     }


}

