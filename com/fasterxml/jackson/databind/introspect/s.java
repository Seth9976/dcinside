package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.b;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;

public final class s implements b {
    protected HashMap a;

    public s() {
    }

    s(HashMap hashMap0) {
        this.a = hashMap0;
    }

    @Override  // com.fasterxml.jackson.databind.util.b
    public Annotation a(Class class0) {
        return this.a == null ? null : ((Annotation)this.a.get(class0));
    }

    @Override  // com.fasterxml.jackson.databind.util.b
    public boolean b(Class[] arr_class) {
        if(this.a != null) {
            for(int v = 0; v < arr_class.length; ++v) {
                if(this.a.containsKey(arr_class[v])) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override  // com.fasterxml.jackson.databind.util.b
    public boolean c(Class class0) {
        return this.a == null ? false : this.a.containsKey(class0);
    }

    protected final boolean d(Annotation annotation0) {
        if(this.a == null) {
            this.a = new HashMap();
        }
        Annotation annotation1 = (Annotation)this.a.put(annotation0.annotationType(), annotation0);
        return annotation1 == null || !annotation1.equals(annotation0);
    }

    public boolean e(Annotation annotation0) {
        return this.d(annotation0);
    }

    public boolean f(Annotation annotation0) {
        if(this.a != null && this.a.containsKey(annotation0.annotationType())) {
            return false;
        }
        this.d(annotation0);
        return true;
    }

    public Iterable g() {
        return this.a != null && this.a.size() != 0 ? this.a.values() : Collections.emptyList();
    }

    public static s h(s s0, s s1) {
        if(s0 != null && (s0.a != null && !s0.a.isEmpty())) {
            if(s1 != null && (s1.a != null && !s1.a.isEmpty())) {
                HashMap hashMap0 = new HashMap();
                for(Object object0: s1.a.values()) {
                    hashMap0.put(((Annotation)object0).annotationType(), ((Annotation)object0));
                }
                for(Object object1: s0.a.values()) {
                    hashMap0.put(((Annotation)object1).annotationType(), ((Annotation)object1));
                }
                return new s(hashMap0);
            }
            return s0;
        }
        return s1;
    }

    public static s i(Class class0, Annotation annotation0) {
        HashMap hashMap0 = new HashMap(4);
        hashMap0.put(class0, annotation0);
        return new s(hashMap0);
    }

    @Override  // com.fasterxml.jackson.databind.util.b
    public int size() {
        return this.a == null ? 0 : this.a.size();
    }

    @Override
    public String toString() {
        return this.a == null ? "[null]" : this.a.toString();
    }
}

