package j$.util.stream;

import j..util.Spliterator.Wrapper;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

public final class g implements BaseStream {
    public final j..util.stream.BaseStream a;

    private g(j..util.stream.BaseStream baseStream0) {
        this.a = baseStream0;
    }

    @Override
    public final void close() {
        this.a.close();
    }

    @Override
    public final boolean equals(Object object0) {
        j..util.stream.BaseStream baseStream0 = this.a;
        if(object0 instanceof g) {
            object0 = ((g)object0).a;
        }
        return baseStream0.equals(object0);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final boolean isParallel() {
        return this.a.isParallel();
    }

    @Override
    public final Iterator iterator() {
        return this.a.iterator();
    }

    public static BaseStream j(j..util.stream.BaseStream baseStream0) {
        if(baseStream0 == null) {
            return null;
        }
        if(baseStream0 instanceof f) {
            return ((f)baseStream0).a;
        }
        if(baseStream0 instanceof DoubleStream) {
            return F.j(((DoubleStream)baseStream0));
        }
        if(baseStream0 instanceof IntStream) {
            return IntStream.Wrapper.convert(((IntStream)baseStream0));
        }
        if(baseStream0 instanceof LongStream) {
            return n0.j(((LongStream)baseStream0));
        }
        return baseStream0 instanceof Stream ? Stream.Wrapper.convert(((Stream)baseStream0)) : new g(baseStream0);
    }

    @Override
    public final BaseStream onClose(Runnable runnable0) {
        return g.j(this.a.onClose(runnable0));
    }

    @Override
    public final BaseStream parallel() {
        return g.j(this.a.parallel());
    }

    @Override
    public final BaseStream sequential() {
        return g.j(this.a.sequential());
    }

    @Override
    public final Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.a.spliterator());
    }

    @Override
    public final BaseStream unordered() {
        return g.j(this.a.unordered());
    }
}

