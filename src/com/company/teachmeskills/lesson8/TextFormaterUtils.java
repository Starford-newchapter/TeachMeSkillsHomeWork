package com.company.teachmeskills.lesson8;

public class TextFormaterUtils {
    private static String s;

    public TextFormaterUtils(String s) {
        this.s = s;
    }

    public static int returnCountWords() {
        int countWords = 0;
        String sentences[] = s.split("[.!?]\\s*");
        String words[][] = new String[sentences.length][];

        for (int i = 0; i < sentences.length; i++) {
            words[i] = sentences[i].split("[\\p{Punct}\\s]+");
        }
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                countWords++;

            }

        }
        return countWords;
    }

    public static boolean isPalindrome() {
        s = s.toLowerCase();
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(new StringBuffer(str[i]).reverse().toString())) {
                return true;
            }

        }
        return false;
    }
}

