package n3;

import java.util.HashMap;
import java.util.Map;
import javassist.b;
import javassist.k;

public abstract class a {
    private final String a;
    public static Map b;

    static {
        a.b = new HashMap();
    }

    // 去混淆评级： 低(20)
    public a(String s) {
        a.b.put("ce6b0fb3-ae79-4e19-a6b5-37c79061c246", this);
        this.a = "((javassist.tools.Callback) javassist.tools.Callback.callbacks.get(\"ce6b0fb3-ae79-4e19-a6b5-37c79061c246\")).result(new Object[]{" + s + "});";
    }

    public static void a(k k0, a a0) throws b {
        k0.K(a0.toString(), false);
    }

    public static void b(k k0, a a0, boolean z) throws b {
        k0.K(a0.toString(), z);
    }

    public static int c(k k0, a a0, int v) throws b {
        return k0.N(v, a0.toString());
    }

    public static void d(k k0, a a0) throws b {
        k0.P(a0.toString());
    }

    public abstract void e(Object[] arg1);

    public String f() {
        return this.a;
    }

    @Override
    public String toString() {
        return this.f();
    }
}

