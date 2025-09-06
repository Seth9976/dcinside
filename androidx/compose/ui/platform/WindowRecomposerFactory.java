package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.InternalComposeUiApi;
import y4.l;

@InternalComposeUiApi
public interface WindowRecomposerFactory {
    public static final class Companion {
        static final Companion a;
        @l
        private static final WindowRecomposerFactory b;

        static {
            Companion.a = new Companion();
            Companion.b = WindowRecomposerFactory.Companion.LifecycleAware.1.b;
        }

        @l
        public final WindowRecomposerFactory a() {
            return Companion.b;
        }

        public static void b() {
        }
    }

    @l
    public static final Companion a;

    static {
        WindowRecomposerFactory.a = Companion.a;
    }

    @l
    Recomposer a(@l View arg1);
}

