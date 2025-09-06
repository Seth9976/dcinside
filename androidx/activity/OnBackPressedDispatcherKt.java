package androidx.activity;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class OnBackPressedDispatcherKt {
    @l
    public static final OnBackPressedCallback a(@l OnBackPressedDispatcher onBackPressedDispatcher0, @m LifecycleOwner lifecycleOwner0, boolean z, @l Function1 function10) {
        L.p(onBackPressedDispatcher0, "<this>");
        L.p(function10, "onBackPressed");
        OnBackPressedCallback onBackPressedCallback0 = new OnBackPressedCallback(z) {
            @Override  // androidx.activity.OnBackPressedCallback
            public void g() {
                function10.invoke(this);
            }
        };
        if(lifecycleOwner0 != null) {
            onBackPressedDispatcher0.i(lifecycleOwner0, onBackPressedCallback0);
            return onBackPressedCallback0;
        }
        onBackPressedDispatcher0.h(onBackPressedCallback0);
        return onBackPressedCallback0;
    }

    public static OnBackPressedCallback b(OnBackPressedDispatcher onBackPressedDispatcher0, LifecycleOwner lifecycleOwner0, boolean z, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            lifecycleOwner0 = null;
        }
        if((v & 2) != 0) {
            z = true;
        }
        return OnBackPressedDispatcherKt.a(onBackPressedDispatcher0, lifecycleOwner0, z, function10);
    }
}

