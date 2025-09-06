package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.input.pointer.AndroidPointerIcon;
import androidx.compose.ui.input.pointer.AndroidPointerIconType;
import androidx.compose.ui.input.pointer.PointerIcon;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@RequiresApi(24)
final class AndroidComposeViewVerificationHelperMethodsN {
    @l
    public static final AndroidComposeViewVerificationHelperMethodsN a;

    static {
        AndroidComposeViewVerificationHelperMethodsN.a = new AndroidComposeViewVerificationHelperMethodsN();
    }

    @DoNotInline
    @RequiresApi(24)
    public final void a(@l View view0, @m PointerIcon pointerIcon0) {
        android.view.PointerIcon pointerIcon1;
        L.p(view0, "view");
        if(pointerIcon0 instanceof AndroidPointerIcon) {
            pointerIcon1 = ((AndroidPointerIcon)pointerIcon0).a();
        }
        else if(pointerIcon0 instanceof AndroidPointerIconType) {
            pointerIcon1 = android.view.PointerIcon.getSystemIcon(view0.getContext(), ((AndroidPointerIconType)pointerIcon0).a());
            L.o(pointerIcon1, "getSystemIcon(view.context, icon.type)");
        }
        else {
            pointerIcon1 = android.view.PointerIcon.getSystemIcon(view0.getContext(), 1000);
            L.o(pointerIcon1, "getSystemIcon(\n         …DEFAULT\n                )");
        }
        if(!L.g(view0.getPointerIcon(), pointerIcon1)) {
            view0.setPointerIcon(pointerIcon1);
        }
    }
}

