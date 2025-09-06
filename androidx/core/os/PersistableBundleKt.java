package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.V;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nPersistableBundle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistableBundle.kt\nandroidx/core/os/PersistableBundleKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,152:1\n13579#2,2:153\n*S KotlinDebug\n*F\n+ 1 PersistableBundle.kt\nandroidx/core/os/PersistableBundleKt\n*L\n34#1:153,2\n*E\n"})
public final class PersistableBundleKt {
    @RequiresApi(21)
    @l
    public static final PersistableBundle a() {
        return PersistableBundleApi21ImplKt.a(0);
    }

    @RequiresApi(21)
    @l
    public static final PersistableBundle b(@l V[] arr_v) {
        PersistableBundle persistableBundle0 = PersistableBundleApi21ImplKt.a(arr_v.length);
        for(int v = 0; v < arr_v.length; ++v) {
            V v1 = arr_v[v];
            PersistableBundleApi21ImplKt.b(persistableBundle0, ((String)v1.a()), v1.b());
        }
        return persistableBundle0;
    }

    @RequiresApi(21)
    @l
    public static final PersistableBundle c(@l Map map0) {
        PersistableBundle persistableBundle0 = PersistableBundleApi21ImplKt.a(map0.size());
        for(Object object0: map0.entrySet()) {
            PersistableBundleApi21ImplKt.b(persistableBundle0, ((String)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
        return persistableBundle0;
    }
}

