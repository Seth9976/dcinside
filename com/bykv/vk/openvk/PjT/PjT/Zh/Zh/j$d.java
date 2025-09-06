package com.bykv.vk.openvk.PjT.PjT.Zh.Zh;

import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class j.d {
    static class a {
    }

    class b extends Thread {
        class com.bykv.vk.openvk.PjT.PjT.Zh.Zh.j.d.b.a {
            public int a;
            public String b;
            public String[] c;
            public int d;
            public String e;
            public v.b f;
            final b g;

        }

        private Queue a;
        private boolean b;
        private final Queue c;
        private Queue d;
        final j.d e;

        public b() {
            this.c = new ArrayBlockingQueue(10);
            this.a = new LinkedBlockingQueue();
            this.b = true;
            this.d = new LinkedBlockingQueue();
        }

        private com.bykv.vk.openvk.PjT.PjT.Zh.Zh.j.d.b.a a(int v, v.b b0) {
            this.c.size();
            com.bykv.vk.openvk.PjT.PjT.Zh.Zh.j.d.b.a j$d$b$a0 = (com.bykv.vk.openvk.PjT.PjT.Zh.Zh.j.d.b.a)this.c.poll();
            if(j$d$b$a0 == null) {
                j$d$b$a0 = new com.bykv.vk.openvk.PjT.PjT.Zh.Zh.j.d.b.a(this);
            }
            j$d$b$a0.a = v;
            j$d$b$a0.f = b0;
            return j$d$b$a0;
        }

        private void b() {
            com.bykv.vk.openvk.PjT.PjT.Zh.Zh.j.d.b.a j$d$b$a0;
            while((j$d$b$a0 = (com.bykv.vk.openvk.PjT.PjT.Zh.Zh.j.d.b.a)this.d.poll()) != null) {
                j$d$b$a0.b = j$d$b$a0.f.xs();
                j$d$b$a0.c = new String[]{j$d$b$a0.f.xs()};
                int v = j$d$b$a0.f.PjT();
                if(v <= 0) {
                    v = j$d$b$a0.f.ReZ();
                }
                j$d$b$a0.d = v;
                j$d$b$a0.e = j$d$b$a0.f.fDm();
                if(!TextUtils.isEmpty(j$d$b$a0.f.fDm())) {
                    j$d$b$a0.b = j$d$b$a0.f.fDm();
                }
                j$d$b$a0.f = null;
                this.e(j$d$b$a0);
            }
        }

        private void c(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.j.d.b.a j$d$b$a0) {
            j$d$b$a0.c = null;
            j$d$b$a0.b = null;
            j$d$b$a0.a = -1;
            j$d$b$a0.f = null;
            this.c.offer(j$d$b$a0);
        }

        public void d(v.b b0) {
            this.f(this.a(0, b0));
        }

        private void e(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.j.d.b.a j$d$b$a0) {
            if(j$d$b$a0 == null) {
                return;
            }
            this.a.offer(j$d$b$a0);
            this.notify();
        }

        private void f(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.j.d.b.a j$d$b$a0) {
            synchronized(this) {
                this.d.add(j$d$b$a0);
                this.notify();
            }
        }

        @Override
        public void run() {
            while(this.b) {
                __monitor_enter(this);
                try {
                    if(!this.d.isEmpty()) {
                        this.b();
                    }
                    while(!this.a.isEmpty()) {
                        com.bykv.vk.openvk.PjT.PjT.Zh.Zh.j.d.b.a j$d$b$a0 = (com.bykv.vk.openvk.PjT.PjT.Zh.Zh.j.d.b.a)this.a.poll();
                        if(j$d$b$a0 != null) {
                            switch(j$d$b$a0.a) {
                                case 0: {
                                    if(j$d$b$a0.c != null && j$d$b$a0.c.length > 0) {
                                        ArrayList arrayList0 = new ArrayList();
                                        String[] arr_s = j$d$b$a0.c;
                                        for(int v = 0; v < arr_s.length; ++v) {
                                            String s = arr_s[v];
                                            if(com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a.r(s)) {
                                                arrayList0.add(s);
                                            }
                                        }
                                        Object[] arr_object = arrayList0.toArray(new String[arrayList0.size()]);
                                        boolean z = TextUtils.isEmpty(j$d$b$a0.e);
                                        i.l().j(false, !z, j$d$b$a0.d, j$d$b$a0.b, ((String[])arr_object));
                                    }
                                    break;
                                }
                                case 1: {
                                    i.l().g(j$d$b$a0.b);
                                    break;
                                }
                                case 2: {
                                    i.l().o();
                                    break;
                                }
                                case 3: {
                                    i.l().o();
                                    if(c.e() != null) {
                                        throw null;
                                    }
                                    if(c.f() != null) {
                                        c.f().g();
                                    }
                                    break;
                                }
                                case 4: {
                                    i.l().o();
                                    this.b = false;
                                }
                            }
                            this.c(j$d$b$a0);
                        }
                    }
                    try {
                        this.wait();
                    }
                    catch(InterruptedException unused_ex) {
                    }
                    __monitor_exit(this);
                    continue;
                }
                catch(Throwable throwable0) {
                }
                __monitor_exit(this);
                throw throwable0;
            }
        }
    }

    static class com.bykv.vk.openvk.PjT.PjT.Zh.Zh.j.d.c {
        private static final j.d a;

        static {
            com.bykv.vk.openvk.PjT.PjT.Zh.Zh.j.d.c.a = new j.d(null);
        }
    }

    private HashMap a;
    private b b;
    public static final boolean c;

    static {
        j.d.c = false;
    }

    private j.d() {
        this.a = new HashMap();
        this.e();
    }

    j.d(a j$d$a0) {
    }

    public static j.d a() {
        return com.bykv.vk.openvk.PjT.PjT.Zh.Zh.j.d.c.a;
    }

    public boolean b(v.b b0) {
        if(this.e()) {
            this.b.d(b0);
            return true;
        }
        return false;
    }

    private static d.c c() {
        d.c d$c0;
        File file0 = new File(s.b.b().getCacheDir(), "proxy_cache");
        if(!file0.exists()) {
            file0.mkdirs();
        }
        try {
            d$c0 = null;
            d$c0 = new d.c(file0);
            d$c0.h(0x6400000L);
        }
        catch(IOException unused_ex) {
        }
        return d$c0;
    }

    public String d(v.b b0) {
        String s;
        if(b0 == null) {
            return null;
        }
        if(!TextUtils.isEmpty(b0.fDm())) {
            s = b0.fDm();
            return j.g().h(false, true, s, new String[]{b0.xs()});
        }
        s = b0.xs();
        return j.g().h(false, false, s, new String[]{b0.xs()});
    }

    public boolean e() {
        if(this.b != null) {
            return true;
        }
        d.c d$c0 = j.d.c();
        if(d$c0 == null) {
            return false;
        }
        c.d(true);
        c.g(true);
        c.b(1);
        j.g().w();
        try {
            b j$d$b0 = new b(this);
            this.b = j$d$b0;
            j$d$b0.setName("csj_video_cache_preloader");
            this.b.start();
            c.c(d$c0, s.b.b());
            i.l();
        }
        catch(Exception unused_ex) {
            return false;
        }
        i.l().d(0x9FFFFF);
        return true;
    }
}

