package TLC.CompilerWhile.ThreeAC;

public class param implements instruction {
    private final String m_a;

    public param(String a) {
        m_a = a;
    }

    public String getParam() {
        return m_a;
    }

    public String toString() {
        return "param " + m_a;
    }
}
