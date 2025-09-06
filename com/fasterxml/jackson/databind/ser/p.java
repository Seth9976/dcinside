package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.introspect.v;
import com.fasterxml.jackson.databind.introspect.y;
import com.fasterxml.jackson.databind.jsonFormatVisitors.l;
import com.fasterxml.jackson.databind.node.u;
import com.fasterxml.jackson.databind.o;
import java.io.Serializable;
import java.lang.annotation.Annotation;

public abstract class p extends y implements Serializable {
    private static final long d = 1L;

    protected p(A a0) {
        super(a0);
    }

    protected p(v v0) {
        super(v0.getMetadata());
    }

    protected p(p p0) {
        super(p0);
    }

    @Override  // com.fasterxml.jackson.databind.d
    public abstract B a();

    @Override  // com.fasterxml.jackson.databind.d
    public abstract Annotation b(Class arg1);

    @Override  // com.fasterxml.jackson.databind.d
    public abstract void g(l arg1, I arg2) throws o;

    @Override  // com.fasterxml.jackson.databind.d
    public abstract Annotation getAnnotation(Class arg1);

    @Override  // com.fasterxml.jackson.databind.d
    public abstract String getName();

    @Deprecated
    public abstract void l(u arg1, I arg2) throws o;

    public Annotation m(Class class0) {
        Annotation annotation0 = this.getAnnotation(class0);
        return annotation0 == null ? this.b(class0) : annotation0;
    }

    public abstract void n(Object arg1, k arg2, I arg3) throws Exception;

    public abstract void o(Object arg1, k arg2, I arg3) throws Exception;

    public abstract void p(Object arg1, k arg2, I arg3) throws Exception;

    public abstract void q(Object arg1, k arg2, I arg3) throws Exception;
}

