package squaredetector;

/**
 * Created by anhi on 03.04.2014.
 */
public class Square {
    private int breite = 1;
    private final Startpunkt startpunkt;
    private boolean finalized = false;
    public Square (Startpunkt startpunkt){
        this.startpunkt = startpunkt;
    }

    public boolean isFinalized() {
        return finalized;
    }

    public void setFinalized(boolean finalized) {
        this.finalized = finalized;
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    public boolean part(int zeile, int spalte) {
        boolean result = true;
        result &= zeile >= startpunkt.getX() && zeile < startpunkt.getX()+breite;
        result &= spalte >= startpunkt.getY() && spalte < startpunkt.getY()+breite;


        return result;
    }
}
