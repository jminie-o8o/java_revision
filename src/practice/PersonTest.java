package practice;

public class PersonTest {
    public static void main(String[] args) {
        // 객체 생성
        Person park = new Person("홍팍", "010-1234-5678");

        /* 1. 게터를 호출하여 필드값을 얻으시오. */
        System.out.printf("이 름: %s\n", park.getName());
        System.out.printf("연락처: %s\n", park.getPhoneNumber());
    }
}

class Person {
    // 필드
    private String name;
    private String phoneNumber;

    // 생성자
    public Person(String n, String p) {
        name = n;
        phoneNumber = p;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
