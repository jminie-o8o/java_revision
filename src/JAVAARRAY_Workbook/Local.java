package JAVAARRAY_Workbook;

import java.util.ArrayList;

public class Local {
    public static void main(String[] args) {
        // 배열 생성
        City Seoul = new City("서울" ,599);
        City Busan = new City("부산" ,51);
        City Incheon = new City("인천" ,46);
        City Daejeon = new City("대전" ,43);
        City Daegu = new City("대구" ,27);

        ArrayList<City> cities = new ArrayList<>();
        cities.add(Seoul);
        cities.add(Busan);
        cities.add(Incheon);
        cities.add(Daejeon);
        cities.add(Daegu);
        for (int i = 0; i < cities.size(); i++) {
            System.out.printf("%s: %d 명\n", cities.get(i).city, cities.get(i).visitors);
        }
    }
}

class City{
    String city;
    int visitors;

    public City(String city, int visitors) {
        this.city = city;
        this.visitors = visitors;
    }
}
