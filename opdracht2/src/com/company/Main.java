package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.println("Hoeveel mijl wil je weten in kilometers?");
        double mijl = scanner.nextInt();
        double km = (mijl * 1.6) ;
        System.out.println(mijl + " Mijl = " + km + " Km");

        System.out.println();

        System.out.println("Hoeveel jaar oud ben jij?");
        int jaar = scanner.nextInt();
        System.out.println("Hoeveel maanden komen daar nog bij?");
        int maand = scanner.nextInt();
        int jaar2 = ((jaar * 365) + ( 24 / 60));
        int maand2 = (((maand / 12) + (* 365 /24 ) / (60));
        System.out.println(jaar2 + maand2);
    }
}
