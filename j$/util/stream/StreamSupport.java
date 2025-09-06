package j$.util.stream;

import j..util.Objects;
import j..util.Spliterator;
import j..util.T;
import j..util.W;
import j..util.Z;
import java.util.function.Supplier;

public final class StreamSupport {
    public static DoubleStream a(T t0) {
        return new B(t0, c3.p(t0), false);  // 初始化器: Lj$/util/stream/b;-><init>(Lj$/util/Spliterator;IZ)V
    }

    public static IntStream b(W w0) {
        return new b0(w0, c3.p(w0), false);  // 初始化器: Lj$/util/stream/b;-><init>(Lj$/util/Spliterator;IZ)V
    }

    public static LongStream c(Z z0) {
        return new j0(z0, c3.p(z0), false);  // 初始化器: Lj$/util/stream/b;-><init>(Lj$/util/Spliterator;IZ)V
    }

    public static Stream stream(Spliterator spliterator0, boolean z) {
        Objects.requireNonNull(spliterator0);
        return new d2(spliterator0, c3.p(spliterator0), z);  // 初始化器: Lj$/util/stream/b;-><init>(Lj$/util/Spliterator;IZ)V
    }

    public static Stream stream(Supplier supplier0, int v, boolean z) {
        Objects.requireNonNull(supplier0);
        return new d2(supplier0, v & c3.f, z);  // 初始化器: Lj$/util/stream/b;-><init>(Ljava/util/function/Supplier;IZ)V
    }
}

