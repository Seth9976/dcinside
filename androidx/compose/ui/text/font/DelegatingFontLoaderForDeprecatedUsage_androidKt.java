package androidx.compose.ui.text.font;

import android.content.Context;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;

public final class DelegatingFontLoaderForDeprecatedUsage_androidKt {
    @k(message = "This exists to bridge existing Font.ResourceLoader APIs, and should be removed with them", replaceWith = @c0(expression = "createFontFamilyResolver()", imports = {}))
    @l
    public static final Resolver a(@l ResourceLoader font$ResourceLoader0) {
        L.p(font$ResourceLoader0, "fontResourceLoader");
        return new FontFamilyResolverImpl(new DelegatingFontLoaderForDeprecatedUsage(font$ResourceLoader0), null, null, null, null, 30, null);
    }

    @k(message = "This exists to bridge existing Font.ResourceLoader subclasses to be used as aFontFamily.ResourceLoader during upgrade.", replaceWith = @c0(expression = "createFontFamilyResolver()", imports = {}))
    @l
    public static final Resolver b(@l ResourceLoader font$ResourceLoader0, @l Context context0) {
        L.p(font$ResourceLoader0, "fontResourceLoader");
        L.p(context0, "context");
        Context context1 = context0.getApplicationContext();
        L.o(context1, "context.applicationContext");
        return new FontFamilyResolverImpl(new DelegatingFontLoaderForBridgeUsage(font$ResourceLoader0, context1), null, null, null, null, 30, null);
    }
}

