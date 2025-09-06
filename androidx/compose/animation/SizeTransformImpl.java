package androidx.compose.animation;

import A3.o;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

@ExperimentalAnimationApi
final class SizeTransformImpl implements SizeTransform {
    private final boolean a;
    @l
    private final o b;

    public SizeTransformImpl(boolean z, @l o o0) {
        L.p(o0, "sizeAnimationSpec");
        super();
        this.a = z;
        this.b = o0;
    }

    public SizeTransformImpl(boolean z, o o0, int v, w w0) {
        if((v & 1) != 0) {
            z = true;
        }
        this(z, o0);
    }

    @l
    public final o a() {
        return this.b;
    }

    @Override  // androidx.compose.animation.SizeTransform
    public boolean d() {
        return this.a;
    }

    @Override  // androidx.compose.animation.SizeTransform
    @l
    public FiniteAnimationSpec e(long v, long v1) {
        IntSize intSize0 = IntSize.b(v);
        IntSize intSize1 = IntSize.b(v1);
        return (FiniteAnimationSpec)this.b.invoke(intSize0, intSize1);
    }
}

