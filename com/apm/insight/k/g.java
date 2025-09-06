package com.apm.insight.k;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.a;
import com.apm.insight.d;
import com.apm.insight.entity.b;
import com.apm.insight.entity.c;
import com.apm.insight.runtime.a.f;
import com.apm.insight.runtime.m;
import com.apm.insight.runtime.p;
import j..util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;

public final class g {
    private static final ConcurrentHashMap a;
    private static final HashMap b;
    private static volatile g c;
    private final p d;
    private volatile boolean e;
    private Runnable f;

    static {
        g.a = new ConcurrentHashMap();
        g.b = new HashMap();
    }

    private g() {
        this.e = false;
        this.f = new Runnable() {
            private g a;

            @Override
            public final void run() {
                if(!g.b.isEmpty() && false) {
                    g.f();
                }
                g.this.c();
                g.this.d.a(g.this.f, 30000L);
            }
        };
        this.d = m.a();
    }

    public static g a() {
        if(g.c == null) {
            Class class0 = g.class;
            synchronized(class0) {
                if(g.c == null) {
                    g.c = new g();
                }
            }
        }
        return g.c;
    }

    public static void a(@NonNull c c0) {
        g.a(d.a(), c0);
    }

    // 检测为 Lambda 实现
    public static void a(@Nullable Object object0, @NonNull c c0) [...]

    private static void b(Object object0, c c0) {
        ConcurrentLinkedQueue concurrentLinkedQueue0;
        ConcurrentHashMap concurrentHashMap0;
        synchronized(object0) {
            concurrentHashMap0 = g.a;
            concurrentLinkedQueue0 = (ConcurrentLinkedQueue)concurrentHashMap0.get(object0);
            if(concurrentLinkedQueue0 == null) {
                concurrentLinkedQueue0 = new ConcurrentLinkedQueue();
                concurrentHashMap0.put(object0, concurrentLinkedQueue0);
            }
        }
        concurrentLinkedQueue0.add(c0);
        int v1 = concurrentHashMap0.size();
        a.b(("[enqueue] size=" + v1));
        if(v1 >= 30) {
            g.g();
        }
    }

    public final void b() {
        if(g.a.isEmpty()) {
            this.d.a(this.f, 30000L);
            return;
        }
        this.d.a(this.f);
    }

    private static void c(Object object0, c c0) {
        ConcurrentLinkedQueue concurrentLinkedQueue0;
        try {
            String s = c0.c().getString("log_type");
            HashMap hashMap0 = g.b;
            synchronized(hashMap0) {
                HashMap hashMap1 = (HashMap)hashMap0.get(s);
                if(hashMap1 == null) {
                    hashMap1 = new HashMap();
                    hashMap0.put(object0, hashMap1);
                }
                concurrentLinkedQueue0 = (ConcurrentLinkedQueue)hashMap1.get(s);
                if(concurrentLinkedQueue0 == null) {
                    concurrentLinkedQueue0 = new ConcurrentLinkedQueue();
                    hashMap1.put(s, concurrentLinkedQueue0);
                }
            }
            concurrentLinkedQueue0.add(c0);
            if(concurrentLinkedQueue0.size() > 100) {
                concurrentLinkedQueue0.poll();
            }
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
        }
    }

    public final void c() {
        p p0 = this.d;
        __monitor_enter(p0);
        if(this.e) {
            __monitor_exit(p0);
            return;
        }
        this.e = true;
        __monitor_exit(p0);
        LinkedList linkedList0 = new LinkedList();
        for(Object object0: g.a.entrySet()) {
            ConcurrentLinkedQueue concurrentLinkedQueue0 = (ConcurrentLinkedQueue)((Map.Entry)object0).getValue();
            Object object1 = ((Map.Entry)object0).getKey();
            while(!concurrentLinkedQueue0.isEmpty()) {
                try {
                    for(int v = 0; v < 30 && !concurrentLinkedQueue0.isEmpty(); ++v) {
                        linkedList0.add(concurrentLinkedQueue0.poll());
                    }
                    if(!linkedList0.isEmpty()) {
                        com.apm.insight.entity.a a0 = f.a().a(linkedList0, b.a(object1));
                        if(a0 != null) {
                            a.a("upload events");
                            com.apm.insight.k.d.a().b(a0.c());
                        }
                        linkedList0.clear();
                        continue;
                    }
                    break;
                }
                catch(Throwable throwable0) {
                }
                a.b(throwable0);
            }
        }
        this.e = false;
    }

    private static void f() {
        synchronized(g.b) {
            new HashMap(g.b);
            g.b.clear();
        }
        a.a("EventUploadQueue", "ApmConfig not inited, clear cache.");
    }

    // 去混淆评级： 中等(60)
    private static void g() {

        final class com.apm.insight.k.g.3 implements Runnable {
            @Override
            public final void run() {
                g.a().c();
            }
        }

    }
}

