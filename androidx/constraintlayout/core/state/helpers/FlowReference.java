package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State.Helper;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.HashMap;

public class FlowReference extends HelperReference {
    protected int A0;
    protected int B0;
    protected int C0;
    protected int D0;
    protected int E0;
    protected int F0;
    protected int G0;
    protected int H0;
    protected int I0;
    protected int J0;
    protected int K0;
    protected float L0;
    protected float M0;
    protected float N0;
    protected float O0;
    protected Flow q0;
    protected HashMap r0;
    protected HashMap s0;
    protected HashMap t0;
    protected int u0;
    protected int v0;
    protected int w0;
    protected int x0;
    protected int y0;
    protected int z0;

    public FlowReference(State state0, Helper state$Helper0) {
        super(state0, state$Helper0);
        this.u0 = 0;
        this.v0 = -1;
        this.w0 = -1;
        this.x0 = -1;
        this.y0 = -1;
        this.z0 = -1;
        this.A0 = -1;
        this.B0 = 2;
        this.C0 = 2;
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = 0;
        this.G0 = 0;
        this.H0 = 0;
        this.I0 = 0;
        this.J0 = -1;
        this.K0 = 0;
        this.L0 = 0.5f;
        this.M0 = 0.5f;
        this.N0 = 0.5f;
        this.O0 = 0.5f;
        if(state$Helper0 == Helper.h) {
            this.K0 = 1;
        }
    }

    public void A1(int v) {
        this.E0 = v;
    }

    public void B1(int v) {
        this.y0 = v;
    }

    public void C1(float f) {
        this.O0 = f;
    }

    public void D1(int v) {
        this.A0 = v;
    }

    public void E1(float f) {
        this.M0 = f;
    }

    public void F1(int v) {
        this.x0 = v;
    }

    public void G1(int v) {
        this.J0 = v;
    }

    public void H1(int v) {
        this.K0 = v;
    }

    public void I1(int v) {
        this.I0 = v;
    }

    public void J1(int v) {
        this.F0 = v;
    }

    public void K1(int v) {
        this.G0 = v;
    }

    public void L1(int v) {
        this.H0 = v;
    }

    public void M1(int v) {
        this.B0 = v;
    }

    public void N1(int v) {
        this.D0 = v;
    }

    public void O1(int v) {
        this.v0 = v;
    }

    public void P1(int v) {
        this.u0 = v;
    }

    @Override  // androidx.constraintlayout.core.state.HelperReference
    public HelperWidget R0() {
        if(this.q0 == null) {
            this.q0 = new Flow();
        }
        return this.q0;
    }

    @Override  // androidx.constraintlayout.core.state.HelperReference
    public void T0(HelperWidget helperWidget0) {
        if(helperWidget0 instanceof Flow) {
            this.q0 = (Flow)helperWidget0;
            return;
        }
        this.q0 = null;
    }

    public void U0(String s, float f, float f1, float f2) {
        super.P0(new Object[]{s});
        if(!Float.isNaN(f)) {
            if(this.r0 == null) {
                this.r0 = new HashMap();
            }
            this.r0.put(s, f);
        }
        if(!Float.isNaN(f1)) {
            if(this.s0 == null) {
                this.s0 = new HashMap();
            }
            this.s0.put(s, f1);
        }
        if(!Float.isNaN(f2)) {
            if(this.t0 == null) {
                this.t0 = new HashMap();
            }
            this.t0.put(s, f2);
        }
    }

    public float V0() {
        return this.N0;
    }

    public int W0() {
        return this.z0;
    }

    public float X0() {
        return this.L0;
    }

    public int Y0() {
        return this.w0;
    }

    public int Z0() {
        return this.C0;
    }

    public float a1() {
        return this.i;
    }

