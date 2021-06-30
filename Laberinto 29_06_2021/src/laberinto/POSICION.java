
package laberinto;

public class POSICION {
    
    private boolean var;
    private int XX;
    private int YY;

    public POSICION(boolean var, int XX, int YY) {
        this.var = var;
        this.XX = XX;
        this.YY = YY;
    }

    public boolean isVar() {
        return var;
    }

    public void setVar(boolean var) {
        this.var = var;
    }

    public int getXX() {
        return XX;
    }

    public void setXX(int XX) {
        this.XX = XX;
    }

    public int getYY() {
        return YY;
    }

    public void setYY(int YY) {
        this.YY = YY;
    }

    @Override
    public String toString() {
        return "POSICION{" + "var=" + var + ", XX=" + XX + ", YY=" + YY + '}';
    }
    
    
}
