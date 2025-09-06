package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.widget.ConstraintSet;

public class TransitionBuilder {
    private static final String a = "TransitionBuilder";

    public static Transition a(MotionScene motionScene0, int v, int v1, ConstraintSet constraintSet0, int v2, ConstraintSet constraintSet1) {
        Transition motionScene$Transition0 = new Transition(v, motionScene0, v1, v2);
        TransitionBuilder.b(motionScene0, motionScene$Transition0, constraintSet0, constraintSet1);
        return motionScene$Transition0;
    }

    private static void b(MotionScene motionScene0, Transition motionScene$Transition0, ConstraintSet constraintSet0, ConstraintSet constraintSet1) {
        motionScene0.k0(motionScene$Transition0.I(), constraintSet0);
        motionScene0.k0(motionScene$Transition0.B(), constraintSet1);
    }

    public static void c(MotionLayout motionLayout0) {
        MotionScene motionScene0 = motionLayout0.a;
        if(motionScene0 == null) {
            throw new RuntimeException("Invalid motion layout. Layout missing Motion Scene.");
        }
        if(!motionScene0.t0(motionLayout0)) {
            throw new RuntimeException("MotionLayout doesn\'t have the right motion scene.");
        }
        if(motionScene0.c == null || motionScene0.s().isEmpty()) {
            throw new RuntimeException("Invalid motion layout. Motion Scene doesn\'t have any transition.");
        }
    }
}

