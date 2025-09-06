package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier.Builder;
import android.widget.Magnifier;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.math.b;
import y4.l;

@RequiresApi(29)
@s0({"SMAP\nPlatformMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformMagnifier.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,184:1\n152#2:185\n*S KotlinDebug\n*F\n+ 1 PlatformMagnifier.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n*L\n152#1:185\n*E\n"})
public final class PlatformMagnifierFactoryApi29Impl implements PlatformMagnifierFactory {
    @RequiresApi(29)
    @StabilityInferred(parameters = 0)
    public static final class PlatformMagnifierImpl extends androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl {
        public static final int c;

        static {
        }

        public PlatformMagnifierImpl(@l Magnifier magnifier0) {
            L.p(magnifier0, "magnifier");
            super(magnifier0);
        }

        @Override  // androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl
        public void b(long v, long v1, float f) {
            if(!Float.isNaN(f)) {
                this.d().setZoom(f);
            }
            if(OffsetKt.d(v1)) {
                this.d().show(Offset.p(v), Offset.r(v), Offset.p(v1), Offset.r(v1));
                return;
            }
            this.d().show(Offset.p(v), Offset.r(v));
        }
    }

    @l
    public static final PlatformMagnifierFactoryApi29Impl b;
    private static final boolean c;

    static {
        PlatformMagnifierFactoryApi29Impl.b = new PlatformMagnifierFactoryApi29Impl();
        PlatformMagnifierFactoryApi29Impl.c = true;
    }

    @Override  // androidx.compose.foundation.PlatformMagnifierFactory
    public PlatformMagnifier a(MagnifierStyle magnifierStyle0, View view0, Density density0, float f) {
        return this.c(magnifierStyle0, view0, density0, f);
    }

    @Override  // androidx.compose.foundation.PlatformMagnifierFactory
    public boolean b() {
        return PlatformMagnifierFactoryApi29Impl.c;
    }

    @l
    public PlatformMagnifierImpl c(@l MagnifierStyle magnifierStyle0, @l View view0, @l Density density0, float f) {
        L.p(magnifierStyle0, "style");
        L.p(view0, "view");
        L.p(density0, "density");
        if(L.g(magnifierStyle0, MagnifierStyle.g.c())) {
            return new PlatformMagnifierImpl(new Magnifier(view0));
        }
        long v = density0.J(magnifierStyle0.g());
        float f1 = density0.y1(magnifierStyle0.d());
        float f2 = density0.y1(magnifierStyle0.e());
        Magnifier.Builder magnifier$Builder0 = new Magnifier.Builder(view0);
        if(v != 0x7FC000007FC00000L) {
            magnifier$Builder0.setSize(b.L0(Size.t(v)), b.L0(Size.m(v)));
        }
        if(!Float.isNaN(f1)) {
            magnifier$Builder0.setCornerRadius(f1);
        }
        if(!Float.isNaN(f2)) {
            magnifier$Builder0.setElevation(f2);
        }
        if(!Float.isNaN(f)) {
            magnifier$Builder0.setInitialZoom(f);
        }
        magnifier$Builder0.setClippingEnabled(magnifierStyle0.c());
        Magnifier magnifier0 = magnifier$Builder0.build();
        L.o(magnifier0, "Builder(view).run {\n    …    build()\n            }");
        return new PlatformMagnifierImpl(magnifier0);
    }
}

