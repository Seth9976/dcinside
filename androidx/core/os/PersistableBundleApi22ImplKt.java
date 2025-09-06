package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import y4.l;
import y4.m;
import z3.n;

@RequiresApi(22)
final class PersistableBundleApi22ImplKt {
    @l
    public static final PersistableBundleApi22ImplKt a;

    static {
        PersistableBundleApi22ImplKt.a = new PersistableBundleApi22ImplKt();
    }

    @n
    public static final void a(@l PersistableBundle persistableBundle0, @m String s, boolean z) {
        persistableBundle0.putBoolean(s, z);
    }

    @n
    public static final void b(@l PersistableBundle persistableBundle0, @m String s, @l boolean[] arr_z) {
        persistableBundle0.putBooleanArray(s, arr_z);
    }
}

