package com.facebook.common.internal;

import android.util.Log;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public final class s {
    public static List a(Throwable throwable0) {
        com.facebook.common.internal.n.i(throwable0);
        ArrayList arrayList0 = new ArrayList(4);
        while(throwable0 != null) {
            arrayList0.add(throwable0);
            throwable0 = throwable0.getCause();
        }
        return DesugarCollections.unmodifiableList(arrayList0);
    }

    public static Throwable b(Throwable throwable0) {
        Throwable throwable1;
        while((throwable1 = throwable0.getCause()) != null) {
            throwable0 = throwable1;
        }
        return throwable0;
    }

    public static String c(Throwable throwable0) {
        return Log.getStackTraceString(throwable0);
    }

    public static RuntimeException d(Throwable throwable0) {
        s.f(((Throwable)com.facebook.common.internal.n.i(throwable0)));
        throw new RuntimeException(throwable0);
    }

    public static void e(@h Throwable throwable0, Class class0) throws Throwable {
        if(throwable0 != null && class0.isInstance(throwable0)) {
            throw (Throwable)class0.cast(throwable0);
        }
    }

    public static void f(@h Throwable throwable0) {
        s.e(throwable0, Error.class);
        s.e(throwable0, RuntimeException.class);
    }

    public static void g(@h Throwable throwable0, Class class0) throws Throwable {
        s.e(throwable0, class0);
        s.f(throwable0);
    }

    public static void h(@h Throwable throwable0, Class class0, Class class1) throws Throwable, Throwable {
        com.facebook.common.internal.n.i(class1);
        s.e(throwable0, class0);
        s.g(throwable0, class1);
    }
}

