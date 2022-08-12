package pl.tomaszbielawski;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("plik.txt");
        //zaczep do pliku, to nie znaczy że ten plik istnieje

        boolean newFile = file.createNewFile();

        System.out.println("Czy udało sie utworzyć: "+ newFile);

        PrintWriter writer = new PrintWriter(file);//
        writer.println("Ala nadal ma kota");
        writer.println("A Marcin nie ma ani psa ani kota");

        writer.close(); //musimy zamknac, gdyz plik zapisze zmiane albo po zamknieciu albo jakims buforze


        boolean exists = file.exists();

        System.out.println("Czy istnieje : " + exists);
        //sprawdzenie czy plik istnieje

        String absolutePath = file.getAbsolutePath();
        System.out.println("Ten plik jest w: " + absolutePath);
        //sprawdzenie ścieżki

        //Scanner scanner = new Scanner(System.in); // System.in - strumień wejścia (to co do konsoli jest wpisywane
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()){
            String line1 = scanner.nextLine();
            System.out.println(line1);
        }



    }
}
