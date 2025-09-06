package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.m;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Modifier;

public abstract class b {
    @Deprecated
    public abstract Iterable b();

    public abstract AnnotatedElement c();

    public abstract Annotation d(Class arg1);

    protected abstract int e();

    @Override
    public abstract boolean equals(Object arg1);

    public abstract Class f();

    public abstract m g();

    public abstract String getName();

    public abstract boolean h(Class arg1);

    @Override
    public abstract int hashCode();

    public abstract boolean i(Class[] arg1);

    public boolean j() {
        return Modifier.isPublic(this.e());
    }

    @Override
    public abstract String toString();
}

