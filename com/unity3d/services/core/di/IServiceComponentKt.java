package com.unity3d.services.core.di;

import A3.a;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.reflect.d;
import y4.l;

public final class IServiceComponentKt {
    public static final Object get(IServiceComponent iServiceComponent0, String s) {
        L.p(iServiceComponent0, "<this>");
        L.p(s, "named");
        IServicesRegistry iServicesRegistry0 = iServiceComponent0.getServiceProvider().getRegistry();
        L.y(4, "T");
        return iServicesRegistry0.getService(s, m0.d(Object.class));
    }

    public static Object get$default(IServiceComponent iServiceComponent0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = "";
        }
        L.p(iServiceComponent0, "<this>");
        L.p(s, "named");
        IServicesRegistry iServicesRegistry0 = iServiceComponent0.getServiceProvider().getRegistry();
        L.y(4, "T");
        return iServicesRegistry0.getService(s, m0.d(Object.class));
    }

    public static final D inject(IServiceComponent iServiceComponent0, String s, H h0) {
        L.p(iServiceComponent0, "<this>");
        L.p(s, "named");
        L.p(h0, "mode");
        L.w();
        return E.c(h0, new a(iServiceComponent0, s) {
            final String $named;
            final IServiceComponent $this_inject;

            {
                this.$this_inject = iServiceComponent0;
                this.$named = s;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                IServicesRegistry iServicesRegistry0 = this.$this_inject.getServiceProvider().getRegistry();
                L.y(4, "T");
                d d0 = m0.d(Object.class);
                return iServicesRegistry0.getService(this.$named, d0);
            }
        });
    }

    public static D inject$default(IServiceComponent iServiceComponent0, String s, H h0, int v, Object object0) {
        if((v & 1) != 0) {
            s = "";
        }
        if((v & 2) != 0) {
            h0 = H.c;
        }
        L.p(iServiceComponent0, "<this>");
        L.p(s, "named");
        L.p(h0, "mode");
        L.w();
        return E.c(h0, new com.unity3d.services.core.di.IServiceComponentKt.inject.1(iServiceComponent0, s));
    }
}

