package androidx.compose.foundation.lazy.layout;

import A3.o;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import java.util.Map;
import kotlin.S0;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@ExperimentalFoundationApi
final class DefaultDelegatingLazyLayoutItemProvider implements LazyLayoutItemProvider {
    @l
    private final State a;

    public DefaultDelegatingLazyLayoutItemProvider(@l State state0) {
        L.p(state0, "delegate");
        super();
        this.a = state0;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @l
    public Object D(int v) {
        return ((LazyLayoutItemProvider)this.a.getValue()).D(v);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @m
    public Object E(int v) {
        return ((LazyLayoutItemProvider)this.a.getValue()).E(v);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public void F(int v, @m Composer composer0, int v1) {
        Composer composer1 = composer0.G(0x615D6713);
        int v2 = (v1 & 14) == 0 ? (composer1.z(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.t(this) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x615D6713, v2, -1, "androidx.compose.foundation.lazy.layout.DefaultDelegatingLazyLayoutItemProvider.Item (LazyLayoutItemProvider.kt:194)");
            }
            ((LazyLayoutItemProvider)this.a.getValue()).F(v, composer1, v2 & 14);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(v, v1) {
                final DefaultDelegatingLazyLayoutItemProvider e;
                final int f;
                final int g;

                {
                    this.e = defaultDelegatingLazyLayoutItemProvider0;
                    this.f = v;
                    this.g = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    this.e.F(this.f, composer0, (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)));
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @l
    public Map G() {
        return ((LazyLayoutItemProvider)this.a.getValue()).G();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return ((LazyLayoutItemProvider)this.a.getValue()).getItemCount();
    }
}

