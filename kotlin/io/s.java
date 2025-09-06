package kotlin.io;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.L;
import kotlin.sequences.m;
import y4.l;

final class s implements m {
    @l
    private final BufferedReader a;

    public s(@l BufferedReader bufferedReader0) {
        L.p(bufferedReader0, "reader");
        super();
        this.a = bufferedReader0;
    }

    @Override  // kotlin.sequences.m
    @l
    public Iterator iterator() {
        public static final class a implements B3.a, Iterator {
            private String a;
            private boolean b;
            final s c;

            a(s s0) {
                this.c = s0;
                super();
            }

            public String a() {
                if(!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                String s = this.a;
                this.a = null;
                L.m(s);
                return s;
            }

            @Override
            public boolean hasNext() {
                if(this.a == null && !this.b) {
                    String s = this.c.a.readLine();
                    this.a = s;
                    if(s == null) {
                        this.b = true;
                    }
                }
                return this.a != null;
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

        return new a(this);
    }
}

