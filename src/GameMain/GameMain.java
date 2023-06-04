package GameMain;

import Character.Monster.*;
import Map.*;
import Character.Hero.*;

import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Racoon racoon = new Racoon();
        WildDog wildDog = new WildDog();
        WildCat wildCat = new WildCat();
        Tiger tiger = new Tiger();

        PotionStore potionStore = new PotionStore();
        WeaponStore weaponStore = new WeaponStore();



        Scanner input = new Scanner(System.in);
        System.out.println("*******RPG GAME*******");

        System.out.printf("영웅의 이름을 입력하세요. : ");
        String name = input.next();
        Hero hero = new Hero(name);


        System.out.println("1. 전사");
        System.out.println("2. 궁수");
        System.out.println("3. 마법사");
        System.out.println("4. 호진");
        System.out.printf("직업의 번호를 입력하세요. : ");
        int num = input.nextInt();

        if (num == 1) {
            System.out.println("전사가 선택되었습니다.");
            hero = new Warrior(name);
        }
        else if (num == 2) {
            System.out.println("궁수가 선택되었습니다.");
            hero = new Archer(name);
        }
        else if (num == 3) {
            System.out.println("마법사가 선택되었습니다.");
            hero = new Wizzard(name);
        }
        else if (num == 4) {
            System.out.println("호진이 선택되었습니다.");
            hero = new Hojin(name);
        }




        System.out.println("게임에 입장하였습니다.");

        while (true) {
            hero.showStatus();
            System.out.println("1. 사냥터");
            System.out.println("2. 포션 상점");
            System.out.println("3. 무기 상점");
            System.out.printf("입장할 장소를 입력하세요. : ");
            num = input.nextInt();

            switch (num) {
                case 1-> {
                    Monster monster = new Monster();
                    System.out.println("1. 너구리");
                    System.out.println("2. 들개");
                    System.out.println("3. 살쾡이");
                    System.out.println("4. 호랑이");
                    System.out.printf("싸울 몬스터를 선택하세요. : ");
                    num = input.nextInt();
                    switch (num) {
                        case 1-> monster = new Racoon();
                        case 2-> monster = new WildDog();
                        case 3-> monster = new WildCat();
                        case 4 -> monster = new Tiger();
                    }
                    //전투 반복문
                    System.out.println(monster.getMonster_name()+" 과 전투시작");
                    while (true) {
                        System.out.println(hero.getHero_name() + "의 공격입니다.");
                        monster.monster_attacked(hero.hero_attack());

                        if (monster.getMonster_hp() <= 0) {

                            System.out.println(monster.getMonster_name() + "가 죽었습니다.");
                            hero.gainExp(monster.getMonster_experience());
                            hero.gainMoney(monster.getMonster_money());
                            hero.levelUP();
                            break;
                        }

                        System.out.println(monster.getMonster_name() + "의 공격입니다.");
                        hero.hero_attacked(monster.monster_attack());

                        if (hero.getHero_hp() <= 0) {

                            System.out.println(hero.getHero_name() + "이 죽었습니다.");
                            hero.setHero_hp(1);
                            System.out.println(hero.getHero_name() + "이 체력 1으로 부활했습니다.");
                            break;
                        }
                    }

                }
                case 2-> {
                    potionStore.sell(hero);
                }
                case 3-> {
                    weaponStore.sell(hero);
                }
            }


        }
    }
}
