package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.introspect.b;
import com.fasterxml.jackson.databind.introspect.o;
import com.fasterxml.jackson.databind.introspect.p;
import java.beans.ConstructorProperties;
import java.beans.Transient;

public class i extends h {
    private final Class b;

    public i() {
        this.b = ConstructorProperties.class;
    }

    @Override  // com.fasterxml.jackson.databind.ext.h
    public B a(o o0) {
        p p0 = o0.w();
        if(p0 != null) {
            ConstructorProperties constructorProperties0 = (ConstructorProperties)p0.d(ConstructorProperties.class);
            if(constructorProperties0 != null) {
                String[] arr_s = constructorProperties0.value();
                int v = o0.u();
                return v >= arr_s.length ? null : B.a(arr_s[v]);
            }
        }
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.ext.h
    public Boolean b(b b0) {
        Transient transient0 = (Transient)b0.d(Transient.class);
        return transient0 == null ? null : Boolean.valueOf(transient0.value());
    }

    @Override  // com.fasterxml.jackson.databind.ext.h
    public Boolean c(b b0) {
        return ((ConstructorProperties)b0.d(ConstructorProperties.class)) == null ? null : true;
    }
}

