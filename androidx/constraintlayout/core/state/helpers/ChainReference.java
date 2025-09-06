package androidx.constraintlayout.core.state.helpers;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State.Chain;
import androidx.constraintlayout.core.state.State.Helper;
import androidx.constraintlayout.core.state.State;
import java.util.HashMap;

public class ChainReference extends HelperReference {
    protected float q0;
    @NonNull
    @Deprecated
    protected HashMap r0;
    @NonNull
    @Deprecated
    protected HashMap s0;
    @NonNull
    @Deprecated
    protected HashMap t0;
    private HashMap u0;
    private HashMap v0;
    @NonNull
    protected Chain w0;

    public ChainReference(@NonNull State state0, @NonNull Helper state$Helper0) {
        super(state0, state$Helper0);
        this.q0 = 0.5f;
        this.r0 = new HashMap();
        this.s0 = new HashMap();
        this.t0 = new HashMap();
        this.w0 = Chain.a;
    }

    @RestrictTo({Scope.b})
    public void U0(@NonNull Object object0, float f, float f1, float f2, float f3, float f4) {
        super.P0(new Object[]{object0});
        String s = object0.toString();
        if(!Float.isNaN(f)) {
            this.r0.put(s, f);
        }
        if(!Float.isNaN(f1)) {
            this.s0.put(s, f1);
        }
        if(!Float.isNaN(f2)) {
            this.t0.put(s, f2);
        }
        if(!Float.isNaN(f3)) {
            if(this.u0 == null) {
                this.u0 = new HashMap();
            }
            this.u0.put(s, f3);
        }
        if(!Float.isNaN(f4)) {
            if(this.v0 == null) {
                this.v0 = new HashMap();
            }
            this.v0.put(s, f4);
        }
    }

    public void V0(@NonNull String s, float f, float f1, float f2) {
        this.U0(s, f, f1, f2, 0.0f, 0.0f);
    }

    @NonNull
    public ChainReference W0(float f) {
        this.q0 = f;
        return this;
    }

    public float X0() {
        return this.q0;
    }

    float Y0(@NonNull String s) {
        return this.v0 == null || !this.v0.containsKey(s) ? 0.0f : ((float)(((Float)this.v0.get(s))));
    }

    // 去混淆评级： 低(20)
    protected float Z0(@NonNull String s) {
        return this.t0.containsKey(s) ? ((float)(((Float)this.t0.get(s)))) : 0.0f;
    }

    float a1(@NonNull String s) {
        return this.u0 == null || !this.u0.containsKey(s) ? 0.0f : ((float)(((Float)this.u0.get(s))));
    }

    // 去混淆评级： 低(20)
    protected float b1(@NonNull String s) {
        return this.s0.containsKey(s) ? ((float)(((Float)this.s0.get(s)))) : 0.0f;
    }

    @NonNull
    public Chain c1() {
        return Chain.a;
    }

    // 去混淆评级： 低(20)
    protected float d1(@NonNull String s) {
        return this.r0.containsKey(s) ? ((float)(((Float)this.r0.get(s)))) : -1.0f;
    }

    @NonNull
    public ChainReference e1(@NonNull Chain state$Chain0) {
        this.w0 = state$Chain0;
        return this;
    }

    @Override  // androidx.constraintlayout.core.state.ConstraintReference
    @NonNull
    public ConstraintReference n(float f) {
        return this.W0(f);
    }
}

