package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public final class i implements Collector {
    public final j..util.stream.Collector a;

    private i(j..util.stream.Collector collector0) {
        this.a = collector0;
    }

    public static Collector a(j..util.stream.Collector collector0) {
        if(collector0 == null) {
            return null;
        }
        return collector0 instanceof h ? ((h)collector0).a : new i(collector0);
    }

    @Override
    public final BiConsumer accumulator() {
        return this.a.accumulator();
    }

    @Override
    public final Set characteristics() {
        return Z2.a(this.a.characteristics());
    }

    @Override
    public final BinaryOperator combiner() {
        return this.a.combiner();
    }

    @Override
    public final boolean equals(Object object0) {
        j..util.stream.Collector collector0 = this.a;
        if(object0 instanceof i) {
            object0 = ((i)object0).a;
        }
        return collector0.equals(object0);
    }

    @Override
    public final Function finisher() {
        return this.a.finisher();
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final Supplier supplier() {
        return this.a.supplier();
    }
}

