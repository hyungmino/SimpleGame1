public class Player extends Fight implements Skill{
    private String name;
    private int health;

    public Player(String name) {
        this.name = name;
        this.health = 100;
    }

    public Player() {

    }

    @Override
    public void attack(){
        System.out.println(name + " 가 공격합니다.");
    }

    void takeDamge(){
        int monsterDamage = (int)(Math.random() * 3 + 7);
        health -= monsterDamage;
        if(health > 0){
            System.out.println(name + " 의 체력 : " + health);
        }else {
            System.out.println(name + "이(가) 사망했습니다.");
        }

    }




}
