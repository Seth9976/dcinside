package androidx.media3.common;

import O1.a;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import h4.e;
import java.util.Arrays;
import w4.d;

@UnstableApi
public final class ColorInfo {
    public static final class Builder {
        private int a;
        private int b;
        private int c;
        @Nullable
        private byte[] d;
        private int e;
        private int f;

        public Builder() {
            this.a = -1;
            this.b = -1;
            this.c = -1;
            this.e = -1;
            this.f = -1;
        }

        private Builder(ColorInfo colorInfo0) {
            this.a = colorInfo0.a;
            this.b = colorInfo0.b;
            this.c = colorInfo0.c;
            this.d = colorInfo0.d;
            this.e = colorInfo0.e;
            this.f = colorInfo0.f;
        }

        Builder(ColorInfo colorInfo0, androidx.media3.common.ColorInfo.1 colorInfo$10) {
            this(colorInfo0);
        }

        public ColorInfo a() {
            return new ColorInfo(this.a, this.b, this.c, this.d, this.e, this.f, null);
        }

        @a
        public Builder b(int v) {
            this.f = v;
            return this;
        }

        @a
        public Builder c(int v) {
            this.b = v;
            return this;
        }

        @a
        public Builder d(int v) {
            this.a = v;
            return this;
        }

        @a
        public Builder e(int v) {
            this.c = v;
            return this;
        }

        @a
        public Builder f(@Nullable byte[] arr_b) {
            this.d = arr_b;
            return this;
        }

        @a
        public Builder g(int v) {
            this.e = v;
            return this;
        }
    }

    public final int a;
    public final int b;
    public final int c;
    @Nullable
    public final byte[] d;
    public final int e;
    public final int f;
    private int g;
    public static final ColorInfo h;
    public static final ColorInfo i;
    private static final String j;
    private static final String k;
    private static final String l;
    private static final String m;
    private static final String n;
    private static final String o;

    static {
        ColorInfo.h = new Builder().d(1).c(2).e(3).a();
        ColorInfo.i = new Builder().d(1).c(1).e(2).a();
        ColorInfo.j = "0";
        ColorInfo.k = "1";
        ColorInfo.l = "2";
        ColorInfo.m = "3";
        ColorInfo.n = "4";
        ColorInfo.o = "5";
    }

