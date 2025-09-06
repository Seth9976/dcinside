package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.b;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public abstract class q {
    static class a extends q {
        public static final a c;

        static {
            a.c = new a(null);
        }

        a(Object object0) {
            super(object0);
        }

        @Override  // com.fasterxml.jackson.databind.introspect.q
        public q a(Annotation annotation0) {
            Class class0 = annotation0.annotationType();
            return new e(this.a, class0, annotation0);
        }

        @Override  // com.fasterxml.jackson.databind.introspect.q
        public s b() {
            return new s();
        }

        @Override  // com.fasterxml.jackson.databind.introspect.q
        public b c() {
            return q.b;
        }

        @Override  // com.fasterxml.jackson.databind.introspect.q
        public boolean h(Annotation annotation0) {
            return false;
        }
    }

    static class com.fasterxml.jackson.databind.introspect.q.b extends q {
        protected final HashMap c;

        public com.fasterxml.jackson.databind.introspect.q.b(Object object0, Class class0, Annotation annotation0, Class class1, Annotation annotation1) {
            super(object0);
            HashMap hashMap0 = new HashMap();
            this.c = hashMap0;
            hashMap0.put(class0, annotation0);
            hashMap0.put(class1, annotation1);
        }

        @Override  // com.fasterxml.jackson.databind.introspect.q
        public q a(Annotation annotation0) {
            Class class0 = annotation0.annotationType();
            this.c.put(class0, annotation0);
            return this;
        }

        @Override  // com.fasterxml.jackson.databind.introspect.q
        public s b() {
            s s0 = new s();
            for(Object object0: this.c.values()) {
                s0.e(((Annotation)object0));
            }
            return s0;
        }

        @Override  // com.fasterxml.jackson.databind.introspect.q
        public b c() {
            if(this.c.size() == 2) {
                Iterator iterator0 = this.c.entrySet().iterator();
                Object object0 = iterator0.next();
                Object object1 = iterator0.next();
                return new f(((Class)((Map.Entry)object0).getKey()), ((Annotation)((Map.Entry)object0).getValue()), ((Class)((Map.Entry)object1).getKey()), ((Annotation)((Map.Entry)object1).getValue()));
            }
            return new s(this.c);
        }

        @Override  // com.fasterxml.jackson.databind.introspect.q
        public boolean h(Annotation annotation0) {
            Class class0 = annotation0.annotationType();
            return this.c.containsKey(class0);
        }
    }

    public static class c implements b, Serializable {
        private static final long a = 1L;

        @Override  // com.fasterxml.jackson.databind.util.b
        public Annotation a(Class class0) {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.util.b
        public boolean b(Class[] arr_class) {
            return false;
        }

        @Override  // com.fasterxml.jackson.databind.util.b
        public boolean c(Class class0) {
            return false;
        }

        @Override  // com.fasterxml.jackson.databind.util.b
        public int size() {
            return 0;
        }
    }

    public static class d implements b, Serializable {
        private final Class a;
        private final Annotation b;
        private static final long c = 1L;

        public d(Class class0, Annotation annotation0) {
            this.a = class0;
            this.b = annotation0;
        }

        @Override  // com.fasterxml.jackson.databind.util.b
        public Annotation a(Class class0) {
            return this.a == class0 ? this.b : null;
        }

        @Override  // com.fasterxml.jackson.databind.util.b
        public boolean b(Class[] arr_class) {
            for(int v = 0; v < arr_class.length; ++v) {
                if(arr_class[v] == this.a) {
                    return true;
                }
            }
            return false;
        }

        @Override  // com.fasterxml.jackson.databind.util.b
        public boolean c(Class class0) {
            return this.a == class0;
        }

        @Override  // com.fasterxml.jackson.databind.util.b
        public int size() {
            return 1;
        }
    }

    static class e extends q {
        private Class c;
        private Annotation d;

        public e(Object object0, Class class0, Annotation annotation0) {
            super(object0);
            this.c = class0;
            this.d = annotation0;
        }

        @Override  // com.fasterxml.jackson.databind.introspect.q
        public q a(Annotation annotation0) {
            Class class0 = annotation0.annotationType();
            Class class1 = this.c;
            if(class1 == class0) {
                this.d = annotation0;
                return this;
            }
            return new com.fasterxml.jackson.databind.introspect.q.b(this.a, class1, this.d, class0, annotation0);
        }

        @Override  // com.fasterxml.jackson.databind.introspect.q
        public s b() {
            return s.i(this.c, this.d);
        }

        @Override  // com.fasterxml.jackson.databind.introspect.q
        public b c() {
            return new d(this.c, this.d);
        }

        @Override  // com.fasterxml.jackson.databind.introspect.q
        public boolean h(Annotation annotation0) {
            return annotation0.annotationType() == this.c;
        }
    }

    public static class f implements b, Serializable {
        private final Class a;
        private final Class b;
        private final Annotation c;
        private final Annotation d;
        private static final long e = 1L;

        public f(Class class0, Annotation annotation0, Class class1, Annotation annotation1) {
            this.a = class0;
            this.c = annotation0;
            this.b = class1;
            this.d = annotation1;
        }

        @Override  // com.fasterxml.jackson.databind.util.b
        public Annotation a(Class class0) {
            if(this.a == class0) {
                return this.c;
            }
            return this.b == class0 ? this.d : null;
        }

        @Override  // com.fasterxml.jackson.databind.util.b
        public boolean b(Class[] arr_class) {
            int v = 0;
            while(v < arr_class.length) {
                Class class0 = arr_class[v];
                if(class0 != this.a && class0 != this.b) {
                    ++v;
                    continue;
                }
                return true;
            }
            return false;
        }

        @Override  // com.fasterxml.jackson.databind.util.b
        public boolean c(Class class0) {
            return this.a == class0 || this.b == class0;
        }

        @Override  // com.fasterxml.jackson.databind.util.b
        public int size() {
            return 2;
        }
    }

    protected final Object a;
    protected static final b b;

    static {
        q.b = new c();
    }

    protected q(Object object0) {
        this.a = object0;
    }

    public abstract q a(Annotation arg1);

    public abstract s b();

    public abstract b c();

    public static b d() {
        return q.b;
    }

    public static q e() {
        return a.c;
    }

    public static q f(Object object0) {
        return new a(object0);
    }

    public Object g() {
        return this.a;
    }

    public abstract boolean h(Annotation arg1);
}

