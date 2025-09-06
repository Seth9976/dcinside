package javassist.convert;

import javassist.E;
import javassist.b;
import javassist.bytecode.T;
import javassist.bytecode.analysis.d;
import javassist.bytecode.e;
import javassist.bytecode.q;
import javassist.bytecode.t;
import javassist.bytecode.w;
import javassist.l;

public final class a extends k {
    private final String b;
    private final javassist.i.a c;
    private d[] d;
    private int e;

    public a(k k0, String s, javassist.i.a i$a0) throws E {
        super(k0);
        this.b = s;
        this.c = i$a0;
    }

    @Override  // javassist.convert.k
    public void a() {
        this.d = null;
        this.e = -1;
    }

    @Override  // javassist.convert.k
    public void e(t t0, l l0, T t1) throws b {
        q q0 = t1.f().G();
        while(q0.l()) {
            try {
                int v = q0.J();
                int v1 = q0.f(v);
                if(v1 == 50) {
                    this.m(l0, t1);
                }
                switch(v1) {
                    case 46: 
                    case 0x2F: 
                    case 0x30: 
                    case 49: 
                    case 50: 
                    case 51: 
                    case 52: 
                    case 53: {
                        this.n(t0, q0, v, v1, this.i(v1));
                        continue;
                    }
                    case 0x4F: 
                    case 80: 
                    case 81: 
                    case 82: 
                    case 83: 
                    case 84: 
                    case 85: 
                    case 86: {
                        this.n(t0, q0, v, v1, this.k(v1));
                        continue;
                    }
                    default: {
                        continue;
                    }
                }
            }
            catch(Exception exception0) {
            }
            throw new b(exception0);
        }
    }

    @Override  // javassist.convert.k
    public int g(l l0, int v, q q0, t t0) throws e {
        return v;
    }

    private d h(int v) throws e {
        return this.d[v - this.e];
    }

    private String i(int v) throws e {
        switch(v) {
            case 46: {
                return "(Ljava/lang/Object;I)I";
            }
            case 0x2F: {
                return "(Ljava/lang/Object;I)J";
            }
            case 0x30: {
                return "(Ljava/lang/Object;I)F";
            }
            case 49: {
                return "(Ljava/lang/Object;I)D";
            }
            case 50: {
                return "(Ljava/lang/Object;I)Ljava/lang/Object;";
            }
            case 51: {
                return "(Ljava/lang/Object;I)B";
            }
            case 52: {
                return "(Ljava/lang/Object;I)C";
            }
            case 53: {
                return "(Ljava/lang/Object;I)S";
            }
            default: {
                throw new e(v);
            }
        }
    }

    private String j(int v) {
        String s;
        switch(v) {
            case 46: {
                s = this.c.e();
                return s.equals("") ? null : s;
            }
            case 0x2F: {
                s = this.c.a();
                return s.equals("") ? null : s;
            }
            case 0x30: {
                s = this.c.j();
                return s.equals("") ? null : s;
            }
            case 49: {
                s = this.c.i();
                return s.equals("") ? null : s;
            }
            case 50: {
                s = this.c.c();
                return s.equals("") ? null : s;
            }
            case 51: {
                s = this.c.o();
                return s.equals("") ? null : s;
            }
            case 52: {
                s = this.c.n();
                return s.equals("") ? null : s;
            }
            case 53: {
                s = this.c.d();
                return s.equals("") ? null : s;
            }
            case 0x4F: {
                s = this.c.k();
                return s.equals("") ? null : s;
            }
            case 80: {
                s = this.c.m();
                return s.equals("") ? null : s;
            }
            case 81: {
                s = this.c.p();
                return s.equals("") ? null : s;
            }
            case 82: {
                s = this.c.f();
                return s.equals("") ? null : s;
            }
            case 83: {
                s = this.c.g();
                return s.equals("") ? null : s;
            }
            case 84: {
                s = this.c.h();
                return s.equals("") ? null : s;
            }
            case 85: {
                s = this.c.l();
                return s.equals("") ? null : s;
            }
            case 86: {
                s = this.c.b();
                return s.equals("") ? null : s;
            }
            default: {
                throw new NullPointerException();
            }
        }
    }

    private String k(int v) throws e {
        switch(v) {
            case 0x4F: {
                return "(Ljava/lang/Object;II)V";
            }
            case 80: {
                return "(Ljava/lang/Object;IJ)V";
            }
            case 81: {
                return "(Ljava/lang/Object;IF)V";
            }
            case 82: {
                return "(Ljava/lang/Object;ID)V";
            }
            case 83: {
                return "(Ljava/lang/Object;ILjava/lang/Object;)V";
            }
            case 84: {
                return "(Ljava/lang/Object;IB)V";
            }
            case 85: {
                return "(Ljava/lang/Object;IC)V";
            }
            case 86: {
                return "(Ljava/lang/Object;IS)V";
            }
            default: {
                throw new e(v);
            }
        }
    }

    private String l(int v) throws e {
        d d0 = this.h(v);
        if(d0 == null) {
            return null;
        }
        l l0 = d0.l().l();
        return l0 == null ? null : w.C(l0);
    }

    private void m(l l0, T t0) throws e {
        if(this.d == null) {
            this.d = new javassist.bytecode.analysis.a().a(l0, t0);
            this.e = 0;
        }
    }

    private int n(t t0, q q0, int v, int v1, String s) throws e {
        String s1 = null;
        String s2 = this.j(v1);
        if(s2 != null) {
            if(v1 == 50) {
                String s3 = this.l(q0.E());
                if(s3 == null) {
                    return v;
                }
                if(!"java/lang/Object".equals(s3)) {
                    s1 = s3;
                }
            }
            q0.Y(0, v);
            javassist.bytecode.q.d q$d0 = q0.A(v, (s1 == null ? 2 : 5), false);
            int v2 = q$d0.a;
            int v3 = t0.r(t0.a(this.b), s2, s);
            q0.Y(0xB8, v2);
            q0.W(v3, v2 + 1);
            if(s1 != null) {
                int v4 = t0.a(s1);
                q0.Y(0xC0, v2 + 3);
                q0.W(v4, v2 + 4);
            }
            return this.o(v2, q$d0.b);
        }
        return v;
    }

    private int o(int v, int v1) {
        int v2 = this.e;
        if(v2 > -1) {
            this.e = v2 + v1;
        }
        return v + v1;
    }
}

