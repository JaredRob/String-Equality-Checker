package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int solution(String S, String T) {
        char[] sChar = S.toCharArray();
        char[] tChar = T.toCharArray();
        ArrayList<Character> sList = new ArrayList<Character>();
        ArrayList<Character> tList = new ArrayList<Character>();
        for (char c: sChar) {
            sList.add(Character.valueOf(c));
        }
        for (char c: tChar) {
            tList.add(Character.valueOf(c));
        }
        if (sList.equals(tList))
            return 0;
        int i = 0;
        if (sChar.length <= tChar.length) {
            return 0;
        } else {
            while (true || i == sList.size()) {
                if (tList.get(i).equals(sList.get(i))) {
                    i += 1;
                } else {
                    sList.remove(i);
                    if (sList.equals(tList)) {
                        return 1;
                    }
                }
            }
            return 0;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String S = scanner.nextLine();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String T = scanner.nextLine();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int value = solution(S, T);



        System.out.println(value);


        scanner.close();
    }
}

