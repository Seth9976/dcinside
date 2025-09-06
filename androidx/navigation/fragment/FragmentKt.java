package androidx.navigation.fragment;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import kotlin.jvm.internal.L;
import y4.l;

public final class FragmentKt {
    @l
    public static final NavController a(@l Fragment fragment0) {
        L.p(fragment0, "<this>");
        return NavHostFragment.f.d(fragment0);
    }
}

