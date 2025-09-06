package kotlinx.serialization.descriptors;

import java.util.Iterator;
import kotlin.jvm.internal.L;
import y4.l;

public final class h {
    @l
    public static final Iterable a(@l f f0) {
        public static final class a implements B3.a, Iterator {
            private int a;
            final f b;

            a(f f0) {
                this.b = f0;
                super();
                this.a = f0.e();
            }

            @l
            public f a() {
                int v = this.b.e();
                int v1 = this.a;
                this.a = v1 - 1;
                return this.b.d(v - v1);
            }

            @Override
            public boolean hasNext() {
                return this.a > 0;
            }

            @Override
            public Object next() {
                return this.a();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }


        public static final class c implements B3.a, Iterable {
            final f a;

            public c(f f0) {
                this.a = f0;
                super();
            }

            @Override
            @l
            public Iterator iterator() {
                return new a(this.a);
            }
        }

        L.p(f0, "<this>");
        return new c(f0);
    }

    @kotlinx.serialization.f
    public static void b(f f0) {
    }

    @l
    public static final Iterable c(@l f f0) {
        public static final class b implements B3.a, Iterator {
            private int a;
            final f b;

            b(f f0) {
                this.b = f0;
                super();
                this.a = f0.e();
            }

            @l
            public String a() {
                int v = this.b.e();
                int v1 = this.a;
                this.a = v1 - 1;
                return this.b.f(v - v1);
            }

            @Override
            public boolean hasNext() {
                return this.a > 0;
            }

            @Override
            public Object next() {
                return this.a();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }


        public static final class d implements B3.a, Iterable {
            final f a;

            public d(f f0) {
                this.a = f0;
                super();
            }

            @Override
            @l
            public Iterator iterator() {
                return new b(this.a);
            }
        }

        L.p(f0, "<this>");
        return new d(f0);
    }

    @kotlinx.serialization.f
    public static void d(f f0) {
    }
}

