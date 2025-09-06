package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.core.motion.utils.SpringStopEngine;
import androidx.constraintlayout.core.motion.utils.StopEngine;
import androidx.constraintlayout.core.motion.utils.StopLogicEngine;
import androidx.constraintlayout.motion.widget.MotionInterpolator;

public class StopLogic extends MotionInterpolator {
    private StopLogicEngine a;
    private SpringStopEngine b;
    private StopEngine c;

    public StopLogic() {
        StopLogicEngine stopLogicEngine0 = new StopLogicEngine();
        this.a = stopLogicEngine0;
        this.c = stopLogicEngine0;
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionInterpolator
    public float a() {
        return this.c.a();
    }

    public void b(float f, float f1, float f2, float f3, float f4, float f5) {
        this.c = this.a;
        this.a.f(f, f1, f2, f3, f4, f5);
    }

    public String c(String s, float f) {
        return this.c.c(s, f);
    }

    public float d(float f) {
        return this.c.b(f);
    }

    public boolean e() {
        return this.c.d();
    }

    public void f(float f, float f1, float f2, float f3, float f4, float f5, float f6, int v) {
        if(this.b == null) {
            this.b = new SpringStopEngine();
        }
        this.c = this.b;
        this.b.h(f, f1, f2, f3, f4, f5, f6, v);
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionInterpolator
    public float getInterpolation(float f) {
        return this.c.getInterpolation(f);
    }
}

