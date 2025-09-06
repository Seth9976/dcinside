package androidx.core.text;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.text.Html.ImageGetter;
import android.text.Html.TagHandler;
import android.text.Html;
import android.text.Spanned;
import androidx.annotation.RequiresApi;

@SuppressLint({"InlinedApi"})
public final class HtmlCompat {
    @RequiresApi(24)
    static class Api24Impl {
        static Spanned a(String s, int v) {
            return Html.fromHtml(s, v);
        }

        static Spanned b(String s, int v, Html.ImageGetter html$ImageGetter0, Html.TagHandler html$TagHandler0) {
            return Html.fromHtml(s, v, html$ImageGetter0, html$TagHandler0);
        }

        static String c(Spanned spanned0, int v) {
            return Html.toHtml(spanned0, v);
        }
    }

    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 4;
    public static final int f = 8;
    public static final int g = 16;
    public static final int h = 0x20;
    public static final int i = 0x100;
    public static final int j = 0;
    public static final int k = 0x3F;

    public static Spanned a(String s, int v) {
        return Build.VERSION.SDK_INT < 24 ? Html.fromHtml(s) : Api24Impl.a(s, v);
    }

    public static Spanned b(String s, int v, Html.ImageGetter html$ImageGetter0, Html.TagHandler html$TagHandler0) {
        return Build.VERSION.SDK_INT < 24 ? Html.fromHtml(s, html$ImageGetter0, html$TagHandler0) : Api24Impl.b(s, v, html$ImageGetter0, html$TagHandler0);
    }

    public static String c(Spanned spanned0, int v) {
        return Build.VERSION.SDK_INT < 24 ? Html.toHtml(spanned0) : Api24Impl.c(spanned0, v);
    }
}

