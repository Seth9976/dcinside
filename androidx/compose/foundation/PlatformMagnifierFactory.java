package androidx.compose.foundation;

import android.os.Build.VERSION;
import android.view.View;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import y4.l;

@Stable
public interface PlatformMagnifierFactory {
    public static final class Companion {
        static final Companion a;

        static {
            Companion.a = new Companion();
        }

        @Stable
        @l
        public final PlatformMagnifierFactory a() {
            return Build.VERSION.SDK_INT == 28 ? PlatformMagnifierFactoryApi28Impl.b : PlatformMagnifierFactoryApi29Impl.b;
        }
    }

    @l
    public static final Companion a;

    static {
        PlatformMagnifierFactory.a = Companion.a;
    }

    @l
    PlatformMagnifier a(@l MagnifierStyle arg1, @l View arg2, @l Density arg3, float arg4);

    boolean b();
}

