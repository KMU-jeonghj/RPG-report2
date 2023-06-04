package Character.Hero;

import java.util.Scanner;

public class Hero {

    protected String hero_name;
    protected int hero_level, hero_power, hero_hp, fullHp, fullMp, hero_defense, hero_mp, hero_experience, hero_money;


    //생성자
    public Hero(String hero_name) {
        this.hero_name = hero_name;
        this.hero_level = 1;
        this.hero_experience = 0;
        this. hero_money = 0;
        this.fullMp = this.hero_mp = 100;
    }


    //설정자
    public void setHero_name(String hero_name) {
        this.hero_name = hero_name;
    }

    public void setHero_level(int hero_level) {
        this.hero_level = hero_level;
    }

    public void setHero_power(int hero_power) {
        this.hero_power = hero_power;
    }

    public void setHero_hp(int hero_hp) {
        this.hero_hp = hero_hp;
    }

    public void setHero_defense(int hero_defense) {
        this.hero_defense = hero_defense;
    }

    public void setHero_mp(int hero_mp) {
        this.hero_mp = hero_mp;
    }

    public void setHero_experience(int hero_experience) {
        this.hero_experience = hero_experience;
    }

    public void setHero_money(int hero_money) {
        this.hero_money = hero_money;
    }

    public void setFullHp(int fullHp) {
        this.fullHp = fullHp;
    }

    public void setFullMp(int fullMp) {
        this.fullMp = fullMp;
    }

    public void loseMp(int mp) {
        this.hero_mp -= mp;
        if (this.hero_mp < 0)
            this.hero_mp = 0;
    }

    public void gainMp(int mp) {
        this.hero_mp += mp;
        if (this.hero_mp > fullMp) {
            this.hero_mp = this.fullMp;
        }
    }

    public void loseHp(int hp) {
        this.hero_hp -= hp;
        if (this.hero_hp < 0) {
            this.hero_hp = 0;
        }
    }

    public void gainHp(int hp) {
        this.hero_hp += hp;
        if (this.hero_hp > fullHp) {
            this.hero_hp = this.fullHp;
        }
    }

    public void gainMoney(int hero_money) {
        this.hero_money += hero_money;
    }

    public void loseMoney(int hero_money) {
        this.hero_money -= hero_money;
        if (this.hero_money < 0) {
            this.hero_money = 0;
        }
    }

    public void gainPower(int hero_power) {
        this.hero_power += hero_power;
    }

    public void gainDefense(int hero_defense) {
        this.hero_defense += hero_defense;
    }

    public void gainExp(int exp) {
        this.hero_experience += exp;
    }

    //-------------------------------------------

    //접근자


    public String getHero_name() {
        return hero_name;
    }

    public int getHero_level() {
        return hero_level;
    }

    public int getHero_hp() {
        return hero_hp;
    }

    public int getFullMp() {
        return fullMp;
    }
    public int getFullHp() {
        return fullHp;
    }

    public int getHero_power() {
        return hero_power;
    }

    public int getHero_mp() {
        return hero_mp;
    }

    public int getHero_defense() {
        return hero_defense;
    }

    public int getHero_experience() {
        return hero_experience;
    }

    public int getHero_money() {
        return hero_money;
    }

    //--------------------------

    //공격 메소드
    public int hero_attack() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 쓰러스트");
        System.out.printf("공격 번호를 입력하세요 : ");
        int num = sc.nextInt();

        int sum = 0;

        if (num == 1) {

            sum += hero_level * 10;
            sum += hero_power * 30;
        }
        System.out.println("데미지는 " + sum + " 입니다.");
        return sum;
    }

    public void hero_attacked(int sum) {

        if (hero_defense >= sum) {
            hero_hp = hero_hp - 0;
        } else {
            hero_hp = hero_hp + hero_defense - sum;
        }
    }

    public void levelUP() {
        if (hero_experience >= hero_level * 80) {
            hero_level += 1;
            System.out.println(hero_name + "의 레벨이" + hero_level + "이 되었습니다.");
            hero_money += hero_level * 50;
            System.out.println("레밸업 기념으로 돈이 " + hero_level * 50 + "원 증가하여 ");
            System.out.println(hero_money + "원이 되었습니다.");
            hero_experience = 0;
        }
    }

    public void showStatus() {
        System.out.println("*********************");
        System.out.println("현재  Hero 의 이름 : " + hero_name);
        System.out.println("현재 " + hero_name + "의 레벨 : " + hero_level);
        System.out.println("현재 " + hero_name + "의 힘 : " + hero_power);
        System.out.println("현재 " + hero_name + "의 방어력 : " + hero_defense);
        System.out.println("현재 " + hero_name + "의 HP : " + hero_hp);
        System.out.println("현재 " + hero_name + "의 MP : " + hero_mp);
        System.out.println("현재 " + hero_name + "의 경험치 : " + hero_experience);
        System.out.println("현재 " + hero_name + "의 돈 : " + hero_money + "원");
        System.out.println("*********************");
    }




}
