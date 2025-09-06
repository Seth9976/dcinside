package com.google.firebase.encoders.json;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.d;
import com.google.firebase.encoders.e;
import com.google.firebase.encoders.g;
import com.google.firebase.encoders.h;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map.Entry;
import java.util.Map;

final class f implements com.google.firebase.encoders.f, h {
    private f a;
    private boolean b;
    private final JsonWriter c;
    private final Map d;
    private final Map e;
    private final e f;
    private final boolean g;

    private f(f f0) {
        this.a = null;
        this.b = true;
        this.c = f0.c;
        this.d = f0.d;
        this.e = f0.e;
        this.f = f0.f;
        this.g = f0.g;
    }

    f(@NonNull Writer writer0, @NonNull Map map0, @NonNull Map map1, e e0, boolean z) {
        this.a = null;
        this.b = true;
        this.c = new JsonWriter(writer0);
        this.d = map0;
        this.e = map1;
        this.f = e0;
        this.g = z;
    }

    @NonNull
    public f A(@NonNull String s, int v) throws IOException {
        this.L();
        this.c.name(s);
        return this.v(v);
    }

    @NonNull
    public f B(@NonNull String s, long v) throws IOException {
        this.L();
        this.c.name(s);
        return this.w(v);
    }

    // 去混淆评级： 低(20)
    @NonNull
    public f C(@NonNull String s, @Nullable Object object0) throws IOException {
        return this.g ? this.K(s, object0) : this.J(s, object0);
    }

    @NonNull
    public f D(@NonNull String s, boolean z) throws IOException {
        this.L();
        this.c.name(s);
        return this.E(z);
    }

    @NonNull
    public f E(boolean z) throws IOException {
        this.L();
        this.c.value(z);
        return this;
    }

    @NonNull
    public f F(@Nullable byte[] arr_b) throws IOException {
        this.L();
        if(arr_b == null) {
            this.c.nullValue();
            return this;
        }
        String s = Base64.encodeToString(arr_b, 2);
        this.c.value(s);
        return this;
    }

    // 去混淆评级： 中等(50)
    private boolean G(Object object0) {
        return object0 == null || object0.getClass().isArray() || object0 instanceof Collection || object0 instanceof Date || object0 instanceof Enum || object0 instanceof Number;
    }

    void H() throws IOException {
        this.L();
        this.c.flush();
    }

    f I(e e0, Object object0, boolean z) throws IOException {
        if(!z) {
            this.c.beginObject();
        }
        e0.a(object0, this);
        if(!z) {
            this.c.endObject();
        }
        return this;
    }

    private f J(@NonNull String s, @Nullable Object object0) throws IOException, c {
        this.L();
        this.c.name(s);
        if(object0 == null) {
            this.c.nullValue();
            return this;
        }
        return this.x(object0, false);
    }

    private f K(@NonNull String s, @Nullable Object object0) throws IOException, c {
        if(object0 == null) {
            return this;
        }
        this.L();
        this.c.name(s);
        return this.x(object0, false);
    }

