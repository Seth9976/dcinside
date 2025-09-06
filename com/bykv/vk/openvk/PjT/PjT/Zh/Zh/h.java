package com.bykv.vk.openvk.PjT.PjT.Zh.Zh;

import B.c;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.util.List;

class h extends d {
    static final class a {
        String a;
        String b;
        l c;
        d.b d;
        h.d e;
        List f;
        int g;
        f h;
        b i;
        Object j;

        a a(int v) {
            this.g = v;
            return this;
        }

        a b(d.b d$b0) {
            if(d$b0 == null) {
                throw new IllegalArgumentException("cache == null");
            }
            this.d = d$b0;
            return this;
        }

        a c(f f0) {
            this.h = f0;
            return this;
        }

        a d(b h$b0) {
            this.i = h$b0;
            return this;
        }

        a e(h.d h$d0) {
            if(h$d0 == null) {
                throw new IllegalArgumentException("db == null");
            }
            this.e = h$d0;
            return this;
        }

        a f(l l0) {
            if(l0 == null) {
                throw new IllegalArgumentException("urls is empty");
            }
            this.c = l0;
            return this;
        }

        a g(Object object0) {
            this.j = object0;
            return this;
        }

        a h(String s) {
            if(TextUtils.isEmpty(s)) {
                throw new IllegalArgumentException("rawKey == null");
            }
            this.a = s;
            return this;
        }

        a i(List list0) {
            this.f = list0;
            return this;
        }

        h j() {
            if(this.d == null || this.e == null || TextUtils.isEmpty(this.a) || TextUtils.isEmpty(this.b) || this.c == null) {
                throw new IllegalArgumentException();
            }
            return new h(this);
        }

        a k(String s) {
            if(TextUtils.isEmpty(s)) {
                throw new IllegalArgumentException("key == null");
            }
            this.b = s;
            return this;
        }
    }

    public interface b {
        void a(h arg1);
    }

    private final int p;
    private final b q;
    final Object r;
    final Object s;
    private volatile com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a.a t;
    private volatile c u;

    h(a h$a0) {
        super(h$a0.d, h$a0.e);
        this.p = h$a0.g;
        this.q = h$a0.i;
        this.r = this;
        this.g = h$a0.a;
        this.h = h$a0.b;
        this.f = h$a0.f;
        this.j = h$a0.c;
        this.i = h$a0.h;
        this.s = h$a0.j;
    }

    com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a.a k() {
        return this.t;
    }

    private boolean l() throws B.a {
        while(this.j.a()) {
            this.a();
            com.bykv.vk.openvk.PjT.PjT.Zh.Zh.l.a l$a0 = this.j.c();
            try {
                this.m(l$a0);
                return true;
            }
            catch(B.b unused_ex) {
                l$a0.a();
            }
            catch(IOException iOException0) {
                if(iOException0 instanceof SocketTimeoutException) {
                    l$a0.b();
                }
                if(!this.h()) {
                }
            }
            catch(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a.a a$a0) {
                this.t = a$a0;
                return false;
            }
            catch(c c0) {
                this.u = c0;
                return false;
            }
            catch(Throwable unused_ex) {
                return false;
            }
        }
        return false;
    }

    private void m(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.l.a l$a0) throws IOException, com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a.a, B.a, c {
        com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a a1;
        InputStream inputStream0;
        int v4;
        com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a a0;
        boolean z;
        File file0 = this.a.b(this.h);
        long v = file0.length();
        if(this.p > 0 && v >= ((long)this.p)) {
            if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
                Log.i("TAG_PROXY_DownloadTask", "no necessary to download for " + this.h + ", cache file size: " + v + ", max: " + this.p);
            }
            return;
        }
        int v1 = this.j();
        h.c h$c0 = this.b.c(this.h, v1);
        if(h$c0 != null && v >= ((long)h$c0.c)) {
            if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
                Log.i("TAG_PROXY_DownloadTask", "file download complete, key: " + this.h);
            }
            return;
        }
        this.a();
        int v2 = (int)v;
        c.c c$c0 = this.c(l$a0, v2, this.p, "GET");
        if(c$c0 == null) {
            return;
        }
        try {
            z = true;
            a0 = null;
            this.a();
            String s = com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a.g(c$c0, this.i == null && com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.g, true);
            if(s != null) {
                throw new B.b(s + ", rawKey: " + this.g + ", url: " + l$a0);
            }
            int v3 = com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a.b(c$c0);
            if(h$c0 != null && h$c0.c != v3) {
                if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
                    Log.e("TAG_PROXY_DownloadTask", "Content-Length not match, old: " + h$c0.c + ", " + v3 + ", key: " + this.h);
                }
                throw new c("Content-Length not match, old length: " + h$c0.c + ", new length: " + v3 + ", rawKey: " + this.g + ", currentUrl: " + l$a0 + ", previousInfo: " + h$c0.e);
            }
            com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a.d(c$c0, this.b, this.h, v1);
            h.c h$c1 = this.b.c(this.h, v1);
            v4 = h$c1 == null ? 0 : h$c1.c;
            inputStream0 = c$c0.i();
            a1 = new com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a(file0, "rw");
            goto label_36;
        }
        catch(Throwable throwable0) {
        }
        goto label_78;
        try {
        label_36:
            a1.c(v);
            if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
                Log.i("TAG_PROXY_DownloadTask", "preload start from: " + v);
            }
            byte[] arr_b = new byte[0x2000];
            while(true) {
                int v5 = inputStream0.read(arr_b);
                if(v5 < 0) {
                    goto label_71;
                }
                this.a();
                if(v5 > 0) {
                    a1.d(arr_b, 0, v5);
                    v2 += v5;
                    if(this.i != null) {
                        synchronized(this.r) {
                            this.r.notifyAll();
                        }
                    }
                    this.c.addAndGet(v5);
                    this.e(v4, v2);
                }
                if(this.p > 0 && v2 >= this.p) {
                    break;
                }
                this.a();
            }
            boolean z1 = com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d;
            if(z1) {
                Log.w("TAG_PROXY_DownloadTask", "download, more data received, currentCacheFileSize: " + v2 + ", max: " + this.p);
            }
        }
        catch(Throwable throwable0) {
            a0 = a1;
            goto label_78;
        }
        com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a.m(c$c0.i());
        a1.b();
        this.d();
        if(z1) {
            Log.w("TAG_PROXY_DownloadTask", "cancel call");
        }
        return;
        try {
        label_71:
            this.f();
            if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
                Log.i("TAG_PROXY_DownloadTask", "download succeed, no need to cancel call");
            }
            goto label_86;
        }
        catch(Throwable throwable0) {
            a0 = a1;
            z = false;
        }
    label_78:
        com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a.m(c$c0.i());
        if(a0 != null) {
            a0.b();
        }
        if(z) {
            this.d();
            if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
                Log.w("TAG_PROXY_DownloadTask", "cancel call");
            }
        }
        throw throwable0;
    label_86:
        com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a.m(c$c0.i());
        a1.b();
    }

    c n() {
        return this.u;
    }

    @Override
    public void run() {
        this.a.a(this.h);
        long v = SystemClock.elapsedRealtime();
        try {
            this.l();
        }
        catch(B.a | Throwable unused_ex) {
        }
        long v1 = SystemClock.elapsedRealtime();
        this.d.set(v1 - v);
        this.a.c(this.h);
        b h$b0 = this.q;
        if(h$b0 != null) {
            h$b0.a(this);
        }
    }
}

