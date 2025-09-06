package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.j;
import com.google.gson.internal.l;
import com.google.gson.internal.m;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import com.google.gson.stream.d;
import com.google.gson.t;
import com.google.gson.v.e;
import com.google.gson.y;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory implements y {
    public static abstract class Adapter extends TypeAdapter {
        final Map a;

        Adapter(Map map0) {
            this.a = map0;
        }

        @Override  // com.google.gson.TypeAdapter
        public Object e(a a0) throws IOException {
            if(a0.f0() == c.i) {
                a0.T();
                return null;
            }
            Object object0 = this.j();
            try {
                a0.b();
                while(true) {
                    if(!a0.p()) {
                        goto label_18;
                    }
                    String s = a0.Q();
                    b reflectiveTypeAdapterFactory$b0 = (b)this.a.get(s);
                    if(reflectiveTypeAdapterFactory$b0 != null && reflectiveTypeAdapterFactory$b0.e) {
                        this.l(object0, a0, reflectiveTypeAdapterFactory$b0);
                    }
                    else {
                        a0.Y1();
                    }
                }
            }
            catch(IllegalStateException illegalStateException0) {
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw com.google.gson.internal.reflect.a.e(illegalAccessException0);
            }
            throw new t(illegalStateException0);
        label_18:
            a0.j();
            return this.k(object0);
        }

        @Override  // com.google.gson.TypeAdapter
        public void i(d d0, Object object0) throws IOException {
            if(object0 == null) {
                d0.v();
                return;
            }
            d0.e();
            try {
                for(Object object1: this.a.values()) {
                    ((b)object1).c(d0, object0);
                }
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw com.google.gson.internal.reflect.a.e(illegalAccessException0);
            }
            d0.j();
        }

        abstract Object j();

        abstract Object k(Object arg1);

        abstract void l(Object arg1, a arg2, b arg3) throws IllegalAccessException, IOException;
    }

    static final class FieldReflectionAdapter extends Adapter {
        private final j b;

        FieldReflectionAdapter(j j0, Map map0) {
            super(map0);
            this.b = j0;
        }

        @Override  // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter
        Object j() {
            return this.b.a();
        }

        @Override  // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter
        Object k(Object object0) {
            return object0;
        }

        @Override  // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter
        void l(Object object0, a a0, b reflectiveTypeAdapterFactory$b0) throws IllegalAccessException, IOException {
            reflectiveTypeAdapterFactory$b0.b(a0, object0);
        }
    }

    static final class RecordAdapter extends Adapter {
        private final Constructor b;
        private final Object[] c;
        private final Map d;
        static final Map e;

        static {
            RecordAdapter.e = RecordAdapter.o();
        }

        RecordAdapter(Class class0, Map map0, boolean z) {
            super(map0);
            this.d = new HashMap();
            Constructor constructor0 = com.google.gson.internal.reflect.a.i(class0);
            this.b = constructor0;
            if(z) {
                ReflectiveTypeAdapterFactory.c(null, constructor0);
            }
            else {
                com.google.gson.internal.reflect.a.l(constructor0);
            }
            String[] arr_s = com.google.gson.internal.reflect.a.j(class0);
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                this.d.put(arr_s[v1], v1);
            }
            Class[] arr_class = this.b.getParameterTypes();
            this.c = new Object[arr_class.length];
            for(int v = 0; v < arr_class.length; ++v) {
                this.c[v] = RecordAdapter.e.get(arr_class[v]);
            }
        }

        @Override  // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter
        Object j() {
            return this.m();
        }

        @Override  // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter
        Object k(Object object0) {
            return this.n(((Object[])object0));
        }

        @Override  // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter
        void l(Object object0, a a0, b reflectiveTypeAdapterFactory$b0) throws IllegalAccessException, IOException {
            this.p(((Object[])object0), a0, reflectiveTypeAdapterFactory$b0);
        }

        Object[] m() {
            return (Object[])this.c.clone();
        }

        Object n(Object[] arr_object) {
            try {
                return this.b.newInstance(arr_object);
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw com.google.gson.internal.reflect.a.e(illegalAccessException0);
            }
            catch(InstantiationException | IllegalArgumentException instantiationException0) {
                throw new RuntimeException("Failed to invoke constructor \'" + com.google.gson.internal.reflect.a.c(this.b) + "\' with args " + Arrays.toString(arr_object), instantiationException0);
            }
            catch(InvocationTargetException invocationTargetException0) {
                throw new RuntimeException("Failed to invoke constructor \'" + com.google.gson.internal.reflect.a.c(this.b) + "\' with args " + Arrays.toString(arr_object), invocationTargetException0.getCause());
            }
        }

        private static Map o() {
            Map map0 = new HashMap();
            map0.put(Byte.TYPE, ((byte)0));
            map0.put(Short.TYPE, ((short)0));
            map0.put(Integer.TYPE, 0);
            map0.put(Long.TYPE, 0L);
            map0.put(Float.TYPE, 0.0f);
            map0.put(Double.TYPE, 0.0);
            map0.put(Character.TYPE, Character.valueOf('\u0000'));
            map0.put(Boolean.TYPE, Boolean.FALSE);
            return map0;
        }

        void p(Object[] arr_object, a a0, b reflectiveTypeAdapterFactory$b0) throws IOException {
            Integer integer0 = (Integer)this.d.get(reflectiveTypeAdapterFactory$b0.c);
            if(integer0 == null) {
                throw new IllegalStateException("Could not find the index in the constructor \'" + com.google.gson.internal.reflect.a.c(this.b) + "\' for field with name \'" + reflectiveTypeAdapterFactory$b0.c + "\', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
            }
            reflectiveTypeAdapterFactory$b0.a(a0, ((int)integer0), arr_object);
        }
    }

    static abstract class b {
        final String a;
        final Field b;
        final String c;
        final boolean d;
        final boolean e;

        protected b(String s, Field field0, boolean z, boolean z1) {
            this.a = s;
            this.b = field0;
            this.c = field0.getName();
            this.d = z;
            this.e = z1;
        }

        abstract void a(a arg1, int arg2, Object[] arg3) throws IOException, n;

        abstract void b(a arg1, Object arg2) throws IOException, IllegalAccessException;

        abstract void c(d arg1, Object arg2) throws IOException, IllegalAccessException;
    }

    private final com.google.gson.internal.c a;
    private final com.google.gson.d b;
    private final Excluder c;
    private final JsonAdapterAnnotationTypeAdapterFactory d;
    private final List e;

    public ReflectiveTypeAdapterFactory(com.google.gson.internal.c c0, com.google.gson.d d0, Excluder excluder0, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0, List list0) {
        this.a = c0;
        this.b = d0;
        this.c = excluder0;
        this.d = jsonAdapterAnnotationTypeAdapterFactory0;
        this.e = list0;
    }

    @Override  // com.google.gson.y
    public TypeAdapter a(Gson gson0, com.google.gson.reflect.a a0) {
        Class class0 = a0.f();
        if(!Object.class.isAssignableFrom(class0)) {
            return null;
        }
        e v$e0 = m.b(this.e, class0);
        if(v$e0 == e.d) {
            throw new k("ReflectionAccessFilter does not permit using reflection for " + class0 + ". Register a TypeAdapter for this type or adjust the access filter.");
        }
        boolean z = v$e0 == e.c;
        return com.google.gson.internal.reflect.a.k(class0) ? new RecordAdapter(class0, this.e(gson0, a0, class0, z, true), z) : new FieldReflectionAdapter(this.a.b(a0), this.e(gson0, a0, class0, z, false));
    }

    private static void c(Object object0, AccessibleObject accessibleObject0) {
        if(Modifier.isStatic(((Member)accessibleObject0).getModifiers())) {
            object0 = null;
        }
        if(!m.a(accessibleObject0, object0)) {
            throw new k(com.google.gson.internal.reflect.a.g(accessibleObject0, true) + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
        }
    }

    private b d(Gson gson0, Field field0, Method method0, String s, com.google.gson.reflect.a a0, boolean z, boolean z1, boolean z2) {
        class com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a extends b {
            final boolean f;
            final Method g;
            final boolean h;
            final TypeAdapter i;
            final Gson j;
            final com.google.gson.reflect.a k;
            final boolean l;
            final boolean m;
            final ReflectiveTypeAdapterFactory n;

            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a(String s, Field field0, boolean z, boolean z1, boolean z2, Method method0, boolean z3, TypeAdapter typeAdapter0, Gson gson0, com.google.gson.reflect.a a0, boolean z4, boolean z5) {
                this.f = z2;
                this.g = method0;
                this.h = z3;
                this.i = typeAdapter0;
                this.j = gson0;
                this.k = a0;
                this.l = z4;
                this.m = z5;
                super(s, field0, z, z1);
            }

            @Override  // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$b
            void a(a a0, int v, Object[] arr_object) throws IOException, n {
                Object object0 = this.i.e(a0);
                if(object0 == null && this.l) {
                    throw new n("null is not allowed as value for record component \'" + this.c + "\' of primitive type; at path " + a0.getPath());
                }
                arr_object[v] = object0;
            }

            @Override  // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$b
            void b(a a0, Object object0) throws IOException, IllegalAccessException {
                Object object1 = this.i.e(a0);
                if(object1 != null || !this.l) {
                    if(this.f) {
                        ReflectiveTypeAdapterFactory.c(object0, this.b);
                        this.b.set(object0, object1);
                        return;
                    }
                    if(this.m) {
                        throw new k("Cannot set value of \'static final\' " + com.google.gson.internal.reflect.a.g(this.b, false));
                    }
                    this.b.set(object0, object1);
                }
            }

            @Override  // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$b
            void c(d d0, Object object0) throws IOException, IllegalAccessException {
                Object object1;
                if(!this.d) {
                    return;
                }
                if(this.f) {
                    Method method0 = this.g;
                    if(method0 == null) {
                        ReflectiveTypeAdapterFactory.c(object0, this.b);
                    }
                    else {
                        ReflectiveTypeAdapterFactory.c(object0, method0);
                    }
                }
                Method method1 = this.g;
                if(method1 == null) {
                    object1 = this.b.get(object0);
                }
                else {
                    try {
                        object1 = method1.invoke(object0, null);
                    }
                    catch(InvocationTargetException invocationTargetException0) {
                        throw new k("Accessor " + com.google.gson.internal.reflect.a.g(this.g, false) + " threw exception", invocationTargetException0.getCause());
                    }
                }
                if(object1 == object0) {
                    return;
                }
                d0.s(this.a);
                TypeAdapter typeAdapter0 = this.h ? this.i : new TypeAdapterRuntimeTypeWrapper(this.j, this.i, this.k.g());
                typeAdapter0.i(d0, object1);
            }
        }

        boolean z3 = l.a(a0.f());
        int v = field0.getModifiers();
        boolean z4 = Modifier.isStatic(v) && Modifier.isFinal(v);
        com.google.gson.annotations.b b0 = (com.google.gson.annotations.b)field0.getAnnotation(com.google.gson.annotations.b.class);
        TypeAdapter typeAdapter0 = b0 == null ? null : this.d.b(this.a, gson0, a0, b0);
        boolean z5 = typeAdapter0 != null;
        if(typeAdapter0 == null) {
            typeAdapter0 = gson0.t(a0);
        }
        return new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a(this, s, field0, z, z1, z2, method0, z5, typeAdapter0, gson0, a0, z3, z4);
    }

    private Map e(Gson gson0, com.google.gson.reflect.a a0, Class class0, boolean z, boolean z1) {
        int v3;
        int v2;
        boolean z6;
        Method method0;
        Map map0 = new LinkedHashMap();
        if(class0.isInterface()) {
            return map0;
        }
        com.google.gson.reflect.a a1 = a0;
        boolean z2 = z;
        for(Class class1 = class0; class1 != Object.class; class1 = a1.f()) {
            Field[] arr_field = class1.getDeclaredFields();
            if(class1 != class0 && arr_field.length > 0) {
                e v$e0 = m.b(this.e, class1);
                if(v$e0 == e.d) {
                    throw new k("ReflectionAccessFilter does not permit using reflection for " + class1 + " (supertype of " + class0 + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
                z2 = v$e0 == e.c;
            }
            boolean z3 = z2;
            int v = arr_field.length;
            int v1 = 0;
            while(v1 < v) {
                b reflectiveTypeAdapterFactory$b0 = null;
                Field field0 = arr_field[v1];
                boolean z4 = this.g(field0, true);
                boolean z5 = this.g(field0, false);
                if(z4 || z5) {
                    if(!z1) {
                        z6 = z5;
                        method0 = null;
                    }
                    else if(Modifier.isStatic(field0.getModifiers())) {
                        method0 = null;
                        z6 = false;
                    }
                    else {
                        Method method1 = com.google.gson.internal.reflect.a.h(class1, field0);
                        if(!z3) {
                            com.google.gson.internal.reflect.a.l(method1);
                        }
                        if(method1.getAnnotation(com.google.gson.annotations.c.class) != null && field0.getAnnotation(com.google.gson.annotations.c.class) == null) {
                            throw new k("@SerializedName on " + com.google.gson.internal.reflect.a.g(method1, false) + " is not supported");
                        }
                        z6 = z5;
                        method0 = method1;
                    }
                    if(!z3 && method0 == null) {
                        com.google.gson.internal.reflect.a.l(field0);
                    }
                    Type type0 = com.google.gson.internal.b.o(a1.g(), class1, field0.getGenericType());
                    List list0 = this.f(field0);
                    int v4 = list0.size();
                    int v5 = 0;
                    while(v5 < v4) {
                        Object object0 = list0.get(v5);
                        boolean z7 = v5 == 0 ? z4 : false;
                        b reflectiveTypeAdapterFactory$b1 = (b)map0.put(((String)object0), this.d(gson0, field0, method0, ((String)object0), com.google.gson.reflect.a.c(type0), z7, z6, z3));
                        if(reflectiveTypeAdapterFactory$b0 == null) {
                            reflectiveTypeAdapterFactory$b0 = reflectiveTypeAdapterFactory$b1;
                        }
                        ++v5;
                        z4 = z7;
                    }
                    v2 = v1;
                    v3 = v;
                    if(reflectiveTypeAdapterFactory$b0 != null) {
                        throw new IllegalArgumentException("Class " + class0.getName() + " declares multiple JSON fields named \'" + reflectiveTypeAdapterFactory$b0.a + "\'; conflict is caused by fields " + com.google.gson.internal.reflect.a.f(reflectiveTypeAdapterFactory$b0.b) + " and " + com.google.gson.internal.reflect.a.f(field0));
                    }
                }
                else {
                    v2 = v1;
                    v3 = v;
                }
                v1 = v2 + 1;
                v = v3;
            }
            a1 = com.google.gson.reflect.a.c(com.google.gson.internal.b.o(a1.g(), class1, class1.getGenericSuperclass()));
        }
        return map0;
    }

    private List f(Field field0) {
        com.google.gson.annotations.c c0 = (com.google.gson.annotations.c)field0.getAnnotation(com.google.gson.annotations.c.class);
        if(c0 == null) {
            return Collections.singletonList(this.b.a(field0));
        }
        String s = c0.value();
        String[] arr_s = c0.alternate();
        if(arr_s.length == 0) {
            return Collections.singletonList(s);
        }
        List list0 = new ArrayList(arr_s.length + 1);
        list0.add(s);
        Collections.addAll(list0, arr_s);
        return list0;
    }

    private boolean g(Field field0, boolean z) {
        Class class0 = field0.getType();
        return !this.c.d(class0, z) && !this.c.g(field0, z);
    }
}

