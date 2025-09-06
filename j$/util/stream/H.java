package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

public final class h implements Collector {
    public final java.util.stream.Collector a;

    private h(java.util.stream.Collector collector0) {
        this.a = collector0;
    }

    public static Collector a(java.util.stream.Collector collector0) {
        if(collector0 == null) {
            return null;
        }
        return collector0 instanceof i ? ((i)collector0).a : new h(collector0);
    }

    @Override  // j$.util.stream.Collector
    public final BiConsumer accumulator() {
        return this.a.accumulator();
    }

    @Override  // j$.util.stream.Collector
    public final Set characteristics() {
        return Z2.a(this.a.characteristics());
    }

    @Override  // j$.util.stream.Collector
    public final BinaryOperator combiner() {
        return this.a.combiner();
    }

    @Override
    public final boolean equals(Object object0) {
        java.util.stream.Collector collector0 = this.a;
        if(object0 instanceof h) {
            object0 = ((h)object0).a;
        }
        return collector0.equals(object0);
    }

    @Override  // j$.util.stream.Collector
    public final Function finisher() {
        return this.a.finisher();
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // j$.util.stream.Collector
    public final Supplier supplier() {
        return this.a.supplier();
    }
}

