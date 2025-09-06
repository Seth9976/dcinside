package androidx.compose.foundation.relocation;

import A3.a;
import android.view.View;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class AndroidBringIntoViewParent implements BringIntoViewParent {
    @l
    private final View a;

    public AndroidBringIntoViewParent(@l View view0) {
        L.p(view0, "view");
        super();
        this.a = view0;
    }

    @Override  // androidx.compose.foundation.relocation.BringIntoViewParent
    @m
    public Object a(@l LayoutCoordinates layoutCoordinates0, @l a a0, @l d d0) {
        long v = LayoutCoordinatesKt.f(layoutCoordinates0);
        Rect rect0 = (Rect)a0.invoke();
        if(rect0 != null) {
            Rect rect1 = rect0.S(v);
            if(rect1 != null) {
                android.graphics.Rect rect2 = BringIntoViewResponder_androidKt.c(rect1);
                this.a.requestRectangleOnScreen(rect2, false);
                return S0.a;
            }
        }
        return S0.a;
    }
}

