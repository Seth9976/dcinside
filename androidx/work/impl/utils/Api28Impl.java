package androidx.work.impl.utils;

import android.app.Application;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(28)
final class Api28Impl {
    @l
    public static final Api28Impl a;

    static {
        Api28Impl.a = new Api28Impl();
    }

    @l
    public final String a() {
        String s = Application.getProcessName();
        L.o(s, "getProcessName()");
        return s;
    }
}

