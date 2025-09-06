package androidx.compose.ui.window;

import A3.o;
import android.content.Context;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AbstractComposeView;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.math.b;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,456:1\n76#2:457\n102#2,2:458\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout\n*L\n216#1:457\n216#1:458,2\n*E\n"})
final class DialogLayout extends AbstractComposeView implements DialogWindowProvider {
    @l
    private final Window j;
    @l
    private final MutableState k;
    private boolean l;
    private boolean m;

    public DialogLayout(@l Context context0, @l Window window0) {
        L.p(context0, "context");
        L.p(window0, "window");
        super(context0, null, 0, 6, null);
        this.j = window0;
        this.k = SnapshotStateKt__SnapshotStateKt.g(ComposableSingletons.AndroidDialog_androidKt.a.a(), null, 2, null);
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    @Composable
    public void a(@m Composer composer0, int v) {
        Composer composer1 = composer0.G(0x6770D814);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x6770D814, v, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:266)");
        }
        this.getContent().invoke(composer1, 0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(v) {
                final DialogLayout e;
                final int f;

                {
                    this.e = dialogLayout0;
                    this.f = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    this.e.a(composer0, (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)));
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public void g(boolean z, int v, int v1, int v2, int v3) {
        super.g(z, v, v1, v2, v3);
        View view0 = this.getChildAt(0);
        if(view0 == null) {
            return;
        }
        this.getWindow().setLayout(view0.getMeasuredWidth(), view0.getMeasuredHeight());
    }

    private final o getContent() {
        return (o)this.k.getValue();
    }

    private final int getDisplayHeight() {
        float f = this.getContext().getResources().getDisplayMetrics().density;
        return b.L0(((float)this.getContext().getResources().getConfiguration().screenHeightDp) * f);
    }

    private final int getDisplayWidth() {
        float f = this.getContext().getResources().getDisplayMetrics().density;
        return b.L0(((float)this.getContext().getResources().getConfiguration().screenWidthDp) * f);
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.m;
    }

    @Override  // androidx.compose.ui.window.DialogWindowProvider
    @l
    public Window getWindow() {
        return this.j;
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public void h(int v, int v1) {
        if(this.l) {
            super.h(v, v1);
            return;
        }
        super.h(View.MeasureSpec.makeMeasureSpec(this.getDisplayWidth(), 0x80000000), View.MeasureSpec.makeMeasureSpec(this.getDisplayHeight(), 0x80000000));
    }

    public final boolean k() {
        return this.l;
    }

    public final void l(@l CompositionContext compositionContext0, @l o o0) {
        L.p(compositionContext0, "parent");
        L.p(o0, "content");
        this.setParentCompositionContext(compositionContext0);
        this.setContent(o0);
        this.m = true;
        this.d();
    }

    public final void m(boolean z) {
        this.l = z;
    }

    private final void setContent(o o0) {
        this.k.setValue(o0);
    }
}

