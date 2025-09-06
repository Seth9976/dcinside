package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/FontFamilyResolverImpl\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,248:1\n151#2,3:249\n33#2,4:252\n154#2,2:256\n38#2:258\n156#2:259\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/FontFamilyResolverImpl\n*L\n47#1:249,3\n47#1:252,4\n47#1:256,2\n47#1:258\n47#1:259\n*E\n"})
public final class FontFamilyResolverImpl implements Resolver {
    @l
    private final PlatformFontLoader a;
    @l
    private final PlatformResolveInterceptor b;
    @l
    private final TypefaceRequestCache c;
    @l
    private final FontListFontFamilyTypefaceAdapter d;
    @l
    private final PlatformFontFamilyTypefaceAdapter e;
    @l
    private final Function1 f;

    public FontFamilyResolverImpl(@l PlatformFontLoader platformFontLoader0, @l PlatformResolveInterceptor platformResolveInterceptor0, @l TypefaceRequestCache typefaceRequestCache0, @l FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter0, @l PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter0) {
        L.p(platformFontLoader0, "platformFontLoader");
        L.p(platformResolveInterceptor0, "platformResolveInterceptor");
        L.p(typefaceRequestCache0, "typefaceRequestCache");
        L.p(fontListFontFamilyTypefaceAdapter0, "fontListFontFamilyTypefaceAdapter");
        L.p(platformFontFamilyTypefaceAdapter0, "platformFamilyTypefaceAdapter");
        super();
        this.a = platformFontLoader0;
        this.b = platformResolveInterceptor0;
        this.c = typefaceRequestCache0;
        this.d = fontListFontFamilyTypefaceAdapter0;
        this.e = platformFontFamilyTypefaceAdapter0;
        this.f = new Function1() {
            final FontFamilyResolverImpl e;

            {
                this.e = fontFamilyResolverImpl0;
                super(1);
            }

            @l
            public final Object a(@l TypefaceRequest typefaceRequest0) {
                L.p(typefaceRequest0, "it");
                TypefaceRequest typefaceRequest1 = TypefaceRequest.g(typefaceRequest0, null, null, 0, 0, null, 30, null);
                return this.e.h(typefaceRequest1).getValue();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((TypefaceRequest)object0));
            }
        };
    }

    public FontFamilyResolverImpl(PlatformFontLoader platformFontLoader0, PlatformResolveInterceptor platformResolveInterceptor0, TypefaceRequestCache typefaceRequestCache0, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter0, PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter0, int v, w w0) {
        if((v & 2) != 0) {
            platformResolveInterceptor0 = PlatformResolveInterceptor.a.a();
        }
        if((v & 4) != 0) {
            typefaceRequestCache0 = FontFamilyResolverKt.b();
        }
        if((v & 8) != 0) {
            fontListFontFamilyTypefaceAdapter0 = new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.a(), null, 2, null);
        }
        if((v & 16) != 0) {
            platformFontFamilyTypefaceAdapter0 = new PlatformFontFamilyTypefaceAdapter();
        }
        this(platformFontLoader0, platformResolveInterceptor0, typefaceRequestCache0, fontListFontFamilyTypefaceAdapter0, platformFontFamilyTypefaceAdapter0);
    }

    @Override  // androidx.compose.ui.text.font.FontFamily$Resolver
    @m
    public Object a(@l FontFamily fontFamily0, @l d d0) {
        FontFamilyResolverImpl fontFamilyResolverImpl0;
        androidx.compose.ui.text.font.FontFamilyResolverImpl.preload.1 fontFamilyResolverImpl$preload$10;
        if(d0 instanceof androidx.compose.ui.text.font.FontFamilyResolverImpl.preload.1) {
            fontFamilyResolverImpl$preload$10 = (androidx.compose.ui.text.font.FontFamilyResolverImpl.preload.1)d0;
            int v = fontFamilyResolverImpl$preload$10.o;
            if((v & 0x80000000) == 0) {
                fontFamilyResolverImpl$preload$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    Object m;
                    int o;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.m = object0;
                        this.o |= 0x80000000;
                        return d0.a(null, this);
                    }
                };
            }
            else {
                fontFamilyResolverImpl$preload$10.o = v ^ 0x80000000;
            }
        }
        else {
            fontFamilyResolverImpl$preload$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                Object m;
                int o;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.m = object0;
                    this.o |= 0x80000000;
                    return d0.a(null, this);
                }
            };
        }
        Object object0 = fontFamilyResolverImpl$preload$10.m;
        Object object1 = b.l();
        switch(fontFamilyResolverImpl$preload$10.o) {
            case 0: {
                f0.n(object0);
                if(!(fontFamily0 instanceof FontListFontFamily)) {
                    return S0.a;
                }
                fontFamilyResolverImpl$preload$10.k = this;
                fontFamilyResolverImpl$preload$10.l = fontFamily0;
                fontFamilyResolverImpl$preload$10.o = 1;
                if(this.d.e(fontFamily0, this.a, fontFamilyResolverImpl$preload$10) == object1) {
                    return object1;
                }
                fontFamilyResolverImpl0 = this;
                break;
            }
            case 1: {
                fontFamily0 = (FontFamily)fontFamilyResolverImpl$preload$10.l;
                fontFamilyResolverImpl0 = (FontFamilyResolverImpl)fontFamilyResolverImpl$preload$10.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        List list0 = ((FontListFontFamily)fontFamily0).o();
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            Font font0 = (Font)list0.get(v2);
            FontFamily fontFamily1 = fontFamilyResolverImpl0.b.a(fontFamily0);
            FontWeight fontWeight0 = font0.b();
            FontWeight fontWeight1 = fontFamilyResolverImpl0.b.b(fontWeight0);
            int v3 = font0.d();
            arrayList0.add(new TypefaceRequest(fontFamily1, fontWeight1, fontFamilyResolverImpl0.b.c(v3), 1, fontFamilyResolverImpl0.a.a(), null));
        }
        androidx.compose.ui.text.font.FontFamilyResolverImpl.preload.2 fontFamilyResolverImpl$preload$20 = new Function1() {
            final FontFamilyResolverImpl e;

            {
                this.e = fontFamilyResolverImpl0;
                super(1);
            }

            @l
            public final TypefaceResult a(@l TypefaceRequest typefaceRequest0) {
                L.p(typefaceRequest0, "typeRequest");
                TypefaceResult typefaceResult0 = this.e.d.a(typefaceRequest0, this.e.g(), androidx.compose.ui.text.font.FontFamilyResolverImpl.preload.2.1.e, this.e.f);
                if(typefaceResult0 == null) {
                    typefaceResult0 = this.e.e.a(typefaceRequest0, this.e.g(), androidx.compose.ui.text.font.FontFamilyResolverImpl.preload.2.2.e, this.e.f);
                    if(typefaceResult0 == null) {
                        throw new IllegalStateException("Could not load font");
                    }
                }
                return typefaceResult0;

                final class androidx.compose.ui.text.font.FontFamilyResolverImpl.preload.2.1 extends N implements Function1 {
                    public static final androidx.compose.ui.text.font.FontFamilyResolverImpl.preload.2.1 e;

                    static {
                        androidx.compose.ui.text.font.FontFamilyResolverImpl.preload.2.1.e = new androidx.compose.ui.text.font.FontFamilyResolverImpl.preload.2.1();
                    }

                    androidx.compose.ui.text.font.FontFamilyResolverImpl.preload.2.1() {
                        super(1);
                    }

                    public final void a(@l Immutable typefaceResult$Immutable0) {
                        L.p(typefaceResult$Immutable0, "it");
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((Immutable)object0));
                        return S0.a;
                    }
                }


                final class androidx.compose.ui.text.font.FontFamilyResolverImpl.preload.2.2 extends N implements Function1 {
                    public static final androidx.compose.ui.text.font.FontFamilyResolverImpl.preload.2.2 e;

                    static {
                        androidx.compose.ui.text.font.FontFamilyResolverImpl.preload.2.2.e = new androidx.compose.ui.text.font.FontFamilyResolverImpl.preload.2.2();
                    }

                    androidx.compose.ui.text.font.FontFamilyResolverImpl.preload.2.2() {
                        super(1);
                    }

                    public final void a(@l Immutable typefaceResult$Immutable0) {
                        L.p(typefaceResult$Immutable0, "it");
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((Immutable)object0));
                        return S0.a;
                    }
                }

            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((TypefaceRequest)object0));
            }
        };
        fontFamilyResolverImpl0.c.e(arrayList0, fontFamilyResolverImpl$preload$20);
        return S0.a;
    }

    @Override  // androidx.compose.ui.text.font.FontFamily$Resolver
    @l
    public State b(@m FontFamily fontFamily0, @l FontWeight fontWeight0, int v, int v1) {
        L.p(fontWeight0, "fontWeight");
        return this.h(new TypefaceRequest(this.b.a(fontFamily0), this.b.b(fontWeight0), this.b.c(v), this.b.d(v1), this.a.a(), null));
    }

    @l
    public final PlatformFontLoader g() {
        return this.a;
    }

    private final State h(TypefaceRequest typefaceRequest0) {
        androidx.compose.ui.text.font.FontFamilyResolverImpl.resolve.result.1 fontFamilyResolverImpl$resolve$result$10 = new Function1(typefaceRequest0) {
            final FontFamilyResolverImpl e;
            final TypefaceRequest f;

            {
                this.e = fontFamilyResolverImpl0;
                this.f = typefaceRequest0;
                super(1);
            }

            @l
            public final TypefaceResult a(@l Function1 function10) {
                L.p(function10, "onAsyncCompletion");
                FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter0 = this.e.d;
                PlatformFontLoader platformFontLoader0 = this.e.g();
                Function1 function11 = this.e.f;
                TypefaceResult typefaceResult0 = fontListFontFamilyTypefaceAdapter0.a(this.f, platformFontLoader0, function10, function11);
                if(typefaceResult0 == null) {
                    PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter0 = this.e.e;
                    PlatformFontLoader platformFontLoader1 = this.e.g();
                    Function1 function12 = this.e.f;
                    typefaceResult0 = platformFontFamilyTypefaceAdapter0.a(this.f, platformFontLoader1, function10, function12);
                    if(typefaceResult0 == null) {
                        throw new IllegalStateException("Could not load font");
                    }
                }
                return typefaceResult0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Function1)object0));
            }
        };
        return this.c.f(typefaceRequest0, fontFamilyResolverImpl$resolve$result$10);
    }
}