    private ColorInfo(int v, int v1, int v2, @Nullable byte[] arr_b, int v3, int v4) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = arr_b;
        this.e = v3;
        this.f = v4;
    }

    ColorInfo(int v, int v1, int v2, byte[] arr_b, int v3, int v4, androidx.media3.common.ColorInfo.1 colorInfo$10) {
        this(v, v1, v2, arr_b, v3, v4);
    }

    public Builder a() {
        return new Builder(this, null);
    }

    private static String b(int v) {
        return v == -1 ? "NA" : v + "bit Chroma";
    }

    private static String c(int v) {
        switch(v) {
            case -1: {
                return "Unset color range";
            }
            case 1: {
                return "Full range";
            }
            case 2: {
                return "Limited range";
            }
            default: {
                return "Undefined color range " + v;
            }
        }
    }

    private static String d(int v) {
        switch(v) {
            case -1: {
                return "Unset color space";
            }
            case 1: {
                return "BT709";
            }
            case 2: {
                return "BT601";
            }
            case 6: {
                return "BT2020";
            }
            default: {
                return "Undefined color space " + v;
            }
        }
    }

    private static String e(int v) {
        switch(v) {
            case -1: {
                return "Unset color transfer";
            }
            case 1: {
                return "Linear";
            }
            case 2: {
                return "sRGB";
            }
            case 3: {
                return "SDR SMPTE 170M";
            }
            case 6: {
                return "ST2084 PQ";
            }
            case 7: {
                return "HLG";
            }
            case 10: {
                return "Gamma 2.2";
            }
            default: {
                return "Undefined color transfer " + v;
            }
        }
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return ColorInfo.class == class0 && (this.a == ((ColorInfo)object0).a && this.b == ((ColorInfo)object0).b && this.c == ((ColorInfo)object0).c && Arrays.equals(this.d, ((ColorInfo)object0).d) && this.e == ((ColorInfo)object0).e && this.f == ((ColorInfo)object0).f);
        }
        return false;
    }

    public static ColorInfo f(Bundle bundle0) {
        return new ColorInfo(bundle0.getInt(ColorInfo.j, -1), bundle0.getInt(ColorInfo.k, -1), bundle0.getInt(ColorInfo.l, -1), bundle0.getByteArray(ColorInfo.m), bundle0.getInt(ColorInfo.n, -1), bundle0.getInt(ColorInfo.o, -1));
    }

    public boolean g() {
        return this.e != -1 && this.f != -1;
    }

    public boolean h() {
        return this.a != -1 && this.b != -1 && this.c != -1;
    }

    @Override
    public int hashCode() {
        if(this.g == 0) {
            int v = Arrays.hashCode(this.d);
            this.g = (((((this.a + 0x20F) * 0x1F + this.b) * 0x1F + this.c) * 0x1F + v) * 0x1F + this.e) * 0x1F + this.f;
        }
        return this.g;
    }

    // 去混淆评级： 低(20)
    @e(expression = {"#1"}, result = false)
    public static boolean i(@Nullable ColorInfo colorInfo0) {
        return colorInfo0 == null ? true : (colorInfo0.a == -1 || colorInfo0.a == 1 || colorInfo0.a == 2) && (colorInfo0.b == -1 || colorInfo0.b == 2) && (colorInfo0.c == -1 || colorInfo0.c == 3) && colorInfo0.d == null && (colorInfo0.f == -1 || colorInfo0.f == 8) && (colorInfo0.e == -1 || colorInfo0.e == 8);
    }

    public static boolean j(@Nullable ColorInfo colorInfo0) {
        return colorInfo0 != null && (colorInfo0.c == 6 || colorInfo0.c == 7);
    }

    // 去混淆评级： 低(20)
    public boolean k() {
        return this.g() || this.h();
    }

    @d
    public static int l(int v) {
        switch(v) {
            case 1: {
                return 1;
            }
            case 4: {
                return 2;
            }
            case 9: {
                return 6;
            }
            default: {
                return v == 5 || v == 6 || v == 7 ? 2 : -1;
            }
        }
    }

    @d
    public static int m(int v) {
        switch(v) {
            case 4: {
                return 10;
            }
            case 1: 
            case 6: 
            case 7: {
                return 3;
            }
            case 13: {
                return 2;
            }
            case 16: {
                return 6;
            }
            case 18: {
                return 7;
            }
            default: {
                return -1;
            }
        }
    }

    private static String n(int v) {
        return v == -1 ? "NA" : v + "bit Luma";
    }

    public Bundle o() {
        Bundle bundle0 = new Bundle();
        bundle0.putInt(ColorInfo.j, this.a);
        bundle0.putInt(ColorInfo.k, this.b);
        bundle0.putInt(ColorInfo.l, this.c);
        bundle0.putByteArray(ColorInfo.m, this.d);
        bundle0.putInt(ColorInfo.n, this.e);
        bundle0.putInt(ColorInfo.o, this.f);
        return bundle0;
    }

    // 去混淆评级： 低(20)
    public String p() {
        String s = this.h() ? Util.S("%s/%s/%s", new Object[]{ColorInfo.d(this.a), ColorInfo.c(this.b), ColorInfo.e(this.c)}) : "NA/NA/NA";
        return this.g() ? s + "/" + (this.e + "/" + this.f) : s + "/" + "NA/NA";
    }

    @Override
    public String toString() {
        return "ColorInfo(" + ColorInfo.d(this.a) + ", " + ColorInfo.c(this.b) + ", " + ColorInfo.e(this.c) + ", " + (this.d != null) + ", " + ColorInfo.n(this.e) + ", " + ColorInfo.b(this.f) + ")";
    }

    class androidx.media3.common.ColorInfo.1 {
    }

}

