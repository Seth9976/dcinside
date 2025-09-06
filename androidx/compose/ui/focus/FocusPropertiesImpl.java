package androidx.compose.ui.focus;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

public final class FocusPropertiesImpl implements FocusProperties {
    private boolean a;
    @l
    private FocusRequester b;
    @l
    private FocusRequester c;
    @l
    private FocusRequester d;
    @l
    private FocusRequester e;
    @l
    private FocusRequester f;
    @l
    private FocusRequester g;
    @l
    private FocusRequester h;
    @l
    private FocusRequester i;
    @l
    private Function1 j;
    @l
    private Function1 k;

    public FocusPropertiesImpl() {
        this.a = true;
        this.b = FocusRequester.b.d();
        this.c = FocusRequester.b.d();
        this.d = FocusRequester.b.d();
        this.e = FocusRequester.b.d();
        this.f = FocusRequester.b.d();
        this.g = FocusRequester.b.d();
        this.h = FocusRequester.b.d();
        this.i = FocusRequester.b.d();
        this.j = androidx.compose.ui.focus.FocusPropertiesImpl.enter.1.e;
        this.k = androidx.compose.ui.focus.FocusPropertiesImpl.exit.1.e;

        final class androidx.compose.ui.focus.FocusPropertiesImpl.enter.1 extends N implements Function1 {
            public static final androidx.compose.ui.focus.FocusPropertiesImpl.enter.1 e;

            static {
                androidx.compose.ui.focus.FocusPropertiesImpl.enter.1.e = new androidx.compose.ui.focus.FocusPropertiesImpl.enter.1();
            }

            androidx.compose.ui.focus.FocusPropertiesImpl.enter.1() {
                super(1);
            }

            @l
            public final FocusRequester a(int v) {
                return FocusRequester.b.d();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((FocusDirection)object0).q());
            }
        }


        final class androidx.compose.ui.focus.FocusPropertiesImpl.exit.1 extends N implements Function1 {
            public static final androidx.compose.ui.focus.FocusPropertiesImpl.exit.1 e;

            static {
                androidx.compose.ui.focus.FocusPropertiesImpl.exit.1.e = new androidx.compose.ui.focus.FocusPropertiesImpl.exit.1();
            }

            androidx.compose.ui.focus.FocusPropertiesImpl.exit.1() {
                super(1);
            }

            @l
            public final FocusRequester a(int v) {
                return FocusRequester.b.d();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((FocusDirection)object0).q());
            }
        }

    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    @l
    public FocusRequester a() {
        return this.b;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    @l
    public FocusRequester b() {
        return this.c;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    @l
    public FocusRequester c() {
        return this.g;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    @l
    public FocusRequester d() {
        return this.f;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    @l
    public FocusRequester e() {
        return this.d;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    @l
    public Function1 f() {
        return this.k;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void g(@l FocusRequester focusRequester0) {
        L.p(focusRequester0, "<set-?>");
        this.d = focusRequester0;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    @l
    public FocusRequester getEnd() {
        return this.i;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    @l
    public FocusRequester getStart() {
        return this.h;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    @l
    public FocusRequester h() {
        return this.e;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void i(boolean z) {
        this.a = z;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void j(@l FocusRequester focusRequester0) {
        L.p(focusRequester0, "<set-?>");
        this.e = focusRequester0;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void k(@l FocusRequester focusRequester0) {
        L.p(focusRequester0, "<set-?>");
        this.h = focusRequester0;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void l(@l FocusRequester focusRequester0) {
        L.p(focusRequester0, "<set-?>");
        this.c = focusRequester0;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void m(@l Function1 function10) {
        L.p(function10, "<set-?>");
        this.k = function10;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    @l
    public Function1 n() {
        return this.j;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void o(@l FocusRequester focusRequester0) {
        L.p(focusRequester0, "<set-?>");
        this.i = focusRequester0;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void p(@l FocusRequester focusRequester0) {
        L.p(focusRequester0, "<set-?>");
        this.f = focusRequester0;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void q(@l FocusRequester focusRequester0) {
        L.p(focusRequester0, "<set-?>");
        this.g = focusRequester0;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public boolean r() {
        return this.a;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void s(@l Function1 function10) {
        L.p(function10, "<set-?>");
        this.j = function10;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void t(@l FocusRequester focusRequester0) {
        L.p(focusRequester0, "<set-?>");
        this.b = focusRequester0;
    }

    public static void u() {
    }

    public static void v() {
    }
}

