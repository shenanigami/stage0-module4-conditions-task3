package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month > 12 || month < 1) {
            System.out.println("wrong number!");
        } else if (month >= 9) {
            System.out.println("Fall");
        } else if (month >= 6) {
            System.out.println("Summer");
        } else if (month >= 3) {
            System.out.println("Spring");
        } else {
            System.out.println("Winter");
        }
    }
}
