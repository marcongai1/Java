public class Person{
    private String name, job;
    private int hitPoints,maxDamage,defenseAbility;
    public Person(String n, String j, int hp, int dmg, int def){
        name = n;
        job = j;
        hitPoints = hp;
        maxDamage = dmg;
        defenseAbility = def;
    }

    public String getName(){
        return name;
    }

    public String getJob(){
        return job;
    }
    
    public int getHitPoints(){
        return hitPoints;
    }

    public int getMaxDamage(){
        return maxDamage;
    }

    public int getDefenseAbility(){
        return defenseAbility;
    }

    public int hpReduction(int damage){
        hitPoints-=damage;
        return hitPoints;
    }

    public String toString(){
        return "name: " + name + " job: " + job;
    }
}