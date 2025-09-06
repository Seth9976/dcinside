package androidx.activity.contextaware;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class ContextAwareHelper {
    @l
    private final Set a;
    @m
    private volatile Context b;

    public ContextAwareHelper() {
        this.a = new CopyOnWriteArraySet();
    }

    public final void a(@l OnContextAvailableListener onContextAvailableListener0) {
        L.p(onContextAvailableListener0, "listener");
        Context context0 = this.b;
        if(context0 != null) {
            onContextAvailableListener0.a(context0);
        }
        this.a.add(onContextAvailableListener0);
    }

    public final void b() {
        this.b = null;
    }

    public final void c(@l Context context0) {
        L.p(context0, "context");
        this.b = context0;
        for(Object object0: this.a) {
            ((OnContextAvailableListener)object0).a(context0);
        }
    }

    @m
    public final Context d() {
        return this.b;
    }

    public final void e(@l OnContextAvailableListener onContextAvailableListener0) {
        L.p(onContextAvailableListener0, "listener");
        this.a.remove(onContextAvailableListener0);
    }
}

