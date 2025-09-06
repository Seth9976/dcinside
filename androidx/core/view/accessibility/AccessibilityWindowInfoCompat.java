package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.RequiresApi;
import androidx.core.os.LocaleListCompat;

public class AccessibilityWindowInfoCompat {
    @RequiresApi(21)
    static class Api21Impl {
        static void a(AccessibilityWindowInfo accessibilityWindowInfo0, Rect rect0) {
            accessibilityWindowInfo0.getBoundsInScreen(rect0);
        }

        static AccessibilityWindowInfo b(AccessibilityWindowInfo accessibilityWindowInfo0, int v) {
            return accessibilityWindowInfo0.getChild(v);
        }

        static int c(AccessibilityWindowInfo accessibilityWindowInfo0) {
            return accessibilityWindowInfo0.getChildCount();
        }

        static int d(AccessibilityWindowInfo accessibilityWindowInfo0) {
            return accessibilityWindowInfo0.getId();
        }

        static int e(AccessibilityWindowInfo accessibilityWindowInfo0) {
            return accessibilityWindowInfo0.getLayer();
        }

        static AccessibilityWindowInfo f(AccessibilityWindowInfo accessibilityWindowInfo0) {
            return accessibilityWindowInfo0.getParent();
        }

        static AccessibilityNodeInfo g(AccessibilityWindowInfo accessibilityWindowInfo0) {
            return accessibilityWindowInfo0.getRoot();
        }

        static int h(AccessibilityWindowInfo accessibilityWindowInfo0) {
            return accessibilityWindowInfo0.getType();
        }

        static boolean i(AccessibilityWindowInfo accessibilityWindowInfo0) {
            return accessibilityWindowInfo0.isAccessibilityFocused();
        }

        static boolean j(AccessibilityWindowInfo accessibilityWindowInfo0) {
            return accessibilityWindowInfo0.isActive();
        }

        static boolean k(AccessibilityWindowInfo accessibilityWindowInfo0) {
            return accessibilityWindowInfo0.isFocused();
        }

        static AccessibilityWindowInfo l() {
            return AccessibilityWindowInfo.obtain();
        }

        static AccessibilityWindowInfo m(AccessibilityWindowInfo accessibilityWindowInfo0) {
            return AccessibilityWindowInfo.obtain(accessibilityWindowInfo0);
        }
    }

    @RequiresApi(24)
    static class Api24Impl {
        static AccessibilityNodeInfo a(AccessibilityWindowInfo accessibilityWindowInfo0) {
            return accessibilityWindowInfo0.getAnchor();
        }

        static CharSequence b(AccessibilityWindowInfo accessibilityWindowInfo0) {
            return accessibilityWindowInfo0.getTitle();
        }
    }

    @RequiresApi(26)
    static class Api26Impl {
        static boolean a(AccessibilityWindowInfo accessibilityWindowInfo0) {
            return accessibilityWindowInfo0.isInPictureInPictureMode();
        }
    }

    @RequiresApi(30)
    static class Api30Impl {
        static AccessibilityWindowInfo a() {
            return new AccessibilityWindowInfo();
        }
    }

    @RequiresApi(33)
    static class Api33Impl {
        static int a(AccessibilityWindowInfo accessibilityWindowInfo0) {
            return accessibilityWindowInfo0.getDisplayId();
        }

        static void b(AccessibilityWindowInfo accessibilityWindowInfo0, Region region0) {
            accessibilityWindowInfo0.getRegionInScreen(region0);
        }

        public static AccessibilityNodeInfoCompat c(Object object0, int v) {
            return AccessibilityNodeInfoCompat.u2(((AccessibilityWindowInfo)object0).getRoot(v));
        }
    }

    @RequiresApi(34)
    static class Api34Impl {
        static LocaleList a(AccessibilityWindowInfo accessibilityWindowInfo0) {
            return accessibilityWindowInfo0.getLocales();
        }

        public static long b(AccessibilityWindowInfo accessibilityWindowInfo0) {
            return accessibilityWindowInfo0.getTransitionTimeMillis();
        }
    }

    private final Object a;
    private static final int b = -1;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;

    public AccessibilityWindowInfoCompat() {
        if(Build.VERSION.SDK_INT >= 30) {
            this.a = Api30Impl.a();
            return;
        }
        this.a = null;
    }

    private AccessibilityWindowInfoCompat(Object object0) {
        this.a = object0;
    }

    public AccessibilityNodeInfoCompat a() {
        return Build.VERSION.SDK_INT < 24 ? null : AccessibilityNodeInfoCompat.u2(Api24Impl.a(((AccessibilityWindowInfo)this.a)));
    }

    public void b(Rect rect0) {
        Api21Impl.a(((AccessibilityWindowInfo)this.a), rect0);
    }

    public AccessibilityWindowInfoCompat c(int v) {
        return AccessibilityWindowInfoCompat.y(Api21Impl.b(((AccessibilityWindowInfo)this.a), v));
    }

