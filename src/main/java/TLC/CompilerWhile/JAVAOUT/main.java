package TLC.CompilerWhile.JAVAOUT;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class main {
    static Deque<node> stack = new ArrayDeque<>();
    static Map<String, node> map = new HashMap<>();

    public static void not(node SYM_1) {
        map.put("SYM_1", SYM_1);
        if (map.get("SYM_1").isNotEmpty()) {
            map.put("SYM_2", new node());
        } else {
            map.put("SYM_2", node.Cons(new node(), new node()));
        }
        stack.push(map.get("SYM_2"));
    }

    public static void stdlibtestADD(node SYM_4, node SYM_5) {
        map.put("SYM_4", SYM_4);
        map.put("SYM_5", SYM_5);
        if (map.get("SYM_4").isNotEmpty()) {
            map.put("SYM_6", new node());
        } else {
            map.put("SYM_6", new node());
        }
        stack.push(map.get("SYM_6"));
    }

    public static void foo(node SYM_8, node SYM_9) {
        map.put("SYM_8", SYM_8);
        map.put("SYM_9", SYM_9);
        map.put("SYM_10", new node());
        map.put("SYM_11", node.Cons(map.get("SYM_8"), map.get("SYM_9")));
        map.put("SYM_12", node.Cons(map.get("SYM_9"), map.get("SYM_8")));
        stack.push(map.get("SYM_11"));
        stack.push(map.get("SYM_12"));
    }

    public static void main(String[] args) {
        map.put("NULL", new node());
        map.put("SYM_14", new node());
        map.put("SYM_15", new node());
        foo(map.get("SYM_14"), map.get("SYM_15"));
        map.put("SYM_16", stack.pop());
        map.put("SYM_17", stack.pop());
        stack.push(map.get("SYM_14"));
    }
}
