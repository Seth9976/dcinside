package com.google.firebase.messaging.ktx;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.c0;
import kotlin.collections.u;
import kotlin.k;
import y4.l;

@k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @c0(expression = "", imports = {}))
public final class FirebaseMessagingKtxRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    @l
    public List getComponents() {
        return u.H();
    }
}

