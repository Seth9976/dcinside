package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.InternalTextApi;
import kotlin.coroutines.g;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class FontFamilyResolver_androidKt {
    @l
    public static final Resolver a(@l Context context0) {
        L.p(context0, "context");
        return new FontFamilyResolverImpl(new AndroidFontLoader(context0), AndroidFontResolveInterceptor_androidKt.a(context0), null, null, null, 28, null);
    }

    @l
    public static final Resolver b(@l Context context0, @l g g0) {
        L.p(context0, "context");
        L.p(g0, "coroutineContext");
        return new FontFamilyResolverImpl(new AndroidFontLoader(context0), AndroidFontResolveInterceptor_androidKt.a(context0), FontFamilyResolverKt.b(), new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.a(), g0), null, 16, null);
    }

    @InternalTextApi
    @l
    public static final Resolver c(@l Context context0) {
        L.p(context0, "context");
        return new FontFamilyResolverImpl(new AndroidFontLoader(context0), null, new TypefaceRequestCache(), new FontListFontFamilyTypefaceAdapter(new AsyncTypefaceCache(), null, 2, null), null, 18, null);
    }

    @l
    public static final State d(@l Resolver fontFamily$Resolver0, @m FontFamily fontFamily0, @l FontWeight fontWeight0, int v, int v1) {
        L.p(fontFamily$Resolver0, "$this$resolveAsTypeface");
        L.p(fontWeight0, "fontWeight");
        State state0 = fontFamily$Resolver0.b(fontFamily0, fontWeight0, v, v1);
        L.n(state0, "null cannot be cast to non-null type androidx.compose.runtime.State<android.graphics.Typeface>");
        return state0;
    }

    public static State e(Resolver fontFamily$Resolver0, FontFamily fontFamily0, FontWeight fontWeight0, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            fontFamily0 = null;
        }
        if((v2 & 2) != 0) {
            fontWeight0 = FontWeight.b.m();
        }
        if((v2 & 4) != 0) {
            v = 0;
        }
        if((v2 & 8) != 0) {
            v1 = 1;
        }
        return FontFamilyResolver_androidKt.d(fontFamily$Resolver0, fontFamily0, fontWeight0, v, v1);
    }
}

