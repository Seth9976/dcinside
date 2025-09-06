package j$.util.stream;

import j..util.Comparator.-CC;
import j..util.Objects;
import j..util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

final class I2 extends e2 {
    private final boolean n;
    private final Comparator o;

    I2(f2 f20) {
        super(f20, c3.q | c3.o, 0);
        this.n = true;
        this.o = Comparator.-CC.a();
    }

    I2(f2 f20, Comparator comparator0) {
        super(f20, c3.q | c3.p, 0);
        this.n = false;
        this.o = (Comparator)Objects.requireNonNull(comparator0);
    }

    @Override  // j$.util.stream.b
    public final J0 P(b b0, Spliterator spliterator0, IntFunction intFunction0) {
        if(c3.SORTED.q(b0.K()) && this.n) {
            return b0.C(spliterator0, false, intFunction0);
        }
        Object[] arr_object = b0.C(spliterator0, true, intFunction0).o(intFunction0);
        Arrays.sort(arr_object, this.o);
        return new M0(arr_object);
    }

    @Override  // j$.util.stream.b
    public final n2 S(int v, n2 n20) {
        Objects.requireNonNull(n20);
        if(c3.SORTED.q(v) && this.n) {
            return n20;
        }
        Comparator comparator0 = this.o;
        return c3.SIZED.q(v) ? new N2(n20, comparator0) : new J2(n20, comparator0);  // 初始化器: Lj$/util/stream/B2;-><init>(Lj$/util/stream/n2;Ljava/util/Comparator;)V / 初始化器: Lj$/util/stream/B2;-><init>(Lj$/util/stream/n2;Ljava/util/Comparator;)V
    }
}

