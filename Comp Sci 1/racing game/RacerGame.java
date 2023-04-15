public class RacerGame{
    public static void main(String[] args){
        RacerCanvas race = new RacerCanvas(800,800);
        race.setFiles("racer1.png", "racer2.png", "racer3.png");
        //int of Wins of each racer
        int racer1W = 0;
        int racer2W = 0;
        int racer3W = 0;
        //runs the race 3 times
        for(int i = 0; i < 3; i++){
            //boolean that if the racer finishs
            boolean racer1 = false;
            boolean racer2 = false;
            boolean racer3 = false;
            //placing
            boolean first = false;
            boolean second = false;
            int racer1P = 0;
            int racer2P = 0;
            int racer3P = 0;
            //int of the starting positions of racers
            int a = 0;
            int b = 0;
            int c = 0;
            boolean endRace = false;
            race.moveRacer1(0, 0);
            race.moveRacer2(0, 300);
            race.moveRacer3(0, 550);
            race.repaint();
            while (endRace == false){
                int x = (int)(Math.random()*25)+1;
                int y = (int)(Math.random()*25)+1;
                int z = (int)(Math.random()*25)+1;
                a+=x;
                b+=y;
                c+=z;
                race.moveRacer1(a, 0);
                race.moveRacer2(b, 300);
                race.moveRacer3(c, 550);
                race.repaint();
                //racer 1 reaches the border
                if(a >= 600){
                    race.moveRacer1(600, 0);
                    race.repaint();
                    //determines placing for racer
                    if(racer1==false){
                        if (first == false){
                            racer1W++;
                            racer1P+=1;
                            first = true;
                        }
                        else if(second == false){
                            second = true;
                            racer1P +=2;
                        }
                        else{
                            racer1P+=3;
                        }
                    }
                    racer1 = true;
                }
                //racer 2 reaches the border
                if(b >= 600){
                    race.moveRacer2(600, 300);
                    race.repaint();
                    //determines placing for racer
                    if(racer2==false){
                        if (first == false){
                            racer2W++;
                            racer2P+=1;
                            first = true;
                        }
                        else if(second == false){
                            second = true;
                            racer2P +=2;
                        }
                        else{
                            racer2P+=3;
                        }
                    }
                    racer2 = true;
                }
                //racer 3 reaches the border
                if(c >= 600){
                    race.moveRacer3(600, 550);
                    race.repaint();
                    //determines placing for racer
                    if(racer3==false){
                        if (first == false){
                            racer3W++;
                            racer3P+=1;
                            first = true;
                        }
                        else if(second == false){
                            second = true;
                            racer3P +=2;
                        }
                        else{
                            racer3P+=3;
                        }
                    }
                    racer3 = true;
                }
                race.delay(100);
                //ends race if all racers reach the border
                if(racer1 && racer2 && racer3)
                    endRace = true;
            }
            //displays the placing for each racer
            race.setPlaces("Racer 1 is in " + racer1P + " place." + " Racer 2 is in " + racer2P + " place." + " Racer 3 is in " + racer3P + " place.", 100, 550, 20);
            race.showText(true);
            race.repaint();
            //delay until text disappears
            race.delay(1500);
            race.showText(false);
        }
        //determines overall winner
        if(racer1W > racer2W && racer1W > racer3W){
            race.setPlaces("Racer 1 is the overall winner", 300, 200, 20);
            race.showText(true);
            race.repaint();
        }
        else if(racer2W > racer1W && racer2W > racer3W){
            race.setPlaces("Racer 2 is the overall winner", 300, 200, 20);
            race.showText(true);
            race.repaint();
        }
        else if(racer3W > racer1W && racer3W > racer2W){
            race.setPlaces("Racer 3 is the overall winner", 300, 200, 20);
            race.showText(true);
            race.repaint();
        }
        else{
            race.setPlaces("It is a tie for the overall winner", 300, 200, 20);
            race.showText(true);
            race.repaint();
        }
    }
}