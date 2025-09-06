package g3;

import io.realm.transformer.k;
import kotlin.jvm.internal.L;
import kotlin.text.f;
import y4.l;
import z3.g;

@g
public final class c {
    @l
    private final String a;

    private c(String s) {
        this.a = s;
    }

    @l
    public static final String a(String s) {
        byte[] arr_b = s.getBytes(f.b);
        L.o(arr_b, "this as java.lang.String).getBytes(charset)");
        String s1 = k.b(k.d(arr_b));
        L.o(s1, "hexStringify(Utils.sha256Hash(idBytes))");
        return s1;
    }

    public static final c b(String s) {
        return new c(s);
    }

    @l
    public static String c(@l String s) {
        L.p(s, "id");
        return s;
    }

    // 去混淆评级： 低(20)
    public static boolean d(String s, Object object0) {
        return object0 instanceof c ? L.g(s, ((c)object0).i()) : false;
    }

    public static final boolean e(String s, String s1) {
        return L.g(s, s1);
    }

    @Override
    public boolean equals(Object object0) {
        return c.d(this.a, object0);
    }

    @l
    public final String f() {
        return this.a;
    }

    public static int g(String s) {
        return s.hashCode();
    }

    public static String h(String s) [...] // Inlined contents

    @Override
    public int hashCode() {
        return c.g(this.a);
    }

    public final String i() {
        return this.a;
    }

    @Override
    public String toString() {
        return "PublicAppId(id=" + this.a + ")";
    }
}

