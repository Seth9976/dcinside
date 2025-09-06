package androidx.compose.foundation.relocation;

import A3.a;
import A3.o;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nBringIntoViewResponder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n1#2:200\n*E\n"})
final class BringIntoViewResponderModifier extends BringIntoViewChildModifier implements BringIntoViewParent, ModifierLocalProvider {
    public BringIntoViewResponder d;

    public BringIntoViewResponderModifier(@l BringIntoViewParent bringIntoViewParent0) {
        L.p(bringIntoViewParent0, "defaultParent");
        super(bringIntoViewParent0);
    }

    @Override  // androidx.compose.foundation.relocation.BringIntoViewParent
    @m
    public Object a(@l LayoutCoordinates layoutCoordinates0, @l a a0, @l d d0) {
        Object object0 = P.g(new o(layoutCoordinates0, a0, new a(layoutCoordinates0, a0) {
            final BringIntoViewResponderModifier e;
            final LayoutCoordinates f;
            final a g;

            {
                this.e = bringIntoViewResponderModifier0;
                this.f = layoutCoordinates0;
                this.g = a0;
                super(0);
            }

            @m
            public final Rect b() {
                Rect rect0 = BringIntoViewResponderModifier.j(this.e, this.f, this.g);
                return rect0 == null ? null : this.e.l().b(rect0);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }, null) {
            int k;
            private Object l;
            final BringIntoViewResponderModifier m;
            final LayoutCoordinates n;
            final a o;
            final a p;

            {
                this.m = bringIntoViewResponderModifier0;
                this.n = layoutCoordinates0;
                this.o = a0;
                this.p = a1;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.relocation.BringIntoViewResponderModifier.bringChildIntoView.2(this.m, this.n, this.o, this.p, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.foundation.relocation.BringIntoViewResponderModifier.bringChildIntoView.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                O o0 = (O)this.l;
                k.f(o0, null, null, new o(this.n, this.o, null) {
                    int k;
                    final BringIntoViewResponderModifier l;
                    final LayoutCoordinates m;
                    final a n;

                    {
                        this.l = bringIntoViewResponderModifier0;
                        this.m = layoutCoordinates0;
                        this.n = a0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new androidx.compose.foundation.relocation.BringIntoViewResponderModifier.bringChildIntoView.2.1(this.l, this.m, this.n, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((androidx.compose.foundation.relocation.BringIntoViewResponderModifier.bringChildIntoView.2.1)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                BringIntoViewResponder bringIntoViewResponder0 = this.l.l();
                                androidx.compose.foundation.relocation.BringIntoViewResponderModifier.bringChildIntoView.2.1.1 bringIntoViewResponderModifier$bringChildIntoView$2$1$10 = new a(this.m, this.n) {
                                    final BringIntoViewResponderModifier a;
                                    final LayoutCoordinates b;
                                    final a c;

                                    {
                                        this.a = bringIntoViewResponderModifier0;
                                        this.b = layoutCoordinates0;
                                        this.c = a0;
                                        super(0, kotlin.jvm.internal.L.a.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderModifier;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                                    }

                                    @m
                                    public final Rect e() {
                                        return BringIntoViewResponderModifier.j(this.a, this.b, this.c);
                                    }

                                    @Override  // A3.a
                                    public Object invoke() {
                                        return this.e();
                                    }
                                };
                                this.k = 1;
                                return bringIntoViewResponder0.a(bringIntoViewResponderModifier$bringChildIntoView$2$1$10, this) == object1 ? object1 : S0.a;
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
                }, 3, null);
                return k.f(o0, null, null, new o(this.p, null) {
                    int k;
                    final BringIntoViewResponderModifier l;
                    final a m;

                    {
                        this.l = bringIntoViewResponderModifier0;
                        this.m = a0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new androidx.compose.foundation.relocation.BringIntoViewResponderModifier.bringChildIntoView.2.2(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((androidx.compose.foundation.relocation.BringIntoViewResponderModifier.bringChildIntoView.2.2)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                BringIntoViewParent bringIntoViewParent0 = this.l.d();
                                LayoutCoordinates layoutCoordinates0 = this.l.b();
                                if(layoutCoordinates0 == null) {
                                    return S0.a;
                                }
                                this.k = 1;
                                return bringIntoViewParent0.a(layoutCoordinates0, this.m, this) == object1 ? object1 : S0.a;
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
                }, 3, null);
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalProvider
    @l
    public ProvidableModifierLocal getKey() {
        return BringIntoViewKt.a();
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalProvider
    public Object getValue() {
        return this;
    }

    private static final Rect j(BringIntoViewResponderModifier bringIntoViewResponderModifier0, LayoutCoordinates layoutCoordinates0, a a0) {
        LayoutCoordinates layoutCoordinates1 = bringIntoViewResponderModifier0.b();
        if(layoutCoordinates1 == null) {
            return null;
        }
        if(!layoutCoordinates0.o()) {
            layoutCoordinates0 = null;
        }
        if(layoutCoordinates0 == null) {
            return null;
        }
        Rect rect0 = (Rect)a0.invoke();
        return rect0 == null ? null : BringIntoViewResponderKt.d(layoutCoordinates1, layoutCoordinates0, rect0);
    }

    @l
    public final BringIntoViewResponder l() {
        BringIntoViewResponder bringIntoViewResponder0 = this.d;
        if(bringIntoViewResponder0 != null) {
            return bringIntoViewResponder0;
        }
        L.S("responder");
        return null;
    }

    @l
    public BringIntoViewParent m() [...] // Inlined contents

    public final void n(@l BringIntoViewResponder bringIntoViewResponder0) {
        L.p(bringIntoViewResponder0, "<set-?>");
        this.d = bringIntoViewResponder0;
    }
}

