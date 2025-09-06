package androidx.fragment.app;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;

public final class FragmentManagerKt {
    public static final void a(@l FragmentManager fragmentManager0, boolean z, @l Function1 function10) {
        L.p(fragmentManager0, "<this>");
        L.p(function10, "body");
        FragmentTransaction fragmentTransaction0 = fragmentManager0.u();
        L.o(fragmentTransaction0, "beginTransaction()");
        function10.invoke(fragmentTransaction0);
        if(z) {
            fragmentTransaction0.r();
            return;
        }
        fragmentTransaction0.q();
    }

    public static void b(FragmentManager fragmentManager0, boolean z, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        L.p(fragmentManager0, "<this>");
        L.p(function10, "body");
        FragmentTransaction fragmentTransaction0 = fragmentManager0.u();
        L.o(fragmentTransaction0, "beginTransaction()");
        function10.invoke(fragmentTransaction0);
        if(z) {
            fragmentTransaction0.r();
            return;
        }
        fragmentTransaction0.q();
    }

    public static final void c(@l FragmentManager fragmentManager0, boolean z, @l Function1 function10) {
        L.p(fragmentManager0, "<this>");
        L.p(function10, "body");
        FragmentTransaction fragmentTransaction0 = fragmentManager0.u();
        L.o(fragmentTransaction0, "beginTransaction()");
        function10.invoke(fragmentTransaction0);
        if(z) {
            fragmentTransaction0.t();
            return;
        }
        fragmentTransaction0.s();
    }

    public static void d(FragmentManager fragmentManager0, boolean z, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        L.p(fragmentManager0, "<this>");
        L.p(function10, "body");
        FragmentTransaction fragmentTransaction0 = fragmentManager0.u();
        L.o(fragmentTransaction0, "beginTransaction()");
        function10.invoke(fragmentTransaction0);
        if(z) {
            fragmentTransaction0.t();
            return;
        }
        fragmentTransaction0.s();
    }

    @k(message = "Use commit { .. } or commitNow { .. } extensions")
    public static final void e(@l FragmentManager fragmentManager0, boolean z, boolean z1, @l Function1 function10) {
        L.p(fragmentManager0, "<this>");
        L.p(function10, "body");
        FragmentTransaction fragmentTransaction0 = fragmentManager0.u();
        L.o(fragmentTransaction0, "beginTransaction()");
        function10.invoke(fragmentTransaction0);
        if(z) {
            if(z1) {
                fragmentTransaction0.t();
                return;
            }
            fragmentTransaction0.s();
            return;
        }
        if(z1) {
            fragmentTransaction0.r();
            return;
        }
        fragmentTransaction0.q();
    }

    public static void f(FragmentManager fragmentManager0, boolean z, boolean z1, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            z1 = false;
        }
        L.p(fragmentManager0, "<this>");
        L.p(function10, "body");
        FragmentTransaction fragmentTransaction0 = fragmentManager0.u();
        L.o(fragmentTransaction0, "beginTransaction()");
        function10.invoke(fragmentTransaction0);
        if(z) {
            if(z1) {
                fragmentTransaction0.t();
                return;
            }
            fragmentTransaction0.s();
            return;
        }
        if(z1) {
            fragmentTransaction0.r();
            return;
        }
        fragmentTransaction0.q();
    }
}

