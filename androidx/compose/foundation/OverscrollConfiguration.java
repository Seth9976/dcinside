package androidx.compose.foundation;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@ExperimentalFoundationApi
@Stable
public final class OverscrollConfiguration {
    private final long a;
    @l
    private final PaddingValues b;
    public static final int c;

    static {
    }

    private OverscrollConfiguration(long v, PaddingValues paddingValues0) {
        this.a = v;
        this.b = paddingValues0;
    }

    public OverscrollConfiguration(long v, PaddingValues paddingValues0, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 0xFF66666600000000L;
        }
        if((v1 & 2) != 0) {
            paddingValues0 = PaddingKt.c(0.0f, 0.0f, 3, null);
        }
        this(v, paddingValues0, null);
    }

    public OverscrollConfiguration(long v, PaddingValues paddingValues0, w w0) {
        this(v, paddingValues0);
    }

    @l
    public final PaddingValues a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!L.g(OverscrollConfiguration.class, class0)) {
            return false;
        }
        L.n(object0, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        return Color.y(this.a, ((OverscrollConfiguration)object0).a) ? L.g(this.b, ((OverscrollConfiguration)object0).b) : false;
    }

    @Override
    public int hashCode() {
        return Color.K(this.a) * 0x1F + this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "OverscrollConfiguration(glowColor=" + Color.L(this.a) + ", drawPadding=" + this.b + ')';
    }
}

