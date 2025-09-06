package com.facebook.cache.disk;

import androidx.annotation.VisibleForTesting;
import com.facebook.cache.common.b;
import com.facebook.common.internal.q;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import k1.n.a;
import k1.n;

@n(a.a)
public class h implements f {
    @VisibleForTesting
    static class com.facebook.cache.disk.h.a {
        @o3.h
        public final f a;
        @o3.h
        public final File b;

        @VisibleForTesting
        com.facebook.cache.disk.h.a(@o3.h File file0, @o3.h f f0) {
            this.a = f0;
            this.b = file0;
        }
    }

    private final int a;
    private final q b;
    private final String c;
    private final b d;
    @VisibleForTesting
    volatile com.facebook.cache.disk.h.a e;
    private static final Class f;

    static {
        h.f = h.class;
    }

    public h(int v, q q0, String s, b b0) {
        this.a = v;
        this.d = b0;
        this.b = q0;
        this.c = s;
        this.e = new com.facebook.cache.disk.h.a(null, null);
    }

    @Override  // com.facebook.cache.disk.f
    public Collection T() throws IOException {
        return this.m().T();
    }

    @Override  // com.facebook.cache.disk.f
    public com.facebook.cache.disk.f.a a() throws IOException {
        return this.m().a();
    }

    @Override  // com.facebook.cache.disk.f
    public void b() throws IOException {
        this.m().b();
    }

    @Override  // com.facebook.cache.disk.f
    public long c(c f$c0) throws IOException {
        return this.m().c(f$c0);
    }

    @Override  // com.facebook.cache.disk.f
    public d d(String s, Object object0) throws IOException {
        return this.m().d(s, object0);
    }

    @Override  // com.facebook.cache.disk.f
    public boolean e(String s, Object object0) throws IOException {
        return this.m().e(s, object0);
    }

    @Override  // com.facebook.cache.disk.f
    public String f() {
        try {
            return this.m().f();
        }
        catch(IOException unused_ex) {
            return "";
        }
    }

    @Override  // com.facebook.cache.disk.f
    public void g() {
        try {
            this.m().g();
        }
        catch(IOException iOException0) {
            x0.a.r(h.f, "purgeUnexpectedResources", iOException0);
        }
    }

    @Override  // com.facebook.cache.disk.f
    public boolean h(String s, Object object0) throws IOException {
        return this.m().h(s, object0);
    }

    @Override  // com.facebook.cache.disk.f
    @o3.h
    public r0.a i(String s, Object object0) throws IOException {
        return this.m().i(s, object0);
    }

    @Override  // com.facebook.cache.disk.f
    public boolean isEnabled() {
        try {
            return this.m().isEnabled();
        }
        catch(IOException unused_ex) {
            return false;
        }
    }

    @Override  // com.facebook.cache.disk.f
    public boolean isExternal() {
        try {
            return this.m().isExternal();
        }
        catch(IOException unused_ex) {
            return false;
        }
    }

    @VisibleForTesting
    void j(File file0) throws IOException {
        try {
            v0.c.a(file0);
        }
        catch(v0.c.a c$a0) {
            this.d.a(com.facebook.cache.common.b.a.k, h.f, "createRootDirectoryIfNecessary", c$a0);
            throw c$a0;
        }
        String s = file0.getAbsolutePath();
        x0.a.b(h.f, "Created cache directory %s", s);
    }

    private void k() throws IOException {
        File file0 = new File(((File)this.b.get()), this.c);
        this.j(file0);
        this.e = new com.facebook.cache.disk.h.a(file0, new com.facebook.cache.disk.a(file0, this.a, this.d));
    }

    @VisibleForTesting
    void l() {
        if(this.e.a != null && this.e.b != null) {
            v0.a.b(this.e.b);
        }
    }

    @VisibleForTesting
    f m() throws IOException {
        synchronized(this) {
            if(this.n()) {
                this.l();
                this.k();
            }
            return (f)com.facebook.common.internal.n.i(this.e.a);
        }
    }

    private boolean n() {
        return this.e.a == null || (this.e.b == null || !this.e.b.exists());
    }

    @Override  // com.facebook.cache.disk.f
    public long remove(String s) throws IOException {
        return this.m().remove(s);
    }
}

