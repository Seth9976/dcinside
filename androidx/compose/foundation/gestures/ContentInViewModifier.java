package androidx.compose.foundation.gestures;

import A3.a;
import androidx.compose.foundation.FocusedBoundsKt;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.foundation.relocation.BringIntoViewResponderKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.b;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.concurrent.CancellationException;
import kotlin.J;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.h;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.c;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.M0;
import kotlinx.coroutines.N;
import kotlinx.coroutines.O0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.k;
import kotlinx.coroutines.o;
import kotlinx.coroutines.p;
import y4.l;
import y4.m;

@s0({"SMAP\nContentInViewModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,427:1\n314#2,11:428\n1#3:439\n106#4,2:440\n108#4:453\n492#5,11:442\n*S KotlinDebug\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier\n*L\n129#1:428,11\n326#1:440,2\n326#1:453\n326#1:442,11\n*E\n"})
public final class ContentInViewModifier implements BringIntoViewResponder, OnPlacedModifier, OnRemeasuredModifier {
    @s0({"SMAP\nContentInViewModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier$Request\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n1#2:428\n*E\n"})
    public static final class Request {
        @l
        private final a a;
        @l
        private final o b;

        public Request(@l a a0, @l o o0) {
            L.p(a0, "currentBounds");
            L.p(o0, "continuation");
            super();
            this.a = a0;
            this.b = o0;
        }

        @l
        public final o a() {
            return this.b;
        }

        @l
        public final a b() {
            return this.a;
        }

