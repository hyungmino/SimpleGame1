import java.util.Scanner;

public class Fight {

    public void fight (){
        Scanner sc = new Scanner(System.in);

        System.out.print("유저 이름을 입력하세요 : ");
        String playerName = sc.nextLine();
        Player player = new Player(playerName);

        Monster monster = new Monster("비둘기");

        label:
        while (true) {
            System.out.println("======================================================");
            System.out.println();
            System.out.println();
            System.out.print(" [ 1. 공격 ]  [ 2. 스 킬 ]  [ 3. 종 료 ] ");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.print("선택하세요 : ");
            int select = sc.nextInt();

            switch (select){
                case 1 :
                player.attack();
                monster.takeDamge();
                player.takeDamge();
                monster.attack();
                break label;
                case 2 :

                default:
                    System.out.println("잘못 선택하셨습니다.");
            }

        }

    }
}
