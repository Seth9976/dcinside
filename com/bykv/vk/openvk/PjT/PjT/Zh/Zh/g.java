package com.bykv.vk.openvk.PjT.PjT.Zh.Zh;

import android.os.SystemClock;
import android.util.Log;
import com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.Au.XX;
import com.bytedance.sdk.component.Au.cz;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;

class g extends d {
    static final class c {
        d.b a;
        h.d b;
        Socket c;
        com.bykv.vk.openvk.PjT.PjT.Zh.Zh.g.d d;

        c a(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.g.d g$d0) {
            this.d = g$d0;
            return this;
        }

        c b(h.d h$d0) {
            if(h$d0 == null) {
                throw new IllegalArgumentException("db == null");
            }
            this.b = h$d0;
            return this;
        }

        c c(Socket socket0) {
            if(socket0 == null) {
                throw new IllegalArgumentException("socket == null");
            }
            this.c = socket0;
            return this;
        }

        g d() {
            if(this.b == null || this.c == null) {
                throw new IllegalArgumentException();
            }
            return new g(this);
        }
    }

    public interface com.bykv.vk.openvk.PjT.PjT.Zh.Zh.g.d {
        void a(g arg1);

        void b(g arg1);
    }

    static class e {
        private final OutputStream a;
        private int b;
        private boolean c;

        e(OutputStream outputStream0, int v) {
            this.a = outputStream0;
            this.b = v;
        }

        void a(byte[] arr_b, int v, int v1) throws B.d {
            if(!this.c) {
                try {
                    this.a.write(arr_b, v, v1);
                    this.c = true;
                }
                catch(IOException iOException0) {
                    throw new B.d(iOException0);
                }
            }
        }

        boolean b() {
            return this.c;
        }

        int c() {
            return this.b;
        }

        void d(byte[] arr_b, int v, int v1) throws B.d {
            try {
                this.a.write(arr_b, v, v1);
                this.b += v1;
            }
            catch(IOException iOException0) {
                throw new B.d(iOException0);
            }
        }
    }

    private final Socket p;
    private final com.bykv.vk.openvk.PjT.PjT.Zh.Zh.g.d q;
    private final i r;
    private volatile h s;
    private volatile boolean t;

