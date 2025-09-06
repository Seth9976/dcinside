package com.google.common.graph;

import J1.a;
import O1.j;
import com.google.common.base.B;
import com.google.common.base.H;
import com.google.common.collect.q3;
import com.google.common.collect.u5;
import java.util.Iterator;

@a
@j(containerOf = {"N"})
@x
public abstract class y implements Iterable {
    static class com.google.common.graph.y.a {
    }

    static final class b extends y {
        private b(Object object0, Object object1) {
            super(object0, object1, null);
        }

        b(Object object0, Object object1, com.google.common.graph.y.a y$a0) {
            this(object0, object1);
        }

        @Override  // com.google.common.graph.y
        public boolean b() [...] // Inlined contents

        @Override  // com.google.common.graph.y
        public boolean equals(@o3.a Object object0) {
            if(object0 == this) {
                return true;
            }
            if(!(object0 instanceof y)) {
                return false;
            }
            return ((y)object0).b() ? this.k().equals(((y)object0).k()) && this.l().equals(((y)object0).l()) : false;
        }

        @Override  // com.google.common.graph.y
        public int hashCode() {
            return B.b(new Object[]{this.k(), this.l()});
        }

        @Override  // com.google.common.graph.y
        public Iterator iterator() {
            return super.c();
        }

        @Override  // com.google.common.graph.y
        public Object k() {
            return this.d();
        }

        @Override  // com.google.common.graph.y
        public Object l() {
            return this.g();
        }

        @Override
        public String toString() {
            return "<" + this.k() + " -> " + this.l() + ">";
        }
    }

    static final class c extends y {
        private c(Object object0, Object object1) {
            super(object0, object1, null);
        }

        c(Object object0, Object object1, com.google.common.graph.y.a y$a0) {
            this(object0, object1);
        }

        @Override  // com.google.common.graph.y
        public boolean b() [...] // Inlined contents

        @Override  // com.google.common.graph.y
        public boolean equals(@o3.a Object object0) {
            if(object0 == this) {
                return true;
            }
            if(!(object0 instanceof y)) {
                return false;
            }
            if(((y)object0).b()) {
                return false;
            }
            return this.d().equals(((y)object0).d()) ? this.g().equals(((y)object0).g()) : this.d().equals(((y)object0).g()) && this.g().equals(((y)object0).d());
        }

        @Override  // com.google.common.graph.y
        public int hashCode() {
            return this.d().hashCode() + this.g().hashCode();
        }

        @Override  // com.google.common.graph.y
        public Iterator iterator() {
            return super.c();
        }

        @Override  // com.google.common.graph.y
        public Object k() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don\'t.");
        }

        @Override  // com.google.common.graph.y
        public Object l() {
            throw new UnsupportedOperationException("Cannot call source()/target() on a EndpointPair from an undirected graph. Consider calling adjacentNode(node) if you already have a node, or nodeU()/nodeV() if you don\'t.");
        }

        @Override
        public String toString() {
            return "[" + this.d() + ", " + this.g() + "]";
        }
    }

    private final Object a;
    private final Object b;

    private y(Object object0, Object object1) {
        this.a = H.E(object0);
        this.b = H.E(object1);
    }

    y(Object object0, Object object1, com.google.common.graph.y.a y$a0) {
        this(object0, object1);
    }

    public final Object a(Object object0) {
        if(object0.equals(this.a)) {
            return this.b;
        }
        if(!object0.equals(this.b)) {
            throw new IllegalArgumentException("EndpointPair " + this + " does not contain node " + object0);
        }
        return this.a;
    }

    public abstract boolean b();

    public final u5 c() {
        return q3.A(new Object[]{this.a, this.b});
    }

    public final Object d() {
        return this.a;
    }

    @Override
    public abstract boolean equals(@o3.a Object arg1);

    public final Object g() {
        return this.b;
    }

    // 去混淆评级： 低(20)
    static y h(E e0, Object object0, Object object1) {
        return e0.c() ? y.j(object0, object1) : y.m(object0, object1);
    }

    @Override
    public abstract int hashCode();

    // 去混淆评级： 低(20)
    static y i(a0 a00, Object object0, Object object1) {
        return a00.c() ? y.j(object0, object1) : y.m(object0, object1);
    }

    @Override
    public Iterator iterator() {
        return this.c();
    }

    public static y j(Object object0, Object object1) {
        return new b(object0, object1, null);
    }

    public abstract Object k();

    public abstract Object l();

    public static y m(Object object0, Object object1) {
        return new c(object1, object0, null);
    }
}

