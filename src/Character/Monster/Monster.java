package Character.Monster;

public class Monster {

    protected String monster_name;

    protected int monster_hp, fullHp, fullMp, monster_defense, monster_power, monster_mp, monster_level, monster_experience, monster_money;

    //생성자는 디폴트


    public String getMonster_name() {
        return monster_name;
    }

    public int getFullHp() {
        return fullHp;
    }

    public int getMonster_hp() {
        return monster_hp;
    }

    public int getFullMp() {
        return fullMp;
    }

    public int getMonster_defense() {
        return monster_defense;
    }

    public int getMonster_experience() {
        return monster_experience;
    }

    public int getMonster_level() {
        return monster_level;
    }

    public int getMonster_money() {
        return monster_money;
    }

    public int getMonster_mp() {
        return monster_mp;
    }

    public int getMonster_power() {
        return monster_power;
    }

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


}
