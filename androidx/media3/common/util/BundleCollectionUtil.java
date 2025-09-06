package androidx.media3.common.util;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.common.base.t;
import com.google.common.collect.O2.a;
import com.google.common.collect.O2;
import com.google.common.collect.Q2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

@UnstableApi
public final class BundleCollectionUtil {
    public static HashMap a(Bundle bundle0) {
        HashMap hashMap0 = new HashMap();
        if(bundle0 == Bundle.EMPTY) {
            return hashMap0;
        }
        for(Object object0: bundle0.keySet()) {
            String s = (String)object0;
            String s1 = bundle0.getString(s);
            if(s1 != null) {
                hashMap0.put(s, s1);
            }
        }
        return hashMap0;
    }

    public static Q2 b(Bundle bundle0) {
        return bundle0 == Bundle.EMPTY ? Q2.u() : Q2.g(BundleCollectionUtil.a(bundle0));
    }

    public static void c(@Nullable Bundle bundle0) {
        if(bundle0 != null) {
            bundle0.setClassLoader(BundleCollectionUtil.class.getClassLoader());
        }
    }

    public static O2 d(t t0, List list0) {
        a o2$a0 = O2.n();
        for(int v = 0; v < list0.size(); ++v) {
            o2$a0.j(t0.apply(((Bundle)Assertions.g(((Bundle)list0.get(v))))));
        }
        return o2$a0.n();
    }

    public static SparseArray e(t t0, SparseArray sparseArray0) {
        SparseArray sparseArray1 = new SparseArray(sparseArray0.size());
        for(int v = 0; v < sparseArray0.size(); ++v) {
            sparseArray1.put(sparseArray0.keyAt(v), t0.apply(((Bundle)sparseArray0.valueAt(v))));
        }
        return sparseArray1;
    }

    public static Bundle f(Bundle bundle0, String s, Bundle bundle1) {
        Bundle bundle2 = bundle0.getBundle(s);
        return bundle2 == null ? bundle1 : bundle2;
    }

    public static ArrayList g(Bundle bundle0, String s, ArrayList arrayList0) {
        ArrayList arrayList1 = bundle0.getIntegerArrayList(s);
        return arrayList1 == null ? arrayList0 : arrayList1;
    }

    public static Bundle h(Map map0) {
        Bundle bundle0 = new Bundle();
        for(Object object0: map0.entrySet()) {
            bundle0.putString(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        return bundle0;
    }

    public static ArrayList i(Collection collection0, t t0) {
        ArrayList arrayList0 = new ArrayList(collection0.size());
        for(Object object0: collection0) {
            arrayList0.add(((Bundle)t0.apply(object0)));
        }
        return arrayList0;
    }

    public static O2 j(List list0, t t0) {
        a o2$a0 = O2.n();
        for(int v = 0; v < list0.size(); ++v) {
            o2$a0.j(((Bundle)t0.apply(list0.get(v))));
        }
        return o2$a0.n();
    }

    public static SparseArray k(SparseArray sparseArray0, t t0) {
        SparseArray sparseArray1 = new SparseArray(sparseArray0.size());
        for(int v = 0; v < sparseArray0.size(); ++v) {
            sparseArray1.put(sparseArray0.keyAt(v), ((Bundle)t0.apply(sparseArray0.valueAt(v))));
        }
        return sparseArray1;
    }
}

