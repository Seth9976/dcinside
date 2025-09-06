package androidx.compose.ui.platform;

import android.view.View;
import y4.l;
import y4.m;

public interface ViewRootForInspector {
    public static final class DefaultImpls {
        @Deprecated
        @m
        public static AbstractComposeView a(@l ViewRootForInspector viewRootForInspector0) {
            return L0.c(viewRootForInspector0);
        }

        @Deprecated
        @m
        public static View b(@l ViewRootForInspector viewRootForInspector0) {
            return L0.d(viewRootForInspector0);
        }
    }

    @m
    AbstractComposeView getSubCompositionView();

    @m
    View getViewRoot();
}

