import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    Fight fight = new Fight();

        public void Main(){
            label:
            while (true) {
                System.out.println("======================================================");
                System.out.println();
                System.out.println();
                System.out.print(" [ 1. 시 작 ]  [ 2. 종 료 ] ");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.print("선택하세요 : ");
                int select = sc.nextInt();
                System.out.println(" ");
                System.out.println(" ");
                switch (select) {
                    case 1:
                        fight.fight();
                        break label;
                    case 2:
                        System.out.println("게임을 종료합니다.");
                        break label;
                    default:
                        System.out.println("잘못 선택하셨습니다.");
                }
            }
        }
    }
