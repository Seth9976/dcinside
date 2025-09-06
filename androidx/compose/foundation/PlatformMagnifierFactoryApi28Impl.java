package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(28)
public final class PlatformMagnifierFactoryApi28Impl implements PlatformMagnifierFactory {
    @RequiresApi(28)
    @StabilityInferred(parameters = 0)
    public static class PlatformMagnifierImpl implements PlatformMagnifier {
        @l
        private final Magnifier a;
        public static final int b = 8;

        static {
        }

        public PlatformMagnifierImpl(@l Magnifier magnifier0) {
            L.p(magnifier0, "magnifier");
            super();
            this.a = magnifier0;
        }

        @Override  // androidx.compose.foundation.PlatformMagnifier
        public long a() {
            return IntSizeKt.a(this.a.getWidth(), this.a.getHeight());
        }

        @Override  // androidx.compose.foundation.PlatformMagnifier
        public void b(long v, long v1, float f) {
            float f1 = Offset.p(v);
            float f2 = Offset.r(v);
            this.a.show(f1, f2);
        }

        @Override  // androidx.compose.foundation.PlatformMagnifier
        public void c() {
            this.a.update();
        }

        @l
        public final Magnifier d() {
            return this.a;
        }

        @Override  // androidx.compose.foundation.PlatformMagnifier
        public void dismiss() {
            this.a.dismiss();
        }
    }

    @l
    public static final PlatformMagnifierFactoryApi28Impl b;
    private static final boolean c;

    static {
        PlatformMagnifierFactoryApi28Impl.b = new PlatformMagnifierFactoryApi28Impl();
    }

    @Override  // androidx.compose.foundation.PlatformMagnifierFactory
    public PlatformMagnifier a(MagnifierStyle magnifierStyle0, View view0, Density density0, float f) {
        return this.c(magnifierStyle0, view0, density0, f);
    }

    @Override  // androidx.compose.foundation.PlatformMagnifierFactory
    public boolean b() {
        return PlatformMagnifierFactoryApi28Impl.c;
    }

    @l
    public PlatformMagnifierImpl c(@l MagnifierStyle magnifierStyle0, @l View view0, @l Density density0, float f) {
        L.p(magnifierStyle0, "style");
        L.p(view0, "view");
        L.p(density0, "density");
        return new PlatformMagnifierImpl(new Magnifier(view0));
    }
}

