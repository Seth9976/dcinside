package com.google.firebase.analytics.ktx;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.h;
import java.util.List;
import kotlin.collections.u;
import y4.l;

public final class FirebaseAnalyticsLegacyRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    @l
    public final List getComponents() {
        return u.k(h.b("fire-analytics-ktx", "22.1.2"));
    }
}

