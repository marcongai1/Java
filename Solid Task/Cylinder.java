public class Cylinder extends Solid{
    private int r,h;
    private double pi = Math.PI;
    private double volume, surfaceArea;
    public Cylinder(String name, int radius, int height){
        super(name);
        r = radius;
        h = height;
    }
    @Override
    public double volume(){
        volume = pi*Math.pow(r,2)*h;
        return volume;
    }
    @Override
    public double surfaceArea(){
        surfaceArea = 2*pi*r*h + 2*pi*Math.pow(r, 2);
        return surfaceArea;
    }
}
