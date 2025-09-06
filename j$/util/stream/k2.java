package j$.util.stream;

import java.util.Arrays;

final class K2 extends y2 {
    private double[] c;
    private int d;

    @Override  // j$.util.stream.k2
    public final void accept(double f) {
        int v = this.d;
        this.d = v + 1;
        this.c[v] = f;
    }

    @Override  // j$.util.stream.g2
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

    @Override  // j$.util.stream.g2
    public final void l(long v) {
        if(v >= 0x7FFFFFF7L) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new double[((int)v)];
    }
}

