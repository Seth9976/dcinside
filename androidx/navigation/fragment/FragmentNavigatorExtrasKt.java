package androidx.navigation.fragment;

import android.view.View;
import kotlin.V;
import kotlin.jvm.internal.L;
import y4.l;

public final class FragmentNavigatorExtrasKt {
    @l
    public static final Extras a(@l V[] arr_v) {
        L.p(arr_v, "sharedElements");
        Builder fragmentNavigator$Extras$Builder0 = new Builder();
        for(int v = 0; v < arr_v.length; ++v) {
            V v1 = arr_v[v];
            fragmentNavigator$Extras$Builder0.a(((View)v1.a()), ((String)v1.b()));
        }
        return fragmentNavigator$Extras$Builder0.c();
    }
}

