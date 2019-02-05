package jp.ac.uryukyu.ie.e185745;

public class Hero extends LivingThing{
    public Hero(String name, int hitPoint, int attack, boolean dead){
        super(name ,hitPoint ,attack ,dead);
    }
    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
}