        @Override
        @l
        public String toString() {
            String s2;
            N n0 = (N)this.b.getContext().get(N.b);
            String s = n0 == null ? null : n0.j1();
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("Request@");
            String s1 = Integer.toString(this.hashCode(), c.a(16));
            L.o(s1, "toString(this, checkRadix(radix))");
            stringBuilder0.append(s1);
            if(s == null) {
                s2 = "(";
            }
            else {
                s2 = '[' + s + "](";
                if(s2 == null) {
                    s2 = "(";
                }
            }
            stringBuilder0.append(s2);
            stringBuilder0.append("currentBounds()=");
            stringBuilder0.append(this.a.invoke());
            stringBuilder0.append(", continuation=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(')');
            return stringBuilder0.toString();
        }
    }

    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[Orientation.values().length];
            try {
                arr_v[Orientation.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Orientation.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    @l
    private final O a;
    @l
    private final Orientation b;
    @l
    private final ScrollableState c;
    private final boolean d;
    @l
    private final BringIntoViewRequestPriorityQueue e;
    @m
    private LayoutCoordinates f;
    @m
    private LayoutCoordinates g;
    @m
    private Rect h;
    private boolean i;
    private long j;
    private boolean k;
    @l
    private final UpdatableAnimationState l;
    @l
    private final Modifier m;

    public ContentInViewModifier(@l O o0, @l Orientation orientation0, @l ScrollableState scrollableState0, boolean z) {
        L.p(o0, "scope");
        L.p(orientation0, "orientation");
        L.p(scrollableState0, "scrollState");
        super();
        this.a = o0;
        this.b = orientation0;
        this.c = scrollableState0;
        this.d = z;
        this.e = new BringIntoViewRequestPriorityQueue();
        this.j = 0L;
        this.l = new UpdatableAnimationState();
        this.m = BringIntoViewResponderKt.b(FocusedBoundsKt.c(this, new Function1() {
            final ContentInViewModifier e;

            {
                this.e = contentInViewModifier0;
                super(1);
            }

            public final void a(@m LayoutCoordinates layoutCoordinates0) {
                this.e.g = layoutCoordinates0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((LayoutCoordinates)object0));
                return S0.a;
            }
        }), this);
    }

    private final Rect A(Rect rect0, long v) {
        return rect0.S(Offset.z(this.N(rect0, v)));
    }

    private final Rect C() {
        MutableVector mutableVector0 = this.e.a;
        int v = mutableVector0.J();
        Rect rect0 = null;
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = mutableVector0.F();
            while(true) {
                Rect rect1 = (Rect)((Request)arr_object[v1]).b().invoke();
                if(rect1 != null) {
                    if(this.z(rect1.z(), IntSizeKt.f(this.j)) <= 0) {
                        rect0 = rect1;
                        goto label_12;
                    }
                    return rect0;
                }
            label_12:
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
        return rect0;
    }

    private final Rect D() {
        LayoutCoordinates layoutCoordinates0 = this.f;
        if(layoutCoordinates0 != null) {
            if(!layoutCoordinates0.o()) {
                layoutCoordinates0 = null;
            }
            if(layoutCoordinates0 != null) {
                LayoutCoordinates layoutCoordinates1 = this.g;
                if(layoutCoordinates1 != null) {
                    if(!layoutCoordinates1.o()) {
                        layoutCoordinates1 = null;
                    }
                    return layoutCoordinates1 == null ? null : layoutCoordinates0.E(layoutCoordinates1, false);
                }
            }
        }
        return null;
    }

    @l
    public final Modifier F() {
        return this.m;
    }

    // 去混淆评级： 低(20)
    private final boolean G(Rect rect0, long v) {
        return Offset.l(this.N(rect0, v), 0L);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean H(Function1 function10) {
        return b.b(this, function10);
    }

    static boolean I(ContentInViewModifier contentInViewModifier0, Rect rect0, long v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = contentInViewModifier0.j;
        }
        return contentInViewModifier0.G(rect0, v);
    }

    private final void J() {
        if(this.k) {
            throw new IllegalStateException("Check failed.");
        }
        androidx.compose.foundation.gestures.ContentInViewModifier.launchAnimation.1 contentInViewModifier$launchAnimation$10 = new A3.o(null) {
            int k;
            private Object l;
            final ContentInViewModifier m;

            {
                this.m = contentInViewModifier0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.gestures.ContentInViewModifier.launchAnimation.1(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.foundation.gestures.ContentInViewModifier.launchAnimation.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                CancellationException cancellationException0 = null;
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        I0 i00 = M0.B(((O)this.l).getCoroutineContext());
                        try {
                            try {
                                this.m.k = true;
                                androidx.compose.foundation.gestures.ContentInViewModifier.launchAnimation.1.1 contentInViewModifier$launchAnimation$1$10 = new A3.o(i00, null) {
                                    int k;
                                    private Object l;
                                    final ContentInViewModifier m;
                                    final I0 n;

                                    {
                                        this.m = contentInViewModifier0;
                                        this.n = i00;
                                        super(2, d0);
                                    }

                                    @m
                                    public final Object a(@l ScrollScope scrollScope0, @m d d0) {
                                        return ((androidx.compose.foundation.gestures.ContentInViewModifier.launchAnimation.1.1)this.create(scrollScope0, d0)).invokeSuspend(S0.a);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @l
                                    public final d create(@m Object object0, @l d d0) {
                                        d d1 = new androidx.compose.foundation.gestures.ContentInViewModifier.launchAnimation.1.1(this.m, this.n, d0);
                                        d1.l = object0;
                                        return d1;
                                    }

                                    @Override  // A3.o
                                    public Object invoke(Object object0, Object object1) {
                                        return this.a(((ScrollScope)object0), ((d)object1));
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @m
                                    public final Object invokeSuspend(@l Object object0) {
                                        Object object1 = kotlin.coroutines.intrinsics.b.l();
                                        switch(this.k) {
                                            case 0: {
                                                f0.n(object0);
                                                ScrollScope scrollScope0 = (ScrollScope)this.l;
                                                this.m.l.j(this.m.x());
                                                androidx.compose.foundation.gestures.ContentInViewModifier.launchAnimation.1.1.1 contentInViewModifier$launchAnimation$1$1$10 = new Function1(scrollScope0, this.n) {
                                                    final ContentInViewModifier e;
                                                    final ScrollScope f;
                                                    final I0 g;

                                                    {
                                                        this.e = contentInViewModifier0;
                                                        this.f = scrollScope0;
                                                        this.g = i00;
                                                        super(1);
                                                    }

                                                    public final void b(float f) {
                                                        float f1 = this.e.d ? 1.0f : -1.0f;
                                                        float f2 = f1 * this.f.a(f1 * f);
                                                        if(f2 < f) {
                                                            O0.j(this.g, "Scroll animation cancelled because scroll was not consumed (" + f2 + " < " + f + ')', null, 2, null);
                                                        }
                                                    }

                                                    @Override  // kotlin.jvm.functions.Function1
                                                    public Object invoke(Object object0) {
                                                        this.b(((Number)object0).floatValue());
                                                        return S0.a;
                                                    }
                                                };
                                                androidx.compose.foundation.gestures.ContentInViewModifier.launchAnimation.1.1.2 contentInViewModifier$launchAnimation$1$1$20 = new a() {
                                                    final ContentInViewModifier e;

                                                    {
                                                        this.e = contentInViewModifier0;
                                                        super(0);
                                                    }

                                                    @Override  // A3.a
                                                    public Object invoke() {
                                                        this.invoke();
                                                        return S0.a;
                                                    }

                                                    public final void invoke() {
                                                        BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue0 = this.e.e;
                                                        ContentInViewModifier contentInViewModifier0 = this.e;
                                                        while(bringIntoViewRequestPriorityQueue0.a.O()) {
                                                            Rect rect0 = (Rect)((Request)bringIntoViewRequestPriorityQueue0.a.P()).b().invoke();
                                                            if(!(rect0 == null ? true : ContentInViewModifier.I(contentInViewModifier0, rect0, 0L, 1, null))) {
                                                                break;
                                                            }
                                                            ((Request)bringIntoViewRequestPriorityQueue0.a.e0(bringIntoViewRequestPriorityQueue0.a.J() - 1)).a().resumeWith(S0.a);
                                                        }
                                                        if(this.e.i) {
                                                            Rect rect1 = this.e.D();
                                                            if(rect1 != null && ContentInViewModifier.I(this.e, rect1, 0L, 1, null)) {
                                                                this.e.i = false;
                                                            }
                                                        }
                                                        float f = this.e.x();
                                                        this.e.l.j(f);
                                                    }
                                                };
                                                this.k = 1;
                                                return this.m.l.h(contentInViewModifier$launchAnimation$1$1$10, contentInViewModifier$launchAnimation$1$1$20, this) == object1 ? object1 : S0.a;
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
                                this.k = 1;
                                if(androidx.compose.foundation.gestures.c.e(this.m.c, null, contentInViewModifier$launchAnimation$1$10, this, 1, null) == object1) {
                                    return object1;
                                label_11:
                                    f0.n(object0);
                                }
                                this.m.e.g();
                                goto label_22;
                            }
                            catch(CancellationException cancellationException1) {
                                cancellationException0 = cancellationException1;
                                throw cancellationException0;
                            }
                        }
                        catch(Throwable throwable0) {
                            break;
                        }
                    }
                    case 1: {
                        goto label_11;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                this.m.k = false;
                this.m.e.b(cancellationException0);
                this.m.i = false;
                throw throwable0;
            label_22:
                this.m.k = false;
                this.m.e.b(null);
                this.m.i = false;
                return S0.a;
            }
        };
        k.f(this.a, null, Q.d, contentInViewModifier$launchAnimation$10, 1, null);
    }

    @Override  // androidx.compose.ui.layout.OnRemeasuredModifier
    public void L(long v) {
        long v1 = this.j;
        this.j = v;
        if(this.y(v, v1) >= 0) {
            return;
        }
        Rect rect0 = this.D();
        if(rect0 != null) {
            if(!this.k && !this.i && this.G((this.h == null ? rect0 : this.h), v1) && !this.G(rect0, v)) {
                this.i = true;
                this.J();
            }
            this.h = rect0;
        }
    }

    private final float M(float f, float f1, float f2) {
        if((f < 0.0f || f1 > f2) && (f >= 0.0f || f1 <= f2)) {
            float f3 = f1 - f2;
            return Math.abs(f) < Math.abs(f3) ? f : f3;
        }
        return 0.0f;
    }

    private final long N(Rect rect0, long v) {
        long v1 = IntSizeKt.f(v);
        switch(WhenMappings.a[this.b.ordinal()]) {
            case 1: {
                return OffsetKt.a(0.0f, this.M(rect0.B(), rect0.j(), Size.m(v1)));
            }
            case 2: {
                return OffsetKt.a(this.M(rect0.t(), rect0.x(), Size.t(v1)), 0.0f);
            }
            default: {
                throw new J();
            }
        }
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object P(Object object0, A3.o o0) {
        return b.c(this, object0, o0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object U(Object object0, A3.o o0) {
        return b.d(this, object0, o0);
    }

    @Override  // androidx.compose.foundation.relocation.BringIntoViewResponder
    @m
    public Object a(@l a a0, @l d d0) {
        Object object0 = a0.invoke();
        if(((Rect)object0) != null && !ContentInViewModifier.I(this, ((Rect)object0), 0L, 1, null)) {
            p p0 = new p(kotlin.coroutines.intrinsics.b.e(d0), 1);
            p0.c0();
            if(this.e.c(new Request(a0, p0)) && !this.k) {
                this.J();
            }
            Object object1 = p0.x();
            if(object1 == kotlin.coroutines.intrinsics.b.l()) {
                h.c(d0);
            }
            return object1 == kotlin.coroutines.intrinsics.b.l() ? object1 : S0.a;
        }
        return S0.a;
    }

    @Override  // androidx.compose.foundation.relocation.BringIntoViewResponder
    @l
    public Rect b(@l Rect rect0) {
        L.p(rect0, "localRect");
        if(IntSize.h(this.j, 0L)) {
            throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return this.A(rect0, this.j);
    }

    @Override  // androidx.compose.ui.layout.OnPlacedModifier
    public void o(@l LayoutCoordinates layoutCoordinates0) {
        L.p(layoutCoordinates0, "coordinates");
        this.f = layoutCoordinates0;
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return androidx.compose.ui.a.a(this, modifier0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }

    private final float x() {
        if(IntSize.h(this.j, 0L)) {
            return 0.0f;
        }
        Rect rect0 = this.C();
        if(rect0 == null) {
            rect0 = this.i ? this.D() : null;
            if(rect0 == null) {
                return 0.0f;
            }
        }
        long v = IntSizeKt.f(this.j);
        switch(WhenMappings.a[this.b.ordinal()]) {
            case 1: {
                return this.M(rect0.B(), rect0.j(), Size.m(v));
            }
            case 2: {
                return this.M(rect0.t(), rect0.x(), Size.t(v));
            }
            default: {
                throw new J();
            }
        }
    }

    private final int y(long v, long v1) {
        switch(this.b) {
            case 1: {
                return L.t(((int)(v & 0xFFFFFFFFL)), ((int)(v1 & 0xFFFFFFFFL)));
            }
            case 2: {
                return L.t(((int)(v >> 0x20)), ((int)(v1 >> 0x20)));
            }
            default: {
                throw new J();
            }
        }
    }

    private final int z(long v, long v1) {
        switch(WhenMappings.a[this.b.ordinal()]) {
            case 1: {
                return Float.compare(Size.m(v), Size.m(v1));
            }
            case 2: {
                return Float.compare(Size.t(v), Size.t(v1));
            }
            default: {
                throw new J();
            }
        }
    }
}

