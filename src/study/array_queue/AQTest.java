package study.array_queue;

public class AQTest {
    public static void main(String[] args) {
        ArrayQueue aq = new ArrayQueue();
        aq.add(1);
        aq.add(2);
        aq.add(3);
        aq.add(4);
        aq.add(5);
        aq.add(6);
        aq.add(7);
        aq.add(8);
        aq.add(9);
        aq.add(10);
        aq.add(11);
        aq.add(12);
        aq.add(13);
        aq.add(14);
        aq.add(15);
        aq.add(16);
        aq.add(17);
        aq.add(18);
        aq.add(19);
        aq.add(20);
        aq.add(21);
        aq.add(22);
        for (int i = 0; i < 10; i++) {
            aq.pop();
        }

        System.out.println(aq.toString());
    }
}
