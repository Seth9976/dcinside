package j$.util.stream;

import j..util.Spliterator;
import java.util.function.IntFunction;

final class p2 extends e2 {
    final long n;
    final long o;

    p2(f2 f20, int v, long v1, long v2) {
        this.n = v1;
        this.o = v2;
        super(f20, v, 0);
    }

    @Override  // j$.util.stream.b
    final J0 P(b b0, Spliterator spliterator0, IntFunction intFunction0) {
        long v = b0.G(spliterator0);
        if(v > 0L && spliterator0.hasCharacteristics(0x4000)) {
            return x0.E(b0, x0.C(b0.J(), spliterator0, this.n, this.o), true, intFunction0);
        }
        if(!c3.ORDERED.q(b0.K())) {
            Spliterator spliterator1 = b0.Y(spliterator0);
            long v1 = this.n;
            long v2 = this.o;
            if(v1 <= v) {
                return v2 < 0L ? x0.E(this, new H3(spliterator1, 0L, v - v1), true, intFunction0) : x0.E(this, new H3(spliterator1, 0L, Math.min(v2, v - v1)), true, intFunction0);  // 初始化器: Lj$/util/stream/J3;-><init>(Lj$/util/Spliterator;JJ)V / 初始化器: Lj$/util/stream/J3;-><init>(Lj$/util/Spliterator;JJ)V
            }
            return x0.E(this, new H3(spliterator1, v1, v2), true, intFunction0);  // 初始化器: Lj$/util/stream/J3;-><init>(Lj$/util/Spliterator;JJ)V
        }
        return (J0)new x2(this, b0, spliterator0, intFunction0, this.n, this.o).invoke();
    }

    @Override  // j$.util.stream.b
    final Spliterator Q(b b0, Spliterator spliterator0) {
        long v = b0.G(spliterator0);
        long v1 = this.o;
        if(v > 0L && spliterator0.hasCharacteristics(0x4000)) {
            return new B3(b0.Y(spliterator0), this.n, x0.B(this.n, v1));
        }
        if(!c3.ORDERED.q(b0.K())) {
            Spliterator spliterator1 = b0.Y(spliterator0);
            return this.n > v ? new H3(spliterator1, this.n, v1) : new H3(spliterator1, 0L, (Long.compare(v1, 0L) < 0 ? v - this.n : Math.min(v1, v - this.n)));  // 初始化器: Lj$/util/stream/J3;-><init>(Lj$/util/Spliterator;JJ)V / 初始化器: Lj$/util/stream/J3;-><init>(Lj$/util/Spliterator;JJ)V
        }
        return ((J0)new x2(this, b0, spliterator0, new W(13), this.n, this.o).invoke()).spliterator();
    }

    @Override  // j$.util.stream.b
    final n2 S(int v, n2 n20) {
        return new o2(this, n20);
    }
}

