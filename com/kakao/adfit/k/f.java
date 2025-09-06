package com.kakao.adfit.k;

import com.kakao.adfit.common.matrix.exception.ExceptionMechanismException;
import com.kakao.adfit.i.h;
import com.kakao.adfit.i.i;
import com.kakao.adfit.i.o;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.text.v;

public final class f {
    private final g a;

    public f(g g0) {
        L.p(g0, "stackTraceFactory");
        super();
        this.a = g0;
    }

    private final h a(Throwable throwable0, i i0, Thread thread0) {
        Package package0 = throwable0.getClass().getPackage();
        String s = throwable0.getClass().getName();
        h h0 = new h(null, null, null, null, null, null, 0x3F, null);
        String s1 = throwable0.getMessage();
        if(package0 != null) {
            L.o(s, "fullClassName");
            s = v.l2(s, package0.getName() + '.', "", false, 4, null);
        }
        String s2 = package0 == null ? null : package0.getName();
        StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
        o o0 = new o(this.a.a(arr_stackTraceElement));
        if(thread0 != null) {
            h0.a(thread0.getId());
        }
        h0.a(o0);
        h0.b(s);
        h0.a(i0);
        h0.a(s2);
        h0.c(s1);
        return h0;
    }

    private final List a(Deque deque0) {
        return new ArrayList(deque0);
    }

    public final Deque a(Throwable throwable0) {
        Thread thread0;
        i i0;
        L.p(throwable0, "throwable");
        Deque deque0 = new ArrayDeque();
        HashSet hashSet0 = new HashSet();
        while(throwable0 != null && hashSet0.add(throwable0)) {
            if(throwable0 instanceof ExceptionMechanismException) {
                ExceptionMechanismException exceptionMechanismException0 = (ExceptionMechanismException)throwable0;
                i0 = exceptionMechanismException0.a();
                Throwable throwable1 = exceptionMechanismException0.c();
                if(throwable1 != null) {
                    throwable0 = throwable1;
                }
                thread0 = exceptionMechanismException0.b();
            }
            else {
                thread0 = Thread.currentThread();
                i0 = null;
            }
            deque0.addFirst(this.a(throwable0, i0, thread0));
            throwable0 = throwable0.getCause();
        }
        return deque0;
    }

    public final List b(Throwable throwable0) {
        L.p(throwable0, "throwable");
        return this.a(this.a(throwable0));
    }
}

