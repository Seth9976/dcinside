package h1;

import android.graphics.Bitmap;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.n;

public final class c {
    @l
    public static final c a;

    static {
        c.a = new c();
    }

    @n
    public static final boolean a(@m a a0, @m com.facebook.common.references.a a1) {
        if(a0 != null && a1 != null) {
            Object object0 = a1.n();
            L.o(object0, "get(...)");
            if(a0.a()) {
                ((Bitmap)object0).setHasAlpha(true);
            }
            a0.b(((Bitmap)object0));
            return true;
        }
        return false;
    }
}

