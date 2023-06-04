package Character.Hero;

import java.util.Scanner;

public class Warrior extends Hero{
    public Warrior(String hero_name) {
        super(hero_name);
        this.fullHp = this.hero_hp = 150;
        this.hero_power = 120;
        this.hero_defense = 100;
    }

    @Override
    public int hero_attack() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 쓰러스트");
        System.out.println("2. 파워 스트라이크");
        System.out.printf("공격 번호를 입력하세요 : ");
        int num = sc.nextInt();

        int sum = 0;

        if (num == 1) {
            sum += hero_level * 10;
            sum += hero_power * 30;
            loseMp(15);
        }
        else if (num == 2) {
            sum += hero_level * 10;
            sum += hero_power *35;
            loseMp(25);
        }
        System.out.println("데미지는 " + sum + " 입니다.");
        return sum;
    }
}