    public int d() {
        return Api21Impl.c(((AccessibilityWindowInfo)this.a));
    }

    public int e() {
        return Build.VERSION.SDK_INT < 33 ? 0 : Api33Impl.a(((AccessibilityWindowInfo)this.a));
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AccessibilityWindowInfoCompat)) {
            return false;
        }
        return this.a == null ? ((AccessibilityWindowInfoCompat)object0).a == null : this.a.equals(((AccessibilityWindowInfoCompat)object0).a);
    }

    public int f() {
        return Api21Impl.d(((AccessibilityWindowInfo)this.a));
    }

    public int g() {
        return Api21Impl.e(((AccessibilityWindowInfo)this.a));
    }

    public LocaleListCompat h() {
        return Build.VERSION.SDK_INT < 34 ? LocaleListCompat.g() : LocaleListCompat.o(Api34Impl.a(((AccessibilityWindowInfo)this.a)));
    }

    @Override
    public int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    public AccessibilityWindowInfoCompat i() {
        return AccessibilityWindowInfoCompat.y(Api21Impl.f(((AccessibilityWindowInfo)this.a)));
    }

    public void j(Region region0) {
        if(Build.VERSION.SDK_INT >= 33) {
            Api33Impl.b(((AccessibilityWindowInfo)this.a), region0);
            return;
        }
        Rect rect0 = new Rect();
        Api21Impl.a(((AccessibilityWindowInfo)this.a), rect0);
        region0.set(rect0);
    }

    public AccessibilityNodeInfoCompat k() {
        return AccessibilityNodeInfoCompat.u2(Api21Impl.g(((AccessibilityWindowInfo)this.a)));
    }

    public AccessibilityNodeInfoCompat l(int v) {
        return Build.VERSION.SDK_INT < 33 ? this.k() : Api33Impl.c(this.a, v);
    }

    public CharSequence m() {
        return Build.VERSION.SDK_INT < 24 ? null : Api24Impl.b(((AccessibilityWindowInfo)this.a));
    }

    public long n() {
        return Build.VERSION.SDK_INT < 34 ? 0L : Api34Impl.b(((AccessibilityWindowInfo)this.a));
    }

    public int o() {
        return Api21Impl.h(((AccessibilityWindowInfo)this.a));
    }

    public boolean p() {
        return Api21Impl.i(((AccessibilityWindowInfo)this.a));
    }

    public boolean q() {
        return Api21Impl.j(((AccessibilityWindowInfo)this.a));
    }

    public boolean r() {
        return Api21Impl.k(((AccessibilityWindowInfo)this.a));
    }

    public boolean s() {
        return Build.VERSION.SDK_INT < 26 ? false : Api26Impl.a(((AccessibilityWindowInfo)this.a));
    }

    public static AccessibilityWindowInfoCompat t() {
        return AccessibilityWindowInfoCompat.y(Api21Impl.l());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        Rect rect0 = new Rect();
        this.b(rect0);
        stringBuilder0.append("AccessibilityWindowInfo[");
        stringBuilder0.append("id=");
        stringBuilder0.append(this.f());
        stringBuilder0.append(", type=");
        stringBuilder0.append(AccessibilityWindowInfoCompat.w(this.o()));
        stringBuilder0.append(", layer=");
        stringBuilder0.append(this.g());
        stringBuilder0.append(", bounds=");
        stringBuilder0.append(rect0);
        stringBuilder0.append(", focused=");
        stringBuilder0.append(this.r());
        stringBuilder0.append(", active=");
        stringBuilder0.append(this.q());
        stringBuilder0.append(", hasParent=");
        boolean z = false;
        stringBuilder0.append(this.i() != null);
        stringBuilder0.append(", hasChildren=");
        if(this.d() > 0) {
            z = true;
        }
        stringBuilder0.append(z);
        stringBuilder0.append(", transitionTime=");
        stringBuilder0.append(this.n());
        stringBuilder0.append(", locales=");
        stringBuilder0.append(this.h());
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }

    public static AccessibilityWindowInfoCompat u(AccessibilityWindowInfoCompat accessibilityWindowInfoCompat0) {
        return accessibilityWindowInfoCompat0 == null ? null : AccessibilityWindowInfoCompat.y(Api21Impl.m(((AccessibilityWindowInfo)accessibilityWindowInfoCompat0.a)));
    }

    @Deprecated
    public void v() {
    }

    private static String w(int v) {
        switch(v) {
            case 1: {
                return "TYPE_APPLICATION";
            }
            case 2: {
                return "TYPE_INPUT_METHOD";
            }
            case 3: {
                return "TYPE_SYSTEM";
            }
            case 4: {
                return "TYPE_ACCESSIBILITY_OVERLAY";
            }
            default: {
                return "<UNKNOWN>";
            }
        }
    }

    public AccessibilityWindowInfo x() {
        return (AccessibilityWindowInfo)this.a;
    }

    static AccessibilityWindowInfoCompat y(Object object0) {
        return object0 == null ? null : new AccessibilityWindowInfoCompat(object0);
    }
}

