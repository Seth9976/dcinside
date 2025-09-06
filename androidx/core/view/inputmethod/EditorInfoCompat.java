package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Preconditions;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class EditorInfoCompat {
    @RequiresApi(30)
    static class Api30Impl {
        static CharSequence a(EditorInfo editorInfo0, int v) {
            return editorInfo0.getInitialSelectedText(v);
        }

        static CharSequence b(EditorInfo editorInfo0, int v, int v1) {
            return editorInfo0.getInitialTextAfterCursor(v, v1);
        }

        static CharSequence c(EditorInfo editorInfo0, int v, int v1) {
            return editorInfo0.getInitialTextBeforeCursor(v, v1);
        }

        static void d(EditorInfo editorInfo0, CharSequence charSequence0, int v) {
            editorInfo0.setInitialSurroundingSubText(charSequence0, v);
        }
    }

    @RequiresApi(35)
    static class Api35Impl {
        static boolean a(EditorInfo editorInfo0) {
            return editorInfo0.isStylusHandwritingEnabled();
        }

        static void b(EditorInfo editorInfo0, boolean z) {
            editorInfo0.setStylusHandwritingEnabled(z);
        }
    }

    public static final int a = 0x1000000;
    public static final int b = 0x80000000;
    private static final String[] c = null;
    private static final String d = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    private static final String e = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    private static final String f = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";
    private static final String g = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";
    private static final String h = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";
    @VisibleForTesting
    static final String i = "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED";
    @VisibleForTesting
    static final int j = 0x800;
    @VisibleForTesting
    static final int k = 0x400;

    static {
        EditorInfoCompat.c = new String[0];
    }

    public static String[] a(EditorInfo editorInfo0) {
        if(Build.VERSION.SDK_INT >= 25) {
            String[] arr_s = editorInfo0.contentMimeTypes;
            return arr_s == null ? EditorInfoCompat.c : arr_s;
        }
        Bundle bundle0 = editorInfo0.extras;
        if(bundle0 == null) {
            return EditorInfoCompat.c;
        }
        String[] arr_s1 = bundle0.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if(arr_s1 == null) {
            arr_s1 = editorInfo0.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        return arr_s1 == null ? EditorInfoCompat.c : arr_s1;
    }

    public static CharSequence b(EditorInfo editorInfo0, int v) {
        if(Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.a(editorInfo0, v);
        }
        if(editorInfo0.extras == null) {
            return null;
        }
        int v1 = Math.min(editorInfo0.initialSelStart, editorInfo0.initialSelEnd);
        int v2 = Math.max(editorInfo0.initialSelStart, editorInfo0.initialSelEnd);
        int v3 = editorInfo0.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD");
        int v4 = editorInfo0.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END");
        if(editorInfo0.initialSelStart >= 0 && editorInfo0.initialSelEnd >= 0 && v4 - v3 == v2 - v1) {
            CharSequence charSequence0 = editorInfo0.extras.getCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT");
            if(charSequence0 == null) {
                return null;
            }
            return (v & 1) != 0 ? charSequence0.subSequence(v3, v4) : TextUtils.substring(charSequence0, v3, v4);
        }
        return null;
    }

    public static CharSequence c(EditorInfo editorInfo0, int v, int v1) {
        if(Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.b(editorInfo0, v, v1);
        }
        Bundle bundle0 = editorInfo0.extras;
        if(bundle0 == null) {
            return null;
        }
        CharSequence charSequence0 = bundle0.getCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT");
        if(charSequence0 == null) {
            return null;
        }
        int v2 = editorInfo0.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END");
        int v3 = Math.min(v, charSequence0.length() - v2);
        return (v1 & 1) != 0 ? charSequence0.subSequence(v2, v3 + v2) : TextUtils.substring(charSequence0, v2, v3 + v2);
    }

    public static CharSequence d(EditorInfo editorInfo0, int v, int v1) {
        if(Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.c(editorInfo0, v, v1);
        }
        Bundle bundle0 = editorInfo0.extras;
        if(bundle0 == null) {
            return null;
        }
        CharSequence charSequence0 = bundle0.getCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT");
        if(charSequence0 == null) {
            return null;
        }
        int v2 = editorInfo0.extras.getInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD");
        int v3 = Math.min(v, v2);
        return (v1 & 1) != 0 ? charSequence0.subSequence(v2 - v3, v2) : TextUtils.substring(charSequence0, v2 - v3, v2);
    }

    static int e(EditorInfo editorInfo0) {
        if(Build.VERSION.SDK_INT >= 25) {
            return 1;
        }
        Bundle bundle0 = editorInfo0.extras;
        if(bundle0 == null) {
            return 0;
        }
        boolean z = bundle0.containsKey("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        boolean z1 = editorInfo0.extras.containsKey("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if(z && z1) {
            return 4;
        }
        if(z) {
            return 3;
        }
        return z1 ? 2 : 0;
    }

    private static boolean f(CharSequence charSequence0, int v, int v1) {
        switch(v1) {
            case 0: {
                return Character.isLowSurrogate(charSequence0.charAt(v));
            }
            case 1: {
                return Character.isHighSurrogate(charSequence0.charAt(v));
            }
            default: {
                return false;
            }
        }
    }

    private static boolean g(int v) {
        return (v & 0xFFF) == 18 || (v & 0xFFF) == 0x81 || (v & 0xFFF) == 0xE1;
    }

    public static boolean h(EditorInfo editorInfo0) {
        if(editorInfo0.extras != null && editorInfo0.extras.containsKey("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED")) {
            return editorInfo0.extras.getBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED");
        }
        return Build.VERSION.SDK_INT < 35 ? false : Api35Impl.a(editorInfo0);
    }

    public static void i(EditorInfo editorInfo0, String[] arr_s) {
        if(Build.VERSION.SDK_INT >= 25) {
            editorInfo0.contentMimeTypes = arr_s;
            return;
        }
        if(editorInfo0.extras == null) {
            editorInfo0.extras = new Bundle();
        }
        editorInfo0.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", arr_s);
        editorInfo0.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", arr_s);
    }

    public static void j(EditorInfo editorInfo0, CharSequence charSequence0, int v) {
        Preconditions.l(charSequence0);
        if(Build.VERSION.SDK_INT >= 30) {
            Api30Impl.d(editorInfo0, charSequence0, v);
            return;
        }
        int v1 = editorInfo0.initialSelStart <= editorInfo0.initialSelEnd ? editorInfo0.initialSelStart - v : editorInfo0.initialSelEnd - v;
        int v2 = editorInfo0.initialSelStart <= editorInfo0.initialSelEnd ? editorInfo0.initialSelEnd - v : editorInfo0.initialSelStart - v;
        int v3 = charSequence0.length();
        if(v >= 0 && v1 >= 0 && v2 <= v3) {
            if(EditorInfoCompat.g(editorInfo0.inputType)) {
                EditorInfoCompat.m(editorInfo0, null, 0, 0);
                return;
            }
            if(v3 <= 0x800) {
                EditorInfoCompat.m(editorInfo0, charSequence0, v1, v2);
                return;
            }
            EditorInfoCompat.n(editorInfo0, charSequence0, v1, v2);
            return;
        }
        EditorInfoCompat.m(editorInfo0, null, 0, 0);
    }

    public static void k(EditorInfo editorInfo0, CharSequence charSequence0) {
        if(Build.VERSION.SDK_INT >= 30) {
            Api30Impl.d(editorInfo0, charSequence0, 0);
            return;
        }
        EditorInfoCompat.j(editorInfo0, charSequence0, 0);
    }

    public static void l(EditorInfo editorInfo0, boolean z) {
        if(Build.VERSION.SDK_INT >= 35) {
            Api35Impl.b(editorInfo0, z);
        }
        if(editorInfo0.extras == null) {
            editorInfo0.extras = new Bundle();
        }
        editorInfo0.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z);
    }

    private static void m(EditorInfo editorInfo0, CharSequence charSequence0, int v, int v1) {
        if(editorInfo0.extras == null) {
            editorInfo0.extras = new Bundle();
        }
        SpannableStringBuilder spannableStringBuilder0 = charSequence0 == null ? null : new SpannableStringBuilder(charSequence0);
        editorInfo0.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder0);
        editorInfo0.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", v);
        editorInfo0.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", v1);
    }

    private static void n(EditorInfo editorInfo0, CharSequence charSequence0, int v, int v1) {
        int v2 = v1 - v;
        int v3 = v2 <= 0x400 ? v2 : 0;
        int v4 = Math.min(charSequence0.length() - v1, 0x800 - v3 - Math.min(v, ((int)(((double)(0x800 - v3)) * 0.8))));
        int v5 = Math.min(v, 0x800 - v3 - v4);
        int v6 = v - v5;
        if(EditorInfoCompat.f(charSequence0, v6, 0)) {
            ++v6;
            --v5;
        }
        if(EditorInfoCompat.f(charSequence0, v1 + v4 - 1, 1)) {
            --v4;
        }
        EditorInfoCompat.m(editorInfo0, (v3 == v2 ? charSequence0.subSequence(v6, v5 + v3 + v4 + v6) : TextUtils.concat(new CharSequence[]{charSequence0.subSequence(v6, v6 + v5), charSequence0.subSequence(v1, v4 + v1)})), v5, v3 + v5);
    }
}

