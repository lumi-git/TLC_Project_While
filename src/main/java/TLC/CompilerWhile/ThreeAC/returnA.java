package TLC.CompilerWhile.ThreeAC;

public class returnA implements instruction {
    private final String m_return;

    public returnA(String a) {
        m_return = a;
    }

    public String toString() {
        return "return " + m_return;
    }
}
