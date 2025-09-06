package com.kakao.adfit.k;

import com.kakao.adfit.i.o;
import com.kakao.adfit.i.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;

public final class h {
    private final g a;
    private final boolean b;

    public h(g g0, boolean z) {
        L.p(g0, "stackTraceFactory");
        super();
        this.a = g0;
        this.b = z;
    }

    public h(g g0, boolean z, int v, w w0) {
        if((v & 2) != 0) {
            z = false;
        }
        this(g0, z);
    }

    private final p a(boolean z, StackTraceElement[] arr_stackTraceElement, Thread thread0) {
        p p0 = new p(null, null, null, null, null, null, null, null, 0xFF, null);
        p0.a(thread0.getName());
        p0.a(thread0.getPriority());
        p0.a(thread0.getId());
        p0.c(Boolean.valueOf(thread0.isDaemon()));
        p0.b(thread0.getState().name());
        p0.a(Boolean.valueOf(z));
        if(this.b) {
            List list0 = this.a.a(arr_stackTraceElement);
            if(list0 != null && !list0.isEmpty() == 1) {
                p0.a(new o(list0));
            }
        }
        return p0;
    }

    public final List a(List list0) {
        Map map0 = Thread.getAllStackTraces();
        L.o(map0, "getAllStackTraces()");
        return this.a(map0, list0);
    }

    public final List a(Map map0, List list0) {
        L.p(map0, "threads");
        Thread thread0 = Thread.currentThread();
        if(map0.isEmpty()) {
            return null;
        }
        List list1 = new ArrayList();
        if(!map0.containsKey(thread0)) {
            L.o(thread0, "thread");
            ((ArrayList)list1).add(this.a(true, thread0.getStackTrace(), thread0));
        }
        for(Object object0: map0.entrySet()) {
            Thread thread1 = (Thread)((Map.Entry)object0).getKey();
            StackTraceElement[] arr_stackTraceElement = (StackTraceElement[])((Map.Entry)object0).getValue();
            ((ArrayList)list1).add(this.a(thread1 == thread0 || list0 != null && list0.contains(thread1.getId()), arr_stackTraceElement, thread1));
        }
        return list1;
    }
}

