public class AnimalThread extends Thread {
    private final String name;
    private int priority;
    private int distance;

    public AnimalThread(String name, int priority) {
        this.name = name;
        this.priority = priority;
        this.distance = 0;
        setPriority(priority);
    }

    @Override
    public void run() {
        try {
            while (distance < 100) {
                distance += 10;
                System.out.println(name + " пробежал " + distance + " метров");
                Thread.sleep(100);
            }
            System.out.println(name + " финишировал!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
