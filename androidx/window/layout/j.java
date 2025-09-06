package androidx.window.layout;

import android.content.Context;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import y4.l;
import z3.i;
import z3.n;

public final class j {
    static {
    }

    @l
    @i(name = "getOrCreate")
    @n
    public static WindowInfoTracker a(@l Context context0) {
        return WindowInfoTracker.a.a(context0);
    }

    @RestrictTo({Scope.b})
    @n
    public static void b(@l WindowInfoTrackerDecorator windowInfoTrackerDecorator0) {
        WindowInfoTracker.a.b(windowInfoTrackerDecorator0);
    }

    @RestrictTo({Scope.b})
    @n
    public static void c() {
        WindowInfoTracker.a.c();
    }
}

