package com.google.firebase.crashlytics.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.h;
import java.util.List;
import kotlin.collections.u;
import y4.l;

@Keep
public final class FirebaseCrashlyticsLegacyRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    @l
    public List getComponents() {
        return u.k(h.b("fire-cls-ktx", "19.2.0"));
    }
}

