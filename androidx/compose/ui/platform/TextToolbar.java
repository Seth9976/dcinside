package androidx.compose.ui.platform;

import A3.a;
import androidx.compose.ui.geometry.Rect;
import y4.l;
import y4.m;

public interface TextToolbar {
    public static final class DefaultImpls {
        public static void a(TextToolbar textToolbar0, Rect rect0, a a0, a a1, a a2, a a3, int v, Object object0) {
            E0.a(textToolbar0, rect0, a0, a1, a2, a3, v, object0);
        }
    }

    void a();

    void b(@l Rect arg1, @m a arg2, @m a arg3, @m a arg4, @m a arg5);

    @l
    TextToolbarStatus getStatus();
}

