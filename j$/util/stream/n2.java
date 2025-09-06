package j$.util.stream;

import java.util.Arrays;

final class N2 extends B2 {
    private Object[] d;
    private int e;

    @Override
    public final void accept(Object object0) {
        int v = this.e;
        this.e = v + 1;
        this.d[v] = object0;
    }

    @Override  // j$.util.stream.j2
    public final void k() {
        int v = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        n2 n20 = this.a;
        n20.l(((long)this.e));
        if(this.c) {
            while(v < this.e && !n20.n()) {
                n20.accept(this.d[v]);
                ++v;
            }
        }
        else {
            while(v < this.e) {
                n20.accept(this.d[v]);
                ++v;
            }
        }
        n20.k();
        this.d = null;
    }

    @Override  // j$.util.stream.j2
    public final void l(long v) {
        if(v >= 0x7FFFFFF7L) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = new Object[((int)v)];
    }
}

