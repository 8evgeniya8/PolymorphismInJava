package hillel.tsukanova.оbstacleTournament;

class Participant {
    String name;
    int energy;

    public Participant(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public boolean canPassTreadmill(int distance) {
        return energy >= distance;
    }

    public boolean canPassWall(int height) {
        return energy >= height;
    }

    public void run(int distance) {
        energy -= distance;
        System.out.println(name + " долає перешкоду \"Біг\" з дистанцією в "
                + distance + " метрів. Залишок енергії: " + energy);
    }

    public void jump(int height) {
        energy -= height;
        System.out.println(name + "  долає перешкоду \"Стіна\" з висотою в "
                + height + " метрів. Залишок енергії: " + energy);
    }
}