    g(c g$c0) {
        super(g$c0.a, g$c0.b);
        this.t = true;
        this.p = g$c0.c;
        this.q = g$c0.d;
        this.r = i.l();
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.Zh.d
    public void d() {
        super.d();
        this.r();
    }

    private e k() {
        try {
            this.i = f.a(this.p.getInputStream());
            OutputStream outputStream0 = this.p.getOutputStream();
            d.d d$d0 = this.i.c.a == 1 ? com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.a : com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.b;
            if(d$d0 == null) {
                if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
                    Log.e("TAG_PROXY_ProxyTask", "cache is null");
                }
                return null;
            }
            this.a = d$d0;
            this.g = this.i.c.b;
            this.h = this.i.c.c;
            this.j = new l(this.i.c.g);
            this.f = this.i.b;
            if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
                Log.i("TAG_PROXY_ProxyTask", "request from MediaPlayer:    " + this.i.toString());
            }
            return new e(outputStream0, this.i.c.d);
        }
        catch(IOException iOException0) {
        }
        catch(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.f.d f$d0) {
            goto label_25;
        }
        a.q(this.p);
        if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
            Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(iOException0));
        }
        return null;
    label_25:
        a.q(this.p);
        if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
            Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(f$d0));
        }
        return null;
    }

    private void m(e g$e0, com.bykv.vk.openvk.PjT.PjT.Zh.Zh.l.a l$a0) throws B.d, IOException, com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a.a, B.a, B.c {
        if("HEAD".equalsIgnoreCase(this.i.a.a)) {
            this.s(g$e0, l$a0);
            return;
        }
        this.q(g$e0, l$a0);
    }

    private void n(h.c h$c0, File file0, e g$e0, com.bykv.vk.openvk.PjT.PjT.Zh.Zh.l.a l$a0) throws IOException, B.d, com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a.a, B.a, B.c {
        class com.bykv.vk.openvk.PjT.PjT.Zh.Zh.g.a implements b {
            final g a;

            @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.Zh.h$b
            public void a(h h0) {
                int v = h0.c.get();
                g.this.c.addAndGet(v);
                long v1 = h0.d.get();
                g.this.d.addAndGet(v1);
                synchronized(h0.r) {
                    h0.r.notifyAll();
                }
                if(h0.i()) {
                    g.this.r.h(g.this.g(), null);
                }
            }
        }


        class com.bykv.vk.openvk.PjT.PjT.Zh.Zh.g.b extends Au {
            final XX a;
            final g b;

            com.bykv.vk.openvk.PjT.PjT.Zh.Zh.g.b(String s, XX xX0) {
                this.a = xX0;
                super(s);
            }

            @Override
            public void run() {
                this.a.run();
            }
        }

        com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a a1;
        byte[] arr_b1;
        XX xX0;
        if(!g$e0.b()) {
            byte[] arr_b = this.p(h$c0, g$e0, l$a0);
            this.a();
            if(arr_b == null) {
                return;
            }
            g$e0.a(arr_b, 0, arr_b.length);
        }
        com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a a0 = null;
        if(h$c0 == null) {
            h$c0 = this.b.c(this.h, this.i.c.a);
            if(h$c0 == null) {
                if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
                    Log.e("TAG_PROXY_ProxyTask", "failed to get video header info from db");
                }
                this.p(null, g$e0, l$a0);
                h$c0 = this.b.c(this.h, this.i.c.a);
                if(h$c0 == null) {
                    throw new B.b("failed to get header, rawKey: " + this.g + ", url: " + l$a0);
                }
            }
        }
        if(file0.length() < ((long)h$c0.c)) {
            h h0 = this.s;
            if(h0 != null && !h0.h() && !h0.i()) {
                xX0 = null;
            }
            else {
                h h1 = new com.bykv.vk.openvk.PjT.PjT.Zh.Zh.h.a().b(this.a).e(this.b).h(this.g).k(this.h).f(new l(l$a0.a)).i(this.f).c(this.i).d(new com.bykv.vk.openvk.PjT.PjT.Zh.Zh.g.a(this)).j();
                this.s = h1;
                xX0 = new XX(h1, null, 10, 1);
                cz.Zh(new com.bykv.vk.openvk.PjT.PjT.Zh.Zh.g.b(this, "processCacheNetWorkConcurrent", xX0));
                if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
                    Log.e("TAG_PROXY_ProxyTask", "fire download in process cache task");
                }
            }
        }
        else {
            xX0 = null;
        }
        try {
            arr_b1 = new byte[0x2000];
            a1 = new com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a(file0, "r");
        }
        catch(Throwable throwable0) {
            goto label_71;
        }
        try {
            a1.c(((long)g$e0.c()));
            int v = this.i.c.e <= 0 ? h$c0.c : Math.min(h$c0.c, this.i.c.e);
            while(g$e0.c() < v) {
                this.a();
                int v1 = a1.a(arr_b1);
                if(v1 > 0) {
                    g$e0.d(arr_b1, 0, v1);
                }
                else {
                    h h2 = this.s;
                    if(h2 != null) {
                        B.c c0 = h2.n();
                        if(c0 != null) {
                            throw c0;
                        }
                        com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a.a a$a0 = h2.k();
                        if(a$a0 != null) {
                            throw a$a0;
                        }
                    }
                    if(h2 == null || h2.h() || h2.i()) {
                        if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
                            Log.e("TAG_PROXY_ProxyTask", "download task has finished!!!");
                        }
                        throw new B.b("illegal state download task has finished, rawKey: " + this.g + ", url: " + l$a0);
                    }
                    this.a();
                    Object object0 = h2.r;
                    __monitor_enter(object0);
                    try {
                        h2.r.wait(1000L);
                    }
                    catch(InterruptedException throwable1) {
                        __monitor_exit(object0);
                        throw throwable1;
                    }
                    catch(Throwable unused_ex) {
                    }
                    __monitor_exit(object0);
                }
                this.a();
            }
            if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
                Log.i("TAG_PROXY_ProxyTask", "read cache file complete: " + g$e0.c() + ", " + v);
            }
            this.f();
            goto label_76;
        }
        catch(Throwable throwable0) {
            a0 = a1;
        }
    label_71:
        if(a0 != null) {
            a0.b();
        }
        if(xX0 != null) {
            try {
                xX0.get();
            }
            catch(Throwable unused_ex) {
            }
        }
        throw throwable0;
    label_76:
        a1.b();
        if(xX0 != null) {
            try {
                xX0.get();
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    private boolean o(e g$e0) throws B.a {
        while(this.j.a()) {
            this.a();
            com.bykv.vk.openvk.PjT.PjT.Zh.Zh.l.a l$a0 = this.j.c();
            try {
                this.m(g$e0, l$a0);
                return true;
            }
            catch(B.b unused_ex) {
                l$a0.a();
            }
            catch(IOException iOException0) {
                if(iOException0 instanceof SocketTimeoutException) {
                    l$a0.b();
                }
                if(!this.h() || !com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
                    continue;
                }
                if("Canceled".equalsIgnoreCase(iOException0.getMessage())) {
                    Log.w("TAG_PROXY_ProxyTask", "okhttp call canceled");
                    continue;
                }
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(iOException0));
            }
            catch(B.d d0) {
                if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(d0));
                }
                return true;
            }
            catch(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a.a a$a0) {
                if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(a$a0));
                }
                this.t = false;
            }
            catch(B.c c0) {
                if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(c0));
                }
                return false;
            }
            catch(Exception exception0) {
                if(!com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
                    continue;
                }
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(exception0));
            }
        }
        return false;
    }

    private byte[] p(h.c h$c0, e g$e0, com.bykv.vk.openvk.PjT.PjT.Zh.Zh.l.a l$a0) throws IOException {
        String s;
        if(h$c0 != null) {
            if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
                Log.i("TAG_PROXY_ProxyTask", "get header from db");
            }
            return a.h(h$c0, g$e0.c()).getBytes(a.b);
        }
        c.c c$c0 = this.c(l$a0, 0, -1, "HEAD");
        if(c$c0 == null) {
            return null;
        }
        try {
            s = a.g(c$c0, false, false);
            if(s == null) {
                h.c h$c1 = a.d(c$c0, this.b, this.h, this.i.c.a);
                if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
                    Log.w("TAG_PROXY_ProxyTask", "get header from network");
                }
                return a.h(h$c1, g$e0.c()).getBytes(a.b);
            }
        }
        finally {
            a.m(c$c0.i());
        }
        throw new B.b(s + ", rawKey: " + this.g + ", url: " + l$a0);
    }

    private void q(e g$e0, com.bykv.vk.openvk.PjT.PjT.Zh.Zh.l.a l$a0) throws com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a.a, B.d, IOException, B.a, B.c {
        if(this.t) {
            File file0 = this.a.b(this.h);
            long v = file0.length();
            h.c h$c0 = this.b.c(this.h, this.i.c.a);
            int v1 = g$e0.c();
            if(v > ((long)g$e0.c())) {
                if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
                    Log.i("TAG_PROXY_ProxyTask", "cache hit, remainSize: " + (v - ((long)v1)));
                }
                this.n(h$c0, file0, g$e0, l$a0);
                return;
            }
        }
        this.t(g$e0, l$a0);
    }

    private void r() {
        h h0 = this.s;
        this.s = null;
        if(h0 != null) {
            h0.d();
        }
    }

    @Override
    public void run() {
        e g$e0 = this.k();
        if(g$e0 == null) {
            return;
        }
        com.bykv.vk.openvk.PjT.PjT.Zh.Zh.g.d g$d0 = this.q;
        if(g$d0 != null) {
            g$d0.b(this);
        }
        this.a.a(this.h);
        if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.j != 0) {
            h.c h$c0 = this.b.c(this.h, this.i.c.a);
            if(h$c0 == null || this.a.b(this.h).length() < ((long)h$c0.c)) {
                boolean z = this.g();
                this.r.h(z, this.h);
            }
        }
        try {
            this.o(g$e0);
        }
        catch(B.a a0) {
            if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(a0));
            }
        }
        catch(Throwable throwable0) {
            if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(throwable0));
            }
        }
        this.a.c(this.h);
        boolean z1 = this.g();
        this.r.h(z1, null);
        this.d();
        a.q(this.p);
        com.bykv.vk.openvk.PjT.PjT.Zh.Zh.g.d g$d1 = this.q;
        if(g$d1 != null) {
            g$d1.a(this);
        }
    }

    private void s(e g$e0, com.bykv.vk.openvk.PjT.PjT.Zh.Zh.l.a l$a0) throws IOException, B.d {
        byte[] arr_b = this.p(this.b.c(this.h, this.i.c.a), g$e0, l$a0);
        if(arr_b == null) {
            return;
        }
        g$e0.a(arr_b, 0, arr_b.length);
    }

    private void t(e g$e0, com.bykv.vk.openvk.PjT.PjT.Zh.Zh.l.a l$a0) throws B.d, IOException, B.a, B.c {
        int v8;
        int v7;
        InputStream inputStream0;
        byte[] arr_b1;
        int v6;
        com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a a1;
        File file0;
        int v2;
        com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a a0;
        this.r();
        long v = SystemClock.elapsedRealtime();
        int v1 = g$e0.c();
        c.c c$c0 = this.c(l$a0, v1, this.i.c.e, "GET");
        if(c$c0 == null) {
            return;
        }
        try {
            a0 = null;
            v2 = 0;
            String s = a.g(c$c0, false, true);
            if(s != null) {
                throw new B.b(s + ", rawKey: " + this.g + ", url: " + l$a0);
            }
            String s1 = this.h;
            int v3 = this.j();
            h.c h$c0 = this.b.c(s1, v3);
            int v4 = a.b(c$c0);
            if(h$c0 != null && h$c0.c != v4) {
                if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
                    Log.e("TAG_PROXY_ProxyTask", "Content-Length not match, old: " + h$c0.c + ", " + v4 + ", key: " + this.h);
                }
                throw new B.c("Content-Length not match, old length: " + h$c0.c + ", new length: " + v4 + ", rawKey: " + this.g + ", currentUrl: " + l$a0 + ", previousInfo: " + h$c0.e);
            }
            if(!g$e0.b()) {
                String s2 = a.f(c$c0, v1);
                this.a();
                byte[] arr_b = s2.getBytes(a.b);
                g$e0.a(arr_b, 0, arr_b.length);
            }
            this.a();
            file0 = this.a.d(this.h);
            if(!this.t || file0 == null || file0.length() < ((long)g$e0.c())) {
                if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
                    Log.w("TAG_PROXY_ProxyTask", "can\'t write to cache file in network task, cache file size: " + file0.length() + ", from: " + g$e0.c());
                }
                a1 = null;
            }
            else {
                a.d(c$c0, this.b, this.h, this.i.c.a);
                try {
                    a1 = new com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a(file0, "rwd");
                    goto label_36;
                }
                catch(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a.a unused_ex) {
                    goto label_38;
                }
                goto label_79;
            }
            goto label_41;
        }
        catch(Throwable throwable0) {
            goto label_79;
        }
        try {
        label_36:
            a1.c(((long)g$e0.c()));
            goto label_39;
        }
        catch(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.a.a unused_ex) {
        label_38:
            a1 = null;
            try {
            label_39:
                if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
                    Log.i("TAG_PROXY_ProxyTask", "can write to cache file in network task, cache file size: " + file0.length() + ", from: " + g$e0.c());
                }
            label_41:
                String s3 = this.h;
                int v5 = this.j();
                h.c h$c1 = this.b.c(s3, v5);
                v6 = h$c1 == null ? 0 : h$c1.c;
                arr_b1 = new byte[0x2000];
                inputStream0 = c$c0.i();
                v7 = 0;
                goto label_52;
            }
            catch(Throwable throwable0) {
            }
            a0 = a1;
            goto label_79;
        }
        catch(Throwable throwable0) {
            a0 = a1;
            goto label_79;
        }
        while(true) {
            try {
            label_52:
                v8 = inputStream0.read(arr_b1);
                if(v8 < 0) {
                    goto label_72;
                }
                this.a();
                if(v8 > 0) {
                    g$e0.d(arr_b1, 0, v8);
                    v7 += v8;
                    if(a1 != null) {
                        goto label_59;
                    }
                    goto label_69;
                }
                goto label_70;
            }
            catch(Throwable throwable0) {
                break;
            }
            try {
            label_59:
                a1.d(arr_b1, 0, v8);
            }
            catch(Throwable throwable1) {
                try {
                    a1.b();
                }
                catch(Throwable throwable0) {
                    break;
                }
                try {
                    if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
                        Log.e("TAG_PROXY_ProxyTask", "append to cache file error in network task!!! " + Log.getStackTraceString(throwable1));
                    }
                    a1 = null;
                }
                catch(Throwable throwable0) {
                    goto label_78;
                }
            }
            try {
            label_69:
                this.e(v6, g$e0.c());
            label_70:
                this.a();
                goto label_52;
            label_72:
                if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.d) {
                    Log.i("TAG_PROXY_ProxyTask", "read from net complete!");
                }
                this.f();
                goto label_86;
            }
            catch(Throwable throwable0) {
            }
            break;
        }
        a0 = a1;
    label_78:
        v2 = v7;
    label_79:
        a.m(c$c0.i());
        if(a0 != null) {
            a0.b();
        }
        this.c.addAndGet(v2);
        long v9 = SystemClock.elapsedRealtime();
        this.d.addAndGet(v9 - v);
        throw throwable0;
    label_86:
        a.m(c$c0.i());
        if(a1 != null) {
            a1.b();
        }
        this.c.addAndGet(v7);
        long v10 = SystemClock.elapsedRealtime();
        this.d.addAndGet(v10 - v);
    }
}

