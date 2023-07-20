public class Monster extends Fight implements Skill {
    private String name;
    private int health;

    public Monster(String name) {
        this.name = name;
    }

    public Monster(String name, int health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public void attack() {
        System.out.println(name + " 가 공격합니다.");
    }

    void takeDamge(){
        int playerDamage = (int)(Math.random() * 3 + 7);
        health -= playerDamage;
        if(health > 0){
            System.out.println(name + " 의 체력 : " + health);
        }else {
            System.out.println(name + " 체력 : 0");
            System.out.println(name + "이(가) 사망했습니다.");
        }

    }
}

