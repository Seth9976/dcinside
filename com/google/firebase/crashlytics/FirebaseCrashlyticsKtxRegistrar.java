package com.google.firebase.crashlytics;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.w;
import y4.l;

@Keep
public final class FirebaseCrashlyticsKtxRegistrar implements ComponentRegistrar {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    public static final a Companion;

    static {
        FirebaseCrashlyticsKtxRegistrar.Companion = new a(null);
    }

    @Override  // com.google.firebase.components.ComponentRegistrar
    @l
    public List getComponents() {
        return u.H();
    }
}

