package com.unity3d.services.core.configuration;

import android.app.Application;
import android.content.Context;
import androidx.startup.Initializer;
import com.google.android.gms.net.CronetProviderInstaller;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;

public final class AdsSdkInitializer implements Initializer {
    @Override  // androidx.startup.Initializer
    public Object create(Context context0) {
        this.create(context0);
        return S0.a;
    }

    public void create(@l Context context0) {
        L.p(context0, "context");
        ClientProperties.setApplicationContext(context0.getApplicationContext());
        if(context0 instanceof Application) {
            ClientProperties.setApplication(((Application)context0));
        }
        else if(context0.getApplicationContext() instanceof Application) {
            Context context1 = context0.getApplicationContext();
            L.n(context1, "null cannot be cast to non-null type android.app.Application");
            ClientProperties.setApplication(((Application)context1));
        }
        SdkProperties.setAppInitializationTimeSinceEpoch(System.currentTimeMillis());
        try {
            CronetProviderInstaller.installProvider(context0);
        }
        catch(Throwable unused_ex) {
        }
    }

    @Override  // androidx.startup.Initializer
    @l
    public List dependencies() {
        return u.H();
    }
}

