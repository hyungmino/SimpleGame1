import java.util.Scanner;

public class Player extends Fight implements Skill{
    Scanner sc = new Scanner(System.in);
    public int health;
    private String name;
    public static int playerDamage;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public Player(int playerDamage){
        this.playerDamage=playerDamage;
    }

    @Override
    public void attack(){
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("\'"+name+"\'가 [ "+playerDamage+" ] 의 데미지로 공격합니다. ");
    }

    public void takeDamge() {
        health -= Monster.monsterDamage;
        if (health > 0) {
            System.out.println("\'" + name + "\'의 남은 체력 [ " + health + " ]");
            System.out.println(" ");
        } else {
            this.health = 0;
            System.out.println("\'" + name + "\'의 남은 체력 [ " + this.health + " ]");
            System.out.println("\'" + name + "\'가 사망했습니다.");
            System.out.println(" ");
            System.out.println("클리어 실패! 재도전 하시겠습니까?");
            System.out.println(" ");
            System.out.println("[1.다시한다] [2.종료]");
            System.out.println(" ");
            System.out.print("선택하세요 : ");
            int reGame = sc.nextInt();
            if(reGame==1){
                Fight fight = new Fight();
                fight.fight();
            }else {
                System.out.println("게임을 종료합니다.");
            }
        }
    }
}