package precourse.thirdweek.thu.mission1;

public class MainBoard {

    public static void main(String[] args) {

        Player player = new Player();
        player.play(1);

        PlayerLv2 advancedLevel = new PlayerLv2();
        player.upgradeLevel(advancedLevel);
        player.play(2);

        PlayerLv3 specialLevel = new PlayerLv3();
        player.upgradeLevel(specialLevel);
        player.play(3);

    }

}
