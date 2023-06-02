package Character.Hero;

import java.util.Scanner;

public class Hero {

    protected String hero_name;
    protected int hero_level, hero_power, hero_hp, hero_defense, hero_mp, hero_experience, hero_money;


    //생성자
    public Hero(String hero_name) {
        this.hero_name = hero_name;
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

    public int skill() {
        return 0;
    }



}
