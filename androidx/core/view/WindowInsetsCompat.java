package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets.Builder;
import android.view.WindowInsets;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.Insets;
import androidx.core.splashscreen.h;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import j..util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class WindowInsetsCompat {
    @SuppressLint({"SoonBlockedPrivateApi"})
    @RequiresApi(21)
    static class Api21ReflectionHolder {
        private static Field a;
        private static Field b;
        private static Field c;
        private static boolean d;

        static {
            try {
                Field field0 = View.class.getDeclaredField("mAttachInfo");
                Api21ReflectionHolder.a = field0;
                field0.setAccessible(true);
                Class class0 = Class.forName("android.view.View$AttachInfo");
                Field field1 = class0.getDeclaredField("mStableInsets");
                Api21ReflectionHolder.b = field1;
                field1.setAccessible(true);
                Field field2 = class0.getDeclaredField("mContentInsets");
                Api21ReflectionHolder.c = field2;
                field2.setAccessible(true);
                Api21ReflectionHolder.d = true;
            }
            catch(ReflectiveOperationException reflectiveOperationException0) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + reflectiveOperationException0.getMessage(), reflectiveOperationException0);
            }
        }

        public static WindowInsetsCompat a(View view0) {
            if(Api21ReflectionHolder.d && view0.isAttachedToWindow()) {
                View view1 = view0.getRootView();
                try {
                    Object object0 = Api21ReflectionHolder.a.get(view1);
                    if(object0 != null) {
                        Rect rect0 = (Rect)Api21ReflectionHolder.b.get(object0);
                        Rect rect1 = (Rect)Api21ReflectionHolder.c.get(object0);
                        if(rect0 != null && rect1 != null) {
                            WindowInsetsCompat windowInsetsCompat0 = new Builder().f(Insets.e(rect0)).h(Insets.e(rect1)).a();
                            windowInsetsCompat0.H(windowInsetsCompat0);
                            windowInsetsCompat0.d(view0.getRootView());
                            return windowInsetsCompat0;
                        }
                    }
                }
                catch(IllegalAccessException illegalAccessException0) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + illegalAccessException0.getMessage(), illegalAccessException0);
                }
            }
            return null;
        }
    }

    public static final class Builder {
        private final BuilderImpl a;

        public Builder() {
            int v = Build.VERSION.SDK_INT;
            if(v >= 34) {
                this.a = new BuilderImpl34();
                return;
            }
            if(v >= 30) {
                this.a = new BuilderImpl30();
                return;
            }
            if(v >= 29) {
                this.a = new BuilderImpl29();
                return;
            }
            this.a = new BuilderImpl20();
        }

        public Builder(WindowInsetsCompat windowInsetsCompat0) {
            int v = Build.VERSION.SDK_INT;
            if(v >= 34) {
                this.a = new BuilderImpl34(windowInsetsCompat0);
                return;
            }
            if(v >= 30) {
                this.a = new BuilderImpl30(windowInsetsCompat0);
                return;
            }
            if(v >= 29) {
                this.a = new BuilderImpl29(windowInsetsCompat0);
                return;
            }
            this.a = new BuilderImpl20(windowInsetsCompat0);
        }

        public WindowInsetsCompat a() {
            return this.a.b();
        }

        public Builder b(DisplayCutoutCompat displayCutoutCompat0) {
            this.a.c(displayCutoutCompat0);
            return this;
        }

        public Builder c(int v, Insets insets0) {
            this.a.d(v, insets0);
            return this;
        }

        public Builder d(int v, Insets insets0) {
            this.a.e(v, insets0);
            return this;
        }

        @Deprecated
        public Builder e(Insets insets0) {
            this.a.f(insets0);
            return this;
        }

        @Deprecated
        public Builder f(Insets insets0) {
            this.a.g(insets0);
            return this;
        }

        @Deprecated
        public Builder g(Insets insets0) {
            this.a.h(insets0);
            return this;
        }

        @Deprecated
        public Builder h(Insets insets0) {
            this.a.i(insets0);
            return this;
        }

        @Deprecated
        public Builder i(Insets insets0) {
            this.a.j(insets0);
            return this;
        }

        public Builder j(int v, boolean z) {
            this.a.k(v, z);
            return this;
        }
    }

    @RequiresApi(api = 20)
    static class BuilderImpl20 extends BuilderImpl {
        private WindowInsets c;
        private Insets d;
        private static Field e = null;
        private static boolean f = false;
        private static Constructor g = null;
        private static boolean h = false;

        static {
        }

        BuilderImpl20() {
            this.c = BuilderImpl20.l();
        }

        BuilderImpl20(WindowInsetsCompat windowInsetsCompat0) {
            super(windowInsetsCompat0);
            this.c = windowInsetsCompat0.K();
        }

        @Override  // androidx.core.view.WindowInsetsCompat$BuilderImpl
        WindowInsetsCompat b() {
            this.a();
            WindowInsetsCompat windowInsetsCompat0 = WindowInsetsCompat.L(this.c);
            windowInsetsCompat0.F(this.b);
            windowInsetsCompat0.I(this.d);
            return windowInsetsCompat0;
        }

        @Override  // androidx.core.view.WindowInsetsCompat$BuilderImpl
        void g(Insets insets0) {
            this.d = insets0;
        }

        @Override  // androidx.core.view.WindowInsetsCompat$BuilderImpl
        void i(Insets insets0) {
            WindowInsets windowInsets0 = this.c;
            if(windowInsets0 != null) {
                this.c = windowInsets0.replaceSystemWindowInsets(insets0.a, insets0.b, insets0.c, insets0.d);
            }
        }

        private static WindowInsets l() {
            Class class0 = WindowInsets.class;
            if(!BuilderImpl20.f) {
                try {
                    BuilderImpl20.e = class0.getDeclaredField("CONSUMED");
                }
                catch(ReflectiveOperationException reflectiveOperationException0) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", reflectiveOperationException0);
                }
                BuilderImpl20.f = true;
            }
            Field field0 = BuilderImpl20.e;
            if(field0 != null) {
                try {
                    WindowInsets windowInsets0 = (WindowInsets)field0.get(null);
                    if(windowInsets0 != null) {
                        return new WindowInsets(windowInsets0);
                    }
                }
                catch(ReflectiveOperationException reflectiveOperationException1) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", reflectiveOperationException1);
                }
            }
            if(!BuilderImpl20.h) {
                try {
                    BuilderImpl20.g = class0.getConstructor(Rect.class);
                }
                catch(ReflectiveOperationException reflectiveOperationException2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", reflectiveOperationException2);
                }
                BuilderImpl20.h = true;
            }
            Constructor constructor0 = BuilderImpl20.g;
            if(constructor0 != null) {
                try {
                    return (WindowInsets)constructor0.newInstance(new Rect());
                }
                catch(ReflectiveOperationException reflectiveOperationException3) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", reflectiveOperationException3);
                }
            }
            return null;
        }
    }

    @RequiresApi(api = 29)
    static class BuilderImpl29 extends BuilderImpl {
        final WindowInsets.Builder c;

        BuilderImpl29() {
            this.c = h.a();
        }

        BuilderImpl29(WindowInsetsCompat windowInsetsCompat0) {
            super(windowInsetsCompat0);
            WindowInsets windowInsets0 = windowInsetsCompat0.K();
            this.c = windowInsets0 == null ? h.a() : q0.a(windowInsets0);
        }

        @Override  // androidx.core.view.WindowInsetsCompat$BuilderImpl
        WindowInsetsCompat b() {
            this.a();
            WindowInsetsCompat windowInsetsCompat0 = WindowInsetsCompat.L(this.c.build());
            windowInsetsCompat0.F(this.b);
            return windowInsetsCompat0;
        }

        @Override  // androidx.core.view.WindowInsetsCompat$BuilderImpl
        void c(DisplayCutoutCompat displayCutoutCompat0) {
            this.c.setDisplayCutout((displayCutoutCompat0 == null ? null : displayCutoutCompat0.i()));
        }

        @Override  // androidx.core.view.WindowInsetsCompat$BuilderImpl
        void f(Insets insets0) {
            android.graphics.Insets insets1 = insets0.h();
            this.c.setMandatorySystemGestureInsets(insets1);
        }

        @Override  // androidx.core.view.WindowInsetsCompat$BuilderImpl
        void g(Insets insets0) {
            android.graphics.Insets insets1 = insets0.h();
            this.c.setStableInsets(insets1);
        }

        @Override  // androidx.core.view.WindowInsetsCompat$BuilderImpl
        void h(Insets insets0) {
            android.graphics.Insets insets1 = insets0.h();
            this.c.setSystemGestureInsets(insets1);
        }

        @Override  // androidx.core.view.WindowInsetsCompat$BuilderImpl
        void i(Insets insets0) {
            android.graphics.Insets insets1 = insets0.h();
            this.c.setSystemWindowInsets(insets1);
        }

        @Override  // androidx.core.view.WindowInsetsCompat$BuilderImpl
        void j(Insets insets0) {
            android.graphics.Insets insets1 = insets0.h();
            this.c.setTappableElementInsets(insets1);
        }
    }

    @RequiresApi(30)
    static class BuilderImpl30 extends BuilderImpl29 {
        BuilderImpl30() {
        }

        BuilderImpl30(WindowInsetsCompat windowInsetsCompat0) {
            super(windowInsetsCompat0);
        }

        @Override  // androidx.core.view.WindowInsetsCompat$BuilderImpl
        void d(int v, Insets insets0) {
            int v1 = TypeImpl30.a(v);
            android.graphics.Insets insets1 = insets0.h();
            this.c.setInsets(v1, insets1);
        }

        @Override  // androidx.core.view.WindowInsetsCompat$BuilderImpl
        void e(int v, Insets insets0) {
            int v1 = TypeImpl30.a(v);
            android.graphics.Insets insets1 = insets0.h();
            this.c.setInsetsIgnoringVisibility(v1, insets1);
        }

        @Override  // androidx.core.view.WindowInsetsCompat$BuilderImpl
        void k(int v, boolean z) {
            int v1 = TypeImpl30.a(v);
            this.c.setVisible(v1, z);
        }
    }

    @RequiresApi(34)
    static class BuilderImpl34 extends BuilderImpl30 {
        BuilderImpl34() {
        }

        BuilderImpl34(WindowInsetsCompat windowInsetsCompat0) {
            super(windowInsetsCompat0);
        }

        @Override  // androidx.core.view.WindowInsetsCompat$BuilderImpl30
        void d(int v, Insets insets0) {
            int v1 = TypeImpl34.a(v);
            android.graphics.Insets insets1 = insets0.h();
            this.c.setInsets(v1, insets1);
        }

        @Override  // androidx.core.view.WindowInsetsCompat$BuilderImpl30
        void e(int v, Insets insets0) {
            int v1 = TypeImpl34.a(v);
            android.graphics.Insets insets1 = insets0.h();
            this.c.setInsetsIgnoringVisibility(v1, insets1);
        }

        @Override  // androidx.core.view.WindowInsetsCompat$BuilderImpl30
        void k(int v, boolean z) {
            int v1 = TypeImpl34.a(v);
            this.c.setVisible(v1, z);
        }
    }

    static class BuilderImpl {
        private final WindowInsetsCompat a;
        Insets[] b;

        BuilderImpl() {
            this(new WindowInsetsCompat(null));
        }

        BuilderImpl(WindowInsetsCompat windowInsetsCompat0) {
            this.a = windowInsetsCompat0;
        }

        protected final void a() {
            Insets[] arr_insets = this.b;
            if(arr_insets != null) {
                Insets insets0 = arr_insets[Type.e(1)];
                Insets[] arr_insets1 = this.b;
                Insets insets1 = arr_insets1[Type.e(2)];
                if(insets1 == null) {
                    insets1 = this.a.f(2);
                }
                if(insets0 == null) {
                    insets0 = this.a.f(1);
                }
                this.i(Insets.b(insets0, insets1));
                Insets[] arr_insets2 = this.b;
                Insets insets2 = arr_insets2[Type.e(16)];
                if(insets2 != null) {
                    this.h(insets2);
                }
                Insets[] arr_insets3 = this.b;
                Insets insets3 = arr_insets3[Type.e(0x20)];
                if(insets3 != null) {
                    this.f(insets3);
                }
                Insets[] arr_insets4 = this.b;
                Insets insets4 = arr_insets4[Type.e(0x40)];
                if(insets4 != null) {
                    this.j(insets4);
                }
            }
        }

        WindowInsetsCompat b() {
            this.a();
            return this.a;
        }

        void c(DisplayCutoutCompat displayCutoutCompat0) {
        }

        void d(int v, Insets insets0) {
            if(this.b == null) {
                this.b = new Insets[10];
            }
            for(int v1 = 1; v1 <= 0x200; v1 <<= 1) {
                if((v & v1) != 0) {
                    Insets[] arr_insets = this.b;
                    arr_insets[Type.e(v1)] = insets0;
                }
            }
        }

        void e(int v, Insets insets0) {
            if(v == 8) {
                throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
            }
        }

        void f(Insets insets0) {
        }

        void g(Insets insets0) {
        }

        void h(Insets insets0) {
        }

        void i(Insets insets0) {
        }

        void j(Insets insets0) {
        }

        void k(int v, boolean z) {
        }
    }

    @RequiresApi(20)
    static class Impl20 extends Impl {
        final WindowInsets c;
        private Insets[] d;
        private Insets e;
        private WindowInsetsCompat f;
        Insets g;
        int h;
        private static final int i = 6;
        private static boolean j = false;
        private static Method k;
        private static Class l;
        private static Field m;
        private static Field n;

        static {
        }

        Impl20(WindowInsetsCompat windowInsetsCompat0, WindowInsets windowInsets0) {
            super(windowInsetsCompat0);
            this.e = null;
            this.c = windowInsets0;
        }

        Impl20(WindowInsetsCompat windowInsetsCompat0, Impl20 windowInsetsCompat$Impl200) {
            this(windowInsetsCompat0, new WindowInsets(windowInsetsCompat$Impl200.c));
        }

        protected boolean A(int v) {
            switch(v) {
                case 4: {
                    return false;
                }
                case 1: 
                case 2: 
                case 8: 
                case 0x80: {
                    return !this.x(v, false).equals(Insets.e);
                }
                default: {
                    return true;
                }
            }
        }

        @SuppressLint({"PrivateApi"})
        private static void B() {
            try {
                Impl20.k = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class class0 = Class.forName("android.view.View$AttachInfo");
                Impl20.l = class0;
                Impl20.m = class0.getDeclaredField("mVisibleInsets");
                Impl20.n = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                Impl20.m.setAccessible(true);
                Impl20.n.setAccessible(true);
            }
            catch(ReflectiveOperationException reflectiveOperationException0) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + reflectiveOperationException0.getMessage(), reflectiveOperationException0);
            }
            Impl20.j = true;
        }

        static boolean C(int v, int v1) {
            return (v & 6) == (v1 & 6);
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl
        void d(View view0) {
            Insets insets0 = this.z(view0);
            if(insets0 == null) {
                insets0 = Insets.e;
            }
            this.s(insets0);
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl
        void e(WindowInsetsCompat windowInsetsCompat0) {
            windowInsetsCompat0.H(this.f);
            windowInsetsCompat0.G(this.g);
            windowInsetsCompat0.J(this.h);
        }

        // 去混淆评级： 低(30)
        @Override  // androidx.core.view.WindowInsetsCompat$Impl
        public boolean equals(Object object0) {
            return super.equals(object0) ? Objects.equals(this.g, ((Impl20)object0).g) && Impl20.C(this.h, ((Impl20)object0).h) : false;
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl
        public Insets g(int v) {
            return this.w(v, false);
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl
        public Insets h(int v) {
            return this.w(v, true);
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl
        final Insets l() {
            if(this.e == null) {
                this.e = Insets.d(this.c.getSystemWindowInsetLeft(), this.c.getSystemWindowInsetTop(), this.c.getSystemWindowInsetRight(), this.c.getSystemWindowInsetBottom());
            }
            return this.e;
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl
        WindowInsetsCompat n(int v, int v1, int v2, int v3) {
            Builder windowInsetsCompat$Builder0 = new Builder(WindowInsetsCompat.L(this.c));
            windowInsetsCompat$Builder0.h(WindowInsetsCompat.z(this.l(), v, v1, v2, v3));
            windowInsetsCompat$Builder0.f(WindowInsetsCompat.z(this.j(), v, v1, v2, v3));
            return windowInsetsCompat$Builder0.a();
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl
        boolean p() {
            return this.c.isRound();
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl
        @SuppressLint({"WrongConstant"})
        boolean q(int v) {
            for(int v1 = 1; v1 <= 0x200; v1 <<= 1) {
                if((v & v1) != 0 && !this.A(v1)) {
                    return false;
                }
            }
            return true;
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl
        public void r(Insets[] arr_insets) {
            this.d = arr_insets;
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl
        void s(Insets insets0) {
            this.g = insets0;
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl
        void t(WindowInsetsCompat windowInsetsCompat0) {
            this.f = windowInsetsCompat0;
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl
        void v(int v) {
            this.h = v;
        }

        @SuppressLint({"WrongConstant"})
        private Insets w(int v, boolean z) {
            Insets insets0 = Insets.e;
            for(int v1 = 1; v1 <= 0x200; v1 <<= 1) {
                if((v & v1) != 0) {
                    insets0 = Insets.b(insets0, this.x(v1, z));
                }
            }
            return insets0;
        }

        protected Insets x(int v, boolean z) {
            Insets insets0 = null;
            switch(v) {
                case 1: {
                    if(z) {
                        Insets insets1 = this.y();
                        Insets insets2 = this.l();
                        return Insets.d(0, Math.max(insets1.b, insets2.b), 0, 0);
                    }
                    return (this.h & 4) == 0 ? Insets.d(0, this.l().b, 0, 0) : Insets.e;
                }
                case 2: {
                    if(z) {
                        Insets insets3 = this.y();
                        Insets insets4 = this.j();
                        return Insets.d(Math.max(insets3.a, insets4.a), 0, Math.max(insets3.c, insets4.c), Math.max(insets3.d, insets4.d));
                    }
                    if((this.h & 2) != 0) {
                        return Insets.e;
                    }
                    Insets insets5 = this.l();
                    WindowInsetsCompat windowInsetsCompat0 = this.f;
                    if(windowInsetsCompat0 != null) {
                        insets0 = windowInsetsCompat0.m();
                    }
                    return Insets.d(insets5.a, 0, insets5.c, (insets0 == null ? insets5.d : Math.min(insets5.d, insets0.d)));
                }
                case 8: {
                    Insets[] arr_insets = this.d;
                    if(arr_insets != null) {
                        insets0 = arr_insets[Type.e(8)];
                    }
                    if(insets0 != null) {
                        return insets0;
                    }
                    Insets insets6 = this.l();
                    Insets insets7 = this.y();
                    int v1 = insets6.d;
                    if(v1 > insets7.d) {
                        return Insets.d(0, 0, 0, v1);
                    }
                    if(this.g != null && !this.g.equals(Insets.e)) {
                        int v2 = this.g.d;
                        return v2 <= insets7.d ? Insets.e : Insets.d(0, 0, 0, v2);
                    }
                    return Insets.e;
                }
                case 16: {
                    return this.k();
                }
                case 0x20: {
                    return this.i();
                }
                case 0x40: {
                    return this.m();
                }
                case 0x80: {
                    WindowInsetsCompat windowInsetsCompat1 = this.f;
                    DisplayCutoutCompat displayCutoutCompat0 = windowInsetsCompat1 == null ? this.f() : windowInsetsCompat1.e();
                    return displayCutoutCompat0 == null ? Insets.e : Insets.d(displayCutoutCompat0.e(), displayCutoutCompat0.g(), displayCutoutCompat0.f(), displayCutoutCompat0.d());
                }
                default: {
                    return Insets.e;
                }
            }
        }

        private Insets y() {
            return this.f == null ? Insets.e : this.f.m();
        }

        private Insets z(View view0) {
            if(Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if(!Impl20.j) {
                Impl20.B();
            }
            Method method0 = Impl20.k;
            if(method0 != null && Impl20.l != null && Impl20.m != null) {
                try {
                    Object object0 = method0.invoke(view0, null);
                    if(object0 == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Object object1 = Impl20.n.get(object0);
                    Rect rect0 = (Rect)Impl20.m.get(object1);
                    return rect0 == null ? null : Insets.e(rect0);
                }
                catch(ReflectiveOperationException reflectiveOperationException0) {
                }
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + reflectiveOperationException0.getMessage(), reflectiveOperationException0);
            }
            return null;
        }
    }

    @RequiresApi(21)
    static class Impl21 extends Impl20 {
        private Insets o;

        Impl21(WindowInsetsCompat windowInsetsCompat0, WindowInsets windowInsets0) {
            super(windowInsetsCompat0, windowInsets0);
            this.o = null;
        }

        Impl21(WindowInsetsCompat windowInsetsCompat0, Impl21 windowInsetsCompat$Impl210) {
            super(windowInsetsCompat0, windowInsetsCompat$Impl210);
            this.o = windowInsetsCompat$Impl210.o;
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl
        WindowInsetsCompat b() {
            return WindowInsetsCompat.L(this.c.consumeStableInsets());
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl
        WindowInsetsCompat c() {
            return WindowInsetsCompat.L(this.c.consumeSystemWindowInsets());
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl
        final Insets j() {
            if(this.o == null) {
                this.o = Insets.d(this.c.getStableInsetLeft(), this.c.getStableInsetTop(), this.c.getStableInsetRight(), this.c.getStableInsetBottom());
            }
            return this.o;
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl
        boolean o() {
            return this.c.isConsumed();
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl
        public void u(Insets insets0) {
            this.o = insets0;
        }
    }

    @RequiresApi(28)
    static class Impl28 extends Impl21 {
        Impl28(WindowInsetsCompat windowInsetsCompat0, WindowInsets windowInsets0) {
            super(windowInsetsCompat0, windowInsets0);
        }

        Impl28(WindowInsetsCompat windowInsetsCompat0, Impl28 windowInsetsCompat$Impl280) {
            super(windowInsetsCompat0, windowInsetsCompat$Impl280);
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl
        WindowInsetsCompat a() {
            return WindowInsetsCompat.L(this.c.consumeDisplayCutout());
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl20
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Impl28 ? Objects.equals(this.c, ((Impl28)object0).c) && Objects.equals(this.g, ((Impl28)object0).g) && Impl20.C(this.h, ((Impl28)object0).h) : false;
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl
        DisplayCutoutCompat f() {
            return DisplayCutoutCompat.j(this.c.getDisplayCutout());
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl
        public int hashCode() {
            return this.c.hashCode();
        }
    }

    @RequiresApi(29)
    static class Impl29 extends Impl28 {
        private Insets p;
        private Insets q;
        private Insets r;

        Impl29(WindowInsetsCompat windowInsetsCompat0, WindowInsets windowInsets0) {
            super(windowInsetsCompat0, windowInsets0);
            this.p = null;
            this.q = null;
            this.r = null;
        }

        Impl29(WindowInsetsCompat windowInsetsCompat0, Impl29 windowInsetsCompat$Impl290) {
            super(windowInsetsCompat0, windowInsetsCompat$Impl290);
            this.p = null;
            this.q = null;
            this.r = null;
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl
        Insets i() {
            if(this.q == null) {
                this.q = Insets.g(this.c.getMandatorySystemGestureInsets());
            }
            return this.q;
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl
        Insets k() {
            if(this.p == null) {
                this.p = Insets.g(this.c.getSystemGestureInsets());
            }
            return this.p;
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl
        Insets m() {
            if(this.r == null) {
                this.r = Insets.g(this.c.getTappableElementInsets());
            }
            return this.r;
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl20
        WindowInsetsCompat n(int v, int v1, int v2, int v3) {
            return WindowInsetsCompat.L(this.c.inset(v, v1, v2, v3));
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl21
        public void u(Insets insets0) {
        }
    }

    @RequiresApi(30)
    static class Impl30 extends Impl29 {
        static final WindowInsetsCompat s;

        static {
            Impl30.s = WindowInsetsCompat.L(WindowInsets.CONSUMED);
        }

        Impl30(WindowInsetsCompat windowInsetsCompat0, WindowInsets windowInsets0) {
            super(windowInsetsCompat0, windowInsets0);
        }

        Impl30(WindowInsetsCompat windowInsetsCompat0, Impl30 windowInsetsCompat$Impl300) {
            super(windowInsetsCompat0, windowInsetsCompat$Impl300);
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl20
        final void d(View view0) {
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl20
        public Insets g(int v) {
            int v1 = TypeImpl30.a(v);
            return Insets.g(this.c.getInsets(v1));
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl20
        public Insets h(int v) {
            int v1 = TypeImpl30.a(v);
            return Insets.g(this.c.getInsetsIgnoringVisibility(v1));
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl20
        public boolean q(int v) {
            int v1 = TypeImpl30.a(v);
            return this.c.isVisible(v1);
        }
    }

    @RequiresApi(34)
    static class Impl34 extends Impl30 {
        static final WindowInsetsCompat t;

        static {
            Impl34.t = WindowInsetsCompat.L(WindowInsets.CONSUMED);
        }

        Impl34(WindowInsetsCompat windowInsetsCompat0, WindowInsets windowInsets0) {
            super(windowInsetsCompat0, windowInsets0);
        }

        Impl34(WindowInsetsCompat windowInsetsCompat0, Impl34 windowInsetsCompat$Impl340) {
            super(windowInsetsCompat0, windowInsetsCompat$Impl340);
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl30
        public Insets g(int v) {
            int v1 = TypeImpl34.a(v);
            return Insets.g(this.c.getInsets(v1));
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl30
        public Insets h(int v) {
            int v1 = TypeImpl34.a(v);
            return Insets.g(this.c.getInsetsIgnoringVisibility(v1));
        }

        @Override  // androidx.core.view.WindowInsetsCompat$Impl30
        public boolean q(int v) {
            int v1 = TypeImpl34.a(v);
            return this.c.isVisible(v1);
        }
    }

    static class Impl {
        final WindowInsetsCompat a;
        static final WindowInsetsCompat b;

        static {
            Impl.b = new Builder().a().a().b().c();
        }

        Impl(WindowInsetsCompat windowInsetsCompat0) {
            this.a = windowInsetsCompat0;
        }

        WindowInsetsCompat a() {
            return this.a;
        }

        WindowInsetsCompat b() {
            return this.a;
        }

        WindowInsetsCompat c() {
            return this.a;
        }

        void d(View view0) {
        }

        void e(WindowInsetsCompat windowInsetsCompat0) {
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Impl ? this.p() == ((Impl)object0).p() && this.o() == ((Impl)object0).o() && ObjectsCompat.a(this.l(), ((Impl)object0).l()) && ObjectsCompat.a(this.j(), ((Impl)object0).j()) && ObjectsCompat.a(this.f(), ((Impl)object0).f()) : false;
        }

        DisplayCutoutCompat f() {
            return null;
        }

        Insets g(int v) {
            return Insets.e;
        }

        Insets h(int v) {
            if((v & 8) != 0) {
                throw new IllegalArgumentException("Unable to query the maximum insets for IME");
            }
            return Insets.e;
        }

        @Override
        public int hashCode() {
            Insets insets0 = this.l();
            Insets insets1 = this.j();
            return ObjectsCompat.b(new Object[]{Boolean.valueOf(this.p()), Boolean.valueOf(this.o()), insets0, insets1, this.f()});
        }

        Insets i() {
            return this.l();
        }

        Insets j() {
            return Insets.e;
        }

        Insets k() {
            return this.l();
        }

        Insets l() {
            return Insets.e;
        }

        Insets m() {
            return this.l();
        }

        WindowInsetsCompat n(int v, int v1, int v2, int v3) {
            return Impl.b;
        }

        boolean o() {
            return false;
        }

        boolean p() {
            return false;
        }

        boolean q(int v) {
            return true;
        }

        public void r(Insets[] arr_insets) {
        }

        void s(Insets insets0) {
        }

        void t(WindowInsetsCompat windowInsetsCompat0) {
        }

        public void u(Insets insets0) {
        }

        void v(int v) {
        }
    }

    public static final class Side {
        @RestrictTo({Scope.b})
        @Retention(RetentionPolicy.SOURCE)
        public @interface InsetsSide {
        }

        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 4;
        public static final int d = 8;

        public static int a() {
            return 15;
        }
    }

    public static final class Type {
        @RestrictTo({Scope.b})
        @Retention(RetentionPolicy.SOURCE)
        public @interface InsetsType {
        }

        static final int a = 1;
        static final int b = 1;
        static final int c = 2;
        static final int d = 4;
        static final int e = 8;
        static final int f = 16;
        static final int g = 0x20;
        static final int h = 0x40;
        static final int i = 0x80;
        static final int j = 0x100;
        static final int k = 0x200;
        static final int l = 0x200;
        static final int m = 10;

        @SuppressLint({"WrongConstant"})
        @RestrictTo({Scope.b})
        static int a() [...] // Inlined contents

        public static int b() [...] // Inlined contents

        public static int c() [...] // Inlined contents

        public static int d() [...] // Inlined contents

        static int e(int v) {
            switch(v) {
                case 1: {
                    return 0;
                }
                case 2: {
                    return 1;
                }
                case 4: {
                    return 2;
                }
                case 8: {
                    return 3;
                }
                case 16: {
                    return 4;
                }
                case 0x20: {
                    return 5;
                }
                case 0x40: {
                    return 6;
                }
                case 0x80: {
                    return 7;
                }
                case 0x100: {
                    return 8;
                }
                case 0x200: {
                    return 9;
                }
                default: {
                    throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + v);
                }
            }
        }

        public static int f() [...] // Inlined contents

        public static int g() [...] // Inlined contents

        public static int h() [...] // Inlined contents

        public static int i() [...] // Inlined contents

        public static int j() [...] // Inlined contents

        public static int k() {
            return 0x200;
        }

        public static int l() [...] // Inlined contents
    }

    @RequiresApi(30)
    static final class TypeImpl30 {
        static int a(int v) {
            int v1 = 0;
            for(int v2 = 1; v2 <= 0x200; v2 <<= 1) {
                if((v & v2) != 0) {
                    switch(v2) {
                        case 1: {
                            v1 |= E0.a();
                            break;
                        }
                        case 2: {
                            v1 |= F0.a();
                            break;
                        }
                        case 4: {
                            v1 |= G0.a();
                            break;
                        }
                        case 8: {
                            v1 |= z.a();
                            break;
                        }
                        case 16: {
                            v1 |= H0.a();
                            break;
                        }
                        case 0x20: {
                            v1 |= I0.a();
                            break;
                        }
                        case 0x40: {
                            v1 |= J0.a();
                            break;
                        }
                        case 0x80: {
                            v1 |= K0.a();
                        }
                    }
                }
            }
            return v1;
        }
    }

    @RequiresApi(34)
    static final class TypeImpl34 {
        static int a(int v) {
            int v1 = 0;
            for(int v2 = 1; v2 <= 0x200; v2 <<= 1) {
                if((v & v2) != 0) {
                    switch(v2) {
                        case 1: {
                            v1 |= E0.a();
                            break;
                        }
                        case 2: {
                            v1 |= F0.a();
                            break;
                        }
                        case 4: {
                            v1 |= G0.a();
                            break;
                        }
                        case 8: {
                            v1 |= z.a();
                            break;
                        }
                        case 16: {
                            v1 |= H0.a();
                            break;
                        }
                        case 0x20: {
                            v1 |= I0.a();
                            break;
                        }
                        case 0x40: {
                            v1 |= J0.a();
                            break;
                        }
                        case 0x80: {
                            v1 |= K0.a();
                            break;
                        }
                        case 0x200: {
                            v1 |= L0.a();
                        }
                    }
                }
            }
            return v1;
        }
    }

    private final Impl a;
    private static final String b = "WindowInsetsCompat";
    public static final WindowInsetsCompat c;

    static {
        int v = Build.VERSION.SDK_INT;
        if(v >= 34) {
            WindowInsetsCompat.c = Impl34.t;
            return;
        }
        if(v >= 30) {
            WindowInsetsCompat.c = Impl30.s;
            return;
        }
        WindowInsetsCompat.c = Impl.b;
    }

    @RequiresApi(20)
    private WindowInsetsCompat(WindowInsets windowInsets0) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 34) {
            this.a = new Impl34(this, windowInsets0);
            return;
        }
        if(v >= 30) {
            this.a = new Impl30(this, windowInsets0);
            return;
        }
        if(v >= 29) {
            this.a = new Impl29(this, windowInsets0);
            return;
        }
        if(v >= 28) {
            this.a = new Impl28(this, windowInsets0);
            return;
        }
        this.a = new Impl21(this, windowInsets0);
    }

    public WindowInsetsCompat(WindowInsetsCompat windowInsetsCompat0) {
        if(windowInsetsCompat0 != null) {
            Impl windowInsetsCompat$Impl0 = windowInsetsCompat0.a;
            int v = Build.VERSION.SDK_INT;
            if(v >= 34 && windowInsetsCompat$Impl0 instanceof Impl34) {
                this.a = new Impl34(this, ((Impl34)windowInsetsCompat$Impl0));
            }
            else if(v >= 30 && windowInsetsCompat$Impl0 instanceof Impl30) {
                this.a = new Impl30(this, ((Impl30)windowInsetsCompat$Impl0));
            }
            else if(v >= 29 && windowInsetsCompat$Impl0 instanceof Impl29) {
                this.a = new Impl29(this, ((Impl29)windowInsetsCompat$Impl0));
            }
            else if(v >= 28 && windowInsetsCompat$Impl0 instanceof Impl28) {
                this.a = new Impl28(this, ((Impl28)windowInsetsCompat$Impl0));
            }
            else if(windowInsetsCompat$Impl0 instanceof Impl21) {
                this.a = new Impl21(this, ((Impl21)windowInsetsCompat$Impl0));
            }
            else if(windowInsetsCompat$Impl0 instanceof Impl20) {
                this.a = new Impl20(this, ((Impl20)windowInsetsCompat$Impl0));
            }
            else {
                this.a = new Impl(this);
            }
            windowInsetsCompat$Impl0.e(this);
            return;
        }
        this.a = new Impl(this);
    }

    public boolean A() {
        return this.a.o();
    }

    public boolean B() {
        return this.a.p();
    }

    public boolean C(int v) {
        return this.a.q(v);
    }

    @Deprecated
    public WindowInsetsCompat D(int v, int v1, int v2, int v3) {
        return new Builder(this).h(Insets.d(v, v1, v2, v3)).a();
    }

    @Deprecated
    public WindowInsetsCompat E(Rect rect0) {
        return new Builder(this).h(Insets.e(rect0)).a();
    }

    void F(Insets[] arr_insets) {
        this.a.r(arr_insets);
    }

    void G(Insets insets0) {
        this.a.s(insets0);
    }

    void H(WindowInsetsCompat windowInsetsCompat0) {
        this.a.t(windowInsetsCompat0);
    }

    void I(Insets insets0) {
        this.a.u(insets0);
    }

    void J(int v) {
        this.a.v(v);
    }

    // 去混淆评级： 低(20)
    @RequiresApi(20)
    public WindowInsets K() {
        return this.a instanceof Impl20 ? ((Impl20)this.a).c : null;
    }

    @RequiresApi(20)
    public static WindowInsetsCompat L(WindowInsets windowInsets0) {
        return WindowInsetsCompat.M(windowInsets0, null);
    }

    @RequiresApi(20)
    public static WindowInsetsCompat M(WindowInsets windowInsets0, View view0) {
        WindowInsetsCompat windowInsetsCompat0 = new WindowInsetsCompat(((WindowInsets)Preconditions.l(windowInsets0)));
        if(view0 != null && view0.isAttachedToWindow()) {
            windowInsetsCompat0.H(ViewCompat.t0(view0));
            windowInsetsCompat0.d(view0.getRootView());
            windowInsetsCompat0.J(view0.getWindowSystemUiVisibility());
        }
        return windowInsetsCompat0;
    }

    @Deprecated
    public WindowInsetsCompat a() {
        return this.a.a();
    }

    @Deprecated
    public WindowInsetsCompat b() {
        return this.a.b();
    }

    @Deprecated
    public WindowInsetsCompat c() {
        return this.a.c();
    }

    void d(View view0) {
        this.a.d(view0);
    }

    public DisplayCutoutCompat e() {
        return this.a.f();
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof WindowInsetsCompat ? ObjectsCompat.a(this.a, ((WindowInsetsCompat)object0).a) : false;
    }

    public Insets f(int v) {
        return this.a.g(v);
    }

    public Insets g(int v) {
        return this.a.h(v);
    }

    @Deprecated
    public Insets h() {
        return this.a.i();
    }

    @Override
    public int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Deprecated
    public int i() {
        return this.a.j().d;
    }

    @Deprecated
    public int j() {
        return this.a.j().a;
    }

    @Deprecated
    public int k() {
        return this.a.j().c;
    }

    @Deprecated
    public int l() {
        return this.a.j().b;
    }

    @Deprecated
    public Insets m() {
        return this.a.j();
    }

    @Deprecated
    public Insets n() {
        return this.a.k();
    }

    @Deprecated
    public int o() {
        return this.a.l().d;
    }

    @Deprecated
    public int p() {
        return this.a.l().a;
    }

    @Deprecated
    public int q() {
        return this.a.l().c;
    }

    @Deprecated
    public int r() {
        return this.a.l().b;
    }

    @Deprecated
    public Insets s() {
        return this.a.l();
    }

    @Deprecated
    public Insets t() {
        return this.a.m();
    }

    // 去混淆评级： 低(20)
    public boolean u() {
        return !this.f(-1).equals(Insets.e) || !this.g(-9).equals(Insets.e) || this.e() != null;
    }

    @Deprecated
    public boolean v() {
        return !this.a.j().equals(Insets.e);
    }

    @Deprecated
    public boolean w() {
        return !this.a.l().equals(Insets.e);
    }

    public WindowInsetsCompat x(@IntRange(from = 0L) int v, @IntRange(from = 0L) int v1, @IntRange(from = 0L) int v2, @IntRange(from = 0L) int v3) {
        return this.a.n(v, v1, v2, v3);
    }

    public WindowInsetsCompat y(Insets insets0) {
        return this.x(insets0.a, insets0.b, insets0.c, insets0.d);
    }

    static Insets z(Insets insets0, int v, int v1, int v2, int v3) {
        int v4 = Math.max(0, insets0.a - v);
        int v5 = Math.max(0, insets0.b - v1);
        int v6 = Math.max(0, insets0.c - v2);
        int v7 = Math.max(0, insets0.d - v3);
        return v4 != v || v5 != v1 || v6 != v2 || v7 != v3 ? Insets.d(v4, v5, v6, v7) : insets0;
    }
}

