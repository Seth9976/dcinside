package org.jsoup.nodes;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.Map;
import java.util.regex.Pattern;
import org.jsoup.helper.i;
import org.jsoup.internal.g;
import org.jsoup.internal.n;

public class a implements Cloneable, Map.Entry {
    private String a;
    private String b;
    b c;
    private static final String[] d;
    private static final Pattern e;
    private static final Pattern f;
    private static final Pattern g;
    private static final Pattern h;

    static {
        a.d = new String[]{"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
        a.e = Pattern.compile("[a-zA-Z_:][-a-zA-Z0-9_:.]*");
        a.f = Pattern.compile("[^-a-zA-Z0-9_:.]+");
        a.g = Pattern.compile("[^\\x00-\\x1f\\x7f-\\x9f \"\'/=]+");
        a.h = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"\'/=]+");
    }

    public a(String s, String s1) {
        this(s, s1, null);
    }

    public a(String s, String s1, b b0) {
        i.o(s);
        String s2 = s.trim();
        i.l(s2);
        this.a = s2;
        this.b = s1;
        this.c = b0;
    }

    public a a() {
        try {
            return (a)super.clone();
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new RuntimeException(cloneNotSupportedException0);
        }
    }

    public static a b(String s, String s1) {
        return new a(s, p.m(s1, true), null);
    }

    public String c() {
        return this.a;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.a();
    }

    public static String d(String s, org.jsoup.nodes.f.a.a f$a$a0) {
        if(f$a$a0 == org.jsoup.nodes.f.a.a.b) {
            Pattern pattern0 = a.e;
            if(!pattern0.matcher(s).matches()) {
                String s1 = a.f.matcher(s).replaceAll("_");
                return pattern0.matcher(s1).matches() ? s1 : null;
            }
        }
        if(f$a$a0 == org.jsoup.nodes.f.a.a.a) {
            Pattern pattern1 = a.g;
            if(!pattern1.matcher(s).matches()) {
                String s2 = a.h.matcher(s).replaceAll("_");
                return pattern1.matcher(s2).matches() ? s2 : null;
            }
        }
        return s;
    }

    public String e() {
        return b.m(this.b);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            String s = this.a;
            if(s != null) {
                if(!s.equals(((a)object0).a)) {
                    return false;
                }
            }
            else if(((a)object0).a != null) {
                return false;
            }
            String s1 = this.b;
            String s2 = ((a)object0).b;
            return s1 == null ? s2 == null : s1.equals(s2);
        }
        return false;
    }

    public boolean f() {
        return this.b != null;
    }

    public String g() {
        StringBuilder stringBuilder0 = n.d();
        try {
            this.h(stringBuilder0, new f("").s3());
            return n.v(stringBuilder0);
        }
        catch(IOException iOException0) {
            throw new org.jsoup.i(iOException0);
        }
    }

    @Override
    public Object getKey() {
        return this.c();
    }

    @Override
    public Object getValue() {
        return this.e();
    }

    protected void h(Appendable appendable0, org.jsoup.nodes.f.a f$a0) throws IOException {
        a.j(this.a, this.b, appendable0, f$a0);
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        String s = this.b;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 * 0x1F + v;
    }

    protected static void j(String s, String s1, Appendable appendable0, org.jsoup.nodes.f.a f$a0) throws IOException {
        String s2 = a.d(s, f$a0.r());
        if(s2 == null) {
            return;
        }
        a.k(s2, s1, appendable0, f$a0);
    }

    static void k(String s, String s1, Appendable appendable0, org.jsoup.nodes.f.a f$a0) throws IOException {
        appendable0.append(s);
        if(!a.q(s, s1, f$a0)) {
            appendable0.append("=\"");
            p.g(appendable0, b.m(s1), f$a0, false, true, false, false, false);
            appendable0.append('\"');
        }
    }

    public static boolean l(String s) {
        String s1 = g.a(s);
        return Arrays.binarySearch(a.d, s1) >= 0;
    }

    protected boolean m() {
        return a.n(this.a);
    }

    protected static boolean n(String s) {
        return s.startsWith("data-") && s.length() > 5;
    }

    public void o(String s) {
        i.o(s);
        String s1 = s.trim();
        i.l(s1);
        b b0 = this.c;
        if(b0 != null) {
            int v = b0.C(this.a);
            if(v != -1) {
                b b1 = this.c;
                String[] arr_s = b1.b;
                String s2 = arr_s[v];
                arr_s[v] = s1;
                Map map0 = b1.u();
                if(map0 != null) {
                    map0.put(s1, ((org.jsoup.nodes.x.a)map0.remove(s2)));
                }
            }
        }
        this.a = s1;
    }

    public String p(String s) {
        String s1 = this.b;
        b b0 = this.c;
        if(b0 != null) {
            int v = b0.C(this.a);
            if(v != -1) {
                s1 = this.c.r(this.a);
                this.c.c[v] = s;
            }
        }
        this.b = s;
        return b.m(s1);
    }

    // 去混淆评级： 低(40)
    protected static boolean q(String s, String s1, org.jsoup.nodes.f.a f$a0) {
        return f$a0.r() == org.jsoup.nodes.f.a.a.a && (s1 == null || (s1.isEmpty() || s1.equalsIgnoreCase(s)) && a.l(s));
    }

    protected final boolean r(org.jsoup.nodes.f.a f$a0) {
        return a.q(this.a, this.b, f$a0);
    }

    public org.jsoup.nodes.x.a s() {
        return this.c == null ? org.jsoup.nodes.x.a.c : this.c.P(this.a);
    }

    @Override
    public Object setValue(Object object0) {
        return this.p(((String)object0));
    }

    @Override
    public String toString() {
        return this.g();
    }
}

