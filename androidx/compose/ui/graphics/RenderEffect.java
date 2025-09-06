package androidx.compose.ui.graphics;

import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
@s0({"SMAP\nAndroidRenderEffect.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidRenderEffect.android.kt\nandroidx/compose/ui/graphics/RenderEffect\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1#2:170\n*E\n"})
public abstract class RenderEffect {
    @m
    private android.graphics.RenderEffect a;

    private RenderEffect() {
    }

    public RenderEffect(w w0) {
    }

    @RequiresApi(0x1F)
    @l
    public final android.graphics.RenderEffect a() {
        android.graphics.RenderEffect renderEffect0 = this.a;
        if(renderEffect0 == null) {
            renderEffect0 = this.b();
            this.a = renderEffect0;
        }
        return renderEffect0;
    }

    @RequiresApi(0x1F)
    @l
    protected abstract android.graphics.RenderEffect b();

    public boolean c() {
        return Build.VERSION.SDK_INT >= 0x1F;
    }
}

