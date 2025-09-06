package androidx.window.layout;

import A3.a;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.internal.N;
import y4.m;

final class SafeWindowLayoutComponentProvider.windowLayoutComponent.2 extends N implements a {
    public static final SafeWindowLayoutComponentProvider.windowLayoutComponent.2 e;

    static {
        SafeWindowLayoutComponentProvider.windowLayoutComponent.2.e = new SafeWindowLayoutComponentProvider.windowLayoutComponent.2();
    }

    SafeWindowLayoutComponentProvider.windowLayoutComponent.2() {
        super(0);
    }

    @m
    public final WindowLayoutComponent b() {
        ClassLoader classLoader0 = SafeWindowLayoutComponentProvider.class.getClassLoader();
        if(classLoader0 != null && SafeWindowLayoutComponentProvider.a.i(classLoader0)) {
            try {
                return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
            }
            catch(UnsupportedOperationException unused_ex) {
            }
        }
        return null;
    }

    @Override  // A3.a
    public Object invoke() {
        return this.b();
    }
}

