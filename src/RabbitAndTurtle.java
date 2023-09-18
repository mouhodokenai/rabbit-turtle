public class RabbitAndTurtle {
    public static void main(String[] args) {
        AnimalThread rabbit = new AnimalThread("Заяц", Thread.MAX_PRIORITY);
        AnimalThread turtle = new AnimalThread("Черепаха", Thread.MIN_PRIORITY);

        rabbit.start();
        turtle.start();
    }
}
