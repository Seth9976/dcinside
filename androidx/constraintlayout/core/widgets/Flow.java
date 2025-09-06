package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Flow extends VirtualLayout {
    class WidgetsList {
        private int a;
        private ConstraintWidget b;
        int c;
        private ConstraintAnchor d;
        private ConstraintAnchor e;
        private ConstraintAnchor f;
        private ConstraintAnchor g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;
        private int n;
        private int o;
        private int p;
        private int q;
        final Flow r;

        WidgetsList(int v, ConstraintAnchor constraintAnchor0, ConstraintAnchor constraintAnchor1, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, int v1) {
            this.b = null;
            this.c = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            this.o = 0;
            this.p = 0;
            this.q = 0;
            this.a = v;
            this.d = constraintAnchor0;
            this.e = constraintAnchor1;
            this.f = constraintAnchor2;
            this.g = constraintAnchor3;
            this.h = flow0.t2();
            this.i = flow0.v2();
            this.j = flow0.u2();
            this.k = flow0.s2();
            this.q = v1;
        }

        public void b(ConstraintWidget constraintWidget0) {
            int v = 0;
            if(this.a == 0) {
                int v1 = Flow.this.g3(constraintWidget0, this.q);
                if(constraintWidget0.H() == DimensionBehaviour.c) {
                    ++this.p;
                    v1 = 0;
                }
                int v2 = Flow.this.c2;
                if(constraintWidget0.l0() != 8) {
                    v = v2;
                }
                this.l += v1 + v;
                int v3 = Flow.this.f3(constraintWidget0, this.q);
                if(this.b == null || this.c < v3) {
                    this.b = constraintWidget0;
                    this.c = v3;
                    this.m = v3;
                }
            }
            else {
                int v4 = Flow.this.g3(constraintWidget0, this.q);
                int v5 = Flow.this.f3(constraintWidget0, this.q);
                if(constraintWidget0.j0() == DimensionBehaviour.c) {
                    ++this.p;
                    v5 = 0;
                }
                int v6 = Flow.this.d2;
                if(constraintWidget0.l0() != 8) {
                    v = v6;
                }
                this.m += v5 + v;
                if(this.b == null || this.c < v4) {
                    this.b = constraintWidget0;
                    this.c = v4;
                    this.l = v4;
                }
            }
            ++this.o;
        }

        public void c() {
            this.c = 0;
            this.b = null;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            this.o = 0;
            this.p = 0;
        }

        public void d(boolean z, int v, boolean z1) {
            ConstraintWidget constraintWidget5;
            int v1 = this.o;
            for(int v2 = 0; v2 < v1 && this.n + v2 < Flow.this.o2; ++v2) {
                ConstraintWidget constraintWidget0 = Flow.this.n2[this.n + v2];
                if(constraintWidget0 != null) {
                    constraintWidget0.U0();
                }
            }
            if(v1 != 0 && this.b != null) {
                boolean z2 = z1 && v == 0;
                int v4 = -1;
                int v5 = -1;
                for(int v3 = 0; v3 < v1; ++v3) {
                    int v6 = z ? v1 - 1 - v3 : v3;
                    if(this.n + v6 >= Flow.this.o2) {
                        break;
                    }
                    ConstraintWidget constraintWidget1 = Flow.this.n2[this.n + v6];
                    if(constraintWidget1 != null && constraintWidget1.l0() == 0) {
                        if(v4 == -1) {
                            v4 = v3;
                        }
                        v5 = v3;
                    }
                }
                ConstraintWidget constraintWidget2 = null;
                if(this.a == 0) {
                    ConstraintWidget constraintWidget3 = this.b;
                    constraintWidget3.X1(Flow.this.R1);
                    constraintWidget3.R.a(this.e, (v <= 0 ? this.i : this.i + Flow.this.d2));
                    if(z1) {
                        constraintWidget3.T.a(this.g, this.k);
                    }
                    if(v > 0) {
                        this.e.d.T.a(constraintWidget3.R, 0);
                    }
                    if(Flow.this.f2 == 3 && !constraintWidget3.q0()) {
                        int v7 = 0;
                        while(v7 < v1) {
                            int v8 = z ? v1 - 1 - v7 : v7;
                            if(this.n + v8 >= Flow.this.o2) {
                                break;
                            }
                            ConstraintWidget constraintWidget4 = Flow.this.n2[this.n + v8];
                            if(constraintWidget4.q0()) {
                                constraintWidget5 = constraintWidget4;
                                goto label_44;
                            }
                            ++v7;
                        }
                    }
                    constraintWidget5 = constraintWidget3;
                label_44:
                    int v9 = 0;
                    while(v9 < v1) {
                        int v10 = z ? v1 - 1 - v9 : v9;
                        if(this.n + v10 >= Flow.this.o2) {
                            return;
                        }
                        ConstraintWidget constraintWidget6 = Flow.this.n2[this.n + v10];
                        if(constraintWidget6 == null) {
                            constraintWidget6 = constraintWidget2;
                        }
                        else {
                            if(v9 == 0) {
                                constraintWidget6.l(constraintWidget6.Q, this.d, this.h);
                            }
                            if(v10 == 0) {
                                int v11 = Flow.this.Q1;
                                float f = z ? 1.0f - Flow.this.W1 : Flow.this.W1;
                                if(this.n != 0 || Flow.this.S1 == -1) {
                                    if(z1 && Flow.this.U1 != -1) {
                                        v11 = Flow.this.U1;
                                        f = z ? 1.0f - Flow.this.a2 : Flow.this.a2;
                                    }
                                    constraintWidget6.C1(v11);
                                    constraintWidget6.B1(f);
                                }
                                else {
                                    constraintWidget6.C1(Flow.this.S1);
                                    constraintWidget6.B1((z ? 1.0f - Flow.this.Y1 : Flow.this.Y1));
                                }
                            }
                            if(v9 == v1 - 1) {
                                constraintWidget6.l(constraintWidget6.S, this.f, this.j);
                            }
                            if(constraintWidget2 != null) {
                                constraintWidget6.Q.a(constraintWidget2.S, Flow.this.c2);
                                if(v9 == v4) {
                                    constraintWidget6.Q.B(this.h);
                                }
                                constraintWidget2.S.a(constraintWidget6.Q, 0);
                                if(v9 == v5 + 1) {
                                    constraintWidget2.S.B(this.j);
                                }
                            }
                            if(constraintWidget6 != constraintWidget3) {
                                if(Flow.this.f2 != 3 || !constraintWidget5.q0() || constraintWidget6 == constraintWidget5 || !constraintWidget6.q0()) {
                                    switch(Flow.this.f2) {
                                        case 0: {
                                            constraintWidget6.R.a(constraintWidget3.R, 0);
                                            break;
                                        }
                                        case 1: {
                                            constraintWidget6.T.a(constraintWidget3.T, 0);
                                            break;
                                        }
                                        default: {
                                            if(z2) {
                                                constraintWidget6.R.a(this.e, this.i);
                                                constraintWidget6.T.a(this.g, this.k);
                                            }
                                            else {
                                                constraintWidget6.R.a(constraintWidget3.R, 0);
                                                constraintWidget6.T.a(constraintWidget3.T, 0);
                                            }
                                        }
                                    }
                                }
                                else {
                                    constraintWidget6.U.a(constraintWidget5.U, 0);
                                }
                            }
                        }
                        ++v9;
                        constraintWidget2 = constraintWidget6;
                    }
                }
                else {
                    ConstraintWidget constraintWidget7 = this.b;
                    constraintWidget7.C1(Flow.this.Q1);
                    int v12 = v <= 0 ? this.h : this.h + Flow.this.c2;
                    if(z) {
                        constraintWidget7.S.a(this.f, v12);
                        if(z1) {
                            constraintWidget7.Q.a(this.d, this.j);
                        }
                        if(v > 0) {
                            this.f.d.Q.a(constraintWidget7.S, 0);
                        }
                    }
                    else {
                        constraintWidget7.Q.a(this.d, v12);
                        if(z1) {
                            constraintWidget7.S.a(this.f, this.j);
                        }
                        if(v > 0) {
                            this.d.d.S.a(constraintWidget7.Q, 0);
                        }
                    }
                    for(int v13 = 0; v13 < v1 && this.n + v13 < Flow.this.o2; ++v13) {
                        ConstraintWidget constraintWidget8 = Flow.this.n2[this.n + v13];
                        if(constraintWidget8 != null) {
                            if(v13 == 0) {
                                constraintWidget8.l(constraintWidget8.R, this.e, this.i);
                                int v14 = Flow.this.R1;
                                float f1 = Flow.this.X1;
                                if(this.n == 0 && Flow.this.T1 != -1) {
                                    v14 = Flow.this.T1;
                                    f1 = Flow.this.Z1;
                                }
                                else if(z1 && Flow.this.V1 != -1) {
                                    v14 = Flow.this.V1;
                                    f1 = Flow.this.b2;
                                }
                                constraintWidget8.X1(v14);
                                constraintWidget8.W1(f1);
                            }
                            if(v13 == v1 - 1) {
                                constraintWidget8.l(constraintWidget8.T, this.g, this.k);
                            }
                            if(constraintWidget2 != null) {
                                constraintWidget8.R.a(constraintWidget2.T, Flow.this.d2);
                                if(v13 == v4) {
                                    constraintWidget8.R.B(this.i);
                                }
                                constraintWidget2.T.a(constraintWidget8.R, 0);
                                if(v13 == v5 + 1) {
                                    constraintWidget2.T.B(this.k);
                                }
                            }
                            if(constraintWidget8 != constraintWidget7) {
                                if(z) {
                                    int v15 = Flow.this.e2;
                                    if(v15 == 0) {
                                        constraintWidget8.S.a(constraintWidget7.S, 0);
                                    }
                                    else {
                                        switch(v15) {
                                            case 1: {
                                                constraintWidget8.Q.a(constraintWidget7.Q, 0);
                                                break;
                                            }
                                            case 2: {
                                                constraintWidget8.Q.a(constraintWidget7.Q, 0);
                                                constraintWidget8.S.a(constraintWidget7.S, 0);
                                            }
                                        }
                                    }
                                }
                                else {
                                    int v16 = Flow.this.e2;
                                    if(v16 == 0) {
                                        constraintWidget8.Q.a(constraintWidget7.Q, 0);
                                    }
                                    else {
                                        switch(v16) {
                                            case 1: {
                                                constraintWidget8.S.a(constraintWidget7.S, 0);
                                                break;
                                            }
                                            case 2: {
                                                if(z2) {
                                                    constraintWidget8.Q.a(this.d, this.h);
                                                    constraintWidget8.S.a(this.f, this.j);
                                                }
                                                else {
                                                    constraintWidget8.Q.a(constraintWidget7.Q, 0);
                                                    constraintWidget8.S.a(constraintWidget7.S, 0);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            constraintWidget2 = constraintWidget8;
                        }
                    }
                }
            }
        }

        public int e() {
            return this.a == 1 ? this.m - Flow.this.d2 : this.m;
        }

        public int f() {
            return this.a == 0 ? this.l - Flow.this.c2 : this.l;
        }

        public void g(int v) {
            int v1 = this.p;
            if(v1 == 0) {
                return;
            }
            int v2 = this.o;
            int v3 = v / v1;
            for(int v4 = 0; v4 < v2 && this.n + v4 < Flow.this.o2; ++v4) {
                ConstraintWidget constraintWidget0 = Flow.this.n2[this.n + v4];
                if(this.a != 0) {
                    if(constraintWidget0 != null && constraintWidget0.j0() == DimensionBehaviour.c && constraintWidget0.x == 0) {
                        DimensionBehaviour constraintWidget$DimensionBehaviour1 = constraintWidget0.H();
                        int v6 = constraintWidget0.m0();
                        Flow.this.x2(constraintWidget0, constraintWidget$DimensionBehaviour1, v6, DimensionBehaviour.a, v3);
                    }
                }
                else if(constraintWidget0 != null && constraintWidget0.H() == DimensionBehaviour.c && constraintWidget0.w == 0) {
                    DimensionBehaviour constraintWidget$DimensionBehaviour0 = constraintWidget0.j0();
                    int v5 = constraintWidget0.D();
                    Flow.this.x2(constraintWidget0, DimensionBehaviour.a, v3, constraintWidget$DimensionBehaviour0, v5);
                }
            }
            this.h();
        }

        private void h() {
            this.l = 0;
            this.m = 0;
            this.b = null;
            this.c = 0;
            int v = this.o;
            for(int v1 = 0; v1 < v && this.n + v1 < Flow.this.o2; ++v1) {
                ConstraintWidget constraintWidget0 = Flow.this.n2[this.n + v1];
                if(this.a == 0) {
                    int v2 = constraintWidget0.m0();
                    this.l += v2 + (constraintWidget0.l0() == 8 ? 0 : Flow.this.c2);
                    int v3 = Flow.this.f3(constraintWidget0, this.q);
                    if(this.b == null || this.c < v3) {
                        this.b = constraintWidget0;
                        this.c = v3;
                        this.m = v3;
                    }
                }
                else {
                    int v4 = Flow.this.g3(constraintWidget0, this.q);
                    int v5 = Flow.this.f3(constraintWidget0, this.q);
                    this.m += v5 + (constraintWidget0.l0() == 8 ? 0 : Flow.this.d2);
                    if(this.b == null || this.c < v4) {
                        this.b = constraintWidget0;
                        this.c = v4;
                        this.l = v4;
                    }
                }
            }
        }

        public void i(int v) {
            this.n = v;
        }

        public void j(int v, ConstraintAnchor constraintAnchor0, ConstraintAnchor constraintAnchor1, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, int v1, int v2, int v3, int v4, int v5) {
            this.a = v;
            this.d = constraintAnchor0;
            this.e = constraintAnchor1;
            this.f = constraintAnchor2;
            this.g = constraintAnchor3;
            this.h = v1;
            this.i = v2;
            this.j = v3;
            this.k = v4;
            this.q = v5;
        }
    }

    private int Q1;
    private int R1;
    private int S1;
    private int T1;
    private int U1;
    private int V1;
    private float W1;
    private float X1;
    private float Y1;
    private float Z1;
    private float a2;
    private float b2;
    private int c2;
    private int d2;
    private int e2;
    private int f2;
    private int g2;
    private int h2;
    private int i2;
    private ArrayList j2;
    private ConstraintWidget[] k2;
    private ConstraintWidget[] l2;
    private int[] m2;
    private ConstraintWidget[] n2;
    private int o2;
    public static final int p2 = 0;
    public static final int q2 = 1;
    public static final int r2 = 2;
    public static final int s2 = 0;
    public static final int t2 = 1;
    public static final int u2 = 2;
    public static final int v2 = 3;
    public static final int w2 = 0;
    public static final int x2 = 1;
    public static final int y2 = 2;
    public static final int z2 = 3;

    public Flow() {
        this.Q1 = -1;
        this.R1 = -1;
        this.S1 = -1;
        this.T1 = -1;
        this.U1 = -1;
        this.V1 = -1;
        this.W1 = 0.5f;
        this.X1 = 0.5f;
        this.Y1 = 0.5f;
        this.Z1 = 0.5f;
        this.a2 = 0.5f;
        this.b2 = 0.5f;
        this.c2 = 0;
        this.d2 = 0;
        this.e2 = 2;
        this.f2 = 2;
        this.g2 = 0;
        this.h2 = -1;
        this.i2 = 0;
        this.j2 = new ArrayList();
        this.k2 = null;
        this.l2 = null;
        this.m2 = null;
        this.o2 = 0;
    }

    public void A3(float f) {
        this.X1 = f;
    }

    public void B3(int v) {
        this.d2 = v;
    }

    public void C3(int v) {
        this.R1 = v;
    }

    public void D3(int v) {
        this.g2 = v;
    }

    private void d3(boolean z) {
        float f1;
        int v4;
        if(this.m2 != null && this.l2 != null && this.k2 != null) {
            for(int v = 0; v < this.o2; ++v) {
                this.n2[v].U0();
            }
            int[] arr_v = this.m2;
            int v1 = arr_v[0];
            int v2 = arr_v[1];
            float f = this.W1;
            ConstraintWidget constraintWidget0 = null;
            int v3 = 0;
            while(v3 < v1) {
                if(z) {
                    v4 = v1 - v3 - 1;
                    f1 = 1.0f - this.W1;
                }
                else {
                    f1 = f;
                    v4 = v3;
                }
                ConstraintWidget constraintWidget1 = this.l2[v4];
                if(constraintWidget1 != null && constraintWidget1.l0() != 8) {
                    if(v3 == 0) {
                        constraintWidget1.l(constraintWidget1.Q, this.Q, this.t2());
                        constraintWidget1.C1(this.Q1);
                        constraintWidget1.B1(f1);
                    }
                    if(v3 == v1 - 1) {
                        constraintWidget1.l(constraintWidget1.S, this.S, this.u2());
                    }
                    if(v3 > 0 && constraintWidget0 != null) {
                        constraintWidget1.l(constraintWidget1.Q, constraintWidget0.S, this.c2);
                        constraintWidget0.l(constraintWidget0.S, constraintWidget1.Q, 0);
                    }
                    constraintWidget0 = constraintWidget1;
                }
                ++v3;
                f = f1;
            }
            for(int v5 = 0; v5 < v2; ++v5) {
                ConstraintWidget constraintWidget2 = this.k2[v5];
                if(constraintWidget2 != null && constraintWidget2.l0() != 8) {
                    if(v5 == 0) {
                        constraintWidget2.l(constraintWidget2.R, this.R, this.v2());
                        constraintWidget2.X1(this.R1);
                        constraintWidget2.W1(this.X1);
                    }
                    if(v5 == v2 - 1) {
                        constraintWidget2.l(constraintWidget2.T, this.T, this.s2());
                    }
                    if(v5 > 0 && constraintWidget0 != null) {
                        constraintWidget2.l(constraintWidget2.R, constraintWidget0.T, this.d2);
                        constraintWidget0.l(constraintWidget0.T, constraintWidget2.R, 0);
                    }
                    constraintWidget0 = constraintWidget2;
                }
            }
            for(int v6 = 0; v6 < v1; ++v6) {
                for(int v7 = 0; v7 < v2; ++v7) {
                    int v8 = this.i2 == 1 ? v6 * v2 + v7 : v7 * v1 + v6;
                    ConstraintWidget[] arr_constraintWidget = this.n2;
                    if(v8 < arr_constraintWidget.length) {
                        ConstraintWidget constraintWidget3 = arr_constraintWidget[v8];
                        if(constraintWidget3 != null && constraintWidget3.l0() != 8) {
                            ConstraintWidget constraintWidget4 = this.l2[v6];
                            ConstraintWidget constraintWidget5 = this.k2[v7];
                            if(constraintWidget3 != constraintWidget4) {
                                constraintWidget3.l(constraintWidget3.Q, constraintWidget4.Q, 0);
                                constraintWidget3.l(constraintWidget3.S, constraintWidget4.S, 0);
                            }
                            if(constraintWidget3 != constraintWidget5) {
                                constraintWidget3.l(constraintWidget3.R, constraintWidget5.R, 0);
                                constraintWidget3.l(constraintWidget3.T, constraintWidget5.T, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    public float e3() {
        return (float)this.h2;
    }

    private int f3(ConstraintWidget constraintWidget0, int v) {
        if(constraintWidget0 == null) {
            return 0;
        }
        if(constraintWidget0.j0() == DimensionBehaviour.c) {
            int v1 = constraintWidget0.x;
            if(v1 == 0) {
                return 0;
            }
            switch(v1) {
                case 1: {
                    return constraintWidget0.D();
                }
                case 2: {
                    int v2 = (int)(constraintWidget0.E * ((float)v));
                    if(v2 != constraintWidget0.D()) {
                        constraintWidget0.O1(true);
                        this.x2(constraintWidget0, constraintWidget0.H(), constraintWidget0.m0(), DimensionBehaviour.a, v2);
                    }
                    return v2;
                }
                case 3: {
                    return (int)(((float)constraintWidget0.m0()) * constraintWidget0.f0 + 0.5f);
                }
                default: {
                    return constraintWidget0.D();
                }
            }
        }
        return constraintWidget0.D();
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void g(LinearSystem linearSystem0, boolean z) {
        super.g(linearSystem0, z);
        boolean z1 = this.U() != null && ((ConstraintWidgetContainer)this.U()).P2();
        switch(this.g2) {
            case 0: {
                if(this.j2.size() > 0) {
                    ((WidgetsList)this.j2.get(0)).d(z1, 0, true);
                }
                break;
            }
            case 1: {
                int v = this.j2.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    ((WidgetsList)this.j2.get(v1)).d(z1, v1, v1 == v - 1);
                }
                break;
            }
            case 2: {
                this.d3(z1);
                break;
            }
            case 3: {
                int v2 = this.j2.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    ((WidgetsList)this.j2.get(v3)).d(z1, v3, v3 == v2 - 1);
                }
            }
        }
        this.A2(false);
    }

    private int g3(ConstraintWidget constraintWidget0, int v) {
        if(constraintWidget0 == null) {
            return 0;
        }
        if(constraintWidget0.H() == DimensionBehaviour.c) {
            int v1 = constraintWidget0.w;
            if(v1 == 0) {
                return 0;
            }
            switch(v1) {
                case 1: {
                    return constraintWidget0.m0();
                }
                case 2: {
                    int v2 = (int)(constraintWidget0.B * ((float)v));
                    if(v2 != constraintWidget0.m0()) {
                        constraintWidget0.O1(true);
                        DimensionBehaviour constraintWidget$DimensionBehaviour0 = constraintWidget0.j0();
                        int v3 = constraintWidget0.D();
                        this.x2(constraintWidget0, DimensionBehaviour.a, v2, constraintWidget$DimensionBehaviour0, v3);
                    }
                    return v2;
                }
                case 3: {
                    return (int)(((float)constraintWidget0.D()) * constraintWidget0.f0 + 0.5f);
                }
                default: {
                    return constraintWidget0.m0();
                }
            }
        }
        return constraintWidget0.m0();
    }

    private void h3(ConstraintWidget[] arr_constraintWidget, int v, int v1, int v2, int[] arr_v) {
        boolean z;
        int v7;
        int v6;
        if(v1 == 0) {
            int v3 = this.h2;
            if(v3 <= 0) {
                v3 = 0;
                int v5 = 0;
                for(int v4 = 0; v4 < v; ++v4) {
                    if(v4 > 0) {
                        v5 += this.c2;
                    }
                    ConstraintWidget constraintWidget0 = arr_constraintWidget[v4];
                    if(constraintWidget0 != null) {
                        v5 += this.g3(constraintWidget0, v2);
                        if(v5 > v2) {
                            break;
                        }
                        ++v3;
                    }
                }
            }
            v6 = v3;
            v7 = 0;
        }
        else {
            v7 = this.h2;
            if(v7 <= 0) {
                v7 = 0;
                int v9 = 0;
                for(int v8 = 0; v8 < v; ++v8) {
                    if(v8 > 0) {
                        v9 += this.d2;
                    }
                    ConstraintWidget constraintWidget1 = arr_constraintWidget[v8];
                    if(constraintWidget1 != null) {
                        v9 += this.f3(constraintWidget1, v2);
                        if(v9 > v2) {
                            break;
                        }
                        ++v7;
                    }
                }
            }
            v6 = 0;
        }
        if(this.m2 == null) {
            this.m2 = new int[2];
        }
        if((v7 != 0 || v1 != 1) && (v6 != 0 || v1 != 0)) {
            z = false;
            goto label_41;
        }
    alab1:
        while(true) {
            while(true) {
            label_40:
                z = true;
            label_41:
                if(z) {
                    break alab1;
                }
                if(v1 == 0) {
                    v7 = (int)Math.ceil(((float)v) / ((float)v6));
                }
                else {
                    v6 = (int)Math.ceil(((float)v) / ((float)v7));
                }
                ConstraintWidget[] arr_constraintWidget1 = this.l2;
                if(arr_constraintWidget1 == null || arr_constraintWidget1.length < v6) {
                    this.l2 = new ConstraintWidget[v6];
                }
                else {
                    Arrays.fill(arr_constraintWidget1, null);
                }
                ConstraintWidget[] arr_constraintWidget2 = this.k2;
                if(arr_constraintWidget2 == null || arr_constraintWidget2.length < v7) {
                    this.k2 = new ConstraintWidget[v7];
                }
                else {
                    Arrays.fill(arr_constraintWidget2, null);
                }
                for(int v10 = 0; v10 < v6; ++v10) {
                    for(int v11 = 0; v11 < v7; ++v11) {
                        int v12 = v1 == 1 ? v10 * v7 + v11 : v11 * v6 + v10;
                        if(v12 < arr_constraintWidget.length) {
                            ConstraintWidget constraintWidget2 = arr_constraintWidget[v12];
                            if(constraintWidget2 != null) {
                                int v13 = this.g3(constraintWidget2, v2);
                                ConstraintWidget constraintWidget3 = this.l2[v10];
                                if(constraintWidget3 == null || constraintWidget3.m0() < v13) {
                                    this.l2[v10] = constraintWidget2;
                                }
                                int v14 = this.f3(constraintWidget2, v2);
                                ConstraintWidget constraintWidget4 = this.k2[v11];
                                if(constraintWidget4 == null || constraintWidget4.D() < v14) {
                                    this.k2[v11] = constraintWidget2;
                                }
                            }
                        }
                    }
                }
                int v16 = 0;
                for(int v15 = 0; v15 < v6; ++v15) {
                    ConstraintWidget constraintWidget5 = this.l2[v15];
                    if(constraintWidget5 != null) {
                        if(v15 > 0) {
                            v16 += this.c2;
                        }
                        v16 += this.g3(constraintWidget5, v2);
                    }
                }
                int v18 = 0;
                for(int v17 = 0; v17 < v7; ++v17) {
                    ConstraintWidget constraintWidget6 = this.k2[v17];
                    if(constraintWidget6 != null) {
                        if(v17 > 0) {
                            v18 += this.d2;
                        }
                        v18 += this.f3(constraintWidget6, v2);
                    }
                }
                arr_v[0] = v16;
                arr_v[1] = v18;
                if(v1 == 0) {
                    if(v16 <= v2 || v6 <= 1) {
                        continue;
                    }
                    break;
                }
                else {
                    goto label_102;
                }
                break alab1;
            }
            --v6;
            goto label_41;
        label_102:
            if(v18 <= v2 || v7 <= 1) {
                goto label_40;
            }
            --v7;
            goto label_41;
        }
        int[] arr_v1 = this.m2;
        arr_v1[0] = v6;
        arr_v1[1] = v7;
    }

    private void i3(ConstraintWidget[] arr_constraintWidget, int v, int v1, int v2, int[] arr_v) {
        int v26;
        ConstraintAnchor constraintAnchor8;
        int v24;
        int v23;
        ConstraintAnchor constraintAnchor6;
        int v3;
        if(v == 0) {
            return;
        }
        this.j2.clear();
        WidgetsList flow$WidgetsList0 = new WidgetsList(this, v1, this.Q, this.R, this.S, this.T, v2);
        this.j2.add(flow$WidgetsList0);
        if(v1 == 0) {
            v3 = 0;
            int v4 = 0;
            int v5 = 0;
            while(v5 < v) {
                ConstraintWidget constraintWidget0 = arr_constraintWidget[v5];
                int v6 = this.g3(constraintWidget0, v2);
                if(constraintWidget0.H() == DimensionBehaviour.c) {
                    ++v3;
                }
                if(((v4 == v2 || this.c2 + v4 + v6 > v2) && flow$WidgetsList0.b != null || v5 <= 0 || (this.h2 <= 0 || v5 % this.h2 != 0) ? (v4 == v2 || this.c2 + v4 + v6 > v2) && flow$WidgetsList0.b != null : true)) {
                    flow$WidgetsList0 = new WidgetsList(this, 0, this.Q, this.R, this.S, this.T, v2);
                    flow$WidgetsList0.i(v5);
                    this.j2.add(flow$WidgetsList0);
                }
                else if(v5 > 0) {
                    v4 += this.c2 + v6;
                    goto label_23;
                }
                v4 = v6;
            label_23:
                flow$WidgetsList0.b(constraintWidget0);
                ++v5;
            }
        }
        else {
            v3 = 0;
            int v7 = 0;
            int v8 = 0;
            while(v8 < v) {
                ConstraintWidget constraintWidget1 = arr_constraintWidget[v8];
                int v9 = this.f3(constraintWidget1, v2);
                if(constraintWidget1.j0() == DimensionBehaviour.c) {
                    ++v3;
                }
                if(((v7 == v2 || this.d2 + v7 + v9 > v2) && flow$WidgetsList0.b != null || v8 <= 0 || (this.h2 <= 0 || v8 % this.h2 != 0) ? (v7 == v2 || this.d2 + v7 + v9 > v2) && flow$WidgetsList0.b != null : true)) {
                    flow$WidgetsList0 = new WidgetsList(this, v1, this.Q, this.R, this.S, this.T, v2);
                    flow$WidgetsList0.i(v8);
                    this.j2.add(flow$WidgetsList0);
                }
                else if(v8 > 0) {
                    v7 += this.d2 + v9;
                    goto label_44;
                }
                v7 = v9;
            label_44:
                flow$WidgetsList0.b(constraintWidget1);
                ++v8;
            }
        }
        int v10 = this.j2.size();
        ConstraintAnchor constraintAnchor0 = this.Q;
        ConstraintAnchor constraintAnchor1 = this.R;
        ConstraintAnchor constraintAnchor2 = this.S;
        ConstraintAnchor constraintAnchor3 = this.T;
        int v11 = this.t2();
        int v12 = this.v2();
        int v13 = this.u2();
        int v14 = this.s2();
        if(v3 > 0 && (this.H() == DimensionBehaviour.b || this.j0() == DimensionBehaviour.b)) {
            for(int v15 = 0; v15 < v10; ++v15) {
                WidgetsList flow$WidgetsList1 = (WidgetsList)this.j2.get(v15);
                if(v1 == 0) {
                    flow$WidgetsList1.g(v2 - flow$WidgetsList1.f());
                }
                else {
                    flow$WidgetsList1.g(v2 - flow$WidgetsList1.e());
                }
            }
        }
        int v16 = v12;
        int v17 = v13;
        int v18 = 0;
        int v19 = 0;
        int v20 = 0;
        int v21 = v11;
        ConstraintAnchor constraintAnchor4 = constraintAnchor1;
        ConstraintAnchor constraintAnchor5 = constraintAnchor0;
        int v22 = v14;
        while(v20 < v10) {
            WidgetsList flow$WidgetsList2 = (WidgetsList)this.j2.get(v20);
            if(v1 == 0) {
                if(v20 < v10 - 1) {
                    constraintAnchor6 = ((WidgetsList)this.j2.get(v20 + 1)).b.R;
                    v23 = 0;
                }
                else {
                    constraintAnchor6 = this.T;
                    v23 = this.s2();
                }
                ConstraintAnchor constraintAnchor7 = flow$WidgetsList2.b.T;
                v24 = v20;
                flow$WidgetsList2.j(0, constraintAnchor5, constraintAnchor4, constraintAnchor2, constraintAnchor6, v21, v16, v17, v23, v2);
                int v25 = Math.max(v19, flow$WidgetsList2.f());
                v18 += flow$WidgetsList2.e();
                if(v24 > 0) {
                    v18 += this.d2;
                }
                v19 = v25;
                constraintAnchor4 = constraintAnchor7;
                v16 = 0;
                constraintAnchor8 = constraintAnchor2;
                constraintAnchor3 = constraintAnchor6;
                v22 = v23;
            }
            else {
                v24 = v20;
                if(v24 < v10 - 1) {
                    constraintAnchor8 = ((WidgetsList)this.j2.get(v24 + 1)).b.Q;
                    v26 = 0;
                }
                else {
                    constraintAnchor8 = this.S;
                    v26 = this.u2();
                }
                ConstraintAnchor constraintAnchor9 = flow$WidgetsList2.b.S;
                flow$WidgetsList2.j(v1, constraintAnchor5, constraintAnchor4, constraintAnchor8, constraintAnchor3, v21, v16, v26, v22, v2);
                v19 += flow$WidgetsList2.f();
                int v27 = Math.max(v18, flow$WidgetsList2.e());
                if(v24 > 0) {
                    v19 += this.c2;
                }
                v18 = v27;
                v17 = v26;
                constraintAnchor5 = constraintAnchor9;
                v21 = 0;
            }
            v20 = v24 + 1;
            constraintAnchor2 = constraintAnchor8;
        }
        arr_v[0] = v19;
        arr_v[1] = v18;
    }

    private void j3(ConstraintWidget[] arr_constraintWidget, int v, int v1, int v2, int[] arr_v) {
        int v28;
        ConstraintAnchor constraintAnchor8;
        int v26;
        int v25;
        ConstraintAnchor constraintAnchor6;
        int v4;
        if(v == 0) {
            return;
        }
        this.j2.clear();
        WidgetsList flow$WidgetsList0 = new WidgetsList(this, v1, this.Q, this.R, this.S, this.T, v2);
        this.j2.add(flow$WidgetsList0);
        if(v1 == 0) {
            int v3 = 0;
            v4 = 0;
            int v5 = 0;
            for(int v6 = 0; v6 < v; ++v6) {
                ++v3;
                ConstraintWidget constraintWidget0 = arr_constraintWidget[v6];
                int v7 = this.g3(constraintWidget0, v2);
                if(constraintWidget0.H() == DimensionBehaviour.c) {
                    ++v4;
                }
                if(((v5 == v2 || this.c2 + v5 + v7 > v2) && flow$WidgetsList0.b != null || v6 <= 0 || (this.h2 <= 0 || v3 <= this.h2) ? (v5 == v2 || this.c2 + v5 + v7 > v2) && flow$WidgetsList0.b != null : true)) {
                    flow$WidgetsList0 = new WidgetsList(this, 0, this.Q, this.R, this.S, this.T, v2);
                    flow$WidgetsList0.i(v6);
                    this.j2.add(flow$WidgetsList0);
                    v5 = v7;
                    v3 = 1;
                }
                else {
                    v5 = v6 <= 0 ? v7 : v5 + (this.c2 + v7);
                }
                flow$WidgetsList0.b(constraintWidget0);
            }
        }
        else {
            int v8 = 0;
            v4 = 0;
            int v9 = 0;
            for(int v10 = 0; v10 < v; ++v10) {
                ++v8;
                ConstraintWidget constraintWidget1 = arr_constraintWidget[v10];
                int v11 = this.f3(constraintWidget1, v2);
                if(constraintWidget1.j0() == DimensionBehaviour.c) {
                    ++v4;
                }
                if(((v9 == v2 || this.d2 + v9 + v11 > v2) && flow$WidgetsList0.b != null || v10 <= 0 || (this.h2 <= 0 || v8 <= this.h2) ? (v9 == v2 || this.d2 + v9 + v11 > v2) && flow$WidgetsList0.b != null : true)) {
                    flow$WidgetsList0 = new WidgetsList(this, v1, this.Q, this.R, this.S, this.T, v2);
                    flow$WidgetsList0.i(v10);
                    this.j2.add(flow$WidgetsList0);
                    v9 = v11;
                    v8 = 1;
                }
                else {
                    v9 = v10 <= 0 ? v11 : v9 + (this.d2 + v11);
                }
                flow$WidgetsList0.b(constraintWidget1);
            }
        }
        int v12 = this.j2.size();
        ConstraintAnchor constraintAnchor0 = this.Q;
        ConstraintAnchor constraintAnchor1 = this.R;
        ConstraintAnchor constraintAnchor2 = this.S;
        ConstraintAnchor constraintAnchor3 = this.T;
        int v13 = this.t2();
        int v14 = this.v2();
        int v15 = this.u2();
        int v16 = this.s2();
        if(v4 > 0 && (this.H() == DimensionBehaviour.b || this.j0() == DimensionBehaviour.b)) {
            for(int v17 = 0; v17 < v12; ++v17) {
                WidgetsList flow$WidgetsList1 = (WidgetsList)this.j2.get(v17);
                if(v1 == 0) {
                    flow$WidgetsList1.g(v2 - flow$WidgetsList1.f());
                }
                else {
                    flow$WidgetsList1.g(v2 - flow$WidgetsList1.e());
                }
            }
        }
        int v18 = v14;
        int v19 = v15;
        int v20 = 0;
        int v21 = 0;
        int v22 = 0;
        int v23 = v13;
        ConstraintAnchor constraintAnchor4 = constraintAnchor1;
        ConstraintAnchor constraintAnchor5 = constraintAnchor0;
        int v24 = v16;
        while(v22 < v12) {
            WidgetsList flow$WidgetsList2 = (WidgetsList)this.j2.get(v22);
            if(v1 == 0) {
                if(v22 < v12 - 1) {
                    constraintAnchor6 = ((WidgetsList)this.j2.get(v22 + 1)).b.R;
                    v25 = 0;
                }
                else {
                    constraintAnchor6 = this.T;
                    v25 = this.s2();
                }
                ConstraintAnchor constraintAnchor7 = flow$WidgetsList2.b.T;
                v26 = v22;
                flow$WidgetsList2.j(0, constraintAnchor5, constraintAnchor4, constraintAnchor2, constraintAnchor6, v23, v18, v19, v25, v2);
                int v27 = Math.max(v21, flow$WidgetsList2.f());
                v20 += flow$WidgetsList2.e();
                if(v26 > 0) {
                    v20 += this.d2;
                }
                v21 = v27;
                constraintAnchor4 = constraintAnchor7;
                v18 = 0;
                constraintAnchor8 = constraintAnchor2;
                constraintAnchor3 = constraintAnchor6;
                v24 = v25;
            }
            else {
                v26 = v22;
                if(v26 < v12 - 1) {
                    constraintAnchor8 = ((WidgetsList)this.j2.get(v26 + 1)).b.Q;
                    v28 = 0;
                }
                else {
                    constraintAnchor8 = this.S;
                    v28 = this.u2();
                }
                ConstraintAnchor constraintAnchor9 = flow$WidgetsList2.b.S;
                flow$WidgetsList2.j(v1, constraintAnchor5, constraintAnchor4, constraintAnchor8, constraintAnchor3, v23, v18, v28, v24, v2);
                v21 += flow$WidgetsList2.f();
                int v29 = Math.max(v20, flow$WidgetsList2.e());
                if(v26 > 0) {
                    v21 += this.c2;
                }
                v20 = v29;
                v19 = v28;
                constraintAnchor5 = constraintAnchor9;
                v23 = 0;
            }
            v22 = v26 + 1;
            constraintAnchor2 = constraintAnchor8;
        }
        arr_v[0] = v21;
        arr_v[1] = v20;
    }

    private void k3(ConstraintWidget[] arr_constraintWidget, int v, int v1, int v2, int[] arr_v) {
        WidgetsList flow$WidgetsList0;
        if(v == 0) {
            return;
        }
        if(this.j2.size() == 0) {
            flow$WidgetsList0 = new WidgetsList(this, v1, this.Q, this.R, this.S, this.T, v2);
            this.j2.add(flow$WidgetsList0);
        }
        else {
            WidgetsList flow$WidgetsList1 = (WidgetsList)this.j2.get(0);
            flow$WidgetsList1.c();
            flow$WidgetsList0 = flow$WidgetsList1;
            flow$WidgetsList0.j(v1, this.Q, this.R, this.S, this.T, this.t2(), this.v2(), this.u2(), this.s2(), v2);
        }
        for(int v3 = 0; v3 < v; ++v3) {
            flow$WidgetsList0.b(arr_constraintWidget[v3]);
        }
        arr_v[0] = flow$WidgetsList0.f();
        arr_v[1] = flow$WidgetsList0.e();
    }

    public void l3(float f) {
        this.Y1 = f;
    }

    public void m3(int v) {
        this.S1 = v;
    }

    @Override  // androidx.constraintlayout.core.widgets.HelperWidget
    public void n(ConstraintWidget constraintWidget0, HashMap hashMap0) {
        super.n(constraintWidget0, hashMap0);
        this.Q1 = ((Flow)constraintWidget0).Q1;
        this.R1 = ((Flow)constraintWidget0).R1;
        this.S1 = ((Flow)constraintWidget0).S1;
        this.T1 = ((Flow)constraintWidget0).T1;
        this.U1 = ((Flow)constraintWidget0).U1;
        this.V1 = ((Flow)constraintWidget0).V1;
        this.W1 = ((Flow)constraintWidget0).W1;
        this.X1 = ((Flow)constraintWidget0).X1;
        this.Y1 = ((Flow)constraintWidget0).Y1;
        this.Z1 = ((Flow)constraintWidget0).Z1;
        this.a2 = ((Flow)constraintWidget0).a2;
        this.b2 = ((Flow)constraintWidget0).b2;
        this.c2 = ((Flow)constraintWidget0).c2;
        this.d2 = ((Flow)constraintWidget0).d2;
        this.e2 = ((Flow)constraintWidget0).e2;
        this.f2 = ((Flow)constraintWidget0).f2;
        this.g2 = ((Flow)constraintWidget0).g2;
        this.h2 = ((Flow)constraintWidget0).h2;
        this.i2 = ((Flow)constraintWidget0).i2;
    }

    public void n3(float f) {
        this.Z1 = f;
    }

    public void o3(int v) {
        this.T1 = v;
    }

    public void p3(int v) {
        this.e2 = v;
    }

    public void q3(float f) {
        this.W1 = f;
    }

    public void r3(int v) {
        this.c2 = v;
    }

    public void s3(int v) {
        this.Q1 = v;
    }

    public void t3(float f) {
        this.a2 = f;
    }

    public void u3(int v) {
        this.U1 = v;
    }

    public void v3(float f) {
        this.b2 = f;
    }

    @Override  // androidx.constraintlayout.core.widgets.VirtualLayout
    public void w2(int v, int v1, int v2, int v3) {
        boolean z;
        int[] arr_v1;
        int v15;
        int v12;
        if(this.C1 > 0 && !this.y2()) {
            this.B2(0, 0);
            this.A2(false);
            return;
        }
        int v4 = this.t2();
        int v5 = this.u2();
        int v6 = this.v2();
        int v7 = this.s2();
        int[] arr_v = new int[2];
        int v8 = v1 - v4 - v5;
        int v9 = this.i2;
        if(v9 == 1) {
            v8 = v3 - v6 - v7;
        }
        if(v9 == 0) {
            if(this.Q1 == -1) {
                this.Q1 = 0;
            }
            if(this.R1 == -1) {
                this.R1 = 0;
            }
        }
        else {
            if(this.Q1 == -1) {
                this.Q1 = 0;
            }
            if(this.R1 == -1) {
                this.R1 = 0;
            }
        }
        ConstraintWidget[] arr_constraintWidget = this.B1;
        int v11 = 0;
        for(int v10 = 0; true; ++v10) {
            v12 = this.C1;
            if(v10 >= v12) {
                break;
            }
            if(this.B1[v10].l0() == 8) {
                ++v11;
            }
        }
        if(v11 > 0) {
            arr_constraintWidget = new ConstraintWidget[v12 - v11];
            int v14 = 0;
            for(int v13 = 0; v13 < this.C1; ++v13) {
                ConstraintWidget constraintWidget0 = this.B1[v13];
                if(constraintWidget0.l0() != 8) {
                    arr_constraintWidget[v14] = constraintWidget0;
                    ++v14;
                }
            }
            v15 = v14;
        }
        else {
            v15 = v12;
        }
        this.n2 = arr_constraintWidget;
        this.o2 = v15;
        switch(this.g2) {
            case 0: {
                arr_v1 = arr_v;
                z = true;
                this.k3(arr_constraintWidget, v15, this.i2, v8, arr_v);
                break;
            }
            case 1: {
                arr_v1 = arr_v;
                z = true;
                this.i3(arr_constraintWidget, v15, this.i2, v8, arr_v);
                break;
            }
            case 2: {
                arr_v1 = arr_v;
                z = true;
                this.h3(arr_constraintWidget, v15, this.i2, v8, arr_v);
                break;
            }
            case 3: {
                z = true;
                arr_v1 = arr_v;
                this.j3(arr_constraintWidget, v15, this.i2, v8, arr_v);
                break;
            }
            default: {
                arr_v1 = arr_v;
                z = true;
            }
        }
        int v16 = arr_v1[0] + v4 + v5;
        int v17 = arr_v1[1] + v6 + v7;
        if(v == 0x40000000) {
            v16 = v1;
        }
        else if(v == 0x80000000) {
            v16 = Math.min(v16, v1);
        }
        else if(v != 0) {
            v16 = 0;
        }
        if(v2 == 0x40000000) {
            v17 = v3;
        }
        else if(v2 == 0x80000000) {
            v17 = Math.min(v17, v3);
        }
        else if(v2 != 0) {
            v17 = 0;
        }
        this.B2(v16, v17);
        this.d2(v16);
        this.z1(v17);
        if(this.C1 <= 0) {
            z = false;
        }
        this.A2(z);
    }

    public void w3(int v) {
        this.V1 = v;
    }

    public void x3(int v) {
        this.h2 = v;
    }

    public void y3(int v) {
        this.i2 = v;
    }

    public void z3(int v) {
        this.f2 = v;
    }
}

