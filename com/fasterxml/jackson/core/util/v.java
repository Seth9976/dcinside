package com.fasterxml.jackson.core.util;

import java.io.IOException;
import java.io.Serializable;

public class v implements Serializable {
    protected byte[] a;
    protected CharSequence b;
    protected String c;
    private static final long d = 1L;

    public v(CharSequence charSequence0) {
        if(charSequence0 == null) {
            throw new IllegalArgumentException();
        }
        this.b = charSequence0;
    }

    public v(byte[] arr_b, String s) {
        if(arr_b == null) {
            throw new IllegalArgumentException();
        }
        this.a = arr_b;
        if(s == null || s.isEmpty()) {
            s = "UTF-8";
        }
        this.c = s;
    }

    public Object a() {
        byte[] arr_b = this.a;
        return arr_b != null ? arr_b : this.b;
    }

    @Override
    public String toString() {
        byte[] arr_b = this.a;
        if(arr_b != null) {
            try {
                return new String(arr_b, this.c);
            }
            catch(IOException iOException0) {
                throw new RuntimeException(iOException0);
            }
        }
        return this.b.toString();
    }
}

