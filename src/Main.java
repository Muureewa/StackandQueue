import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

// Name: Murad Mohammed
// Date: 03/06/2023
// Project: Stack and Queue

public class Main {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<Integer>();
        s.push(2);
        s.push(8);
        s.push(3);
        s.push(19);
        s.push(7);
        s.push(3);
        s.push(2);
        s.push(3);
        s.push(2);
        s.push(7);
        s.push(12);
        s.push(-8);
        s.push(4);
        int n = removeMin(s);
        System.out.println(n); // -8
        System.out.println(s); // [2, 8, 3, 19, 7, 3, 2, 3, 2, 7, 12, 4]
        n = removeMin(s);
        System.out.println(n); // 2
        System.out.println(s); // [8, 3, 19, 7, 3, 3, 7, 12, 4]


        s.push(-3);
        s.push(5);
        s.push(2);
        s.push(-1);
        s.push(0);
        s.push(-4);
        System.out.println(s); // [-3, 5, 2, -1, 0, -4]
        split(s);
        System.out.println(s); // [5, 2, 0, -3, -1, -4]

        s.push(3);
        s.push(7);
        s.push(1);
        s.push(14);
        s.push(9);
        System.out.println(s); // [3, 7, 1, 14, 9]
        expand(s);
        System.out.println(s); // [3, 3, 7, 7, 1, 1, 14, 14, 9, 9]

    }

    public static int removeMin(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<Integer>();
        int min = s.peek();
        int count = 0;

        while (!s.isEmpty()) {
            int value = s.pop();
            if (value < min) {
                min = value;
                count = 1;
            } else if (value == min) {
                count++;
            }
            q.add(value);
        }

        while (!q.isEmpty()) {
            int value = q.remove();
            if (value != min) {
                s.push(value);
            } else if (count > 1) {
                count--;
            } else {
                break;
            }
        }

        return min;
    }

    public static void split(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<Integer>();
        int size = s.size();
        for (int i = 0; i < size; i++) {
            int value = s.pop();
            if (value >= 0) {
                s.push(value);
            } else {
                q.add(value);
            }
        }

        while (!q.isEmpty()) {
            s.push(q.remove());
        }
    }

    public static void expand(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<Integer>();
        int size = s.size();

        for (int i = 0; i < size; i++) {
            int value = s.pop();
            q.add(value);
            q.add(value);
        }

        while (!q.isEmpty()) {
            s.push(q.remove());
        }
    }

}