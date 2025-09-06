package com.apm.insight.b;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;

public final class h {
    public interface a {
        @Nullable
        String a();

        String b();

        String c();
    }

    private static volatile boolean a;
    private static Printer b;
    private static final CopyOnWriteArrayList c;
    private static volatile boolean d;

    static {
        h.c = new CopyOnWriteArrayList();
        h.d = false;
    }

    public static void a() {
        if(h.a) {
            return;
        }
        h.a = true;
        h.b = new Printer() {
            @Override  // android.util.Printer
            public final void println(String s) {
                if(TextUtils.isEmpty(s)) {
                    return;
                }
                switch(s.charAt(0)) {
                    case 60: {
                        h.a(false, s);
                        return;
                    }
                    case 62: {
                        h.a(true, s);
                    }
                }
            }
        };
        i.a();
        i.a(h.b);
    }

    public static void a(e e0) {
        synchronized(h.c) {
            h.c.add(e0);
        }
    }

    public static void a(boolean z, String s) {
        e.a = System.nanoTime() / 1000000L;
        e.b = SystemClock.currentThreadTimeMillis();
        CopyOnWriteArrayList copyOnWriteArrayList0 = h.c;
        for(int v = 0; v < copyOnWriteArrayList0.size(); ++v) {
            e e0 = (e)copyOnWriteArrayList0.get(v);
            if(e0 == null || !e0.a()) {
                if(!z && e0.c) {
                    e0.b("");
                }
            }
            else if(!z) {
                if(e0.c) {
                    e0.b(s);
                }
            }
            else if(!e0.c) {
                e0.a(s);
            }
        }
    }
}

