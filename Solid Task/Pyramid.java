import java.lang.Math;
public class Pyramid extends Solid{
    private int l,w,h;
    private double volume;
    private double surfaceArea;
    public Pyramid(String name, int length, int width, int height){
        super(name);
        l = length;
        w = width;
        h = height;
    }
    @Override
    public double volume(){
        super.volume();
        volume = (l*w*h)/3;
        return volume;
    }
    
    @Override
    public double surfaceArea(){
        super.surfaceArea();
        surfaceArea =  (l*w) + l * Math.sqrt(Math.pow((w/2.0),2)+Math.pow(h,2))+w*Math.sqrt(Math.pow((l/2.0),2)+Math.pow(h,2));
        return surfaceArea;
    }
}