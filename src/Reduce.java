public class Reduce {
    public static void main(String[] args) {
        int steps = 0;
        int i = 100;
        while (i > 0){
            i = i % 2 == 0 ? i / 2 : i - 1;
            steps++;
        }
        System.out.println(steps);
    }
}
