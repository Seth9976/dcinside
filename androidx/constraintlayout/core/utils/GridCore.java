package androidx.constraintlayout.core.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GridCore extends VirtualLayout {
    ConstraintWidgetContainer Q1;
    private ConstraintWidget[] R1;
    private boolean S1;
    private int T1;
    private int U1;
    private int V1;
    private int W1;
    private float X1;
    private float Y1;
    private String Z1;
    private String a2;
    private String b2;
    private String c2;
    private int d2;
    private int e2;
    private boolean[][] f2;
    Set g2;
    private int[][] h2;
    private int i2;
    private int[][] j2;
    private int k2;
    public static final int l2 = 0;
    public static final int m2 = 1;
    public static final int n2 = 1;
    public static final int o2 = 2;
    private static final int p2 = 3;
    private static final int q2 = 50;
    private static final int r2 = 50;

    public GridCore() {
        this.S1 = false;
        this.e2 = 0;
        this.g2 = new HashSet();
        this.k2 = 0;
        this.A3();
        this.d3();
    }

    public GridCore(int v, int v1) {
        this.S1 = false;
        this.e2 = 0;
        this.g2 = new HashSet();
        this.k2 = 0;
        this.U1 = v;
        this.W1 = v1;
        if(v > 50) {
            this.U1 = 3;
        }
        if(v1 > 50) {
            this.W1 = 3;
        }
        this.A3();
        this.d3();
    }

    private void A3() {
        int v = this.U1;
        if(v != 0) {
            int v1 = this.W1;
            if(v1 != 0) {
                this.T1 = v;
                this.V1 = v1;
                return;
            }
        }
        int v2 = this.W1;
        if(v2 > 0) {
            this.V1 = v2;
            this.T1 = (this.C1 + v2 - 1) / v2;
            return;
        }
        if(v > 0) {
            this.T1 = v;
            this.V1 = (this.C1 + v - 1) / v;
            return;
        }
        double f = Math.sqrt(this.C1);
        this.T1 = (int)(f + 1.5);
        this.V1 = (this.C1 + ((int)(f + 1.5)) - 1) / ((int)(f + 1.5));
    }

    private void K2() {
        this.n3();
        this.m3();
        this.L2();
    }

    private void L2() {
        for(int v = 0; v < this.C1; ++v) {
            if(!this.g2.contains(this.B1[v].o)) {
                int v1 = this.W2();
                int v2 = this.Y2(v1);
                int v3 = this.R2(v1);
                if(v1 == -1) {
                    return;
                }
                if(this.g3()) {
                    int[][] arr2_v = this.j2;
                    if(arr2_v == null) {
                        this.O2(this.B1[v], v2, v3, 1, 1);
                    }
                    else {
                        int v4 = this.k2;
                        if(v4 < arr2_v.length) {
                            int[] arr_v = arr2_v[v4];
                            if(arr_v[0] == v1) {
                                this.f2[v2][v3] = true;
                                if(this.f3(v2, v3, arr_v[1], arr_v[2])) {
                                    ConstraintWidget constraintWidget0 = this.B1[v];
                                    int[] arr_v1 = this.j2[this.k2];
                                    this.O2(constraintWidget0, v2, v3, arr_v1[1], arr_v1[2]);
                                    ++this.k2;
                                }
                            }
                            else {
                                this.O2(this.B1[v], v2, v3, 1, 1);
                            }
                        }
                        else {
                            this.O2(this.B1[v], v2, v3, 1, 1);
                        }
                    }
                }
                else {
                    this.O2(this.B1[v], v2, v3, 1, 1);
                }
            }
        }
    }

    private void M2(ConstraintWidget constraintWidget0) {
        constraintWidget0.G1(-1.0f);
        constraintWidget0.Q.x();
        constraintWidget0.S.x();
    }

    private void N2(ConstraintWidget constraintWidget0) {
        constraintWidget0.b2(-1.0f);
        constraintWidget0.R.x();
        constraintWidget0.T.x();
        constraintWidget0.U.x();
    }

    private void O2(ConstraintWidget constraintWidget0, int v, int v1, int v2, int v3) {
        constraintWidget0.Q.a(this.R1[v1].Q, 0);
        constraintWidget0.R.a(this.R1[v].R, 0);
        constraintWidget0.S.a(this.R1[v1 + v3 - 1].S, 0);
        constraintWidget0.T.a(this.R1[v + v2 - 1].T, 0);
    }

    private void P2() {
        int v = Math.max(this.T1, this.V1);
        ConstraintWidget[] arr_constraintWidget = this.R1;
        int v1 = 0;
        if(arr_constraintWidget == null) {
            this.R1 = new ConstraintWidget[v];
            while(true) {
                ConstraintWidget[] arr_constraintWidget1 = this.R1;
                if(v1 >= arr_constraintWidget1.length) {
                    break;
                }
                arr_constraintWidget1[v1] = this.j3();
                ++v1;
            }
        }
        else if(v != arr_constraintWidget.length) {
            ConstraintWidget[] arr_constraintWidget2 = new ConstraintWidget[v];
            while(v1 < v) {
                ConstraintWidget[] arr_constraintWidget3 = this.R1;
                arr_constraintWidget2[v1] = v1 < arr_constraintWidget3.length ? arr_constraintWidget3[v1] : this.j3();
                ++v1;
            }
            while(true) {
                ConstraintWidget[] arr_constraintWidget4 = this.R1;
                if(v >= arr_constraintWidget4.length) {
                    break;
                }
                this.Q1.p2(arr_constraintWidget4[v]);
                ++v;
            }
            this.R1 = arr_constraintWidget2;
        }
    }

    private void Q2(boolean z) {
        if(z) {
            for(int v = 0; v < this.f2.length; ++v) {
                for(int v1 = 0; true; ++v1) {
                    boolean[][] arr2_z = this.f2;
                    if(v1 >= arr2_z[0].length) {
                        break;
                    }
                    arr2_z[v][v1] = true;
                }
            }
            for(int v2 = 0; v2 < this.h2.length; ++v2) {
                for(int v3 = 0; true; ++v3) {
                    int[][] arr2_v = this.h2;
                    if(v3 >= arr2_v[0].length) {
                        break;
                    }
                    arr2_v[v2][v3] = -1;
                }
            }
        }
        this.e2 = 0;
        if(this.c2 != null && !this.c2.trim().isEmpty()) {
            int[][] arr2_v1 = this.k3(this.c2, false);
            if(arr2_v1 != null) {
                this.b3(arr2_v1);
            }
        }
        if(this.b2 != null && !this.b2.trim().isEmpty()) {
            int[][] arr2_v2 = this.k3(this.b2, true);
            if(arr2_v2 != null) {
                this.c3(arr2_v2);
            }
        }
    }

    private int R2(int v) {
        return this.d2 == 1 ? v / this.T1 : v % this.V1;
    }

    @Nullable
    public String S2() {
        return this.a2;
    }

    @Nullable
    public ConstraintWidgetContainer T2() {
        return this.Q1;
    }

    public int U2() {
        return this.i2;
    }

    public float V2() {
        return this.X1;
    }

    private int W2() {
        int v = 0;
        boolean z = false;
        while(!z) {
            v = this.e2;
            if(v >= this.T1 * this.V1) {
                return -1;
            }
            int v1 = this.Y2(v);
            int v2 = this.R2(this.e2);
            boolean[] arr_z = this.f2[v1];
            if(arr_z[v2]) {
                arr_z[v2] = false;
                z = true;
            }
            ++this.e2;
        }
        return v;
    }

    public int X2() {
        return this.d2;
    }

    private int Y2(int v) {
        return this.d2 == 1 ? v % this.T1 : v / this.V1;
    }

    @Nullable
    public String Z2() {
        return this.Z1;
    }

    public float a3() {
        return this.Y1;
    }

    private void b3(int[][] arr2_v) {
        for(int v = 0; v < arr2_v.length; ++v) {
            int[] arr_v = arr2_v[v];
            if(!this.f3(this.Y2(arr_v[0]), this.R2(arr_v[0]), arr_v[1], arr_v[2])) {
                return;
            }
        }
    }

    private void c3(int[][] arr2_v) {
        if(this.g3()) {
            return;
        }
        for(int v = 0; v < arr2_v.length; ++v) {
            int v1 = this.Y2(arr2_v[v][0]);
            int v2 = this.R2(arr2_v[v][0]);
            int[] arr_v = arr2_v[v];
            if(!this.f3(v1, v2, arr_v[1], arr_v[2])) {
                return;
            }
            ConstraintWidget constraintWidget0 = this.B1[v];
            int[] arr_v1 = arr2_v[v];
            this.O2(constraintWidget0, v1, v2, arr_v1[1], arr_v1[2]);
            this.g2.add(this.B1[v].o);
        }
    }

    private void d3() {
        boolean z = false;
        if(this.h2 == null || this.h2.length != this.C1 || (this.f2 == null || this.f2.length != this.T1 || this.f2[0].length != this.V1)) {
            this.e3();
        }
        else {
            z = true;
        }
        this.Q2(z);
    }

    private void e3() {
        int[] arr_v = new int[2];
        arr_v[1] = this.V1;
        arr_v[0] = this.T1;
        boolean[][] arr2_z = (boolean[][])Array.newInstance(Boolean.TYPE, arr_v);
        this.f2 = arr2_z;
        for(int v1 = 0; v1 < arr2_z.length; ++v1) {
            Arrays.fill(arr2_z[v1], true);
        }
        int v2 = this.C1;
        if(v2 > 0) {
            int[][] arr2_v = new int[v2][4];
            this.h2 = arr2_v;
            for(int v = 0; v < arr2_v.length; ++v) {
                Arrays.fill(arr2_v[v], -1);
            }
        }
    }

    private boolean f3(int v, int v1, int v2, int v3) {
        int v4 = v;
        while(v4 < v + v2) {
            int v5 = v1;
            while(v5 < v1 + v3) {
                boolean[][] arr2_z = this.f2;
                if(v4 < arr2_z.length && v5 < arr2_z[0].length) {
                    boolean[] arr_z = arr2_z[v4];
                    if(!arr_z[v5]) {
                        return false;
                    }
                    arr_z[v5] = false;
                    ++v5;
                    continue;
                }
                return false;
            }
            ++v4;
        }
        return true;
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void g(@Nullable LinearSystem linearSystem0, boolean z) {
        super.g(linearSystem0, z);
        this.K2();
    }

    private boolean g3() {
        return (this.i2 & 2) > 0;
    }

    private boolean h3() {
        return (this.i2 & 1) > 0;
    }

    // 检测为 Lambda 实现
    private static int i3(String s, String s1) [...]

    private ConstraintWidget j3() {
        ConstraintWidget constraintWidget0 = new ConstraintWidget();
        DimensionBehaviour[] arr_constraintWidget$DimensionBehaviour = constraintWidget0.b0;
        arr_constraintWidget$DimensionBehaviour[0] = DimensionBehaviour.c;
        arr_constraintWidget$DimensionBehaviour[1] = DimensionBehaviour.c;
        constraintWidget0.o = "841789478";
        return constraintWidget0;
    }

    private int[][] k3(String s, boolean z) {
        try {
            String[] arr_s = s.split(",");
            Arrays.sort(arr_s, (String s, String s1) -> Integer.parseInt(s.split(":")[0]) - Integer.parseInt(s1.split(":")[0]));
            int[][] arr2_v = new int[arr_s.length][3];
            if(this.T1 == 1 || this.V1 == 1) {
                int v1 = 0;
                int v2 = 0;
                for(int v = 0; v < arr_s.length; ++v) {
                    String[] arr_s1 = arr_s[v].trim().split(":");
                    int[] arr_v = arr2_v[v];
                    arr_v[0] = Integer.parseInt(arr_s1[0]);
                    int[] arr_v1 = arr2_v[v];
                    arr_v1[1] = 1;
                    arr_v1[2] = 1;
                    if(this.V1 == 1) {
                        arr_v1[1] = Integer.parseInt(arr_s1[1]);
                        v1 += arr2_v[v][1];
                        if(z) {
                            --v1;
                        }
                    }
                    if(this.T1 == 1) {
                        int[] arr_v2 = arr2_v[v];
                        arr_v2[2] = Integer.parseInt(arr_s1[1]);
                        v2 += arr2_v[v][2];
                        if(z) {
                            --v2;
                        }
                    }
                }
                if(v1 != 0 && !this.S1) {
                    this.v3(this.T1 + v1);
                }
                if(v2 != 0 && !this.S1) {
                    this.p3(this.V1 + v2);
                }
                this.S1 = true;
                return arr2_v;
            }
            for(int v3 = 0; v3 < arr_s.length; ++v3) {
                String[] arr_s2 = arr_s[v3].trim().split(":");
                String[] arr_s3 = arr_s2[1].split("x");
                int[] arr_v3 = arr2_v[v3];
                arr_v3[0] = Integer.parseInt(arr_s2[0]);
                if(this.h3()) {
                    int[] arr_v4 = arr2_v[v3];
                    arr_v4[1] = Integer.parseInt(arr_s3[1]);
                    int[] arr_v5 = arr2_v[v3];
                    arr_v5[2] = Integer.parseInt(arr_s3[0]);
                }
                else {
                    int[] arr_v6 = arr2_v[v3];
                    arr_v6[1] = Integer.parseInt(arr_s3[0]);
                    int[] arr_v7 = arr2_v[v3];
                    arr_v7[2] = Integer.parseInt(arr_s3[1]);
                }
            }
            return arr2_v;
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    private float[] l3(int v, String s) {
        if(s != null && !s.trim().isEmpty()) {
            String[] arr_s = s.split(",");
            float[] arr_f = new float[v];
            for(int v1 = 0; v1 < v; ++v1) {
                if(v1 < arr_s.length) {
                    try {
                        arr_f[v1] = Float.parseFloat(arr_s[v1]);
                    }
                    catch(Exception exception0) {
                        System.err.println("Error parsing `" + arr_s[v1] + "`: " + exception0.getMessage());
                        arr_f[v1] = 1.0f;
                    }
                }
                else {
                    arr_f[v1] = 1.0f;
                }
            }
            return arr_f;
        }
        return null;
    }

    private void m3() {
        int v2;
        int v = Math.max(this.T1, this.V1);
        ConstraintWidget constraintWidget0 = this.R1[0];
        float[] arr_f = this.l3(this.V1, this.a2);
        if(this.V1 == 1) {
            this.M2(constraintWidget0);
            constraintWidget0.Q.a(this.Q, 0);
            constraintWidget0.S.a(this.S, 0);
            return;
        }
        for(int v1 = 0; true; ++v1) {
            v2 = this.V1;
            if(v1 >= v2) {
                break;
            }
            ConstraintWidget constraintWidget1 = this.R1[v1];
            this.M2(constraintWidget1);
            if(arr_f != null) {
                constraintWidget1.G1(arr_f[v1]);
            }
            if(v1 > 0) {
                constraintWidget1.Q.a(this.R1[v1 - 1].S, 0);
            }
            else {
                constraintWidget1.Q.a(this.Q, 0);
            }
            if(v1 < this.V1 - 1) {
                constraintWidget1.S.a(this.R1[v1 + 1].Q, 0);
            }
            else {
                constraintWidget1.S.a(this.S, 0);
            }
            if(v1 > 0) {
                constraintWidget1.Q.g = (int)this.X1;
            }
        }
        while(v2 < v) {
            ConstraintWidget constraintWidget2 = this.R1[v2];
            this.M2(constraintWidget2);
            constraintWidget2.Q.a(this.Q, 0);
            constraintWidget2.S.a(this.S, 0);
            ++v2;
        }
    }

    private void n3() {
        int v2;
        int v = Math.max(this.T1, this.V1);
        ConstraintWidget constraintWidget0 = this.R1[0];
        float[] arr_f = this.l3(this.T1, this.Z1);
        if(this.T1 == 1) {
            this.N2(constraintWidget0);
            constraintWidget0.R.a(this.R, 0);
            constraintWidget0.T.a(this.T, 0);
            return;
        }
        for(int v1 = 0; true; ++v1) {
            v2 = this.T1;
            if(v1 >= v2) {
                break;
            }
            ConstraintWidget constraintWidget1 = this.R1[v1];
            this.N2(constraintWidget1);
            if(arr_f != null) {
                constraintWidget1.b2(arr_f[v1]);
            }
            if(v1 > 0) {
                constraintWidget1.R.a(this.R1[v1 - 1].T, 0);
            }
            else {
                constraintWidget1.R.a(this.R, 0);
            }
            if(v1 < this.T1 - 1) {
                constraintWidget1.T.a(this.R1[v1 + 1].R, 0);
            }
            else {
                constraintWidget1.T.a(this.T, 0);
            }
            if(v1 > 0) {
                constraintWidget1.R.g = (int)this.Y1;
            }
        }
        while(v2 < v) {
            ConstraintWidget constraintWidget2 = this.R1[v2];
            this.N2(constraintWidget2);
            constraintWidget2.R.a(this.R, 0);
            constraintWidget2.T.a(this.T, 0);
            ++v2;
        }
    }

    public void o3(@NonNull String s) {
        if(this.a2 != null && this.a2.equals(s)) {
            return;
        }
        this.a2 = s;
    }

    public void p3(int v) {
        if(v > 50) {
            return;
        }
        if(this.W1 == v) {
            return;
        }
        this.W1 = v;
        this.A3();
        this.e3();
    }

    public void q3(@NonNull ConstraintWidgetContainer constraintWidgetContainer0) {
        this.Q1 = constraintWidgetContainer0;
    }

    public void r3(int v) {
        this.i2 = v;
    }

    public void s3(float f) {
        if(f < 0.0f) {
            return;
        }
        if(this.X1 == f) {
            return;
        }
        this.X1 = f;
    }

    public void t3(int v) {
        if(v != 0 && v != 1) {
            return;
        }
        if(this.d2 == v) {
            return;
        }
        this.d2 = v;
    }

    public void u3(@NonNull String s) {
        if(this.Z1 != null && this.Z1.equals(s)) {
            return;
        }
        this.Z1 = s;
    }

    public void v3(int v) {
        if(v > 50) {
            return;
        }
        if(this.U1 == v) {
            return;
        }
        this.U1 = v;
        this.A3();
        this.e3();
    }

    @Override  // androidx.constraintlayout.core.widgets.VirtualLayout
    public void w2(int v, int v1, int v2, int v3) {
        super.w2(v, v1, v2, v3);
        this.Q1 = (ConstraintWidgetContainer)this.U();
        this.z3(false);
        this.Q1.l2(this.R1);
    }

    public void w3(@NonNull String s) {
        if(this.c2 != null && this.c2.equals(s)) {
            return;
        }
        this.S1 = false;
        this.c2 = s;
    }

    public void x3(@NonNull CharSequence charSequence0) {
        if(this.b2 != null && this.b2.equals(charSequence0.toString())) {
            return;
        }
        this.S1 = false;
        this.b2 = charSequence0.toString();
    }

    public void y3(float f) {
        if(f < 0.0f) {
            return;
        }
        if(this.Y1 == f) {
            return;
        }
        this.Y1 = f;
    }

    private void z3(boolean z) {
        if(this.T1 >= 1 && this.V1 >= 1) {
            if(z) {
                for(int v = 0; v < this.f2.length; ++v) {
                    for(int v1 = 0; true; ++v1) {
                        boolean[][] arr2_z = this.f2;
                        if(v1 >= arr2_z[0].length) {
                            break;
                        }
                        arr2_z[v][v1] = true;
                    }
                }
                this.g2.clear();
            }
            this.e2 = 0;
            if(this.c2 != null && !this.c2.trim().isEmpty()) {
                int[][] arr2_v = this.k3(this.c2, false);
                if(arr2_v != null) {
                    this.b3(arr2_v);
                }
            }
            if(this.b2 != null && !this.b2.trim().isEmpty()) {
                this.j2 = this.k3(this.b2, true);
            }
            this.P2();
            int[][] arr2_v1 = this.j2;
            if(arr2_v1 != null) {
                this.c3(arr2_v1);
            }
        }
    }
}

