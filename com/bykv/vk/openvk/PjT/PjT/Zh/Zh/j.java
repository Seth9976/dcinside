package com.bykv.vk.openvk.PjT.PjT.Zh.Zh;

import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.Au.XX;
import com.bytedance.sdk.component.Au.cz;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class j {
    class a implements d {
        final j a;

        @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.Zh.g$d
        public void a(g g0) {
            if(c.d) {
                Log.d("ProxyServer", "afterExecute, ProxyTask: " + g0);
            }
            int v = g0.j();
            SparseArray sparseArray0 = j.this.g;
            __monitor_enter(sparseArray0);
            try {
                Set set0 = (Set)j.this.g.get(v);
                if(set0 != null) {
                    set0.remove(g0);
                }
                __monitor_exit(sparseArray0);
                return;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(sparseArray0);
            throw throwable0;
        }

        @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.Zh.g$d
        public void b(g g0) {
            SparseArray sparseArray0 = j.this.g;
            __monitor_enter(sparseArray0);
            try {
                Set set0 = (Set)j.this.g.get(g0.j());
                if(set0 != null) {
                    set0.add(g0);
                }
                __monitor_exit(sparseArray0);
                return;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(sparseArray0);
            throw throwable0;
        }
    }

    class b implements Runnable {
        final j a;

        @Override
        public void run() {
            class com.bykv.vk.openvk.PjT.PjT.Zh.Zh.j.b.a extends Au {
                final g a;
                final b b;

                com.bykv.vk.openvk.PjT.PjT.Zh.Zh.j.b.a(String s, int v, g g0) {
                    this.a = g0;
                    super(s, v);
                }

                @Override
                public void run() {
                    this.a.run();
                }
            }

            Socket socket0;
            int v = 0;
            try {
                ServerSocket serverSocket0 = new ServerSocket(0, 50, InetAddress.getByName(j.u(j.this)));
                j.this.a = serverSocket0;
            }
            catch(IOException iOException0) {
                if(c.d) {
                    Log.e("ProxyServer", "create ServerSocket error!  " + Log.getStackTraceString(iOException0));
                }
                Log.getStackTraceString(iOException0);
                j.this.d();
                return;
            }
            int v1 = j.this.a.getLocalPort();
            j.this.b = v1;
            if(j.this.b == -1) {
                j.this.d();
                return;
            }
            com.bykv.vk.openvk.PjT.PjT.Zh.Zh.b.a(j.u(j.this), j.this.b);
            if(!j.this.s()) {
                return;
            }
            if(!j.this.c.compareAndSet(0, 1)) {
                return;
            }
            while(true) {
                try {
                label_20:
                    if(j.this.c.get() != 1) {
                        break;
                    }
                    try {
                        socket0 = j.this.a.accept();
                    }
                    catch(IOException iOException1) {
                        Log.getStackTraceString(iOException1);
                        ++v;
                        if(v > 3) {
                            break;
                        }
                        goto label_20;
                    }
                    h.d h$d0 = j.this.d;
                    if(h$d0 != null) {
                        com.bykv.vk.openvk.PjT.PjT.Zh.Zh.j.b.a j$b$a0 = new com.bykv.vk.openvk.PjT.PjT.Zh.Zh.j.b.a(this, "ProxyTask", 10, new com.bykv.vk.openvk.PjT.PjT.Zh.Zh.g.c().b(h$d0).c(socket0).a(j.this.h).d());
                        cz.ReZ().execute(j$b$a0);
                        goto label_20;
                    }
                    com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a.q(socket0);
                    goto label_20;
                }
                catch(Throwable throwable0) {
                }
                Log.e("ProxyServer", "proxy server crashed!  " + Log.getStackTraceString(throwable0));
                break;
            }
            j.this.d();
        }
    }

    static final class com.bykv.vk.openvk.PjT.PjT.Zh.Zh.j.c implements Callable {
        private final String a;
        private final int b;

        com.bykv.vk.openvk.PjT.PjT.Zh.Zh.j.c(String s, int v) {
            this.a = s;
            this.b = v;
        }

        public Boolean a() {
            Throwable throwable1;
            Socket socket0;
            try {
                socket0 = new Socket(this.a, this.b);
            }
            catch(Throwable throwable0) {
                socket0 = null;
                throwable1 = throwable0;
                goto label_13;
            }
            try {
                socket0.setSoTimeout(2000);
                OutputStream outputStream0 = socket0.getOutputStream();
                outputStream0.write("Ping\n".getBytes(com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a.b));
                outputStream0.flush();
                if("OK".equals(new BufferedReader(new InputStreamReader(socket0.getInputStream())).readLine())) {
                    goto label_19;
                }
                goto label_21;
            }
            catch(Throwable throwable1) {
            }
            try {
            label_13:
                throwable1.getMessage();
                Log.getStackTraceString(throwable1);
                goto label_21;
            }
            catch(Throwable throwable2) {
                com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a.q(socket0);
                throw throwable2;
            }
        label_19:
            com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a.q(socket0);
            return true;
        label_21:
            com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a.q(socket0);
            return false;
        }

        @Override
        public Object call() throws Exception {
            return this.a();
        }
    }

    private volatile ServerSocket a;
    private volatile int b;
    private final AtomicInteger c;
    private volatile h.d d;
    private volatile d.c e;
    private volatile d.d f;
    private final SparseArray g;
    private final d h;
    private volatile e i;
    private volatile e j;
    private final Runnable k;
    private final AtomicBoolean l;
    private static volatile j m;

    private j() {
        this.c = new AtomicInteger(0);
        SparseArray sparseArray0 = new SparseArray(2);
        this.g = sparseArray0;
        this.h = new a(this);
        this.k = new b(this);
        this.l = new AtomicBoolean();
        sparseArray0.put(0, new HashSet());
        sparseArray0.put(1, new HashSet());
    }

    private void b() {
        Socket socket0 = null;
        try {
            socket0 = this.a.accept();
            socket0.setSoTimeout(2000);
            if("Ping".equals(new BufferedReader(new InputStreamReader(socket0.getInputStream())).readLine())) {
                OutputStream outputStream0 = socket0.getOutputStream();
                outputStream0.write("OK\n".getBytes(com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a.b));
                outputStream0.flush();
            }
        }
        catch(IOException iOException0) {
            Log.getStackTraceString(iOException0);
        }
        finally {
            com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a.q(socket0);
        }
    }

    private void d() {
        if(this.c.compareAndSet(1, 2) || this.c.compareAndSet(0, 2)) {
            com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a.p(this.a);
            this.x();
        }
    }

    public static j g() {
        if(j.m == null) {
            Class class0 = j.class;
            __monitor_enter(class0);
            try {
                if(j.m == null) {
                    j.m = new j();
                }
                __monitor_exit(class0);
                return j.m;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return j.m;
    }

    public String h(boolean z, boolean z1, String s, String[] arr_s) {
        if(arr_s != null && arr_s.length != 0) {
            if(TextUtils.isEmpty(s)) {
                return arr_s[0];
            }
            if(this.d == null) {
                return arr_s[0];
            }
            d.d d$d0 = z ? this.f : this.e;
            if(d$d0 == null) {
                return arr_s[0];
            }
            if(this.c.get() != 1) {
                return arr_s[0];
            }
            List list0 = com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a.k(arr_s);
            if(list0 == null) {
                return arr_s[0];
            }
            String s1 = f.b(s, (z1 ? s : com.bykv.vk.openvk.PjT.PjT.PjT.XX.c.a(s)), list0);
            if(s1 == null) {
                return arr_s[0];
            }
            return z ? ("https://127.0.0.1:" + this.b + "?f=1&" + s1).replaceFirst("s", "") : ("https://127.0.0.1:" + this.b + "?" + s1).replaceFirst("s", "");
        }
        return null;
    }

    void j(d.c d$c0) {
        this.e = d$c0;
    }

    void k(h.d h$d0) {
        this.d = h$d0;
    }

    static void l(String s, String s1) {
    }

    boolean m(int v, String s) {
        if(s == null) {
            return false;
        }
        synchronized(this.g) {
            Set set0 = (Set)this.g.get(v);
            if(set0 != null) {
                for(Object object0: set0) {
                    if(((g)object0) != null && s.equals(((g)object0).h)) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return false;
        }
    }

    e n() {
        return this.j;
    }

    // 去混淆评级： 低(20)
    private String q() [...] // 潜在的解密器

    private boolean s() {
        XX xX0 = new XX(new com.bykv.vk.openvk.PjT.PjT.Zh.Zh.j.c("127.0.0.1", this.b), 5, 1);
        cz.ReZ().submit(xX0);
        this.b();
        try {
            if(!((Boolean)xX0.get()).booleanValue()) {
                Log.e("ProxyServer", "Ping error");
                this.d();
                return false;
            }
            return true;
        }
        catch(Throwable throwable0) {
        }
        Log.getStackTraceString(throwable0);
        this.d();
        return false;
    }

    e t() {
        return this.i;
    }

    // 去混淆评级： 低(20)
    static String u(j j0) {
        return "127.0.0.1";
    }

    public void w() {
        if(this.l.compareAndSet(false, true)) {
            Thread thread0 = new Thread(this.k);
            thread0.setName("csj_proxy_server");
            thread0.start();
        }
    }

    private void x() {
        ArrayList arrayList0 = new ArrayList();
        synchronized(this.g) {
            int v = this.g.size();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = this.g.keyAt(v1);
                Set set0 = (Set)this.g.get(v2);
                if(set0 != null) {
                    arrayList0.addAll(set0);
                    set0.clear();
                }
            }
        }
        for(Object object0: arrayList0) {
            ((g)object0).d();
        }
    }
}

