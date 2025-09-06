package androidx.compose.ui.platform;

import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.semantics.ScrollAxisRange;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class ScrollObservationScope implements OwnerScope {
    private final int a;
    @l
    private final List b;
    @m
    private Float c;
    @m
    private Float d;
    @m
    private ScrollAxisRange e;
    @m
    private ScrollAxisRange f;

    public ScrollObservationScope(int v, @l List list0, @m Float float0, @m Float float1, @m ScrollAxisRange scrollAxisRange0, @m ScrollAxisRange scrollAxisRange1) {
        L.p(list0, "allScopes");
        super();
        this.a = v;
        this.b = list0;
        this.c = float0;
        this.d = float1;
        this.e = scrollAxisRange0;
        this.f = scrollAxisRange1;
    }

    @Override  // androidx.compose.ui.node.OwnerScope
    public boolean H() {
        return this.b.contains(this);
    }

    @l
    public final List a() {
        return this.b;
    }

    @m
    public final ScrollAxisRange b() {
        return this.e;
    }

    @m
    public final Float c() {
        return this.c;
    }

    @m
    public final Float d() {
        return this.d;
    }

    public final int e() {
        return this.a;
    }

    @m
    public final ScrollAxisRange f() {
        return this.f;
    }

    public final void g(@m ScrollAxisRange scrollAxisRange0) {
        this.e = scrollAxisRange0;
    }

    public final void h(@m Float float0) {
        this.c = float0;
    }

    public final void i(@m Float float0) {
        this.d = float0;
    }

    public final void j(@m ScrollAxisRange scrollAxisRange0) {
        this.f = scrollAxisRange0;
    }
}

