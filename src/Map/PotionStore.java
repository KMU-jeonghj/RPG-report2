package Map;

import Character.Hero.Hero;

import java.util.Scanner;

// hp , mp 상승
public class PotionStore {

    Scanner input = new Scanner(System.in);
    private int hpPostion = 20;
    private int mpPostion = 25;

    public void sell(Hero hero) {
        System.out.println("potion shop");
        System.out.println("1. hp postion (20G)");
        System.out.println("2. mp postion (20G)");
        System.out.println("choose num : ");
        int num = input.nextInt();
        if (num == 1) {
            if (hero.getHero_money() < 20)
                System.out.println("not enough money");
            else {
                System.out.printf("hp : %d(+%d)\n", hero.getHero_hp(), 20);
                hero.gainHp(20);
                hero.loseMoney(20);
            }
        } else if (num == 2) {
            if (hero.getHero_money() < 25)
                System.out.println("not enough money");
            else {
                System.out.printf("mp : %d(+%d)\n", hero.getHero_mp(), 25);
                hero.gainMp(25);
                hero.loseMoney(25);
            }
        }
    }

}
