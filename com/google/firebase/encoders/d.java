package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import j..util.DesugarCollections;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class d {
    static class a {
    }

    public static final class b {
        private final String a;
        private Map b;

        b(String s) {
            this.b = null;
            this.a = s;
        }

        @NonNull
        public d a() {
            return this.b == null ? new d(this.a, Collections.emptyMap(), null) : new d(this.a, DesugarCollections.unmodifiableMap(new HashMap(this.b)), null);
        }

        @NonNull
        public b b(@NonNull Annotation annotation0) {
            if(this.b == null) {
                this.b = new HashMap();
            }
            this.b.put(annotation0.annotationType(), annotation0);
            return this;
        }
    }

    private final String a;
    private final Map b;

    private d(String s, Map map0) {
        this.a = s;
        this.b = map0;
    }

    d(String s, Map map0, a d$a0) {
        this(s, map0);
    }

    @NonNull
    public static b a(@NonNull String s) {
        return new b(s);
    }

    @NonNull
    public String b() {
        return this.a;
    }

    @Nullable
    public Annotation c(@NonNull Class class0) {
        return (Annotation)this.b.get(class0);
    }

    @NonNull
    public static d d(@NonNull String s) {
        return new d(s, Collections.emptyMap());
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof d ? this.a.equals(((d)object0).a) && this.b.equals(((d)object0).b) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    @NonNull
    public String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}

