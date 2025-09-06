package javassist.bytecode.stackmap;

import javassist.bytecode.T;
import javassist.bytecode.e;
import javassist.bytecode.p;

public class f extends a {
    public static class javassist.bytecode.stackmap.f.a extends c {
        @Override  // javassist.bytecode.stackmap.a$c
        protected a[] e(int v) {
            return new f[v];
        }

        @Override  // javassist.bytecode.stackmap.a$c
        protected a h(int v) {
            return new f(v);
        }
    }

    public int g;
    public int h;
    public d[] i;
    public d[] j;

    protected f(int v) {
        super(v);
        this.i = null;
    }

    @Override  // javassist.bytecode.stackmap.a
    protected void b(StringBuffer stringBuffer0) {
        super.b(stringBuffer0);
        stringBuffer0.append(",\n stack={");
        this.h(stringBuffer0, this.g, this.j);
        stringBuffer0.append("}, locals={");
        this.h(stringBuffer0, this.h, this.i);
        stringBuffer0.append('}');
    }

    public boolean c() {
        return this.i != null;
    }

    private static int d(String s, int v, int v1, d[] arr_d) throws e {
        int v2 = s.charAt(v);
        int v3 = 0;
        if(v2 == 41) {
            return 0;
        }
        int v4 = v;
        while(true) {
            switch(v2) {
                case 76: {
                    int v5 = s.indexOf(59, v4 + 1);
                    if(v3 > 0) {
                        arr_d[v1] = new javassist.bytecode.stackmap.d.e(s.substring(v, v5 + 1));
                        return v5 + 1;
                    }
                    arr_d[v1] = new javassist.bytecode.stackmap.d.e(s.substring(v + 1, v5).replace('/', '.'));
                    return v5 + 1;
                }
                case 91: {
                    ++v3;
                    ++v4;
                    v2 = s.charAt(v4);
                    break;
                }
                default: {
                    if(v3 > 0) {
                        arr_d[v1] = new javassist.bytecode.stackmap.d.e(s.substring(v, v4 + 1));
                        return v4 + 1;
                    }
                    d d0 = f.k(((char)v2));
                    if(d0 == null) {
                        throw new e("bad method descriptor: " + s);
                    }
                    arr_d[v1] = d0;
                    return v4 + 1;
                }
            }
        }
    }

    public static String e(String s) {
        int v = s.indexOf(41);
        if(v < 0) {
            return "java.lang.Object";
        }
        int v1 = s.charAt(v + 1);
        if(v1 == 91) {
            return s.substring(v + 1);
        }
        return v1 == 76 ? s.substring(v + 2, s.length() - 1).replace('/', '.') : "java.lang.Object";
    }

    void f(int v, int v1, String s, String s1, boolean z, boolean z1) throws e {
        int v2 = 0;
        if(s1.charAt(0) == 40) {
            this.g = 0;
            this.j = d.q(v);
            d[] arr_d = d.q(v1);
            if(z1) {
                arr_d[0] = new i(s);
            }
            else if(!z) {
                arr_d[0] = new javassist.bytecode.stackmap.d.e(s);
            }
            if(z) {
                v2 = -1;
            }
            int v3 = 1;
            try {
                while(true) {
                    v3 = f.d(s1, v3, v2 + 1, arr_d);
                    if(v3 <= 0) {
                        break;
                    }
                    if(arr_d[v2 + 1].l()) {
                        v2 += 2;
                        arr_d[v2] = javassist.bytecode.stackmap.e.b;
                    }
                    else {
                        ++v2;
                    }
                }
                this.h = v2 + 1;
                this.i = arr_d;
                return;
            }
            catch(StringIndexOutOfBoundsException unused_ex) {
                throw new e("bad method descriptor: " + s1);
            }
        }
        throw new e("no method descriptor: " + s1);
    }

    public static f[] g(T t0, p p0, boolean z) throws e {
        f[] arr_f = (f[])new javassist.bytecode.stackmap.f.a().d(t0);
        if(z && arr_f.length < 2 && (arr_f.length == 0 || arr_f[0].c == 0)) {
            return null;
        }
        arr_f[0].f(p0.E(), p0.D(), t0.g().C(), t0.h(), (t0.c() & 8) != 0, t0.l());
        return arr_f;
    }

    private void h(StringBuffer stringBuffer0, int v, d[] arr_d) {
        if(arr_d == null) {
            return;
        }
        for(int v1 = 0; v1 < v; ++v1) {
            if(v1 > 0) {
                stringBuffer0.append(", ");
            }
            d d0 = arr_d[v1];
            stringBuffer0.append((d0 == null ? "<>" : d0.toString()));
        }
    }

    public void i() {
        d[] arr_d = this.i;
        if(arr_d != null) {
            int v;
            for(v = arr_d.length; v > 0 && this.i[v - 1].m() == javassist.bytecode.stackmap.e.b && (v <= 1 || !this.i[v - 2].l()); --v) {
            }
            this.h = v;
        }
    }

    public void j(int v, d[] arr_d, int v1, d[] arr_d1) throws e {
        this.g = v;
        this.j = arr_d;
        this.h = v1;
        this.i = arr_d1;
    }

    private static d k(char c) {
        switch(c) {
            case 68: {
                return javassist.bytecode.stackmap.e.e;
            }
            case 70: {
                return javassist.bytecode.stackmap.e.d;
            }
            case 74: {
                return javassist.bytecode.stackmap.e.f;
            }
            case 66: 
            case 67: 
            case 73: 
            case 83: 
            case 90: {
                return javassist.bytecode.stackmap.e.c;
            }
            default: {
                return null;
            }
        }
    }
}

