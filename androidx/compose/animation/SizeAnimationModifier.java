package androidx.compose.animation;

import A3.o;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationEndReason;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope.-CC;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nAnimationModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/SizeAnimationModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,162:1\n76#2:163\n102#2,2:164\n56#3,4:166\n*S KotlinDebug\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/SizeAnimationModifier\n*L\n102#1:163\n102#1:164,2\n113#1:166,4\n*E\n"})
final class SizeAnimationModifier extends LayoutModifierWithPassThroughIntrinsics {
    @StabilityInferred(parameters = 0)
    public static final class AnimData {
        @l
        private final Animatable a;
        private long b;
        public static final int c = 8;

        static {
        }

        private AnimData(Animatable animatable0, long v) {
            this.a = animatable0;
            this.b = v;
        }

        public AnimData(Animatable animatable0, long v, w w0) {
            this(animatable0, v);
        }

        @l
        public final Animatable a() {
            return this.a;
        }

        public final long b() {
            return this.b;
        }

        @l
        public final AnimData c(@l Animatable animatable0, long v) {
            L.p(animatable0, "anim");
            return new AnimData(animatable0, v, null);
        }

        public static AnimData d(AnimData sizeAnimationModifier$AnimData0, Animatable animatable0, long v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                animatable0 = sizeAnimationModifier$AnimData0.a;
            }
            if((v1 & 2) != 0) {
                v = sizeAnimationModifier$AnimData0.b;
            }
            return sizeAnimationModifier$AnimData0.c(animatable0, v);
        }

        @l
        public final Animatable e() {
            return this.a;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof AnimData)) {
                return false;
            }
            return L.g(this.a, ((AnimData)object0).a) ? IntSize.h(this.b, ((AnimData)object0).b) : false;
        }

        public final long f() {
            return this.b;
        }

        public final void g(long v) {
            this.b = v;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode() * 0x1F + IntSize.n(this.b);
        }

        @Override
        @l
        public String toString() {
            return "AnimData(anim=" + this.a + ", startSize=" + IntSize.p(this.b) + ')';
        }
    }

    @l
    private final AnimationSpec a;
    @l
    private final O b;
    @m
    private o c;
    @l
    private final MutableState d;

    public SizeAnimationModifier(@l AnimationSpec animationSpec0, @l O o0) {
        L.p(animationSpec0, "animSpec");
        L.p(o0, "scope");
        super();
        this.a = animationSpec0;
        this.b = o0;
        this.d = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
    }

    public final long a(long v) {
        AnimData sizeAnimationModifier$AnimData0 = this.b();
        if(sizeAnimationModifier$AnimData0 == null) {
            sizeAnimationModifier$AnimData0 = new AnimData(new Animatable(IntSize.b(v), VectorConvertersKt.h(IntSize.b), IntSize.b(0x100000001L), null, 8, null), v, null);
        }
        else if(!IntSize.h(v, ((IntSize)sizeAnimationModifier$AnimData0.e().r()).q())) {
            sizeAnimationModifier$AnimData0.g(((IntSize)sizeAnimationModifier$AnimData0.e().u()).q());
            androidx.compose.animation.SizeAnimationModifier.animateTo.data.1.1 sizeAnimationModifier$animateTo$data$1$10 = new o(v, this, null) {
                int k;
                final AnimData l;
                final long m;
                final SizeAnimationModifier n;

                {
                    this.l = sizeAnimationModifier$AnimData0;
                    this.m = v;
                    this.n = sizeAnimationModifier0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.compose.animation.SizeAnimationModifier.animateTo.data.1.1(this.l, this.m, this.n, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.compose.animation.SizeAnimationModifier.animateTo.data.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            IntSize intSize0 = IntSize.b(this.m);
                            this.k = 1;
                            object0 = Animatable.i(this.l.e(), intSize0, this.n.d(), null, null, this, 12, null);
                            if(object0 == object1) {
                                return object1;
                            }
                            break;
                        }
                        case 1: {
                            f0.n(object0);
                            break;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                    if(((AnimationResult)object0).a() == AnimationEndReason.b) {
                        o o0 = this.n.i();
                        if(o0 != null) {
                            o0.invoke(IntSize.b(this.l.f()), ((AnimationResult)object0).b().getValue());
                        }
                    }
                    return S0.a;
                }
            };
            k.f(this.b, null, null, sizeAnimationModifier$animateTo$data$1$10, 3, null);
        }
        this.l(sizeAnimationModifier$AnimData0);
        return ((IntSize)sizeAnimationModifier$AnimData0.e().u()).q();
    }

    @m
    public final AnimData b() {
        return (AnimData)this.d.getValue();
    }

    @l
    public final AnimationSpec d() {
        return this.a;
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    @l
    public MeasureResult h(@l MeasureScope measureScope0, @l Measurable measurable0, long v) {
        L.p(measureScope0, "$this$measure");
        L.p(measurable0, "measurable");
        Placeable placeable0 = measurable0.r1(v);
        long v1 = this.a(IntSizeKt.a(placeable0.N1(), placeable0.K1()));
        return MeasureScope.-CC.p(measureScope0, ((int)(v1 >> 0x20)), ((int)(v1 & 0xFFFFFFFFL)), null, new Function1() {
            final Placeable e;

            {
                this.e = placeable0;
                super(1);
            }

            public final void a(@l PlacementScope placeable$PlacementScope0) {
                L.p(placeable$PlacementScope0, "$this$layout");
                PlacementScope.v(placeable$PlacementScope0, this.e, 0, 0, 0.0f, 4, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((PlacementScope)object0));
                return S0.a;
            }
        }, 4, null);
    }

    @m
    public final o i() {
        return this.c;
    }

    @l
    public final O j() {
        return this.b;
    }

    public final void l(@m AnimData sizeAnimationModifier$AnimData0) {
        this.d.setValue(sizeAnimationModifier$AnimData0);
    }

    public final void m(@m o o0) {
        this.c = o0;
    }
}

