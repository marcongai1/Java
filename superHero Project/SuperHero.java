public class SuperHero extends SuperCitizen{
    private String catchPhrase;
    public SuperHero(String name, String job, String sp, boolean hc, int pl, String cp, int hitPoints, int maxDamage, int defenseAbility, String superName){
        super(name, job, sp, hc, pl,hitPoints, maxDamage, defenseAbility, superName);
        catchPhrase = cp;
    }

    @Override
    public void powerLevelModification(int powerLevel){
        int rand = (int)(Math.random()*10)+1;
        powerLevel = rand;
    }

    public String getCatchPhrase(){
        return catchPhrase;
    }
    public String toString(){
        return super.toString() + ", catchPhrase: " + catchPhrase;
    }
}
