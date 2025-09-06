package com.google.firebase.encoders.json;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.f;
import com.google.firebase.encoders.g;
import com.google.firebase.encoders.h;
import d2.b;
import j..util.DesugarTimeZone;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class e implements b {
    static final class com.google.firebase.encoders.json.e.b implements g {
        private static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'", Locale.US);
            com.google.firebase.encoders.json.e.b.a = simpleDateFormat0;
            simpleDateFormat0.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        private com.google.firebase.encoders.json.e.b() {
        }

        com.google.firebase.encoders.json.e.b(a e$a0) {
        }

        @Override  // com.google.firebase.encoders.b
        public void a(@NonNull Object object0, @NonNull Object object1) throws IOException {
            this.b(((Date)object0), ((h)object1));
        }

        public void b(@NonNull Date date0, @NonNull h h0) throws IOException {
            h0.c(com.google.firebase.encoders.json.e.b.a.format(date0));
        }
    }

    private final Map a;
    private final Map b;
    private com.google.firebase.encoders.e c;
    private boolean d;
    private static final com.google.firebase.encoders.e e;
    private static final g f;
    private static final g g;
    private static final com.google.firebase.encoders.json.e.b h;

    static {
        e.e = (Object object0, f f0) -> throw new c("Couldn\'t find encoder for type " + object0.getClass().getCanonicalName());
        e.f = (String s, h h0) -> h0.c(s);
        e.g = (Boolean boolean0, h h0) -> h0.d(boolean0.booleanValue());
        e.h = new com.google.firebase.encoders.json.e.b(null);
    }

    public e() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = e.e;
        this.d = false;
        this.q(String.class, e.f);
        this.q(Boolean.class, e.g);
        this.q(Date.class, e.h);
    }

    @Override  // d2.b
    @NonNull
    public b a(@NonNull Class class0, @NonNull g g0) {
        return this.q(class0, g0);
    }

    @Override  // d2.b
    @NonNull
    public b b(@NonNull Class class0, @NonNull com.google.firebase.encoders.e e0) {
        return this.p(class0, e0);
    }

    @NonNull
    public com.google.firebase.encoders.a j() {
        class a implements com.google.firebase.encoders.a {
            final e a;

            @Override  // com.google.firebase.encoders.a
            public void a(@NonNull Object object0, @NonNull Writer writer0) throws IOException {
                com.google.firebase.encoders.json.f f0 = new com.google.firebase.encoders.json.f(writer0, e.this.a, e.this.b, e.this.c, e.this.d);
                f0.x(object0, false);
                f0.H();
            }

            @Override  // com.google.firebase.encoders.a
            public String b(@NonNull Object object0) {
                StringWriter stringWriter0 = new StringWriter();
                try {
                    this.a(object0, stringWriter0);
                }
                catch(IOException unused_ex) {
                }
                return stringWriter0.toString();
            }
        }

        return new a(this);
    }

    @NonNull
    public e k(@NonNull d2.a a0) {
        a0.a(this);
        return this;
    }

    @NonNull
    public e l(boolean z) {
        this.d = z;
        return this;
    }

    // 检测为 Lambda 实现
    private static void m(Object object0, f f0) throws IOException [...]

    // 检测为 Lambda 实现
    private static void n(String s, h h0) throws IOException [...]

    // 检测为 Lambda 实现
    private static void o(Boolean boolean0, h h0) throws IOException [...]

    @NonNull
    public e p(@NonNull Class class0, @NonNull com.google.firebase.encoders.e e0) {
        this.a.put(class0, e0);
        this.b.remove(class0);
        return this;
    }

    @NonNull
    public e q(@NonNull Class class0, @NonNull g g0) {
        this.b.put(class0, g0);
        this.a.remove(class0);
        return this;
    }

    @NonNull
    public e r(@NonNull com.google.firebase.encoders.e e0) {
        this.c = e0;
        return this;
    }
}

