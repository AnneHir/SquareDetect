package squaredetector;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


/**
 * Created by anhi on 02.04.2014.
 */
public class SquareMain { public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    List<String> output = new LinkedList<String>();

    int games = Integer.parseInt(in.nextLine());

    for (int i = 1; i <= games; i++) {
        int dimension = in.nextInt();
        char[][] field = new char[dimension][dimension];

        in.nextLine();
        for (int j = 0; j < dimension; j++) {
            field[j] = in.nextLine().toCharArray();
        }

    SquareDetector detector = new SquareDetector(dimension, field);

    boolean result = detector.evaluate();

    output.add("Case #" + i + ": " + (result ? "YES" : "NO"));
}

    for (String out : output) {
        System.out.println(out);
    }
}
}
