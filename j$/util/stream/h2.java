package j$.util.stream;

import j..util.Objects;
import j..util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

final class H2 extends k0 {
    @Override  // j$.util.stream.b
    public final J0 P(b b0, Spliterator spliterator0, IntFunction intFunction0) {
        if(c3.SORTED.q(b0.K())) {
            return b0.C(spliterator0, false, intFunction0);
        }
        long[] arr_v = (long[])((H0)b0.C(spliterator0, true, intFunction0)).d();
        Arrays.sort(arr_v);
        return new o1(arr_v);
    }

    @Override  // j$.util.stream.b
    public final n2 S(int v, n2 n20) {
        Objects.requireNonNull(n20);
        if(c3.SORTED.q(v)) {
            return n20;
        }
        return c3.SIZED.q(v) ? new M2(n20) : new E2(n20);  // 初始化器: Lj$/util/stream/i2;-><init>(Lj$/util/stream/n2;)V / 初始化器: Lj$/util/stream/i2;-><init>(Lj$/util/stream/n2;)V
    }
}

