package javassist;

import java.util.HashMap;
import javassist.bytecode.w;

public class d extends HashMap {
    private d a;
    private static final long b = 1L;

    public d() {
        this.a = null;
    }

    d(d d0) {
        this.a = d0;
    }

    public void a(String s) {
        String s1 = d.j(s);
        super.put(s1, s1);
    }

    public void b(l l0) {
        this.a(l0.X());
    }

    public String c(Object object0) {
        String s = (String)super.get(object0);
        if(s == null) {
            return this.a == null ? null : this.a.c(object0);
        }
        return s;
    }

    public String d(String s, String s1) {
        if(s == s1) {
            return s;
        }
        String s2 = d.j(s);
        String s3 = this.c(s2);
        return s3 == null || !s3.equals(s2) ? ((String)super.put(s2, d.j(s1))) : s3;
    }

    public void e(l l0, l l1) {
        this.d(l0.X(), l1.X());
    }

    protected final String f(String s, String s1) {
        return (String)super.put(s, s1);
    }

    public void g(String s, String s1) {
        if(s == s1) {
            return;
        }
        String s2 = d.j(s);
        if(this.c(s2) == null) {
            super.put(s2, d.j(s1));
        }
    }

    @Override
    public Object get(Object object0) {
        return this.c(object0);
    }

    public static String h(String s) {
        return w.A(s);
    }

    public static String j(String s) {
        return w.B(s);
    }

    @Override
    public Object put(Object object0, Object object1) {
        return this.d(((String)object0), ((String)object1));
    }
}

