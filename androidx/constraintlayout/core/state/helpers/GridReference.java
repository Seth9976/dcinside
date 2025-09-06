package androidx.constraintlayout.core.state.helpers;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State.Helper;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.utils.GridCore;
import androidx.constraintlayout.core.widgets.HelperWidget;

public class GridReference extends HelperReference {
    private String A0;
    private String B0;
    private String C0;
    private String D0;
    private int E0;
    private static final String F0 = "spansrespectwidgetorder";
    private static final String G0 = "subgridbycolrow";
    private GridCore q0;
    private int r0;
    private int s0;
    private int t0;
    private int u0;
    private int v0;
    private int w0;
    private int x0;
    private float y0;
    private float z0;

    public GridReference(@NonNull State state0, @NonNull Helper state$Helper0) {
        super(state0, state$Helper0);
        this.r0 = 0;
        this.s0 = 0;
        this.t0 = 0;
        this.u0 = 0;
        if(state$Helper0 == Helper.j) {
            this.w0 = 1;
            return;
        }
        if(state$Helper0 == Helper.k) {
            this.x0 = 1;
        }
    }

    @Override  // androidx.constraintlayout.core.state.HelperReference
    @NonNull
    public HelperWidget R0() {
        if(this.q0 == null) {
            this.q0 = new GridCore();
        }
        return this.q0;
    }

    @Override  // androidx.constraintlayout.core.state.HelperReference
    public void T0(@Nullable HelperWidget helperWidget0) {
        if(helperWidget0 instanceof GridCore) {
            this.q0 = (GridCore)helperWidget0;
            return;
        }
        this.q0 = null;
    }

    @Nullable
    public String U0() {
        return this.B0;
    }

    public int V0() {
        return this.x0;
    }

    public int W0() {
        return this.E0;
    }

    public float X0() {
        return this.y0;
    }

    public int Y0() {
        return this.v0;
    }

    public int Z0() {
        return this.u0;
    }

    public int a1() {
        return this.s0;
    }

    @Override  // androidx.constraintlayout.core.state.HelperReference
    public void apply() {
        this.R0();
        this.q0.t3(this.v0);
        int v = this.w0;
        if(v != 0) {
            this.q0.v3(v);
        }
        int v1 = this.x0;
        if(v1 != 0) {
            this.q0.p3(v1);
        }
        float f = this.y0;
        if(f != 0.0f) {
            this.q0.s3(f);
        }
        float f1 = this.z0;
        if(f1 != 0.0f) {
            this.q0.y3(f1);
        }
        if(this.A0 != null && !this.A0.isEmpty()) {
            this.q0.u3(this.A0);
        }
        if(this.B0 != null && !this.B0.isEmpty()) {
            this.q0.o3(this.B0);
        }
        if(this.C0 != null && !this.C0.isEmpty()) {
            this.q0.x3(this.C0);
        }
        if(this.D0 != null && !this.D0.isEmpty()) {
            this.q0.w3(this.D0);
        }
        this.q0.r3(this.E0);
        this.q0.H2(this.r0);
        this.q0.E2(this.s0);
        this.q0.I2(this.t0);
        this.q0.D2(this.u0);
        this.Q0();
    }

    public int b1() {
        return this.r0;
    }

    public int c1() {
        return this.t0;
    }

    @Nullable
    public String d1() {
        return this.A0;
    }

    public int e1() {
        return this.w0;
    }

    @Nullable
    public String f1() {
        return this.D0;
    }

    @Nullable
    public String g1() {
        return this.C0;
    }

    public float h1() {
        return this.z0;
    }

    public void i1(@NonNull String s) {
        this.B0 = s;
    }

    public void j1(int v) {
        if(super.S0() == Helper.j) {
            return;
        }
        this.x0 = v;
    }

    public void k1(int v) {
        this.E0 = v;
    }

    public void l1(@NonNull String s) {
        if(s.isEmpty()) {
            return;
        }
        String[] arr_s = s.split("\\|");
        this.E0 = 0;
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v].toLowerCase();
            s1.hashCode();
            if(s1.equals("subgridbycolrow")) {
                this.E0 |= 1;
            }
            else if(s1.equals("spansrespectwidgetorder")) {
                this.E0 |= 2;
            }
        }
    }

    public void m1(float f) {
        this.y0 = f;
    }

    public void n1(int v) {
        this.v0 = v;
    }

    public void o1(int v) {
        this.u0 = v;
    }

    public void p1(int v) {
        this.s0 = v;
    }

    public void q1(int v) {
        this.r0 = v;
    }

    public void r1(int v) {
        this.t0 = v;
    }

    public void s1(@NonNull String s) {
        this.A0 = s;
    }

    public void t1(int v) {
        if(super.S0() == Helper.k) {
            return;
        }
        this.w0 = v;
    }

    public void u1(@NonNull String s) {
        this.D0 = s;
    }

    public void v1(@NonNull String s) {
        this.C0 = s;
    }

    public void w1(float f) {
        this.z0 = f;
    }
}

