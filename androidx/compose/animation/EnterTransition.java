package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public abstract class EnterTransition {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final EnterTransition a() {
            return EnterTransition.c;
        }
    }

    @l
    public static final Companion a;
    public static final int b;
    @l
    private static final EnterTransition c;

    static {
        EnterTransition.a = new Companion(null);
        EnterTransition.c = new EnterTransitionImpl(new TransitionData(null, null, null, null, 15, null));
    }

    private EnterTransition() {
    }

    public EnterTransition(w w0) {
    }

    @l
    public abstract TransitionData b();

    @Stable
    @l
    public final EnterTransition c(@l EnterTransition enterTransition0) {
        L.p(enterTransition0, "enter");
        Fade fade0 = this.b().h();
        if(fade0 == null) {
            fade0 = enterTransition0.b().h();
        }
        Slide slide0 = this.b().j();
        if(slide0 == null) {
            slide0 = enterTransition0.b().j();
        }
        ChangeSize changeSize0 = this.b().g();
        if(changeSize0 == null) {
            changeSize0 = enterTransition0.b().g();
        }
        Scale scale0 = this.b().i();
        if(scale0 == null) {
            scale0 = enterTransition0.b().i();
        }
        return new EnterTransitionImpl(new TransitionData(fade0, slide0, changeSize0, scale0));
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof EnterTransition && L.g(((EnterTransition)object0).b(), this.b());
    }

    @Override
    public int hashCode() {
        return this.b().hashCode();
    }

    @Override
    @l
    public String toString() {
        if(L.g(this, EnterTransition.c)) {
            return "EnterTransition.None";
        }
        TransitionData transitionData0 = this.b();
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("EnterTransition: \nFade - ");
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

