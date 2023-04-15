import java.lang.Math;
public class Sphere extends Solid{
    private int r;
    private double pi = Math.PI;
    private double volume, surfaceArea;
    public Sphere(String name, int radius){
        super(name);
        r = radius;
    }
    @Override
    public double volume(){
        volume = (4/3)*pi*Math.pow(r,3);
        return volume;
    }
    @Override
    public double surfaceArea(){
        surfaceArea = 4*pi*Math.pow(r, 2);
        return surfaceArea;
    }
}
