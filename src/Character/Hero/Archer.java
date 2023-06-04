package Character.Hero;

import java.util.Scanner;

public class Archer extends Hero {
    public Archer(String hero_name) {
        super(hero_name);
        this.fullHp = this.hero_hp = 110;
        this.hero_power = 110;
        this.hero_defense = 90;
    }

    @Override
    public int hero_attack() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 핀포인트");
        System.out.println("2. 불화살");
        System.out.printf("공격 번호를 입력하세요 : ");
        int num = sc.nextInt();

        int sum = 0;

        if (num == 1) {
            sum += hero_level * 10;
            sum += hero_power * 60;
            loseMp(10);
        }
        else if (num == 2) {
            sum += hero_level * 10;
            sum += hero_power *65;
            loseMp(15);
        }
        System.out.println("데미지는 " + sum + " 입니다.");
        return sum;
    }


}
