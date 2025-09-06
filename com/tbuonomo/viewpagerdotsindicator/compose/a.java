package com.tbuonomo.viewpagerdotsindicator.compose;

import A3.o;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

public final class a {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void a(@l M2.a a0, @l Modifier modifier0, @m Composer composer0, int v) {
        static final class com.tbuonomo.viewpagerdotsindicator.compose.a.a extends N implements o {
            final M2.a e;
            final Modifier f;
            final int g;

            com.tbuonomo.viewpagerdotsindicator.compose.a.a(M2.a a0, Modifier modifier0, int v) {
                this.e = a0;
                this.f = modifier0;
                this.g = v;
                super(2);
            }

            public final void a(@m Composer composer0, int v) {
                a.a(this.e, this.f, composer0, (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)));
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((Composer)object0), ((Number)object1).intValue());
                return S0.a;
            }
        }

        L.p(a0, "graphic");
        L.p(modifier0, "modifier");
        Composer composer1 = composer0.G(0x650C0777);
        int v1 = (v & 14) == 0 ? (composer1.t(a0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.t(modifier0) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x650C0777, v, -1, "com.tbuonomo.viewpagerdotsindicator.compose.Dot (Dot.kt:11)");
            }
            Modifier modifier1 = SizeKt.C(BackgroundKt.c(modifier0, a0.j(), a0.k()), a0.l());
            Dp dp0 = a0.i();
            if(dp0 != null) {
                Modifier modifier2 = BorderKt.h(modifier1, dp0.w(), a0.h(), a0.k());
                if(modifier2 != null) {
                    modifier1 = modifier2;
                }
            }
            BoxKt.a(modifier1, composer1, 0);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new com.tbuonomo.viewpagerdotsindicator.compose.a.a(a0, modifier0, v));
        }
    }
}

