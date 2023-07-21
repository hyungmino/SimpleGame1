import java.util.Scanner;

public class Fight {

    public void fight (){
        Scanner sc = new Scanner(System.in);
        Player player = new Player("용사",70);
        Monster monster = new Monster("겁먹은 비둘기",100);

        boolean onOff = true;
        rabel:
        while (onOff) {
            System.out.println("======================================================");
            System.out.println();
            System.out.print(" [ 1.공격하기 ]  [ 2.침바르기 ]  [ 3.째려보기 ] ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.print("선택하세요 : ");
            int select = sc.nextInt();
            Monster monster1 = new Monster((int)(Math.random()*3+7));
            Player prayer1 = new Player((int)(Math.random()*5+11));
            switch (select){
                case 1 :
                    player.attack();
                    monster.takeDamge();
                    if(monster.health<=0){
                        break rabel;
                    }
                    monster.attack();
                    player.takeDamge();
                    if(player.health<=0){
                        break rabel;
                    }
                    break;
                case 2 :
                    System.out.println(" ");
                    System.out.println("결제가 필요합니다.");
                    System.out.println(" ");
                    break;
                case 3 :
                    System.out.println(" ");
                    System.out.println("다음 패치에 추가 예정");
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("잘못 선택하셨습니다.");
            }

        }

    }
}