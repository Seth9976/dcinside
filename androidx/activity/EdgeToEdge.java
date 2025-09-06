package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import androidx.annotation.VisibleForTesting;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;
import z3.j;

@s0({"SMAP\nEdgeToEdge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EdgeToEdge.kt\nandroidx/activity/EdgeToEdge\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1#2:334\n*E\n"})
@i(name = "EdgeToEdge")
public final class EdgeToEdge {
    private static final int a;
    private static final int b;
    @m
    private static EdgeToEdgeImpl c;

    static {
        EdgeToEdge.a = Color.argb(230, 0xFF, 0xFF, 0xFF);
        EdgeToEdge.b = Color.argb(0x80, 27, 27, 27);
    }

    @i(name = "enable")
    @j
    public static final void a(@l ComponentActivity componentActivity0) {
        L.p(componentActivity0, "<this>");
        EdgeToEdge.d(componentActivity0, null, null, 3, null);
    }

    @i(name = "enable")
    @j
    public static final void b(@l ComponentActivity componentActivity0, @l SystemBarStyle systemBarStyle0) {
        L.p(componentActivity0, "<this>");
        L.p(systemBarStyle0, "statusBarStyle");
        EdgeToEdge.d(componentActivity0, systemBarStyle0, null, 2, null);
    }

    @i(name = "enable")
    @j
    public static final void c(@l ComponentActivity componentActivity0, @l SystemBarStyle systemBarStyle0, @l SystemBarStyle systemBarStyle1) {
        L.p(componentActivity0, "<this>");
        L.p(systemBarStyle0, "statusBarStyle");
        L.p(systemBarStyle1, "navigationBarStyle");
        View view0 = componentActivity0.getWindow().getDecorView();
        L.o(view0, "window.decorView");
        Resources resources0 = view0.getResources();
        L.o(resources0, "view.resources");
        boolean z = ((Boolean)systemBarStyle0.e().invoke(resources0)).booleanValue();
        Resources resources1 = view0.getResources();
        L.o(resources1, "view.resources");
        boolean z1 = ((Boolean)systemBarStyle1.e().invoke(resources1)).booleanValue();
        EdgeToEdgeImpl edgeToEdgeImpl0 = EdgeToEdge.c;
        if(edgeToEdgeImpl0 == null) {
            int v = Build.VERSION.SDK_INT;
            if(v >= 30) {
                edgeToEdgeImpl0 = new EdgeToEdgeApi30();
            }
            else if(v >= 29) {
                edgeToEdgeImpl0 = new EdgeToEdgeApi29();
            }
            else if(v >= 28) {
                edgeToEdgeImpl0 = new EdgeToEdgeApi28();
            }
            else if(v >= 26) {
                edgeToEdgeImpl0 = new EdgeToEdgeApi26();
            }
            else if(v >= 23) {
                edgeToEdgeImpl0 = new EdgeToEdgeApi23();
            }
            else {
                edgeToEdgeImpl0 = new EdgeToEdgeApi21();
                EdgeToEdge.c = edgeToEdgeImpl0;
            }
        }
        Window window0 = componentActivity0.getWindow();
        L.o(window0, "window");
        edgeToEdgeImpl0.b(systemBarStyle0, systemBarStyle1, window0, view0, z, z1);
        Window window1 = componentActivity0.getWindow();
        L.o(window1, "window");
        edgeToEdgeImpl0.a(window1);
    }

    public static void d(ComponentActivity componentActivity0, SystemBarStyle systemBarStyle0, SystemBarStyle systemBarStyle1, int v, Object object0) {
        if((v & 1) != 0) {
            systemBarStyle0 = Companion.c(SystemBarStyle.e, 0, 0, null, 4, null);
        }
        if((v & 2) != 0) {
            systemBarStyle1 = Companion.c(SystemBarStyle.e, EdgeToEdge.a, EdgeToEdge.b, null, 4, null);
        }
        EdgeToEdge.c(componentActivity0, systemBarStyle0, systemBarStyle1);
    }

    public static final int e() {
        return EdgeToEdge.b;
    }

    @VisibleForTesting
    public static void f() {
    }

    public static final int g() {
        return EdgeToEdge.a;
    }

    @VisibleForTesting
    public static void h() {
    }
}

