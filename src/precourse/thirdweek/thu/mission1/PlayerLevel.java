package precourse.thirdweek.thu.mission1;

public abstract class PlayerLevel {
    int level;
    public abstract void jump();

    public abstract void run();

    public abstract void turn();

    public abstract void showLevelMessage();

    public void play(int time) {
        run();
        for (int i = 0; i < time; i++) {
            jump();
        }
        turn();
    }

    public void upgradeLevel(int level) {
        this.level = level;
    }
}