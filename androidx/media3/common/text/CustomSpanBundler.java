package androidx.media3.common.text;

import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import java.util.ArrayList;

final class CustomSpanBundler {
    private static final int a = -1;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    private static final String e;
    private static final String f;
    private static final String g;
    private static final String h;
    private static final String i;

    static {
        CustomSpanBundler.e = "0";
        CustomSpanBundler.f = "1";
        CustomSpanBundler.g = "2";
        CustomSpanBundler.h = "3";
        CustomSpanBundler.i = "4";
    }

    public static ArrayList a(Spanned spanned0) {
        ArrayList arrayList0 = new ArrayList();
        RubySpan[] arr_rubySpan = (RubySpan[])spanned0.getSpans(0, spanned0.length(), RubySpan.class);
        for(int v1 = 0; v1 < arr_rubySpan.length; ++v1) {
            RubySpan rubySpan0 = arr_rubySpan[v1];
            arrayList0.add(CustomSpanBundler.b(spanned0, rubySpan0, 1, rubySpan0.b()));
        }
        TextEmphasisSpan[] arr_textEmphasisSpan = (TextEmphasisSpan[])spanned0.getSpans(0, spanned0.length(), TextEmphasisSpan.class);
        for(int v2 = 0; v2 < arr_textEmphasisSpan.length; ++v2) {
            TextEmphasisSpan textEmphasisSpan0 = arr_textEmphasisSpan[v2];
            arrayList0.add(CustomSpanBundler.b(spanned0, textEmphasisSpan0, 2, textEmphasisSpan0.b()));
        }
        HorizontalTextInVerticalContextSpan[] arr_horizontalTextInVerticalContextSpan = (HorizontalTextInVerticalContextSpan[])spanned0.getSpans(0, spanned0.length(), HorizontalTextInVerticalContextSpan.class);
        for(int v = 0; v < arr_horizontalTextInVerticalContextSpan.length; ++v) {
            arrayList0.add(CustomSpanBundler.b(spanned0, arr_horizontalTextInVerticalContextSpan[v], 3, null));
        }
        return arrayList0;
    }

    private static Bundle b(Spanned spanned0, Object object0, int v, @Nullable Bundle bundle0) {
        Bundle bundle1 = new Bundle();
        int v1 = spanned0.getSpanStart(object0);
        bundle1.putInt(CustomSpanBundler.e, v1);
        int v2 = spanned0.getSpanEnd(object0);
        bundle1.putInt(CustomSpanBundler.f, v2);
        int v3 = spanned0.getSpanFlags(object0);
        bundle1.putInt(CustomSpanBundler.g, v3);
        bundle1.putInt(CustomSpanBundler.h, v);
        if(bundle0 != null) {
            bundle1.putBundle(CustomSpanBundler.i, bundle0);
        }
        return bundle1;
    }

    public static void c(Bundle bundle0, Spannable spannable0) {
        int v = bundle0.getInt(CustomSpanBundler.e);
        int v1 = bundle0.getInt(CustomSpanBundler.f);
        int v2 = bundle0.getInt(CustomSpanBundler.g);
        int v3 = bundle0.getInt(CustomSpanBundler.h, -1);
        Bundle bundle1 = bundle0.getBundle(CustomSpanBundler.i);
        switch(v3) {
            case 1: {
                spannable0.setSpan(RubySpan.a(((Bundle)Assertions.g(bundle1))), v, v1, v2);
                return;
            }
            case 2: {
                spannable0.setSpan(TextEmphasisSpan.a(((Bundle)Assertions.g(bundle1))), v, v1, v2);
                return;
            }
            case 3: {
                spannable0.setSpan(new HorizontalTextInVerticalContextSpan(), v, v1, v2);
            }
        }
    }
}

