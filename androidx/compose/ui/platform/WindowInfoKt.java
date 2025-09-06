package androidx.compose.ui.platform;

import A3.a;
import A3.o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import y4.l;
import y4.m;

@s0({"SMAP\nWindowInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInfo.kt\nandroidx/compose/ui/platform/WindowInfoKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,81:1\n76#2:82\n50#3:83\n49#3:84\n1114#4,6:85\n*S KotlinDebug\n*F\n+ 1 WindowInfo.kt\nandroidx/compose/ui/platform/WindowInfoKt\n*L\n55#1:82\n57#1:83\n57#1:84\n57#1:85,6\n*E\n"})
public final class WindowInfoKt {
    @Composable
    public static final void a(@l Function1 function10, @m Composer composer0, int v) {
        L.p(function10, "onWindowFocusChanged");
        Composer composer1 = composer0.G(0x79E8727);
        int v1 = (v & 14) == 0 ? (composer1.Y(function10) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x79E8727, v1, -1, "androidx.compose.ui.platform.WindowFocusObserver (WindowInfo.kt:53)");
            }
            WindowInfo windowInfo0 = (WindowInfo)composer1.L(CompositionLocalsKt.x());
            State state0 = SnapshotStateKt.t(function10, composer1, v1 & 14);
            composer1.V(0x1E7B2B64);
            boolean z = composer1.t(windowInfo0);
            boolean z1 = composer1.t(state0);
            androidx.compose.ui.platform.WindowInfoKt.WindowFocusObserver.1.1 windowInfoKt$WindowFocusObserver$1$10 = composer1.W();
            if(z || z1 || windowInfoKt$WindowFocusObserver$1$10 == Composer.a.a()) {
                windowInfoKt$WindowFocusObserver$1$10 = new o(windowInfo0, state0, null) {
                    int k;
                    final WindowInfo l;
                    final State m;

                    {
                        this.l = windowInfo0;
                        this.m = state0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new androidx.compose.ui.platform.WindowInfoKt.WindowFocusObserver.1.1(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((androidx.compose.ui.platform.WindowInfoKt.WindowFocusObserver.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                i i0 = SnapshotStateKt.v(new a() {
                                    final WindowInfo e;

                                    {
                                        this.e = windowInfo0;
                                        super(0);
                                    }

                                    @l
                                    public final Boolean b() {
                                        return Boolean.valueOf(this.e.b());
                                    }

                                    @Override  // A3.a
                                    public Object invoke() {
                                        return this.b();
                                    }
                                });
                                androidx.compose.ui.platform.WindowInfoKt.WindowFocusObserver.1.1.2 windowInfoKt$WindowFocusObserver$1$1$20 = new j() {
                                    @m
                                    public final Object a(boolean z, @l d d0) {
                                        ((Function1)this.a.getValue()).invoke(kotlin.coroutines.jvm.internal.b.a(z));
                                        return S0.a;
                                    }

                                    @Override  // kotlinx.coroutines.flow.j
                                    public Object emit(Object object0, d d0) {
                                        return this.a(((Boolean)object0).booleanValue(), d0);
                                    }
                                };
                                this.k = 1;
                                return i0.collect(windowInfoKt$WindowFocusObserver$1$1$20, this) == object1 ? object1 : S0.a;
                            }
                            case 1: {
                                f0.n(object0);
                                return S0.a;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                };
                composer1.O(windowInfoKt$WindowFocusObserver$1$10);
            }
            composer1.g0();
            EffectsKt.g(windowInfo0, windowInfoKt$WindowFocusObserver$1$10, composer1, 0x40);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(function10, v) {
                final Function1 e;
                final int f;

                {
                    this.e = function10;
                    this.f = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    WindowInfoKt.a(this.e, composer0, (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)));
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

