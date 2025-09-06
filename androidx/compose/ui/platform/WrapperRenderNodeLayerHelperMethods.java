package androidx.compose.ui.platform;

import android.view.ViewParent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(26)
public final class WrapperRenderNodeLayerHelperMethods {
    @l
    public static final WrapperRenderNodeLayerHelperMethods a;

    static {
        WrapperRenderNodeLayerHelperMethods.a = new WrapperRenderNodeLayerHelperMethods();
    }

    @DoNotInline
    public final void a(@l AndroidComposeView androidComposeView0) {
        L.p(androidComposeView0, "ownerView");
        ViewParent viewParent0 = androidComposeView0.getParent();
        if(viewParent0 != null) {
            viewParent0.onDescendantInvalidated(androidComposeView0, androidComposeView0);
        }
    }
}

