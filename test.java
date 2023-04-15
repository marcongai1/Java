
public class test{
    public test(){
        //code goes here
        int list[][]=new int[4][3];
        list[3][2]=6;
        list[3][1]=7;
        list[3][0]=8;
for(int y=list[0].length-1;y >= 0; y--)
{
    for(int x=list.length-2;x >= 0; x--)
    {
         list[x][y]=list[x+1][y]+y;
    }
}
for(int y=0;y < list[0].length; y++)
{
    for(int x=list.length-1;x >= 0;x--)
        System.out.print(list[x][y]+ " ");
    System.out.println();
}

    }
    
    public static void main(String[] args){
        test app = new test();
    }
}