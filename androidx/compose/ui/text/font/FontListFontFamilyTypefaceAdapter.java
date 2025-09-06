package androidx.compose.ui.text.font;

import A3.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.f;
import kotlinx.coroutines.j1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.u1;
import y4.l;
import y4.m;

@s0({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,427:1\n35#2,3:428\n38#2,2:435\n40#2:438\n56#2,4:450\n60#2,3:458\n63#2:462\n33#3,4:431\n38#3:437\n151#3,3:439\n33#3,4:442\n154#3,2:446\n38#3:448\n156#3:449\n33#3,4:454\n38#3:461\n33#3,6:463\n49#4,4:469\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter\n*L\n68#1:428,3\n68#1:435,2\n68#1:438\n70#1:450,4\n70#1:458,3\n70#1:462\n68#1:431,4\n68#1:437\n69#1:439,3\n69#1:442,4\n69#1:446,2\n69#1:448\n69#1:449\n70#1:454,4\n70#1:461\n74#1:463,6\n155#1:469,4\n*E\n"})
public final class FontListFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final CoroutineExceptionHandler a() {
            return FontListFontFamilyTypefaceAdapter.e;
        }

        @l
        public final FontMatcher b() {
            return FontListFontFamilyTypefaceAdapter.d;
        }
    }

    @l
    private final AsyncTypefaceCache a;
    @l
    private O b;
    @l
    public static final Companion c;
    @l
    private static final FontMatcher d;
    @l
    private static final CoroutineExceptionHandler e;

    static {
        FontListFontFamilyTypefaceAdapter.c = new Companion(null);
        FontListFontFamilyTypefaceAdapter.d = new FontMatcher();
        FontListFontFamilyTypefaceAdapter.e = new FontListFontFamilyTypefaceAdapter.special..inlined.CoroutineExceptionHandler.1(CoroutineExceptionHandler.A8);
    }

    public FontListFontFamilyTypefaceAdapter() {
        this(null, null, 3, null);
    }

    public FontListFontFamilyTypefaceAdapter(@l AsyncTypefaceCache asyncTypefaceCache0, @l g g0) {
        L.p(asyncTypefaceCache0, "asyncTypefaceCache");
        L.p(g0, "injectedContext");
        super();
        this.a = asyncTypefaceCache0;
        this.b = P.a(FontListFontFamilyTypefaceAdapter.e.plus(g0).plus(j1.a(((I0)g0.get(I0.B8)))));
    }

    public FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache0, g g0, int v, w w0) {
        if((v & 1) != 0) {
            asyncTypefaceCache0 = new AsyncTypefaceCache();
        }
        if((v & 2) != 0) {
            g0 = i.a;
        }
        this(asyncTypefaceCache0, g0);
    }

    @Override  // androidx.compose.ui.text.font.FontFamilyTypefaceAdapter
    @m
    public TypefaceResult a(@l TypefaceRequest typefaceRequest0, @l PlatformFontLoader platformFontLoader0, @l Function1 function10, @l Function1 function11) {
        L.p(typefaceRequest0, "typefaceRequest");
        L.p(platformFontLoader0, "platformFontLoader");
        L.p(function10, "onAsyncCompletion");
        L.p(function11, "createDefaultTypeface");
        if(!(typefaceRequest0.h() instanceof FontListFontFamily)) {
            return null;
        }
        List list0 = ((FontListFontFamily)typefaceRequest0.h()).o();
        V v0 = FontListFontFamilyTypefaceAdapterKt.b(FontListFontFamilyTypefaceAdapter.d.e(list0, typefaceRequest0.k(), typefaceRequest0.i()), typefaceRequest0, this.a, platformFontLoader0, function11);
        List list1 = (List)v0.a();
        Object object0 = v0.b();
        if(list1 == null) {
            return new Immutable(object0, false, 2, null);
        }
        AsyncFontListLoader asyncFontListLoader0 = new AsyncFontListLoader(list1, object0, typefaceRequest0, this.a, function10, platformFontLoader0);
        O o0 = this.b;
        androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.resolve.1 fontListFontFamilyTypefaceAdapter$resolve$10 = new o(null) {
            int k;
            final AsyncFontListLoader l;

            {
                this.l = asyncFontListLoader0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.resolve.1(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.resolve.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        return this.l.g(this) == object1 ? object1 : S0.a;
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
        k.f(o0, null, Q.d, fontListFontFamilyTypefaceAdapter$resolve$10, 1, null);
        return new Async(asyncFontListLoader0);
    }

    @m
    public final Object e(@l FontFamily fontFamily0, @l PlatformFontLoader platformFontLoader0, @l d d0) {
        if(!(fontFamily0 instanceof FontListFontFamily)) {
            return S0.a;
        }
        List list0 = ((FontListFontFamily)fontFamily0).o();
        List list1 = ((FontListFontFamily)fontFamily0).o();
        ArrayList arrayList0 = new ArrayList(list1.size());
        int v = list1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = list1.get(v1);
            if(FontLoadingStrategy.g(((Font)object0).c(), 2)) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(arrayList0.size());
        int v2 = arrayList0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            Font font0 = (Font)arrayList0.get(v3);
            arrayList1.add(r0.a(font0.b(), FontStyle.c(font0.d())));
        }
        HashSet hashSet0 = new HashSet(arrayList1.size());
        ArrayList arrayList2 = new ArrayList(arrayList1.size());
        int v4 = arrayList1.size();
        for(int v5 = 0; v5 < v4; ++v5) {
            Object object1 = arrayList1.get(v5);
            if(hashSet0.add(((V)object1))) {
                arrayList2.add(object1);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int v6 = arrayList2.size();
        for(int v7 = 0; v7 < v6; ++v7) {
            V v8 = (V)arrayList2.get(v7);
            Object object2 = v8.a();
            int v9 = ((FontStyle)v8.b()).j();
            List list2 = (List)FontListFontFamilyTypefaceAdapterKt.b(FontListFontFamilyTypefaceAdapter.d.e(list0, ((FontWeight)object2), v9), new TypefaceRequest(fontFamily0, ((FontWeight)object2), v9, 1, platformFontLoader0.a(), null), this.a, platformFontLoader0, androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.preload.2.1.e).a();
            if(list2 != null) {
                arrayList3.add(u.B2(list2));
            }
        }
        Object object3 = P.g(new o(this, platformFontLoader0, null) {
            int k;
            private Object l;
            final List m;
            final FontListFontFamilyTypefaceAdapter n;
            final PlatformFontLoader o;

            {
                this.m = list0;
                this.n = fontListFontFamilyTypefaceAdapter0;
                this.o = platformFontLoader0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.preload.3(this.m, this.n, this.o, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.preload.3)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.l;
                        List list0 = this.m;
                        HashSet hashSet0 = new HashSet(list0.size());
                        ArrayList arrayList0 = new ArrayList(list0.size());
                        int v = list0.size();
                        for(int v1 = 0; v1 < v; ++v1) {
                            Object object2 = list0.get(v1);
                            if(hashSet0.add(((Font)object2))) {
                                arrayList0.add(object2);
                            }
                        }
                        FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter0 = this.n;
                        PlatformFontLoader platformFontLoader0 = this.o;
                        ArrayList arrayList1 = new ArrayList(arrayList0.size());
                        int v2 = arrayList0.size();
                        for(int v3 = 0; v3 < v2; ++v3) {
                            arrayList1.add(k.b(o0, null, null, new o(((Font)arrayList0.get(v3)), platformFontLoader0, null) {
                                int k;
                                final FontListFontFamilyTypefaceAdapter l;
                                final Font m;
                                final PlatformFontLoader n;

                                {
                                    this.l = fontListFontFamilyTypefaceAdapter0;
                                    this.m = font0;
                                    this.n = platformFontLoader0;
                                    super(2, d0);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @l
                                public final d create(@m Object object0, @l d d0) {
                                    return new androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.preload.3.2.1(this.l, this.m, this.n, d0);
                                }

                                @Override  // A3.o
                                public Object invoke(Object object0, Object object1) {
                                    return this.invoke(((O)object0), ((d)object1));
                                }

                                @m
                                public final Object invoke(@l O o0, @m d d0) {
                                    return ((androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.preload.3.2.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @m
                                public final Object invokeSuspend(@l Object object0) {
                                    Object object1 = b.l();
                                    switch(this.k) {
                                        case 0: {
                                            f0.n(object0);
                                            androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.preload.3.2.1.1 fontListFontFamilyTypefaceAdapter$preload$3$2$1$10 = new Function1(this.n, null) {
                                                int k;
                                                final Font l;
                                                final PlatformFontLoader m;

                                                {
                                                    this.l = font0;
                                                    this.m = platformFontLoader0;
                                                    super(1, d0);
                                                }

                                                @Override  // kotlin.coroutines.jvm.internal.a
                                                @l
                                                public final d create(@l d d0) {
                                                    return new androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.preload.3.2.1.1(this.l, this.m, d0);
                                                }

                                                @Override  // kotlin.jvm.functions.Function1
                                                public Object invoke(Object object0) {
                                                    return this.invoke(((d)object0));
                                                }

                                                @m
                                                public final Object invoke(@m d d0) {
                                                    return ((androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.preload.3.2.1.1)this.create(d0)).invokeSuspend(S0.a);
                                                }

                                                @Override  // kotlin.coroutines.jvm.internal.a
                                                @m
                                                public final Object invokeSuspend(@l Object object0) {
                                                    Object object1 = b.l();
                                                    switch(this.k) {
                                                        case 0: {
                                                            f0.n(object0);
                                                            try {
                                                                androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.preload.3.2.1.1.1 fontListFontFamilyTypefaceAdapter$preload$3$2$1$1$10 = new o(this.l, null) {
                                                                    int k;
                                                                    final PlatformFontLoader l;
                                                                    final Font m;

                                                                    {
                                                                        this.l = platformFontLoader0;
                                                                        this.m = font0;
                                                                        super(2, d0);
                                                                    }

                                                                    @Override  // kotlin.coroutines.jvm.internal.a
                                                                    @l
                                                                    public final d create(@m Object object0, @l d d0) {
                                                                        return new androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.preload.3.2.1.1.1(this.l, this.m, d0);
                                                                    }

                                                                    @Override  // A3.o
                                                                    public Object invoke(Object object0, Object object1) {
                                                                        return this.invoke(((O)object0), ((d)object1));
                                                                    }

                                                                    @m
                                                                    public final Object invoke(@l O o0, @m d d0) {
                                                                        return ((androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.preload.3.2.1.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                                                    }

                                                                    @Override  // kotlin.coroutines.jvm.internal.a
                                                                    @m
                                                                    public final Object invokeSuspend(@l Object object0) {
                                                                        Object object1 = b.l();
                                                                        switch(this.k) {
                                                                            case 0: {
                                                                                f0.n(object0);
                                                                                this.k = 1;
                                                                                object0 = this.l.b(this.m, this);
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
                                                                this.k = 1;
                                                                object0 = u1.c(15000L, fontListFontFamilyTypefaceAdapter$preload$3$2$1$1$10, this);
                                                                if(object0 == object1) {
                                                                    return object1;
                                                                label_9:
                                                                    f0.n(object0);
                                                                }
                                                                break;
                                                            }
                                                            catch(Exception exception0) {
                                                                throw new IllegalStateException("Unable to load font " + this.l, exception0);
                                                            }
                                                        }
                                                        case 1: {
                                                            goto label_9;
                                                        }
                                                        default: {
                                                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                        }
                                                    }
                                                    if(object0 == null) {
                                                        throw new IllegalStateException("Unable to load font " + this.l);
                                                    }
                                                    return object0;
                                                }
                                            };
                                            this.k = 1;
                                            object0 = this.l.a.g(this.m, this.n, true, fontListFontFamilyTypefaceAdapter$preload$3$2$1$10, this);
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
                            }, 3, null));
                        }
                        this.k = 1;
                        return f.c(arrayList1, this) == object1 ? object1 : S0.a;
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
        }, d0);
        return object3 == b.l() ? object3 : S0.a;

        final class androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.preload.2.1 extends N implements Function1 {
            public static final androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.preload.2.1 e;

            static {
                androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.preload.2.1.e = new androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.preload.2.1();
            }

            androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.preload.2.1() {
                super(1);
            }

            public final void a(@l TypefaceRequest typefaceRequest0) {
                L.p(typefaceRequest0, "it");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((TypefaceRequest)object0));
                return S0.a;
            }
        }

    }
}

