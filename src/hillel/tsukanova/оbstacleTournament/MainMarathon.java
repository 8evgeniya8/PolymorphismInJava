package hillel.tsukanova.оbstacleTournament;

public class MainMarathon {
    public static void main(String[]args) {
        Participant human = new Participant("Скайвокер", 100);
        Participant cat = new Participant("Йода", 200);
        Participant robot = new Participant("R2-D2", 90);

        int treadmillDistance = 100;
        int wallHeight = 100;

        if (human.canPassTreadmill(treadmillDistance)) {
            human.run(treadmillDistance);
            if (human.canPassWall(wallHeight)) {
                human.jump(wallHeight);
                System.out.println(human.name+" Людина подолала обидві перешкоди");
            } else {
                System.out.println("Перешкода стіна. Не вистачає енергії. Людина вибула.");
            }
        } else {
            System.out.println("Перешкода біг. Не вистачає енергії. Людина вибула.");
        }

        System.out.println();
        if (cat.canPassTreadmill(treadmillDistance)) {
            cat.run(treadmillDistance);
            if (cat.canPassWall(wallHeight)) {
                cat.jump(wallHeight);
                System.out.println(cat.name+" Кіт подолав обидві перешкоди.");
            } else {
                System.out.println("Перешкода стіна. Не вистачає енергії. Кіт вибув.");
            }
        } else {
            System.out.println("Перешкода біг. Не вистачає енергії. Кіт вибув.");
        }

        System.out.println();
        if (robot.canPassTreadmill(treadmillDistance)) {
            robot.run(treadmillDistance);
            if (robot.canPassWall(wallHeight)) {
                robot.jump(wallHeight);
                System.out.println(robot.name+" Робот пройшов обидві перешкоди.");
            } else {
                System.out.println("Перешкода стіна. Не вистачає енергії. Робот вибув.");
            }
        } else {
            System.out.println("Перешкода біг. Не вистачає енергії. Робот вибув.");
        }
    }
}
