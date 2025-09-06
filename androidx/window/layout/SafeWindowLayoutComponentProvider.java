package androidx.window.layout;

import A3.a;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.reflect.d;
import y4.l;
import y4.m;
import z3.b;

public final class SafeWindowLayoutComponentProvider {
    @l
    public static final SafeWindowLayoutComponentProvider a;
    @l
    private static final D b;

    static {
        SafeWindowLayoutComponentProvider.a = new SafeWindowLayoutComponentProvider();
        SafeWindowLayoutComponentProvider.b = E.a(SafeWindowLayoutComponentProvider.windowLayoutComponent.2.e);
    }

    // 去混淆评级： 低(40)
    private final boolean i(ClassLoader classLoader0) {
        return Build.VERSION.SDK_INT >= 24 && this.r(classLoader0) && this.p(classLoader0) && this.q(classLoader0) && this.n(classLoader0);
    }

    private final boolean j(Method method0, Class class0) {
        return method0.getReturnType().equals(class0);
    }

    private final boolean k(Method method0, d d0) {
        return this.j(method0, b.e(d0));
    }

    private final Class l(ClassLoader classLoader0) {
        return classLoader0.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    @m
    public final WindowLayoutComponent m() {
        return (WindowLayoutComponent)SafeWindowLayoutComponentProvider.b.getValue();
    }

    private final boolean n(ClassLoader classLoader0) {
        return this.s(new a() {
            final ClassLoader e;

            {
                this.e = classLoader0;
                super(0);
            }

            @l
            public final Boolean b() {
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider0 = SafeWindowLayoutComponentProvider.a;
                Class class0 = safeWindowLayoutComponentProvider0.l(this.e);
                Method method0 = class0.getMethod("getBounds", null);
                Method method1 = class0.getMethod("getType", null);
                Method method2 = class0.getMethod("getState", null);
                L.o(method0, "getBoundsMethod");
                if(safeWindowLayoutComponentProvider0.k(method0, m0.d(Rect.class)) && safeWindowLayoutComponentProvider0.o(method0)) {
                    L.o(method1, "getTypeMethod");
                    Class class1 = Integer.TYPE;
                    if(safeWindowLayoutComponentProvider0.k(method1, m0.d(class1)) && safeWindowLayoutComponentProvider0.o(method1)) {
                        L.o(method2, "getStateMethod");
                        return !safeWindowLayoutComponentProvider0.k(method2, m0.d(class1)) || !safeWindowLayoutComponentProvider0.o(method2) ? false : true;
                    }
                }
                return false;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
    }

    private final boolean o(Method method0) {
        return Modifier.isPublic(method0.getModifiers());
    }

    private final boolean p(ClassLoader classLoader0) {
        return this.s(new a() {
            final ClassLoader e;

            {
                this.e = classLoader0;
                super(0);
            }

            @l
            public final Boolean b() {
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider0 = SafeWindowLayoutComponentProvider.a;
                Method method0 = safeWindowLayoutComponentProvider0.t(this.e).getMethod("getWindowLayoutComponent", null);
                Class class0 = safeWindowLayoutComponentProvider0.v(this.e);
                L.o(method0, "getWindowLayoutComponentMethod");
                if(safeWindowLayoutComponentProvider0.o(method0)) {
                    L.o(class0, "windowLayoutComponentClass");
                    return safeWindowLayoutComponentProvider0.j(method0, class0);
                }
                return false;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
    }

    @RequiresApi(24)
    private final boolean q(ClassLoader classLoader0) {
        return this.s(new a() {
            final ClassLoader e;

            {
                this.e = classLoader0;
                super(0);
            }

            @l
            public final Boolean b() {
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider0 = SafeWindowLayoutComponentProvider.a;
                Class class0 = safeWindowLayoutComponentProvider0.v(this.e);
                boolean z = false;
                Method method0 = class0.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
                Method method1 = class0.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                L.o(method0, "addListenerMethod");
                if(safeWindowLayoutComponentProvider0.o(method0)) {
                    L.o(method1, "removeListenerMethod");
                    if(safeWindowLayoutComponentProvider0.o(method1)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
    }

    private final boolean r(ClassLoader classLoader0) {
        return this.s(new a() {
            final ClassLoader e;

            {
                this.e = classLoader0;
                super(0);
            }

            @l
            public final Boolean b() {
                Method method0 = SafeWindowLayoutComponentProvider.a.u(this.e).getDeclaredMethod("getWindowExtensions", null);
                Class class0 = SafeWindowLayoutComponentProvider.a.t(this.e);
                L.o(method0, "getWindowExtensionsMethod");
                L.o(class0, "windowExtensionsClass");
                return !SafeWindowLayoutComponentProvider.a.j(method0, class0) || !SafeWindowLayoutComponentProvider.a.o(method0) ? false : true;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
    }

    private final boolean s(a a0) {
        try {
            return ((Boolean)a0.invoke()).booleanValue();
        }
        catch(ClassNotFoundException | NoSuchMethodException unused_ex) {
            return false;
        }
    }

    private final Class t(ClassLoader classLoader0) {
        return classLoader0.loadClass("androidx.window.extensions.WindowExtensions");
    }

    private final Class u(ClassLoader classLoader0) {
        return classLoader0.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    private final Class v(ClassLoader classLoader0) {
        return classLoader0.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }
}

