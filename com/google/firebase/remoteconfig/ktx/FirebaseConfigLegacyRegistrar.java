package com.google.firebase.remoteconfig.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.h;
import java.util.List;
import kotlin.collections.u;
import y4.l;

@Keep
public final class FirebaseConfigLegacyRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    @l
    public List getComponents() {
        return u.k(h.b("fire-cfg-ktx", "22.0.0"));
    }
}

