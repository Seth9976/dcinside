package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class BeyondBoundsLayoutKt {
    @ExperimentalComposeUiApi
    @m
    public static final Object a(@l FocusTargetModifierNode focusTargetModifierNode0, int v, @l Function1 function10) {
        L.p(focusTargetModifierNode0, "$this$searchBeyondBounds");
        L.p(function10, "block");
        BeyondBoundsLayout beyondBoundsLayout0 = focusTargetModifierNode0.j0();
        if(beyondBoundsLayout0 != null) {
            if(FocusDirection.n(v, 5)) {
                return beyondBoundsLayout0.a(5, function10);
            }
            if(FocusDirection.n(v, 6)) {
                return beyondBoundsLayout0.a(6, function10);
            }
            if(FocusDirection.n(v, 3)) {
                return beyondBoundsLayout0.a(3, function10);
            }
            if(FocusDirection.n(v, 4)) {
                return beyondBoundsLayout0.a(4, function10);
            }
            if(FocusDirection.n(v, 1)) {
                return beyondBoundsLayout0.a(2, function10);
            }
            if(!FocusDirection.n(v, 2)) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            return beyondBoundsLayout0.a(1, function10);
        }
        return null;
    }
}

