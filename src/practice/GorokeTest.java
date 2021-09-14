package practice;

public class GorokeTest {
    public static void main(String[] args) {
        /* 1. TOP 3 고로케를 고로케 타입의 객체로 만드세요. */
        Goroke pizza = new Goroke("피자", 1000);
        Goroke vegetable = new Goroke("야채", 800);
        Goroke redbean = new Goroke("팥", 500);


        /* 2. 고로케 정보를 출력하세요. */
        System.out.println(pizza.str());
        System.out.println(vegetable.str());
        System.out.println(redbean.str());
    }
}

class Goroke {
    // 필드
    String name;
    int price;

    // 생성자
    Goroke(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 메소드
    String str() {
        return String.format("practice.Goroke { name: %s, price: %d원 }", name, price);
    }
}
