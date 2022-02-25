package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        Scanner skaner = new Scanner(new FileReader(new File("C:\\Users\\mleko\\Desktop\\" +
                "springProjekty\\untitled7\\src\\com\\company\\liczby.txt")));
        String[] tab = new String[1000];

        for (int i = 0;skaner.hasNext();i++){
            tab[i] = skaner.next();
        }

        System.out.println(wiecejZeroOdJeden(tab));
        System.out.println(ilePodzielnePrzezDwa(tab));
        System.out.println(ilePodzielnePrzezOsiem(tab));


    }

    static int wiecejZeroOdJeden(String[] tab){
        int wynik = 0;
        for (int i = 0;i<tab.length;i++
             ) {
            int zeroCounter = 0;
            int jedenCounter = 0;

            for (int j = 0; j < tab[i].length(); j++) {
                if (Character.toString(tab[i].charAt(j)).equals("0")){
                    zeroCounter++;
                }
                else
                    jedenCounter++;
            }
            if (zeroCounter>jedenCounter){
                wynik++;
            }
        }
        return wynik;

    }

    static int ilePodzielnePrzezDwa(String[] tab){
        int wynik = 0;
        for (String el:tab
             ) {
            BigInteger elementInt = new BigInteger(el);
            if (elementInt.divideAndRemainder(new BigInteger("2"))[1].equals(BigInteger.ZERO)) {
                wynik++;
            }
        }
        return wynik;
    }
    static int ilePodzielnePrzezOsiem(String[] tab){
        int wynik = 0;
        for (String el:tab
             ) {
            BigInteger elementInt = new BigInteger(el);
            if (elementInt.divideAndRemainder(new BigInteger("8"))[1].equals(BigInteger.ZERO)) {
                wynik++;
            }
        }
        return wynik;
    }

    


}
