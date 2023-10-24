import java.util.ArrayList;
import java.util.Arrays;

public class Burger extends Product {

    private static ArrayList<Burger> burgers = new ArrayList<Burger>();

    public static Burger select(int select){
        int index = select-1;

        return burgers.get(index);
    }

    public Burger(String name, String desc, double price) {//새로 생성하는 생성자
        super.setName(name);
        super.setId("burger"+burgers.size());
        super.setDesc(desc);
        super.setCount(0);
        super.setPrice(price);
        burgers.add(this);
    }



    public static void printProduct() {//메뉴 선택시 출력
        System.out.println("[ Burgers MENU ]");
        for (int i = 0; i < burgers.size(); i++) {//for문 돌면서 있으면 출력
            System.out.println((i + 1) + ". " + burgers.get(i).getName() + "   | W " + burgers.get(i).getPrice() + " | " + burgers.get(i).getDesc());
        }
    }


    public static void clear() {//count 비우는 함수
        for (Burger x : burgers) {//for문 돌면서 있으면 출력
            x.setCount(0);
        }
    }

    public static int getSize() {
        return burgers.size();
    }
}
