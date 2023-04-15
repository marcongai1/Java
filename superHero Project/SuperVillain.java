public class SuperVillain extends SuperCitizen{
    private String evilPlan;
    public SuperVillain(String name, int hitPoints, int maxDamage, int defenseAbility, String job, String sp, boolean hc, int pl, String ep, String superName){
        super(name, job, sp, hc, pl,hitPoints, maxDamage, defenseAbility, superName);
        evilPlan = ep;
    }   
    public String getEvilPlan(){
        return evilPlan;
    }
    public String toString(){
        return super.toString() + ", evilPlan: " + evilPlan;
    }
}
