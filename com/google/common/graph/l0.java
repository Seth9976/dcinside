package com.google.common.graph;

import J1.a;
import O1.f;
import com.google.common.base.H;
import com.google.common.collect.a3;
import com.google.common.collect.c;
import com.google.common.collect.u5;
import j..util.Objects;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@a
@f("Call forGraph or forTree, passing a lambda or a Graph with the desired edges (built with GraphBuilder)")
@x
public abstract class l0 {
    static abstract enum com.google.common.graph.l0.f {
        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.common.graph.l0.f.a extends com.google.common.graph.l0.f {
            com.google.common.graph.l0.f.a(String s, int v) {
                super(null);
            }

            @Override  // com.google.common.graph.l0$f
            void b(Deque deque0, Object object0) {
                deque0.addFirst(object0);
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class b extends com.google.common.graph.l0.f {
            b(String s, int v) {
                super(null);
            }

            @Override  // com.google.common.graph.l0$f
            void b(Deque deque0, Object object0) {
                deque0.addLast(object0);
            }
        }

        FRONT /* 警告！未生成枚举子类：com.google.common.graph.l0$f$a */,
        BACK /* 警告！未生成枚举子类：com.google.common.graph.l0$f$b */;

        private com.google.common.graph.l0.f() {
        }

        com.google.common.graph.l0.f(com.google.common.graph.l0.a l0$a0) {
            this();
        }

        private static com.google.common.graph.l0.f[] a() [...] // Inlined contents

        abstract void b(Deque arg1, Object arg2);
    }

    static abstract class g {
        final k0 a;

        g(k0 k00) {
            this.a = k00;
        }

        final Iterator a(Iterator iterator0) {
            return this.f(iterator0, com.google.common.graph.l0.f.b);
        }

        static g b(k0 k00) {
            class com.google.common.graph.l0.g.a extends g {
                final Set b;

                com.google.common.graph.l0.g.a(k0 k00, Set set0) {
                    this.b = set0;
                    super(k00);
                }

                @Override  // com.google.common.graph.l0$g
                @o3.a
                Object g(Deque deque0) {
                    Iterator iterator0 = (Iterator)deque0.getFirst();
                    while(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        Objects.requireNonNull(object0);
                        if(this.b.add(object0)) {
                            return object0;
                        }
                        if(false) {
                            break;
                        }
                    }
                    deque0.removeFirst();
                    return null;
                }
            }

            return new com.google.common.graph.l0.g.a(k00, new HashSet());
        }

        static g c(k0 k00) {
            class com.google.common.graph.l0.g.b extends g {
                com.google.common.graph.l0.g.b(k0 k00) {
                }

                @Override  // com.google.common.graph.l0$g
                @o3.a
                Object g(Deque deque0) {
                    Iterator iterator0 = (Iterator)deque0.getFirst();
                    if(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        return H.E(object0);
                    }
                    deque0.removeFirst();
                    return null;
                }
            }

            return new com.google.common.graph.l0.g.b(k00);
        }

        final Iterator d(Iterator iterator0) {
            class d extends c {
                final Deque c;
                final Deque d;
                final g e;

                d(Deque deque0, Deque deque1) {
                    this.c = deque0;
                    this.d = deque1;
                    super();
                }

                @Override  // com.google.common.collect.c
                @o3.a
                protected Object a() {
                    Object object0;
                    while((object0 = g.this.g(this.c)) != null) {
                        Iterator iterator0 = g.this.a.a(object0).iterator();
                        if(!iterator0.hasNext()) {
                            return object0;
                        }
                        this.c.addFirst(iterator0);
                        this.d.push(object0);
                    }
                    return this.d.isEmpty() ? this.b() : this.d.pop();
                }
            }

            ArrayDeque arrayDeque0 = new ArrayDeque();
            ArrayDeque arrayDeque1 = new ArrayDeque();
            arrayDeque1.add(iterator0);
            return new d(this, arrayDeque1, arrayDeque0);
        }

        final Iterator e(Iterator iterator0) {
            return this.f(iterator0, com.google.common.graph.l0.f.a);
        }

        private Iterator f(Iterator iterator0, com.google.common.graph.l0.f l0$f0) {
            class com.google.common.graph.l0.g.c extends c {
                final Deque c;
                final com.google.common.graph.l0.f d;
                final g e;

                com.google.common.graph.l0.g.c(Deque deque0, com.google.common.graph.l0.f l0$f0) {
                    this.c = deque0;
                    this.d = l0$f0;
                    super();
                }

                @Override  // com.google.common.collect.c
                @o3.a
                protected Object a() {
                    do {
                        Object object0 = g.this.g(this.c);
                        if(object0 != null) {
                            Iterator iterator0 = g.this.a.a(object0).iterator();
                            if(iterator0.hasNext()) {
                                this.d.b(this.c, iterator0);
                            }
                            return object0;
                        }
                    }
                    while(!this.c.isEmpty());
                    return this.b();
                }
            }

            ArrayDeque arrayDeque0 = new ArrayDeque();
            arrayDeque0.add(iterator0);
            return new com.google.common.graph.l0.g.c(this, arrayDeque0, l0$f0);
        }

        @o3.a
        abstract Object g(Deque arg1);
    }

    private final k0 a;

    private l0(k0 k00) {
        this.a = (k0)H.E(k00);
    }

    l0(k0 k00, com.google.common.graph.l0.a l0$a0) {
        this(k00);
    }

    public final Iterable a(Iterable iterable0) {
        class com.google.common.graph.l0.c implements Iterable {
            final a3 a;
            final l0 b;

            com.google.common.graph.l0.c(a3 a30) {
                this.a = a30;
                super();
            }

            @Override
            public Iterator iterator() {
                return l0.this.i().a(this.a.i());
            }
        }

        return new com.google.common.graph.l0.c(this, this.j(iterable0));
    }

    public final Iterable b(Object object0) {
        return this.a(a3.C(object0));
    }

    public final Iterable c(Iterable iterable0) {
        class e implements Iterable {
            final a3 a;
            final l0 b;

            e(a3 a30) {
                this.a = a30;
                super();
            }

            @Override
            public Iterator iterator() {
                return l0.this.i().d(this.a.i());
            }
        }

        return new e(this, this.j(iterable0));
    }

    public final Iterable d(Object object0) {
        return this.c(a3.C(object0));
    }

    public final Iterable e(Iterable iterable0) {
        class com.google.common.graph.l0.d implements Iterable {
            final a3 a;
            final l0 b;

            com.google.common.graph.l0.d(a3 a30) {
                this.a = a30;
                super();
            }

            @Override
            public Iterator iterator() {
                return l0.this.i().e(this.a.i());
            }
        }

        return new com.google.common.graph.l0.d(this, this.j(iterable0));
    }

    public final Iterable f(Object object0) {
        return this.e(a3.C(object0));
    }

    public static l0 g(k0 k00) {
        class com.google.common.graph.l0.a extends l0 {
            final k0 b;

            com.google.common.graph.l0.a(k0 k00, k0 k01) {
                this.b = k01;
                super(k00, null);
            }

            @Override  // com.google.common.graph.l0
            g i() {
                return g.b(this.b);
            }
        }

        return new com.google.common.graph.l0.a(k00, k00);
    }

    public static l0 h(k0 k00) {
        class com.google.common.graph.l0.b extends l0 {
            final k0 b;

            com.google.common.graph.l0.b(k0 k00, k0 k01) {
                this.b = k01;
                super(k00, null);
            }

            @Override  // com.google.common.graph.l0
            g i() {
                return g.c(this.b);
            }
        }

        if(k00 instanceof o) {
            H.e(((o)k00).c(), "Undirected graphs can never be trees.");
        }
        if(k00 instanceof a0) {
            H.e(((a0)k00).c(), "Undirected networks can never be trees.");
        }
        return new com.google.common.graph.l0.b(k00, k00);
    }

    abstract g i();

    private a3 j(Iterable iterable0) {
        a3 a30 = a3.r(iterable0);
        u5 u50 = a30.i();
        while(u50.hasNext()) {
            Object object0 = u50.next();
            this.a.a(object0);
        }
        return a30;
    }
}

