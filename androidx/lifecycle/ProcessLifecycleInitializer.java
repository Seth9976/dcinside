package androidx.lifecycle;

import android.content.Context;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;

public final class ProcessLifecycleInitializer implements Initializer {
    @l
    public LifecycleOwner a(@l Context context0) {
        L.p(context0, "context");
        AppInitializer appInitializer0 = AppInitializer.e(context0);
        L.o(appInitializer0, "getInstance(context)");
        if(!appInitializer0.g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name=\'androidx.lifecycle.ProcessLifecycleInitializer\'\n                   android:value=\'androidx.startup\' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        LifecycleDispatcher.a(context0);
        ProcessLifecycleOwner.i.c(context0);
        return ProcessLifecycleOwner.i.a();
    }

    @Override  // androidx.startup.Initializer
    public Object create(Context context0) {
        return this.a(context0);
    }

    @Override  // androidx.startup.Initializer
    @l
    public List dependencies() {
        return u.H();
    }
}

