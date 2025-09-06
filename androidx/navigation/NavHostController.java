package androidx.navigation;

import android.content.Context;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import kotlin.jvm.internal.L;
import y4.l;

public class NavHostController extends NavController {
    public NavHostController(@l Context context0) {
        L.p(context0, "context");
        super(context0);
    }

    @Override  // androidx.navigation.NavController
    public final void P0(@l LifecycleOwner lifecycleOwner0) {
        L.p(lifecycleOwner0, "owner");
        super.P0(lifecycleOwner0);
    }

    @Override  // androidx.navigation.NavController
    public final void R0(@l OnBackPressedDispatcher onBackPressedDispatcher0) {
        L.p(onBackPressedDispatcher0, "dispatcher");
        super.R0(onBackPressedDispatcher0);
    }

    @Override  // androidx.navigation.NavController
    public final void S0(@l ViewModelStore viewModelStore0) {
        L.p(viewModelStore0, "viewModelStore");
        super.S0(viewModelStore0);
    }

    @Override  // androidx.navigation.NavController
    public final void x(boolean z) {
        super.x(z);
    }
}

