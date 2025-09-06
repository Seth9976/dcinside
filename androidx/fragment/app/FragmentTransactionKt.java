package androidx.fragment.app;

import android.os.Bundle;
import androidx.annotation.IdRes;
import kotlin.jvm.internal.L;

public final class FragmentTransactionKt {
    public static final FragmentTransaction a(FragmentTransaction fragmentTransaction0, @IdRes int v, String s, Bundle bundle0) {
        L.p(fragmentTransaction0, "<this>");
        L.y(4, "F");
        FragmentTransaction fragmentTransaction1 = fragmentTransaction0.i(v, Fragment.class, bundle0, s);
        L.o(fragmentTransaction1, "add(containerViewId, F::class.java, args, tag)");
        return fragmentTransaction1;
    }

    public static final FragmentTransaction b(FragmentTransaction fragmentTransaction0, String s, Bundle bundle0) {
        L.p(fragmentTransaction0, "<this>");
        L.p(s, "tag");
        L.y(4, "F");
        FragmentTransaction fragmentTransaction1 = fragmentTransaction0.l(Fragment.class, bundle0, s);
        L.o(fragmentTransaction1, "add(F::class.java, args, tag)");
        return fragmentTransaction1;
    }

    public static FragmentTransaction c(FragmentTransaction fragmentTransaction0, int v, String s, Bundle bundle0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            s = null;
        }
        if((v1 & 4) != 0) {
            bundle0 = null;
        }
        L.p(fragmentTransaction0, "<this>");
        L.y(4, "F");
        FragmentTransaction fragmentTransaction1 = fragmentTransaction0.i(v, Fragment.class, bundle0, s);
        L.o(fragmentTransaction1, "add(containerViewId, F::class.java, args, tag)");
        return fragmentTransaction1;
    }

    public static FragmentTransaction d(FragmentTransaction fragmentTransaction0, String s, Bundle bundle0, int v, Object object0) {
        if((v & 2) != 0) {
            bundle0 = null;
        }
        L.p(fragmentTransaction0, "<this>");
        L.p(s, "tag");
        L.y(4, "F");
        FragmentTransaction fragmentTransaction1 = fragmentTransaction0.l(Fragment.class, bundle0, s);
        L.o(fragmentTransaction1, "add(F::class.java, args, tag)");
        return fragmentTransaction1;
    }

    public static final FragmentTransaction e(FragmentTransaction fragmentTransaction0, @IdRes int v, String s, Bundle bundle0) {
        L.p(fragmentTransaction0, "<this>");
        L.y(4, "F");
        FragmentTransaction fragmentTransaction1 = fragmentTransaction0.F(v, Fragment.class, bundle0, s);
        L.o(fragmentTransaction1, "replace(containerViewId, F::class.java, args, tag)");
        return fragmentTransaction1;
    }

    public static FragmentTransaction f(FragmentTransaction fragmentTransaction0, int v, String s, Bundle bundle0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            s = null;
        }
        if((v1 & 4) != 0) {
            bundle0 = null;
        }
        L.p(fragmentTransaction0, "<this>");
        L.y(4, "F");
        FragmentTransaction fragmentTransaction1 = fragmentTransaction0.F(v, Fragment.class, bundle0, s);
        L.o(fragmentTransaction1, "replace(containerViewId, F::class.java, args, tag)");
        return fragmentTransaction1;
    }
}

