package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

final class o implements Collector {
    private final Supplier a;
    private final BiConsumer b;
    private final BinaryOperator c;
    private final Function d;
    private final Set e;

    o(Supplier supplier0, BiConsumer biConsumer0, BinaryOperator binaryOperator0, Set set0) {
        this(supplier0, biConsumer0, binaryOperator0, new j(3), set0);
    }

    o(Supplier supplier0, BiConsumer biConsumer0, BinaryOperator binaryOperator0, Function function0, Set set0) {
        this.a = supplier0;
        this.b = biConsumer0;
        this.c = binaryOperator0;
        this.d = function0;
        this.e = set0;
    }

    @Override  // j$.util.stream.Collector
    public final BiConsumer accumulator() {
        return this.b;
    }

    @Override  // j$.util.stream.Collector
    public final Set characteristics() {
        return this.e;
    }

    @Override  // j$.util.stream.Collector
    public final BinaryOperator combiner() {
        return this.c;
    }

    @Override  // j$.util.stream.Collector
    public final Function finisher() {
        return this.d;
    }

    @Override  // j$.util.stream.Collector
    public final Supplier supplier() {
        return this.a;
    }
}

