package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.jsonFormatVisitors.l;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.util.x;
import java.io.Serializable;

public abstract class d {
    static final class a extends com.fasterxml.jackson.databind.ser.d implements Serializable {
        protected final com.fasterxml.jackson.databind.ser.d x;
        protected final Class[] y;
        private static final long z = 1L;

        protected a(com.fasterxml.jackson.databind.ser.d d0, Class[] arr_class) {
            super(d0);
            this.x = d0;
            this.y = arr_class;
        }

        @Override  // com.fasterxml.jackson.databind.ser.d
        public com.fasterxml.jackson.databind.ser.d Q(x x0) {
            return this.X(x0);
        }

        private final boolean W(Class class0) {
            if(class0 == null) {
                return true;
            }
            for(int v = 0; v < this.y.length; ++v) {
                if(this.y[v].isAssignableFrom(class0)) {
                    return true;
                }
            }
            return false;
        }

        public a X(x x0) {
            return new a(this.x.Q(x0), this.y);
        }

        @Override  // com.fasterxml.jackson.databind.ser.d
        public void g(l l0, I i0) throws o {
            if(this.W(i0.n())) {
                super.g(l0, i0);
            }
        }

        @Override  // com.fasterxml.jackson.databind.ser.d
        public void n(Object object0, k k0, I i0) throws Exception {
            if(this.W(i0.n())) {
                this.x.n(object0, k0, i0);
                return;
            }
            this.x.q(object0, k0, i0);
        }

        @Override  // com.fasterxml.jackson.databind.ser.d
        public void o(Object object0, k k0, I i0) throws Exception {
            if(this.W(i0.n())) {
                this.x.o(object0, k0, i0);
                return;
            }
            this.x.p(object0, k0, i0);
        }

        @Override  // com.fasterxml.jackson.databind.ser.d
        public void x(r r0) {
            this.x.x(r0);
        }

        @Override  // com.fasterxml.jackson.databind.ser.d
        public void y(r r0) {
            this.x.y(r0);
        }
    }

    static final class b extends com.fasterxml.jackson.databind.ser.d implements Serializable {
        protected final com.fasterxml.jackson.databind.ser.d x;
        protected final Class y;
        private static final long z = 1L;

        protected b(com.fasterxml.jackson.databind.ser.d d0, Class class0) {
            super(d0);
            this.x = d0;
            this.y = class0;
        }

        @Override  // com.fasterxml.jackson.databind.ser.d
        public com.fasterxml.jackson.databind.ser.d Q(x x0) {
            return this.W(x0);
        }

        public b W(x x0) {
            return new b(this.x.Q(x0), this.y);
        }

        @Override  // com.fasterxml.jackson.databind.ser.d
        public void g(l l0, I i0) throws o {
            Class class0 = i0.n();
            if(class0 == null || this.y.isAssignableFrom(class0)) {
                super.g(l0, i0);
            }
        }

        @Override  // com.fasterxml.jackson.databind.ser.d
        public void n(Object object0, k k0, I i0) throws Exception {
            Class class0 = i0.n();
            if(class0 != null && !this.y.isAssignableFrom(class0)) {
                this.x.q(object0, k0, i0);
                return;
            }
            this.x.n(object0, k0, i0);
        }

        @Override  // com.fasterxml.jackson.databind.ser.d
        public void o(Object object0, k k0, I i0) throws Exception {
            Class class0 = i0.n();
            if(class0 != null && !this.y.isAssignableFrom(class0)) {
                this.x.p(object0, k0, i0);
                return;
            }
            this.x.o(object0, k0, i0);
        }

        @Override  // com.fasterxml.jackson.databind.ser.d
        public void x(r r0) {
            this.x.x(r0);
        }

        @Override  // com.fasterxml.jackson.databind.ser.d
        public void y(r r0) {
            this.x.y(r0);
        }
    }

    public static com.fasterxml.jackson.databind.ser.d a(com.fasterxml.jackson.databind.ser.d d0, Class[] arr_class) {
        return arr_class.length == 1 ? new b(d0, arr_class[0]) : new a(d0, arr_class);
    }
}

