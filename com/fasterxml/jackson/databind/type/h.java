package com.fasterxml.jackson.databind.type;

import java.util.Collection;
import java.util.Map;

public enum h {
    Array,
    Collection,
    Map,
    POJO,
    Untyped,
    Integer,
    Float,
    Boolean,
    Enum,
    Textual,
    Binary,
    DateTime,
    OtherScalar;

    public static h a(Class class0, h h0) {
        if(class0.isEnum()) {
            return h.i;
        }
        if(class0.isArray()) {
            return class0 == byte[].class ? h.k : h.a;
        }
        if(Collection.class.isAssignableFrom(class0)) {
            return h.b;
        }
        if(Map.class.isAssignableFrom(class0)) {
            return h.c;
        }
        return class0 == String.class ? h.j : h0;
    }
}

