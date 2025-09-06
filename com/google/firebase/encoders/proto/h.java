package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.e;
import com.google.firebase.encoders.f;
import com.google.firebase.encoders.g;
import d2.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class h {
    public static final class a implements b {
        private final Map a;
        private final Map b;
        private e c;
        private static final e d;

        static {
            a.d = (Object object0, f f0) -> a.f(object0, f0);
        }

        public a() {
            this.a = new HashMap();
            this.b = new HashMap();
            this.c = a.d;
        }

        @Override  // d2.b
        @NonNull
        public b a(@NonNull Class class0, @NonNull g g0) {
            return this.h(class0, g0);
        }

        @Override  // d2.b
        @NonNull
        public b b(@NonNull Class class0, @NonNull e e0) {
            return this.g(class0, e0);
        }

        // 检测为 Lambda 实现
        public static void c(Object object0, f f0) [...]

        public h d() {
            return new h(new HashMap(this.a), new HashMap(this.b), this.c);
        }

        @NonNull
        public a e(@NonNull d2.a a0) {
            a0.a(this);
            return this;
        }

        private static void f(Object object0, f f0) throws IOException {
            throw new c("Couldn\'t find encoder for type " + object0.getClass().getCanonicalName());
        }

        @NonNull
        public a g(@NonNull Class class0, @NonNull e e0) {
            this.a.put(class0, e0);
            this.b.remove(class0);
            return this;
        }

        @NonNull
        public a h(@NonNull Class class0, @NonNull g g0) {
            this.b.put(class0, g0);
            this.a.remove(class0);
            return this;
        }

        @NonNull
        public a i(@NonNull e e0) {
            this.c = e0;
            return this;
        }
    }

    private final Map a;
    private final Map b;
    private final e c;

    h(Map map0, Map map1, e e0) {
        this.a = map0;
        this.b = map1;
        this.c = e0;
    }

    public static a a() {
        return new a();
    }

    public void b(@NonNull Object object0, @NonNull OutputStream outputStream0) throws IOException {
        new com.google.firebase.encoders.proto.f(outputStream0, this.a, this.b, this.c).C(object0);
    }

    @NonNull
    public byte[] c(@NonNull Object object0) {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try {
            this.b(object0, byteArrayOutputStream0);
        }
        catch(IOException unused_ex) {
        }
        return byteArrayOutputStream0.toByteArray();
    }
}

