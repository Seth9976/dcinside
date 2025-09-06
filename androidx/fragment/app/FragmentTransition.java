package androidx.fragment.app;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;

class FragmentTransition {
    static final FragmentTransitionImpl a;
    static final FragmentTransitionImpl b;

    static {
        FragmentTransition.a = new FragmentTransitionCompat21();
        FragmentTransition.b = FragmentTransition.c();
    }

    static void a(Fragment fragment0, Fragment fragment1, boolean z, ArrayMap arrayMap0, boolean z1) {
        if((z ? fragment1.getEnterTransitionCallback() : fragment0.getEnterTransitionCallback()) != null) {
            ArrayList arrayList0 = new ArrayList();
            ArrayList arrayList1 = new ArrayList();
            int v1 = arrayMap0 == null ? 0 : arrayMap0.size();
            for(int v = 0; v < v1; ++v) {
                arrayList1.add(((String)arrayMap0.g(v)));
                arrayList0.add(((View)arrayMap0.l(v)));
            }
            if(z1) {
            }
        }
    }

    static String b(ArrayMap arrayMap0, String s) {
        int v = arrayMap0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(s.equals(arrayMap0.l(v1))) {
                return (String)arrayMap0.g(v1);
            }
        }
        return null;
    }

    private static FragmentTransitionImpl c() {
        try {
            return new FragmentTransitionSupport();
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    static void d(@NonNull ArrayMap arrayMap0, @NonNull ArrayMap arrayMap1) {
        for(int v = arrayMap0.size() - 1; v >= 0; --v) {
            if(!arrayMap1.containsKey(((String)arrayMap0.l(v)))) {
                arrayMap0.i(v);
            }
        }
    }

    static void e(ArrayList arrayList0, int v) {
        if(arrayList0 == null) {
            return;
        }
        for(int v1 = arrayList0.size() - 1; v1 >= 0; --v1) {
            ((View)arrayList0.get(v1)).setVisibility(v);
        }
    }

    static boolean f() [...] // 潜在的解密器
}

