package javassist.tools.reflect;

import java.lang.reflect.InvocationTargetException;

public class b extends RuntimeException {
    private Throwable a;
    private static final long b = 1L;

    public b(ClassNotFoundException classNotFoundException0) {
        super("by " + classNotFoundException0.toString());
        this.a = classNotFoundException0;
    }

    public b(IllegalAccessException illegalAccessException0) {
        super("by " + illegalAccessException0.toString());
        this.a = illegalAccessException0;
    }

    public b(String s) {
        super(s);
        this.a = null;
    }

    public b(InvocationTargetException invocationTargetException0) {
        super("by " + invocationTargetException0.getTargetException().toString());
        this.a = invocationTargetException0.getTargetException();
    }

    public Throwable a() {
        return this.a;
    }
}

