package j$.time.format;

import java.text.ParsePosition;
import java.util.Set;

class n {
    protected String a;
    protected String b;
    protected char c;
    protected n d;
    protected n e;

    private n(String s, String s1, n n0) {
        this.a = s;
        this.b = s1;
        this.d = n0;
        if(s.isEmpty()) {
            this.c = '\uFFFF';
            return;
        }
        this.c = this.a.charAt(0);
    }

    n(String s, String s1, n n0, int v) {
        this(s, s1, n0);
    }

    public final void a(String s, String s1) {
        this.b(s, s1);
    }

    private boolean b(String s, String s1) {
        int v;
        for(v = 0; v < s.length() && v < this.a.length() && this.c(s.charAt(v), this.a.charAt(v)); ++v) {
        }
        if(v == this.a.length()) {
            if(v < s.length()) {
                String s2 = s.substring(v);
                for(n n0 = this.d; n0 != null; n0 = n0.e) {
                    if(this.c(n0.c, s2.charAt(0))) {
                        return n0.b(s2, s1);
                    }
                }
                n n1 = this.e(s2, s1, null);
                n1.e = this.d;
                this.d = n1;
                return true;
            }
            this.b = s1;
            return true;
        }
        n n2 = this.e(this.a.substring(v), this.b, this.d);
        this.a = s.substring(0, v);
        this.d = n2;
        if(v < s.length()) {
            this.d.e = this.e(s.substring(v), s1, null);
            this.b = null;
            return true;
        }
        this.b = s1;
        return true;
    }

    protected boolean c(char c, char c1) {
        return c == c1;
    }

    public final String d(CharSequence charSequence0, ParsePosition parsePosition0) {
        int v = parsePosition0.getIndex();
        int v1 = charSequence0.length();
        if(!this.h(charSequence0, v, v1)) {
            return null;
        }
        int v2 = this.a.length() + v;
        n n0 = this.d;
        if(n0 != null && v2 != v1) {
            while(true) {
                if(this.c(n0.c, charSequence0.charAt(v2))) {
                    parsePosition0.setIndex(v2);
                    String s = n0.d(charSequence0, parsePosition0);
                    if(s == null) {
                        break;
                    }
                    return s;
                }
                n0 = n0.e;
                if(n0 == null) {
                    break;
                }
            }
        }
        parsePosition0.setIndex(v2);
        return this.b;
    }

    protected n e(String s, String s1, n n0) {
        return new n(s, s1, n0);
    }

    public static n f(w w0) {
        return w0.k() ? new n("", null, null) : new m("", null, null);  // 初始化器: Lj$/time/format/n;-><init>(Ljava/lang/String;Ljava/lang/String;Lj$/time/format/n;)V
    }

    public static n g(Set set0, w w0) {
        n n0 = n.f(w0);
        for(Object object0: set0) {
            n0.b(((String)object0), ((String)object0));
        }
        return n0;
    }

    protected boolean h(CharSequence charSequence0, int v, int v1) {
        if(charSequence0 instanceof String) {
            return ((String)charSequence0).startsWith(this.a, v);
        }
        int v2 = this.a.length();
        if(v2 > v1 - v) {
            return false;
        }
        for(int v3 = 0; v2 > 0; ++v3) {
            if(!this.c(this.a.charAt(v3), charSequence0.charAt(v))) {
                return false;
            }
            ++v;
            --v2;
        }
        return true;
    }
}

