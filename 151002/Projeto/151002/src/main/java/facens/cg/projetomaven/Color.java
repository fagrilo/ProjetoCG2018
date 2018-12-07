package facens.cg.projetomaven;

public class Color
{
    private double r, g, b;

    public static Color red()
    {
        return new Color(1, 0, 0);
    }

    public static Color blue()
    {
        return new Color(0, 0, 1);
    }

    public static Color green()
    {
        return new Color(0, 1, 0);
    }

    public static Color white()
    {
        return new Color(1, 1, 1);
    }

    public static Color yellow()
    {
        return new Color(0, 1, 1);
    }

    public static Color orange()
    {
        return new Color(1, 0.5, 0);
    }

    public Color(double r, double g, double b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
