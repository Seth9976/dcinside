package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.b;
import com.google.gson.internal.f;
import com.google.gson.internal.j;
import com.google.gson.internal.n;
import com.google.gson.p;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import com.google.gson.stream.d;
import com.google.gson.t;
import com.google.gson.y;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Map;

public final class MapTypeAdapterFactory implements y {
    final class Adapter extends TypeAdapter {
        private final TypeAdapter a;
        private final TypeAdapter b;
        private final j c;
        final MapTypeAdapterFactory d;

        public Adapter(Gson gson0, Type type0, TypeAdapter typeAdapter0, Type type1, TypeAdapter typeAdapter1, j j0) {
            this.a = new TypeAdapterRuntimeTypeWrapper(gson0, typeAdapter0, type0);
            this.b = new TypeAdapterRuntimeTypeWrapper(gson0, typeAdapter1, type1);
            this.c = j0;
        }

        @Override  // com.google.gson.TypeAdapter
        public Object e(a a0) throws IOException {
            return this.k(a0);
        }

        @Override  // com.google.gson.TypeAdapter
        public void i(d d0, Object object0) throws IOException {
            this.l(d0, ((Map)object0));
        }

        private String j(com.google.gson.j j0) {
            if(!j0.y()) {
                throw new AssertionError();
            }
            p p0 = j0.o();
            if(p0.C()) {
                return String.valueOf(p0.q());
            }
            if(p0.A()) {
                return Boolean.toString(p0.d());
            }
            if(!p0.D()) {
                throw new AssertionError();
            }
            return p0.t();
        }

        public Map k(a a0) throws IOException {
            c c0 = a0.f0();
            if(c0 == c.i) {
                a0.T();
                return null;
            }
            Map map0 = (Map)this.c.a();
            if(c0 == c.a) {
                a0.a();
                while(a0.p()) {
                    a0.a();
                    Object object0 = this.a.e(a0);
                    if(map0.put(object0, this.b.e(a0)) != null) {
                        throw new t("duplicate key: " + object0);
                    }
                    a0.i();
                }
                a0.i();
                return map0;
            }
            a0.b();
            while(a0.p()) {
                f.a.a(a0);
                Object object1 = this.a.e(a0);
                if(map0.put(object1, this.b.e(a0)) != null) {
                    throw new t("duplicate key: " + object1);
                }
                if(false) {
                    break;
                }
            }
            a0.j();
            return map0;
        }

        public void l(d d0, Map map0) throws IOException {
            if(map0 == null) {
                d0.v();
                return;
            }
            if(!MapTypeAdapterFactory.this.b) {
                d0.e();
                for(Object object0: map0.entrySet()) {
                    d0.s(String.valueOf(((Map.Entry)object0).getKey()));
                    Object object1 = ((Map.Entry)object0).getValue();
                    this.b.i(d0, object1);
                }
                d0.j();
                return;
            }
            ArrayList arrayList0 = new ArrayList(map0.size());
            ArrayList arrayList1 = new ArrayList(map0.size());
            int v = 0;
            int v1 = 0;
            for(Object object2: map0.entrySet()) {
                Object object3 = ((Map.Entry)object2).getKey();
                com.google.gson.j j0 = this.a.h(object3);
                arrayList0.add(j0);
                arrayList1.add(((Map.Entry)object2).getValue());
                v1 |= (j0.u() || j0.x() ? 1 : 0);
            }
            if(v1 != 0) {
                d0.c();
                int v2 = arrayList0.size();
                while(v < v2) {
                    d0.c();
                    n.b(((com.google.gson.j)arrayList0.get(v)), d0);
                    Object object4 = arrayList1.get(v);
                    this.b.i(d0, object4);
                    d0.i();
                    ++v;
                }
                d0.i();
                return;
            }
            d0.e();
            int v3 = arrayList0.size();
            while(v < v3) {
                d0.s(this.j(((com.google.gson.j)arrayList0.get(v))));
                Object object5 = arrayList1.get(v);
                this.b.i(d0, object5);
                ++v;
            }
            d0.j();
        }
    }

    private final com.google.gson.internal.c a;
    final boolean b;

    public MapTypeAdapterFactory(com.google.gson.internal.c c0, boolean z) {
        this.a = c0;
        this.b = z;
    }

    @Override  // com.google.gson.y
    public TypeAdapter a(Gson gson0, com.google.gson.reflect.a a0) {
        Type type0 = a0.g();
        Class class0 = a0.f();
        if(!Map.class.isAssignableFrom(class0)) {
            return null;
        }
        Type[] arr_type = b.j(type0, class0);
        TypeAdapter typeAdapter0 = this.b(gson0, arr_type[0]);
        TypeAdapter typeAdapter1 = gson0.t(com.google.gson.reflect.a.c(arr_type[1]));
        j j0 = this.a.b(a0);
        return new Adapter(this, gson0, arr_type[0], typeAdapter0, arr_type[1], typeAdapter1, j0);
    }

    private TypeAdapter b(Gson gson0, Type type0) {
        return type0 == Boolean.TYPE || type0 == Boolean.class ? TypeAdapters.f : gson0.t(com.google.gson.reflect.a.c(type0));
    }
}

