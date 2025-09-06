package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.c;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.type.b;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.HashMap;

public class a extends com.fasterxml.jackson.databind.a implements Serializable {
    protected final HashMap a;
    private static final long b = 1L;

    public a() {
        this.a = new HashMap();
    }

    @Override  // com.fasterxml.jackson.databind.a
    public m a(g g0, m m0) {
        b b0 = new b(m0.g());
        Class class0 = (Class)this.a.get(b0);
        return class0 == null ? null : g0.S().b0(m0, class0);
    }

    @Override  // com.fasterxml.jackson.databind.a
    public m b(g g0, c c0) {
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.a
    @Deprecated
    public m c(g g0, m m0) {
        return null;
    }

    public a d(Class class0, Class class1) {
        if(class0 == class1) {
            throw new IllegalArgumentException("Cannot add mapping from class to itself");
        }
        if(!class0.isAssignableFrom(class1)) {
            throw new IllegalArgumentException("Cannot add mapping from class " + class0.getName() + " to " + class1.getName() + ", as latter is not a subtype of former");
        }
        if(!Modifier.isAbstract(class0.getModifiers())) {
            throw new IllegalArgumentException("Cannot add mapping from class " + class0.getName() + " since it is not abstract");
        }
        b b0 = new b(class0);
        this.a.put(b0, class1);
        return this;
    }
}

