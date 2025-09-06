package androidx.compose.foundation.text;

import A3.o;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.S0;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class ContextMenu_androidKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void a(@l SelectionManager selectionManager0, @l o o0, @m Composer composer0, int v) {
        L.p(selectionManager0, "manager");
        L.p(o0, "content");
        Composer composer1 = composer0.G(605522716);
        int v1 = (v & 0x70) == 0 ? (composer1.Y(o0) ? 0x20 : 16) | v : v;
        if((v1 & 81) != 16 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(605522716, v1, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:31)");
            }
            o0.invoke(composer1, ((int)(v1 >> 3 & 14)));
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(selectionManager0, o0, v) {
                final SelectionManager e;
                final o f;
                final int g;

                {
                    this.e = selectionManager0;
                    this.f = o0;
                    this.g = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    ContextMenu_androidKt.a(this.e, this.f, composer0, (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)));
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void b(@l TextFieldSelectionManager textFieldSelectionManager0, @l o o0, @m Composer composer0, int v) {
        L.p(textFieldSelectionManager0, "manager");
        L.p(o0, "content");
        Composer composer1 = composer0.G(0x89A76B73);
        int v1 = (v & 0x70) == 0 ? (composer1.Y(o0) ? 0x20 : 16) | v : v;
        if((v1 & 81) != 16 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x89A76B73, v1, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:23)");
            }
            o0.invoke(composer1, ((int)(v1 >> 3 & 14)));
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(textFieldSelectionManager0, o0, v) {
                final TextFieldSelectionManager e;
                final o f;
                final int g;

                {
                    this.e = textFieldSelectionManager0;
                    this.f = o0;
                    this.g = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    ContextMenu_androidKt.b(this.e, this.f, composer0, (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)));
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }
}

