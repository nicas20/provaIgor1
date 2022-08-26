package com.mycompany.prova1;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0, hrs, min, sec;
        float mI, mF;
        System.out.println("Massa inicial do material em gramas: ");

        mI = sc.nextFloat();
        mF = mI;

        while (mF >= 0.5) {
            mF /= 2;
            t += 50;
        }
        System.out.println();
        System.out.println("A massa inicial é " + mI + "g.");
        System.out.println("A massa final é " + mF + "g.");

        hrs = (t / 3600);
        min = (t % 3600) / 60;
        sec = (t % 3600) % 60;
        System.out.println(hrs + " horas, " + min + " minutos, " + sec + "segundos.");
    }

}
