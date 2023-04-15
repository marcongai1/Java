import java.util.ArrayList;

public class GothamLikeAdventureTown{
    String firstNames[] = {"Magnus", "Garry", "Marco", "Kavin", "Aditya", "Aaryan", "Bobby", "Jeff", "Peter", "Harry"};
    String lastNames[] = {"Carlsen", "Kasparov", "Ngai", "Suresh", "Chandola", "Patel", "Fisher", "Bezos", "Griffin", "Potter"};
    String occupations[] = {"Chess Player", "Garbage Man", "Gambling Addict", "Alcoholic", "Fisherman", "Rice Farmer", "President", "Food Critic", "Gym Bro", "Homeless"};
    public GothamLikeAdventureTown(){
        ArrayList<Person> dailyPlanetStreet = new ArrayList<Person>();
        ArrayList<Person> safetyLand = new ArrayList<Person>();
        ArrayList<Person> unfortunatelyFatallyWoundedPeople = new ArrayList<Person>();
        int randSuperHero = (int)(Math.random()*50);
        int randSuperVillian = (int)(Math.random()*50);
        int index;
        SuperHero superHero =  new SuperHero(null, null, null, false, randSuperVillian, null, randSuperVillian, randSuperHero, randSuperVillian, null);
        SuperVillain superVillian = new SuperVillain(null, randSuperVillian, randSuperVillian, randSuperHero, null, null, false, randSuperVillian, null, null);
        while (randSuperHero == randSuperVillian){
            randSuperHero = (int)(Math.random()*50);
            randSuperVillian = (int)(Math.random()*50);
        }
        for(int i = 0; i < 50; i++){
            Person citizen;
            String firstName = firstNames[(int)(Math.random()*10)];
            String lastName = lastNames[(int)(Math.random()*10)];
            String occupation = occupations[(int)(Math.random()*10)];
            if(i == randSuperHero){
                superHero = new SuperHero(firstName + " " + lastName, occupation, "Invincibility & Super Strength", true, 9000, "Up, up, & away!", 1000, 100, 100, "Superman");
                dailyPlanetStreet.add(superHero);
            }
            else if (i == randSuperVillian){
                superVillian = new SuperVillain(firstName + " " + lastName, 1000, 100, 100, occupation, "5 infinity stones", false, 9000, "Erasing half of the universe", "Thanos");
                dailyPlanetStreet.add(superVillian);
            }
            else{
                citizen = new NormalCitizen(firstName + " " + lastName, occupation, 100, 10, 20);
                dailyPlanetStreet.add(citizen);

            }
        }
        while(dailyPlanetStreet.size()>=3){
            boolean cont = true;
            for (int i = 0; i < dailyPlanetStreet.size(); i++){
                if(cont){
                    if(dailyPlanetStreet.get(i) instanceof SuperVillain){
                        if(i>0 && i<dailyPlanetStreet.size()-1 && dailyPlanetStreet.get(i-1) instanceof NormalCitizen && dailyPlanetStreet.get(i+1) instanceof NormalCitizen){
                            //Both side rand remove one to dead people
                            if(Math.random() < 0.5){
                                unfortunatelyFatallyWoundedPeople.add(dailyPlanetStreet.remove(i-1));
                                i--;
                                cont = false;
                            }
                            else{
                                unfortunatelyFatallyWoundedPeople.add(dailyPlanetStreet.remove(i+1));
                                cont = false;
                            }
                        }
                        //One Side
                        //left
                        else if (i>0 && dailyPlanetStreet.get(i-1) instanceof NormalCitizen){
                            unfortunatelyFatallyWoundedPeople.add(dailyPlanetStreet.remove(i-1));
                            i--;
                            cont = false;
                        }
                        //right
                        else if(i<dailyPlanetStreet.size()-1 && dailyPlanetStreet.get(i+1) instanceof NormalCitizen){
                            unfortunatelyFatallyWoundedPeople.add(dailyPlanetStreet.remove(i+1));
                            cont = false;
                        }
                        else{}
                    }
                }
            }
            int rand;
            if(dailyPlanetStreet.size() >= 3){ //stops inf while loop if only hero and villain
                do
                    rand = (int)(Math.random()*dailyPlanetStreet.size());
                while(rand==dailyPlanetStreet.indexOf(superHero)||rand==dailyPlanetStreet.indexOf(superVillian));
                safetyLand.add(dailyPlanetStreet.remove(rand));   
            }
            index = dailyPlanetStreet.indexOf(superHero);
            rand = (int)(Math.random()*dailyPlanetStreet.size());
            dailyPlanetStreet.remove(index);
            dailyPlanetStreet.add(rand, superHero);
        }
        
        System.out.println("Fatally Wounded People: ");
        System.out.print(unfortunatelyFatallyWoundedPeople);
        System.out.println();
        System.out.println();
        System.out.println("Daily Planet Street: ");
        System.out.print(dailyPlanetStreet);
        System.out.println();
        System.out.println();
        System.out.print("People in Safety Land: \n" + safetyLand);
        System.out.println();
        System.out.println();
        System.out.println(superVillian.getEvilPlan());
        System.out.println(superHero.getCatchPhrase());
    }

    public static void main(String[] args){
        new GothamLikeAdventureTown();
    }
}
