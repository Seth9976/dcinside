package androidx.compose.ui.platform;

import A3.o;
import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

@StabilityInferred(parameters = 0)
public final class ComposeView extends AbstractComposeView {
    @l
    private final MutableState j;
    private boolean k;
    public static final int l = 8;

    static {
    }

    @j
    public ComposeView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public ComposeView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public ComposeView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.j = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
    }

    public ComposeView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    @Composable
    public void a(@m Composer composer0, int v) {
        Composer composer1 = composer0.G(0x190BF45A);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x190BF45A, v, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:426)");
        }
        o o0 = (o)this.j.getValue();
        if(o0 != null) {
            o0.invoke(composer1, 0);
        }
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(v) {
                final ComposeView e;
                final int f;

                {
                    this.e = composeView0;
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

    @Override  // android.view.ViewGroup
    @l
    public CharSequence getAccessibilityClassName() {
        L.o("androidx.compose.ui.platform.ComposeView", "javaClass.name");
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.k;
    }

    protected static void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public final void setContent(@l o o0) {
        L.p(o0, "content");
        this.k = true;
        this.j.setValue(o0);
        if(this.isAttachedToWindow()) {
            this.d();
        }
    }
}

