package androidx.core.text;

import android.text.Html.ImageGetter;
import android.text.Html.TagHandler;
import android.text.Spanned;
import y4.l;
import y4.m;

public final class HtmlKt {
    @l
    public static final Spanned a(@l String s, int v, @m Html.ImageGetter html$ImageGetter0, @m Html.TagHandler html$TagHandler0) {
        return HtmlCompat.b(s, v, html$ImageGetter0, html$TagHandler0);
    }

    public static Spanned b(String s, int v, Html.ImageGetter html$ImageGetter0, Html.TagHandler html$TagHandler0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        if((v1 & 2) != 0) {
            html$ImageGetter0 = null;
        }
        if((v1 & 4) != 0) {
            html$TagHandler0 = null;
        }
        return HtmlCompat.b(s, v, html$ImageGetter0, html$TagHandler0);
    }

    @l
    public static final String c(@l Spanned spanned0, int v) {
        return HtmlCompat.c(spanned0, v);
    }

    public static String d(Spanned spanned0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        return HtmlCompat.c(spanned0, v);
    }
}

