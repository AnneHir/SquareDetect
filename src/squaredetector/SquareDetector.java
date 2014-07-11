package squaredetector;

import java.lang.reflect.Array;

/**
 * Created by anhi on 02.04.2014.
 */
public class SquareDetector {

    private final int dimension;
    private final char[][] field;


    public SquareDetector(int dimension, char[][] field) {
        this.dimension = dimension;
        this.field = field;
    }

    private boolean squareroot(int n) {
        if (n == 0) {
            return false;
        }
        int root = (int) (Math.sqrt(n) + 0.5);
        if (root * root == n) {
            return true;
        }
        return false;
    }


    public boolean evaluate() {
        Square square = null;
        for (int zeile = 0; zeile < field.length; zeile++) {
            for (int spalte = 0; spalte < field.length; spalte++) {
                if (square == null && '#' == (field[zeile][spalte])) {
                    square = new Square(new Startpunkt(zeile, spalte));
                    continue;
                }
                if (square != null && !square.isFinalized() && '#' == field[zeile][spalte]) {
                    square.setBreite(square.getBreite()+1);
                }
                if (square != null && !square.isFinalized() && ('.' == field[zeile][spalte] || spalte == 0)){
                    square.setFinalized(true);
                }
                if (square != null && square.isFinalized()){
                    boolean dazu = square.part(zeile, spalte);
                    if(dazu && field[zeile][spalte] != '#'){
                         return false;
                    }
                    if(!dazu && field[zeile][spalte] == '#' ){
                        return false;
                    }
                }

            }

        }

        return true;
    }
}




/*int counter= 0;

for (int i = 0; i < field.length ; i++) {
        for (int j = 0; j < field.length; j++) {


        if ('#' == (field[j][i])){
        counter++;
        }

        }
        }
        return squareroot(counter);*/




/*public class SquareDetector {

    private int dimension;
    private String [][] field;

    public SquareDetector(String[][] field, int dimension) {
        this.field = field;
        this.dimension = dimension;
    }
      private boolean squareroot(int n){
        if (n==0){
            return false;
        }
        int root = (int) (Math.sqrt(n) + 0.5);
        if(root*root == n){
            return true;
        }
        return false;
    }

   public boolean evaluate() {
        int counter= 0;

        for (int i = 0; i < field.length ; i++) {
            for (int j = 0; j < field.length; j++) {

                counter++;

if ("#"==field[j][i]){
        counter++;
        }

        }
        }
        return squareroot(counter);

        }
        }*/
