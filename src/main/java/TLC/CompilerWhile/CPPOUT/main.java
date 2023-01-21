package TLC.CompilerWhile.CPPOUT;

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
        if (map.get("SYM_1").equals("SYM_1")) {
            map.put("SYM_2", map.get("SYM_1"));
        } else {
            map.put("SYM_2", new node());
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

    public static void addArbres(node SYM_8, node SYM_9) {
        map.put("SYM_8", SYM_8);
        map.put("SYM_9", SYM_9);
        map.put("SYM_10", node.Cons(map.get("SYM_8"), map.get("SYM_9")));
        stack.push(map.get("SYM_10"));
    }

    public static void main(String[] args) {
        map.put("NULL", new node());
        map.put("SYM_12", node.Cons(node.Cons(node.Cons(node.Cons(new node(), new node()), new node()), new node()), new node()));
        Logger.log(map.get("SYM_12") + "");
        for (int i_1 = 0; i_1 < map.get("SYM_12").toInt(); i_1++) {
            for (int i_2 = 0; i_2 < map.get("SYM_12").toInt(); i_2++) {
                map.put("SYM_13", node.newFromList(Arrays.asList(map.get("SYM_13"))));
                Logger.log(map.get("SYM_13") + "");
            }
        }
        map.put("SYM_14", node.Cons(map.get("SYM_12"), map.get("SYM_12")));
        Logger.log(map.get("SYM_14") + "");
        while (map.get("SYM_14").isNotEmpty()) {
            map.put("SYM_14", new node());
        }
        stack.push(map.get("SYM_14"));
    }
}
