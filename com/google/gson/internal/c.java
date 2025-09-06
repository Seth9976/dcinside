package com.google.gson.internal;

import com.google.gson.f;
import com.google.gson.reflect.a;
import com.google.gson.v.e;
import j..util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public final class c {
    private final Map a;
    private final boolean b;
    private final List c;

    public c(Map map0, boolean z, List list0) {
        this.a = map0;
        this.b = z;
        this.c = list0;
    }

    static String a(Class class0) {
        int v = class0.getModifiers();
        if(Modifier.isInterface(v)) {
            return "Interfaces can\'t be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + class0.getName();
        }
        return Modifier.isAbstract(v) ? "Abstract classes can\'t be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: " + class0.getName() : null;
    }

    public j b(a a0) {
        class k implements j {
            final f a;
            final Type b;
            final c c;

            k(f f0, Type type0) {
                this.a = f0;
                this.b = type0;
                super();
            }

            @Override  // com.google.gson.internal.j
            public Object a() {
                return this.a.a(this.b);
            }
        }


        class m implements j {
            final f a;
            final Type b;
            final c c;

            m(f f0, Type type0) {
                this.a = f0;
                this.b = type0;
                super();
            }

            @Override  // com.google.gson.internal.j
            public Object a() {
                return this.a.a(this.b);
            }
        }


        class n implements j {
            final String a;
            final c b;

            n(String s) {
                this.a = s;
                super();
            }

            @Override  // com.google.gson.internal.j
            public Object a() {
                throw new com.google.gson.k(this.a);
            }
        }


        class o implements j {
            final String a;
            final c b;

            o(String s) {
                this.a = s;
                super();
            }

            @Override  // com.google.gson.internal.j
            public Object a() {
                throw new com.google.gson.k(this.a);
            }
        }

        Type type0 = a0.g();
        Class class0 = a0.f();
        f f0 = (f)this.a.get(type0);
        if(f0 != null) {
            return new k(this, f0, type0);
        }
        f f1 = (f)this.a.get(class0);
        if(f1 != null) {
            return new m(this, f1, type0);
        }
        j j0 = c.e(type0, class0);
        if(j0 != null) {
            return j0;
        }
        e v$e0 = com.google.gson.internal.m.b(this.c, class0);
        j j1 = c.c(class0, v$e0);
        if(j1 != null) {
            return j1;
        }
        j j2 = c.d(type0, class0);
        if(j2 != null) {
            return j2;
        }
        String s = c.a(class0);
        if(s != null) {
            return new n(this, s);
        }
        return v$e0 == e.a ? this.f(class0) : new o(this, "Unable to create instance of " + class0 + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
    }

    private static j c(Class class0, e v$e0) {
        class r implements j {
            final String a;

            r(String s) {
            }

            @Override  // com.google.gson.internal.j
            public Object a() {
                throw new com.google.gson.k(this.a);
            }
        }


        class s implements j {
            final String a;

            s(String s) {
            }

            @Override  // com.google.gson.internal.j
            public Object a() {
                throw new com.google.gson.k(this.a);
            }
        }


        class t implements j {
            final Constructor a;

            t(Constructor constructor0) {
            }

            @Override  // com.google.gson.internal.j
            public Object a() {
                try {
                    return this.a.newInstance(null);
                }
                catch(InstantiationException instantiationException0) {
                    throw new RuntimeException("Failed to invoke constructor \'" + com.google.gson.internal.reflect.a.c(this.a) + "\' with no args", instantiationException0);
                }
                catch(InvocationTargetException invocationTargetException0) {
                    throw new RuntimeException("Failed to invoke constructor \'" + com.google.gson.internal.reflect.a.c(this.a) + "\' with no args", invocationTargetException0.getCause());
                }
                catch(IllegalAccessException illegalAccessException0) {
                    throw com.google.gson.internal.reflect.a.e(illegalAccessException0);
                }
            }
        }

        Constructor constructor0;
        if(Modifier.isAbstract(class0.getModifiers())) {
            return null;
        }
        try {
            constructor0 = class0.getDeclaredConstructor(null);
        }
        catch(NoSuchMethodException unused_ex) {
            return null;
        }
        e v$e1 = e.a;
        if(v$e0 != v$e1 && (!com.google.gson.internal.m.a(constructor0, null) || v$e0 == e.d && !Modifier.isPublic(constructor0.getModifiers()))) {
            return new r("Unable to invoke no-args constructor of " + class0 + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
        }
        if(v$e0 == v$e1) {
            String s = com.google.gson.internal.reflect.a.m(constructor0);
            if(s != null) {
                return new s(s);
            }
        }
        return new t(constructor0);
    }

    private static j d(Type type0, Class class0) {
        class com.google.gson.internal.c.a implements j {
            com.google.gson.internal.c.a() {
                super();
            }

            @Override  // com.google.gson.internal.j
            public Object a() {
                return new TreeSet();
            }
        }


        class b implements j {
            b() {
                super();
            }

            @Override  // com.google.gson.internal.j
            public Object a() {
                return new LinkedHashSet();
            }
        }


        class com.google.gson.internal.c.c implements j {
            com.google.gson.internal.c.c() {
                super();
            }

            @Override  // com.google.gson.internal.j
            public Object a() {
                return new ArrayDeque();
            }
        }


        class d implements j {
            d() {
                super();
            }

            @Override  // com.google.gson.internal.j
            public Object a() {
                return new ArrayList();
            }
        }


        class com.google.gson.internal.c.e implements j {
            com.google.gson.internal.c.e() {
                super();
            }

            @Override  // com.google.gson.internal.j
            public Object a() {
                return new ConcurrentSkipListMap();
            }
        }


        class com.google.gson.internal.c.f implements j {
            com.google.gson.internal.c.f() {
                super();
            }

            @Override  // com.google.gson.internal.j
            public Object a() {
                return new ConcurrentHashMap();
            }
        }


        class g implements j {
            g() {
                super();
            }

            @Override  // com.google.gson.internal.j
            public Object a() {
                return new TreeMap();
            }
        }


        class h implements j {
            h() {
                super();
            }

            @Override  // com.google.gson.internal.j
            public Object a() {
                return new LinkedHashMap();
            }
        }


        class i implements j {
            i() {
                super();
            }

            @Override  // com.google.gson.internal.j
            public Object a() {
                return new com.google.gson.internal.h();
            }
        }

        if(Collection.class.isAssignableFrom(class0)) {
            if(SortedSet.class.isAssignableFrom(class0)) {
                return new com.google.gson.internal.c.a();
            }
            if(Set.class.isAssignableFrom(class0)) {
                return new b();
            }
            return Queue.class.isAssignableFrom(class0) ? new com.google.gson.internal.c.c() : new d();
        }
        if(Map.class.isAssignableFrom(class0)) {
            if(ConcurrentNavigableMap.class.isAssignableFrom(class0)) {
                return new com.google.gson.internal.c.e();
            }
            if(ConcurrentMap.class.isAssignableFrom(class0)) {
                return new com.google.gson.internal.c.f();
            }
            if(SortedMap.class.isAssignableFrom(class0)) {
                return new g();
            }
            if(type0 instanceof ParameterizedType) {
                Class class1 = a.c(((ParameterizedType)type0).getActualTypeArguments()[0]).f();
                if(!String.class.isAssignableFrom(class1)) {
                    return new h();
                }
            }
            return new i();
        }
        return null;
    }

    private static j e(Type type0, Class class0) {
        class p implements j {
            final Type a;

            p(Type type0) {
            }

            @Override  // com.google.gson.internal.j
            public Object a() {
                Type type0 = this.a;
                if(!(type0 instanceof ParameterizedType)) {
                    throw new com.google.gson.k("Invalid EnumSet type: " + this.a.toString());
                }
                Type type1 = ((ParameterizedType)type0).getActualTypeArguments()[0];
                if(!(type1 instanceof Class)) {
                    throw new com.google.gson.k("Invalid EnumSet type: " + this.a.toString());
                }
                return EnumSet.noneOf(((Class)type1));
            }
        }


        class q implements j {
            final Type a;

            q(Type type0) {
            }

            @Override  // com.google.gson.internal.j
            public Object a() {
                Type type0 = this.a;
                if(!(type0 instanceof ParameterizedType)) {
                    throw new com.google.gson.k("Invalid EnumMap type: " + this.a.toString());
                }
                Type type1 = ((ParameterizedType)type0).getActualTypeArguments()[0];
                if(!(type1 instanceof Class)) {
                    throw new com.google.gson.k("Invalid EnumMap type: " + this.a.toString());
                }
                return new EnumMap(((Class)type1));
            }
        }

        if(EnumSet.class.isAssignableFrom(class0)) {
            return new p(type0);
        }
        return class0 == EnumMap.class ? new q(type0) : null;
    }

    private j f(Class class0) {
        class com.google.gson.internal.c.j implements j {
            final Class a;
            final c b;

            com.google.gson.internal.c.j(Class class0) {
                this.a = class0;
                super();
            }

            @Override  // com.google.gson.internal.j
            public Object a() {
                try {
                    return com.google.gson.internal.o.a.d(this.a);
                }
                catch(Exception exception0) {
                    throw new RuntimeException("Unable to create instance of " + this.a + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", exception0);
                }
            }
        }


        class l implements j {
            final String a;
            final c b;

            l(String s) {
                this.a = s;
                super();
            }

            @Override  // com.google.gson.internal.j
            public Object a() {
                throw new com.google.gson.k(this.a);
            }
        }

        return this.b ? new com.google.gson.internal.c.j(this, class0) : new l(this, "Unable to create instance of " + class0 + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    @Override
    public String toString() {
        return this.a.toString();
    }
}

