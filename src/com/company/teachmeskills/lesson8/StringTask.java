package com.company.teachmeskills.lesson8;


public class StringTask {
    private String str;

    public StringTask(String str) {
        this.str = str;

    }


    public char[] getChars(int a, int b) {
        char[] dst = new char[b - a];
        str.getChars(a, b, dst, 0);
        return dst;
    }

    public String replaceThirdWithZero() {
        char[] strChar = str.toCharArray();
        String str2 = "";

        for (int i = 0; i < strChar.length; i++) {
            if (strChar[i] == strChar[3]) {
                str2 = str.replace(strChar[i], strChar[0]);
            }
        }
        return str2;
    }

    public void printPalindrome() {
        str = str.toLowerCase();
        String[] str2 = str.split(" ");
        for (int i = 0; i < str2.length; i++) {
            if (str2[i].equals(new StringBuffer(str2[i]).reverse().toString())) {
                System.out.println(str2[i]);
            }

        }
    }

    public void printSentencesWithThreeOrFiveWords() {
        String sentences[] = str.split("[.!?]\\s*");
        String words[][] = new String[sentences.length][];
        for (int i = 0; i < sentences.length; i++) {
            words[i] = sentences[i].split("[\\p{Punct}\\s]+");
        }




        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                if (words[i].length >= 3 && words[i].length <= 5) {
                    System.out.print(words[i][j] + " ");
                }
            }
            System.out.println();


        }
    }


}

