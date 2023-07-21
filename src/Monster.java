import java.util.Scanner;

public class Monster extends Fight implements Skill {
    Scanner sc = new Scanner(System.in);
    private String name;
    public int health;
    public static int monsterDamage;


    public Monster(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public Monster(int monsterDamage) {
        this.monsterDamage = monsterDamage;
    }

    @Override
    public void attack() {
        System.out.println(" ");
        System.out.println("\'" + name + "\'가 [ "+ monsterDamage + " ]의 데미지로 반격합니다!");
    }


    void takeDamge() {
        health -= Player.playerDamage;
        if (health > 0) {
            System.out.println("\'" + name + "\'의 남은 체력 [ " + health + " ]");
        } else{
            this.health = 0;
            System.out.println("\'" + this.name + "\'의 남은 체력 [ " + this.health + " ]");
            System.out.println("\'" + this.name + "\'를 퇴치했습니다.");
            System.out.println(" ");
            System.out.println("축하합니다! 클리어 하셨습니다.");
        }

    }
}