package practice;

public class TeamTest {
    public static void main(String[] args) {
        // 선수 객체 생성
        Player kim = new Player("Kim", new int[] { 9, 8, 10 });
        Player lee = new Player("Lee", new int[] { 10, 9, 10 });
        Player park = new Player("Park", new int[] { 8, 10, 9 });

        Player a = new Player("a", new int[]{ 10, 9, 10});
        Player b = new Player("b", new int[]{ 8, 9, 10});
        Player c = new Player("c", new int[]{ 8, 9, 19});


        // 객체 배열 만들기
        Player[] koreaPlayers = { kim, lee, park };
        Player[] chinaPlayers = { a, b, c};

        // 팀 객체 생성
        Team korea = new Team("KOREA", koreaPlayers);
        Team china = new Team("CHINA",chinaPlayers);

        // 팀 점수 출력
        korea.printTeamPoints();
        china.printTeamPoints();
    }
}

// 팀 클래스
class Team {
    // 필드
    String nation;    // 나라
    Player[] players; // 선수들

    // 생성자
    Team (String nation, Player[] players) {
        this.nation = nation;
        this.players = players;
    }

    // 메소드
    void printTeamPoints() {
        int sum = 0;
        for (int i = 0; i < players.length; i++) {
            sum += players[i].totalPoints();
        }
        System.out.printf("%s -> %d points\n", nation, sum);
    }
}

// 선수 클래스
