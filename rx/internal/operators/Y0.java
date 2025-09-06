package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.exceptions.c;
import rx.g.b;
import rx.j;
import rx.n;
import rx.observers.g;

public final class y0 implements b {
    final class a extends n {
        final n f;
        final rx.j.a g;
        List h;
        boolean i;
        final y0 j;

        public a(n n0, rx.j.a j$a0) {
            this.f = n0;
            this.g = j$a0;
            this.h = new ArrayList();
        }

        void Q() {
            class rx.internal.operators.y0.a.a implements rx.functions.a {
                final a a;

                @Override  // rx.functions.a
                public void call() {
                    a.this.x();
                }
            }

            rx.internal.operators.y0.a.a y0$a$a0 = () -> {
                List list0;
                synchronized(a.this) {
                    if(a.this.i) {
                        return;
                    }
                    list0 = a.this.h;
                    a.this.h = new ArrayList();
                }
                try {
                    a.this.f.onNext(list0);
                }
                catch(Throwable throwable0) {
                    c.f(throwable0, a.this);
                }
            };
            this.g.e(y0$a$a0, y0.this.a, y0.this.a, y0.this.c);
        }

        @Override  // rx.h
        public void d() {
            List list0;
            try {
                this.g.l();
                synchronized(this) {
                    if(this.i) {
                        return;
                    }
                    this.i = true;
                    list0 = this.h;
                    this.h = null;
                }
                this.f.onNext(list0);
            }
            catch(Throwable throwable0) {
                c.f(throwable0, this.f);
                return;
            }
            this.f.d();
            this.l();
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            synchronized(this) {
                if(this.i) {
                    return;
                }
                this.i = true;
                this.h = null;
            }
            this.f.onError(throwable0);
            this.l();
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            List list0;
            synchronized(this) {
                if(this.i) {
                    return;
                }
                this.h.add(object0);
                if(this.h.size() == y0.this.d) {
                    list0 = this.h;
                    this.h = new ArrayList();
                }
                else {
                    list0 = null;
                }
            }
            if(list0 != null) {
                this.f.onNext(list0);
            }
        }

        // 检测为 Lambda 实现
        void x() [...]
    }

    final class rx.internal.operators.y0.b extends n {
        final n f;
        final rx.j.a g;
        final List h;
        boolean i;
        final y0 j;

        public rx.internal.operators.y0.b(n n0, rx.j.a j$a0) {
            this.f = n0;
            this.g = j$a0;
            this.h = new LinkedList();
        }

        void Q() {
            class rx.internal.operators.y0.b.a implements rx.functions.a {
                final rx.internal.operators.y0.b a;

                @Override  // rx.functions.a
                public void call() {
                    rx.internal.operators.y0.b.this.R();
                }
            }

            rx.internal.operators.y0.b.a y0$b$a0 = () -> {
                class rx.internal.operators.y0.b.b implements rx.functions.a {
                    final List a;
                    final rx.internal.operators.y0.b b;

                    rx.internal.operators.y0.b.b(List list0) {
                        this.a = list0;
                        super();
                    }

                    @Override  // rx.functions.a
                    public void call() {
                        rx.internal.operators.y0.b.this.x(this.a);
                    }
                }

                ArrayList arrayList0 = new ArrayList();
                synchronized(rx.internal.operators.y0.b.this) {
                    if(rx.internal.operators.y0.b.this.i) {
                        return;
                    }
                    rx.internal.operators.y0.b.this.h.add(arrayList0);
                }
                rx.internal.operators.y0.b.b y0$b$b0 = new rx.internal.operators.y0.b.b(rx.internal.operators.y0.b.this, arrayList0);
                rx.internal.operators.y0.b.this.g.d(y0$b$b0, y0.this.a, y0.this.c);
            };
            this.g.e(y0$b$a0, y0.this.b, y0.this.b, y0.this.c);
        }

        // 检测为 Lambda 实现
        void R() [...]

        @Override  // rx.h
        public void d() {
            try {
                synchronized(this) {
                    if(this.i) {
                        return;
                    }
                    this.i = true;
                    LinkedList linkedList0 = new LinkedList(this.h);
                    this.h.clear();
                }
                for(Object object0: linkedList0) {
                    this.f.onNext(((List)object0));
                }
            }
            catch(Throwable throwable0) {
                c.f(throwable0, this.f);
                return;
            }
            this.f.d();
            this.l();
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            synchronized(this) {
                if(this.i) {
                    return;
                }
                this.i = true;
                this.h.clear();
            }
            this.f.onError(throwable0);
            this.l();
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            synchronized(this) {
                if(this.i) {
                    return;
                }
                LinkedList linkedList0 = null;
                Iterator iterator0 = this.h.iterator();
                while(iterator0.hasNext()) {
                    Object object1 = iterator0.next();
                    List list0 = (List)object1;
                    list0.add(object0);
                    if(list0.size() == y0.this.d) {
                        iterator0.remove();
                        if(linkedList0 == null) {
                            linkedList0 = new LinkedList();
                        }
                        linkedList0.add(list0);
                    }
                }
            }
            if(linkedList0 != null) {
                for(Object object2: linkedList0) {
                    this.f.onNext(((List)object2));
                }
            }
        }

        void x(List list0) {
            synchronized(this) {
                if(this.i) {
                    return;
                }
                boolean z = false;
                Iterator iterator0 = this.h.iterator();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    if(((List)object0) == list0) {
                        iterator0.remove();
                        z = true;
                        break;
                    }
                }
            }
            if(z) {
                try {
                    this.f.onNext(list0);
                }
                catch(Throwable throwable0) {
                    c.f(throwable0, this);
                }
            }
        }
    }

    final long a;
    final long b;
    final TimeUnit c;
    final int d;
    final j e;

    public y0(long v, long v1, TimeUnit timeUnit0, int v2, j j0) {
        this.a = v;
        this.b = v1;
        this.c = timeUnit0;
        this.d = v2;
        this.e = j0;
    }

    public n a(n n0) {
        rx.j.a j$a0 = this.e.a();
        g g0 = new g(n0);
        if(this.a == this.b) {
            n n1 = new a(this, g0, j$a0);
            n1.q(j$a0);
            n0.q(n1);
            ((a)n1).Q();
            return n1;
        }
        n n2 = new rx.internal.operators.y0.b(this, g0, j$a0);
        n2.q(j$a0);
        n0.q(n2);
        ((rx.internal.operators.y0.b)n2).R();
        ((rx.internal.operators.y0.b)n2).Q();
        return n2;
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a(((n)object0));
    }
}

