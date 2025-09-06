package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public abstract class ExitTransition {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final ExitTransition a() {
            return ExitTransition.c;
        }
    }

    @l
    public static final Companion a;
    public static final int b;
    @l
    private static final ExitTransition c;

    static {
        ExitTransition.a = new Companion(null);
        ExitTransition.c = new ExitTransitionImpl(new TransitionData(null, null, null, null, 15, null));
    }

    private ExitTransition() {
    }

    public ExitTransition(w w0) {
    }

    @l
    public abstract TransitionData b();

    @Stable
    @l
    public final ExitTransition c(@l ExitTransition exitTransition0) {
        L.p(exitTransition0, "exit");
        Fade fade0 = this.b().h();
        if(fade0 == null) {
            fade0 = exitTransition0.b().h();
        }
        Slide slide0 = this.b().j();
        if(slide0 == null) {
            slide0 = exitTransition0.b().j();
        }
        ChangeSize changeSize0 = this.b().g();
        if(changeSize0 == null) {
            changeSize0 = exitTransition0.b().g();
        }
        Scale scale0 = this.b().i();
        if(scale0 == null) {
            scale0 = exitTransition0.b().i();
        }
        return new ExitTransitionImpl(new TransitionData(fade0, slide0, changeSize0, scale0));
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof ExitTransition && L.g(((ExitTransition)object0).b(), this.b());
    }

    @Override
    public int hashCode() {
        return this.b().hashCode();
    }

    @Override
    @l
    public String toString() {
        if(L.g(this, ExitTransition.c)) {
            return "ExitTransition.None";
        }
        TransitionData transitionData0 = this.b();
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("ExitTransition: \nFade - ");
        Fade fade0 = transitionData0.h();
        String s = null;
        stringBuilder0.append((fade0 == null ? null : fade0.toString()));
        stringBuilder0.append(",\nSlide - ");
        Slide slide0 = transitionData0.j();
        stringBuilder0.append((slide0 == null ? null : slide0.toString()));
        stringBuilder0.append(",\nShrink - ");
        ChangeSize changeSize0 = transitionData0.g();
        stringBuilder0.append((changeSize0 == null ? null : changeSize0.toString()));
        stringBuilder0.append(",\nScale - ");
        Scale scale0 = transitionData0.i();
        if(scale0 != null) {
            s = scale0.toString();
        }
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }
}

