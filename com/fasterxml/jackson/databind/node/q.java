package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.p;
import java.util.Iterator;
import java.util.Map.Entry;

abstract class q extends com.fasterxml.jackson.core.q {
    public static final class a extends q {
        protected Iterator j;
        protected p k;

        public a(p p0, q q0) {
            super(1, q0);
            this.j = p0.y0();
        }

        @Override  // com.fasterxml.jackson.databind.node.q
        public com.fasterxml.jackson.core.q f() {
            return super.u();
        }

        @Override  // com.fasterxml.jackson.databind.node.q
        public p t() {
            return this.k;
        }

        @Override  // com.fasterxml.jackson.databind.node.q
        public r w() {
            if(!this.j.hasNext()) {
                this.k = null;
                return r.n;
            }
            ++this.b;
            Object object0 = this.j.next();
            this.k = (p)object0;
            return ((p)object0).h();
        }

        @Override  // com.fasterxml.jackson.databind.node.q
        public q y() {
            return new a(this.k, this);
        }

        @Override  // com.fasterxml.jackson.databind.node.q
        public q z() {
            return new b(this.k, this);
        }
    }

    public static final class b extends q {
        protected Iterator j;
        protected Map.Entry k;
        protected boolean l;

        public b(p p0, q q0) {
            super(2, q0);
            this.j = p0.A0();
            this.l = true;
        }

        @Override  // com.fasterxml.jackson.databind.node.q
        public com.fasterxml.jackson.core.q f() {
            return super.u();
        }

        @Override  // com.fasterxml.jackson.databind.node.q
        public p t() {
            return this.k == null ? null : ((p)this.k.getValue());
        }

        @Override  // com.fasterxml.jackson.databind.node.q
        public r w() {
            String s = null;
            if(this.l) {
                if(!this.j.hasNext()) {
                    this.h = null;
                    this.k = null;
                    return r.l;
                }
                ++this.b;
                this.l = false;
                Object object0 = this.j.next();
                this.k = (Map.Entry)object0;
                if(((Map.Entry)object0) != null) {
                    s = (String)((Map.Entry)object0).getKey();
                }
                this.h = s;
                return r.o;
            }
            this.l = true;
            return ((p)this.k.getValue()).h();
        }

        @Override  // com.fasterxml.jackson.databind.node.q
        public q y() {
            return new a(this.t(), this);
        }

        @Override  // com.fasterxml.jackson.databind.node.q
        public q z() {
            return new b(this.t(), this);
        }
    }

    public static final class c extends q {
        protected p j;
        protected boolean k;

        public c(p p0, q q0) {
            super(0, q0);
            this.k = false;
            this.j = p0;
        }

        @Override  // com.fasterxml.jackson.databind.node.q
        public com.fasterxml.jackson.core.q f() {
            return super.u();
        }

        // 去混淆评级： 低(20)
        @Override  // com.fasterxml.jackson.databind.node.q
        public p t() {
            return this.k ? this.j : null;
        }

        @Override  // com.fasterxml.jackson.databind.node.q
        public r w() {
            if(!this.k) {
                ++this.b;
                this.k = true;
                return this.j.h();
            }
            this.j = null;
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.node.q
        public void x(String s) {
        }

        @Override  // com.fasterxml.jackson.databind.node.q
        public q y() {
            return new a(this.j, this);
        }

        @Override  // com.fasterxml.jackson.databind.node.q
        public q z() {
            return new b(this.j, this);
        }
    }

    protected final q g;
    protected String h;
    protected Object i;

    public q(int v, q q0) {
        this.a = v;
        this.b = -1;
        this.g = q0;
    }

    @Override  // com.fasterxml.jackson.core.q
    public final String b() {
        return this.h;
    }

    @Override  // com.fasterxml.jackson.core.q
    public Object c() {
        return this.i;
    }

    @Override  // com.fasterxml.jackson.core.q
    public com.fasterxml.jackson.core.q f() {
        return this.u();
    }

    @Override  // com.fasterxml.jackson.core.q
    public void q(Object object0) {
        this.i = object0;
    }

    public abstract p t();

    public final q u() {
        return this.g;
    }

    public final q v() {
        p p0 = this.t();
        if(p0 == null) {
            throw new IllegalStateException("No current node");
        }
        if(p0.isArray()) {
            return new a(p0, this);
        }
        if(!p0.M()) {
            throw new IllegalStateException("Current node of type " + p0.getClass().getName());
        }
        return new b(p0, this);
    }

    public abstract r w();

    public void x(String s) {
        this.h = s;
    }

    public abstract q y();

    public abstract q z();
}

