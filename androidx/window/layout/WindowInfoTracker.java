package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.i;
import z3.n;

public interface WindowInfoTracker {
    public static final class Companion {
        static final Companion a;
        private static final boolean b;
        @m
        private static final String c;
        @l
        private static WindowInfoTrackerDecorator d;

        static {
            Companion.a = new Companion();
            Companion.c = "WindowInfoTracker";
            Companion.d = EmptyDecorator.a;
        }

        @l
        @i(name = "getOrCreate")
        @n
        public final WindowInfoTracker a(@l Context context0) {
            L.p(context0, "context");
            WindowBackend windowBackend0 = this.d(context0);
            WindowInfoTrackerImpl windowInfoTrackerImpl0 = new WindowInfoTrackerImpl(WindowMetricsCalculatorCompat.b, windowBackend0);
            return Companion.d.a(windowInfoTrackerImpl0);
        }

        @RestrictTo({Scope.b})
        @n
        public final void b(@l WindowInfoTrackerDecorator windowInfoTrackerDecorator0) {
            L.p(windowInfoTrackerDecorator0, "overridingDecorator");
            Companion.d = windowInfoTrackerDecorator0;
        }

        @RestrictTo({Scope.b})
        @n
        public final void c() {
            Companion.d = EmptyDecorator.a;
        }

        @l
        public final WindowBackend d(@l Context context0) {
            L.p(context0, "context");
            WindowBackend windowBackend0 = null;
            try {
                WindowLayoutComponent windowLayoutComponent0 = SafeWindowLayoutComponentProvider.a.m();
                if(windowLayoutComponent0 != null) {
                    windowBackend0 = new ExtensionWindowLayoutInfoBackend(windowLayoutComponent0);
                }
            }
            catch(Throwable unused_ex) {
                if(Companion.b) {
                    Log.d("WindowInfoTracker", "Failed to load WindowExtensions");
                }
            }
            return windowBackend0 == null ? SidecarWindowBackend.c.a(context0) : windowBackend0;
        }
    }

    @l
    public static final Companion a;

    static {
        WindowInfoTracker.a = Companion.a;
    }

    @l
    kotlinx.coroutines.flow.i a(@l Activity arg1);
}

