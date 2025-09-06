package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;

@StabilityInferred(parameters = 0)
@k(message = "Use FocusProperties instead")
public final class FocusOrder {
    @l
    private final FocusProperties a;
    public static final int b = 8;

    static {
    }

    public FocusOrder() {
        this(new FocusPropertiesImpl());
    }

    public FocusOrder(@l FocusProperties focusProperties0) {
        L.p(focusProperties0, "focusProperties");
        super();
        this.a = focusProperties0;
    }

    @l
    public final FocusRequester a() {
        return this.a.h();
    }

    @l
    public final FocusRequester b() {
        return this.a.getEnd();
    }

    @l
    public final FocusRequester c() {
        return this.a.d();
    }

    @l
    public final FocusRequester d() {
        return this.a.a();
    }

    @l
    public final FocusRequester e() {
        return this.a.b();
    }

    @l
    public final FocusRequester f() {
        return this.a.c();
    }

    @l
    public final FocusRequester g() {
        return this.a.getStart();
    }

    @l
    public final FocusRequester h() {
        return this.a.e();
    }

    public final void i(@l FocusRequester focusRequester0) {
        L.p(focusRequester0, "down");
        this.a.j(focusRequester0);
    }

    public final void j(@l FocusRequester focusRequester0) {
        L.p(focusRequester0, "end");
        this.a.o(focusRequester0);
    }

    public final void k(@l FocusRequester focusRequester0) {
        L.p(focusRequester0, "left");
        this.a.p(focusRequester0);
    }

    public final void l(@l FocusRequester focusRequester0) {
        L.p(focusRequester0, "next");
        this.a.t(focusRequester0);
    }

    public final void m(@l FocusRequester focusRequester0) {
        L.p(focusRequester0, "previous");
        this.a.l(focusRequester0);
    }

    public final void n(@l FocusRequester focusRequester0) {
        L.p(focusRequester0, "right");
        this.a.q(focusRequester0);
    }

    public final void o(@l FocusRequester focusRequester0) {
        L.p(focusRequester0, "start");
        this.a.k(focusRequester0);
    }

    public final void p(@l FocusRequester focusRequester0) {
        L.p(focusRequester0, "up");
        this.a.g(focusRequester0);
    }
}

