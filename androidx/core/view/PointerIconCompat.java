package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.view.PointerIcon;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

public final class PointerIconCompat {
    @RequiresApi(24)
    static class Api24Impl {
        static PointerIcon a(Bitmap bitmap0, float f, float f1) {
            return PointerIcon.create(bitmap0, f, f1);
        }

        static PointerIcon b(Context context0, int v) {
            return PointerIcon.getSystemIcon(context0, v);
        }

        static PointerIcon c(Resources resources0, int v) {
            return PointerIcon.load(resources0, v);
        }
    }

    private final PointerIcon a;
    public static final int b = 0;
    public static final int c = 1000;
    public static final int d = 1001;
    public static final int e = 1002;
    public static final int f = 1003;
    public static final int g = 1004;
    public static final int h = 1006;
    public static final int i = 1007;
    public static final int j = 0x3F0;
    public static final int k = 1009;
    public static final int l = 1010;
    public static final int m = 0x3F3;
    public static final int n = 0x3F4;
    public static final int o = 0x3F5;
    public static final int p = 0x3F6;
    public static final int q = 0x3F7;
    public static final int r = 0x3F8;
    public static final int s = 0x3F9;
    public static final int t = 0x3FA;
    public static final int u = 0x3FB;
    public static final int v = 1020;
    public static final int w = 0x3FD;
    public static final int x = 1000;

    private PointerIconCompat(PointerIcon pointerIcon0) {
        this.a = pointerIcon0;
    }

    public static PointerIconCompat a(Bitmap bitmap0, float f, float f1) {
        return Build.VERSION.SDK_INT < 24 ? new PointerIconCompat(null) : new PointerIconCompat(Api24Impl.a(bitmap0, f, f1));
    }

    @RestrictTo({Scope.c})
    public Object b() {
        return this.a;
    }

    public static PointerIconCompat c(Context context0, int v) {
        return Build.VERSION.SDK_INT < 24 ? new PointerIconCompat(null) : new PointerIconCompat(Api24Impl.b(context0, v));
    }

    public static PointerIconCompat d(Resources resources0, int v) {
        return Build.VERSION.SDK_INT < 24 ? new PointerIconCompat(null) : new PointerIconCompat(Api24Impl.c(resources0, v));
    }
}

