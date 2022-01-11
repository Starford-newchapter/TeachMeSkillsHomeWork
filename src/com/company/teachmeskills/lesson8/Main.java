package com.company.teachmeskills.lesson8;

import java.util.Arrays;

public class Main {
    public static void main(java.lang.String[] args) {
        String str = "первый второй третий кабак.Четвертый пятый шестой седьмой.Один.Один ";


        String sentences[] = str.toLowerCase().split("[.!?]\\s*");
        String words[][] = new String[sentences.length][];
        for (int i = 0; i < sentences.length; i++) {
            words[i] = sentences[i].split("[\\p{Punct}\\s]+");

        }
        boolean isPalindrome = false;


        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                    if (words[i].length >= 3 && words[i].length <= 5) {
                        System.out.print(words[i][j] + " ");
                    } else if (words[i][j].equals(new StringBuffer(words[i][j]).reverse().toString())) {
                        System.out.print(Arrays.toString(words[i]));
                    }



                }
            }
        }
    }










