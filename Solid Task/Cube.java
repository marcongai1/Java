public class Cube extends Solid{
    private int s;
    private double volume, surfaceArea;
    public Cube(String name, int side){
        super(name);
        s = side;
    }

    public double volume(){
        volume = Math.pow(s,3);
        return volume;
    }

    public double surfaceArea(){
        surfaceArea = 6*Math.pow(s, 2);
        return surfaceArea;
    }
}
