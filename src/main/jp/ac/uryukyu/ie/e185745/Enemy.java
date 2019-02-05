package jp.ac.uryukyu.ie.e185745;

public class Enemy extends LivingThing {
    public Enemy(String name, int hitPoint, int attack, boolean dead){
        super(name ,hitPoint ,attack , dead);
    }
    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }
}