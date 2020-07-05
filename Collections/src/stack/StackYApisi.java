package stack;

import java.util.Stack;

public class StackYApisi {
    public static void main(String[] args) {

        Stack st = new Stack();
        st.push(0);
        st.push(1);
        st.push(2);
        System.out.println(st);

        for (int i = -1; i <= st.size(); i++) {
            System.out.println(st.pop());
        }

    }
}
