package org.jsoup.parser;

import org.jsoup.helper.i;
import org.jsoup.internal.n;

public class s {
    private String a;
    private int b;
    private static final char c = '\\';
    private static final String[] d;
    private static final String[] e;

    static {
        s.d = new String[]{"*", "|", "_", "-"};
        s.e = new String[]{"-", "_"};
    }

    public s(String s) {
        this.b = 0;
        i.o(s);
        this.a = s;
    }

    public static String A(String s) {
        StringBuilder stringBuilder0 = n.d();
        char[] arr_c = s.toCharArray();
        int v1 = 0;
        for(int v = 0; v < arr_c.length; ++v) {
            int v2 = arr_c[v];
            if(v2 != 92) {
                stringBuilder0.append(((char)v2));
            }
            else if(v1 == 92) {
                stringBuilder0.append('\\');
                v1 = 0;
                continue;
            }
            v1 = v2;
        }
        return n.v(stringBuilder0);
    }

    public void a(String s) {
        this.a = s + this.a.substring(this.b);
        this.b = 0;
    }

    public void b() {
        if(!this.q()) {
            ++this.b;
        }
    }

    public String c(char c, char c1) {
        int v = 0;
        int v1 = 0;
        int v2 = 0;
        int v3 = -1;
        int v4 = -1;
        int v5 = 0;
        boolean z = false;
        while(!this.q()) {
            int v6 = this.f();
            if(v == 92) {
                switch(v6) {
                    case 69: {
                        z = false;
                        break;
                    }
                    case 81: {
                        z = true;
                    }
                }
            label_29:
                if(v5 > 0 && v != 0) {
                    v4 = this.b;
                }
            }
            else {
                if(v6 == 39 && 39 != c && v1 == 0) {
                    v2 ^= 1;
                }
                else if(v6 == 34 && 34 != c && v2 == 0) {
                    v1 ^= 1;
                }
                if(v2 == 0 && v1 == 0 && !z) {
                    if(v6 == c) {
                        ++v5;
                        if(v3 == -1) {
                            v3 = this.b;
                        }
                    }
                    else if(v6 == c1) {
                        --v5;
                    }
                    goto label_29;
                }
            }
            if(v5 <= 0) {
                break;
            }
            v = v6;
        }
        String s = v4 < 0 ? "" : this.a.substring(v3, v4);
        if(v5 > 0) {
            i.d(("Did not find balanced marker at \'" + s + "\'"));
        }
        return s;
    }

    public String d(String s) {
        String s1 = this.k(s);
        this.r(s);
        return s1;
    }

    public String e(String s) {
        String s1 = this.m(s);
        this.r(s);
        return s1;
    }

    public char f() {
        int v = this.b;
        this.b = v + 1;
        return this.a.charAt(v);
    }

    public void g(String s) {
        if(!this.s(s)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int v = s.length();
        if(v > this.z()) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.b += v;
    }

    public String h() {
        return this.j(s.e);
    }

    public String i() {
        return this.j(s.d);
    }

    private String j(String[] arr_s) {
        int v = this.b;
        boolean z = false;
        while(!this.q()) {
            if(this.a.charAt(this.b) == 92 && this.z() > 1) {
                this.b += 2;
                z = true;
            }
            else {
                if(!this.v(arr_s)) {
                    break;
                }
                ++this.b;
            }
        }
        String s = this.a.substring(v, this.b);
        return z ? s.A(s) : s;
    }

    public String k(String s) {
        int v = this.a.indexOf(s, this.b);
        if(v != -1) {
            String s1 = this.a.substring(this.b, v);
            this.b += s1.length();
            return s1;
        }
        return this.y();
    }

    public String l(String[] arr_s) {
        int v = this.b;
        while(!this.q() && !this.u(arr_s)) {
            ++this.b;
        }
        return this.a.substring(v, this.b);
    }

    public String m(String s) {
        int v = this.b;
        String s1 = s.substring(0, 1);
        boolean z = s1.toLowerCase().equals(s1.toUpperCase());
        while(!this.q() && !this.s(s)) {
            if(z) {
                int v1 = this.b;
                int v2 = this.a.indexOf(s1, this.b) - v1;
                if(v2 == 0) {
                    this.b = v1 + 1;
                }
                else if(v2 < 0) {
                    this.b = this.a.length();
                }
                else {
                    this.b = v1 + v2;
                }
            }
            else {
                ++this.b;
            }
        }
        return this.a.substring(v, this.b);
    }

    public boolean n() {
        boolean z;
        for(z = false; this.w(); z = true) {
            ++this.b;
        }
        return z;
    }

    public String o() {
        int v = this.b;
        while(this.x()) {
            ++this.b;
        }
        return this.a.substring(v, this.b);
    }

    public static String p(String s) {
        StringBuilder stringBuilder0 = n.d();
        s s1 = new s(s);
        while(!s1.q()) {
            if(!s1.v(s.d)) {
                stringBuilder0.append('\\');
            }
            stringBuilder0.append(s1.f());
        }
        return n.v(stringBuilder0);
    }

    public boolean q() {
        return this.z() == 0;
    }

    public boolean r(String s) {
        if(this.s(s)) {
            this.b += s.length();
            return true;
        }
        return false;
    }

    public boolean s(String s) {
        return this.a.regionMatches(true, this.b, s, 0, s.length());
    }

    public boolean t(char[] arr_c) {
        if(this.q()) {
            return false;
        }
        for(int v = 0; v < arr_c.length; ++v) {
            if(this.a.charAt(this.b) == arr_c[v]) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return this.a.substring(this.b);
    }

    public boolean u(String[] arr_s) {
        for(int v = 0; v < arr_s.length; ++v) {
            if(this.s(arr_s[v])) {
                return true;
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    private boolean v(String[] arr_s) {
        return this.x() || this.u(arr_s);
    }

    // 去混淆评级： 低(20)
    public boolean w() {
        return !this.q() && n.l(this.a.charAt(this.b));
    }

    // 去混淆评级： 低(20)
    public boolean x() {
        return !this.q() && Character.isLetterOrDigit(this.a.charAt(this.b));
    }

    public String y() {
        String s = this.a.substring(this.b);
        this.b = this.a.length();
        return s;
    }

    private int z() {
        return this.a.length() - this.b;
    }
}

