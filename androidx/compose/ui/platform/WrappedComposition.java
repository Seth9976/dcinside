package androidx.compose.ui.platform;

import A3.o;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.R.id;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Set;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

final class WrappedComposition implements Composition, LifecycleEventObserver {
    @l
    private final AndroidComposeView a;
    @l
    private final Composition b;
    private boolean c;
    @m
    private Lifecycle d;
    @l
    private o e;

    public WrappedComposition(@l AndroidComposeView androidComposeView0, @l Composition composition0) {
        L.p(androidComposeView0, "owner");
        L.p(composition0, "original");
        super();
        this.a = androidComposeView0;
        this.b = composition0;
        this.e = ComposableSingletons.Wrapper_androidKt.a.a();
    }

    @Override  // androidx.compose.runtime.Composition
    public boolean a() {
        return this.b.a();
    }

    @Override  // androidx.compose.runtime.Composition
    @ComposableInferredTarget(scheme = "[0[0]]")
    public void b(@l o o0) {
        L.p(o0, "content");
        androidx.compose.ui.platform.WrappedComposition.setContent.1 wrappedComposition$setContent$10 = new Function1(o0) {
            final WrappedComposition e;
            final o f;

            {
                this.e = wrappedComposition0;
                this.f = o0;
                super(1);
            }

            public final void a(@l ViewTreeOwners androidComposeView$ViewTreeOwners0) {
                L.p(androidComposeView$ViewTreeOwners0, "it");
                if(!this.e.c) {
                    Lifecycle lifecycle0 = androidComposeView$ViewTreeOwners0.a().getLifecycle();
                    this.e.e = this.f;
                    if(this.e.d == null) {
                        this.e.d = lifecycle0;
                        lifecycle0.a(this.e);
                        return;
                    }
                    if(lifecycle0.b().b(State.c)) {
                        this.e.h().b(ComposableLambdaKt.c(-2000640158, true, new o(this.f) {
                            final WrappedComposition e;
                            final o f;

                            {
                                this.e = wrappedComposition0;
                                this.f = o0;
                                super(2);
                            }

                            @Composable
                            public final void a(@m Composer composer0, int v) {
                                if((v & 11) == 2 && composer0.c()) {
                                    composer0.m();
                                    return;
                                }
                                if(ComposerKt.g0()) {
                                    ComposerKt.w0(-2000640158, v, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:139)");
                                }
                                Object object0 = this.e.i().getTag(id.inspection_slot_table_set);
                                Set set0 = v0.J(object0) ? ((Set)object0) : null;
                                if(set0 == null) {
                                    ViewParent viewParent0 = this.e.i().getParent();
                                    View view0 = viewParent0 instanceof View ? ((View)viewParent0) : null;
                                    Object object1 = view0 == null ? null : view0.getTag(0x7F0B066E);  // id:inspection_slot_table_set
                                    set0 = v0.J(object1) ? ((Set)object1) : null;
                                }
                                if(set0 != null) {
                                    set0.add(composer0.X());
                                    composer0.S();
                                }
                                EffectsKt.g(this.e.i(), new o(null) {
                                    int k;
                                    final WrappedComposition l;

                                    {
                                        this.l = wrappedComposition0;
                                        super(2, d0);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @l
                                    public final d create(@m Object object0, @l d d0) {
                                        return new androidx.compose.ui.platform.WrappedComposition.setContent.1.1.1(this.l, d0);
                                    }

                                    @Override  // A3.o
                                    public Object invoke(Object object0, Object object1) {
                                        return this.invoke(((O)object0), ((d)object1));
                                    }

                                    @m
                                    public final Object invoke(@l O o0, @m d d0) {
                                        return ((androidx.compose.ui.platform.WrappedComposition.setContent.1.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @m
                                    public final Object invokeSuspend(@l Object object0) {
                                        Object object1 = b.l();
                                        switch(this.k) {
                                            case 0: {
                                                f0.n(object0);
                                                this.k = 1;
                                                return this.l.i().R(this) == object1 ? object1 : S0.a;
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
                                }, composer0, 72);
                                CompositionLocalKt.b(new ProvidedValue[]{InspectionTablesKt.a().f(set0)}, ComposableLambdaKt.b(composer0, -1193460702, true, new o(this.f) {
                                    final WrappedComposition e;
                                    final o f;

                                    {
                                        this.e = wrappedComposition0;
                                        this.f = o0;
                                        super(2);
                                    }

                                    @Composable
                                    public final void a(@m Composer composer0, int v) {
                                        if((v & 11) == 2 && composer0.c()) {
                                            composer0.m();
                                            return;
                                        }
                                        if(ComposerKt.g0()) {
                                            ComposerKt.w0(-1193460702, v, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:154)");
                                        }
                                        AndroidCompositionLocals_androidKt.a(this.e.i(), this.f, composer0, 8);
                                        if(ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override  // A3.o
                                    public Object invoke(Object object0, Object object1) {
                                        this.a(((Composer)object0), ((Number)object1).intValue());
                                        return S0.a;
                                    }
                                }), composer0, 56);
                                if(ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                this.a(((Composer)object0), ((Number)object1).intValue());
                                return S0.a;
                            }
                        }));
                    }
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((ViewTreeOwners)object0));
                return S0.a;
            }
        };
        this.a.setOnViewTreeOwnersAvailable(wrappedComposition$setContent$10);
    }

    @Override  // androidx.compose.runtime.Composition
    public boolean c() {
        return this.b.c();
    }

    @Override  // androidx.compose.runtime.Composition
    public void dispose() {
        if(!this.c) {
            this.c = true;
            this.a.setTag(id.wrapped_composition_tag, null);
            Lifecycle lifecycle0 = this.d;
            if(lifecycle0 != null) {
                lifecycle0.d(this);
            }
        }
        this.b.dispose();
    }

    @l
    public final Composition h() {
        return this.b;
    }

    @l
    public final AndroidComposeView i() {
        return this.a;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@l LifecycleOwner lifecycleOwner0, @l Event lifecycle$Event0) {
        L.p(lifecycleOwner0, "source");
        L.p(lifecycle$Event0, "event");
        if(lifecycle$Event0 == Event.ON_DESTROY) {
            this.dispose();
            return;
        }
        if(lifecycle$Event0 == Event.ON_CREATE && !this.c) {
            this.b(this.e);
        }
    }
}

