package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        static class Table {
            public static final int A = 26;
            public static final int B = 27;
            public static final int C = 28;
            public static final int D = 29;
            public static final int E = 30;
            public static final int F = 0x1F;
            public static final int G = 0x20;
            public static final int H = 33;
            public static final int I = 34;
            public static final int J = 35;
            public static final int K = 36;
            public static final int L = 37;
            public static final int M = 38;
            public static final int N = 39;
            public static final int O = 40;
            public static final int P = 41;
            public static final int Q = 42;
            public static final int R = 43;
            public static final int S = 44;
            public static final int T = 45;
            public static final int U = 46;
            public static final int V = 0x2F;
            public static final int W = 0x30;
            public static final int X = 49;
            public static final int Y = 50;
            public static final int Z = 51;
            public static final int a = 0;
            public static final int a0 = 52;
            public static final int b = 1;
            public static final int b0 = 53;
            public static final int c = 2;
            public static final int c0 = 54;
            public static final int d = 3;
            public static final int d0 = 55;
            public static final int e = 4;
            public static final int e0 = 0x40;
            public static final int f = 5;
            public static final int f0 = 65;
            public static final int g = 6;
            public static final int g0 = 66;
            public static final int h = 7;
            public static final int h0 = 67;
            public static final int i = 8;
            public static final SparseIntArray i0 = null;
            public static final int j = 9;
            public static final int k = 10;
            public static final int l = 11;
            public static final int m = 12;
            public static final int n = 13;
            public static final int o = 14;
            public static final int p = 15;
            public static final int q = 16;
            public static final int r = 17;
            public static final int s = 18;
            public static final int t = 19;
            public static final int u = 20;
            public static final int v = 21;
            public static final int w = 22;
            public static final int x = 23;
            public static final int y = 24;
            public static final int z = 25;

            static {
                SparseIntArray sparseIntArray0 = new SparseIntArray();
                Table.i0 = sparseIntArray0;
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintWidth, 0x40);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintHeight, 65);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf, 52);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf, 53);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_guidelineUseRtl, 67);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_goneMarginBaseline, 55);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_marginBaseline, 54);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 0x2F);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 0x30);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 0x1F);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 0x20);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_constraintTag, 51);
                sparseIntArray0.append(styleable.ConstraintLayout_Layout_layout_wrapBehaviorInParent, 66);
            }
        }

        public int A;
        public static final int A0 = 0x80000000;
        public int B;
        public static final int B0 = 0;
        public int C;
        public static final int C0 = 1;
        public int D;
        public static final int D0 = 1;
        boolean E;
        public static final int E0 = 2;
        boolean F;
        public static final int F0 = 3;
        public float G;
        public static final int G0 = 4;
        public float H;
        public static final int H0 = 5;
        public String I;
        public static final int I0 = 6;
        float J;
        public static final int J0 = 7;
        int K;
        public static final int K0 = 8;
        public float L;
        public static final int L0 = 1;
        public float M;
        public static final int M0 = 0;
        public int N;
        public static final int N0 = 2;
        public int O;
        public static final int O0 = 0;
        public int P;
        public static final int P0 = 1;
        public int Q;
        public static final int Q0 = 2;
        public int R;
        public static final int R0 = 0;
        public int S;
        public static final int S0 = 1;
        public int T;
        public static final int T0 = 2;
        public int U;
        public static final int U0 = 3;
        public float V;
        public float W;
        public int X;
        public int Y;
        public int Z;
        public int a;
        public boolean a0;
        public int b;
        public boolean b0;
        public float c;
        public String c0;
        public boolean d;
        public int d0;
        public int e;
        boolean e0;
        public int f;
        boolean f0;
        public int g;
        boolean g0;
        public int h;
        boolean h0;
        public int i;
        boolean i0;
        public int j;
        boolean j0;
        public int k;
        boolean k0;
        public int l;
        int l0;
        public int m;
        int m0;
        public int n;
        int n0;
        public int o;
        int o0;
        public int p;
        int p0;
        public int q;
        int q0;
        public float r;
        float r0;
        public int s;
        int s0;
        public int t;
        int t0;
        public int u;
        float u0;
        public int v;
        ConstraintWidget v0;
        public int w;
        public boolean w0;
        public int x;
        public static final int x0 = 0;
        public int y;
        public static final int y0 = 0;
        public int z;
        public static final int z0 = -1;

        public LayoutParams(int v, int v1) {
            super(v, v1);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = 0x80000000;
            this.x = 0x80000000;
            this.y = 0x80000000;
            this.z = 0x80000000;
            this.A = 0x80000000;
            this.B = 0x80000000;
            this.C = 0x80000000;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.a0 = false;
            this.b0 = false;
            this.c0 = null;
            this.d0 = 0;
            this.e0 = true;
            this.f0 = true;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = false;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = 0x80000000;
            this.q0 = 0x80000000;
            this.r0 = 0.5f;
            this.v0 = new ConstraintWidget();
            this.w0 = false;
        }

        public LayoutParams(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = 0x80000000;
            this.x = 0x80000000;
            this.y = 0x80000000;
            this.z = 0x80000000;
            this.A = 0x80000000;
            this.B = 0x80000000;
            this.C = 0x80000000;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.a0 = false;
            this.b0 = false;
            this.c0 = null;
            this.d0 = 0;
            this.e0 = true;
            this.f0 = true;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = false;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = 0x80000000;
            this.q0 = 0x80000000;
            this.r0 = 0.5f;
            this.v0 = new ConstraintWidget();
            this.w0 = false;
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ConstraintLayout_Layout);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                switch(Table.i0.get(v2)) {
                    case 1: {
                        this.Z = typedArray0.getInt(v2, this.Z);
                        break;
                    }
                    case 2: {
                        int v3 = typedArray0.getResourceId(v2, this.p);
                        this.p = v3;
                        if(v3 == -1) {
                            this.p = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 3: {
                        this.q = typedArray0.getDimensionPixelSize(v2, this.q);
                        break;
                    }
                    case 4: {
                        float f = typedArray0.getFloat(v2, this.r) % 360.0f;
                        this.r = f;
                        if(f < 0.0f) {
                            this.r = (360.0f - f) % 360.0f;
                        }
                        break;
                    }
                    case 5: {
                        this.a = typedArray0.getDimensionPixelOffset(v2, this.a);
                        break;
                    }
                    case 6: {
                        this.b = typedArray0.getDimensionPixelOffset(v2, this.b);
                        break;
                    }
                    case 7: {
                        this.c = typedArray0.getFloat(v2, this.c);
                        break;
                    }
                    case 8: {
                        int v4 = typedArray0.getResourceId(v2, this.e);
                        this.e = v4;
                        if(v4 == -1) {
                            this.e = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 9: {
                        int v5 = typedArray0.getResourceId(v2, this.f);
                        this.f = v5;
                        if(v5 == -1) {
                            this.f = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 10: {
                        int v6 = typedArray0.getResourceId(v2, this.g);
                        this.g = v6;
                        if(v6 == -1) {
                            this.g = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 11: {
                        int v7 = typedArray0.getResourceId(v2, this.h);
                        this.h = v7;
                        if(v7 == -1) {
                            this.h = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 12: {
                        int v8 = typedArray0.getResourceId(v2, this.i);
                        this.i = v8;
                        if(v8 == -1) {
                            this.i = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 13: {
                        int v9 = typedArray0.getResourceId(v2, this.j);
                        this.j = v9;
                        if(v9 == -1) {
                            this.j = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 14: {
                        int v10 = typedArray0.getResourceId(v2, this.k);
                        this.k = v10;
                        if(v10 == -1) {
                            this.k = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 15: {
                        int v11 = typedArray0.getResourceId(v2, this.l);
                        this.l = v11;
                        if(v11 == -1) {
                            this.l = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 16: {
                        int v12 = typedArray0.getResourceId(v2, this.m);
                        this.m = v12;
                        if(v12 == -1) {
                            this.m = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 17: {
                        int v13 = typedArray0.getResourceId(v2, this.s);
                        this.s = v13;
                        if(v13 == -1) {
                            this.s = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 18: {
                        int v14 = typedArray0.getResourceId(v2, this.t);
                        this.t = v14;
                        if(v14 == -1) {
                            this.t = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 19: {
                        int v15 = typedArray0.getResourceId(v2, this.u);
                        this.u = v15;
                        if(v15 == -1) {
                            this.u = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 20: {
                        int v16 = typedArray0.getResourceId(v2, this.v);
                        this.v = v16;
                        if(v16 == -1) {
                            this.v = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 21: {
                        this.w = typedArray0.getDimensionPixelSize(v2, this.w);
                        break;
                    }
                    case 22: {
                        this.x = typedArray0.getDimensionPixelSize(v2, this.x);
                        break;
                    }
                    case 23: {
                        this.y = typedArray0.getDimensionPixelSize(v2, this.y);
                        break;
                    }
                    case 24: {
                        this.z = typedArray0.getDimensionPixelSize(v2, this.z);
                        break;
                    }
                    case 25: {
                        this.A = typedArray0.getDimensionPixelSize(v2, this.A);
                        break;
                    }
                    case 26: {
                        this.B = typedArray0.getDimensionPixelSize(v2, this.B);
                        break;
                    }
                    case 27: {
                        this.a0 = typedArray0.getBoolean(v2, this.a0);
                        break;
                    }
                    case 28: {
                        this.b0 = typedArray0.getBoolean(v2, this.b0);
                        break;
                    }
                    case 29: {
                        this.G = typedArray0.getFloat(v2, this.G);
                        break;
                    }
                    case 30: {
                        this.H = typedArray0.getFloat(v2, this.H);
                        break;
                    }
                    case 0x1F: {
                        int v17 = typedArray0.getInt(v2, 0);
                        this.P = v17;
                        if(v17 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    }
                    case 0x20: {
                        int v18 = typedArray0.getInt(v2, 0);
                        this.Q = v18;
                        if(v18 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    }
                    case 33: {
                        try {
                            this.R = typedArray0.getDimensionPixelSize(v2, this.R);
                        }
                        catch(Exception unused_ex) {
                            if(typedArray0.getInt(v2, this.R) == -2) {
                                this.R = -2;
                            }
                        }
                        break;
                    }
                    case 34: {
                        try {
                            this.T = typedArray0.getDimensionPixelSize(v2, this.T);
                        }
                        catch(Exception unused_ex) {
                            if(typedArray0.getInt(v2, this.T) == -2) {
                                this.T = -2;
                            }
                        }
                        break;
                    }
                    case 35: {
                        this.V = Math.max(0.0f, typedArray0.getFloat(v2, this.V));
                        this.P = 2;
                        break;
                    }
                    case 36: {
                        try {
                            this.S = typedArray0.getDimensionPixelSize(v2, this.S);
                        }
                        catch(Exception unused_ex) {
                            if(typedArray0.getInt(v2, this.S) == -2) {
                                this.S = -2;
                            }
                        }
                        break;
                    }
                    case 37: {
                        try {
                            this.U = typedArray0.getDimensionPixelSize(v2, this.U);
                        }
                        catch(Exception unused_ex) {
                            if(typedArray0.getInt(v2, this.U) == -2) {
                                this.U = -2;
                            }
                        }
                        break;
                    }
                    case 38: {
                        this.W = Math.max(0.0f, typedArray0.getFloat(v2, this.W));
                        this.Q = 2;
                        break;
                    }
                    case 44: {
                        ConstraintSet.F0(this, typedArray0.getString(v2));
                        break;
                    }
                    case 45: {
                        this.L = typedArray0.getFloat(v2, this.L);
                        break;
                    }
                    case 46: {
                        this.M = typedArray0.getFloat(v2, this.M);
                        break;
                    }
                    case 0x2F: {
                        this.N = typedArray0.getInt(v2, 0);
                        break;
                    }
                    case 0x30: {
                        this.O = typedArray0.getInt(v2, 0);
                        break;
                    }
                    case 49: {
                        this.X = typedArray0.getDimensionPixelOffset(v2, this.X);
                        break;
                    }
                    case 50: {
                        this.Y = typedArray0.getDimensionPixelOffset(v2, this.Y);
                        break;
                    }
                    case 51: {
                        this.c0 = typedArray0.getString(v2);
                        break;
                    }
                    case 52: {
                        int v19 = typedArray0.getResourceId(v2, this.n);
                        this.n = v19;
                        if(v19 == -1) {
                            this.n = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 53: {
                        int v20 = typedArray0.getResourceId(v2, this.o);
                        this.o = v20;
                        if(v20 == -1) {
                            this.o = typedArray0.getInt(v2, -1);
                        }
                        break;
                    }
                    case 54: {
                        this.D = typedArray0.getDimensionPixelSize(v2, this.D);
                        break;
                    }
                    case 55: {
                        this.C = typedArray0.getDimensionPixelSize(v2, this.C);
                        break;
                    }
                    case 0x40: {
                        ConstraintSet.D0(this, typedArray0, v2, 0);
                        this.E = true;
                        break;
                    }
                    case 65: {
                        ConstraintSet.D0(this, typedArray0, v2, 1);
                        this.F = true;
                        break;
                    }
                    case 66: {
                        this.d0 = typedArray0.getInt(v2, this.d0);
                        break;
                    }
                    case 67: {
                        this.d = typedArray0.getBoolean(v2, this.d);
                    }
                }
            }
            typedArray0.recycle();
            this.e();
        }

        @SuppressLint({"ClassVerificationFailure"})
        public LayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = 0x80000000;
            this.x = 0x80000000;
            this.y = 0x80000000;
            this.z = 0x80000000;
            this.A = 0x80000000;
            this.B = 0x80000000;
            this.C = 0x80000000;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.a0 = false;
            this.b0 = false;
            this.c0 = null;
            this.d0 = 0;
            this.e0 = true;
            this.f0 = true;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = false;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = 0x80000000;
            this.q0 = 0x80000000;
            this.r0 = 0.5f;
            this.v0 = new ConstraintWidget();
            this.w0 = false;
            if(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) {
                this.leftMargin = ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).leftMargin;
                this.rightMargin = ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).rightMargin;
                this.topMargin = ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).topMargin;
                this.bottomMargin = ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).bottomMargin;
                this.setMarginStart(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).getMarginStart());
                this.setMarginEnd(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).getMarginEnd());
            }
            if(!(viewGroup$LayoutParams0 instanceof LayoutParams)) {
                return;
            }
            LayoutParams constraintLayout$LayoutParams0 = (LayoutParams)viewGroup$LayoutParams0;
            this.a = constraintLayout$LayoutParams0.a;
            this.b = constraintLayout$LayoutParams0.b;
            this.c = constraintLayout$LayoutParams0.c;
            this.d = constraintLayout$LayoutParams0.d;
            this.e = constraintLayout$LayoutParams0.e;
            this.f = constraintLayout$LayoutParams0.f;
            this.g = constraintLayout$LayoutParams0.g;
            this.h = constraintLayout$LayoutParams0.h;
            this.i = constraintLayout$LayoutParams0.i;
            this.j = constraintLayout$LayoutParams0.j;
            this.k = constraintLayout$LayoutParams0.k;
            this.l = constraintLayout$LayoutParams0.l;
            this.m = constraintLayout$LayoutParams0.m;
            this.n = constraintLayout$LayoutParams0.n;
            this.o = constraintLayout$LayoutParams0.o;
            this.p = constraintLayout$LayoutParams0.p;
            this.q = constraintLayout$LayoutParams0.q;
            this.r = constraintLayout$LayoutParams0.r;
            this.s = constraintLayout$LayoutParams0.s;
            this.t = constraintLayout$LayoutParams0.t;
            this.u = constraintLayout$LayoutParams0.u;
            this.v = constraintLayout$LayoutParams0.v;
            this.w = constraintLayout$LayoutParams0.w;
            this.x = constraintLayout$LayoutParams0.x;
            this.y = constraintLayout$LayoutParams0.y;
            this.z = constraintLayout$LayoutParams0.z;
            this.A = constraintLayout$LayoutParams0.A;
            this.B = constraintLayout$LayoutParams0.B;
            this.C = constraintLayout$LayoutParams0.C;
            this.D = constraintLayout$LayoutParams0.D;
            this.G = constraintLayout$LayoutParams0.G;
            this.H = constraintLayout$LayoutParams0.H;
            this.I = constraintLayout$LayoutParams0.I;
            this.J = constraintLayout$LayoutParams0.J;
            this.K = constraintLayout$LayoutParams0.K;
            this.L = constraintLayout$LayoutParams0.L;
            this.M = constraintLayout$LayoutParams0.M;
            this.N = constraintLayout$LayoutParams0.N;
            this.O = constraintLayout$LayoutParams0.O;
            this.a0 = constraintLayout$LayoutParams0.a0;
            this.b0 = constraintLayout$LayoutParams0.b0;
            this.P = constraintLayout$LayoutParams0.P;
            this.Q = constraintLayout$LayoutParams0.Q;
            this.R = constraintLayout$LayoutParams0.R;
            this.T = constraintLayout$LayoutParams0.T;
            this.S = constraintLayout$LayoutParams0.S;
            this.U = constraintLayout$LayoutParams0.U;
            this.V = constraintLayout$LayoutParams0.V;
            this.W = constraintLayout$LayoutParams0.W;
            this.X = constraintLayout$LayoutParams0.X;
            this.Y = constraintLayout$LayoutParams0.Y;
            this.Z = constraintLayout$LayoutParams0.Z;
            this.e0 = constraintLayout$LayoutParams0.e0;
            this.f0 = constraintLayout$LayoutParams0.f0;
            this.g0 = constraintLayout$LayoutParams0.g0;
            this.h0 = constraintLayout$LayoutParams0.h0;
            this.l0 = constraintLayout$LayoutParams0.l0;
            this.m0 = constraintLayout$LayoutParams0.m0;
            this.n0 = constraintLayout$LayoutParams0.n0;
            this.o0 = constraintLayout$LayoutParams0.o0;
            this.p0 = constraintLayout$LayoutParams0.p0;
            this.q0 = constraintLayout$LayoutParams0.q0;
            this.r0 = constraintLayout$LayoutParams0.r0;
            this.c0 = constraintLayout$LayoutParams0.c0;
            this.d0 = constraintLayout$LayoutParams0.d0;
            this.v0 = constraintLayout$LayoutParams0.v0;
            this.E = constraintLayout$LayoutParams0.E;
            this.F = constraintLayout$LayoutParams0.F;
        }

        public String a() {
            return this.c0;
        }

        public ConstraintWidget b() {
            return this.v0;
        }

        public void c() {
            ConstraintWidget constraintWidget0 = this.v0;
            if(constraintWidget0 != null) {
                constraintWidget0.R0();
            }
        }

        public void d(String s) {
            this.v0.k1(s);
        }

        public void e() {
            this.h0 = false;
            this.e0 = true;
            this.f0 = true;
            int v = this.width;
            if(v == -2 && this.a0) {
                this.e0 = false;
                if(this.P == 0) {
                    this.P = 1;
                }
            }
            int v1 = this.height;
            if(v1 == -2 && this.b0) {
                this.f0 = false;
                if(this.Q == 0) {
                    this.Q = 1;
                }
            }
            if(v == -1 || v == 0) {
                this.e0 = false;
                if(v == 0 && this.P == 1) {
                    this.width = -2;
                    this.a0 = true;
                }
            }
            if(v1 == -1 || v1 == 0) {
                this.f0 = false;
                if(v1 == 0 && this.Q == 1) {
                    this.height = -2;
                    this.b0 = true;
                }
            }
            if(this.c != -1.0f || this.a != -1 || this.b != -1) {
                this.h0 = true;
                this.e0 = true;
                this.f0 = true;
                if(!(this.v0 instanceof Guideline)) {
                    this.v0 = new Guideline();
                }
                ((Guideline)this.v0).D2(this.Z);
            }
        }

        @Override  // android.view.ViewGroup$MarginLayoutParams
        public void resolveLayoutDirection(int v) {
            int v1 = this.leftMargin;
            int v2 = this.rightMargin;
            super.resolveLayoutDirection(v);
            boolean z = false;
            boolean z1 = 1 == this.getLayoutDirection();
            this.n0 = -1;
            this.o0 = -1;
            this.l0 = -1;
            this.m0 = -1;
            this.p0 = this.w;
            this.q0 = this.y;
            float f = this.G;
            this.r0 = f;
            int v3 = this.a;
            this.s0 = v3;
            int v4 = this.b;
            this.t0 = v4;
            float f1 = this.c;
            this.u0 = f1;
            if(z1) {
                int v5 = this.s;
                if(v5 == -1) {
                    int v6 = this.t;
                    if(v6 != -1) {
                        this.o0 = v6;
                        z = true;
                    }
                }
                else {
                    this.n0 = v5;
                    z = true;
                }
                int v7 = this.u;
                if(v7 != -1) {
                    this.m0 = v7;
                    z = true;
                }
                int v8 = this.v;
                if(v8 != -1) {
                    this.l0 = v8;
                    z = true;
                }
                int v9 = this.A;
                if(v9 != 0x80000000) {
                    this.q0 = v9;
                }
                int v10 = this.B;
                if(v10 != 0x80000000) {
                    this.p0 = v10;
                }
                if(z) {
                    this.r0 = 1.0f - f;
                }
                if(this.h0 && this.Z == 1 && this.d) {
                    if(f1 != -1.0f) {
                        this.u0 = 1.0f - f1;
                        this.s0 = -1;
                        this.t0 = -1;
                    }
                    else if(v3 != -1) {
                        this.t0 = v3;
                        this.s0 = -1;
                        this.u0 = -1.0f;
                    }
                    else if(v4 != -1) {
                        this.s0 = v4;
                        this.t0 = -1;
                        this.u0 = -1.0f;
                    }
                }
            }
            else {
                int v11 = this.s;
                if(v11 != -1) {
                    this.m0 = v11;
                }
                int v12 = this.t;
                if(v12 != -1) {
                    this.l0 = v12;
                }
                int v13 = this.u;
                if(v13 != -1) {
                    this.n0 = v13;
                }
                int v14 = this.v;
                if(v14 != -1) {
                    this.o0 = v14;
                }
                int v15 = this.A;
                if(v15 != 0x80000000) {
                    this.p0 = v15;
                }
                int v16 = this.B;
                if(v16 != 0x80000000) {
                    this.q0 = v16;
                }
            }
            if(this.u == -1 && this.v == -1 && this.t == -1 && this.s == -1) {
                int v17 = this.g;
                if(v17 == -1) {
                    int v18 = this.h;
                    if(v18 != -1) {
                        this.o0 = v18;
                        if(this.rightMargin <= 0 && v2 > 0) {
                            this.rightMargin = v2;
                        }
                    }
                }
                else {
                    this.n0 = v17;
                    if(this.rightMargin <= 0 && v2 > 0) {
                        this.rightMargin = v2;
                    }
                }
                int v19 = this.e;
                if(v19 == -1) {
                    int v20 = this.f;
                    if(v20 != -1) {
                        this.m0 = v20;
                        if(this.leftMargin <= 0 && v1 > 0) {
                            this.leftMargin = v1;
                        }
                    }
                }
                else {
                    this.l0 = v19;
                    if(this.leftMargin <= 0 && v1 > 0) {
                        this.leftMargin = v1;
                    }
                }
            }
        }
    }

    class Measurer implements androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer {
        ConstraintLayout a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        final ConstraintLayout h;

        Measurer(ConstraintLayout constraintLayout1) {
            this.a = constraintLayout1;
        }

        @Override  // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer
        public final void a() {
            int v = this.a.getChildCount();
            for(int v2 = 0; v2 < v; ++v2) {
                View view0 = this.a.getChildAt(v2);
                if(view0 instanceof Placeholder) {
                    ((Placeholder)view0).b(this.a);
                }
            }
            int v3 = this.a.mConstraintHelpers.size();
            if(v3 > 0) {
                for(int v1 = 0; v1 < v3; ++v1) {
                    ((ConstraintHelper)this.a.mConstraintHelpers.get(v1)).G(this.a);
                }
            }
        }

        @Override  // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer
        @SuppressLint({"WrongCall"})
        public final void b(ConstraintWidget constraintWidget0, Measure basicMeasure$Measure0) {
            int v9;
            int v8;
            int v7;
            int v14;
            int v6;
            int v5;
            long v;
            if(constraintWidget0 == null) {
                return;
            }
            if(constraintWidget0.l0() == 8 && !constraintWidget0.C0()) {
                basicMeasure$Measure0.e = 0;
                basicMeasure$Measure0.f = 0;
                basicMeasure$Measure0.g = 0;
                return;
            }
            if(constraintWidget0.U() == null) {
                return;
            }
            if(ConstraintLayout.this.mMetrics == null) {
                v = 0L;
            }
            else {
                Metrics metrics0 = ConstraintLayout.this.mMetrics;
                ++metrics0.N;
                v = System.nanoTime();
            }
            DimensionBehaviour constraintWidget$DimensionBehaviour0 = basicMeasure$Measure0.a;
            DimensionBehaviour constraintWidget$DimensionBehaviour1 = basicMeasure$Measure0.b;
            int v1 = basicMeasure$Measure0.c;
            int v2 = basicMeasure$Measure0.d;
            int v3 = this.b + this.c;
            int v4 = this.d;
            View view0 = (View)constraintWidget0.w();
            int[] arr_v = androidx.constraintlayout.widget.ConstraintLayout.1.a;
            switch(arr_v[constraintWidget$DimensionBehaviour0.ordinal()]) {
                case 1: {
                    v5 = View.MeasureSpec.makeMeasureSpec(v1, 0x40000000);
                    break;
                }
                case 2: {
                    v5 = ViewGroup.getChildMeasureSpec(this.f, v4, -2);
                    break;
                }
                case 3: {
                    v5 = ViewGroup.getChildMeasureSpec(this.f, v4 + constraintWidget0.I(), -1);
                    break;
                }
                case 4: {
                    v5 = ViewGroup.getChildMeasureSpec(this.f, v4, -2);
                    boolean z = constraintWidget0.w == 1;
                    if(basicMeasure$Measure0.j == Measure.l || basicMeasure$Measure0.j == Measure.m) {
                        boolean z1 = view0.getMeasuredHeight() == constraintWidget0.D();
                        if(basicMeasure$Measure0.j == Measure.m || !z || z1 || view0 instanceof Placeholder || constraintWidget0.G0()) {
                            v5 = View.MeasureSpec.makeMeasureSpec(constraintWidget0.m0(), 0x40000000);
                        }
                    }
                    break;
                }
                default: {
                    v5 = 0;
                }
            }
            switch(arr_v[constraintWidget$DimensionBehaviour1.ordinal()]) {
                case 1: {
                    v6 = View.MeasureSpec.makeMeasureSpec(v2, 0x40000000);
                    break;
                }
                case 2: {
                    v6 = ViewGroup.getChildMeasureSpec(this.g, v3, -2);
                    break;
                }
                case 3: {
                    v6 = ViewGroup.getChildMeasureSpec(this.g, v3 + constraintWidget0.k0(), -1);
                    break;
                }
                case 4: {
                    v6 = ViewGroup.getChildMeasureSpec(this.g, v3, -2);
                    boolean z2 = constraintWidget0.x == 1;
                    if(basicMeasure$Measure0.j == Measure.l || basicMeasure$Measure0.j == Measure.m) {
                        boolean z3 = view0.getMeasuredWidth() == constraintWidget0.m0();
                        if(basicMeasure$Measure0.j == Measure.m || !z2 || z3 || view0 instanceof Placeholder || constraintWidget0.H0()) {
                            v6 = View.MeasureSpec.makeMeasureSpec(constraintWidget0.D(), 0x40000000);
                        }
                    }
                    break;
                }
                default: {
                    v6 = 0;
                }
            }
            ConstraintWidgetContainer constraintWidgetContainer0 = (ConstraintWidgetContainer)constraintWidget0.U();
            if(constraintWidgetContainer0 != null && Optimizer.b(ConstraintLayout.this.mOptimizationLevel, 0x100) && view0.getMeasuredWidth() == constraintWidget0.m0() && view0.getMeasuredWidth() < constraintWidgetContainer0.m0() && view0.getMeasuredHeight() == constraintWidget0.D() && view0.getMeasuredHeight() < constraintWidgetContainer0.D() && view0.getBaseline() == constraintWidget0.t() && !constraintWidget0.F0() && this.d(constraintWidget0.J(), v5, constraintWidget0.m0()) && this.d(constraintWidget0.K(), v6, constraintWidget0.D())) {
                basicMeasure$Measure0.e = constraintWidget0.m0();
                basicMeasure$Measure0.f = constraintWidget0.D();
                basicMeasure$Measure0.g = constraintWidget0.t();
                return;
            }
            boolean z4 = constraintWidget$DimensionBehaviour0 == DimensionBehaviour.c;
            boolean z5 = constraintWidget$DimensionBehaviour1 == DimensionBehaviour.c;
            boolean z6 = constraintWidget$DimensionBehaviour1 == DimensionBehaviour.d || constraintWidget$DimensionBehaviour1 == DimensionBehaviour.a;
            boolean z7 = constraintWidget$DimensionBehaviour0 == DimensionBehaviour.d || constraintWidget$DimensionBehaviour0 == DimensionBehaviour.a;
            boolean z8 = z4 && constraintWidget0.f0 > 0.0f;
            boolean z9 = z5 && constraintWidget0.f0 > 0.0f;
            if(view0 == null) {
                return;
            }
            LayoutParams constraintLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            if(basicMeasure$Measure0.j == Measure.l || basicMeasure$Measure0.j == Measure.m || !z4 || constraintWidget0.w != 0 || !z5 || constraintWidget0.x != 0) {
                if(!(view0 instanceof VirtualLayout) || !(constraintWidget0 instanceof androidx.constraintlayout.core.widgets.VirtualLayout)) {
                    view0.measure(v5, v6);
                }
                else {
                    ((VirtualLayout)view0).L(((androidx.constraintlayout.core.widgets.VirtualLayout)constraintWidget0), v5, v6);
                }
                constraintWidget0.K1(v5, v6);
                int v10 = view0.getMeasuredWidth();
                int v11 = view0.getMeasuredHeight();
                v7 = view0.getBaseline();
                v8 = constraintWidget0.z <= 0 ? v10 : Math.max(constraintWidget0.z, v10);
                int v12 = constraintWidget0.A;
                if(v12 > 0) {
                    v8 = Math.min(v12, v8);
                }
                int v13 = constraintWidget0.C;
                if(v13 > 0) {
                    v9 = Math.max(v13, v11);
                    v14 = v6;
                }
                else {
                    v14 = v6;
                    v9 = v11;
                }
                int v15 = constraintWidget0.D;
                if(v15 > 0) {
                    v9 = Math.min(v15, v9);
                }
                if(!Optimizer.b(ConstraintLayout.this.mOptimizationLevel, 1)) {
                    if(z8 && z6) {
                        v8 = (int)(((float)v9) * constraintWidget0.f0 + 0.5f);
                    }
                    else if(z9 && z7) {
                        v9 = (int)(((float)v8) / constraintWidget0.f0 + 0.5f);
                    }
                }
                if(v10 != v8 || v11 != v9) {
                    int v16 = v10 == v8 ? v5 : View.MeasureSpec.makeMeasureSpec(v8, 0x40000000);
                    int v17 = v11 == v9 ? v14 : View.MeasureSpec.makeMeasureSpec(v9, 0x40000000);
                    view0.measure(v16, v17);
                    constraintWidget0.K1(v16, v17);
                    v8 = view0.getMeasuredWidth();
                    v9 = view0.getMeasuredHeight();
                    v7 = view0.getBaseline();
                }
            }
            else {
                v7 = 0;
                v8 = 0;
                v9 = 0;
            }
            boolean z10 = v7 != -1;
            basicMeasure$Measure0.i = v8 != basicMeasure$Measure0.c || v9 != basicMeasure$Measure0.d;
            if(constraintLayout$LayoutParams0.g0) {
                z10 = true;
            }
            if(z10 && v7 != -1 && constraintWidget0.t() != v7) {
                basicMeasure$Measure0.i = true;
            }
            basicMeasure$Measure0.e = v8;
            basicMeasure$Measure0.f = v9;
            basicMeasure$Measure0.h = z10;
            basicMeasure$Measure0.g = v7;
            if(ConstraintLayout.this.mMetrics != null) {
                Metrics metrics1 = ConstraintLayout.this.mMetrics;
                metrics1.a += System.nanoTime() - v;
            }
        }

        public void c(int v, int v1, int v2, int v3, int v4, int v5) {
            this.b = v2;
            this.c = v3;
            this.d = v4;
            this.e = v5;
            this.f = v;
            this.g = v1;
        }

        private boolean d(int v, int v1, int v2) {
            if(v == v1) {
                return true;
            }
            int v3 = View.MeasureSpec.getMode(v);
            return View.MeasureSpec.getMode(v1) == 0x40000000 && (v3 == 0x80000000 || v3 == 0) && v2 == View.MeasureSpec.getSize(v1);
        }
    }

    public interface ValueModifier {
        boolean a(int arg1, int arg2, int arg3, View arg4, LayoutParams arg5);
    }

    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.2.0-alpha04";
    SparseArray mChildrenByIds;
    private ArrayList mConstraintHelpers;
    protected ConstraintLayoutStates mConstraintLayoutSpec;
    private ConstraintSet mConstraintSet;
    private int mConstraintSetId;
    private HashMap mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected ConstraintWidgetContainer mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    Measurer mMeasurer;
    private Metrics mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private ArrayList mModifiers;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray mTempMapIdToWidget;
    private static SharedValues sSharedValues;

    static {
    }

    public ConstraintLayout(@NonNull Context context0) {
        super(context0);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = 0x7FFFFFFF;
        this.mMaxHeight = 0x7FFFFFFF;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 0x101;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray();
        this.mMeasurer = new Measurer(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        this.v(null, 0, 0);
    }

    public ConstraintLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = 0x7FFFFFFF;
        this.mMaxHeight = 0x7FFFFFFF;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 0x101;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray();
        this.mMeasurer = new Measurer(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        this.v(attributeSet0, 0, 0);
    }

    public ConstraintLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = 0x7FFFFFFF;
        this.mMaxHeight = 0x7FFFFFFF;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 0x101;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray();
        this.mMeasurer = new Measurer(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        this.v(attributeSet0, v, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = 0x7FFFFFFF;
        this.mMaxHeight = 0x7FFFFFFF;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 0x101;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray();
        this.mMeasurer = new Measurer(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        this.v(attributeSet0, v, v1);
    }

    public void addValueModifier(ValueModifier constraintLayout$ValueModifier0) {
        if(this.mModifiers == null) {
            this.mModifiers = new ArrayList();
        }
        this.mModifiers.add(constraintLayout$ValueModifier0);
    }

    protected void applyConstraintsFromLayoutParams(boolean z, View view0, ConstraintWidget constraintWidget0, LayoutParams constraintLayout$LayoutParams0, SparseArray sparseArray0) {
        constraintLayout$LayoutParams0.e();
        constraintLayout$LayoutParams0.w0 = false;
        constraintWidget0.c2(view0.getVisibility());
        if(constraintLayout$LayoutParams0.j0) {
            constraintWidget0.I1(true);
            constraintWidget0.c2(8);
        }
        constraintWidget0.i1(view0);
        if(view0 instanceof ConstraintHelper) {
            ((ConstraintHelper)view0).D(constraintWidget0, this.mLayoutWidget.P2());
        }
        if(constraintLayout$LayoutParams0.h0) {
            int v = constraintLayout$LayoutParams0.s0;
            int v1 = constraintLayout$LayoutParams0.t0;
            float f = constraintLayout$LayoutParams0.u0;
            if(f != -1.0f) {
                ((Guideline)constraintWidget0).A2(f);
                return;
            }
            if(v != -1) {
                ((Guideline)constraintWidget0).y2(v);
                return;
            }
            if(v1 != -1) {
                ((Guideline)constraintWidget0).z2(v1);
            }
        }
        else {
            int v2 = constraintLayout$LayoutParams0.l0;
            int v3 = constraintLayout$LayoutParams0.m0;
            int v4 = constraintLayout$LayoutParams0.n0;
            int v5 = constraintLayout$LayoutParams0.o0;
            int v6 = constraintLayout$LayoutParams0.p0;
            int v7 = constraintLayout$LayoutParams0.q0;
            float f1 = constraintLayout$LayoutParams0.r0;
            int v8 = constraintLayout$LayoutParams0.p;
            if(v8 == -1) {
                if(v2 != -1) {
                    Object object0 = sparseArray0.get(v2);
                    if(((ConstraintWidget)object0) != null) {
                        constraintWidget0.v0(Type.b, ((ConstraintWidget)object0), Type.b, constraintLayout$LayoutParams0.leftMargin, v6);
                    }
                }
                else if(v3 != -1) {
                    Object object1 = sparseArray0.get(v3);
                    if(((ConstraintWidget)object1) != null) {
                        constraintWidget0.v0(Type.b, ((ConstraintWidget)object1), Type.d, constraintLayout$LayoutParams0.leftMargin, v6);
                    }
                }
                if(v4 != -1) {
                    Object object2 = sparseArray0.get(v4);
                    if(((ConstraintWidget)object2) != null) {
                        constraintWidget0.v0(Type.d, ((ConstraintWidget)object2), Type.b, constraintLayout$LayoutParams0.rightMargin, v7);
                    }
                }
                else if(v5 != -1) {
                    Object object3 = sparseArray0.get(v5);
                    if(((ConstraintWidget)object3) != null) {
                        constraintWidget0.v0(Type.d, ((ConstraintWidget)object3), Type.d, constraintLayout$LayoutParams0.rightMargin, v7);
                    }
                }
                int v9 = constraintLayout$LayoutParams0.i;
                if(v9 == -1) {
                    int v10 = constraintLayout$LayoutParams0.j;
                    if(v10 != -1) {
                        Object object5 = sparseArray0.get(v10);
                        if(((ConstraintWidget)object5) != null) {
                            constraintWidget0.v0(Type.c, ((ConstraintWidget)object5), Type.e, constraintLayout$LayoutParams0.topMargin, constraintLayout$LayoutParams0.x);
                        }
                    }
                }
                else {
                    Object object4 = sparseArray0.get(v9);
                    if(((ConstraintWidget)object4) != null) {
                        constraintWidget0.v0(Type.c, ((ConstraintWidget)object4), Type.c, constraintLayout$LayoutParams0.topMargin, constraintLayout$LayoutParams0.x);
                    }
                }
                int v11 = constraintLayout$LayoutParams0.k;
                if(v11 == -1) {
                    int v12 = constraintLayout$LayoutParams0.l;
                    if(v12 != -1) {
                        Object object7 = sparseArray0.get(v12);
                        if(((ConstraintWidget)object7) != null) {
                            constraintWidget0.v0(Type.e, ((ConstraintWidget)object7), Type.e, constraintLayout$LayoutParams0.bottomMargin, constraintLayout$LayoutParams0.z);
                        }
                    }
                }
                else {
                    Object object6 = sparseArray0.get(v11);
                    if(((ConstraintWidget)object6) != null) {
                        constraintWidget0.v0(Type.e, ((ConstraintWidget)object6), Type.c, constraintLayout$LayoutParams0.bottomMargin, constraintLayout$LayoutParams0.z);
                    }
                }
                int v13 = constraintLayout$LayoutParams0.m;
                if(v13 == -1) {
                    int v14 = constraintLayout$LayoutParams0.n;
                    if(v14 == -1) {
                        int v15 = constraintLayout$LayoutParams0.o;
                        if(v15 != -1) {
                            this.y(constraintWidget0, constraintLayout$LayoutParams0, sparseArray0, v15, Type.e);
                        }
                    }
                    else {
                        this.y(constraintWidget0, constraintLayout$LayoutParams0, sparseArray0, v14, Type.c);
                    }
                }
                else {
                    this.y(constraintWidget0, constraintLayout$LayoutParams0, sparseArray0, v13, Type.f);
                }
                if(f1 >= 0.0f) {
                    constraintWidget0.B1(f1);
                }
                float f2 = constraintLayout$LayoutParams0.H;
                if(f2 >= 0.0f) {
                    constraintWidget0.W1(f2);
                }
            }
            else {
                ConstraintWidget constraintWidget1 = (ConstraintWidget)sparseArray0.get(v8);
                if(constraintWidget1 != null) {
                    constraintWidget0.m(constraintWidget1, constraintLayout$LayoutParams0.r, constraintLayout$LayoutParams0.q);
                }
            }
            if(z) {
                int v16 = constraintLayout$LayoutParams0.X;
                if(v16 != -1 || constraintLayout$LayoutParams0.Y != -1) {
                    constraintWidget0.S1(v16, constraintLayout$LayoutParams0.Y);
                }
            }
            if(constraintLayout$LayoutParams0.e0) {
                constraintWidget0.E1(DimensionBehaviour.a);
                constraintWidget0.d2(constraintLayout$LayoutParams0.width);
                if(constraintLayout$LayoutParams0.width == -2) {
                    constraintWidget0.E1(DimensionBehaviour.b);
                }
            }
            else if(constraintLayout$LayoutParams0.width == -1) {
                if(constraintLayout$LayoutParams0.a0) {
                    constraintWidget0.E1(DimensionBehaviour.c);
                }
                else {
                    constraintWidget0.E1(DimensionBehaviour.d);
                }
                ConstraintAnchor constraintAnchor0 = constraintWidget0.r(Type.b);
                constraintAnchor0.g = constraintLayout$LayoutParams0.leftMargin;
                ConstraintAnchor constraintAnchor1 = constraintWidget0.r(Type.d);
                constraintAnchor1.g = constraintLayout$LayoutParams0.rightMargin;
            }
            else {
                constraintWidget0.E1(DimensionBehaviour.c);
                constraintWidget0.d2(0);
            }
            if(constraintLayout$LayoutParams0.f0) {
                constraintWidget0.Z1(DimensionBehaviour.a);
                constraintWidget0.z1(constraintLayout$LayoutParams0.height);
                if(constraintLayout$LayoutParams0.height == -2) {
                    constraintWidget0.Z1(DimensionBehaviour.b);
                }
            }
            else if(constraintLayout$LayoutParams0.height == -1) {
                if(constraintLayout$LayoutParams0.b0) {
                    constraintWidget0.Z1(DimensionBehaviour.c);
                }
                else {
                    constraintWidget0.Z1(DimensionBehaviour.d);
                }
                ConstraintAnchor constraintAnchor2 = constraintWidget0.r(Type.c);
                constraintAnchor2.g = constraintLayout$LayoutParams0.topMargin;
                ConstraintAnchor constraintAnchor3 = constraintWidget0.r(Type.e);
                constraintAnchor3.g = constraintLayout$LayoutParams0.bottomMargin;
            }
            else {
                constraintWidget0.Z1(DimensionBehaviour.c);
                constraintWidget0.z1(0);
            }
            constraintWidget0.o1(constraintLayout$LayoutParams0.I);
            constraintWidget0.G1(constraintLayout$LayoutParams0.L);
            constraintWidget0.b2(constraintLayout$LayoutParams0.M);
            constraintWidget0.C1(constraintLayout$LayoutParams0.N);
            constraintWidget0.X1(constraintLayout$LayoutParams0.O);
            constraintWidget0.f2(constraintLayout$LayoutParams0.d0);
            constraintWidget0.F1(constraintLayout$LayoutParams0.P, constraintLayout$LayoutParams0.R, constraintLayout$LayoutParams0.T, constraintLayout$LayoutParams0.V);
            constraintWidget0.a2(constraintLayout$LayoutParams0.Q, constraintLayout$LayoutParams0.S, constraintLayout$LayoutParams0.U, constraintLayout$LayoutParams0.W);
        }
    }

    @Override  // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof LayoutParams;
    }

    @Override  // android.view.ViewGroup
    protected void dispatchDraw(Canvas canvas0) {
        ArrayList arrayList0 = this.mConstraintHelpers;
        if(arrayList0 != null) {
            int v = arrayList0.size();
            if(v > 0) {
                for(int v1 = 0; v1 < v; ++v1) {
                    ((ConstraintHelper)this.mConstraintHelpers.get(v1)).H(this);
                }
            }
        }
        super.dispatchDraw(canvas0);
        if(this.isInEditMode()) {
            float f = (float)this.getWidth();
            float f1 = (float)this.getHeight();
            int v2 = this.getChildCount();
            for(int v3 = 0; v3 < v2; ++v3) {
                View view0 = this.getChildAt(v3);
                if(view0.getVisibility() != 8) {
                    Object object0 = view0.getTag();
                    if(object0 != null && object0 instanceof String) {
                        String[] arr_s = ((String)object0).split(",");
                        if(arr_s.length == 4) {
                            int v4 = Integer.parseInt(arr_s[0]);
                            int v5 = Integer.parseInt(arr_s[1]);
                            int v6 = Integer.parseInt(arr_s[2]);
                            int v7 = (int)(((float)v4) / 1080.0f * f);
                            int v8 = (int)(((float)v5) / 1920.0f * f1);
                            int v9 = (int)(((float)Integer.parseInt(arr_s[3])) / 1920.0f * f1);
                            Paint paint0 = new Paint();
                            paint0.setColor(0xFFFF0000);
                            float f2 = (float)(v7 + ((int)(((float)v6) / 1080.0f * f)));
                            canvas0.drawLine(((float)v7), ((float)v8), f2, ((float)v8), paint0);
                            float f3 = (float)(v8 + v9);
                            canvas0.drawLine(f2, ((float)v8), f2, f3, paint0);
                            canvas0.drawLine(f2, f3, ((float)v7), f3, paint0);
                            canvas0.drawLine(((float)v7), f3, ((float)v7), ((float)v8), paint0);
                            paint0.setColor(0xFF00FF00);
                            canvas0.drawLine(((float)v7), ((float)v8), f2, f3, paint0);
                            canvas0.drawLine(((float)v7), f3, f2, ((float)v8), paint0);
                        }
                    }
                }
            }
        }
    }

    protected boolean dynamicUpdateConstraints(int v, int v1) {
        boolean z = false;
        if(this.mModifiers == null) {
            return false;
        }
        int v2 = View.MeasureSpec.getSize(v);
        int v3 = View.MeasureSpec.getSize(v1);
        for(Object object0: this.mModifiers) {
            ValueModifier constraintLayout$ValueModifier0 = (ValueModifier)object0;
            for(Object object1: this.mLayoutWidget.m2()) {
                Object object2 = ((ConstraintWidget)object1).w();
                z |= constraintLayout$ValueModifier0.a(v2, v3, ((View)object2).getId(), ((View)object2), ((LayoutParams)((View)object2).getLayoutParams()));
            }
        }
        return z;
    }

    public void fillMetrics(Metrics metrics0) {
        this.mMetrics = metrics0;
        this.mLayoutWidget.F2(metrics0);
    }

    @Override  // android.view.View
    public void forceLayout() {
        this.w();
        super.forceLayout();
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.generateDefaultLayoutParams();
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return this.generateLayoutParams(attributeSet0);
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return new LayoutParams(viewGroup$LayoutParams0);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new LayoutParams(this.getContext(), attributeSet0);
    }

    // 去混淆评级： 低(20)
    public Object getDesignInformation(int v, Object object0) {
        return v != 0 || !(object0 instanceof String) || (this.mDesignIds == null || !this.mDesignIds.containsKey(((String)object0))) ? null : this.mDesignIds.get(((String)object0));
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.I2();
    }

    private int getPaddingWidth() {
        int v = Math.max(0, this.getPaddingLeft()) + Math.max(0, this.getPaddingRight());
        int v1 = Math.max(0, this.getPaddingStart()) + Math.max(0, this.getPaddingEnd());
        return v1 <= 0 ? v : v1;
    }

    public String getSceneString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.mLayoutWidget.o == null) {
            int v = this.getId();
            this.mLayoutWidget.o = v == -1 ? "parent" : this.getContext().getResources().getResourceEntryName(v);
        }
        if(this.mLayoutWidget.y() == null) {
            this.mLayoutWidget.k1(this.mLayoutWidget.o);
            Log.v("ConstraintLayout", " setDebugName " + this.mLayoutWidget.y());
        }
        for(Object object0: this.mLayoutWidget.m2()) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)object0;
            View view0 = (View)constraintWidget0.w();
            if(view0 != null) {
                if(constraintWidget0.o == null) {
                    int v1 = view0.getId();
                    if(v1 != -1) {
                        constraintWidget0.o = this.getContext().getResources().getResourceEntryName(v1);
                    }
                }
                if(constraintWidget0.y() == null) {
                    constraintWidget0.k1(constraintWidget0.o);
                    Log.v("ConstraintLayout", " setDebugName " + constraintWidget0.y());
                }
            }
        }
        this.mLayoutWidget.b0(stringBuilder0);
        return stringBuilder0.toString();
    }

    public static SharedValues getSharedValues() {
        if(ConstraintLayout.sSharedValues == null) {
            ConstraintLayout.sSharedValues = new SharedValues();
        }
        return ConstraintLayout.sSharedValues;
    }

    public View getViewById(int v) {
        return (View)this.mChildrenByIds.get(v);
    }

    public final ConstraintWidget getViewWidget(View view0) {
        if(view0 == this) {
            return this.mLayoutWidget;
        }
        if(view0 != null) {
            if(view0.getLayoutParams() instanceof LayoutParams) {
                return ((LayoutParams)view0.getLayoutParams()).v0;
            }
            view0.setLayoutParams(this.generateLayoutParams(view0.getLayoutParams()));
            return view0.getLayoutParams() instanceof LayoutParams ? ((LayoutParams)view0.getLayoutParams()).v0 : null;
        }
        return null;
    }

    protected boolean isRtl() {
        return (this.getContext().getApplicationInfo().flags & 0x400000) != 0 && 1 == this.getLayoutDirection();
    }

    public void loadLayoutDescription(int v) {
        if(v != 0) {
            try {
                this.mConstraintLayoutSpec = new ConstraintLayoutStates(this.getContext(), this, v);
            }
            catch(Resources.NotFoundException unused_ex) {
                this.mConstraintLayoutSpec = null;
            }
            return;
        }
        this.mConstraintLayoutSpec = null;
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        Metrics metrics0 = this.mMetrics;
        if(metrics0 != null) {
            ++metrics0.M;
        }
        int v4 = this.getChildCount();
        boolean z1 = this.isInEditMode();
        for(int v6 = 0; v6 < v4; ++v6) {
            View view0 = this.getChildAt(v6);
            LayoutParams constraintLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            ConstraintWidget constraintWidget0 = constraintLayout$LayoutParams0.v0;
            if((view0.getVisibility() != 8 || constraintLayout$LayoutParams0.h0 || constraintLayout$LayoutParams0.i0 || constraintLayout$LayoutParams0.k0 || z1) && !constraintLayout$LayoutParams0.j0) {
                int v7 = constraintWidget0.o0();
                int v8 = constraintWidget0.p0();
                int v9 = constraintWidget0.m0() + v7;
                int v10 = constraintWidget0.D() + v8;
                view0.layout(v7, v8, v9, v10);
                if(view0 instanceof Placeholder) {
                    View view1 = ((Placeholder)view0).getContent();
                    if(view1 != null) {
                        view1.setVisibility(0);
                        view1.layout(v7, v8, v9, v10);
                    }
                }
            }
        }
        int v11 = this.mConstraintHelpers.size();
        if(v11 > 0) {
            for(int v5 = 0; v5 < v11; ++v5) {
                ((ConstraintHelper)this.mConstraintHelpers.get(v5)).F(this);
            }
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        long v2;
        if(this.mMetrics == null) {
            v2 = 0L;
        }
        else {
            v2 = System.nanoTime();
            Metrics metrics0 = this.mMetrics;
            metrics0.P = (long)this.getChildCount();
            ++this.mMetrics.Q;
        }
        int v3 = this.mDirtyHierarchy | this.dynamicUpdateConstraints(v, v1);
        this.mDirtyHierarchy = v3;
        if(v3 == 0) {
            int v4 = this.getChildCount();
            for(int v5 = 0; v5 < v4; ++v5) {
                if(this.getChildAt(v5).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
            }
        }
        this.mOnMeasureWidthMeasureSpec = v;
        this.mOnMeasureHeightMeasureSpec = v1;
        this.mLayoutWidget.Z2(this.isRtl());
        if(this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if(this.z()) {
                this.mLayoutWidget.b3();
            }
        }
        this.mLayoutWidget.F2(this.mMetrics);
        this.resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, v, v1);
        this.resolveMeasuredDimension(v, v1, this.mLayoutWidget.m0(), this.mLayoutWidget.D(), this.mLayoutWidget.Q2(), this.mLayoutWidget.O2());
        Metrics metrics1 = this.mMetrics;
        if(metrics1 != null) {
            metrics1.O += System.nanoTime() - v2;
        }
    }

    @Override  // android.view.ViewGroup
    public void onViewAdded(View view0) {
        super.onViewAdded(view0);
        if(view0 instanceof androidx.constraintlayout.widget.Guideline && !(this.getViewWidget(view0) instanceof Guideline)) {
            LayoutParams constraintLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            Guideline guideline0 = new Guideline();
            constraintLayout$LayoutParams0.v0 = guideline0;
            constraintLayout$LayoutParams0.h0 = true;
            guideline0.D2(constraintLayout$LayoutParams0.Z);
        }
        if(view0 instanceof ConstraintHelper) {
            ((ConstraintHelper)view0).K();
            ((LayoutParams)view0.getLayoutParams()).i0 = true;
            if(!this.mConstraintHelpers.contains(((ConstraintHelper)view0))) {
                this.mConstraintHelpers.add(((ConstraintHelper)view0));
            }
        }
        this.mChildrenByIds.put(view0.getId(), view0);
        this.mDirtyHierarchy = true;
    }

    @Override  // android.view.ViewGroup
    public void onViewRemoved(View view0) {
        super.onViewRemoved(view0);
        this.mChildrenByIds.remove(view0.getId());
        ConstraintWidget constraintWidget0 = this.getViewWidget(view0);
        this.mLayoutWidget.p2(constraintWidget0);
        this.mConstraintHelpers.remove(view0);
        this.mDirtyHierarchy = true;
    }

    protected void parseLayoutDescription(int v) {
        this.mConstraintLayoutSpec = new ConstraintLayoutStates(this.getContext(), this, v);
    }

    private ConstraintWidget r(int v) {
        if(v == 0) {
            return this.mLayoutWidget;
        }
        View view0 = (View)this.mChildrenByIds.get(v);
        if(view0 == null) {
            view0 = this.findViewById(v);
            if(view0 != null && view0 != this && view0.getParent() == this) {
                this.onViewAdded(view0);
            }
        }
        if(view0 == this) {
            return this.mLayoutWidget;
        }
        return view0 == null ? null : ((LayoutParams)view0.getLayoutParams()).v0;
    }

    void removeValueModifier(ValueModifier constraintLayout$ValueModifier0) {
        if(constraintLayout$ValueModifier0 == null) {
            return;
        }
        this.mModifiers.remove(constraintLayout$ValueModifier0);
    }

    @Override  // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.w();
        super.requestLayout();
    }

    protected void resolveMeasuredDimension(int v, int v1, int v2, int v3, boolean z, boolean z1) {
        int v4 = v3 + this.mMeasurer.e;
        int v5 = View.resolveSizeAndState(v2 + this.mMeasurer.d, v, 0);
        int v6 = View.resolveSizeAndState(v4, v1, 0);
        int v7 = Math.min(this.mMaxWidth, v5 & 0xFFFFFF);
        int v8 = Math.min(this.mMaxHeight, v6 & 0xFFFFFF);
        if(z) {
            v7 |= 0x1000000;
        }
        if(z1) {
            v8 |= 0x1000000;
        }
        this.setMeasuredDimension(v7, v8);
        this.mLastMeasureWidth = v7;
        this.mLastMeasureHeight = v8;
    }

    protected void resolveSystem(ConstraintWidgetContainer constraintWidgetContainer0, int v, int v1, int v2) {
        int v13;
        int v3 = View.MeasureSpec.getMode(v1);
        int v4 = View.MeasureSpec.getSize(v1);
        int v5 = View.MeasureSpec.getMode(v2);
        int v6 = View.MeasureSpec.getSize(v2);
        int v7 = Math.max(0, this.getPaddingTop());
        int v8 = Math.max(0, this.getPaddingBottom());
        int v9 = v7 + v8;
        int v10 = this.getPaddingWidth();
        this.mMeasurer.c(v1, v2, v7, v8, v10, v9);
        int v11 = Math.max(0, this.getPaddingStart());
        int v12 = Math.max(0, this.getPaddingEnd());
        if(v11 > 0 || v12 > 0) {
            v13 = this.isRtl() ? v12 : v11;
        }
        else {
            v13 = Math.max(0, this.getPaddingLeft());
        }
        int v14 = v4 - v10;
        int v15 = v6 - v9;
        this.setSelfDimensionBehaviour(constraintWidgetContainer0, v3, v14, v5, v15);
        constraintWidgetContainer0.R2(v, v3, v14, v5, v15, this.mLastMeasureWidth, this.mLastMeasureHeight, v13, v7);
    }

    public void setConstraintSet(ConstraintSet constraintSet0) {
        this.mConstraintSet = constraintSet0;
    }

    public void setDesignInformation(int v, Object object0, Object object1) {
        if(v == 0 && object0 instanceof String && object1 instanceof Integer) {
            if(this.mDesignIds == null) {
                this.mDesignIds = new HashMap();
            }
            String s = (String)object0;
            int v1 = s.indexOf("/");
            if(v1 != -1) {
                s = s.substring(v1 + 1);
            }
            ((Integer)object1).intValue();
            this.mDesignIds.put(s, ((Integer)object1));
        }
    }

    @Override  // android.view.View
    public void setId(int v) {
        this.mChildrenByIds.remove(this.getId());
        super.setId(v);
        this.mChildrenByIds.put(this.getId(), this);
    }

    public void setMaxHeight(int v) {
        if(v == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = v;
        this.requestLayout();
    }

    public void setMaxWidth(int v) {
        if(v == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = v;
        this.requestLayout();
    }

    public void setMinHeight(int v) {
        if(v == this.mMinHeight) {
            return;
        }
        this.mMinHeight = v;
        this.requestLayout();
    }

    public void setMinWidth(int v) {
        if(v == this.mMinWidth) {
            return;
        }
        this.mMinWidth = v;
        this.requestLayout();
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener0) {
        ConstraintLayoutStates constraintLayoutStates0 = this.mConstraintLayoutSpec;
        if(constraintLayoutStates0 != null) {
            constraintLayoutStates0.d(constraintsChangedListener0);
        }
    }

    public void setOptimizationLevel(int v) {
        this.mOptimizationLevel = v;
        this.mLayoutWidget.W2(v);
    }

    protected void setSelfDimensionBehaviour(ConstraintWidgetContainer constraintWidgetContainer0, int v, int v1, int v2, int v3) {
        DimensionBehaviour constraintWidget$DimensionBehaviour1;
        int v4 = this.mMeasurer.e;
        int v5 = this.mMeasurer.d;
        DimensionBehaviour constraintWidget$DimensionBehaviour0 = DimensionBehaviour.a;
        int v6 = this.getChildCount();
        switch(v) {
            case 0x80000000: {
                constraintWidget$DimensionBehaviour1 = DimensionBehaviour.b;
                if(v6 == 0) {
                    v1 = Math.max(0, this.mMinWidth);
                }
                break;
            }
            case 0: {
                constraintWidget$DimensionBehaviour1 = DimensionBehaviour.b;
                v1 = v6 == 0 ? Math.max(0, this.mMinWidth) : 0;
                break;
            }
            case 0x40000000: {
                v1 = Math.min(this.mMaxWidth - v5, v1);
                constraintWidget$DimensionBehaviour1 = constraintWidget$DimensionBehaviour0;
                break;
            }
            default: {
                constraintWidget$DimensionBehaviour1 = constraintWidget$DimensionBehaviour0;
                v1 = 0;
            }
        }
        switch(v2) {
            case 0x80000000: {
                constraintWidget$DimensionBehaviour0 = DimensionBehaviour.b;
                if(v6 == 0) {
                    v3 = Math.max(0, this.mMinHeight);
                }
                break;
            }
            case 0: {
                constraintWidget$DimensionBehaviour0 = DimensionBehaviour.b;
                v3 = v6 == 0 ? Math.max(0, this.mMinHeight) : 0;
                break;
            }
            case 0x40000000: {
                v3 = Math.min(this.mMaxHeight - v4, v3);
                break;
            }
            default: {
                v3 = 0;
            }
        }
        if(v1 != constraintWidgetContainer0.m0() || v3 != constraintWidgetContainer0.D()) {
            constraintWidgetContainer0.N2();
        }
        constraintWidgetContainer0.g2(0);
        constraintWidgetContainer0.h2(0);
        constraintWidgetContainer0.N1(this.mMaxWidth - v5);
        constraintWidgetContainer0.M1(this.mMaxHeight - v4);
        constraintWidgetContainer0.Q1(0);
        constraintWidgetContainer0.P1(0);
        constraintWidgetContainer0.E1(constraintWidget$DimensionBehaviour1);
        constraintWidgetContainer0.d2(v1);
        constraintWidgetContainer0.Z1(constraintWidget$DimensionBehaviour0);
        constraintWidgetContainer0.z1(v3);
        constraintWidgetContainer0.Q1(this.mMinWidth - v5);
        constraintWidgetContainer0.P1(this.mMinHeight - v4);
    }

    public void setState(int v, int v1, int v2) {
        ConstraintLayoutStates constraintLayoutStates0 = this.mConstraintLayoutSpec;
        if(constraintLayoutStates0 != null) {
            constraintLayoutStates0.e(v, ((float)v1), ((float)v2));
        }
    }

    @Override  // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    private void v(AttributeSet attributeSet0, int v, int v1) {
        this.mLayoutWidget.i1(this);
        this.mLayoutWidget.V2(this.mMeasurer);
        this.mChildrenByIds.put(this.getId(), this);
        this.mConstraintSet = null;
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.ConstraintLayout_Layout, v, v1);
            int v2 = typedArray0.getIndexCount();
            for(int v3 = 0; v3 < v2; ++v3) {
                int v4 = typedArray0.getIndex(v3);
                if(v4 == styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.mMinWidth = typedArray0.getDimensionPixelOffset(v4, this.mMinWidth);
                }
                else if(v4 == styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.mMinHeight = typedArray0.getDimensionPixelOffset(v4, this.mMinHeight);
                }
                else if(v4 == styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.mMaxWidth = typedArray0.getDimensionPixelOffset(v4, this.mMaxWidth);
                }
                else if(v4 == styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.mMaxHeight = typedArray0.getDimensionPixelOffset(v4, this.mMaxHeight);
                }
                else if(v4 == styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.mOptimizationLevel = typedArray0.getInt(v4, this.mOptimizationLevel);
                }
                else if(v4 == styleable.ConstraintLayout_Layout_layoutDescription) {
                    int v5 = typedArray0.getResourceId(v4, 0);
                    if(v5 != 0) {
                        try {
                            this.parseLayoutDescription(v5);
                        }
                        catch(Resources.NotFoundException unused_ex) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                }
                else if(v4 == styleable.ConstraintLayout_Layout_constraintSet) {
                    int v6 = typedArray0.getResourceId(v4, 0);
                    try {
                        ConstraintSet constraintSet0 = new ConstraintSet();
                        this.mConstraintSet = constraintSet0;
                        constraintSet0.y0(this.getContext(), v6);
                    }
                    catch(Resources.NotFoundException unused_ex) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = v6;
                }
            }
            typedArray0.recycle();
        }
        this.mLayoutWidget.W2(this.mOptimizationLevel);
    }

    private void w() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void x() {
        boolean z = this.isInEditMode();
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            ConstraintWidget constraintWidget0 = this.getViewWidget(this.getChildAt(v1));
            if(constraintWidget0 != null) {
                constraintWidget0.R0();
            }
        }
        if(z) {
            for(int v2 = 0; v2 < v; ++v2) {
                View view0 = this.getChildAt(v2);
                try {
                    String s = this.getResources().getResourceName(view0.getId());
                    this.setDesignInformation(0, s, view0.getId());
                    int v3 = s.indexOf(0x2F);
                    if(v3 != -1) {
                        s = s.substring(v3 + 1);
                    }
                    this.r(view0.getId()).k1(s);
                }
                catch(Resources.NotFoundException unused_ex) {
                }
            }
        }
        if(this.mConstraintSetId != -1) {
            for(int v4 = 0; v4 < v; ++v4) {
                View view1 = this.getChildAt(v4);
                if(view1.getId() == this.mConstraintSetId && view1 instanceof Constraints) {
                    this.mConstraintSet = ((Constraints)view1).getConstraintSet();
                }
            }
        }
        ConstraintSet constraintSet0 = this.mConstraintSet;
        if(constraintSet0 != null) {
            constraintSet0.t(this, true);
        }
        this.mLayoutWidget.q2();
        int v5 = this.mConstraintHelpers.size();
        if(v5 > 0) {
            for(int v6 = 0; v6 < v5; ++v6) {
                ((ConstraintHelper)this.mConstraintHelpers.get(v6)).J(this);
            }
        }
        for(int v7 = 0; v7 < v; ++v7) {
            View view2 = this.getChildAt(v7);
            if(view2 instanceof Placeholder) {
                ((Placeholder)view2).c(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(this.getId(), this.mLayoutWidget);
        for(int v8 = 0; v8 < v; ++v8) {
            View view3 = this.getChildAt(v8);
            ConstraintWidget constraintWidget1 = this.getViewWidget(view3);
            this.mTempMapIdToWidget.put(view3.getId(), constraintWidget1);
        }
        for(int v9 = 0; v9 < v; ++v9) {
            View view4 = this.getChildAt(v9);
            ConstraintWidget constraintWidget2 = this.getViewWidget(view4);
            if(constraintWidget2 != null) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = view4.getLayoutParams();
                this.mLayoutWidget.a(constraintWidget2);
                this.applyConstraintsFromLayoutParams(z, view4, constraintWidget2, ((LayoutParams)viewGroup$LayoutParams0), this.mTempMapIdToWidget);
            }
        }
    }

    private void y(ConstraintWidget constraintWidget0, LayoutParams constraintLayout$LayoutParams0, SparseArray sparseArray0, int v, Type constraintAnchor$Type0) {
        View view0 = (View)this.mChildrenByIds.get(v);
        ConstraintWidget constraintWidget1 = (ConstraintWidget)sparseArray0.get(v);
        if(constraintWidget1 != null && view0 != null && view0.getLayoutParams() instanceof LayoutParams) {
            constraintLayout$LayoutParams0.g0 = true;
            Type constraintAnchor$Type1 = Type.f;
            if(constraintAnchor$Type0 == constraintAnchor$Type1) {
                LayoutParams constraintLayout$LayoutParams1 = (LayoutParams)view0.getLayoutParams();
                constraintLayout$LayoutParams1.g0 = true;
                constraintLayout$LayoutParams1.v0.y1(true);
            }
            constraintWidget0.r(constraintAnchor$Type1).b(constraintWidget1.r(constraintAnchor$Type0), constraintLayout$LayoutParams0.D, constraintLayout$LayoutParams0.C, true);
            constraintWidget0.y1(true);
            constraintWidget0.r(Type.c).x();
            constraintWidget0.r(Type.e).x();
        }
    }

    private boolean z() {
        int v = this.getChildCount();
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.getChildAt(v1).isLayoutRequested()) {
                z = true;
                break;
            }
        }
        if(z) {
            this.x();
        }
        return z;
    }
}

