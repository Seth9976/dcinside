package javassist.bytecode;

class i implements Cloneable {
    private byte[] a;
    private int b;

    public i() {
        this.a = new byte[0x40];
        this.b = 0;
    }

    public void a(int v) {
        this.d(1);
        this.a[this.b - 1] = (byte)v;
    }

    public void b(int v, int v1) {
        this.d(2);
        byte[] arr_b = this.a;
        int v2 = this.b;
        arr_b[v2 - 2] = (byte)v;
        arr_b[v2 - 1] = (byte)v1;
    }

    public void c(int v, int v1, int v2, int v3) {
        this.d(4);
        byte[] arr_b = this.a;
        int v4 = this.b;
        arr_b[v4 - 4] = (byte)v;
        arr_b[v4 - 3] = (byte)v1;
        arr_b[v4 - 2] = (byte)v2;
        arr_b[v4 - 1] = (byte)v3;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        i i0 = (i)super.clone();
        i0.a = (byte[])this.a.clone();
        return i0;
    }

    public void d(int v) {
        int v1 = this.b;
        byte[] arr_b = this.a;
        if(v1 + v > arr_b.length) {
            byte[] arr_b1 = new byte[(v1 << 1 >= v1 + v ? v1 << 1 : v1 + v)];
            System.arraycopy(arr_b, 0, arr_b1, 0, v1);
            this.a = arr_b1;
        }
        this.b += v;
    }

    public final byte[] e() [...] // 潜在的解密器

    public final int f() {
        return this.b;
    }

    public int g(int v) {
        if(v < 0 || this.b <= v) {
            throw new ArrayIndexOutOfBoundsException(v);
        }
        return this.a[v];
    }

    public void h(int v, int v1) {
        if(v < 0 || this.b <= v) {
            throw new ArrayIndexOutOfBoundsException(v);
        }
        this.a[v] = (byte)v1;
    }
}

