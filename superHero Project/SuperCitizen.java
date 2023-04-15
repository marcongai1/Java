public class SuperCitizen extends Person{
    private String superPower;
    private int powerLevel;
    private boolean hasCape;
    private String superName;
    public SuperCitizen(String name, String job, String sp, boolean hc, int pl, int hitPoints, int maxDamage, int defenseAbility, String sn){
        super(name, job, hitPoints, maxDamage, defenseAbility);
        superPower = sp;
        hasCape = hc;
        powerLevel = pl;
        superName = sn;
    }

    public void powerLevelModification(int newValue){
        powerLevel = newValue;
    }

    public String getSuperPower(){
        return superPower;
    }

    public int getPowerLevel(){
        return powerLevel;
    }
    
    public boolean hasCape(){
        return hasCape;
    }

    public String getSuperName(){
        return superName;
    }

    public String toString(){
        return super.toString() + " superName: " + superName + ", superPower: " + superPower + ", cape: " + hasCape + ", powerLevel: " + powerLevel;
    }
}