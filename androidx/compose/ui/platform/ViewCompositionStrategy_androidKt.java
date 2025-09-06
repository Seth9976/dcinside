package androidx.compose.ui.platform;

import A3.a;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.S0;
import kotlin.jvm.internal.L;
import y4.l;

public final class ViewCompositionStrategy_androidKt {
    private static final a b(AbstractComposeView abstractComposeView0, Lifecycle lifecycle0) {
        if(lifecycle0.b().compareTo(State.a) <= 0) {
            throw new IllegalStateException(("Cannot configure " + abstractComposeView0 + " to disposeComposition at Lifecycle ON_DESTROY: " + lifecycle0 + "is already destroyed").toString());
        }
        androidx.compose.ui.platform.ViewCompositionStrategy_androidKt.installForLifecycle.observer.1 viewCompositionStrategy_androidKt$installForLifecycle$observer$10 = new LifecycleEventObserver() {
            @Override  // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(@l LifecycleOwner lifecycleOwner0, @l Event lifecycle$Event0) {
                L.p(lifecycleOwner0, "<anonymous parameter 0>");
                L.p(lifecycle$Event0, "event");
                if(lifecycle$Event0 == Event.ON_DESTROY) {
                    abstractComposeView0.e();
                }
            }
        };
        lifecycle0.a(viewCompositionStrategy_androidKt$installForLifecycle$observer$10);
        return new a(lifecycle0, viewCompositionStrategy_androidKt$installForLifecycle$observer$10) {
            final Lifecycle e;
            final LifecycleEventObserver f;

            {
                this.e = lifecycle0;
                this.f = lifecycleEventObserver0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.d(this.f);
            }
        };
    }
}

