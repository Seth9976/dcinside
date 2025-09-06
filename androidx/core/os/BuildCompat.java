package androidx.core.os;

import android.os.Build.VERSION;
import android.os.ext.SdkExtensions;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import kotlin.c0;
import kotlin.d0;
import kotlin.jvm.internal.L;
import kotlin.k;
import s3.a;
import s3.e;
import y4.l;
import z3.f;
import z3.n;

public final class BuildCompat {
    @RequiresApi(30)
    static final class Api30Impl {
        @l
        public static final Api30Impl a;

        static {
            Api30Impl.a = new Api30Impl();
        }

        public final int a(int v) {
            return SdkExtensions.getExtensionVersion(v);
        }
    }

    @Retention(RetentionPolicy.CLASS)
    @d0
    @e(a.b)
    public @interface PrereleaseSdkCheck {
    }

    @l
    public static final BuildCompat a;
    @ChecksSdkIntAtLeast(extension = 30)
    @f
    public static final int b;
    @ChecksSdkIntAtLeast(extension = 0x1F)
    @f
    public static final int c;
    @ChecksSdkIntAtLeast(extension = 33)
    @f
    public static final int d;
    @ChecksSdkIntAtLeast(extension = 1000000)
    @f
    public static final int e;

    static {
        BuildCompat.a = new BuildCompat();
        int v = Build.VERSION.SDK_INT;
        int v1 = 0;
        BuildCompat.b = v < 30 ? 0 : Api30Impl.a.a(30);
        BuildCompat.c = v < 30 ? 0 : Api30Impl.a.a(0x1F);
        BuildCompat.d = v < 30 ? 0 : Api30Impl.a.a(33);
        if(v >= 30) {
            v1 = Api30Impl.a.a(1000000);
        }
        BuildCompat.e = v1;
    }

    @ChecksSdkIntAtLeast(api = 36, codename = "Baklava")
    @n
    public static final boolean a() {
        int v = Build.VERSION.SDK_INT;
        if(v < 36) {
            if(v >= 35) {
                String s = Build.VERSION.CODENAME;
                L.o(s, "CODENAME");
                return BuildCompat.g("Baklava", s);
            }
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(api = 24)
    @k(message = "Android N is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 24`.", replaceWith = @c0(expression = "android.os.Build.VERSION.SDK_INT >= 24", imports = {}))
    @n
    public static final boolean b() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @ChecksSdkIntAtLeast(api = 25)
    @k(message = "Android N MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 25`.", replaceWith = @c0(expression = "android.os.Build.VERSION.SDK_INT >= 25", imports = {}))
    @n
    public static final boolean c() {
        return Build.VERSION.SDK_INT >= 25;
    }

    @ChecksSdkIntAtLeast(api = 26)
    @k(message = "Android O is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead use `Build.VERSION.SDK_INT >= 26`.", replaceWith = @c0(expression = "android.os.Build.VERSION.SDK_INT >= 26", imports = {}))
    @n
    public static final boolean d() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @ChecksSdkIntAtLeast(api = 27)
    @k(message = "Android O MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 27`.", replaceWith = @c0(expression = "android.os.Build.VERSION.SDK_INT >= 27", imports = {}))
    @n
    public static final boolean e() {
        return Build.VERSION.SDK_INT >= 27;
    }

    @ChecksSdkIntAtLeast(api = 28)
    @k(message = "Android P is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 28`.", replaceWith = @c0(expression = "android.os.Build.VERSION.SDK_INT >= 28", imports = {}))
    @n
    public static final boolean f() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @RestrictTo({Scope.a})
    @VisibleForTesting
    @n
    public static final boolean g(@l String s, @l String s1) {
        L.p(s, "codename");
        L.p(s1, "buildCodename");
        if(L.g("REL", s1)) {
            return false;
        }
        Integer integer0 = BuildCompat.h(s1);
        Integer integer1 = BuildCompat.h(s);
        if(integer0 != null && integer1 != null) {
            return ((int)integer0) >= ((int)integer1);
        }
        if(integer0 == null && integer1 == null) {
            Locale locale0 = Locale.ROOT;
            String s2 = s1.toUpperCase(locale0);
            L.o(s2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String s3 = s.toUpperCase(locale0);
            L.o(s3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return s2.compareTo(s3) >= 0;
        }
        return integer0 != null;
    }

    private static final Integer h(String s) {
        String s1 = s.toUpperCase(Locale.ROOT);
        L.o(s1, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return L.g(s1, "BAKLAVA") ? 0 : null;
    }

    @ChecksSdkIntAtLeast(api = 29)
    @k(message = "Android Q is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 29`.", replaceWith = @c0(expression = "android.os.Build.VERSION.SDK_INT >= 29", imports = {}))
    @n
    public static final boolean i() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @ChecksSdkIntAtLeast(api = 30)
    @k(message = "Android R is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 30`.", replaceWith = @c0(expression = "android.os.Build.VERSION.SDK_INT >= 30", imports = {}))
    @n
    public static final boolean j() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @ChecksSdkIntAtLeast(api = 0x1F, codename = "S")
    @k(message = "Android S is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 31`.", replaceWith = @c0(expression = "android.os.Build.VERSION.SDK_INT >= 31", imports = {}))
    @n
    public static final boolean k() {
        int v = Build.VERSION.SDK_INT;
        if(v < 0x1F) {
            if(v >= 30) {
                String s = Build.VERSION.CODENAME;
                L.o(s, "CODENAME");
                return BuildCompat.g("S", s);
            }
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(api = 0x20, codename = "Sv2")
    @k(message = "Android Sv2 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 32`.", replaceWith = @c0(expression = "android.os.Build.VERSION.SDK_INT >= 32", imports = {}))
    @n
    public static final boolean l() {
        int v = Build.VERSION.SDK_INT;
        if(v < 0x20) {
            if(v >= 0x1F) {
                String s = Build.VERSION.CODENAME;
                L.o(s, "CODENAME");
                return BuildCompat.g("Sv2", s);
            }
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(api = 33, codename = "Tiramisu")
    @k(message = "Android Tiramisu is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 33`.", replaceWith = @c0(expression = "android.os.Build.VERSION.SDK_INT >= 33", imports = {}))
    @n
    public static final boolean m() {
        int v = Build.VERSION.SDK_INT;
        if(v < 33) {
            if(v >= 0x20) {
                String s = Build.VERSION.CODENAME;
                L.o(s, "CODENAME");
                return BuildCompat.g("Tiramisu", s);
            }
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(api = 34, codename = "UpsideDownCake")
    @k(message = "Android UpsideDownCase is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 34`.", replaceWith = @c0(expression = "android.os.Build.VERSION.SDK_INT >= 34", imports = {}))
    @n
    public static final boolean n() {
        int v = Build.VERSION.SDK_INT;
        if(v < 34) {
            if(v >= 33) {
                String s = Build.VERSION.CODENAME;
                L.o(s, "CODENAME");
                return BuildCompat.g("UpsideDownCake", s);
            }
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(api = 35, codename = "VanillaIceCream")
    @k(message = "Android VanillaIceCream is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 35`.", replaceWith = @c0(expression = "android.os.Build.VERSION.SDK_INT >= 35", imports = {}))
    @n
    public static final boolean o() {
        int v = Build.VERSION.SDK_INT;
        if(v < 35) {
            if(v >= 34) {
                String s = Build.VERSION.CODENAME;
                L.o(s, "CODENAME");
                return BuildCompat.g("VanillaIceCream", s);
            }
            return false;
        }
        return true;
    }
}

