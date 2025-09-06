package com.fasterxml.jackson.databind.jsontype;

import j..util.Objects;
import java.io.Serializable;

public final class c implements Serializable {
    protected final Class a;
    protected final int b;
    protected String c;
    private static final long d = 1L;

    public c(Class class0) {
        this(class0, null);
    }

    public c(Class class0, String s) {
        this.a = class0;
        this.b = class0.getName().hashCode() + (s == null ? 0 : s.hashCode());
        this.c(s);
    }

    public Class a() {
        return this.a;
    }

    public boolean b() {
        return this.c != null;
    }

    public void c(String s) {
        if(s == null || s.isEmpty()) {
            s = null;
        }
        this.c = s;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        return object0.getClass() == c.class ? this.a == ((c)object0).a && Objects.equals(this.c, ((c)object0).c) : false;
    }

    public String getName() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return this.b;
    }

    @Override
    public String toString() {
        return "[NamedType, class " + this.a.getName() + ", name: " + (this.c == null ? "null" : "\'" + this.c + "\'") + "]";
    }
}

