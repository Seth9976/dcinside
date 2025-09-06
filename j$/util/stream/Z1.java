package j$.util.stream;

import java.util.function.LongBinaryOperator;

final class z1 extends x0 {
    final LongBinaryOperator h;
    final long i;

    z1(d3 d30, LongBinaryOperator longBinaryOperator0, long v) {
        this.h = longBinaryOperator0;
        this.i = v;
    }

    @Override  // j$.util.stream.x0
    public final T1 b0() {
        return new R1(this.i, this.h);
    }
}

