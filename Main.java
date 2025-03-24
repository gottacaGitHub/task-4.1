public class Main {
    public static void main(String[] args) {
        Learner student = new StudentWithClock(new StudentWithTimer(new Student()));
        student.learn();
    }
}