    private void L() throws IOException {
        if(!this.b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        f f0 = this.a;
        if(f0 != null) {
            f0.L();
            this.a.b = false;
            this.a = null;
            this.c.endObject();
        }
    }

    @Override  // com.google.firebase.encoders.h
    @NonNull
    public h a(long v) throws IOException {
        return this.w(v);
    }

    @Override  // com.google.firebase.encoders.h
    @NonNull
    public h add(int v) throws IOException {
        return this.v(v);
    }

    @Override  // com.google.firebase.encoders.h
    @NonNull
    public h add(@Nullable byte[] arr_b) throws IOException {
        return this.F(arr_b);
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f b(@NonNull d d0) throws IOException {
        return this.s(d0.b());
    }

    @Override  // com.google.firebase.encoders.h
    @NonNull
    public h c(@Nullable String s) throws IOException {
        return this.y(s);
    }

    @Override  // com.google.firebase.encoders.h
    @NonNull
    public h d(boolean z) throws IOException {
        return this.E(z);
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f e(@NonNull String s, @Nullable Object object0) throws IOException {
        return this.C(s, object0);
    }

    @Override  // com.google.firebase.encoders.h
    @NonNull
    public h f(double f) throws IOException {
        return this.t(f);
    }

    @Override  // com.google.firebase.encoders.h
    @NonNull
    public h g(float f) throws IOException {
        return this.u(f);
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f h(@NonNull d d0, boolean z) throws IOException {
        return this.D(d0.b(), z);
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f i(@NonNull d d0, long v) throws IOException {
        return this.B(d0.b(), v);
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f j(@NonNull d d0, int v) throws IOException {
        return this.A(d0.b(), v);
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f k(@NonNull d d0, float f) throws IOException {
        return this.z(d0.b(), ((double)f));
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f l(@NonNull d d0, double f) throws IOException {
        return this.z(d0.b(), f);
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f m(@NonNull String s, boolean z) throws IOException {
        return this.D(s, z);
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f n(@NonNull String s, double f) throws IOException {
        return this.z(s, f);
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f o(@NonNull String s, long v) throws IOException {
        return this.B(s, v);
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f p(@NonNull String s, int v) throws IOException {
        return this.A(s, v);
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f q(@NonNull d d0, @Nullable Object object0) throws IOException {
        return this.C(d0.b(), object0);
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f r(@Nullable Object object0) throws IOException {
        return this.x(object0, true);
    }

    @Override  // com.google.firebase.encoders.f
    @NonNull
    public com.google.firebase.encoders.f s(@NonNull String s) throws IOException {
        this.L();
        this.a = new f(this);
        this.c.name(s);
        this.c.beginObject();
        return this.a;
    }

    @NonNull
    public f t(double f) throws IOException {
        this.L();
        this.c.value(f);
        return this;
    }

    @NonNull
    public f u(float f) throws IOException {
        this.L();
        this.c.value(((double)f));
        return this;
    }

    @NonNull
    public f v(int v) throws IOException {
        this.L();
        this.c.value(((long)v));
        return this;
    }

    @NonNull
    public f w(long v) throws IOException {
        this.L();
        this.c.value(v);
        return this;
    }

    @NonNull
    f x(@Nullable Object object0, boolean z) throws IOException {
        int v = 0;
        if(z && this.G(object0)) {
            throw new c(String.format("%s cannot be encoded inline", (object0 == null ? null : object0.getClass())));
        }
        if(object0 == null) {
            this.c.nullValue();
            return this;
        }
        if(object0 instanceof Number) {
            this.c.value(((Number)object0));
            return this;
        }
        if(object0.getClass().isArray()) {
            if(object0 instanceof byte[]) {
                return this.F(((byte[])object0));
            }
            this.c.beginArray();
            if(object0 instanceof int[]) {
                while(v < ((int[])object0).length) {
                    this.c.value(((long)((int[])object0)[v]));
                    ++v;
                }
            }
            else if(object0 instanceof long[]) {
                while(v < ((long[])object0).length) {
                    this.w(((long[])object0)[v]);
                    ++v;
                }
            }
            else if(object0 instanceof double[]) {
                while(v < ((double[])object0).length) {
                    this.c.value(((double[])object0)[v]);
                    ++v;
                }
            }
            else if(object0 instanceof boolean[]) {
                while(v < ((boolean[])object0).length) {
                    this.c.value(((boolean[])object0)[v]);
                    ++v;
                }
            }
            else if(object0 instanceof Number[]) {
                for(int v1 = 0; v1 < ((Number[])object0).length; ++v1) {
                    this.x(((Number[])object0)[v1], false);
                }
            }
            else {
                for(int v2 = 0; v2 < ((Object[])object0).length; ++v2) {
                    this.x(((Object[])object0)[v2], false);
                }
            }
            this.c.endArray();
            return this;
        }
        if(object0 instanceof Collection) {
            this.c.beginArray();
            for(Object object1: ((Collection)object0)) {
                this.x(object1, false);
            }
            this.c.endArray();
            return this;
        }
        if(object0 instanceof Map) {
            this.c.beginObject();
            for(Object object2: ((Map)object0).entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object2;
                Object object3 = map$Entry0.getKey();
                try {
                    this.C(((String)object3), map$Entry0.getValue());
                }
                catch(ClassCastException classCastException0) {
                    throw new c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", object3, object3.getClass()), classCastException0);
                }
            }
            this.c.endObject();
            return this;
        }
        Class class0 = object0.getClass();
        e e0 = (e)this.d.get(class0);
        if(e0 != null) {
            return this.I(e0, object0, z);
        }
        Class class1 = object0.getClass();
        g g0 = (g)this.e.get(class1);
        if(g0 != null) {
            g0.a(object0, this);
            return this;
        }
        if(object0 instanceof Enum) {
            if(object0 instanceof com.google.firebase.encoders.json.g) {
                this.v(((com.google.firebase.encoders.json.g)object0).getNumber());
                return this;
            }
            this.y(((Enum)object0).name());
            return this;
        }
        return this.I(this.f, object0, z);
    }

    @NonNull
    public f y(@Nullable String s) throws IOException {
        this.L();
        this.c.value(s);
        return this;
    }

    @NonNull
    public f z(@NonNull String s, double f) throws IOException {
        this.L();
        this.c.name(s);
        return this.t(f);
    }
}

