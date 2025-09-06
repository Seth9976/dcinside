package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusProperties.-CC;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.jvm.functions.Function1;
import y4.l;
import y4.m;

final class CanFocusChecker implements FocusProperties {
    @l
    public static final CanFocusChecker a;
    @m
    private static Boolean b;

    static {
        CanFocusChecker.a = new CanFocusChecker();
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public FocusRequester a() {
        return FocusProperties.-CC.f(this);
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public FocusRequester b() {
        return FocusProperties.-CC.g(this);
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public FocusRequester c() {
        return FocusProperties.-CC.h(this);
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public FocusRequester d() {
        return FocusProperties.-CC.e(this);
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public FocusRequester e() {
        return FocusProperties.-CC.j(this);
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public Function1 f() {
        return FocusProperties.-CC.d(this);
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void g(FocusRequester focusRequester0) {
        FocusProperties.-CC.t(this, focusRequester0);
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getEnd() {
        return FocusProperties.-CC.b(this);
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getStart() {
        return FocusProperties.-CC.i(this);
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public FocusRequester h() {
        return FocusProperties.-CC.a(this);
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void i(boolean z) {
        CanFocusChecker.b = Boolean.valueOf(z);
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void j(FocusRequester focusRequester0) {
        FocusProperties.-CC.k(this, focusRequester0);
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void k(FocusRequester focusRequester0) {
        FocusProperties.-CC.s(this, focusRequester0);
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void l(FocusRequester focusRequester0) {
        FocusProperties.-CC.q(this, focusRequester0);
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void m(Function1 function10) {
        FocusProperties.-CC.n(this, function10);
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public Function1 n() {
        return FocusProperties.-CC.c(this);
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void o(FocusRequester focusRequester0) {
        FocusProperties.-CC.l(this, focusRequester0);
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void p(FocusRequester focusRequester0) {
        FocusProperties.-CC.o(this, focusRequester0);
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void q(FocusRequester focusRequester0) {
        FocusProperties.-CC.r(this, focusRequester0);
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public boolean r() {
        Boolean boolean0 = CanFocusChecker.b;
        if(boolean0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return boolean0.booleanValue();
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void s(Function1 function10) {
        FocusProperties.-CC.m(this, function10);
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void t(FocusRequester focusRequester0) {
        FocusProperties.-CC.p(this, focusRequester0);
    }

    public final boolean u() [...] // 潜在的解密器

    public final void v() {
        CanFocusChecker.b = null;
    }
}

