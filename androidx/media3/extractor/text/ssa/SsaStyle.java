package androidx.media3.extractor.text.ssa;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.google.common.base.c;
import com.google.common.primitives.l;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class SsaStyle {
    static final class Format {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;

        private Format(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, int v9, int v10) {
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.d = v3;
            this.e = v4;
            this.f = v5;
            this.g = v6;
            this.h = v7;
            this.i = v8;
            this.j = v9;
            this.k = v10;
        }

        // This method was un-flattened
        @Nullable
        public static Format a(String s) {
            String[] arr_s = TextUtils.split(s.substring(7), ",");
            int v1 = -1;
            int v2 = -1;
            int v3 = -1;
            int v4 = -1;
            int v5 = -1;
            int v6 = -1;
            int v7 = -1;
            int v8 = -1;
            int v9 = -1;
            int v10 = -1;
            for(int v = 0; v < arr_s.length; ++v) {
                String s1 = c.g(arr_s[v].trim());
                s1.hashCode();
                switch(s1) {
                    case "alignment": {
                        v2 = v;
                        break;
                    }
                    case "bold": {
                        v6 = v;
                        break;
                    }
                    case "borderstyle": {
                        v10 = v;
                        break;
                    }
                    case "fontsize": {
                        v5 = v;
                        break;
                    }
                    case "italic": {
                        v7 = v;
                        break;
                    }
                    case "name": {
                        v1 = v;
                        break;
                    }
                    case "outlinecolour": {
                        v4 = v;
                        break;
                    }
                    case "primarycolour": {
                        v3 = v;
                        break;
                    }
                    case "strikeout": {
                        v9 = v;
                        break;
                    }
                    case "underline": {
                        v8 = v;
                    }
                }
            }
            return v1 == -1 ? null : new Format(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, arr_s.length);
        }
    }

    static final class Overrides {
        public final int a;
        @Nullable
        public final PointF b;
        private static final String c = "SsaStyle.Overrides";
        private static final Pattern d = null;
        private static final String e = "\\s*\\d+(?:\\.\\d+)?\\s*";
        private static final Pattern f;
        private static final Pattern g;
        private static final Pattern h;

        static {
            Overrides.d = Pattern.compile("\\{([^}]*)\\}");
            Overrides.f = Pattern.compile("\\\\pos\\((\\s*\\d+(?:\\.\\d+)?\\s*),(\\s*\\d+(?:\\.\\d+)?\\s*)\\)");
            Overrides.g = Pattern.compile("\\\\move\\(\\s*\\d+(?:\\.\\d+)?\\s*,\\s*\\d+(?:\\.\\d+)?\\s*,(\\s*\\d+(?:\\.\\d+)?\\s*),(\\s*\\d+(?:\\.\\d+)?\\s*)(?:,\\s*\\d+(?:\\.\\d+)?\\s*,\\s*\\d+(?:\\.\\d+)?\\s*)?\\)");
            Overrides.h = Pattern.compile("\\\\an(\\d+)");
        }

        private Overrides(int v, @Nullable PointF pointF0) {
            this.a = v;
            this.b = pointF0;
        }

        private static int a(String s) {
            Matcher matcher0 = Overrides.h.matcher(s);
            return matcher0.find() ? SsaStyle.e(((String)Assertions.g(matcher0.group(1)))) : -1;
        }

        public static Overrides b(String s) {
            int v1;
            Matcher matcher0 = Overrides.d.matcher(s);
            PointF pointF0 = null;
            int v = -1;
            while(matcher0.find()) {
                String s1 = (String)Assertions.g(matcher0.group(1));
                try {
                    PointF pointF1 = Overrides.c(s1);
                    if(pointF1 != null) {
                        pointF0 = pointF1;
                    }
                }
                catch(RuntimeException unused_ex) {
                }
                try {
                    v1 = Overrides.a(s1);
                    if(v1 == -1) {
                        continue;
                    }
                }
                catch(RuntimeException unused_ex) {
                    continue;
                }
                v = v1;
            }
            return new Overrides(v, pointF0);
        }

        @Nullable
        private static PointF c(String s) {
            String s2;
            String s1;
            Matcher matcher0 = Overrides.f.matcher(s);
            Matcher matcher1 = Overrides.g.matcher(s);
            boolean z = matcher0.find();
            boolean z1 = matcher1.find();
            if(z) {
                if(z1) {
                    Log.h("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override=\'" + s + "\'");
                }
                s1 = matcher0.group(1);
                s2 = matcher0.group(2);
                return new PointF(Float.parseFloat(((String)Assertions.g(s1)).trim()), Float.parseFloat(((String)Assertions.g(s2)).trim()));
            }
            if(z1) {
                s1 = matcher1.group(1);
                s2 = matcher1.group(2);
                return new PointF(Float.parseFloat(((String)Assertions.g(s1)).trim()), Float.parseFloat(((String)Assertions.g(s2)).trim()));
            }
            return null;
        }

        public static String d(String s) {
            return Overrides.d.matcher(s).replaceAll("");
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface SsaAlignment {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface SsaBorderStyle {
    }

    public final String a;
    public final int b;
    @ColorInt
    @Nullable
    public final Integer c;
    @ColorInt
    @Nullable
    public final Integer d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    private static final String k = "SsaStyle";
    public static final int l = -1;
    public static final int m = 1;
    public static final int n = 2;
    public static final int o = 3;
    public static final int p = 4;
    public static final int q = 5;
    public static final int r = 6;
    public static final int s = 7;
    public static final int t = 8;
    public static final int u = 9;
    public static final int v = -1;
    public static final int w = 1;
    public static final int x = 3;

    private SsaStyle(String s, int v, @ColorInt @Nullable Integer integer0, @ColorInt @Nullable Integer integer1, float f, boolean z, boolean z1, boolean z2, boolean z3, int v1) {
        this.a = s;
        this.b = v;
        this.c = integer0;
        this.d = integer1;
        this.e = f;
        this.f = z;
        this.g = z1;
        this.h = z2;
        this.i = z3;
        this.j = v1;
    }

    @Nullable
    public static SsaStyle b(String s, Format ssaStyle$Format0) {
        Assertions.a(s.startsWith("Style:"));
        String[] arr_s = TextUtils.split(s.substring(6), ",");
        int v = ssaStyle$Format0.k;
        if(arr_s.length != v) {
            Log.n("SsaStyle", Util.S("Skipping malformed \'Style:\' line (expected %s values, found %s): \'%s\'", new Object[]{v, ((int)arr_s.length), s}));
            return null;
        }
        try {
            return new SsaStyle(arr_s[ssaStyle$Format0.a].trim(), (ssaStyle$Format0.b == -1 ? -1 : SsaStyle.e(arr_s[ssaStyle$Format0.b].trim())), (ssaStyle$Format0.c == -1 ? null : SsaStyle.h(arr_s[ssaStyle$Format0.c].trim())), (ssaStyle$Format0.d == -1 ? null : SsaStyle.h(arr_s[ssaStyle$Format0.d].trim())), (ssaStyle$Format0.e == -1 ? -3.402823E+38f : SsaStyle.i(arr_s[ssaStyle$Format0.e].trim())), ssaStyle$Format0.f != -1 && SsaStyle.f(arr_s[ssaStyle$Format0.f].trim()), ssaStyle$Format0.g != -1 && SsaStyle.f(arr_s[ssaStyle$Format0.g].trim()), ssaStyle$Format0.h != -1 && SsaStyle.f(arr_s[ssaStyle$Format0.h].trim()), ssaStyle$Format0.i != -1 && SsaStyle.f(arr_s[ssaStyle$Format0.i].trim()), (ssaStyle$Format0.j == -1 ? -1 : SsaStyle.g(arr_s[ssaStyle$Format0.j].trim())));
        }
        catch(RuntimeException runtimeException0) {
        }
        Log.o("SsaStyle", "Skipping malformed \'Style:\' line: \'" + s + "\'", runtimeException0);
        return null;
    }

    private static boolean c(int v) {
        switch(v) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    private static boolean d(int v) {
        return v == 1 || v == 3;
    }

    private static int e(String s) {
        try {
            int v = Integer.parseInt(s.trim());
            if(SsaStyle.c(v)) {
                return v;
            }
        }
        catch(NumberFormatException unused_ex) {
        }
        Log.n("SsaStyle", "Ignoring unknown alignment: " + s);
        return -1;
    }

    private static boolean f(String s) {
        try {
            int v = Integer.parseInt(s);
            return v == -1 || v == 1;
        }
        catch(NumberFormatException numberFormatException0) {
            Log.o("SsaStyle", "Failed to parse boolean value: \'" + s + "\'", numberFormatException0);
            return false;
        }
    }

    private static int g(String s) {
        try {
            int v = Integer.parseInt(s.trim());
            if(SsaStyle.d(v)) {
                return v;
            }
        }
        catch(NumberFormatException unused_ex) {
        }
        Log.n("SsaStyle", "Ignoring unknown BorderStyle: " + s);
        return -1;
    }

    @ColorInt
    @Nullable
    public static Integer h(String s) {
        long v;
        try {
            v = s.startsWith("&H") ? Long.parseLong(s.substring(2), 16) : Long.parseLong(s);
            Assertions.a(v <= 0xFFFFFFFFL);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            Log.o("SsaStyle", "Failed to parse color expression: \'" + s + "\'", illegalArgumentException0);
            return null;
        }
        int v1 = l.d(v >> 24 & 0xFFL ^ 0xFFL);
        int v2 = l.d(v >> 16 & 0xFFL);
        int v3 = l.d(v >> 8 & 0xFFL);
        return Color.argb(v1, l.d(v & 0xFFL), v3, v2);
    }

    private static float i(String s) {
        try {
            return Float.parseFloat(s);
        }
        catch(NumberFormatException numberFormatException0) {
            Log.o("SsaStyle", "Failed to parse font size: \'" + s + "\'", numberFormatException0);
            return -3.402823E+38f;
        }
    }
}

