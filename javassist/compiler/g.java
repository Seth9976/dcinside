package javassist.compiler;

import java.util.HashMap;

public final class g extends HashMap {
    private static final long a = 1L;

    public void a(String s, int v) {
        this.put(s, v);
    }

    // 去混淆评级： 低(20)
    public int b(String s) {
        return this.containsKey(s) ? ((int)(((Integer)this.get(s)))) : -1;
    }
}

