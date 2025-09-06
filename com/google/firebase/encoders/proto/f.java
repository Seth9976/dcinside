package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;
import com.google.firebase.encoders.g;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Map;

final class f implements com.google.firebase.encoders.f {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[com.google.firebase.encoders.proto.d.a.values().length];
            a.a = arr_v;
            try {
                arr_v[com.google.firebase.encoders.proto.d.a.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.google.firebase.encoders.proto.d.a.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.google.firebase.encoders.proto.d.a.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private OutputStream a;
    private final Map b;
    private final Map c;
    private final e d;
    private final i e;
    private static final Charset f;
    private static final d g;
    private static final d h;
    private static final e i;

    static {
        f.f = Charset.forName("UTF-8");
        f.g = d.a("key").b(com.google.firebase.encoders.proto.a.b().d(1).a()).a();
        f.h = d.a("value").b(com.google.firebase.encoders.proto.a.b().d(2).a()).a();
        f.i = (Map.Entry map$Entry0, com.google.firebase.encoders.f f0) -> {
            Object object0 = map$Entry0.getKey();
            f0.q(f.g, object0);
            Object object1 = map$Entry0.getValue();
            f0.q(f.h, object1);
        };
    }

    f(OutputStream outputStream0, Map map0, Map map1, e e0) {
        this.e = new i(this);
        this.a = outputStream0;
        this.b = map0;
        this.c = map1;
        this.d = e0;
    }

    private f A(e e0, d d0, Object object0, boolean z) throws IOException {
        long v = this.z(e0, object0);
        if(z && v == 0L) {
            return this;
        }
        this.G(f.E(d0) << 3 | 2);
        this.H(v);
        e0.a(object0, this);
        return this;
    }

    private f B(g g0, d d0, Object object0, boolean z) throws IOException {
        this.e.e(d0, z);
        g0.a(object0, this.e);
        return this;
    }

    f C(@Nullable Object object0) throws IOException {
        if(object0 == null) {
            return this;
        }
        Class class0 = object0.getClass();
        e e0 = (e)this.b.get(class0);
        if(e0 == null) {
            throw new c("No encoder for " + object0.getClass());
        }
        e0.a(object0, this);
        return this;
    }

    private static com.google.firebase.encoders.proto.d D(d d0) {
        com.google.firebase.encoders.proto.d d1 = (com.google.firebase.encoders.proto.d)d0.c(com.google.firebase.encoders.proto.d.class);
        if(d1 == null) {
            throw new c("Field has no @Protobuf config");
        }
        return d1;
    }

    private static int E(d d0) {
        com.google.firebase.encoders.proto.d d1 = (com.google.firebase.encoders.proto.d)d0.c(com.google.firebase.encoders.proto.d.class);
        if(d1 == null) {
            throw new c("Field has no @Protobuf config");
        }
        return d1.tag();
    }

    // 检测为 Lambda 实现
    private static void F(Map.Entry map$Entry0, com.google.firebase.encoders.f f0) throws IOException [...]

    private void G(int v) throws IOException {
        while(((long)(v & 0xFFFFFF80)) != 0L) {
            this.a.write(v & 0x7F | 0x80);
            v >>>= 7;
        }
        this.a.write(v & 0x7F);
    }

    private void H(long v) throws IOException {
        while((0xFFFFFFFFFFFFFF80L & v) != 0L) {
            this.a.write(((int)v) & 0x7F | 0x80);
            v >>>= 7;
        }
        this.a.write(((int)v) & 0x7F);
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f b(@NonNull d d0) throws IOException {
        throw new c("nested() is not implemented for protobuf encoding.");
    }

    com.google.firebase.encoders.f c(@NonNull d d0, double f, boolean z) throws IOException {
        if(z && f == 0.0) {
            return this;
        }
        this.G(f.E(d0) << 3 | 1);
        this.a.write(f.y(8).putDouble(f).array());
        return this;
    }

    com.google.firebase.encoders.f d(@NonNull d d0, float f, boolean z) throws IOException {
        if(z && f == 0.0f) {
            return this;
        }
        this.G(f.E(d0) << 3 | 5);
        this.a.write(f.y(4).putFloat(f).array());
        return this;
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f e(@NonNull String s, @Nullable Object object0) throws IOException {
        return this.q(d.d(s), object0);
    }

    com.google.firebase.encoders.f f(@NonNull d d0, @Nullable Object object0, boolean z) throws IOException {
        if(object0 == null) {
            return this;
        }
        if(object0 instanceof CharSequence) {
            if(z && ((CharSequence)object0).length() == 0) {
                return this;
            }
            this.G(f.E(d0) << 3 | 2);
            byte[] arr_b = ((CharSequence)object0).toString().getBytes(f.f);
            this.G(arr_b.length);
            this.a.write(arr_b);
            return this;
        }
        if(object0 instanceof Collection) {
            for(Object object1: ((Collection)object0)) {
                this.f(d0, object1, false);
            }
            return this;
        }
        if(object0 instanceof Map) {
            for(Object object2: ((Map)object0).entrySet()) {
                this.A(f.i, d0, ((Map.Entry)object2), false);
            }
            return this;
        }
        if(object0 instanceof Double) {
            return this.c(d0, ((double)(((Double)object0))), z);
        }
        if(object0 instanceof Float) {
            return this.d(d0, ((float)(((Float)object0))), z);
        }
        if(object0 instanceof Number) {
            return this.v(d0, ((Number)object0).longValue(), z);
        }
        if(object0 instanceof Boolean) {
            return this.x(d0, ((Boolean)object0).booleanValue(), z);
        }
        if(object0 instanceof byte[]) {
            if(z && ((byte[])object0).length == 0) {
                return this;
            }
            this.G(f.E(d0) << 3 | 2);
            this.G(((byte[])object0).length);
            this.a.write(((byte[])object0));
            return this;
        }
        Class class0 = object0.getClass();
        e e0 = (e)this.b.get(class0);
        if(e0 != null) {
            return this.A(e0, d0, object0, z);
        }
        Class class1 = object0.getClass();
        g g0 = (g)this.c.get(class1);
        if(g0 != null) {
            return this.B(g0, d0, object0, z);
        }
        if(object0 instanceof com.google.firebase.encoders.proto.c) {
            return this.g(d0, ((com.google.firebase.encoders.proto.c)object0).getNumber());
        }
        return object0 instanceof Enum ? this.g(d0, ((Enum)object0).ordinal()) : this.A(this.d, d0, object0, z);
    }

    @NonNull
    public f g(@NonNull d d0, int v) throws IOException {
        return this.t(d0, v, true);
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f h(@NonNull d d0, boolean z) throws IOException {
        return this.w(d0, z);
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f i(@NonNull d d0, long v) throws IOException {
        return this.u(d0, v);
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f j(@NonNull d d0, int v) throws IOException {
        return this.g(d0, v);
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f k(@NonNull d d0, float f) throws IOException {
        return this.d(d0, f, true);
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f l(@NonNull d d0, double f) throws IOException {
        return this.c(d0, f, true);
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f m(@NonNull String s, boolean z) throws IOException {
        return this.w(d.d(s), z);
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f n(@NonNull String s, double f) throws IOException {
        return this.l(d.d(s), f);
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f o(@NonNull String s, long v) throws IOException {
        return this.u(d.d(s), v);
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f p(@NonNull String s, int v) throws IOException {
        return this.g(d.d(s), v);
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f q(@NonNull d d0, @Nullable Object object0) throws IOException {
        return this.f(d0, object0, true);
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f r(@Nullable Object object0) throws IOException {
        return this.C(object0);
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f s(@NonNull String s) throws IOException {
        return this.b(d.d(s));
    }

    f t(@NonNull d d0, int v, boolean z) throws IOException {
        if(z && v == 0) {
            return this;
        }
        com.google.firebase.encoders.proto.d d1 = f.D(d0);
        int v1 = a.a[d1.intEncoding().ordinal()];
        if(v1 != 1) {
            switch(v1) {
                case 2: {
                    this.G(d1.tag() << 3);
                    this.G(v << 1 ^ v >> 0x1F);
                    return this;
                }
                case 3: {
                    this.G(d1.tag() << 3 | 5);
                    this.a.write(f.y(4).putInt(v).array());
                    return this;
                }
                default: {
                    return this;
                }
            }
        }
        this.G(d1.tag() << 3);
        this.G(v);
        return this;
    }

    @NonNull
    public f u(@NonNull d d0, long v) throws IOException {
        return this.v(d0, v, true);
    }

    f v(@NonNull d d0, long v, boolean z) throws IOException {
        if(z && v == 0L) {
            return this;
        }
        com.google.firebase.encoders.proto.d d1 = f.D(d0);
        int v1 = a.a[d1.intEncoding().ordinal()];
        if(v1 != 1) {
            switch(v1) {
                case 2: {
                    this.G(d1.tag() << 3);
                    this.H(v >> 0x3F ^ v << 1);
                    return this;
                }
                case 3: {
                    this.G(d1.tag() << 3 | 1);
                    this.a.write(f.y(8).putLong(v).array());
                    return this;
                }
                default: {
                    return this;
                }
            }
        }
        this.G(d1.tag() << 3);
        this.H(v);
        return this;
    }

    @NonNull
    public f w(@NonNull d d0, boolean z) throws IOException {
        return this.x(d0, z, true);
    }

    f x(@NonNull d d0, boolean z, boolean z1) throws IOException {
        return this.t(d0, ((int)z), z1);
    }

    private static ByteBuffer y(int v) {
        return ByteBuffer.allocate(v).order(ByteOrder.LITTLE_ENDIAN);
    }

    private long z(e e0, Object object0) throws IOException {
        try(b b0 = new b()) {
            OutputStream outputStream0 = this.a;
            this.a = b0;
            try {
                e0.a(object0, this);
            }
            finally {
                this.a = outputStream0;
            }
            return b0.a();
        }
    }
}

