package com.google.gson;

import j..util.Objects;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

public final class b {
    private final Field a;

    public b(Field field0) {
        Objects.requireNonNull(field0);
        this.a = field0;
    }

    public Annotation a(Class class0) {
        return this.a.getAnnotation(class0);
    }

    public Collection b() {
        return Arrays.asList(this.a.getAnnotations());
    }

    public Class c() {
        return this.a.getType();
    }

    public Type d() {
        return this.a.getGenericType();
    }

    public Class e() {
        return this.a.getDeclaringClass();
    }

    public String f() {
        return this.a.getName();
    }

    public boolean g(int v) {
        return (v & this.a.getModifiers()) != 0;
    }

    @Override
    public String toString() {
        return this.a.toString();
    }
}

