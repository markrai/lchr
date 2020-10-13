package hackerrank.java.endoffile;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        int counter = 1;

        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNext()) {

            String line = scanner.nextLine();
            counter++;

            System.out.println(counter + " " + line);

        }
    }
}