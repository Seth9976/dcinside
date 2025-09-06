package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class TransitionData {
    @m
    private final Fade a;
    @m
    private final Slide b;
    @m
    private final ChangeSize c;
    @m
    private final Scale d;

    public TransitionData() {
        this(null, null, null, null, 15, null);
    }

    public TransitionData(@m Fade fade0, @m Slide slide0, @m ChangeSize changeSize0, @m Scale scale0) {
        this.a = fade0;
        this.b = slide0;
        this.c = changeSize0;
        this.d = scale0;
    }

    public TransitionData(Fade fade0, Slide slide0, ChangeSize changeSize0, Scale scale0, int v, w w0) {
        if((v & 1) != 0) {
            fade0 = null;
        }
        if((v & 2) != 0) {
            slide0 = null;
        }
        if((v & 4) != 0) {
            changeSize0 = null;
        }
        if((v & 8) != 0) {
            scale0 = null;
        }
        this(fade0, slide0, changeSize0, scale0);
    }

    @m
    public final Fade a() {
        return this.a;
    }

    @m
    public final Slide b() {
        return this.b;
    }

    @m
    public final ChangeSize c() {
        return this.c;
    }

    @m
    public final Scale d() {
        return this.d;
    }

    @l
    public final TransitionData e(@m Fade fade0, @m Slide slide0, @m ChangeSize changeSize0, @m Scale scale0) {
        return new TransitionData(fade0, slide0, changeSize0, scale0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TransitionData)) {
            return false;
        }
        if(!L.g(this.a, ((TransitionData)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((TransitionData)object0).b)) {
            return false;
        }
        return L.g(this.c, ((TransitionData)object0).c) ? L.g(this.d, ((TransitionData)object0).d) : false;
    }

    public static TransitionData f(TransitionData transitionData0, Fade fade0, Slide slide0, ChangeSize changeSize0, Scale scale0, int v, Object object0) {
        if((v & 1) != 0) {
            fade0 = transitionData0.a;
        }
        if((v & 2) != 0) {
            slide0 = transitionData0.b;
        }
        if((v & 4) != 0) {
            changeSize0 = transitionData0.c;
        }
        if((v & 8) != 0) {
            scale0 = transitionData0.d;
        }
        return transitionData0.e(fade0, slide0, changeSize0, scale0);
    }

    @m
    public final ChangeSize g() {
        return this.c;
    }

    @m
    public final Fade h() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        Scale scale0 = this.d;
        if(scale0 != null) {
            v = scale0.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }

    @m
    public final Scale i() {
        return this.d;
    }

    @m
    public final Slide j() {
        return this.b;
    }

    @Override
    @l
    public String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ')';
    }
}

