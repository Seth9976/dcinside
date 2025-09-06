package androidx.core.os;

import android.os.Build.VERSION;
import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.n;

@RequiresApi(21)
final class PersistableBundleApi21ImplKt {
    @l
    public static final PersistableBundleApi21ImplKt a;

    static {
        PersistableBundleApi21ImplKt.a = new PersistableBundleApi21ImplKt();
    }

    @l
    @n
    public static final PersistableBundle a(int v) {
        return new PersistableBundle(v);
    }

    @n
    public static final void b(@l PersistableBundle persistableBundle0, @m String s, @m Object object0) {
        if(object0 == null) {
            persistableBundle0.putString(s, null);
            return;
        }
        if(object0 instanceof Boolean) {
            if(Build.VERSION.SDK_INT < 22) {
                throw new IllegalArgumentException("Unsupported value type boolean for key \"" + s + "\" (requires API level 22+)");
            }
            PersistableBundleApi22ImplKt.a(persistableBundle0, s, ((Boolean)object0).booleanValue());
            return;
        }
        if(object0 instanceof Double) {
            persistableBundle0.putDouble(s, ((Number)object0).doubleValue());
            return;
        }
        if(object0 instanceof Integer) {
            persistableBundle0.putInt(s, ((Number)object0).intValue());
            return;
        }
        if(object0 instanceof Long) {
            persistableBundle0.putLong(s, ((Number)object0).longValue());
            return;
        }
        if(object0 instanceof String) {
            persistableBundle0.putString(s, ((String)object0));
            return;
        }
        if(object0 instanceof PersistableBundle) {
            persistableBundle0.putPersistableBundle(s, ((PersistableBundle)object0));
            return;
        }
        if(object0 instanceof boolean[]) {
            if(Build.VERSION.SDK_INT < 22) {
                throw new IllegalArgumentException("Unsupported value type boolean[] for key \"" + s + "\" (requires API level 22+)");
            }
            PersistableBundleApi22ImplKt.b(persistableBundle0, s, ((boolean[])object0));
            return;
        }
        if(object0 instanceof double[]) {
            persistableBundle0.putDoubleArray(s, ((double[])object0));
            return;
        }
        if(object0 instanceof int[]) {
            persistableBundle0.putIntArray(s, ((int[])object0));
            return;
        }
        if(object0 instanceof long[]) {
            persistableBundle0.putLongArray(s, ((long[])object0));
            return;
        }
        if(!(object0 instanceof Object[])) {
            throw new IllegalArgumentException("Unsupported value type " + object0.getClass().getCanonicalName() + " for key \"" + s + '\"');
        }
        Class class0 = object0.getClass().getComponentType();
        L.m(class0);
        if(!String.class.isAssignableFrom(class0)) {
            throw new IllegalArgumentException("Unsupported value array type " + class0.getCanonicalName() + " for key \"" + s + '\"');
        }
        L.n(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        persistableBundle0.putStringArray(s, ((String[])object0));
    }
}

