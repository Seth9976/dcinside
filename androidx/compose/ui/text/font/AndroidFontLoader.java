package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidFontLoader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontLoader.android.kt\nandroidx/compose/ui/text/font/AndroidFontLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public final class AndroidFontLoader implements PlatformFontLoader {
    private final Context a;
    @m
    private final Object b;

    public AndroidFontLoader(@l Context context0) {
        L.p(context0, "context");
        super();
        this.a = context0.getApplicationContext();
    }

    @Override  // androidx.compose.ui.text.font.PlatformFontLoader
    @m
    public Object a() {
        return this.b;
    }

    @Override  // androidx.compose.ui.text.font.PlatformFontLoader
    @m
    public Object b(@l Font font0, @l d d0) {
        AndroidFontLoader androidFontLoader0;
        androidx.compose.ui.text.font.AndroidFontLoader.awaitLoad.1 androidFontLoader$awaitLoad$10;
        if(d0 instanceof androidx.compose.ui.text.font.AndroidFontLoader.awaitLoad.1) {
            androidFontLoader$awaitLoad$10 = (androidx.compose.ui.text.font.AndroidFontLoader.awaitLoad.1)d0;
            int v = androidFontLoader$awaitLoad$10.o;
            if((v & 0x80000000) == 0) {
                androidFontLoader$awaitLoad$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    Object m;
                    int o;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.m = object0;
                        this.o |= 0x80000000;
                        return d0.b(null, this);
                    }
                };
            }
            else {
                androidFontLoader$awaitLoad$10.o = v ^ 0x80000000;
            }
        }
        else {
            androidFontLoader$awaitLoad$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                Object m;
                int o;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.m = object0;
                    this.o |= 0x80000000;
                    return d0.b(null, this);
                }
            };
        }
        Object object0 = androidFontLoader$awaitLoad$10.m;
        Object object1 = b.l();
        switch(androidFontLoader$awaitLoad$10.o) {
            case 0: {
                f0.n(object0);
                if(font0 instanceof AndroidFont) {
                    TypefaceLoader androidFont$TypefaceLoader0 = ((AndroidFont)font0).a();
                    L.o(this.a, "context");
                    androidFontLoader$awaitLoad$10.o = 1;
                    object0 = androidFont$TypefaceLoader0.b(this.a, ((AndroidFont)font0), androidFontLoader$awaitLoad$10);
                    return object0 == object1 ? object1 : object0;
                }
                if(!(font0 instanceof ResourceFont)) {
                    throw new IllegalArgumentException("Unknown font type: " + font0);
                }
                L.o(this.a, "context");
                androidFontLoader$awaitLoad$10.k = this;
                androidFontLoader$awaitLoad$10.l = font0;
                androidFontLoader$awaitLoad$10.o = 2;
                object0 = AndroidFontLoader_androidKt.d(((ResourceFont)font0), this.a, androidFontLoader$awaitLoad$10);
                if(object0 == object1) {
                    return object1;
                }
                androidFontLoader0 = this;
                break;
            }
            case 1: {
                f0.n(object0);
                return object0;
            }
            case 2: {
                font0 = (Font)androidFontLoader$awaitLoad$10.l;
                androidFontLoader0 = (AndroidFontLoader)androidFontLoader$awaitLoad$10.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Settings fontVariation$Settings0 = ((ResourceFont)font0).j();
        L.o(androidFontLoader0.a, "context");
        return PlatformTypefacesKt.c(((Typeface)object0), fontVariation$Settings0, androidFontLoader0.a);
    }

    @Override  // androidx.compose.ui.text.font.PlatformFontLoader
    public Object c(Font font0) {
        return this.d(font0);
    }

    @m
    public Typeface d(@l Font font0) {
        Object object1;
        Typeface typeface0;
        Object object0 = null;
        L.p(font0, "font");
        if(font0 instanceof AndroidFont) {
            TypefaceLoader androidFont$TypefaceLoader0 = ((AndroidFont)font0).a();
            L.o(this.a, "context");
            return androidFont$TypefaceLoader0.a(this.a, ((AndroidFont)font0));
        }
        if(font0 instanceof ResourceFont) {
            int v = font0.c();
            boolean z = false;
            if(FontLoadingStrategy.g(v, 0)) {
                z = true;
                L.o(this.a, "context");
                typeface0 = AndroidFontLoader_androidKt.c(((ResourceFont)font0), this.a);
            }
            else if(FontLoadingStrategy.g(v, 1)) {
                z = true;
                try {
                    L.o(this.a, "context");
                    object1 = e0.b(AndroidFontLoader_androidKt.c(((ResourceFont)font0), this.a));
                }
                catch(Throwable throwable0) {
                    object1 = e0.b(f0.a(throwable0));
                }
                if(!e0.i(object1)) {
                    object0 = object1;
                }
                typeface0 = (Typeface)object0;
            }
            if(z) {
                Settings fontVariation$Settings0 = ((ResourceFont)font0).j();
                L.o(this.a, "context");
                return PlatformTypefacesKt.c(typeface0, fontVariation$Settings0, this.a);
            }
            if(!FontLoadingStrategy.g(v, 2)) {
                throw new IllegalArgumentException("Unknown loading type " + FontLoadingStrategy.j(font0.c()));
            }
            throw new UnsupportedOperationException("Unsupported Async font load path");
        }
        return null;
    }
}

