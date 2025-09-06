package androidx.compose.ui.node;

import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.c0;
import kotlin.k;

public final class e {
    static {
    }

    @ExperimentalComposeUiApi
    public static void a() {
    }

    @ExperimentalComposeUiApi
    public static void b() {
    }

    @k(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @c0(expression = "fontFamilyResolver", imports = {}))
    public static void c() {
    }

    public static void d() {
    }

    public static void e(Owner owner0, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if((v & 1) != 0) {
            z = true;
        }
        owner0.a(z);
    }

    public static void f(Owner owner0, LayoutNode layoutNode0, boolean z, boolean z1, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if((v & 2) != 0) {
            z = false;
        }
        if((v & 4) != 0) {
            z1 = false;
        }
        owner0.b(layoutNode0, z, z1);
    }

    public static void g(Owner owner0, LayoutNode layoutNode0, boolean z, boolean z1, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if((v & 2) != 0) {
            z = false;
        }
        if((v & 4) != 0) {
            z1 = false;
        }
        owner0.p(layoutNode0, z, z1);
    }
}

