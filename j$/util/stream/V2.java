package j$.util.stream;

import j..util.Spliterator;
import j..util.T;
import java.util.function.IntFunction;

final class v2 extends C {
    final long n;
    final long o;

    v2(D d0, int v, long v1, long v2) {
        this.n = v1;
        this.o = v2;
        super(d0, v, 0);
    }

    @Override  // j$.util.stream.b
    final J0 P(b b0, Spliterator spliterator0, IntFunction intFunction0) {
        long v = b0.G(spliterator0);
        if(v > 0L && spliterator0.hasCharacteristics(0x4000)) {
            return x0.F(b0, x0.C(b0.J(), spliterator0, this.n, this.o), true);
        }
        if(!c3.ORDERED.q(b0.K())) {
            Spliterator spliterator1 = b0.Y(spliterator0);
            long v1 = this.n;
            long v2 = this.o;
            if(v1 <= v) {
                return v2 < 0L ? x0.F(this, new D3(((T)spliterator1), 0L, v - v1), true) : x0.F(this, new D3(((T)spliterator1), 0L, Math.min(v2, v - v1)), true);  // 初始化器: Lj$/util/stream/J3;-><init>(Lj$/util/Spliterator;JJ)V / 初始化器: Lj$/util/stream/J3;-><init>(Lj$/util/Spliterator;JJ)V
            }
            return x0.F(this, new D3(((T)spliterator1), v1, v2), true);  // 初始化器: Lj$/util/stream/J3;-><init>(Lj$/util/Spliterator;JJ)V
        }
        return (J0)new x2(this, b0, spliterator0, intFunction0, this.n, this.o).invoke();
    }

    @Override  // j$.util.stream.b
    final Spliterator Q(b b0, Spliterator spliterator0) {
        long v = b0.G(spliterator0);
        long v1 = this.o;
        if(v > 0L && spliterator0.hasCharacteristics(0x4000)) {
            return new x3(((T)b0.Y(spliterator0)), this.n, x0.B(this.n, v1));  // 初始化器: Lj$/util/stream/A3;-><init>(Lj$/util/c0;JJ)V
        }
        if(!c3.ORDERED.q(b0.K())) {
            Spliterator spliterator1 = b0.Y(spliterator0);
            return this.n > v ? new D3(((T)spliterator1), this.n, v1) : new D3(((T)spliterator1), 0L, (Long.compare(v1, 0L) < 0 ? v - this.n : Math.min(v1, v - this.n)));  // 初始化器: Lj$/util/stream/J3;-><init>(Lj$/util/Spliterator;JJ)V / 初始化器: Lj$/util/stream/J3;-><init>(Lj$/util/Spliterator;JJ)V
        }
        return ((J0)new x2(this, b0, spliterator0, new W(17), this.n, this.o).invoke()).spliterator();
    }

    @Override  // j$.util.stream.b
    final n2 S(int v, n2 n20) {
        return new u2(this, n20);
    }
}

