package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.h;
import com.google.gson.stream.c;
import com.google.gson.stream.d;
import com.google.gson.w;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class ObjectTypeAdapter extends TypeAdapter {
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

    private final Gson a;
    private final x b;
    private static final y c;

    static {
        ObjectTypeAdapter.c = ObjectTypeAdapter.k(w.a);
    }

    private ObjectTypeAdapter(Gson gson0, x x0) {
        this.a = gson0;
        this.b = x0;
    }

    ObjectTypeAdapter(Gson gson0, x x0, com.google.gson.internal.bind.ObjectTypeAdapter.1 objectTypeAdapter$10) {
        this(gson0, x0);
    }

    @Override  // com.google.gson.TypeAdapter
    public Object e(com.google.gson.stream.a a0) throws IOException {
        c c0 = a0.f0();
        Object object0 = this.m(a0, c0);
        if(object0 == null) {
            return this.l(a0, c0);
        }
        ArrayDeque arrayDeque0 = new ArrayDeque();
        while(true) {
            if(a0.p()) {
                String s = object0 instanceof Map ? a0.Q() : null;
                c c1 = a0.f0();
                Object object1 = this.m(a0, c1);
                boolean z = object1 != null;
                if(object1 == null) {
                    object1 = this.l(a0, c1);
                }
                if(object0 instanceof List) {
                    ((List)object0).add(object1);
                }
                else {
                    ((Map)object0).put(s, object1);
                }
                if(!z) {
                    continue;
                }
                arrayDeque0.addLast(object0);
                object0 = object1;
            }
            else {
                if(object0 instanceof List) {
                    a0.i();
                }
                else {
                    a0.j();
                }
                if(arrayDeque0.isEmpty()) {
                    break;
                }
                object0 = arrayDeque0.removeLast();
            }
        }
        return object0;
    }

    @Override  // com.google.gson.TypeAdapter
    public void i(d d0, Object object0) throws IOException {
        if(object0 == null) {
            d0.v();
            return;
        }
        Class class0 = object0.getClass();
        TypeAdapter typeAdapter0 = this.a.u(class0);
        if(typeAdapter0 instanceof ObjectTypeAdapter) {
            d0.e();
            d0.j();
            return;
        }
        typeAdapter0.i(d0, object0);
    }

    public static y j(x x0) {
        return x0 == w.a ? ObjectTypeAdapter.c : ObjectTypeAdapter.k(x0);
    }

    private static y k(x x0) {
        return new y() {
            @Override  // com.google.gson.y
            public TypeAdapter a(Gson gson0, com.google.gson.reflect.a a0) {
                return a0.f() == Object.class ? new ObjectTypeAdapter(gson0, x0, null) : null;
            }
        };
    }

    private Object l(com.google.gson.stream.a a0, c c0) throws IOException {
        switch(c0) {
            case 3: {
                return a0.d0();
            }
            case 4: {
                return this.b.a(a0);
            }
            case 5: {
                return Boolean.valueOf(a0.v());
            }
            case 6: {
                a0.T();
                return null;
            }
            default: {
                throw new IllegalStateException("Unexpected token: " + c0);
            }
        }
    }

    private Object m(com.google.gson.stream.a a0, c c0) throws IOException {
        switch(c0) {
            case 1: {
                a0.a();
                return new ArrayList();
            }
            case 2: {
                a0.b();
                return new h();
            }
            default: {
                return null;
            }
        }
    }
}

