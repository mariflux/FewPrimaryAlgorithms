package lotto;

import java.util.Scanner;

public class MainLotto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("From what number do we start?");
        int start = scanner.nextInt();
        System.out.println("On what number do we stop?");
        int stop = scanner.nextInt();
        System.out.println("How many unique numbers do we need?");
        int howMany = scanner.nextInt();
        System.out.println(new LottoGenerator().rand(start,stop,howMany));

    }
}
