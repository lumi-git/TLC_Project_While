public class callFunc implements instruction {
    private final String m_return;
    private final String m_name;
    private final int m_args;

    public callFunc(String a, String b, int c) {
        m_return = a;
        m_name = b;
        m_args = c;
    }

    public String toString() {
        return m_return + " = call " + m_name + " " + m_args;
    }
}

