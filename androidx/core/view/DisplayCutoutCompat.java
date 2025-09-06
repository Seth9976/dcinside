package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.DisplayCutout.Builder;
import android.view.DisplayCutout;
import androidx.annotation.RequiresApi;
import androidx.core.util.ObjectsCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class DisplayCutoutCompat {
    @RequiresApi(28)
    static class Api28Impl {
        static DisplayCutout a(Rect rect0, List list0) {
            return new DisplayCutout(rect0, list0);
        }

        static List b(DisplayCutout displayCutout0) {
            return displayCutout0.getBoundingRects();
        }

        static int c(DisplayCutout displayCutout0) {
            return displayCutout0.getSafeInsetBottom();
        }

        static int d(DisplayCutout displayCutout0) {
            return displayCutout0.getSafeInsetLeft();
        }

        static int e(DisplayCutout displayCutout0) {
            return displayCutout0.getSafeInsetRight();
        }

        static int f(DisplayCutout displayCutout0) {
            return displayCutout0.getSafeInsetTop();
        }
    }

    @RequiresApi(29)
    static class Api29Impl {
        static DisplayCutout a(Insets insets0, Rect rect0, Rect rect1, Rect rect2, Rect rect3) {
            return new DisplayCutout(insets0, rect0, rect1, rect2, rect3);
        }
    }

    @RequiresApi(30)
    static class Api30Impl {
        static DisplayCutout a(Insets insets0, Rect rect0, Rect rect1, Rect rect2, Rect rect3, Insets insets1) {
            return new DisplayCutout(insets0, rect0, rect1, rect2, rect3, insets1);
        }

        static Insets b(DisplayCutout displayCutout0) {
            return displayCutout0.getWaterfallInsets();
        }
    }

    @RequiresApi(0x1F)
    static class Api31Impl {
        static Path a(DisplayCutout displayCutout0) {
            return displayCutout0.getCutoutPath();
        }
    }

    @RequiresApi(33)
    static class Api33Impl {
        static DisplayCutout a(Insets insets0, Rect rect0, Rect rect1, Rect rect2, Rect rect3, Insets insets1, Path path0) {
            DisplayCutout.Builder displayCutout$Builder0 = new DisplayCutout.Builder().setSafeInsets(insets0).setWaterfallInsets(insets1);
            if(rect0 != null) {
                displayCutout$Builder0.setBoundingRectLeft(rect0);
            }
            if(rect1 != null) {
                displayCutout$Builder0.setBoundingRectTop(rect1);
            }
            if(rect2 != null) {
                displayCutout$Builder0.setBoundingRectRight(rect2);
            }
            if(rect3 != null) {
                displayCutout$Builder0.setBoundingRectBottom(rect3);
            }
            if(path0 != null) {
                displayCutout$Builder0.setCutoutPath(path0);
            }
            return displayCutout$Builder0.build();
        }
    }

    private final DisplayCutout a;

    public DisplayCutoutCompat(Rect rect0, List list0) {
        this((Build.VERSION.SDK_INT < 28 ? null : Api28Impl.a(rect0, list0)));
    }

    private DisplayCutoutCompat(DisplayCutout displayCutout0) {
        this.a = displayCutout0;
    }

    public DisplayCutoutCompat(androidx.core.graphics.Insets insets0, Rect rect0, Rect rect1, Rect rect2, Rect rect3, androidx.core.graphics.Insets insets1) {
        this(DisplayCutoutCompat.a(insets0, rect0, rect1, rect2, rect3, insets1, null));
    }

    public DisplayCutoutCompat(androidx.core.graphics.Insets insets0, Rect rect0, Rect rect1, Rect rect2, Rect rect3, androidx.core.graphics.Insets insets1, Path path0) {
        this(DisplayCutoutCompat.a(insets0, rect0, rect1, rect2, rect3, insets1, path0));
    }

    private static DisplayCutout a(androidx.core.graphics.Insets insets0, Rect rect0, Rect rect1, Rect rect2, Rect rect3, androidx.core.graphics.Insets insets1, Path path0) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 33) {
            return Api33Impl.a(insets0.h(), rect0, rect1, rect2, rect3, insets1.h(), path0);
        }
        if(v >= 30) {
            return Api30Impl.a(insets0.h(), rect0, rect1, rect2, rect3, insets1.h());
        }
        if(v >= 29) {
            return Api29Impl.a(insets0.h(), rect0, rect1, rect2, rect3);
        }
        if(v >= 28) {
            Rect rect4 = new Rect(insets0.a, insets0.b, insets0.c, insets0.d);
            ArrayList arrayList0 = new ArrayList();
            if(rect0 != null) {
                arrayList0.add(rect0);
            }
            if(rect1 != null) {
                arrayList0.add(rect1);
            }
            if(rect2 != null) {
                arrayList0.add(rect2);
            }
            if(rect3 != null) {
                arrayList0.add(rect3);
            }
            return Api28Impl.a(rect4, arrayList0);
        }
        return null;
    }

    public List b() {
        return Build.VERSION.SDK_INT < 28 ? Collections.emptyList() : Api28Impl.b(this.a);
    }

    public Path c() {
        return Build.VERSION.SDK_INT < 0x1F ? null : Api31Impl.a(this.a);
    }

    public int d() {
        return Build.VERSION.SDK_INT < 28 ? 0 : Api28Impl.c(this.a);
    }

    public int e() {
        return Build.VERSION.SDK_INT < 28 ? 0 : Api28Impl.d(this.a);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return DisplayCutoutCompat.class == class0 ? ObjectsCompat.a(this.a, ((DisplayCutoutCompat)object0).a) : false;
        }
        return false;
    }

    public int f() {
        return Build.VERSION.SDK_INT < 28 ? 0 : Api28Impl.e(this.a);
    }

    public int g() {
        return Build.VERSION.SDK_INT < 28 ? 0 : Api28Impl.f(this.a);
    }

    public androidx.core.graphics.Insets h() {
        return Build.VERSION.SDK_INT < 30 ? androidx.core.graphics.Insets.e : androidx.core.graphics.Insets.g(Api30Impl.b(this.a));
    }

    @Override
    public int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @RequiresApi(28)
    DisplayCutout i() {
        return this.a;
    }

    static DisplayCutoutCompat j(DisplayCutout displayCutout0) {
        return displayCutout0 == null ? null : new DisplayCutoutCompat(displayCutout0);
    }

    @Override
    public String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}

