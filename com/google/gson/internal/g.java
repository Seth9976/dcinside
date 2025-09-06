package com.google.gson.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.math.BigDecimal;

public final class g extends Number {
    private final String a;

    public g(String s) {
        this.a = s;
    }

    private void a(ObjectInputStream objectInputStream0) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object b() throws ObjectStreamException {
        return new BigDecimal(this.a);
    }

    @Override
    public double doubleValue() {
        return Double.parseDouble(this.a);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 instanceof g) {
            String s = ((g)object0).a;
            return this.a == s || this.a.equals(s);
        }
        return false;
    }

    @Override
    public float floatValue() {
        return Float.parseFloat(this.a);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public int intValue() {
        try {
            return Integer.parseInt(this.a);
        }
        catch(NumberFormatException unused_ex) {
            try {
                return (int)Long.parseLong(this.a);
            }
            catch(NumberFormatException unused_ex) {
                return new BigDecimal(this.a).intValue();
            }
        }
    }

    @Override
    public long longValue() {
        try {
            return Long.parseLong(this.a);
        }
        catch(NumberFormatException unused_ex) {
            return new BigDecimal(this.a).longValue();
        }
    }

    @Override
    public String toString() {
        return this.a;
    }
}

