package androidx.core.animation;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator.AnimatorPauseListener;
import android.animation.Animator;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,123:1\n85#1,18:124\n85#1,18:142\n85#1,18:160\n85#1,18:178\n*S KotlinDebug\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n29#1:124,18\n39#1:142,18\n49#1:160,18\n58#1:178,18\n*E\n"})
public final class AnimatorKt {
    @l
    public static final Animator.AnimatorListener a(@l Animator animator0, @l Function1 function10, @l Function1 function11, @l Function1 function12, @l Function1 function13) {
        Animator.AnimatorListener animator$AnimatorListener0 = new Animator.AnimatorListener() {
            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationCancel(Animator animator0) {
                function12.invoke(animator0);
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationEnd(Animator animator0) {
                function10.invoke(animator0);
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationRepeat(Animator animator0) {
                function13.invoke(animator0);
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationStart(Animator animator0) {
                function11.invoke(animator0);
            }
        };
        animator0.addListener(animator$AnimatorListener0);
        return animator$AnimatorListener0;
    }

    public static Animator.AnimatorListener b(Animator animator0, Function1 function10, Function1 function11, Function1 function12, Function1 function13, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = androidx.core.animation.AnimatorKt.addListener.1.e;
        }
        if((v & 2) != 0) {
            function11 = androidx.core.animation.AnimatorKt.addListener.2.e;
        }
        if((v & 4) != 0) {
            function12 = androidx.core.animation.AnimatorKt.addListener.3.e;
        }
        if((v & 8) != 0) {
            function13 = androidx.core.animation.AnimatorKt.addListener.4.e;
        }
        Animator.AnimatorListener animator$AnimatorListener0 = new androidx.core.animation.AnimatorKt.addListener.listener.1(function13, function10, function12, function11);
        animator0.addListener(animator$AnimatorListener0);
        return animator$AnimatorListener0;

        public final class androidx.core.animation.AnimatorKt.addListener.1 extends N implements Function1 {
            public static final androidx.core.animation.AnimatorKt.addListener.1 e;

            static {
                androidx.core.animation.AnimatorKt.addListener.1.e = new androidx.core.animation.AnimatorKt.addListener.1();
            }

            public androidx.core.animation.AnimatorKt.addListener.1() {
                super(1);
            }

            public final void a(Animator animator0) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }


        public final class androidx.core.animation.AnimatorKt.addListener.2 extends N implements Function1 {
            public static final androidx.core.animation.AnimatorKt.addListener.2 e;

            static {
                androidx.core.animation.AnimatorKt.addListener.2.e = new androidx.core.animation.AnimatorKt.addListener.2();
            }

            public androidx.core.animation.AnimatorKt.addListener.2() {
                super(1);
            }

            public final void a(Animator animator0) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }


        public final class androidx.core.animation.AnimatorKt.addListener.3 extends N implements Function1 {
            public static final androidx.core.animation.AnimatorKt.addListener.3 e;

            static {
                androidx.core.animation.AnimatorKt.addListener.3.e = new androidx.core.animation.AnimatorKt.addListener.3();
            }

            public androidx.core.animation.AnimatorKt.addListener.3() {
                super(1);
            }

            public final void a(Animator animator0) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }


        public final class androidx.core.animation.AnimatorKt.addListener.4 extends N implements Function1 {
            public static final androidx.core.animation.AnimatorKt.addListener.4 e;

            static {
                androidx.core.animation.AnimatorKt.addListener.4.e = new androidx.core.animation.AnimatorKt.addListener.4();
            }

            public androidx.core.animation.AnimatorKt.addListener.4() {
                super(1);
            }

            public final void a(Animator animator0) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }

    }

    @l
    public static final Animator.AnimatorPauseListener c(@l Animator animator0, @l Function1 function10, @l Function1 function11) {
        Animator.AnimatorPauseListener animator$AnimatorPauseListener0 = new Animator.AnimatorPauseListener() {
            @Override  // android.animation.Animator$AnimatorPauseListener
            public void onAnimationPause(Animator animator0) {
                function11.invoke(animator0);
            }

            @Override  // android.animation.Animator$AnimatorPauseListener
            public void onAnimationResume(Animator animator0) {
                function10.invoke(animator0);
            }
        };
        animator0.addPauseListener(animator$AnimatorPauseListener0);
        return animator$AnimatorPauseListener0;
    }

    public static Animator.AnimatorPauseListener d(Animator animator0, Function1 function10, Function1 function11, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = androidx.core.animation.AnimatorKt.addPauseListener.1.e;
        }
        if((v & 2) != 0) {
            function11 = androidx.core.animation.AnimatorKt.addPauseListener.2.e;
        }
        return AnimatorKt.c(animator0, function10, function11);

        final class androidx.core.animation.AnimatorKt.addPauseListener.1 extends N implements Function1 {
            public static final androidx.core.animation.AnimatorKt.addPauseListener.1 e;

            static {
                androidx.core.animation.AnimatorKt.addPauseListener.1.e = new androidx.core.animation.AnimatorKt.addPauseListener.1();
            }

            androidx.core.animation.AnimatorKt.addPauseListener.1() {
                super(1);
            }

            public final void a(Animator animator0) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }


        final class androidx.core.animation.AnimatorKt.addPauseListener.2 extends N implements Function1 {
            public static final androidx.core.animation.AnimatorKt.addPauseListener.2 e;

            static {
                androidx.core.animation.AnimatorKt.addPauseListener.2.e = new androidx.core.animation.AnimatorKt.addPauseListener.2();
            }

            androidx.core.animation.AnimatorKt.addPauseListener.2() {
                super(1);
            }

            public final void a(Animator animator0) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }

    }

    @l
    public static final Animator.AnimatorListener e(@l Animator animator0, @l Function1 function10) {
        Animator.AnimatorListener animator$AnimatorListener0 = new Animator.AnimatorListener() {
            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationCancel(Animator animator0) {
                function10.invoke(animator0);
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationEnd(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationRepeat(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationStart(Animator animator0) {
            }
        };
        animator0.addListener(animator$AnimatorListener0);
        return animator$AnimatorListener0;
    }

    @l
    public static final Animator.AnimatorListener f(@l Animator animator0, @l Function1 function10) {
        Animator.AnimatorListener animator$AnimatorListener0 = new Animator.AnimatorListener() {
            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationCancel(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationEnd(Animator animator0) {
                function10.invoke(animator0);
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationRepeat(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationStart(Animator animator0) {
            }
        };
        animator0.addListener(animator$AnimatorListener0);
        return animator$AnimatorListener0;
    }

    @l
    public static final Animator.AnimatorPauseListener g(@l Animator animator0, @l Function1 function10) {
        return AnimatorKt.d(animator0, null, function10, 1, null);
    }

    @l
    public static final Animator.AnimatorListener h(@l Animator animator0, @l Function1 function10) {
        Animator.AnimatorListener animator$AnimatorListener0 = new Animator.AnimatorListener() {
            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationCancel(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationEnd(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationRepeat(Animator animator0) {
                function10.invoke(animator0);
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationStart(Animator animator0) {
            }
        };
        animator0.addListener(animator$AnimatorListener0);
        return animator$AnimatorListener0;
    }

    @l
    public static final Animator.AnimatorPauseListener i(@l Animator animator0, @l Function1 function10) {
        return AnimatorKt.d(animator0, function10, null, 2, null);
    }

    @l
    public static final Animator.AnimatorListener j(@l Animator animator0, @l Function1 function10) {
        Animator.AnimatorListener animator$AnimatorListener0 = new Animator.AnimatorListener() {
            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationCancel(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationEnd(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationRepeat(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationStart(Animator animator0) {
                function10.invoke(animator0);
            }
        };
        animator0.addListener(animator$AnimatorListener0);
        return animator$AnimatorListener0;
    }
}

