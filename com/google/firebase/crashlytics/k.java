package com.google.firebase.crashlytics;

import com.google.firebase.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class k {
    @l
    public static final j a(@l d d0) {
        L.p(d0, "<this>");
        j j0 = j.e();
        L.o(j0, "getInstance()");
        return j0;
    }

    public static final void b(@l j j0, @l Function1 function10) {
        L.p(j0, "<this>");
        L.p(function10, "init");
        function10.invoke(new com.google.firebase.crashlytics.l(j0));
    }
}

