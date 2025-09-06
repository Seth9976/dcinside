package com.google.crypto.tink.internal;

import com.google.gson.TypeAdapter;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.p;
import com.google.gson.stream.c;
import com.google.gson.stream.d;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.StringReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import o3.h;

public final class JsonParser {
    static final class JsonElementTypeAdapter extends TypeAdapter {
        private static final int a = 100;

        private JsonElementTypeAdapter() {
        }

        JsonElementTypeAdapter(a jsonParser$a0) {
        }

        @Override  // com.google.gson.TypeAdapter
        public Object e(com.google.gson.stream.a a0) throws IOException {
            return this.j(a0);
        }

        @Override  // com.google.gson.TypeAdapter
        public void i(d d0, Object object0) throws IOException {
            this.m(d0, ((j)object0));
        }

        public j j(com.google.gson.stream.a a0) throws IOException {
            String s;
            c c0 = a0.f0();
            j j0 = this.l(a0, c0);
            if(j0 == null) {
                return this.k(a0, c0);
            }
            ArrayDeque arrayDeque0 = new ArrayDeque();
            while(true) {
                if(a0.p()) {
                    if(j0 instanceof m) {
                        s = a0.Q();
                        if(!JsonParser.b(s)) {
                            throw new IOException("illegal characters in string");
                        }
                    }
                    else {
                        s = null;
                    }
                    c c1 = a0.f0();
                    j j1 = this.l(a0, c1);
                    boolean z = j1 != null;
                    if(j1 == null) {
                        j1 = this.k(a0, c1);
                    }
                    if(j0 instanceof g) {
                        ((g)j0).z(j1);
                        goto label_21;
                    }
                    else {
                        if(((m)j0).K(s)) {
                            throw new IOException("duplicate key: " + s);
                        }
                        ((m)j0).z(s, j1);
                    label_21:
                        if(!z) {
                            continue;
                        }
                        arrayDeque0.addLast(j0);
                        if(arrayDeque0.size() > 100) {
                            throw new IOException("too many recursions");
                        }
                        j0 = j1;
                        continue;
                    }
                }
                if(j0 instanceof g) {
                    a0.i();
                }
                else {
                    a0.j();
                }
                if(arrayDeque0.isEmpty()) {
                    return j0;
                }
                j0 = (j)arrayDeque0.removeLast();
            }
        }

        private j k(com.google.gson.stream.a a0, c c0) throws IOException {
            switch(c0) {
                case 3: {
                    String s = a0.d0();
                    if(!JsonParser.b(s)) {
                        throw new IOException("illegal characters in string");
                    }
                    return new p(s);
                }
                case 4: {
                    return new p(new b(a0.d0()));
                }
                case 5: {
                    return new p(Boolean.valueOf(a0.v()));
                }
                case 6: {
                    a0.T();
                    return l.a;
                }
                default: {
                    throw new IllegalStateException("Unexpected token: " + c0);
                }
            }
        }

        @h
        private j l(com.google.gson.stream.a a0, c c0) throws IOException {
            switch(a.a[c0.ordinal()]) {
                case 1: {
                    a0.a();
                    return new g();
                }
                case 2: {
                    a0.b();
                    return new m();
                }
                default: {
                    return null;
                }
            }
        }

        public void m(d d0, j j0) {
            throw new UnsupportedOperationException("write is not supported");
        }
    }

    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[c.values().length];
            a.a = arr_v;
            try {
                arr_v[c.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.f.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.g.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.h.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.i.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static final class b extends Number {
        private final String a;

        public b(String s) {
            this.a = s;
        }

        private void a(ObjectInputStream objectInputStream0) throws NotSerializableException {
            throw new NotSerializableException("serialization is not supported");
        }

        private Object b() throws NotSerializableException {
            throw new NotSerializableException("serialization is not supported");
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
            return object0 instanceof b ? this.a.equals(((b)object0).a) : false;
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

    private static final JsonElementTypeAdapter a;

    static {
        JsonParser.a = new JsonElementTypeAdapter(null);
    }

    public static long a(j j0) {
        if(!(j0.q() instanceof b)) {
            throw new IllegalArgumentException("does not contain a parsed number.");
        }
        return Long.parseLong(j0.q().toString());
    }

    public static boolean b(String s) {
        int v = s.length();
        int v1 = 0;
        while(true) {
            if(v1 == v) {
                return true;
            }
            int v2 = s.charAt(v1);
            if(Character.isSurrogate(((char)v2))) {
                if(!Character.isLowSurrogate(((char)v2)) && v1 + 1 != v && Character.isLowSurrogate(s.charAt(v1 + 1))) {
                    v1 += 2;
                    continue;
                }
                return false;
            }
            ++v1;
        }
    }

    public static j c(String s) throws IOException {
        try {
            com.google.gson.stream.a a0 = new com.google.gson.stream.a(new StringReader(s));
            a0.E0(false);
            return JsonParser.a.j(a0);
        }
        catch(NumberFormatException numberFormatException0) {
            throw new IOException(numberFormatException0);
        }
    }
}

