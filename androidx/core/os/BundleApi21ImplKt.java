package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.RequiresApi;
import y4.l;
import y4.m;
import z3.n;

@RequiresApi(21)
final class BundleApi21ImplKt {
    @l
    public static final BundleApi21ImplKt a;

    static {
        BundleApi21ImplKt.a = new BundleApi21ImplKt();
    }

    @n
    public static final void a(@l Bundle bundle0, @l String s, @m Size size0) {
        bundle0.putSize(s, size0);
    }

    @n
    public static final void b(@l Bundle bundle0, @l String s, @m SizeF sizeF0) {
        bundle0.putSizeF(s, sizeF0);
    }
}

