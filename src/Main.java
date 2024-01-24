public class Main {
    public static void main(String[] args){
        int position1=0;
        int dievalue =0;
        Player p1 = new Player(position1);
        p1.dieValue= (int) (Math.random()*10%6) +1;
         dievalue += p1.dieValue;
        p1.currentPosition=position1;
        System.out.println("Position of the player 1: "+ p1.currentPosition + "  and die rolled value is:" + dievalue );


    }
}