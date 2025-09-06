package androidx.core.transition;

import android.transition.Transition.TransitionListener;
import android.transition.Transition;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt\n*L\n1#1,69:1\n47#1,9:70\n66#1,2:79\n47#1,9:81\n66#1,2:90\n47#1,9:92\n66#1,2:101\n47#1,9:103\n66#1,2:112\n47#1,9:114\n66#1,2:123\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt\n*L\n24#1:70,9\n24#1:79,2\n29#1:81,9\n29#1:90,2\n34#1:92,9\n34#1:101,2\n39#1:103,9\n39#1:112,2\n44#1:114,9\n44#1:123,2\n*E\n"})
public final class TransitionKt {
    @l
    public static final Transition.TransitionListener a(@l Transition transition0, @l Function1 function10, @l Function1 function11, @l Function1 function12, @l Function1 function13, @l Function1 function14) {
        Transition.TransitionListener transition$TransitionListener0 = new Transition.TransitionListener() {
            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionCancel(Transition transition0) {
                function12.invoke(transition0);
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionEnd(Transition transition0) {
                function10.invoke(transition0);
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionPause(Transition transition0) {
                function14.invoke(transition0);
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionResume(Transition transition0) {
                function13.invoke(transition0);
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionStart(Transition transition0) {
                function11.invoke(transition0);
            }
        };
        transition0.addListener(transition$TransitionListener0);
        return transition$TransitionListener0;
    }

    public static Transition.TransitionListener b(Transition transition0, Function1 function10, Function1 function11, Function1 function12, Function1 function13, Function1 function14, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = androidx.core.transition.TransitionKt.addListener.1.e;
        }
        if((v & 2) != 0) {
            function11 = androidx.core.transition.TransitionKt.addListener.2.e;
        }
        if((v & 4) != 0) {
            function12 = androidx.core.transition.TransitionKt.addListener.3.e;
        }
        if((v & 8) != 0) {
            function13 = androidx.core.transition.TransitionKt.addListener.4.e;
        }
        if((v & 16) != 0) {
            function14 = androidx.core.transition.TransitionKt.addListener.5.e;
        }
        Transition.TransitionListener transition$TransitionListener0 = new androidx.core.transition.TransitionKt.addListener.listener.1(function10, function13, function14, function12, function11);
        transition0.addListener(transition$TransitionListener0);
        return transition$TransitionListener0;

        public final class androidx.core.transition.TransitionKt.addListener.1 extends N implements Function1 {
            public static final androidx.core.transition.TransitionKt.addListener.1 e;

            static {
                androidx.core.transition.TransitionKt.addListener.1.e = new androidx.core.transition.TransitionKt.addListener.1();
            }

            public androidx.core.transition.TransitionKt.addListener.1() {
                super(1);
            }

            public final void a(Transition transition0) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }


        public final class androidx.core.transition.TransitionKt.addListener.2 extends N implements Function1 {
            public static final androidx.core.transition.TransitionKt.addListener.2 e;

            static {
                androidx.core.transition.TransitionKt.addListener.2.e = new androidx.core.transition.TransitionKt.addListener.2();
            }

            public androidx.core.transition.TransitionKt.addListener.2() {
                super(1);
            }

            public final void a(Transition transition0) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }


        public final class androidx.core.transition.TransitionKt.addListener.3 extends N implements Function1 {
            public static final androidx.core.transition.TransitionKt.addListener.3 e;

            static {
                androidx.core.transition.TransitionKt.addListener.3.e = new androidx.core.transition.TransitionKt.addListener.3();
            }

            public androidx.core.transition.TransitionKt.addListener.3() {
                super(1);
            }

            public final void a(Transition transition0) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }


        public final class androidx.core.transition.TransitionKt.addListener.4 extends N implements Function1 {
            public static final androidx.core.transition.TransitionKt.addListener.4 e;

            static {
                androidx.core.transition.TransitionKt.addListener.4.e = new androidx.core.transition.TransitionKt.addListener.4();
            }

            public androidx.core.transition.TransitionKt.addListener.4() {
                super(1);
            }

            public final void a(Transition transition0) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }


        public final class androidx.core.transition.TransitionKt.addListener.5 extends N implements Function1 {
            public static final androidx.core.transition.TransitionKt.addListener.5 e;

            static {
                androidx.core.transition.TransitionKt.addListener.5.e = new androidx.core.transition.TransitionKt.addListener.5();
            }

            public androidx.core.transition.TransitionKt.addListener.5() {
                super(1);
            }

            public final void a(Transition transition0) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }

    }

    @l
    public static final Transition.TransitionListener c(@l Transition transition0, @l Function1 function10) {
        Transition.TransitionListener transition$TransitionListener0 = new Transition.TransitionListener() {
            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionCancel(Transition transition0) {
                function10.invoke(transition0);
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionEnd(Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionPause(Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionResume(Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionStart(Transition transition0) {
            }
        };
        transition0.addListener(transition$TransitionListener0);
        return transition$TransitionListener0;
    }

    @l
    public static final Transition.TransitionListener d(@l Transition transition0, @l Function1 function10) {
        Transition.TransitionListener transition$TransitionListener0 = new Transition.TransitionListener() {
            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionCancel(Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionEnd(Transition transition0) {
                function10.invoke(transition0);
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionPause(Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionResume(Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionStart(Transition transition0) {
            }
        };
        transition0.addListener(transition$TransitionListener0);
        return transition$TransitionListener0;
    }

    @l
    public static final Transition.TransitionListener e(@l Transition transition0, @l Function1 function10) {
        Transition.TransitionListener transition$TransitionListener0 = new Transition.TransitionListener() {
            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionCancel(Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionEnd(Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionPause(Transition transition0) {
                function10.invoke(transition0);
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionResume(Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionStart(Transition transition0) {
            }
        };
        transition0.addListener(transition$TransitionListener0);
        return transition$TransitionListener0;
    }

    @l
    public static final Transition.TransitionListener f(@l Transition transition0, @l Function1 function10) {
        Transition.TransitionListener transition$TransitionListener0 = new Transition.TransitionListener() {
            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionCancel(Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionEnd(Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionPause(Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionResume(Transition transition0) {
                function10.invoke(transition0);
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionStart(Transition transition0) {
            }
        };
        transition0.addListener(transition$TransitionListener0);
        return transition$TransitionListener0;
    }

    @l
    public static final Transition.TransitionListener g(@l Transition transition0, @l Function1 function10) {
        Transition.TransitionListener transition$TransitionListener0 = new Transition.TransitionListener() {
            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionCancel(Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionEnd(Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionPause(Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionResume(Transition transition0) {
            }

            @Override  // android.transition.Transition$TransitionListener
            public void onTransitionStart(Transition transition0) {
                function10.invoke(transition0);
            }
        };
        transition0.addListener(transition$TransitionListener0);
        return transition$TransitionListener0;
    }
}

