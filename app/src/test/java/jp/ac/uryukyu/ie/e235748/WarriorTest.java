package jp.ac.uryukyu.ie.e235748;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest{

    @Test
    void attackWithWeponSkill(){
        int attack = 100;
        Warrior demoWarrior = new Warrior("デモ戦士",10, attack);
        Enemy slime = new Enemy("スライムもどき", 10, 100);

        for(int i = 0; i < 3; i ++){
            //3回実行するため
            int nowEnemyHp = slime.getHitPoint();
            demoWarrior.attackWithWeponSkill(slime);
            slime.attack(demoWarrior);
            assertEquals(nowEnemyHp - attack*1.5, slime.getHitPoint());
        }
       
    }
}
