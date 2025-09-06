package androidx.customview.poolingcontainer;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewKt;
import kotlin.jvm.internal.L;
import y4.l;
import z3.i;

@i(name = "PoolingContainer")
public final class PoolingContainer {
    private static final int a;
    private static final int b;

    static {
        PoolingContainer.a = id.pooling_container_listener_holder_tag;
        PoolingContainer.b = id.is_pooling_container_tag;
    }

    @SuppressLint({"ExecutorRegistration"})
    public static final void a(@l View view0, @l PoolingContainerListener poolingContainerListener0) {
        L.p(view0, "<this>");
        L.p(poolingContainerListener0, "listener");
        PoolingContainer.d(view0).a(poolingContainerListener0);
    }

    public static final void b(@l View view0) {
        L.p(view0, "<this>");
        for(Object object0: ViewKt.i(view0)) {
            PoolingContainer.d(((View)object0)).b();
        }
    }

    public static final void c(@l ViewGroup viewGroup0) {
        L.p(viewGroup0, "<this>");
        for(Object object0: ViewGroupKt.e(viewGroup0)) {
            PoolingContainer.d(((View)object0)).b();
        }
    }

    private static final PoolingContainerListenerHolder d(View view0) {
        int v = PoolingContainer.a;
        PoolingContainerListenerHolder poolingContainerListenerHolder0 = (PoolingContainerListenerHolder)view0.getTag(v);
        if(poolingContainerListenerHolder0 == null) {
            poolingContainerListenerHolder0 = new PoolingContainerListenerHolder();
            view0.setTag(v, poolingContainerListenerHolder0);
        }
        return poolingContainerListenerHolder0;
    }

    public static final boolean e(@l View view0) {
        L.p(view0, "<this>");
        Object object0 = view0.getTag(PoolingContainer.b);
        Boolean boolean0 = object0 instanceof Boolean ? ((Boolean)object0) : null;
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    public static final boolean f(@l View view0) {
        L.p(view0, "<this>");
        for(Object object0: ViewKt.j(view0)) {
            if(((ViewParent)object0) instanceof View && PoolingContainer.e(((View)(((ViewParent)object0))))) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @SuppressLint({"ExecutorRegistration"})
    public static final void g(@l View view0, @l PoolingContainerListener poolingContainerListener0) {
        L.p(view0, "<this>");
        L.p(poolingContainerListener0, "listener");
        PoolingContainer.d(view0).c(poolingContainerListener0);
    }

    public static final void h(@l View view0, boolean z) {
        L.p(view0, "<this>");
        view0.setTag(PoolingContainer.b, Boolean.valueOf(z));
    }
}

