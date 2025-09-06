package androidx.lifecycle;

import androidx.annotation.MainThread;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.I0.a;
import kotlinx.coroutines.I0;
import y4.l;

@MainThread
@s0({"SMAP\nLifecycleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n1#1,70:1\n57#1,3:71\n57#1,3:74\n*S KotlinDebug\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n49#1:71,3\n36#1:74,3\n*E\n"})
public final class LifecycleController {
    @l
    private final Lifecycle a;
    @l
    private final State b;
    @l
    private final DispatchQueue c;
    @l
    private final LifecycleEventObserver d;

    public LifecycleController(@l Lifecycle lifecycle0, @l State lifecycle$State0, @l DispatchQueue dispatchQueue0, @l I0 i00) {
        L.p(lifecycle0, "lifecycle");
        L.p(lifecycle$State0, "minState");
        L.p(dispatchQueue0, "dispatchQueue");
        L.p(i00, "parentJob");
        super();
        this.a = lifecycle0;
        this.b = lifecycle$State0;
        this.c = dispatchQueue0;
        f f0 = (LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) -> {
            L.p(this, "this$0");
            L.p(i00, "$parentJob");
            L.p(lifecycleOwner0, "source");
            L.p(lifecycle$Event0, "<anonymous parameter 1>");
            if(lifecycleOwner0.getLifecycle().b() == State.a) {
                a.b(i00, null, 1, null);
                this.b();
                return;
            }
            if(lifecycleOwner0.getLifecycle().b().compareTo(this.b) < 0) {
                this.c.h();
                return;
            }
            this.c.i();
        };
        this.d = f0;
        if(lifecycle0.b() == State.a) {
            a.b(i00, null, 1, null);
            this.b();
            return;
        }
        lifecycle0.a(f0);
    }

    @MainThread
    public final void b() {
        this.a.d(this.d);
        this.c.g();
    }

    private final void c(I0 i00) {
        a.b(i00, null, 1, null);
        this.b();
    }

    // 检测为 Lambda 实现
    private static final void d(LifecycleController lifecycleController0, I0 i00, LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) [...]
}

