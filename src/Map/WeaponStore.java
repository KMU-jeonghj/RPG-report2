package Map;

import Character.Hero.Hero;

import java.util.Scanner;

//공격 방어 상승
public class WeaponStore {

    Scanner input = new Scanner(System.in);

    private int powerSword = 10;
    private int defenseArmor = 10;

    public void sell(Hero hero) {
        System.out.println("potion shop");
        System.out.println("1. powerSword (120G)");
        System.out.println("2. defenseArmor (110G)");
        System.out.println("choose num : ");
        int num = input.nextInt();
        if (num == 1) {
            if (hero.getHero_money() < 120)
                System.out.println("not enough money");
            else {
                System.out.printf("power : %d(+%d)\n", hero.getHero_power(), 55);
                hero.gainPower(55);
                hero.loseMoney(120);
            }
        } else if (num == 2) {
            if (hero.getHero_money() < 110)
                System.out.println("not enough money");
            else {
                System.out.printf("defense : %d(+%d)\n", hero.getHero_defense(), 50);
                hero.gainDefense(50);
                hero.loseMoney(110);
            }
        }
    }
}
