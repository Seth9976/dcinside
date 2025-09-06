package org.ccil.cowan.tagsoup;

public class e {
    private String a;
    private String b;
    private String c;
    private int d;
    private int e;
    private int f;
    private a g;
    private e h;
    private o i;

    public e(String s, int v, int v1, int v2, o o0) {
        this.a = s;
        this.d = v;
        this.e = v1;
        this.f = v2;
        this.g = new a();
        this.i = o0;
        this.b = this.j(s, false);
        this.c = this.e(s);
    }

    public a a() {
        return this.g;
    }

    public boolean b(e e0) {
        return (e0.e & this.d) != 0;
    }

    public int c() {
        return this.f;
    }

    public String d() {
        return this.c;
    }

    public String e(String s) {
        int v = s.indexOf(58);
        return v == -1 ? s : s.substring(v + 1).intern();
    }

    public int f() {
        return this.e;
    }

    public int g() {
        return this.d;
    }

    public String h() {
        return this.a;
    }

    public String i() {
        return this.b;
    }

    public String j(String s, boolean z) {
        int v = s.indexOf(58);
        if(v == -1) {
            return "";
        }
        String s1 = s.substring(0, v);
        return s1.equals("xml") ? "http://www.w3.org/XML/1998/namespace" : ("urn:x-prefix:" + s1).intern();
    }

    public static String k(String s) {
        if(s == null) {
            return null;
        }
        String s1 = s.trim();
        if(s1.indexOf("  ") == -1) {
            return s1;
        }
        int v = s1.length();
        StringBuffer stringBuffer0 = new StringBuffer(v);
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = s1.charAt(v1);
            if(v2 == 0x20) {
                if(!z) {
                    stringBuffer0.append(' ');
                }
                z = true;
            }
            else {
                stringBuffer0.append(((char)v2));
                z = false;
            }
        }
        return stringBuffer0.toString();
    }

    public e l() {
        return this.h;
    }

    public o m() {
        return this.i;
    }

    public void n(String s, String s1, String s2) {
        this.o(this.g, s, s1, s2);
    }

    public void o(a a0, String s, String s1, String s2) {
        if(!s.equals("xmlns") && !s.startsWith("xmlns:")) {
            String s3 = this.j(s, true);
            String s4 = this.e(s);
            int v = a0.getIndex(s);
            if(v == -1) {
                String s5 = s.intern();
                String s6 = s1 == null ? "CDATA" : s1;
                if(!s6.equals("CDATA")) {
                    s2 = e.k(s2);
                }
                a0.a(s3, s4, s5, s6, s2);
                return;
            }
            if(s1 == null) {
                s1 = a0.getType(v);
            }
            if(!s1.equals("CDATA")) {
                s2 = e.k(s2);
            }
            a0.f(v, s3, s4, s, s1, s2);
        }
    }

    public void p(int v) {
        this.f = v;
    }

    public void q(int v) {
        this.e = v;
    }

    public void r(int v) {
        this.d = v;
    }

    public void s(e e0) {
        this.h = e0;
    }
}

