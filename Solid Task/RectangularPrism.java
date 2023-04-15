public class RectangularPrism extends Solid{
    private int l,w,h;
    private double volume;
    private double surfaceArea;
    public RectangularPrism(String name, int length, int width, int height){
        super(name);
        l = length;
        w = width;
        h = height;
    }
    @Override
    public double volume(){
        volume = l*w*h;
        return volume;
    }
    @Override
    public double surfaceArea(){
        surfaceArea = 2*(l*w+h*l+h*w);
        return surfaceArea;
    }
}
