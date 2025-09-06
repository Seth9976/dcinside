package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.DpRect;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.f;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.I0.a;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.o;
import kotlinx.coroutines.p;
import y4.l;
import y4.m;

@s0({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilter\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 TempListUtils.kt\nandroidx/compose/ui/TempListUtilsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,643:1\n432#1:674\n433#1:676\n435#1,4:678\n440#1:693\n443#1,3:705\n1182#2:644\n1161#2,2:645\n1182#2:647\n1161#2,2:648\n34#3:650\n34#3:675\n34#3:747\n146#4:651\n460#4,11:652\n492#4,11:663\n146#4:677\n460#4,11:682\n492#4,11:694\n728#4,2:748\n86#5,2:708\n33#5,6:710\n88#5:716\n86#5,2:717\n33#5,6:719\n88#5:725\n33#5,4:729\n38#5:736\n135#6,3:726\n138#6:733\n139#6:735\n140#6:737\n1#7:734\n314#8,9:738\n323#8,2:750\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilter\n*L\n455#1:674\n455#1:676\n455#1:678,4\n455#1:693\n455#1:705,3\n376#1:644\n376#1:645,2\n384#1:647\n384#1:648,2\n432#1:650\n455#1:675\n515#1:747\n433#1:651\n438#1:652,11\n440#1:663,11\n455#1:677\n455#1:682,11\n455#1:694,11\n516#1:748,2\n472#1:708,2\n472#1:710,6\n472#1:716\n483#1:717,2\n483#1:719,6\n483#1:725\n486#1:729,4\n486#1:736\n486#1:726,3\n486#1:733\n486#1:735\n486#1:737\n486#1:734\n513#1:738,9\n513#1:750,2\n*E\n"})
public final class SuspendingPointerInputFilter extends PointerInputFilter implements PointerInputModifier, PointerInputScope, Density {
    @s0({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilter$PointerEventHandlerCoroutine\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,643:1\n34#2:644\n735#3,2:645\n314#4,11:647\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilter$PointerEventHandlerCoroutine\n*L\n582#1:644\n583#1:645,2\n590#1:647,11\n*E\n"})
    final class PointerEventHandlerCoroutine implements AwaitPointerEventScope, Density, d {
        @l
        private final d a;
        private final SuspendingPointerInputFilter b;
        @m
        private o c;
        @l
        private PointerEventPass d;
        @l
        private final g e;
        final SuspendingPointerInputFilter f;

        public PointerEventHandlerCoroutine(@l d d0) {
            L.p(d0, "completion");
            this.f = suspendingPointerInputFilter0;
            super();
            this.a = d0;
            this.b = suspendingPointerInputFilter0;
            this.d = PointerEventPass.b;
            this.e = i.a;
        }

        @Override  // androidx.compose.ui.unit.Density
        @Stable
        public float C(int v) {
            return this.b.C(v);
        }

        @Override  // androidx.compose.ui.unit.Density
        @Stable
        public float D(float f) {
            return this.b.D(f);
        }

        @Override  // androidx.compose.ui.unit.Density
        @Stable
        public int E1(long v) {
            return this.b.E1(v);
        }

        @Override  // androidx.compose.ui.unit.Density
        @Stable
        @l
        public Rect H0(@l DpRect dpRect0) {
            L.p(dpRect0, "<this>");
            return this.b.H0(dpRect0);
        }

        @Override  // androidx.compose.ui.unit.Density
        @Stable
        public long J(long v) {
            return this.b.J(v);
        }

        @Override  // androidx.compose.ui.unit.Density
        @Stable
        public long M(float f) {
            return this.b.M(f);
        }

        @Override  // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @m
        public Object N0(long v, @l A3.o o0, @l d d0) {
            androidx.compose.ui.input.pointer.SuspendingPointerInputFilter.PointerEventHandlerCoroutine.withTimeoutOrNull.1 suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$10;
            if(d0 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputFilter.PointerEventHandlerCoroutine.withTimeoutOrNull.1) {
                suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$10 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter.PointerEventHandlerCoroutine.withTimeoutOrNull.1)d0;
                int v1 = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$10.m;
                if((v1 & 0x80000000) == 0) {
                    suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                        Object k;
                        int m;

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            this.k = object0;
                            this.m |= 0x80000000;
                            return d0.N0(0L, null, this);
                        }
                    };
                }
                else {
                    suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$10.m = v1 ^ 0x80000000;
                }
            }
            else {
                suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    int m;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.k = object0;
                        this.m |= 0x80000000;
                        return d0.N0(0L, null, this);
                    }
                };
            }
            Object object0 = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$10.k;
            Object object1 = b.l();
            switch(suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$10.m) {
                case 0: {
                    f0.n(object0);
                    try {
                        suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$10.m = 1;
                        object0 = this.k0(v, o0, suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$10);
                        return object0 == object1 ? object1 : object0;
                    label_19:
                        f0.n(object0);
                        return object0;
                    }
                    catch(PointerEventTimeoutCancellationException unused_ex) {
                        return null;
                    }
                }
                case 1: {
                    goto label_19;
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
        }

        @Override  // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public long S() {
            return this.f.S();
        }

        @Override  // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public long a() {
            return this.f.j;
        }

        @Override  // androidx.compose.ui.unit.Density
        @Stable
        public int b1(float f) {
            return this.b.b1(f);
        }

        @Override  // androidx.compose.ui.unit.Density
        @Stable
        public float g1(long v) {
            return this.b.g1(v);
        }

        @Override  // kotlin.coroutines.d
        @l
        public g getContext() {
            return this.e;
        }

        @Override  // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.b.getDensity();
        }

        @Override  // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @l
        public ViewConfiguration getViewConfiguration() {
            return this.f.getViewConfiguration();
        }

        public final void h(@m Throwable throwable0) {
            o o0 = this.c;
            if(o0 != null) {
                o0.c(throwable0);
            }
            this.c = null;
        }

        @Override  // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @m
        public Object k0(long v, @l A3.o o0, @l d d0) {
            I0 i00;
            androidx.compose.ui.input.pointer.SuspendingPointerInputFilter.PointerEventHandlerCoroutine.withTimeout.1 suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$10;
            if(d0 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputFilter.PointerEventHandlerCoroutine.withTimeout.1) {
                suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$10 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter.PointerEventHandlerCoroutine.withTimeout.1)d0;
                int v1 = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$10.n;
                if((v1 & 0x80000000) == 0) {
                    suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                        Object k;
                        Object l;
                        int n;

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            this.l = object0;
                            this.n |= 0x80000000;
                            return d0.k0(0L, null, this);
                        }
                    };
                }
                else {
                    suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$10.n = v1 ^ 0x80000000;
                }
            }
            else {
                suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    int n;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.l = object0;
                        this.n |= 0x80000000;
                        return d0.k0(0L, null, this);
                    }
                };
            }
            Object object0 = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$10.l;
            Object object1 = b.l();
            switch(suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$10.n) {
                case 0: {
                    f0.n(object0);
                    if(v <= 0L) {
                        o o1 = this.c;
                        if(o1 != null) {
                            o1.resumeWith(e0.b(f0.a(new PointerEventTimeoutCancellationException(v))));
                        }
                    }
                    i00 = k.f(this.f.T0(), null, null, new A3.o(this, null) {
                        int k;
                        final long l;
                        final PointerEventHandlerCoroutine m;

                        {
                            this.l = v;
                            this.m = suspendingPointerInputFilter$PointerEventHandlerCoroutine0;
                            super(2, d0);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            return new androidx.compose.ui.input.pointer.SuspendingPointerInputFilter.PointerEventHandlerCoroutine.withTimeout.job.1(this.l, this.m, d0);
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            return this.invoke(((O)object0), ((d)object1));
                        }

                        @m
                        public final Object invoke(@l O o0, @m d d0) {
                            return ((androidx.compose.ui.input.pointer.SuspendingPointerInputFilter.PointerEventHandlerCoroutine.withTimeout.job.1)this.create(o0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            Object object1 = b.l();
                            switch(this.k) {
                                case 0: {
                                    f0.n(object0);
                                    this.k = 1;
                                    if(a0.b(this.l - 1L, this) == object1) {
                                        return object1;
                                    }
                                    goto label_8;
                                }
                                case 1: {
                                    f0.n(object0);
                                label_8:
                                    this.k = 2;
                                    if(a0.b(1L, this) == object1) {
                                        return object1;
                                    }
                                    break;
                                }
                                case 2: {
                                    f0.n(object0);
                                    break;
                                }
                                default: {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                            }
                            o o0 = this.m.c;
                            if(o0 != null) {
                                o0.resumeWith(e0.b(f0.a(new PointerEventTimeoutCancellationException(this.l))));
                            }
                            return S0.a;
                        }
                    }, 3, null);
                    try {
                        suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$10.k = i00;
                        suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$10.n = 1;
                        object0 = o0.invoke(this, suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$10);
                        if(object0 == object1) {
                            return object1;
                        }
                        break;
                    }
                    catch(Throwable throwable0) {
                        a.b(i00, null, 1, null);
                        throw throwable0;
                    }
                }
                case 1: {
                    i00 = (I0)suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$10.k;
                    try {
                        f0.n(object0);
                        break;
                    }
                    catch(Throwable throwable0) {
                        a.b(i00, null, 1, null);
                        throw throwable0;
                    }
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
            a.b(i00, null, 1, null);
            return object0;
        }

        @Override  // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @m
        public Object l1(@l PointerEventPass pointerEventPass0, @l d d0) {
            p p0 = new p(b.e(d0), 1);
            p0.c0();
            this.d = pointerEventPass0;
            this.c = p0;
            Object object0 = p0.x();
            if(object0 == b.l()) {
                h.c(d0);
            }
            return object0;
        }

        @Override  // androidx.compose.ui.unit.Density
        @Stable
        public long m(long v) {
            return this.b.m(v);
        }

        @Override  // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @l
        public PointerEvent m1() {
            return this.f.f;
        }

        public final void o(@l PointerEvent pointerEvent0, @l PointerEventPass pointerEventPass0) {
            L.p(pointerEvent0, "event");
            L.p(pointerEventPass0, "pass");
            if(pointerEventPass0 == this.d) {
                o o0 = this.c;
                if(o0 != null) {
                    this.c = null;
                    o0.resumeWith(pointerEvent0);
                }
            }
        }

        @Override  // androidx.compose.ui.unit.Density
        @Stable
        public float p(long v) {
            return this.b.p(v);
        }

        @Override  // androidx.compose.ui.unit.Density
        @Stable
        public long r(int v) {
            return this.b.r(v);
        }

        @Override  // kotlin.coroutines.d
        public void resumeWith(@l Object object0) {
            synchronized(this.f.g) {
                this.f.g.a0(this);
            }
            this.a.resumeWith(object0);
        }

        @Override  // androidx.compose.ui.unit.Density
        @Stable
        public long s(float f) {
            return this.b.s(f);
        }

        @Override  // androidx.compose.ui.unit.Density
        public float w1() {
            return this.b.w1();
        }

        @Override  // androidx.compose.ui.unit.Density
        @Stable
        public float y1(float f) {
            return this.b.y1(f);
        }
    }

    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[PointerEventPass.values().length];
            try {
                arr_v[PointerEventPass.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[PointerEventPass.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[PointerEventPass.b.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    @l
    private final ViewConfiguration d;
    private final Density e;
    @l
    private PointerEvent f;
    @l
    private final MutableVector g;
    @l
    private final MutableVector h;
    @m
    private PointerEvent i;
    private long j;
    @l
    private O k;
    private boolean l;

    public SuspendingPointerInputFilter(@l ViewConfiguration viewConfiguration0, @l Density density0) {
        L.p(viewConfiguration0, "viewConfiguration");
        L.p(density0, "density");
        super();
        this.d = viewConfiguration0;
        this.e = density0;
        this.f = SuspendingPointerInputFilterKt.b;
        this.g = new MutableVector(new PointerEventHandlerCoroutine[16], 0);
        this.h = new MutableVector(new PointerEventHandlerCoroutine[16], 0);
        this.j = 0L;
        this.k = () -> i.a;
    }

    public SuspendingPointerInputFilter(ViewConfiguration viewConfiguration0, Density density0, int v, w w0) {
        if((v & 2) != 0) {
            density0 = DensityKt.b(1.0f, 0.0f, 2, null);
        }
        this(viewConfiguration0, density0);
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputFilter, androidx.compose.ui.input.pointer.PointerInputScope
    public boolean A1() {
        return this.l;
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float C(int v) {
        return this.e.C(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float D(float f) {
        return this.e.D(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public int E1(long v) {
        return this.e.E1(v);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean H(Function1 function10) {
        return androidx.compose.ui.b.b(this, function10);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    @l
    public Rect H0(@l DpRect dpRect0) {
        L.p(dpRect0, "<this>");
        return this.e.H0(dpRect0);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long J(long v) {
        return this.e.J(v);
    }

    private final void L0(PointerEvent pointerEvent0, PointerEventPass pointerEventPass0) {
        synchronized(this.g) {
            this.h.c(this.h.J(), this.g);
        }
        try {
            switch(pointerEventPass0) {
                case 1: 
                case 2: {
                    MutableVector mutableVector0 = this.h;
                    int v2 = mutableVector0.J();
                    if(v2 > 0) {
                        Object[] arr_object = mutableVector0.F();
                        int v3 = 0;
                        do {
                            ((PointerEventHandlerCoroutine)arr_object[v3]).o(pointerEvent0, pointerEventPass0);
                            ++v3;
                        }
                        while(v3 < v2);
                    }
                    break;
                }
                case 3: {
                    MutableVector mutableVector1 = this.h;
                    int v4 = mutableVector1.J();
                    if(v4 > 0) {
                        int v5 = v4 - 1;
                        Object[] arr_object1 = mutableVector1.F();
                        while(true) {
                            ((PointerEventHandlerCoroutine)arr_object1[v5]).o(pointerEvent0, pointerEventPass0);
                            --v5;
                            if(v5 < 0) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        finally {
            this.h.l();
        }
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long M(float f) {
        return this.e.M(f);
    }

    private final void O0(PointerEventPass pointerEventPass0, Function1 function10) {
        synchronized(this.g) {
            this.h.c(this.h.J(), this.g);
        }
        try {
            switch(pointerEventPass0) {
                case 1: 
                case 2: {
                    MutableVector mutableVector0 = this.h;
                    int v2 = mutableVector0.J();
                    if(v2 > 0) {
                        Object[] arr_object = mutableVector0.F();
                        int v3 = 0;
                        do {
                            function10.invoke(arr_object[v3]);
                            ++v3;
                        }
                        while(v3 < v2);
                    }
                    break;
                }
                case 3: {
                    MutableVector mutableVector1 = this.h;
                    int v4 = mutableVector1.J();
                    if(v4 > 0) {
                        int v5 = v4 - 1;
                        Object[] arr_object1 = mutableVector1.F();
                        while(true) {
                            function10.invoke(arr_object1[v5]);
                            --v5;
                            if(v5 < 0) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        finally {
            this.h.l();
        }
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object P(Object object0, A3.o o0) {
        return androidx.compose.ui.b.c(this, object0, o0);
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputScope
    @m
    public Object R0(@l A3.o o0, @l d d0) {
        p p0 = new p(b.e(d0), 1);
        p0.c0();
        PointerEventHandlerCoroutine suspendingPointerInputFilter$PointerEventHandlerCoroutine0 = new PointerEventHandlerCoroutine(this, p0);
        synchronized(this.g) {
            this.g.b(suspendingPointerInputFilter$PointerEventHandlerCoroutine0);
            f.b(o0, suspendingPointerInputFilter$PointerEventHandlerCoroutine0, suspendingPointerInputFilter$PointerEventHandlerCoroutine0).resumeWith(S0.a);
        }
        p0.K(new Function1() {
            final PointerEventHandlerCoroutine e;

            {
                this.e = suspendingPointerInputFilter$PointerEventHandlerCoroutine0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@m Throwable throwable0) {
                this.e.h(throwable0);
            }
        });
        Object object0 = p0.x();
        if(object0 == b.l()) {
            h.c(d0);
        }
        return object0;
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputScope
    public long S() {
        long v = this.J(this.getViewConfiguration().e());
        long v1 = this.a();
        return SizeKt.a(Math.max(0.0f, Size.t(v) - ((float)(((int)(v1 >> 0x20))))) / 2.0f, Math.max(0.0f, Size.m(v) - ((float)(((int)(v1 & 0xFFFFFFFFL))))) / 2.0f);
    }

    @l
    public final O T0() {
        return this.k;
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object U(Object object0, A3.o o0) {
        return androidx.compose.ui.b.d(this, object0, o0);
    }

    public static void U0() {
    }

    public final void W0(@l O o0) {
        L.p(o0, "<set-?>");
        this.k = o0;
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public int b1(float f) {
        return this.e.b1(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float g1(long v) {
        return this.e.g1(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.e.getDensity();
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputScope
    @l
    public ViewConfiguration getViewConfiguration() {
        return this.d;
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputFilter
    public void j0() {
        PointerEvent pointerEvent0 = this.i;
        if(pointerEvent0 == null) {
            return;
        }
        List list0 = pointerEvent0.e();
        int v = list0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            if(((PointerInputChange)list0.get(v2)).r()) {
                List list1 = pointerEvent0.e();
                ArrayList arrayList0 = new ArrayList(list1.size());
                int v3 = list1.size();
                for(int v1 = 0; v1 < v3; ++v1) {
                    PointerInputChange pointerInputChange0 = (PointerInputChange)list1.get(v1);
                    arrayList0.add(new PointerInputChange(pointerInputChange0.p(), pointerInputChange0.z(), pointerInputChange0.q(), false, pointerInputChange0.s(), pointerInputChange0.z(), pointerInputChange0.q(), pointerInputChange0.r(), pointerInputChange0.r(), 0, 0L, 0x600, null));
                }
                PointerEvent pointerEvent1 = new PointerEvent(arrayList0);
                this.f = pointerEvent1;
                this.L0(pointerEvent1, PointerEventPass.a);
                this.L0(pointerEvent1, PointerEventPass.b);
                this.L0(pointerEvent1, PointerEventPass.c);
                this.i = null;
                return;
            }
        }
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputScope
    public void j1(boolean z) {
        this.l = z;
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long m(long v) {
        return this.e.m(v);
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputFilter
    public void m0(@l PointerEvent pointerEvent0, @l PointerEventPass pointerEventPass0, long v) {
        L.p(pointerEvent0, "pointerEvent");
        L.p(pointerEventPass0, "pass");
        this.j = v;
        if(pointerEventPass0 == PointerEventPass.a) {
            this.f = pointerEvent0;
        }
        this.L0(pointerEvent0, pointerEventPass0);
        List list0 = pointerEvent0.e();
        int v1 = list0.size();
        boolean z = false;
        for(int v2 = 0; true; ++v2) {
            if(v2 >= v1) {
                z = true;
                break;
            }
            if(!PointerEventKt.e(((PointerInputChange)list0.get(v2)))) {
                break;
            }
        }
        if(z) {
            pointerEvent0 = null;
        }
        this.i = pointerEvent0;
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float p(long v) {
        return this.e.p(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long r(int v) {
        return this.e.r(v);
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return androidx.compose.ui.a.a(this, modifier0);
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public long s(float f) {
        return this.e.s(f);
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputModifier
    @l
    public PointerInputFilter t1() {
        return this;
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return androidx.compose.ui.b.a(this, function10);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float w1() {
        return this.e.w1();
    }

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    public float y1(float f) {
        return this.e.y1(f);
    }
}

