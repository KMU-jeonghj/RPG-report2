package Character.Hero;

import java.util.Scanner;

public class Hojin extends Hero {
    public Hojin(String hero_name) {
        super(hero_name);
        this.fullHp = this.hero_hp = 500;
        this.hero_power = 500;
        this.hero_defense = 500;
    }


    @Override
    public int hero_attack() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 쓰러스트");
        System.out.printf("공격 번호를 입력하세요 : ");
        int num = sc.nextInt();

        int sum = 0;

        if (num == 1) {
            sum = 999999;
        }
        System.out.println("데미지는 " + sum + " 입니다.");
        return sum;
    }
}
