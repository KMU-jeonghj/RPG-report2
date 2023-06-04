package Character.Hero;

import java.util.Scanner;

public class Wizzard extends Hero{
    public Wizzard(String hero_name) {
        super(hero_name);
        this.fullHp = this.hero_hp = 100;
        this.hero_power = 70;
        this.hero_defense = 55;
    }

    @Override
    public int hero_attack() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 파이어볼");
        System.out.println("2. 스파크");
        System.out.printf("공격 번호를 입력하세요 : ");
        int num = sc.nextInt();

        int sum = 0;

        if (num == 1) {
            sum += hero_level * 10;
            sum += hero_power * 30;
            sum += 150;
            loseMp(5);
        }
        else if (num == 2) {
            sum += hero_level * 10;
            sum += hero_power *35;
            sum += 220;
            loseMp(15);
        }
        System.out.println("데미지는 " + sum + " 입니다.");
        return sum;
    }


}
