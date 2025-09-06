package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.common.i;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

class h implements c {
    static class b {
        public final byte[] a;
        public final int b;

        b(byte[] arr_b, int v) {
            this.a = arr_b;
            this.b = v;
        }
    }

    private final File a;
    private final int b;
    private g c;
    private static final Charset d;

    static {
        h.d = Charset.forName("UTF-8");
    }

    h(File file0, int v) {
        this.a = file0;
        this.b = v;
    }

    @Override  // com.google.firebase.crashlytics.internal.metadata.c
    public byte[] a() {
        b h$b0 = this.g();
        if(h$b0 == null) {
            return null;
        }
        byte[] arr_b = new byte[h$b0.b];
        System.arraycopy(h$b0.a, 0, arr_b, 0, h$b0.b);
        return arr_b;
    }

    @Override  // com.google.firebase.crashlytics.internal.metadata.c
    public void b() {
        this.d();
        this.a.delete();
    }

    @Override  // com.google.firebase.crashlytics.internal.metadata.c
    public void c(long v, String s) {
        this.h();
        this.f(v, s);
    }

    @Override  // com.google.firebase.crashlytics.internal.metadata.c
    public void d() {
        i.f(this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
    }

    @Override  // com.google.firebase.crashlytics.internal.metadata.c
    public String e() {
        byte[] arr_b = this.a();
        return arr_b == null ? null : new String(arr_b, h.d);
    }

    private void f(long v, String s) {
        if(this.c == null) {
            return;
        }
        if(s == null) {
            s = "null";
        }
        try {
            int v1 = this.b / 4;
            if(s.length() > v1) {
                s = "..." + s.substring(s.length() - v1);
            }
            this.c.f(String.format(Locale.US, "%d %s%n", v, s.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(h.d));
            while(true) {
                if(this.c.q() || this.c.f0() <= this.b) {
                    return;
                }
                this.c.T();
            }
        }
        catch(IOException iOException0) {
        }
        com.google.firebase.crashlytics.internal.g.f().e("There was a problem writing to the Crashlytics log.", iOException0);
    }

    private b g() {
        class a implements d {
            final byte[] a;
            final int[] b;
            final h c;

            a(byte[] arr_b, int[] arr_v) {
                this.a = arr_b;
                this.b = arr_v;
                super();
            }

            @Override  // com.google.firebase.crashlytics.internal.metadata.g$d
            public void c(InputStream inputStream0, int v) throws IOException {
                try(inputStream0) {
                    inputStream0.read(this.a, this.b[0], v);
                    this.b[0] += v;
                }
            }
        }

        if(!this.a.exists()) {
            return null;
        }
        this.h();
        g g0 = this.c;
        if(g0 == null) {
            return null;
        }
        int[] arr_v = {0};
        byte[] arr_b = new byte[g0.f0()];
        try {
            this.c.n(new a(this, arr_b, arr_v));
            return new b(arr_b, arr_v[0]);
        }
        catch(IOException iOException0) {
            com.google.firebase.crashlytics.internal.g.f().e("A problem occurred while reading the Crashlytics log file.", iOException0);
            return new b(arr_b, arr_v[0]);
        }
    }

    private void h() {
        if(this.c == null) {
            try {
                this.c = new g(this.a);
            }
            catch(IOException iOException0) {
                com.google.firebase.crashlytics.internal.g.f().e("Could not open log file: " + this.a, iOException0);
            }
        }
    }
}

