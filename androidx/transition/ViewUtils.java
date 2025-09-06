package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class ViewUtils {
    private static final ViewUtilsApi19 a = null;
    private static final String b = "ViewUtils";
    static final Property c;
    static final Property d;

    static {
        int v = Build.VERSION.SDK_INT;
        if(v >= 29) {
            ViewUtils.a = new ViewUtilsApi29();
        }
        else if(v >= 23) {
            ViewUtils.a = new ViewUtilsApi23();
        }
        else if(v >= 22) {
            ViewUtils.a = new ViewUtilsApi22();
        }
        else {
            ViewUtils.a = new ViewUtilsApi21();
        }
        ViewUtils.c = new Property(Float.class, "translationAlpha") {
            public Float a(View view0) {
                return ViewUtils.b(view0);
            }

            public void b(View view0, Float float0) {
                ViewUtils.f(view0, ((float)float0));
            }

            @Override  // android.util.Property
            public Object get(Object object0) {
                return this.a(((View)object0));
            }

            @Override  // android.util.Property
            public void set(Object object0, Object object1) {
                this.b(((View)object0), ((Float)object1));
            }
        };
        ViewUtils.d = new Property(Rect.class, "clipBounds") {
            public Rect a(View view0) {
                return view0.getClipBounds();
            }

            public void b(View view0, Rect rect0) {
                view0.setClipBounds(rect0);
            }

            @Override  // android.util.Property
            public Object get(Object object0) {
                return this.a(((View)object0));
            }

            @Override  // android.util.Property
            public void set(Object object0, Object object1) {
                this.b(((View)object0), ((Rect)object1));
            }
        };
    }

    static void a(@NonNull View view0) {
    }

    static float b(@NonNull View view0) {
        return ViewUtils.a.c(view0);
    }

    static void c(@NonNull View view0) {
    }

    static void d(@NonNull View view0, @Nullable Matrix matrix0) {
        ViewUtils.a.e(view0, matrix0);
    }

    static void e(@NonNull View view0, int v, int v1, int v2, int v3) {
        ViewUtils.a.f(view0, v, v1, v2, v3);
    }

    static void f(@NonNull View view0, float f) {
        ViewUtils.a.g(view0, f);
    }

    static void g(@NonNull View view0, int v) {
        ViewUtils.a.h(view0, v);
    }

    static void h(@NonNull View view0, @NonNull Matrix matrix0) {
        ViewUtils.a.i(view0, matrix0);
    }

    static void i(@NonNull View view0, @NonNull Matrix matrix0) {
        ViewUtils.a.j(view0, matrix0);
    }
}

