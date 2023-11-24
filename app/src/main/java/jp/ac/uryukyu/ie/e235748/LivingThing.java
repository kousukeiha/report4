package jp.ac.uryukyu.ie.e235748;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、敵HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param hitpoint 敵のHP
     * @param attack ヒーローの攻撃力
     */
    public LivingThing (String name, int hitPoint, int attack) {
        this.setName(name);
        this.setHitPoint(hitPoint);
        this.setAttack(attack);
        this.setDead(false);
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }

    public boolean isDead(){
        // deadの getter method
        //if(hitPoint <= 0){
            //this.dead = true;
        //}
        return this.dead;
    }

    public String getName(){
        return this.name;
    }

    public void attack(LivingThing opponent){   
        if(this.dead==false){
        int damage = (int)(Math.random() * this.attack);//変数damegeのスコープ
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", this.name, opponent.getName(), damage);
        opponent.wounded(damage);
        }   
    }

    public void wounded(int damage){
        this.hitPoint -= damage;
        if( this.hitPoint < 0 ) {
            this.dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

    public void setName(String name){this.name = name;}
    public void setHitPoint(int maximumHP){this.hitPoint = maximumHP;}
    public void setAttack(int attack){this.attack = attack;}
    public void setDead(boolean dead){
        this.dead = dead;
    }
    
    public int getHitPoint(){return this.hitPoint;}
    public int getAttack(){return this.attack;}


    
}
    

