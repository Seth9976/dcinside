package j$.util.stream;

import j..util.Spliterator;
import j..util.d0;
import java.util.Iterator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public final class f implements BaseStream {
    public final java.util.stream.BaseStream a;

    private f(java.util.stream.BaseStream baseStream0) {
        this.a = baseStream0;
    }

    @Override  // j$.util.stream.BaseStream
    public final void close() {
        this.a.close();
    }

    @Override
    public final boolean equals(Object object0) {
        java.util.stream.BaseStream baseStream0 = this.a;
        if(object0 instanceof f) {
            object0 = ((f)object0).a;
        }
        return baseStream0.equals(object0);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // j$.util.stream.BaseStream
    public final boolean isParallel() {
        return this.a.isParallel();
    }

    @Override  // j$.util.stream.BaseStream
    public final Iterator iterator() {
        return this.a.iterator();
    }

    public static BaseStream j(java.util.stream.BaseStream baseStream0) {
        if(baseStream0 == null) {
            return null;
        }
        if(baseStream0 instanceof g) {
            return ((g)baseStream0).a;
        }
        if(baseStream0 instanceof DoubleStream) {
            return E.j(((DoubleStream)baseStream0));
        }
        if(baseStream0 instanceof IntStream) {
            return IntStream.VivifiedWrapper.convert(((IntStream)baseStream0));
        }
        if(baseStream0 instanceof LongStream) {
            return m0.j(((LongStream)baseStream0));
        }
        return baseStream0 instanceof Stream ? Y2.j(((Stream)baseStream0)) : new f(baseStream0);
    }

    @Override  // j$.util.stream.BaseStream
    public final BaseStream onClose(Runnable runnable0) {
        return f.j(this.a.onClose(runnable0));
    }

    @Override  // j$.util.stream.BaseStream
    public final BaseStream parallel() {
        return f.j(this.a.parallel());
    }

    @Override  // j$.util.stream.BaseStream
    public final BaseStream sequential() {
        return f.j(this.a.sequential());
    }

    @Override  // j$.util.stream.BaseStream
    public final Spliterator spliterator() {
        return d0.a(this.a.spliterator());
    }

    @Override  // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return f.j(this.a.unordered());
    }
}

