package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.databind.H;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.ser.std.P;
import com.fasterxml.jackson.databind.util.z;
import java.io.IOException;

public class s extends P {
    public s() {
        super(Object.class);
    }

    public s(Class class0) {
        super(class0);
    }

    protected void P(I i0, Object object0) throws o {
        Class class0 = object0.getClass();
        if(z.d(class0)) {
            i0.E(this.g(), String.format("No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS). This appears to be a native image, in which case you may need to configure reflection for the class that is to be serialized", class0.getName()));
            return;
        }
        i0.E(this.g(), String.format("No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)", class0.getName()));
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.P
    public void m(Object object0, k k0, I i0) throws IOException {
        if(i0.D0(H.e)) {
            this.P(i0, object0);
        }
        super.m(object0, k0, i0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.P
    public void n(Object object0, k k0, I i0, j j0) throws IOException {
        if(i0.D0(H.e)) {
            this.P(i0, object0);
        }
        super.n(object0, k0, i0, j0);
    }
}

