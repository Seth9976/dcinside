package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nEdgeEffectCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EdgeEffectCompat.kt\nandroidx/compose/foundation/GlowEdgeEffectCompat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,156:1\n1#2:157\n154#3:158\n*S KotlinDebug\n*F\n+ 1 EdgeEffectCompat.kt\nandroidx/compose/foundation/GlowEdgeEffectCompat\n*L\n88#1:158\n*E\n"})
final class GlowEdgeEffectCompat extends EdgeEffect {
    private final float a;
    private float b;

    public GlowEdgeEffectCompat(@l Context context0) {
        L.p(context0, "context");
        super(context0);
        this.a = AndroidDensity_androidKt.a(context0).y1(1.0f);
    }

    public final void a(float f) {
        float f1 = this.b + f;
        this.b = f1;
        if(Math.abs(f1) > this.a) {
            this.onRelease();
        }
    }

    @Override  // android.widget.EdgeEffect
    public void onAbsorb(int v) {
        this.b = 0.0f;
        super.onAbsorb(v);
    }

    @Override  // android.widget.EdgeEffect
    public void onPull(float f) {
        this.b = 0.0f;
        super.onPull(f);
    }

    @Override  // android.widget.EdgeEffect
    public void onPull(float f, float f1) {
        this.b = 0.0f;
        super.onPull(f, f1);
    }

    @Override  // android.widget.EdgeEffect
    public void onRelease() {
        this.b = 0.0f;
        super.onRelease();
    }
}

