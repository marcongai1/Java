public class Flower {
    private String name;
    private boolean currentlyBlooming;
    public Flower(String name, boolean currentlyBlooming){
        this.name = name;
        this.currentlyBlooming = currentlyBlooming;
    }
    public String getName(){
        return name;
    }
    public boolean getBlooming(){
        return currentlyBlooming;
    }
    public void setBlooming(boolean blooming){
        currentlyBlooming = blooming;
    }
    public String toString(){
        if (!currentlyBlooming){
            return name + "are not blooming";
        }
        else
            return name + "are blooming.";
    }
}
