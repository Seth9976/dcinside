package com.bykv.vk.openvk.PjT.PjT.Zh.Zh;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.bytedance.sdk.component.Au.Au;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class i {
    class a implements b {
        final i a;

        @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.Zh.h$b
        public void a(h h0) {
            int v = h0.j();
            synchronized(i.this.b) {
                Map map0 = (Map)i.this.b.get(v);
                if(map0 != null) {
                    map0.remove(h0.h);
                }
            }
            if(c.d) {
                Log.d("TAG_PROXY_Preloader", "afterExecute, key: " + h0.h);
            }
        }
    }

    static final class f {
        final boolean a;
        final boolean b;
        final int c;
        final String d;
        final Map e;
        final String[] f;

        f(boolean z, boolean z1, int v, String s, Map map0, String[] arr_s) {
            this.a = z;
            this.b = z1;
            this.c = v;
            this.d = s;
            this.e = map0;
            this.f = arr_s;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                if(f.class != class0 || this.a != ((f)object0).a) {
                    return false;
                }
                if(this.b != ((f)object0).b) {
                    return false;
                }
                return this.c == ((f)object0).c ? this.d.equals(((f)object0).d) : false;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return ((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d.hashCode();
        }
    }

    static final class g extends LinkedBlockingDeque {
        private ThreadPoolExecutor a;

        private g() {
        }

        g(a i$a0) {
        }

        public void a(ThreadPoolExecutor threadPoolExecutor0) {
            __monitor_enter(this);
            try {
                if(this.a != null) {
                    throw new IllegalStateException("You can only call setExecutor() once!");
                }
                if(threadPoolExecutor0 == null) {
                    throw new NullPointerException("executor argument can\'t be null!");
                }
                this.a = threadPoolExecutor0;
                __monitor_exit(this);
                return;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(this);
            throw throwable0;
        }

        @Override
        public boolean offer(Object object0) {
            synchronized(this) {
                int v1 = this.a.getPoolSize();
                if(this.a.getActiveCount() >= v1 && v1 < this.a.getMaximumPoolSize()) {
                    if(c.d) {
                        Log.i("TAG_PROXY_TT", "create new preloader thread");
                    }
                    return false;
                }
            }
            return this.offerFirst(object0);
        }
    }

    private volatile int a;
    private final SparseArray b;
    private final g c;
    private final ExecutorService d;
    private volatile h.d e;
    private volatile d.c f;
    private volatile d.d g;
    private final HashSet h;
    private final b i;
    private volatile e j;
    private volatile e k;
    private volatile String l;
    private volatile boolean m;
    private static volatile i n;

    private i() {
        this.a = 0x28000;
        SparseArray sparseArray0 = new SparseArray(2);
        this.b = sparseArray0;
        this.h = new HashSet();
        this.i = new a(this);
        g i$g0 = new g(null);
        this.c = i$g0;
        ExecutorService executorService0 = i.c(i$g0);
        this.d = executorService0;
        i$g0.a(((ThreadPoolExecutor)executorService0));
        sparseArray0.put(0, new HashMap());
        sparseArray0.put(1, new HashMap());
    }

    e b() {
        return this.j;
    }

    // 去混淆评级： 低(20)
    private static ExecutorService c(g i$g0) {
        static final class d implements ThreadFactory {
            @Override
            public Thread newThread(Runnable runnable0) {
                class com.bykv.vk.openvk.PjT.PjT.Zh.Zh.i.d.a extends Thread {
                    final d a;

                    com.bykv.vk.openvk.PjT.PjT.Zh.Zh.i.d.a(Runnable runnable0) {
                        super(runnable0);
                    }

                    @Override
                    public void run() {
                        try {
                            Process.setThreadPriority(10);
                        }
                        catch(Throwable unused_ex) {
                        }
                        super.run();
                    }
                }

                Thread thread0 = new com.bykv.vk.openvk.PjT.PjT.Zh.Zh.i.d.a(this, runnable0);
                thread0.setName("csj_video_preload_" + thread0.getId());
                thread0.setDaemon(true);
                if(c.d) {
                    Log.i("TAG_PROXY_Preloader", "new preload thead: " + thread0.getName());
                }
                return thread0;
            }
        }


        static final class com.bykv.vk.openvk.PjT.PjT.Zh.Zh.i.e implements RejectedExecutionHandler {
            final g a;

            com.bykv.vk.openvk.PjT.PjT.Zh.Zh.i.e(g i$g0) {
                this.a = i$g0;
                super();
            }

            @Override
            public void rejectedExecution(Runnable runnable0, ThreadPoolExecutor threadPoolExecutor0) {
                try {
                    this.a.offerFirst(runnable0);
                    if(c.d) {
                        Log.i("TAG_PROXY_TT", "task rejected in preloader, put first!!!");
                    }
                }
                catch(Throwable unused_ex) {
                }
            }
        }

        return new ThreadPoolExecutor(0, 4, 60L, TimeUnit.SECONDS, i$g0, new d(), new com.bykv.vk.openvk.PjT.PjT.Zh.Zh.i.e(i$g0));
    }

    public void d(int v) {
        if(v > 0) {
            this.a = v;
        }
        if(c.d) {
            Log.i("TAG_PROXY_Preloader", "MaxPreloadSize: " + v);
        }
    }

    void e(d.c d$c0) {
        this.f = d$c0;
    }

    void f(h.d h$d0) {
        this.e = h$d0;
    }

    public void g(String s) {
        this.k(false, false, s);
    }

    void h(boolean z, String s) {
        this.l = s;
        this.m = z;
        if(c.d) {
            Log.i("TAG_PROXY_Preloader", "setCurrentPlayKey, " + s);
        }
        HashSet hashSet0 = null;
        if(s == null) {
            HashSet hashSet1 = this.h;
            synchronized(hashSet1) {
                if(!this.h.isEmpty()) {
                    hashSet0 = new HashSet(this.h);
                    this.h.clear();
                }
                __monitor_exit(hashSet1);
            }
            if(hashSet0 != null) {
                for(Object object0: hashSet0) {
                    f i$f0 = (f)object0;
                    this.i(i$f0.a, i$f0.b, i$f0.c, i$f0.d, i$f0.e, i$f0.f);
                    if(c.d) {
                        Log.i("TAG_PROXY_Preloader", "setCurrentPlayKey, resume preload: " + i$f0.d);
                    }
                }
            }
            return;
        }
        int v = c.j;
        switch(v) {
            case 1: {
                SparseArray sparseArray0 = this.b;
                synchronized(sparseArray0) {
                    Map map0 = (Map)this.b.get(h.e.a(z));
                    if(map0 != null) {
                        hashSet0 = (h)map0.remove(s);
                    }
                    __monitor_exit(sparseArray0);
                }
                if(hashSet0 != null) {
                    ((com.bykv.vk.openvk.PjT.PjT.Zh.Zh.d)hashSet0).d();
                    return;
                }
                return;
            }
            case 2: 
            case 3: {
                SparseArray sparseArray1 = this.b;
                synchronized(sparseArray1) {
                    int v1 = this.b.size();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        int v3 = this.b.keyAt(v2);
                        Map map1 = (Map)this.b.get(v3);
                        if(map1 != null) {
                            Collection collection0 = map1.values();
                            if(collection0 != null && !collection0.isEmpty()) {
                                if(hashSet0 == null) {
                                    hashSet0 = new HashSet();
                                }
                                hashSet0.addAll(collection0);
                            }
                            map1.clear();
                        }
                    }
                    __monitor_exit(sparseArray1);
                }
                if(hashSet0 != null && !hashSet0.isEmpty()) {
                    for(Object object1: hashSet0) {
                        h h0 = (h)object1;
                        h0.d();
                        if(c.d) {
                            Log.i("TAG_PROXY_Preloader", "setCurrentPlayKey, cancel preload: " + h0.g);
                        }
                    }
                    if(v == 3) {
                        HashSet hashSet2 = this.h;
                        __monitor_enter(hashSet2);
                        try {
                            for(Object object2: hashSet0) {
                                f i$f1 = (f)((h)object2).s;
                                if(i$f1 != null) {
                                    this.h.add(i$f1);
                                }
                            }
                            __monitor_exit(hashSet2);
                            return;
                        }
                        catch(Throwable throwable3) {
                        }
                        __monitor_exit(hashSet2);
                        throw throwable3;
                    }
                }
            }
        }
    }

    public void i(boolean z, boolean z1, int v, String s, Map map0, String[] arr_s) {
        h h0;
        ArrayList arrayList0;
        SparseArray sparseArray1;
        Map map1;
        boolean z2 = c.d;
        if(z2) {
            Log.d("TAG_PROXY_Preloader", "preload start ！！！！");
        }
        d.d d$d0 = z ? this.g : this.f;
        h.d h$d0 = this.e;
        if(d$d0 != null && h$d0 != null) {
            if(!TextUtils.isEmpty(s) && arr_s != null && arr_s.length > 0) {
                int v1 = v > 0 ? v : this.a;
                String s1 = z1 ? s : com.bykv.vk.openvk.PjT.PjT.PjT.XX.c.a(s);
                File file0 = d$d0.d(s1);
                if(file0 != null && file0.length() >= ((long)v1)) {
                    if(z2) {
                        Log.i("TAG_PROXY_Preloader", "no need preload, file size: " + file0.length() + ", need preload size: " + v1);
                    }
                    return;
                }
                if(j.g().m(h.e.a(z), s1)) {
                    if(z2) {
                        Log.w("TAG_PROXY_Preloader", "has running proxy task, skip preload for key: " + s);
                    }
                    return;
                }
                SparseArray sparseArray0 = this.b;
                __monitor_enter(sparseArray0);
                try {
                    map1 = (Map)this.b.get(((int)z));
                    if(map1.containsKey(s1)) {
                        __monitor_exit(sparseArray0);
                        return;
                    }
                }
                catch(Throwable throwable0) {
                    sparseArray1 = sparseArray0;
                    __monitor_exit(sparseArray1);
                    throw throwable0;
                }
                try {
                    sparseArray1 = sparseArray0;
                    f i$f0 = new f(z, z1, v1, s, map0, arr_s);
                    String s2 = this.l;
                    if(s2 != null) {
                        int v2 = c.j;
                        if(v2 == 3) {
                            synchronized(this.h) {
                                this.h.add(i$f0);
                            }
                            if(z2) {
                                Log.w("TAG_PROXY_Preloader", "cancel preload: " + s + ", add to pending queue");
                            }
                            __monitor_exit(sparseArray1);
                            return;
                        }
                        switch(v2) {
                            case 1: {
                                if(this.m == z && s2.equals(s1)) {
                                    if(z2) {
                                        Log.w("TAG_PROXY_Preloader", "cancel preload: " + s + ", it is playing");
                                    }
                                    __monitor_exit(sparseArray1);
                                    return;
                                }
                                break;
                            }
                            case 2: {
                                if(z2) {
                                    Log.w("TAG_PROXY_Preloader", "cancel preload: " + s);
                                }
                                __monitor_exit(sparseArray1);
                                return;
                            }
                        }
                    }
                    List list0 = com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a.i(com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a.j(map0));
                    if(list0 == null) {
                        arrayList0 = null;
                    }
                    else {
                        arrayList0 = new ArrayList(list0.size());
                        int v4 = list0.size();
                        for(int v5 = 0; v5 < v4; ++v5) {
                            com.bykv.vk.openvk.PjT.PjT.Zh.Zh.f.c f$c0 = (com.bykv.vk.openvk.PjT.PjT.Zh.Zh.f.c)list0.get(v5);
                            if(f$c0 != null) {
                                arrayList0.add(new com.bykv.vk.openvk.PjT.PjT.Zh.Zh.f.c(f$c0.a, f$c0.b));
                            }
                        }
                    }
                    h0 = new com.bykv.vk.openvk.PjT.PjT.Zh.Zh.h.a().b(d$d0).e(h$d0).h(s).k(s1).f(new l(com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a.k(arr_s))).i(arrayList0).a(v1).d(this.i).g(i$f0).j();
                    map1.put(s1, h0);
                    __monitor_exit(sparseArray1);
                }
                catch(Throwable throwable0) {
                    __monitor_exit(sparseArray1);
                    throw throwable0;
                }
                this.d.execute(h0);
                return;
            }
            return;
        }
        if(z2) {
            Log.e("TAG_PROXY_Preloader", "cache or videoProxyDB null in Preloader!!!");
        }
    }

    public void j(boolean z, boolean z1, int v, String s, String[] arr_s) {
        this.i(z, z1, v, s, null, arr_s);
    }

    public void k(boolean z, boolean z1, String s) {
        class com.bykv.vk.openvk.PjT.PjT.Zh.Zh.i.b extends Au {
            final boolean a;
            final boolean b;
            final String c;
            final i d;

            com.bykv.vk.openvk.PjT.PjT.Zh.Zh.i.b(String s, boolean z, boolean z1, String s1) {
                this.a = z;
                this.b = z1;
                this.c = s1;
                super(s);
            }

            @Override
            public void run() {
                h h0;
                synchronized(i.this.b) {
                    Map map0 = (Map)i.this.b.get(h.e.a(this.a));
                    h0 = map0 == null ? null : ((h)map0.remove((this.b ? this.c : com.bykv.vk.openvk.PjT.PjT.PjT.XX.c.a(this.c))));
                }
                if(h0 != null) {
                    h0.d();
                }
            }
        }

        if(TextUtils.isEmpty(s)) {
            return;
        }
        com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a.l(new com.bykv.vk.openvk.PjT.PjT.Zh.Zh.i.b(this, "cancel b b S", z, z1, s));
    }

    public static i l() {
        if(i.n == null) {
            Class class0 = i.class;
            __monitor_enter(class0);
            try {
                if(i.n == null) {
                    i.n = new i();
                }
                __monitor_exit(class0);
                return i.n;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return i.n;
    }

    e m() {
        return this.k;
    }

    public void o() {
        class com.bykv.vk.openvk.PjT.PjT.Zh.Zh.i.c extends Au {
            final i a;

            com.bykv.vk.openvk.PjT.PjT.Zh.Zh.i.c(String s) {
                super(s);
            }

            @Override
            public void run() {
                ArrayList arrayList0 = new ArrayList();
                synchronized(i.this.b) {
                    int v = i.this.b.size();
                    for(int v1 = 0; v1 < v; ++v1) {
                        int v2 = i.this.b.keyAt(v1);
                        Map map0 = (Map)i.this.b.get(v2);
                        if(map0 != null) {
                            arrayList0.addAll(map0.values());
                            map0.clear();
                        }
                    }
                    i.this.c.clear();
                }
                for(Object object0: arrayList0) {
                    h h0 = (h)object0;
                    h0.d();
                    if(c.d) {
                        Log.w("TAG_PROXY_Preloader", "PreloadTask: " + h0 + ", canceled!!!");
                    }
                }
            }
        }

        com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a.l(new com.bykv.vk.openvk.PjT.PjT.Zh.Zh.i.c(this, "cancelAll"));
    }
}

