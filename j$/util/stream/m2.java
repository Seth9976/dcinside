package j$.util.stream;

import java.util.Arrays;

final class M2 extends A2 {
    private long[] c;
    private int d;

    @Override  // j$.util.stream.m2
    public final void accept(long v) {
        int v1 = this.d;
        this.d = v1 + 1;
        this.c[v1] = v;
    }

    @Override  // j$.util.stream.i2
    public final void k() {
        int v = 0;
        Arrays.sort(this.c, 0, this.d);
        n2 n20 = this.a;
        n20.l(((long)this.d));
        if(this.b) {
            while(v < this.d && !n20.n()) {
                n20.accept(this.c[v]);
                ++v;
            }
        }
        else {
            while(v < this.d) {
                n20.accept(this.c[v]);
                ++v;
            }
        }
        n20.k();
        this.c = null;
    }

    @Override  // j$.util.stream.i2
    public final void l(long v) {
        if(v >= 0x7FFFFFF7L) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new long[((int)v)];
    }
}

