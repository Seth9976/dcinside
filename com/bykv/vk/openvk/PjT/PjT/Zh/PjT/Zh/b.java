package com.bykv.vk.openvk.PjT.PjT.Zh.PjT.Zh;

import android.content.Context;
import android.os.Build.VERSION;
import j..util.concurrent.ConcurrentHashMap;
import t.a.a;

public class b {
    public static final ConcurrentHashMap a;

    static {
        b.a = new ConcurrentHashMap();
    }

    public static void a(Context context0, v.b b0, a a$a0) {
        synchronized(b.class) {
            if(b0 == null) {
                return;
            }
            if(Build.VERSION.SDK_INT >= 23) {
                ConcurrentHashMap concurrentHashMap0 = b.a;
                c c0 = (c)concurrentHashMap0.get(b0.fDm());
                if(c0 == null) {
                    c0 = new c(context0, b0);
                    concurrentHashMap0.put(b0.fDm(), c0);
                    b0.ReZ();
                    b0.fDm();
                }
                c0.i(a$a0);
            }
            b0.ReZ();
            b0.fDm();
        }
    }

    public static void b(v.b b0) {
        synchronized(b.class) {
            if(Build.VERSION.SDK_INT >= 23) {
                String s = b0.fDm();
                c c0 = (c)b.a.remove(s);
                if(c0 != null) {
                    c0.l(true);
                }
                b0.ReZ();
                b0.fDm();
            }
        }
    }
}

