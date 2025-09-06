package javassist.bytecode.analysis;

public class d {
    private k[] a;
    private k[] b;
    private int c;
    private boolean d;
    private boolean e;

    public d(int v, int v1) {
        this.a = new k[v];
        this.b = new k[v1];
    }

    public void a() {
        this.c = 0;
    }

    public d b() {
        d d0 = new d(this.a.length, this.b.length);
        System.arraycopy(this.a, 0, d0.a, 0, this.a.length);
        System.arraycopy(this.b, 0, d0.b, 0, this.b.length);
        d0.c = this.c;
        return d0;
    }

    public d c() {
        d d0 = new d(this.a.length, this.b.length);
        System.arraycopy(this.b, 0, d0.b, 0, this.b.length);
        d0.c = this.c;
        return d0;
    }

    public k d(int v) {
        return this.a[v];
    }

    public k e(int v) {
        return this.b[v];
    }

    public int f() {
        return this.c - 1;
    }

    boolean g() {
        return this.d;
    }

    boolean h() {
        return this.e;
    }

    public int i() {
        return this.a.length;
    }

    public boolean j(d d0) {
        boolean z = false;
        for(int v = 0; true; ++v) {
            k[] arr_k = this.a;
            if(v >= arr_k.length) {
                break;
            }
            k k0 = arr_k[v];
            if(k0 == null) {
                k k2 = d0.a[v];
                if(k2 != null) {
                    arr_k[v] = k2;
                    z = true;
                }
            }
            else {
                k k1 = k0.v(d0.a[v]);
                this.a[v] = k1;
                if(!k1.equals(k0) || k1.y()) {
                    z = true;
                }
            }
        }
        return this.k(d0) | z;
    }

    public boolean k(d d0) {
        if(this.c != d0.c) {
            throw new RuntimeException("Operand stacks could not be merged, they are different sizes!");
        }
        boolean z = false;
        for(int v = 0; v < this.c; ++v) {
            k k0 = this.b[v];
            if(k0 != null) {
                k k1 = k0.v(d0.b[v]);
                if(k1 == k.p) {
                    throw new RuntimeException("Operand stacks could not be merged due to differing primitive types: pos = " + v);
                }
                this.b[v] = k1;
                if(!k1.equals(k0) || k1.y()) {
                    z = true;
                }
            }
        }
        return z;
    }

    public k l() {
        int v = this.c;
        if(v < 1) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return this.b[v - 1];
    }

    public k m() {
        int v = this.c;
        if(v < 1) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        this.c = v - 1;
        return this.b[v - 1];
    }

    public void n(k k0) {
        int v = this.c;
        this.c = v + 1;
        this.b[v] = k0;
    }

    void o(boolean z) {
        this.d = z;
    }

    public void p(int v, k k0) {
        this.a[v] = k0;
    }

    void q(boolean z) {
        this.e = z;
    }

    public void r(int v, k k0) {
        this.b[v] = k0;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer0 = new StringBuffer();
        stringBuffer0.append("locals = [");
        for(int v1 = 0; true; ++v1) {
            k[] arr_k = this.a;
            if(v1 >= arr_k.length) {
                break;
            }
            k k0 = arr_k[v1];
            stringBuffer0.append((k0 == null ? "empty" : k0.toString()));
            if(v1 < this.a.length - 1) {
                stringBuffer0.append(", ");
            }
        }
        stringBuffer0.append("] stack = [");
        for(int v = 0; v < this.c; ++v) {
            stringBuffer0.append(this.b[v]);
            if(v < this.c - 1) {
                stringBuffer0.append(", ");
            }
        }
        stringBuffer0.append("]");
        return stringBuffer0.toString();
    }
}

