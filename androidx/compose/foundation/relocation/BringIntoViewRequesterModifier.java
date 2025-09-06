package androidx.compose.foundation.relocation;

import A3.a;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@ExperimentalFoundationApi
final class BringIntoViewRequesterModifier extends BringIntoViewChildModifier {
    public BringIntoViewRequesterModifier(@l BringIntoViewParent bringIntoViewParent0) {
        L.p(bringIntoViewParent0, "defaultParent");
        super(bringIntoViewParent0);
    }

    @m
    public final Object i(@m Rect rect0, @l d d0) {
        BringIntoViewParent bringIntoViewParent0 = this.d();
        LayoutCoordinates layoutCoordinates0 = this.b();
        if(layoutCoordinates0 == null) {
            return S0.a;
        }
        Object object0 = bringIntoViewParent0.a(layoutCoordinates0, new a(this) {
            final Rect e;
            final BringIntoViewRequesterModifier f;

            {
                this.e = rect0;
                this.f = bringIntoViewRequesterModifier0;
                super(0);
            }

            @m
            public final Rect b() {
                Rect rect0 = this.e;
                if(rect0 == null) {
                    LayoutCoordinates layoutCoordinates0 = this.f.b();
                    return layoutCoordinates0 == null ? null : SizeKt.m(IntSizeKt.f(layoutCoordinates0.a()));
                }
                return rect0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }
}

