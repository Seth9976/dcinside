package androidx.compose.foundation;

import A3.a;
import A3.o;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.math.b;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@Stable
@s0({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,410:1\n76#2:411\n102#2,2:412\n76#2:414\n102#2,2:415\n76#2:417\n76#2:418\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollState\n*L\n96#1:411\n96#1:412,2\n114#1:414\n114#1:415,2\n157#1:417\n159#1:418\n*E\n"})
public final class ScrollState implements ScrollableState {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final Saver a() {
            return ScrollState.k;
        }
    }

    @l
    private final MutableState a;
    @l
    private final MutableState b;
    @l
    private final MutableInteractionSource c;
    @l
    private MutableState d;
    private float e;
    @l
    private final ScrollableState f;
    @l
    private final State g;
    @l
    private final State h;
    @l
    public static final Companion i;
    public static final int j;
    @l
    private static final Saver k;

    static {
        ScrollState.i = new Companion(null);
        ScrollState.k = SaverKt.a(ScrollState.Companion.Saver.1.e, ScrollState.Companion.Saver.2.e);
    }

    public ScrollState(int v) {
        this.a = SnapshotStateKt.j(v, SnapshotStateKt.w());
        this.b = SnapshotStateKt.j(0, SnapshotStateKt.w());
        this.c = InteractionSourceKt.a();
        this.d = SnapshotStateKt.j(0x7FFFFFFF, SnapshotStateKt.w());
        this.f = ScrollableStateKt.a(new Function1() {
            final ScrollState e;

            {
                this.e = scrollState0;
                super(1);
            }

            @l
            public final Float b(float f) {
                float f1 = ((float)this.e.o()) + f + this.e.e;
                float f2 = s.H(f1, 0.0f, this.e.n());
                float f3 = f2 - ((float)this.e.o());
                int v = b.L0(f3);
                int v1 = this.e.o();
                this.e.s(v1 + v);
                this.e.e = f3 - ((float)v);
                if(f1 != f2) {
                    f = f3;
                }
                return f;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((Number)object0).floatValue());
            }
        });
        this.g = SnapshotStateKt.c(new a() {
            final ScrollState e;

            {
                this.e = scrollState0;
                super(0);
            }

            @l
            public final Boolean b() {
                return this.e.o() >= this.e.n() ? false : true;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
        this.h = SnapshotStateKt.c(new a() {
            final ScrollState e;

            {
                this.e = scrollState0;
                super(0);
            }

            @l
            public final Boolean b() {
                return this.e.o() <= 0 ? false : true;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean a() {
        return ((Boolean)this.g.getValue()).booleanValue();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public float b(float f) {
        return this.f.b(f);
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean c() {
        return this.f.c();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    @m
    public Object d(@l MutatePriority mutatePriority0, @l o o0, @l d d0) {
        Object object0 = this.f.d(mutatePriority0, o0, d0);
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean e() {
        return ((Boolean)this.h.getValue()).booleanValue();
    }

    @m
    public final Object j(int v, @l AnimationSpec animationSpec0, @l d d0) {
        Object object0 = ScrollExtensionsKt.a(this, ((float)(v - this.o())), animationSpec0, d0);
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
    }

    public static Object k(ScrollState scrollState0, int v, AnimationSpec animationSpec0, d d0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            animationSpec0 = new SpringSpec(0.0f, 0.0f, null, 7, null);
        }
        return scrollState0.j(v, animationSpec0, d0);
    }

    @l
    public final InteractionSource l() {
        return this.c;
    }

    @l
    public final MutableInteractionSource m() {
        return this.c;
    }

    public final int n() {
        return ((Number)this.d.getValue()).intValue();
    }

    public final int o() {
        return ((Number)this.a.getValue()).intValue();
    }

    public final int p() {
        return ((Number)this.b.getValue()).intValue();
    }

    @m
    public final Object q(int v, @l d d0) {
        return ScrollExtensionsKt.c(this, ((float)(v - this.o())), d0);
    }

    public final void r(int v) {
        this.d.setValue(v);
        if(this.o() > v) {
            this.s(v);
        }
    }

    private final void s(int v) {
        this.a.setValue(v);
    }

    public final void t(int v) {
        this.b.setValue(v);
    }
}

