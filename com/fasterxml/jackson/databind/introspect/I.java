package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.util.h;
import j..util.Objects;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

public final class i extends k implements Serializable {
    static final class a implements Serializable {
        protected Class a;
        protected String b;
        private static final long c = 1L;

        public a(Field field0) {
            this.a = field0.getDeclaringClass();
            this.b = field0.getName();
        }
    }

    protected final transient Field d;
    protected a e;
    private static final long f = 1L;

    public i(K k0, Field field0, s s0) {
        super(k0, s0);
        Objects.requireNonNull(field0);
        this.d = field0;
    }

    protected i(a i$a0) {
        super(null, null);
        this.d = null;
        this.e = i$a0;
    }

    Object A() {
        return new i(new a(this.d));
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public AnnotatedElement c() {
        return this.u();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public int e() {
        return this.d.getModifiers();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return h.R(object0, i.class) ? Objects.equals(this.d, ((i)object0).d) : false;
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public Class f() {
        return this.d.getType();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public m g() {
        Type type0 = this.d.getGenericType();
        return this.a.a(type0);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public String getName() {
        return this.d.getName();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public int hashCode() {
        return Objects.hashCode(this.d);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.k
    public Class m() {
        return this.d.getDeclaringClass();
    }

    @Override  // com.fasterxml.jackson.databind.introspect.k
    public Member o() {
        return this.d;
    }

    @Override  // com.fasterxml.jackson.databind.introspect.k
    public Object q(Object object0) throws IllegalArgumentException {
        try {
            return this.d.get(object0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new IllegalArgumentException("Failed to getValue() for field " + this.n() + ": " + illegalAccessException0.getMessage(), illegalAccessException0);
        }
    }

    @Override  // com.fasterxml.jackson.databind.introspect.k
    public void r(Object object0, Object object1) throws IllegalArgumentException {
        try {
            this.d.set(object0, object1);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new IllegalArgumentException("Failed to setValue() for field " + this.n() + ": " + illegalAccessException0.getMessage(), illegalAccessException0);
        }
    }

    @Override  // com.fasterxml.jackson.databind.introspect.k
    public b s(s s0) {
        return this.z(s0);
    }

    @Override  // com.fasterxml.jackson.databind.introspect.b
    public String toString() {
        return "[field " + this.n() + "]";
    }

    public Field u() {
        return this.d;
    }

    public int w() {
        return this.b.size();
    }

    public boolean x() {
        return Modifier.isTransient(this.e());
    }

    Object y() {
        Class class0;
        try {
            class0 = this.e.a;
            Field field0 = class0.getDeclaredField(this.e.b);
            if(!field0.isAccessible()) {
                h.i(field0, false);
            }
            return new i(null, field0, null);
        }
        catch(Exception unused_ex) {
            throw new IllegalArgumentException("Could not find method \'" + this.e.b + "\' from Class \'" + class0.getName());
        }
    }

    public i z(s s0) {
        return new i(this.a, this.d, s0);
    }
}