    @Override  // androidx.constraintlayout.core.state.HelperReference
    public void apply() {
        this.R0();
        this.b(this.q0);
        this.q0.y3(this.K0);
        this.q0.D3(this.u0);
        int v = this.J0;
        if(v != -1) {
            this.q0.x3(v);
        }
        int v1 = this.F0;
        if(v1 != 0) {
            this.q0.F2(v1);
        }
        int v2 = this.H0;
        if(v2 != 0) {
            this.q0.I2(v2);
        }
        int v3 = this.G0;
        if(v3 != 0) {
            this.q0.G2(v3);
        }
        int v4 = this.I0;
        if(v4 != 0) {
            this.q0.D2(v4);
        }
        int v5 = this.E0;
        if(v5 != 0) {
            this.q0.r3(v5);
        }
        int v6 = this.D0;
        if(v6 != 0) {
            this.q0.B3(v6);
        }
        float f = this.i;
        if(f != 0.5f) {
            this.q0.q3(f);
        }
        float f1 = this.N0;
        if(f1 != 0.5f) {
            this.q0.l3(f1);
        }
        float f2 = this.O0;
        if(f2 != 0.5f) {
            this.q0.t3(f2);
        }
        float f3 = this.j;
        if(f3 != 0.5f) {
            this.q0.A3(f3);
        }
        float f4 = this.L0;
        if(f4 != 0.5f) {
            this.q0.n3(f4);
        }
        float f5 = this.M0;
        if(f5 != 0.5f) {
            this.q0.v3(f5);
        }
        int v7 = this.C0;
        if(v7 != 2) {
            this.q0.p3(v7);
        }
        int v8 = this.B0;
        if(v8 != 2) {
            this.q0.z3(v8);
        }
        int v9 = this.v0;
        if(v9 != -1) {
            this.q0.C3(v9);
        }
        int v10 = this.w0;
        if(v10 != -1) {
            this.q0.o3(v10);
        }
        int v11 = this.x0;
        if(v11 != -1) {
            this.q0.w3(v11);
        }
        int v12 = this.y0;
        if(v12 != -1) {
            this.q0.s3(v12);
        }
        int v13 = this.z0;
        if(v13 != -1) {
            this.q0.m3(v13);
        }
        int v14 = this.A0;
        if(v14 != -1) {
            this.q0.u3(v14);
        }
        this.Q0();
    }

    public int b1() {
        return this.E0;
    }

    public int c1() {
        return this.y0;
    }

    public float d1() {
        return this.O0;
    }

    public int e1() {
        return this.A0;
    }

    public float f1() {
        return this.M0;
    }

    public int g1() {
        return this.x0;
    }

    public int h1() {
        return this.J0;
    }

    public int i1() {
        return this.K0;
    }

    public int j1() {
        return this.I0;
    }

    public int k1() {
        return this.F0;
    }

    public int l1() {
        return this.G0;
    }

    public int m1() {
        return this.H0;
    }

    protected float n1(String s) {
        return this.s0 == null || !this.s0.containsKey(s) ? 0.0f : ((float)(((Float)this.s0.get(s))));
    }

    protected float o1(String s) {
        return this.t0 == null || !this.t0.containsKey(s) ? 0.0f : ((float)(((Float)this.t0.get(s))));
    }

    public int p1() {
        return this.B0;
    }

    public float q1() {
        return this.j;
    }

    public int r1() {
        return this.D0;
    }

    public int s1() {
        return this.v0;
    }

    protected float t1(String s) {
        HashMap hashMap0 = this.r0;
        if(hashMap0 == null) {
            return -1.0f;
        }
        return hashMap0.containsKey(s) ? ((float)(((Float)this.r0.get(s)))) : -1.0f;
    }

    public int u1() {
        return this.u0;
    }

    public void v1(float f) {
        this.N0 = f;
    }

    public void w1(int v) {
        this.z0 = v;
    }

    public void x1(float f) {
        this.L0 = f;
    }

    public void y1(int v) {
        this.w0 = v;
    }

    public void z1(int v) {
        this.C0 = v;
    }
}

