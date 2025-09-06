package androidx.compose.ui.text.font;

import A3.o;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.A1;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.M0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.u1;
import y4.l;
import y4.m;

@s0({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,427:1\n76#2:428\n102#2,2:429\n33#3,6:431\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n*L\n252#1:428\n252#1:429,2\n259#1:431,6\n*E\n"})
public final class AsyncFontListLoader implements State {
    @l
    private final List a;
    @l
    private final TypefaceRequest b;
    @l
    private final AsyncTypefaceCache c;
    @l
    private final Function1 d;
    @l
    private final PlatformFontLoader e;
    @l
    private final MutableState f;
    private boolean g;

    public AsyncFontListLoader(@l List list0, @l Object object0, @l TypefaceRequest typefaceRequest0, @l AsyncTypefaceCache asyncTypefaceCache0, @l Function1 function10, @l PlatformFontLoader platformFontLoader0) {
        L.p(list0, "fontList");
        L.p(object0, "initialType");
        L.p(typefaceRequest0, "typefaceRequest");
        L.p(asyncTypefaceCache0, "asyncTypefaceCache");
        L.p(function10, "onCompletion");
        L.p(platformFontLoader0, "platformFontLoader");
        super();
        this.a = list0;
        this.b = typefaceRequest0;
        this.c = asyncTypefaceCache0;
        this.d = function10;
        this.e = platformFontLoader0;
        this.f = SnapshotStateKt__SnapshotStateKt.g(object0, null, 2, null);
        this.g = true;
    }

    public final boolean d() {
        return this.g;
    }

    @m
    public final Object g(@l d d0) {
        List list2;
        Font font1;
        int v3;
        AsyncFontListLoader asyncFontListLoader1;
        int v2;
        AsyncFontListLoader asyncFontListLoader0;
        int v1;
        List list0;
        androidx.compose.ui.text.font.AsyncFontListLoader.load.1 asyncFontListLoader$load$10;
        if(d0 instanceof androidx.compose.ui.text.font.AsyncFontListLoader.load.1) {
            asyncFontListLoader$load$10 = (androidx.compose.ui.text.font.AsyncFontListLoader.load.1)d0;
            int v = asyncFontListLoader$load$10.r;
            if((v & 0x80000000) == 0) {
                asyncFontListLoader$load$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    Object m;
                    int n;
                    int o;
                    Object p;
                    int r;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.p = object0;
                        this.r |= 0x80000000;
                        return d0.g(this);
                    }
                };
            }
            else {
                asyncFontListLoader$load$10.r = v ^ 0x80000000;
            }
        }
        else {
            asyncFontListLoader$load$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                Object m;
                int n;
                int o;
                Object p;
                int r;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.p = object0;
                    this.r |= 0x80000000;
                    return d0.g(this);
                }
            };
        }
        Object object0 = asyncFontListLoader$load$10.p;
        Object object1 = b.l();
        switch(asyncFontListLoader$load$10.r) {
            case 0: {
                f0.n(object0);
                try {
                    list0 = this.a;
                    v1 = list0.size();
                    asyncFontListLoader0 = this;
                    v2 = 0;
                    goto label_48;
                }
                catch(Throwable throwable0) {
                    asyncFontListLoader1 = this;
                    goto label_82;
                }
            }
            case 1: {
                v1 = asyncFontListLoader$load$10.o;
                v3 = asyncFontListLoader$load$10.n;
                Font font0 = (Font)asyncFontListLoader$load$10.m;
                List list1 = (List)asyncFontListLoader$load$10.l;
                AsyncFontListLoader asyncFontListLoader2 = (AsyncFontListLoader)asyncFontListLoader$load$10.k;
                try {
                    f0.n(object0);
                    asyncFontListLoader0 = asyncFontListLoader2;
                    font1 = font0;
                    list2 = list1;
                    goto label_65;
                }
                catch(Throwable throwable0) {
                    asyncFontListLoader1 = asyncFontListLoader2;
                    goto label_82;
                }
            }
            case 2: {
                v1 = asyncFontListLoader$load$10.o;
                v3 = asyncFontListLoader$load$10.n;
                list2 = (List)asyncFontListLoader$load$10.l;
                asyncFontListLoader1 = (AsyncFontListLoader)asyncFontListLoader$load$10.k;
                try {
                    f0.n(object0);
                    break;
                }
                catch(Throwable throwable0) {
                }
                goto label_82;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            v2 = v3;
            list0 = list2;
            asyncFontListLoader0 = asyncFontListLoader1;
            while(true) {
                ++v2;
            label_48:
                if(v2 >= v1) {
                    break alab1;
                }
                try {
                    Font font2 = (Font)list0.get(v2);
                    if(!FontLoadingStrategy.g(font2.c(), 2)) {
                        continue;
                    }
                    androidx.compose.ui.text.font.AsyncFontListLoader.load.2.typeface.1 asyncFontListLoader$load$2$typeface$10 = new Function1(font2, null) {
                        int k;
                        final AsyncFontListLoader l;
                        final Font m;

                        {
                            this.l = asyncFontListLoader0;
                            this.m = font0;
                            super(1, d0);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@l d d0) {
                            return new androidx.compose.ui.text.font.AsyncFontListLoader.load.2.typeface.1(this.l, this.m, d0);
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            return this.invoke(((d)object0));
                        }

                        @m
                        public final Object invoke(@m d d0) {
                            return ((androidx.compose.ui.text.font.AsyncFontListLoader.load.2.typeface.1)this.create(d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            Object object1 = b.l();
                            switch(this.k) {
                                case 0: {
                                    f0.n(object0);
                                    this.k = 1;
                                    object0 = this.l.h(this.m, this);
                                    return object0 == object1 ? object1 : object0;
                                }
                                case 1: {
                                    f0.n(object0);
                                    return object0;
                                }
                                default: {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                            }
                        }
                    };
                    asyncFontListLoader$load$10.k = asyncFontListLoader0;
                    asyncFontListLoader$load$10.l = list0;
                    asyncFontListLoader$load$10.m = font2;
                    asyncFontListLoader$load$10.n = v2;
                    asyncFontListLoader$load$10.o = v1;
                    asyncFontListLoader$load$10.r = 1;
                    Object object2 = asyncFontListLoader0.c.g(font2, asyncFontListLoader0.e, false, asyncFontListLoader$load$2$typeface$10, asyncFontListLoader$load$10);
                    if(object2 == object1) {
                        return object1;
                    }
                    list2 = list0;
                    object0 = object2;
                    font1 = font2;
                    v3 = v2;
                label_65:
                    if(object0 != null) {
                        asyncFontListLoader0.setValue(FontSynthesis_androidKt.a(asyncFontListLoader0.b.j(), object0, font1, asyncFontListLoader0.b.k(), asyncFontListLoader0.b.i()));
                        break;
                    }
                    goto label_72;
                }
                catch(Throwable throwable0) {
                    goto label_81;
                }
            }
            boolean z = M0.E(asyncFontListLoader$load$10.getContext());
            asyncFontListLoader0.g = false;
            Immutable typefaceResult$Immutable0 = new Immutable(asyncFontListLoader0.getValue(), z);
            asyncFontListLoader0.d.invoke(typefaceResult$Immutable0);
            return S0.a;
            try {
            label_72:
                asyncFontListLoader$load$10.k = asyncFontListLoader0;
                asyncFontListLoader$load$10.l = list2;
                asyncFontListLoader$load$10.m = null;
                asyncFontListLoader$load$10.n = v3;
                asyncFontListLoader$load$10.o = v1;
                asyncFontListLoader$load$10.r = 2;
                if(A1.a(asyncFontListLoader$load$10) == object1) {
                    return object1;
                }
                goto label_88;
            }
            catch(Throwable throwable0) {
            label_81:
                asyncFontListLoader1 = asyncFontListLoader0;
            }
        label_82:
            boolean z1 = M0.E(asyncFontListLoader$load$10.getContext());
            asyncFontListLoader1.g = false;
            Immutable typefaceResult$Immutable1 = new Immutable(asyncFontListLoader1.getValue(), z1);
            asyncFontListLoader1.d.invoke(typefaceResult$Immutable1);
            throw throwable0;
        label_88:
            asyncFontListLoader1 = asyncFontListLoader0;
        }
        boolean z2 = M0.E(asyncFontListLoader$load$10.getContext());
        asyncFontListLoader0.g = false;
        Immutable typefaceResult$Immutable2 = new Immutable(asyncFontListLoader0.getValue(), z2);
        asyncFontListLoader0.d.invoke(typefaceResult$Immutable2);
        return S0.a;
    }

    @Override  // androidx.compose.runtime.State
    @l
    public Object getValue() {
        return this.f.getValue();
    }

    @m
    public final Object h(@l Font font0, @l d d0) {
        androidx.compose.ui.text.font.AsyncFontListLoader.loadWithTimeoutOrNull.1 asyncFontListLoader$loadWithTimeoutOrNull$10;
        if(d0 instanceof androidx.compose.ui.text.font.AsyncFontListLoader.loadWithTimeoutOrNull.1) {
            asyncFontListLoader$loadWithTimeoutOrNull$10 = (androidx.compose.ui.text.font.AsyncFontListLoader.loadWithTimeoutOrNull.1)d0;
            int v = asyncFontListLoader$loadWithTimeoutOrNull$10.n;
            if((v & 0x80000000) == 0) {
                asyncFontListLoader$loadWithTimeoutOrNull$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    int n;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.l = object0;
                        this.n |= 0x80000000;
                        return d0.h(null, this);
                    }
                };
            }
            else {
                asyncFontListLoader$loadWithTimeoutOrNull$10.n = v ^ 0x80000000;
            }
        }
        else {
            asyncFontListLoader$loadWithTimeoutOrNull$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                int n;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.l = object0;
                    this.n |= 0x80000000;
                    return d0.h(null, this);
                }
            };
        }
        Object object0 = asyncFontListLoader$loadWithTimeoutOrNull$10.l;
        Object object1 = b.l();
        switch(asyncFontListLoader$loadWithTimeoutOrNull$10.n) {
            case 0: {
                f0.n(object0);
                try {
                    androidx.compose.ui.text.font.AsyncFontListLoader.loadWithTimeoutOrNull.2 asyncFontListLoader$loadWithTimeoutOrNull$20 = new o(font0, null) {
                        int k;
                        final AsyncFontListLoader l;
                        final Font m;

                        {
                            this.l = asyncFontListLoader0;
                            this.m = font0;
                            super(2, d0);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            return new androidx.compose.ui.text.font.AsyncFontListLoader.loadWithTimeoutOrNull.2(this.l, this.m, d0);
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            return this.invoke(((O)object0), ((d)object1));
                        }

                        @m
                        public final Object invoke(@l O o0, @m d d0) {
                            return ((androidx.compose.ui.text.font.AsyncFontListLoader.loadWithTimeoutOrNull.2)this.create(o0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            Object object1 = b.l();
                            switch(this.k) {
                                case 0: {
                                    f0.n(object0);
                                    this.k = 1;
                                    object0 = this.l.e.b(this.m, this);
                                    return object0 == object1 ? object1 : object0;
                                }
                                case 1: {
                                    f0.n(object0);
                                    return object0;
                                }
                                default: {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                            }
                        }
                    };
                    asyncFontListLoader$loadWithTimeoutOrNull$10.k = font0;
                    asyncFontListLoader$loadWithTimeoutOrNull$10.n = 1;
                    object0 = u1.e(15000L, asyncFontListLoader$loadWithTimeoutOrNull$20, asyncFontListLoader$loadWithTimeoutOrNull$10);
                    return object0 == object1 ? object1 : object0;
                }
                catch(CancellationException cancellationException0) {
                    goto label_25;
                }
                catch(Exception exception0) {
                    goto label_28;
                }
                return object1;
            }
            case 1: {
                font0 = (Font)asyncFontListLoader$loadWithTimeoutOrNull$10.k;
                try {
                    f0.n(object0);
                    return object0;
                }
                catch(CancellationException cancellationException0) {
                label_25:
                    if(!M0.E(asyncFontListLoader$loadWithTimeoutOrNull$10.getContext())) {
                        throw cancellationException0;
                    }
                }
                catch(Exception exception0) {
                label_28:
                    CoroutineExceptionHandler coroutineExceptionHandler0 = (CoroutineExceptionHandler)asyncFontListLoader$loadWithTimeoutOrNull$10.getContext().get(CoroutineExceptionHandler.A8);
                    if(coroutineExceptionHandler0 != null) {
                        coroutineExceptionHandler0.handleException(asyncFontListLoader$loadWithTimeoutOrNull$10.getContext(), new IllegalStateException("Unable to load font " + font0, exception0));
                        return null;
                    }
                }
                return null;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final void j(boolean z) {
        this.g = z;
    }

    private void setValue(Object object0) {
        this.f.setValue(object0);
    }
}

