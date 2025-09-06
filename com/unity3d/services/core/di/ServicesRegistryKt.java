package com.unity3d.services.core.di;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class ServicesRegistryKt {
    @l
    public static final ServicesRegistry registry(@l Function1 function10) {
        L.p(function10, "registry");
        ServicesRegistry servicesRegistry0 = new ServicesRegistry();
        function10.invoke(servicesRegistry0);
        return servicesRegistry0;
    }
}

