package kotlin.text;

import A3.o;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.V;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import kotlin.sequences.m;
import y4.l;

final class h implements m {
    @l
    private final CharSequence a;
    private final int b;
    private final int c;
    @l
    private final o d;

    public h(@l CharSequence charSequence0, int v, int v1, @l o o0) {
        L.p(charSequence0, "input");
        L.p(o0, "getNextMatch");
        super();
        this.a = charSequence0;
        this.b = v;
        this.c = v1;
        this.d = o0;
    }

    @Override  // kotlin.sequences.m
    @l
    public Iterator iterator() {
        public static final class a implements B3.a, Iterator {
            private int a;
            private int b;
            private int c;
            private kotlin.ranges.l d;
            private int e;
            final h f;

            a(h h0) {
                this.f = h0;
                super();
                this.a = -1;
                int v = s.I(h0.b, 0, h0.a.length());
                this.b = v;
                this.c = v;
            }

            private final void a() {
                int v = 0;
                if(this.c < 0) {
                    this.a = 0;
                    this.d = null;
                    return;
                }
                if(this.f.c > 0) {
                    int v1 = this.e + 1;
                    this.e = v1;
                    if(v1 >= this.f.c) {
                        this.d = new kotlin.ranges.l(this.b, v.j3(this.f.a));
                        this.c = -1;
                        this.a = 1;
                        return;
                    }
                    goto label_12;
                }
                else {
                label_12:
                    if(this.c > this.f.a.length()) {
                        this.d = new kotlin.ranges.l(this.b, v.j3(this.f.a));
                        this.c = -1;
                    }
                    else {
                        V v2 = (V)this.f.d.invoke(this.f.a, this.c);
                        if(v2 == null) {
                            this.d = new kotlin.ranges.l(this.b, v.j3(this.f.a));
                            this.c = -1;
                        }
                        else {
                            int v3 = ((Number)v2.a()).intValue();
                            int v4 = ((Number)v2.b()).intValue();
                            this.d = s.W1(this.b, v3);
                            int v5 = v3 + v4;
                            this.b = v5;
                            if(v4 == 0) {
                                v = 1;
                            }
                            this.c = v5 + v;
                        }
                    }
                }
                this.a = 1;
            }

            public final int b() {
                return this.e;
            }

            public final int c() {
                return this.b;
            }

            public final kotlin.ranges.l d() {
                return this.d;
            }

            public final int f() {
                return this.c;
            }

            public final int g() {
                return this.a;
            }

            public kotlin.ranges.l h() {
                if(this.a == -1) {
                    this.a();
                }
                if(this.a == 0) {
                    throw new NoSuchElementException();
                }
                kotlin.ranges.l l0 = this.d;
                L.n(l0, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.d = null;
                this.a = -1;
                return l0;
            }

            @Override
            public boolean hasNext() {
                if(this.a == -1) {
                    this.a();
                }
                return this.a == 1;
            }

            public final void i(int v) {
                this.e = v;
            }

            public final void j(int v) {
                this.b = v;
            }

            public final void k(kotlin.ranges.l l0) {
                this.d = l0;
            }

            public final void l(int v) {
                this.c = v;
            }

            public final void m(int v) {
                this.a = v;
            }

            @Override
            public Object next() {
                return this.h();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        }

        return new a(this);
    }
}

