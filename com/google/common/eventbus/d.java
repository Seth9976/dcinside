package com.google.common.eventbus;

import com.google.common.base.H;
import com.google.common.collect.g4;
import j..util.Objects;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

@e
abstract class d {
    static class a {
    }

    static final class b extends d {
        private static final b a;

        static {
            b.a = new b();
        }

        @Override  // com.google.common.eventbus.d
        void a(Object object0, Iterator iterator0) {
            H.E(object0);
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                ((j)object1).d(object0);
            }
        }
    }

    static final class c extends d {
        static final class com.google.common.eventbus.d.c.a {
            private final Object a;
            private final j b;

            private com.google.common.eventbus.d.c.a(Object object0, j j0) {
                this.a = object0;
                this.b = j0;
            }

            com.google.common.eventbus.d.c.a(Object object0, j j0, a d$a0) {
                this(object0, j0);
            }
        }

        private final ConcurrentLinkedQueue a;

        private c() {
            this.a = g4.f();
        }

        c(a d$a0) {
        }

        @Override  // com.google.common.eventbus.d
        void a(Object object0, Iterator iterator0) {
            H.E(object0);
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                com.google.common.eventbus.d.c.a d$c$a0 = new com.google.common.eventbus.d.c.a(object0, ((j)object1), null);
                this.a.add(d$c$a0);
            }
            com.google.common.eventbus.d.c.a d$c$a1;
            while((d$c$a1 = (com.google.common.eventbus.d.c.a)this.a.poll()) != null) {
                d$c$a1.b.d(d$c$a1.a);
            }
        }
    }

    static final class com.google.common.eventbus.d.d extends d {
        class com.google.common.eventbus.d.d.a extends ThreadLocal {
            protected Queue a() {
                return g4.d();
            }

            @Override
            protected Object initialValue() {
                return this.a();
            }
        }

        class com.google.common.eventbus.d.d.b extends ThreadLocal {
            protected Boolean a() {
                return false;
            }

            @Override
            protected Object initialValue() {
                return this.a();
            }
        }

        static final class com.google.common.eventbus.d.d.c {
            private final Object a;
            private final Iterator b;

            private com.google.common.eventbus.d.d.c(Object object0, Iterator iterator0) {
                this.a = object0;
                this.b = iterator0;
            }

            com.google.common.eventbus.d.d.c(Object object0, Iterator iterator0, a d$a0) {
                this(object0, iterator0);
            }
        }

        private final ThreadLocal a;
        private final ThreadLocal b;

        private com.google.common.eventbus.d.d() {
            this.a = new com.google.common.eventbus.d.d.a(this);
            this.b = new com.google.common.eventbus.d.d.b(this);
        }

        com.google.common.eventbus.d.d(a d$a0) {
        }

        @Override  // com.google.common.eventbus.d
        void a(Object object0, Iterator iterator0) {
            H.E(object0);
            H.E(iterator0);
            Queue queue0 = (Queue)this.a.get();
            Objects.requireNonNull(queue0);
            queue0.offer(new com.google.common.eventbus.d.d.c(object0, iterator0, null));
            if(!((Boolean)this.b.get()).booleanValue()) {
                this.b.set(Boolean.TRUE);
                try {
                    com.google.common.eventbus.d.d.c d$d$c0;
                    while((d$d$c0 = (com.google.common.eventbus.d.d.c)queue0.poll()) != null) {
                        while(d$d$c0.b.hasNext()) {
                            Object object1 = d$d$c0.b.next();
                            ((j)object1).d(d$d$c0.a);
                        }
                    }
                }
                finally {
                    this.b.remove();
                    this.a.remove();
                }
            }
        }
    }

    abstract void a(Object arg1, Iterator arg2);

    static d b() {
        return b.a;
    }

    static d c() {
        return new c(null);
    }

    static d d() {
        return new com.google.common.eventbus.d.d(null);
    }
}

