package data_strcutures;

import java.util.*;

public class QueueUsingStack {

    public static void main(String[] args) {

        Queue<Integer> obj = new Queue<>();

        obj.enqueue(25);
        obj.enqueue(96);
        obj.enqueue(20);

        System.out.println(obj.peek());
        System.out.println(obj.dequeue());
        System.out.println(obj.peek());
    }
}

class Queue<T> {

    Stack<T> st = new Stack<>();
    Stack<T> st2 = new Stack<>();

    public void enqueue(T data) {
        st.push(data);
    }

    public T peek() {

        if (st.isEmpty()) {
            return null;
        }

        while (!st.isEmpty()) {
            st2.push(st.pop());
        }

        T ans = st2.peek();

        while (!st2.isEmpty()) {
            st.push(st2.pop());
        }

        return ans;
    }

    public T dequeue() {

        if (st.isEmpty()) {
            return null;
        }

        while (!st.isEmpty()) {
            st2.push(st.pop());
        }

        T ans = st2.pop();

        while (!st2.isEmpty()) {
            st.push(st2.pop());
        }

        return ans;
    }
}
