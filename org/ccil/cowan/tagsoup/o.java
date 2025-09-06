package org.ccil.cowan.tagsoup;

import java.util.HashMap;

public abstract class o {
    private e A;
    public static final int B = -1;
    public static final int C = 0;
    public static final int D = 0x40000000;
    public static final int E = 0x80000000;
    public static final int F = 1;
    public static final int G = 2;
    public static final int H = 4;
    private HashMap w;
    private HashMap x;
    private String y;
    private String z;

    public o() {
        this.w = new HashMap();
        this.x = new HashMap();
        this.y = "";
        this.z = "";
        this.A = null;
    }

    public void a(String s, String s1, String s2, String s3) {
        e e0 = this.d(s);
        if(e0 == null) {
            throw new Error("Attribute " + s1 + " specified for unknown element type " + s);
        }
        e0.n(s1, s2, s3);
    }

    public void b(String s, int v, int v1, int v2) {
        e e0 = new e(s, v, v1, v2, this);
        this.x.put(s.toLowerCase(), e0);
        if(v1 == 0x80000000) {
            this.A = e0;
        }
    }

    public void c(String s, int v) {
        this.w.put(s, new Integer(v));
    }

    public e d(String s) {
        return (e)this.x.get(s.toLowerCase());
    }

    public int e(String s) {
        Integer integer0 = (Integer)this.w.get(s);
        return integer0 == null ? 0 : ((int)integer0);
    }

    public String f() [...] // 潜在的解密器

    public String g() [...] // 潜在的解密器

    public void h(String s, String s1) {
        e e0 = this.d(s);
        e e1 = this.d(s1);
        if(e0 == null) {
            throw new Error("No child " + s + " for parent " + s1);
        }
        if(e1 == null) {
            throw new Error("No parent " + s1 + " for child " + s);
        }
        e0.s(e1);
    }

    public e i() {
        return this.A;
    }

    public void j(String s) {
        this.z = s;
    }

    public void k(String s) {
        this.y = s;
    }
}

