package Character.Monster;

public class Monster {

    protected String monster_name;

    protected int monster_hp, monster_defense, monster_power, monster_mp, monster_level, monster_experience, monster_money;

    //생성자는 디폴트

    public int monster_attack() {
        System.out.println("데미지는 " + monster_power + " 입니다.");
        return monster_power;

    }

    public void monster_attacked(int sum) {

        if (monster_defense >= sum) {
            monster_hp = monster_hp - 0;
        } else {
            monster_hp = monster_hp + monster_defense - sum;
        }
    }

    public int skill() {
        return 0;
    }
}
