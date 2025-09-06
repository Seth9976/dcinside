package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ConstraintSet {
    public static class Constraint {
        static class Delta {
            int[] a;
            int[] b;
            int c;
            int[] d;
            float[] e;
            int f;
            int[] g;
            String[] h;
            int i;
            int[] j;
            boolean[] k;
            int l;
            private static final int m = 4;
            private static final int n = 10;
            private static final int o = 10;
            private static final int p = 5;

            Delta() {
                this.a = new int[10];
                this.b = new int[10];
                this.c = 0;
                this.d = new int[10];
                this.e = new float[10];
                this.f = 0;
                this.g = new int[5];
                this.h = new String[5];
                this.i = 0;
                this.j = new int[4];
                this.k = new boolean[4];
                this.l = 0;
            }

            void a(int v, float f) {
                int[] arr_v = this.d;
                if(this.f >= arr_v.length) {
                    this.d = Arrays.copyOf(arr_v, arr_v.length * 2);
                    this.e = Arrays.copyOf(this.e, this.e.length * 2);
                }
                int v1 = this.f;
                this.d[v1] = v;
                this.f = v1 + 1;
                this.e[v1] = f;
            }

            void b(int v, int v1) {
                int[] arr_v = this.a;
                if(this.c >= arr_v.length) {
                    this.a = Arrays.copyOf(arr_v, arr_v.length * 2);
                    this.b = Arrays.copyOf(this.b, this.b.length * 2);
                }
                int v2 = this.c;
                this.a[v2] = v;
                this.c = v2 + 1;
                this.b[v2] = v1;
            }

            void c(int v, String s) {
                int[] arr_v = this.g;
                if(this.i >= arr_v.length) {
                    this.g = Arrays.copyOf(arr_v, arr_v.length * 2);
                    this.h = (String[])Arrays.copyOf(this.h, this.h.length * 2);
                }
                int v1 = this.i;
                this.g[v1] = v;
                this.i = v1 + 1;
                this.h[v1] = s;
            }

            void d(int v, boolean z) {
                int[] arr_v = this.j;
                if(this.l >= arr_v.length) {
                    this.j = Arrays.copyOf(arr_v, arr_v.length * 2);
                    this.k = Arrays.copyOf(this.k, this.k.length * 2);
                }
                int v1 = this.l;
                this.j[v1] = v;
                this.l = v1 + 1;
                this.k[v1] = z;
            }

            void e(Constraint constraintSet$Constraint0) {
                for(int v1 = 0; v1 < this.c; ++v1) {
                    ConstraintSet.V0(constraintSet$Constraint0, this.a[v1], this.b[v1]);
                }
                for(int v2 = 0; v2 < this.f; ++v2) {
                    ConstraintSet.U0(constraintSet$Constraint0, this.d[v2], this.e[v2]);
                }
                for(int v3 = 0; v3 < this.i; ++v3) {
                    ConstraintSet.W0(constraintSet$Constraint0, this.g[v3], this.h[v3]);
                }
                for(int v = 0; v < this.l; ++v) {
                    ConstraintSet.X0(constraintSet$Constraint0, this.j[v], this.k[v]);
                }
            }

            @SuppressLint({"LogConditional"})
            void f(String s) {
                Log.v(s, "int");
                for(int v1 = 0; v1 < this.c; ++v1) {
                    Log.v(s, this.a[v1] + " = " + this.b[v1]);
                }
                Log.v(s, "float");
                for(int v2 = 0; v2 < this.f; ++v2) {
                    Log.v(s, this.d[v2] + " = " + this.e[v2]);
                }
                Log.v(s, "strings");
                for(int v3 = 0; v3 < this.i; ++v3) {
                    Log.v(s, this.g[v3] + " = " + this.h[v3]);
                }
                Log.v(s, "boolean");
                for(int v = 0; v < this.l; ++v) {
                    Log.v(s, this.j[v] + " = " + this.k[v]);
                }
            }
        }

        int a;
        String b;
        public final PropertySet c;
        public final Motion d;
        public final Layout e;
        public final Transform f;
        public HashMap g;
        Delta h;

        public Constraint() {
            this.c = new PropertySet();
            this.d = new Motion();
            this.e = new Layout();
            this.f = new Transform();
            this.g = new HashMap();
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return this.j();
        }

        public void h(Constraint constraintSet$Constraint0) {
            Delta constraintSet$Constraint$Delta0 = this.h;
            if(constraintSet$Constraint$Delta0 != null) {
                constraintSet$Constraint$Delta0.e(constraintSet$Constraint0);
            }
        }

        public void i(LayoutParams constraintLayout$LayoutParams0) {
            Layout constraintSet$Layout0 = this.e;
            constraintLayout$LayoutParams0.e = constraintSet$Layout0.j;
            constraintLayout$LayoutParams0.f = constraintSet$Layout0.k;
            constraintLayout$LayoutParams0.g = constraintSet$Layout0.l;
            constraintLayout$LayoutParams0.h = constraintSet$Layout0.m;
            constraintLayout$LayoutParams0.i = constraintSet$Layout0.n;
            constraintLayout$LayoutParams0.j = constraintSet$Layout0.o;
            constraintLayout$LayoutParams0.k = constraintSet$Layout0.p;
            constraintLayout$LayoutParams0.l = constraintSet$Layout0.q;
            constraintLayout$LayoutParams0.m = constraintSet$Layout0.r;
            constraintLayout$LayoutParams0.n = constraintSet$Layout0.s;
            constraintLayout$LayoutParams0.o = constraintSet$Layout0.t;
            constraintLayout$LayoutParams0.s = constraintSet$Layout0.u;
            constraintLayout$LayoutParams0.t = constraintSet$Layout0.v;
            constraintLayout$LayoutParams0.u = constraintSet$Layout0.w;
            constraintLayout$LayoutParams0.v = constraintSet$Layout0.x;
            constraintLayout$LayoutParams0.leftMargin = constraintSet$Layout0.H;
            constraintLayout$LayoutParams0.rightMargin = constraintSet$Layout0.I;
            constraintLayout$LayoutParams0.topMargin = constraintSet$Layout0.J;
            constraintLayout$LayoutParams0.bottomMargin = constraintSet$Layout0.K;
            constraintLayout$LayoutParams0.A = constraintSet$Layout0.T;
            constraintLayout$LayoutParams0.B = constraintSet$Layout0.S;
            constraintLayout$LayoutParams0.x = constraintSet$Layout0.P;
            constraintLayout$LayoutParams0.z = constraintSet$Layout0.R;
            constraintLayout$LayoutParams0.G = constraintSet$Layout0.y;
            constraintLayout$LayoutParams0.H = constraintSet$Layout0.z;
            constraintLayout$LayoutParams0.p = constraintSet$Layout0.B;
            constraintLayout$LayoutParams0.q = constraintSet$Layout0.C;
            constraintLayout$LayoutParams0.r = constraintSet$Layout0.D;
            constraintLayout$LayoutParams0.I = constraintSet$Layout0.A;
            constraintLayout$LayoutParams0.X = constraintSet$Layout0.E;
            constraintLayout$LayoutParams0.Y = constraintSet$Layout0.F;
            constraintLayout$LayoutParams0.M = constraintSet$Layout0.V;
            constraintLayout$LayoutParams0.L = constraintSet$Layout0.W;
            constraintLayout$LayoutParams0.O = constraintSet$Layout0.Y;
            constraintLayout$LayoutParams0.N = constraintSet$Layout0.X;
            constraintLayout$LayoutParams0.a0 = constraintSet$Layout0.n0;
            constraintLayout$LayoutParams0.b0 = constraintSet$Layout0.o0;
            constraintLayout$LayoutParams0.P = constraintSet$Layout0.Z;
            constraintLayout$LayoutParams0.Q = constraintSet$Layout0.a0;
            constraintLayout$LayoutParams0.T = constraintSet$Layout0.b0;
            constraintLayout$LayoutParams0.U = constraintSet$Layout0.c0;
            constraintLayout$LayoutParams0.R = constraintSet$Layout0.d0;
            constraintLayout$LayoutParams0.S = constraintSet$Layout0.e0;
            constraintLayout$LayoutParams0.V = constraintSet$Layout0.f0;
            constraintLayout$LayoutParams0.W = constraintSet$Layout0.g0;
            constraintLayout$LayoutParams0.Z = constraintSet$Layout0.G;
            constraintLayout$LayoutParams0.c = constraintSet$Layout0.h;
            constraintLayout$LayoutParams0.a = constraintSet$Layout0.f;
            constraintLayout$LayoutParams0.b = constraintSet$Layout0.g;
            constraintLayout$LayoutParams0.width = constraintSet$Layout0.d;
            constraintLayout$LayoutParams0.height = constraintSet$Layout0.e;
            String s = constraintSet$Layout0.m0;
            if(s != null) {
                constraintLayout$LayoutParams0.c0 = s;
            }
            constraintLayout$LayoutParams0.d0 = constraintSet$Layout0.q0;
            constraintLayout$LayoutParams0.setMarginStart(constraintSet$Layout0.M);
            constraintLayout$LayoutParams0.setMarginEnd(this.e.L);
            constraintLayout$LayoutParams0.e();
        }

        public Constraint j() {
            Constraint constraintSet$Constraint0 = new Constraint();
            constraintSet$Constraint0.e.a(this.e);
            constraintSet$Constraint0.d.a(this.d);
            constraintSet$Constraint0.c.a(this.c);
            constraintSet$Constraint0.f.a(this.f);
            constraintSet$Constraint0.a = this.a;
            constraintSet$Constraint0.h = this.h;
            return constraintSet$Constraint0;
        }

        private void k(int v, LayoutParams constraintLayout$LayoutParams0) {
            this.a = v;
            Layout constraintSet$Layout0 = this.e;
            constraintSet$Layout0.j = constraintLayout$LayoutParams0.e;
            constraintSet$Layout0.k = constraintLayout$LayoutParams0.f;
            constraintSet$Layout0.l = constraintLayout$LayoutParams0.g;
            constraintSet$Layout0.m = constraintLayout$LayoutParams0.h;
            constraintSet$Layout0.n = constraintLayout$LayoutParams0.i;
            constraintSet$Layout0.o = constraintLayout$LayoutParams0.j;
            constraintSet$Layout0.p = constraintLayout$LayoutParams0.k;
            constraintSet$Layout0.q = constraintLayout$LayoutParams0.l;
            constraintSet$Layout0.r = constraintLayout$LayoutParams0.m;
            constraintSet$Layout0.s = constraintLayout$LayoutParams0.n;
            constraintSet$Layout0.t = constraintLayout$LayoutParams0.o;
            constraintSet$Layout0.u = constraintLayout$LayoutParams0.s;
            constraintSet$Layout0.v = constraintLayout$LayoutParams0.t;
            constraintSet$Layout0.w = constraintLayout$LayoutParams0.u;
            constraintSet$Layout0.x = constraintLayout$LayoutParams0.v;
            constraintSet$Layout0.y = constraintLayout$LayoutParams0.G;
            constraintSet$Layout0.z = constraintLayout$LayoutParams0.H;
            constraintSet$Layout0.A = constraintLayout$LayoutParams0.I;
            constraintSet$Layout0.B = constraintLayout$LayoutParams0.p;
            constraintSet$Layout0.C = constraintLayout$LayoutParams0.q;
            constraintSet$Layout0.D = constraintLayout$LayoutParams0.r;
            constraintSet$Layout0.E = constraintLayout$LayoutParams0.X;
            constraintSet$Layout0.F = constraintLayout$LayoutParams0.Y;
            constraintSet$Layout0.G = constraintLayout$LayoutParams0.Z;
            constraintSet$Layout0.h = constraintLayout$LayoutParams0.c;
            constraintSet$Layout0.f = constraintLayout$LayoutParams0.a;
            constraintSet$Layout0.g = constraintLayout$LayoutParams0.b;
            constraintSet$Layout0.d = constraintLayout$LayoutParams0.width;
            constraintSet$Layout0.e = constraintLayout$LayoutParams0.height;
            constraintSet$Layout0.H = constraintLayout$LayoutParams0.leftMargin;
            constraintSet$Layout0.I = constraintLayout$LayoutParams0.rightMargin;
            constraintSet$Layout0.J = constraintLayout$LayoutParams0.topMargin;
            constraintSet$Layout0.K = constraintLayout$LayoutParams0.bottomMargin;
            constraintSet$Layout0.N = constraintLayout$LayoutParams0.D;
            constraintSet$Layout0.V = constraintLayout$LayoutParams0.M;
            constraintSet$Layout0.W = constraintLayout$LayoutParams0.L;
            constraintSet$Layout0.Y = constraintLayout$LayoutParams0.O;
            constraintSet$Layout0.X = constraintLayout$LayoutParams0.N;
            constraintSet$Layout0.n0 = constraintLayout$LayoutParams0.a0;
            constraintSet$Layout0.o0 = constraintLayout$LayoutParams0.b0;
            constraintSet$Layout0.Z = constraintLayout$LayoutParams0.P;
            constraintSet$Layout0.a0 = constraintLayout$LayoutParams0.Q;
            constraintSet$Layout0.b0 = constraintLayout$LayoutParams0.T;
            constraintSet$Layout0.c0 = constraintLayout$LayoutParams0.U;
            constraintSet$Layout0.d0 = constraintLayout$LayoutParams0.R;
            constraintSet$Layout0.e0 = constraintLayout$LayoutParams0.S;
            constraintSet$Layout0.f0 = constraintLayout$LayoutParams0.V;
            constraintSet$Layout0.g0 = constraintLayout$LayoutParams0.W;
            constraintSet$Layout0.m0 = constraintLayout$LayoutParams0.c0;
            constraintSet$Layout0.P = constraintLayout$LayoutParams0.x;
            constraintSet$Layout0.R = constraintLayout$LayoutParams0.z;
            constraintSet$Layout0.O = constraintLayout$LayoutParams0.w;
            constraintSet$Layout0.Q = constraintLayout$LayoutParams0.y;
            constraintSet$Layout0.T = constraintLayout$LayoutParams0.A;
            constraintSet$Layout0.S = constraintLayout$LayoutParams0.B;
            constraintSet$Layout0.U = constraintLayout$LayoutParams0.C;
            constraintSet$Layout0.q0 = constraintLayout$LayoutParams0.d0;
            constraintSet$Layout0.L = constraintLayout$LayoutParams0.getMarginEnd();
            this.e.M = constraintLayout$LayoutParams0.getMarginStart();
        }

        private void l(int v, androidx.constraintlayout.widget.Constraints.LayoutParams constraints$LayoutParams0) {
            this.k(v, constraints$LayoutParams0);
            this.c.d = constraints$LayoutParams0.V0;
            this.f.b = constraints$LayoutParams0.Y0;
            this.f.c = constraints$LayoutParams0.Z0;
            this.f.d = constraints$LayoutParams0.a1;
            this.f.e = constraints$LayoutParams0.b1;
            this.f.f = constraints$LayoutParams0.c1;
            this.f.g = constraints$LayoutParams0.d1;
            this.f.h = constraints$LayoutParams0.e1;
            this.f.j = constraints$LayoutParams0.f1;
            this.f.k = constraints$LayoutParams0.g1;
            this.f.l = constraints$LayoutParams0.h1;
            this.f.n = constraints$LayoutParams0.X0;
            this.f.m = constraints$LayoutParams0.W0;
        }

        private void m(ConstraintHelper constraintHelper0, int v, androidx.constraintlayout.widget.Constraints.LayoutParams constraints$LayoutParams0) {
            this.l(v, constraints$LayoutParams0);
            if(constraintHelper0 instanceof Barrier) {
                this.e.j0 = 1;
                this.e.h0 = ((Barrier)constraintHelper0).getType();
                this.e.k0 = ((Barrier)constraintHelper0).getReferencedIds();
                this.e.i0 = ((Barrier)constraintHelper0).getMargin();
            }
        }

        private ConstraintAttribute n(String s, AttributeType constraintAttribute$AttributeType0) {
            if(this.g.containsKey(s)) {
                ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)this.g.get(s);
                if(constraintAttribute0.j() != constraintAttribute$AttributeType0) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute0.j().name());
                }
                return constraintAttribute0;
            }
            ConstraintAttribute constraintAttribute1 = new ConstraintAttribute(s, constraintAttribute$AttributeType0);
            this.g.put(s, constraintAttribute1);
            return constraintAttribute1;
        }

        public void o(String s) {
            Delta constraintSet$Constraint$Delta0 = this.h;
            if(constraintSet$Constraint$Delta0 != null) {
                constraintSet$Constraint$Delta0.f(s);
                return;
            }
            Log.v(s, "DELTA IS NULL");
        }

        private void p(String s, int v) {
            this.n(s, AttributeType.c).s(v);
        }

        private void q(String s, float f) {
            this.n(s, AttributeType.b).t(f);
        }

        private void r(String s, int v) {
            this.n(s, AttributeType.a).u(v);
        }

        private void s(String s, String s1) {
            this.n(s, AttributeType.e).v(s1);
        }
    }

    public static class Layout {
        public String A;
        private static final int A0 = 7;
        private static final int A1 = 82;
        public int B;
        private static final int B0 = 8;
        private static final int B1 = 83;
        public int C;
        private static final int C0 = 9;
        private static final int C1 = 84;
        public float D;
        private static final int D0 = 10;
        private static final int D1 = 85;
        public int E;
        private static final int E0 = 11;
        private static final int E1 = 86;
        public int F;
        private static final int F0 = 12;
        private static final int F1 = 87;
        public int G;
        private static final int G0 = 13;
        private static final int G1 = 88;
        public int H;
        private static final int H0 = 14;
        private static final int H1 = 89;
        public int I;
        private static final int I0 = 15;
        private static final int I1 = 90;
        public int J;
        private static final int J0 = 16;
        private static final int J1 = 91;
        public int K;
        private static final int K0 = 17;
        public int L;
        private static final int L0 = 18;
        public int M;
        private static final int M0 = 19;
        public int N;
        private static final int N0 = 20;
        public int O;
        private static final int O0 = 21;
        public int P;
        private static final int P0 = 22;
        public int Q;
        private static final int Q0 = 23;
        public int R;
        private static final int R0 = 24;
        public int S;
        private static final int S0 = 25;
        public int T;
        private static final int T0 = 26;
        public int U;
        private static final int U0 = 27;
        public float V;
        private static final int V0 = 28;
        public float W;
        private static final int W0 = 29;
        public int X;
        private static final int X0 = 30;
        public int Y;
        private static final int Y0 = 0x1F;
        public int Z;
        private static final int Z0 = 0x20;
        public boolean a;
        public int a0;
        private static final int a1 = 33;
        public boolean b;
        public int b0;
        private static final int b1 = 34;
        public boolean c;
        public int c0;
        private static final int c1 = 35;
        public int d;
        public int d0;
        private static final int d1 = 36;
        public int e;
        public int e0;
        private static final int e1 = 37;
        public int f;
        public float f0;
        private static final int f1 = 38;
        public int g;
        public float g0;
        private static final int g1 = 39;
        public float h;
        public int h0;
        private static final int h1 = 40;
        public boolean i;
        public int i0;
        private static final int i1 = 41;
        public int j;
        public int j0;
        private static final int j1 = 42;
        public int k;
        public int[] k0;
        private static final int k1 = 61;
        public int l;
        public String l0;
        private static final int l1 = 62;
        public int m;
        public String m0;
        private static final int m1 = 0x3F;
        public int n;
        public boolean n0;
        private static final int n1 = 69;
        public int o;
        public boolean o0;
        private static final int o1 = 70;
        public int p;
        public boolean p0;
        private static final int p1 = 71;
        public int q;
        public int q0;
        private static final int q1 = 72;
        public int r;
        public static final int r0 = -1;
        private static final int r1 = 73;
        public int s;
        public static final int s0 = 0x80000000;
        private static final int s1 = 74;
        public int t;
        private static SparseIntArray t0 = null;
        private static final int t1 = 75;
        public int u;
        private static final int u0 = 1;
        private static final int u1 = 76;
        public int v;
        private static final int v0 = 2;
        private static final int v1 = 77;
        public int w;
        private static final int w0 = 3;
        private static final int w1 = 78;
        public int x;
        private static final int x0 = 4;
        private static final int x1 = 0x4F;
        public float y;
        private static final int y0 = 5;
        private static final int y1 = 80;
        public float z;
        private static final int z0 = 6;
        private static final int z1 = 81;

        static {
            SparseIntArray sparseIntArray0 = new SparseIntArray();
            Layout.t0 = sparseIntArray0;
            sparseIntArray0.append(styleable.Layout_layout_constraintLeft_toLeftOf, 24);
            Layout.t0.append(styleable.Layout_layout_constraintLeft_toRightOf, 25);
            Layout.t0.append(styleable.Layout_layout_constraintRight_toLeftOf, 28);
            Layout.t0.append(styleable.Layout_layout_constraintRight_toRightOf, 29);
            Layout.t0.append(styleable.Layout_layout_constraintTop_toTopOf, 35);
            Layout.t0.append(styleable.Layout_layout_constraintTop_toBottomOf, 34);
            Layout.t0.append(styleable.Layout_layout_constraintBottom_toTopOf, 4);
            Layout.t0.append(styleable.Layout_layout_constraintBottom_toBottomOf, 3);
            Layout.t0.append(styleable.Layout_layout_constraintBaseline_toBaselineOf, 1);
            Layout.t0.append(styleable.Layout_layout_editor_absoluteX, 6);
            Layout.t0.append(styleable.Layout_layout_editor_absoluteY, 7);
            Layout.t0.append(styleable.Layout_layout_constraintGuide_begin, 17);
            Layout.t0.append(styleable.Layout_layout_constraintGuide_end, 18);
            Layout.t0.append(styleable.Layout_layout_constraintGuide_percent, 19);
            Layout.t0.append(styleable.Layout_guidelineUseRtl, 90);
            Layout.t0.append(styleable.Layout_android_orientation, 26);
            Layout.t0.append(styleable.Layout_layout_constraintStart_toEndOf, 0x1F);
            Layout.t0.append(styleable.Layout_layout_constraintStart_toStartOf, 0x20);
            Layout.t0.append(styleable.Layout_layout_constraintEnd_toStartOf, 10);
            Layout.t0.append(styleable.Layout_layout_constraintEnd_toEndOf, 9);
            Layout.t0.append(styleable.Layout_layout_goneMarginLeft, 13);
            Layout.t0.append(styleable.Layout_layout_goneMarginTop, 16);
            Layout.t0.append(styleable.Layout_layout_goneMarginRight, 14);
            Layout.t0.append(styleable.Layout_layout_goneMarginBottom, 11);
            Layout.t0.append(styleable.Layout_layout_goneMarginStart, 15);
            Layout.t0.append(styleable.Layout_layout_goneMarginEnd, 12);
            Layout.t0.append(styleable.Layout_layout_constraintVertical_weight, 38);
            Layout.t0.append(styleable.Layout_layout_constraintHorizontal_weight, 37);
            Layout.t0.append(styleable.Layout_layout_constraintHorizontal_chainStyle, 39);
            Layout.t0.append(styleable.Layout_layout_constraintVertical_chainStyle, 40);
            Layout.t0.append(styleable.Layout_layout_constraintHorizontal_bias, 20);
            Layout.t0.append(styleable.Layout_layout_constraintVertical_bias, 36);
            Layout.t0.append(styleable.Layout_layout_constraintDimensionRatio, 5);
            Layout.t0.append(styleable.Layout_layout_constraintLeft_creator, 91);
            Layout.t0.append(styleable.Layout_layout_constraintTop_creator, 91);
            Layout.t0.append(styleable.Layout_layout_constraintRight_creator, 91);
            Layout.t0.append(styleable.Layout_layout_constraintBottom_creator, 91);
            Layout.t0.append(styleable.Layout_layout_constraintBaseline_creator, 91);
            Layout.t0.append(styleable.Layout_android_layout_marginLeft, 23);
            Layout.t0.append(styleable.Layout_android_layout_marginRight, 27);
            Layout.t0.append(styleable.Layout_android_layout_marginStart, 30);
            Layout.t0.append(styleable.Layout_android_layout_marginEnd, 8);
            Layout.t0.append(styleable.Layout_android_layout_marginTop, 33);
            Layout.t0.append(styleable.Layout_android_layout_marginBottom, 2);
            Layout.t0.append(styleable.Layout_android_layout_width, 22);
            Layout.t0.append(styleable.Layout_android_layout_height, 21);
            Layout.t0.append(styleable.Layout_layout_constraintWidth, 41);
            Layout.t0.append(styleable.Layout_layout_constraintHeight, 42);
            Layout.t0.append(styleable.Layout_layout_constrainedWidth, 87);
            Layout.t0.append(styleable.Layout_layout_constrainedHeight, 88);
            Layout.t0.append(styleable.Layout_layout_wrapBehaviorInParent, 76);
            Layout.t0.append(styleable.Layout_layout_constraintCircle, 61);
            Layout.t0.append(styleable.Layout_layout_constraintCircleRadius, 62);
            Layout.t0.append(styleable.Layout_layout_constraintCircleAngle, 0x3F);
            Layout.t0.append(styleable.Layout_layout_constraintWidth_percent, 69);
            Layout.t0.append(styleable.Layout_layout_constraintHeight_percent, 70);
            Layout.t0.append(styleable.Layout_chainUseRtl, 71);
            Layout.t0.append(styleable.Layout_barrierDirection, 72);
            Layout.t0.append(styleable.Layout_barrierMargin, 73);
            Layout.t0.append(styleable.Layout_constraint_referenced_ids, 74);
            Layout.t0.append(styleable.Layout_barrierAllowsGoneWidgets, 75);
            Layout.t0.append(styleable.Layout_layout_constraintWidth_max, 84);
            Layout.t0.append(styleable.Layout_layout_constraintWidth_min, 86);
            Layout.t0.append(styleable.Layout_layout_constraintWidth_max, 83);
            Layout.t0.append(styleable.Layout_layout_constraintHeight_min, 85);
            Layout.t0.append(styleable.Layout_layout_constraintWidth, 87);
            Layout.t0.append(styleable.Layout_layout_constraintHeight, 88);
            Layout.t0.append(styleable.ConstraintLayout_Layout_layout_constraintTag, 89);
            Layout.t0.append(styleable.Layout_guidelineUseRtl, 90);
        }

        public Layout() {
            this.a = false;
            this.b = false;
            this.c = false;
            this.f = -1;
            this.g = -1;
            this.h = -1.0f;
            this.i = true;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = 0.5f;
            this.z = 0.5f;
            this.A = null;
            this.B = -1;
            this.C = 0;
            this.D = 0.0f;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0x80000000;
            this.P = 0x80000000;
            this.Q = 0x80000000;
            this.R = 0x80000000;
            this.S = 0x80000000;
            this.T = 0x80000000;
            this.U = 0x80000000;
            this.V = -1.0f;
            this.W = -1.0f;
            this.X = 0;
            this.Y = 0;
            this.Z = 0;
            this.a0 = 0;
            this.b0 = 0;
            this.c0 = 0;
            this.d0 = 0;
            this.e0 = 0;
            this.f0 = 1.0f;
            this.g0 = 1.0f;
            this.h0 = -1;
            this.i0 = 0;
            this.j0 = -1;
            this.n0 = false;
            this.o0 = false;
            this.p0 = true;
            this.q0 = 0;
        }

        public void a(Layout constraintSet$Layout0) {
            this.a = constraintSet$Layout0.a;
            this.d = constraintSet$Layout0.d;
            this.b = constraintSet$Layout0.b;
            this.e = constraintSet$Layout0.e;
            this.f = constraintSet$Layout0.f;
            this.g = constraintSet$Layout0.g;
            this.h = constraintSet$Layout0.h;
            this.i = constraintSet$Layout0.i;
            this.j = constraintSet$Layout0.j;
            this.k = constraintSet$Layout0.k;
            this.l = constraintSet$Layout0.l;
            this.m = constraintSet$Layout0.m;
            this.n = constraintSet$Layout0.n;
            this.o = constraintSet$Layout0.o;
            this.p = constraintSet$Layout0.p;
            this.q = constraintSet$Layout0.q;
            this.r = constraintSet$Layout0.r;
            this.s = constraintSet$Layout0.s;
            this.t = constraintSet$Layout0.t;
            this.u = constraintSet$Layout0.u;
            this.v = constraintSet$Layout0.v;
            this.w = constraintSet$Layout0.w;
            this.x = constraintSet$Layout0.x;
            this.y = constraintSet$Layout0.y;
            this.z = constraintSet$Layout0.z;
            this.A = constraintSet$Layout0.A;
            this.B = constraintSet$Layout0.B;
            this.C = constraintSet$Layout0.C;
            this.D = constraintSet$Layout0.D;
            this.E = constraintSet$Layout0.E;
            this.F = constraintSet$Layout0.F;
            this.G = constraintSet$Layout0.G;
            this.H = constraintSet$Layout0.H;
            this.I = constraintSet$Layout0.I;
            this.J = constraintSet$Layout0.J;
            this.K = constraintSet$Layout0.K;
            this.L = constraintSet$Layout0.L;
            this.M = constraintSet$Layout0.M;
            this.N = constraintSet$Layout0.N;
            this.O = constraintSet$Layout0.O;
            this.P = constraintSet$Layout0.P;
            this.Q = constraintSet$Layout0.Q;
            this.R = constraintSet$Layout0.R;
            this.S = constraintSet$Layout0.S;
            this.T = constraintSet$Layout0.T;
            this.U = constraintSet$Layout0.U;
            this.V = constraintSet$Layout0.V;
            this.W = constraintSet$Layout0.W;
            this.X = constraintSet$Layout0.X;
            this.Y = constraintSet$Layout0.Y;
            this.Z = constraintSet$Layout0.Z;
            this.a0 = constraintSet$Layout0.a0;
            this.b0 = constraintSet$Layout0.b0;
            this.c0 = constraintSet$Layout0.c0;
            this.d0 = constraintSet$Layout0.d0;
            this.e0 = constraintSet$Layout0.e0;
            this.f0 = constraintSet$Layout0.f0;
            this.g0 = constraintSet$Layout0.g0;
            this.h0 = constraintSet$Layout0.h0;
            this.i0 = constraintSet$Layout0.i0;
            this.j0 = constraintSet$Layout0.j0;
            this.m0 = constraintSet$Layout0.m0;
            int[] arr_v = constraintSet$Layout0.k0;
            this.k0 = arr_v == null || constraintSet$Layout0.l0 != null ? null : Arrays.copyOf(arr_v, arr_v.length);
            this.l0 = constraintSet$Layout0.l0;
            this.n0 = constraintSet$Layout0.n0;
            this.o0 = constraintSet$Layout0.o0;
            this.p0 = constraintSet$Layout0.p0;
            this.q0 = constraintSet$Layout0.q0;
        }

        public void b(MotionScene motionScene0, StringBuilder stringBuilder0) {
            Field[] arr_field = this.getClass().getDeclaredFields();
            stringBuilder0.append("\n");
            for(int v = 0; v < arr_field.length; ++v) {
                Field field0 = arr_field[v];
                String s = field0.getName();
                if(!Modifier.isStatic(field0.getModifiers())) {
                    try {
                        Object object0 = field0.get(this);
                        Class class0 = field0.getType();
                        if(class0 == Integer.TYPE) {
                            Integer integer0 = (Integer)object0;
                            if(((int)integer0) != -1) {
                                String s1 = motionScene0.Y(((int)integer0));
                                stringBuilder0.append("    ");
                                stringBuilder0.append(s);
                                stringBuilder0.append(" = \"");
                                if(s1 != null) {
                                    integer0 = s1;
                                }
                                stringBuilder0.append(integer0);
                                stringBuilder0.append("\"\n");
                            }
                        }
                        else if(class0 == Float.TYPE && ((float)(((Float)object0))) != -1.0f) {
                            stringBuilder0.append("    ");
                            stringBuilder0.append(s);
                            stringBuilder0.append(" = \"");
                            stringBuilder0.append(((Float)object0));
                            stringBuilder0.append("\"\n");
                        }
                        continue;
                    }
                    catch(IllegalAccessException illegalAccessException0) {
                    }
                    Log.e("ConstraintSet", "Error accessing ConstraintSet field", illegalAccessException0);
                }
            }
        }

        void c(Context context0, AttributeSet attributeSet0) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.Layout);
            this.b = true;
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                switch(Layout.t0.get(v2)) {
                    case 1: {
                        this.r = ConstraintSet.A0(typedArray0, v2, this.r);
                        break;
                    }
                    case 2: {
                        this.K = typedArray0.getDimensionPixelSize(v2, this.K);
                        break;
                    }
                    case 3: {
                        this.q = ConstraintSet.A0(typedArray0, v2, this.q);
                        break;
                    }
                    case 4: {
                        this.p = ConstraintSet.A0(typedArray0, v2, this.p);
                        break;
                    }
                    case 5: {
                        this.A = typedArray0.getString(v2);
                        break;
                    }
                    case 6: {
                        this.E = typedArray0.getDimensionPixelOffset(v2, this.E);
                        break;
                    }
                    case 7: {
                        this.F = typedArray0.getDimensionPixelOffset(v2, this.F);
                        break;
                    }
                    case 8: {
                        this.L = typedArray0.getDimensionPixelSize(v2, this.L);
                        break;
                    }
                    case 9: {
                        this.x = ConstraintSet.A0(typedArray0, v2, this.x);
                        break;
                    }
                    case 10: {
                        this.w = ConstraintSet.A0(typedArray0, v2, this.w);
                        break;
                    }
                    case 11: {
                        this.R = typedArray0.getDimensionPixelSize(v2, this.R);
                        break;
                    }
                    case 12: {
                        this.S = typedArray0.getDimensionPixelSize(v2, this.S);
                        break;
                    }
                    case 13: {
                        this.O = typedArray0.getDimensionPixelSize(v2, this.O);
                        break;
                    }
                    case 14: {
                        this.Q = typedArray0.getDimensionPixelSize(v2, this.Q);
                        break;
                    }
                    case 15: {
                        this.T = typedArray0.getDimensionPixelSize(v2, this.T);
                        break;
                    }
                    case 16: {
                        this.P = typedArray0.getDimensionPixelSize(v2, this.P);
                        break;
                    }
                    case 17: {
                        this.f = typedArray0.getDimensionPixelOffset(v2, this.f);
                        break;
                    }
                    case 18: {
                        this.g = typedArray0.getDimensionPixelOffset(v2, this.g);
                        break;
                    }
                    case 19: {
                        this.h = typedArray0.getFloat(v2, this.h);
                        break;
                    }
                    case 20: {
                        this.y = typedArray0.getFloat(v2, this.y);
                        break;
                    }
                    case 21: {
                        this.e = typedArray0.getLayoutDimension(v2, this.e);
                        break;
                    }
                    case 22: {
                        this.d = typedArray0.getLayoutDimension(v2, this.d);
                        break;
                    }
                    case 23: {
                        this.H = typedArray0.getDimensionPixelSize(v2, this.H);
                        break;
                    }
                    case 24: {
                        this.j = ConstraintSet.A0(typedArray0, v2, this.j);
                        break;
                    }
                    case 25: {
                        this.k = ConstraintSet.A0(typedArray0, v2, this.k);
                        break;
                    }
                    case 26: {
                        this.G = typedArray0.getInt(v2, this.G);
                        break;
                    }
                    case 27: {
                        this.I = typedArray0.getDimensionPixelSize(v2, this.I);
                        break;
                    }
                    case 28: {
                        this.l = ConstraintSet.A0(typedArray0, v2, this.l);
                        break;
                    }
                    case 29: {
                        this.m = ConstraintSet.A0(typedArray0, v2, this.m);
                        break;
                    }
                    case 30: {
                        this.M = typedArray0.getDimensionPixelSize(v2, this.M);
                        break;
                    }
                    case 0x1F: {
                        this.u = ConstraintSet.A0(typedArray0, v2, this.u);
                        break;
                    }
                    case 0x20: {
                        this.v = ConstraintSet.A0(typedArray0, v2, this.v);
                        break;
                    }
                    case 33: {
                        this.J = typedArray0.getDimensionPixelSize(v2, this.J);
                        break;
                    }
                    case 34: {
                        this.o = ConstraintSet.A0(typedArray0, v2, this.o);
                        break;
                    }
                    case 35: {
                        this.n = ConstraintSet.A0(typedArray0, v2, this.n);
                        break;
                    }
                    case 36: {
                        this.z = typedArray0.getFloat(v2, this.z);
                        break;
                    }
                    case 37: {
                        this.W = typedArray0.getFloat(v2, this.W);
                        break;
                    }
                    case 38: {
                        this.V = typedArray0.getFloat(v2, this.V);
                        break;
                    }
                    case 39: {
                        this.X = typedArray0.getInt(v2, this.X);
                        break;
                    }
                    case 40: {
                        this.Y = typedArray0.getInt(v2, this.Y);
                        break;
                    }
                    case 41: {
                        ConstraintSet.D0(this, typedArray0, v2, 0);
                        break;
                    }
                    case 42: {
                        ConstraintSet.D0(this, typedArray0, v2, 1);
                        break;
                    }
                    case 61: {
                        this.B = ConstraintSet.A0(typedArray0, v2, this.B);
                        break;
                    }
                    case 62: {
                        this.C = typedArray0.getDimensionPixelSize(v2, this.C);
                        break;
                    }
                    case 0x3F: {
                        this.D = typedArray0.getFloat(v2, this.D);
                        break;
                    }
                    case 69: {
                        this.f0 = typedArray0.getFloat(v2, 1.0f);
                        break;
                    }
                    case 70: {
                        this.g0 = typedArray0.getFloat(v2, 1.0f);
                        break;
                    }
                    case 71: {
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    }
                    case 72: {
                        this.h0 = typedArray0.getInt(v2, this.h0);
                        break;
                    }
                    case 73: {
                        this.i0 = typedArray0.getDimensionPixelSize(v2, this.i0);
                        break;
                    }
                    case 74: {
                        this.l0 = typedArray0.getString(v2);
                        break;
                    }
                    case 75: {
                        this.p0 = typedArray0.getBoolean(v2, this.p0);
                        break;
                    }
                    case 76: {
                        this.q0 = typedArray0.getInt(v2, this.q0);
                        break;
                    }
                    case 77: {
                        this.s = ConstraintSet.A0(typedArray0, v2, this.s);
                        break;
                    }
                    case 78: {
                        this.t = ConstraintSet.A0(typedArray0, v2, this.t);
                        break;
                    }
                    case 0x4F: {
                        this.U = typedArray0.getDimensionPixelSize(v2, this.U);
                        break;
                    }
                    case 80: {
                        this.N = typedArray0.getDimensionPixelSize(v2, this.N);
                        break;
                    }
                    case 81: {
                        this.Z = typedArray0.getInt(v2, this.Z);
                        break;
                    }
                    case 82: {
                        this.a0 = typedArray0.getInt(v2, this.a0);
                        break;
                    }
                    case 83: {
                        this.c0 = typedArray0.getDimensionPixelSize(v2, this.c0);
                        break;
                    }
                    case 84: {
                        this.b0 = typedArray0.getDimensionPixelSize(v2, this.b0);
                        break;
                    }
                    case 85: {
                        this.e0 = typedArray0.getDimensionPixelSize(v2, this.e0);
                        break;
                    }
                    case 86: {
                        this.d0 = typedArray0.getDimensionPixelSize(v2, this.d0);
                        break;
                    }
                    case 87: {
                        this.n0 = typedArray0.getBoolean(v2, this.n0);
                        break;
                    }
                    case 88: {
                        this.o0 = typedArray0.getBoolean(v2, this.o0);
                        break;
                    }
                    case 89: {
                        this.m0 = typedArray0.getString(v2);
                        break;
                    }
                    case 90: {
                        this.i = typedArray0.getBoolean(v2, this.i);
                        break;
                    }
                    case 91: {
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(v2) + "   " + Layout.t0.get(v2));
                        break;
                    }
                    default: {
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(v2) + "   " + Layout.t0.get(v2));
                    }
                }
            }
            typedArray0.recycle();
        }
    }

    public static class Motion {
        private static final int A = 9;
        private static final int B = 10;
        public boolean a;
        public int b;
        public int c;
        public String d;
        public int e;
        public int f;
        public float g;
        public int h;
        public float i;
        public float j;
        public int k;
        public String l;
        public int m;
        public int n;
        private static final int o = -2;
        private static final int p = -1;
        private static final int q = -3;
        private static SparseIntArray r = null;
        private static final int s = 1;
        private static final int t = 2;
        private static final int u = 3;
        private static final int v = 4;
        private static final int w = 5;
        private static final int x = 6;
        private static final int y = 7;
        private static final int z = 8;

        static {
            SparseIntArray sparseIntArray0 = new SparseIntArray();
            Motion.r = sparseIntArray0;
            sparseIntArray0.append(styleable.Motion_motionPathRotate, 1);
            Motion.r.append(styleable.Motion_pathMotionArc, 2);
            Motion.r.append(styleable.Motion_transitionEasing, 3);
            Motion.r.append(styleable.Motion_drawPath, 4);
            Motion.r.append(styleable.Motion_animateRelativeTo, 5);
            Motion.r.append(styleable.Motion_animateCircleAngleTo, 6);
            Motion.r.append(styleable.Motion_motionStagger, 7);
            Motion.r.append(styleable.Motion_quantizeMotionSteps, 8);
            Motion.r.append(styleable.Motion_quantizeMotionPhase, 9);
            Motion.r.append(styleable.Motion_quantizeMotionInterpolator, 10);
        }

        public Motion() {
            this.a = false;
            this.b = -1;
            this.c = 0;
            this.d = null;
            this.e = -1;
            this.f = 0;
            this.g = NaNf;
            this.h = -1;
            this.i = NaNf;
            this.j = NaNf;
            this.k = -1;
            this.l = null;
            this.m = -3;
            this.n = -1;
        }

        public void a(Motion constraintSet$Motion0) {
            this.a = constraintSet$Motion0.a;
            this.b = constraintSet$Motion0.b;
            this.d = constraintSet$Motion0.d;
            this.e = constraintSet$Motion0.e;
            this.f = constraintSet$Motion0.f;
            this.i = constraintSet$Motion0.i;
            this.g = constraintSet$Motion0.g;
            this.h = constraintSet$Motion0.h;
        }

        void b(Context context0, AttributeSet attributeSet0) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.Motion);
            this.a = true;
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                switch(Motion.r.get(v2)) {
                    case 1: {
                        this.i = typedArray0.getFloat(v2, this.i);
                        break;
                    }
                    case 2: {
                        this.e = typedArray0.getInt(v2, this.e);
                        break;
                    }
                    case 3: {
                        if(typedArray0.peekValue(v2).type == 3) {
                            this.d = typedArray0.getString(v2);
                        }
                        else {
                            String[] arr_s = Easing.o;
                            this.d = arr_s[typedArray0.getInteger(v2, 0)];
                        }
                        break;
                    }
                    case 4: {
                        this.f = typedArray0.getInt(v2, 0);
                        break;
                    }
                    case 5: {
                        this.b = ConstraintSet.A0(typedArray0, v2, this.b);
                        break;
                    }
                    case 6: {
                        this.c = typedArray0.getInteger(v2, this.c);
                        break;
                    }
                    case 7: {
                        this.g = typedArray0.getFloat(v2, this.g);
                        break;
                    }
                    case 8: {
                        this.k = typedArray0.getInteger(v2, this.k);
                        break;
                    }
                    case 9: {
                        this.j = typedArray0.getFloat(v2, this.j);
                        break;
                    }
                    case 10: {
                        int v3 = typedArray0.peekValue(v2).type;
                        if(v3 == 1) {
                            int v4 = typedArray0.getResourceId(v2, -1);
                            this.n = v4;
                            if(v4 != -1) {
                                this.m = -2;
                            }
                        }
                        else if(v3 == 3) {
                            String s = typedArray0.getString(v2);
                            this.l = s;
                            if(s.indexOf("/") > 0) {
                                this.n = typedArray0.getResourceId(v2, -1);
                                this.m = -2;
                            }
                            else {
                                this.m = -1;
                            }
                        }
                        else {
                            this.m = typedArray0.getInteger(v2, this.n);
                        }
                    }
                }
            }
            typedArray0.recycle();
        }
    }

    public static class PropertySet {
        public boolean a;
        public int b;
        public int c;
        public float d;
        public float e;

        public PropertySet() {
            this.a = false;
            this.b = 0;
            this.c = 0;
            this.d = 1.0f;
            this.e = NaNf;
        }

        public void a(PropertySet constraintSet$PropertySet0) {
            this.a = constraintSet$PropertySet0.a;
            this.b = constraintSet$PropertySet0.b;
            this.d = constraintSet$PropertySet0.d;
            this.e = constraintSet$PropertySet0.e;
            this.c = constraintSet$PropertySet0.c;
        }

        void b(Context context0, AttributeSet attributeSet0) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.PropertySet);
            this.a = true;
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.PropertySet_android_alpha) {
                    this.d = typedArray0.getFloat(v2, this.d);
                }
                else if(v2 == styleable.PropertySet_android_visibility) {
                    this.b = typedArray0.getInt(v2, this.b);
                    this.b = ConstraintSet.V[this.b];
                }
                else if(v2 == styleable.PropertySet_visibilityMode) {
                    this.c = typedArray0.getInt(v2, this.c);
                }
                else if(v2 == styleable.PropertySet_motionProgress) {
                    this.e = typedArray0.getFloat(v2, this.e);
                }
            }
            typedArray0.recycle();
        }
    }

    public static class Transform {
        private static final int A = 12;
        public boolean a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public int i;
        public float j;
        public float k;
        public float l;
        public boolean m;
        public float n;
        private static SparseIntArray o = null;
        private static final int p = 1;
        private static final int q = 2;
        private static final int r = 3;
        private static final int s = 4;
        private static final int t = 5;
        private static final int u = 6;
        private static final int v = 7;
        private static final int w = 8;
        private static final int x = 9;
        private static final int y = 10;
        private static final int z = 11;

        static {
            SparseIntArray sparseIntArray0 = new SparseIntArray();
            Transform.o = sparseIntArray0;
            sparseIntArray0.append(styleable.Transform_android_rotation, 1);
            Transform.o.append(styleable.Transform_android_rotationX, 2);
            Transform.o.append(styleable.Transform_android_rotationY, 3);
            Transform.o.append(styleable.Transform_android_scaleX, 4);
            Transform.o.append(styleable.Transform_android_scaleY, 5);
            Transform.o.append(styleable.Transform_android_transformPivotX, 6);
            Transform.o.append(styleable.Transform_android_transformPivotY, 7);
            Transform.o.append(styleable.Transform_android_translationX, 8);
            Transform.o.append(styleable.Transform_android_translationY, 9);
            Transform.o.append(styleable.Transform_android_translationZ, 10);
            Transform.o.append(styleable.Transform_android_elevation, 11);
            Transform.o.append(styleable.Transform_transformPivotTarget, 12);
        }

        public Transform() {
            this.a = false;
            this.b = 0.0f;
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 1.0f;
            this.f = 1.0f;
            this.g = NaNf;
            this.h = NaNf;
            this.i = -1;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = false;
            this.n = 0.0f;
        }

        public void a(Transform constraintSet$Transform0) {
            this.a = constraintSet$Transform0.a;
            this.b = constraintSet$Transform0.b;
            this.c = constraintSet$Transform0.c;
            this.d = constraintSet$Transform0.d;
            this.e = constraintSet$Transform0.e;
            this.f = constraintSet$Transform0.f;
            this.g = constraintSet$Transform0.g;
            this.h = constraintSet$Transform0.h;
            this.i = constraintSet$Transform0.i;
            this.j = constraintSet$Transform0.j;
            this.k = constraintSet$Transform0.k;
            this.l = constraintSet$Transform0.l;
            this.m = constraintSet$Transform0.m;
            this.n = constraintSet$Transform0.n;
        }

        void b(Context context0, AttributeSet attributeSet0) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.Transform);
            this.a = true;
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                switch(Transform.o.get(v2)) {
                    case 1: {
                        this.b = typedArray0.getFloat(v2, this.b);
                        break;
                    }
                    case 2: {
                        this.c = typedArray0.getFloat(v2, this.c);
                        break;
                    }
                    case 3: {
                        this.d = typedArray0.getFloat(v2, this.d);
                        break;
                    }
                    case 4: {
                        this.e = typedArray0.getFloat(v2, this.e);
                        break;
                    }
                    case 5: {
                        this.f = typedArray0.getFloat(v2, this.f);
                        break;
                    }
                    case 6: {
                        this.g = typedArray0.getDimension(v2, this.g);
                        break;
                    }
                    case 7: {
                        this.h = typedArray0.getDimension(v2, this.h);
                        break;
                    }
                    case 8: {
                        this.j = typedArray0.getDimension(v2, this.j);
                        break;
                    }
                    case 9: {
                        this.k = typedArray0.getDimension(v2, this.k);
                        break;
                    }
                    case 10: {
                        this.l = typedArray0.getDimension(v2, this.l);
                        break;
                    }
                    case 11: {
                        this.m = true;
                        this.n = typedArray0.getDimension(v2, this.n);
                        break;
                    }
                    case 12: {
                        this.i = ConstraintSet.A0(typedArray0, v2, this.i);
                    }
                }
            }
            typedArray0.recycle();
        }
    }

    class WriteJsonEngine {
        Writer a;
        ConstraintLayout b;
        Context c;
        int d;
        int e;
        final String f;
        final String g;
        final String h;
        final String i;
        final String j;
        final String k;
        final String l;
        HashMap m;
        final ConstraintSet n;
        private static final String o = "       ";

        WriteJsonEngine(Writer writer0, ConstraintLayout constraintLayout0, int v) throws IOException {
            this.e = 0;
            this.f = "\'left\'";
            this.g = "\'right\'";
            this.h = "\'baseline\'";
            this.i = "\'bottom\'";
            this.j = "\'top\'";
            this.k = "\'start\'";
            this.l = "\'end\'";
            this.m = new HashMap();
            this.a = writer0;
            this.b = constraintLayout0;
            this.c = constraintLayout0.getContext();
            this.d = v;
        }

        String a(int v) {
            if(this.m.containsKey(v)) {
                return "\'" + ((String)this.m.get(v)) + "\'";
            }
            if(v == 0) {
                return "\'parent\'";
            }
            String s = this.b(v);
            this.m.put(v, s);
            return "\'" + s + "\'";
        }

        String b(int v) {
            try {
                if(v != -1) {
                    return this.c.getResources().getResourceEntryName(v);
                }
                int v1 = this.e + 1;
                this.e = v1;
                return "unknown" + v1;
            }
            catch(Exception unused_ex) {
                int v2 = this.e + 1;
                this.e = v2;
                return "unknown" + v2;
            }
        }

        void c(int v, float f, int v1) throws IOException {
            if(v == -1) {
                return;
            }
            this.a.write("       circle");
            this.a.write(":[");
            this.a.write(this.a(v));
            this.a.write(", " + f);
            this.a.write(v1 + "]");
        }

        void d(String s, int v, String s1, int v1, int v2) throws IOException {
            if(v == -1) {
                return;
            }
            this.a.write("       " + s);
            this.a.write(":[");
            this.a.write(this.a(v));
            this.a.write(" , ");
            this.a.write(s1);
            if(v1 != 0) {
                this.a.write(" , " + v1);
            }
            this.a.write("],\n");
        }

        private void e(String s, int v, int v1, float f, int v2, int v3, boolean z) throws IOException {
            switch(v) {
                case -2: {
                    this.a.write("       " + s + ": \'wrap\'\n");
                    return;
                }
                case -1: {
                    this.a.write("       " + s + ": \'parent\'\n");
                    return;
                }
                case 0: {
                    if(v3 == -1 && v2 == -1) {
                        switch(v1) {
                            case 1: {
                                this.a.write("       " + s + ": \'???????????\',\n");
                                return;
                            }
                            case 2: {
                                this.a.write("       " + s + ": \'" + f + "%\',\n");
                                return;
                            }
                            default: {
                                return;
                            }
                        }
                    }
                    switch(v1) {
                        case 0: {
                            this.a.write("       " + s + ": {\'spread\' ," + v2 + ", " + v3 + "}\n");
                            return;
                        }
                        case 1: {
                            this.a.write("       " + s + ": {\'wrap\' ," + v2 + ", " + v3 + "}\n");
                            return;
                        }
                        case 2: {
                            this.a.write("       " + s + ": {\'" + f + "\'% ," + v2 + ", " + v3 + "}\n");
                            return;
                        }
                        default: {
                            return;
                        }
                    }
                }
                default: {
                    this.a.write("       " + s + ": " + v + ",\n");
                }
            }
        }

        private void f(int v, int v1, int v2, float f) throws IOException {
            this.j("\'orientation\'", v);
            this.j("\'guideBegin\'", v1);
            this.j("\'guideEnd\'", v2);
            this.h("\'guidePercent\'", f);
        }

        void g() throws IOException {
            this.a.write("\n\'ConstraintSet\':{\n");
            for(Object object0: ConstraintSet.this.h.keySet()) {
                Constraint constraintSet$Constraint0 = (Constraint)ConstraintSet.this.h.get(((Integer)object0));
                String s = this.a(((int)(((Integer)object0))));
                this.a.write(s + ":{\n");
                Layout constraintSet$Layout0 = constraintSet$Constraint0.e;
                this.e("height", constraintSet$Layout0.e, constraintSet$Layout0.a0, constraintSet$Layout0.g0, constraintSet$Layout0.e0, constraintSet$Layout0.c0, constraintSet$Layout0.o0);
                this.e("width", constraintSet$Layout0.d, constraintSet$Layout0.Z, constraintSet$Layout0.f0, constraintSet$Layout0.d0, constraintSet$Layout0.b0, constraintSet$Layout0.n0);
                this.d("\'left\'", constraintSet$Layout0.j, "\'left\'", constraintSet$Layout0.H, constraintSet$Layout0.O);
                this.d("\'left\'", constraintSet$Layout0.k, "\'right\'", constraintSet$Layout0.H, constraintSet$Layout0.O);
                this.d("\'right\'", constraintSet$Layout0.l, "\'left\'", constraintSet$Layout0.I, constraintSet$Layout0.Q);
                this.d("\'right\'", constraintSet$Layout0.m, "\'right\'", constraintSet$Layout0.I, constraintSet$Layout0.Q);
                this.d("\'baseline\'", constraintSet$Layout0.r, "\'baseline\'", -1, constraintSet$Layout0.U);
                this.d("\'baseline\'", constraintSet$Layout0.s, "\'top\'", -1, constraintSet$Layout0.U);
                this.d("\'baseline\'", constraintSet$Layout0.t, "\'bottom\'", -1, constraintSet$Layout0.U);
                this.d("\'top\'", constraintSet$Layout0.o, "\'bottom\'", constraintSet$Layout0.J, constraintSet$Layout0.P);
                this.d("\'top\'", constraintSet$Layout0.n, "\'top\'", constraintSet$Layout0.J, constraintSet$Layout0.P);
                this.d("\'bottom\'", constraintSet$Layout0.q, "\'bottom\'", constraintSet$Layout0.K, constraintSet$Layout0.R);
                this.d("\'bottom\'", constraintSet$Layout0.p, "\'top\'", constraintSet$Layout0.K, constraintSet$Layout0.R);
                this.d("\'start\'", constraintSet$Layout0.v, "\'start\'", constraintSet$Layout0.M, constraintSet$Layout0.T);
                this.d("\'start\'", constraintSet$Layout0.u, "\'end\'", constraintSet$Layout0.M, constraintSet$Layout0.T);
                this.d("\'end\'", constraintSet$Layout0.w, "\'start\'", constraintSet$Layout0.L, constraintSet$Layout0.S);
                this.d("\'end\'", constraintSet$Layout0.x, "\'end\'", constraintSet$Layout0.L, constraintSet$Layout0.S);
                this.i("\'horizontalBias\'", constraintSet$Layout0.y, 0.5f);
                this.i("\'verticalBias\'", constraintSet$Layout0.z, 0.5f);
                this.c(constraintSet$Layout0.B, constraintSet$Layout0.D, constraintSet$Layout0.C);
                this.f(constraintSet$Layout0.G, constraintSet$Layout0.f, constraintSet$Layout0.g, constraintSet$Layout0.h);
                this.k("\'dimensionRatio\'", constraintSet$Layout0.A);
                this.j("\'barrierMargin\'", constraintSet$Layout0.i0);
                this.j("\'type\'", constraintSet$Layout0.j0);
                this.k("\'ReferenceId\'", constraintSet$Layout0.l0);
                this.m("\'mBarrierAllowsGoneWidgets\'", constraintSet$Layout0.p0, true);
                this.j("\'WrapBehavior\'", constraintSet$Layout0.q0);
                this.h("\'verticalWeight\'", constraintSet$Layout0.V);
                this.h("\'horizontalWeight\'", constraintSet$Layout0.W);
                this.j("\'horizontalChainStyle\'", constraintSet$Layout0.X);
                this.j("\'verticalChainStyle\'", constraintSet$Layout0.Y);
                this.j("\'barrierDirection\'", constraintSet$Layout0.h0);
                int[] arr_v = constraintSet$Layout0.k0;
                if(arr_v != null) {
                    this.n("\'ReferenceIds\'", arr_v);
                }
                this.a.write("}\n");
            }
            this.a.write("}\n");
        }

        void h(String s, float f) throws IOException {
            if(f == -1.0f) {
                return;
            }
            this.a.write("       " + s);
            this.a.write(": " + f);
            this.a.write(",\n");
        }

        void i(String s, float f, float f1) throws IOException {
            if(f == f1) {
                return;
            }
            this.a.write("       " + s);
            this.a.write(": " + f);
            this.a.write(",\n");
        }

        void j(String s, int v) throws IOException {
            if(v != -1 && v != 0) {
                this.a.write("       " + s);
                this.a.write(":");
                this.a.write(", " + v);
                this.a.write("\n");
            }
        }

        void k(String s, String s1) throws IOException {
            if(s1 == null) {
                return;
            }
            this.a.write("       " + s);
            this.a.write(":");
            this.a.write(", " + s1);
            this.a.write("\n");
        }

        void l(String s, boolean z) throws IOException {
            if(!z) {
                return;
            }
            this.a.write("       " + s);
            this.a.write(": " + true);
            this.a.write(",\n");
        }

        void m(String s, boolean z, boolean z1) throws IOException {
            if(z == z1) {
                return;
            }
            this.a.write("       " + s);
            this.a.write(": " + z);
            this.a.write(",\n");
        }

        void n(String s, int[] arr_v) throws IOException {
            if(arr_v == null) {
                return;
            }
            this.a.write("       " + s);
            this.a.write(": ");
            for(int v = 0; v < arr_v.length; ++v) {
                this.a.write((v == 0 ? "[" : ", ") + this.a(arr_v[v]));
            }
            this.a.write("],\n");
        }
    }

    class WriteXmlEngine {
        Writer a;
        ConstraintLayout b;
        Context c;
        int d;
        int e;
        final String f;
        final String g;
        final String h;
        final String i;
        final String j;
        final String k;
        final String l;
        HashMap m;
        final ConstraintSet n;
        private static final String o = "\n       ";

        WriteXmlEngine(Writer writer0, ConstraintLayout constraintLayout0, int v) throws IOException {
            this.e = 0;
            this.f = "\'left\'";
            this.g = "\'right\'";
            this.h = "\'baseline\'";
            this.i = "\'bottom\'";
            this.j = "\'top\'";
            this.k = "\'start\'";
            this.l = "\'end\'";
            this.m = new HashMap();
            this.a = writer0;
            this.b = constraintLayout0;
            this.c = constraintLayout0.getContext();
            this.d = v;
        }

        String a(int v) {
            if(this.m.containsKey(v)) {
                return "@+id/" + ((String)this.m.get(v)) + "";
            }
            if(v == 0) {
                return "parent";
            }
            String s = this.b(v);
            this.m.put(v, s);
            return "@+id/" + s + "";
        }

        String b(int v) {
            try {
                if(v != -1) {
                    return this.c.getResources().getResourceEntryName(v);
                }
                int v1 = this.e + 1;
                this.e = v1;
                return "unknown" + v1;
            }
            catch(Exception unused_ex) {
                int v2 = this.e + 1;
                this.e = v2;
                return "unknown" + v2;
            }
        }

        private void c(String s, int v, int v1) throws IOException {
            if(v != v1) {
                switch(v) {
                    case -2: {
                        this.a.write("\n       " + s + "=\"wrap_content\"");
                        return;
                    }
                    case -1: {
                        this.a.write("\n       " + s + "=\"match_parent\"");
                        return;
                    }
                    default: {
                        this.a.write("\n       " + s + "=\"" + v + "dp\"");
                        break;
                    }
                }
            }
        }

        private void d(String s, boolean z, boolean z1) throws IOException {
            if(z != z1) {
                this.a.write("\n       " + s + "=\"" + z + "dp\"");
            }
        }

        void e(int v, float f, int v1) throws IOException {
            if(v == -1) {
                return;
            }
            this.a.write("circle");
            this.a.write(":[");
            this.a.write(this.a(v));
            this.a.write(", " + f);
            this.a.write(v1 + "]");
        }

        void f(String s, int v, String s1, int v1, int v2) throws IOException {
            if(v == -1) {
                return;
            }
            this.a.write("\n       " + s);
            this.a.write(":[");
            this.a.write(this.a(v));
            this.a.write(" , ");
            this.a.write(s1);
            if(v1 != 0) {
                this.a.write(" , " + v1);
            }
            this.a.write("],\n");
        }

        private void g(String s, int v, int v1) throws IOException {
            if(v != v1) {
                this.a.write("\n       " + s + "=\"" + v + "dp\"");
            }
        }

        private void h(String s, int v, String[] arr_s, int v1) throws IOException {
            if(v != v1) {
                this.a.write("\n       " + s + "=\"" + arr_s[v] + "\"");
            }
        }

        void i() throws IOException {
            this.a.write("\n<ConstraintSet>\n");
            for(Object object0: ConstraintSet.this.h.keySet()) {
                Constraint constraintSet$Constraint0 = (Constraint)ConstraintSet.this.h.get(((Integer)object0));
                String s = this.a(((int)(((Integer)object0))));
                this.a.write("  <Constraint");
                this.a.write("\n       android:id=\"" + s + "\"");
                Layout constraintSet$Layout0 = constraintSet$Constraint0.e;
                this.c("android:layout_width", constraintSet$Layout0.d, -5);
                this.c("android:layout_height", constraintSet$Layout0.e, -5);
                this.j("app:layout_constraintGuide_begin", ((float)constraintSet$Layout0.f), -1.0f);
                this.j("app:layout_constraintGuide_end", ((float)constraintSet$Layout0.g), -1.0f);
                this.j("app:layout_constraintGuide_percent", constraintSet$Layout0.h, -1.0f);
                this.j("app:layout_constraintHorizontal_bias", constraintSet$Layout0.y, 0.5f);
                this.j("app:layout_constraintVertical_bias", constraintSet$Layout0.z, 0.5f);
                this.m("app:layout_constraintDimensionRatio", constraintSet$Layout0.A, null);
                this.o("app:layout_constraintCircle", constraintSet$Layout0.B);
                this.j("app:layout_constraintCircleRadius", ((float)constraintSet$Layout0.C), 0.0f);
                this.j("app:layout_constraintCircleAngle", constraintSet$Layout0.D, 0.0f);
                this.j("android:orientation", ((float)constraintSet$Layout0.G), -1.0f);
                this.j("app:layout_constraintVertical_weight", constraintSet$Layout0.V, -1.0f);
                this.j("app:layout_constraintHorizontal_weight", constraintSet$Layout0.W, -1.0f);
                this.j("app:layout_constraintHorizontal_chainStyle", ((float)constraintSet$Layout0.X), 0.0f);
                this.j("app:layout_constraintVertical_chainStyle", ((float)constraintSet$Layout0.Y), 0.0f);
                this.j("app:barrierDirection", ((float)constraintSet$Layout0.h0), -1.0f);
                this.j("app:barrierMargin", ((float)constraintSet$Layout0.i0), 0.0f);
                this.g("app:layout_marginLeft", constraintSet$Layout0.H, 0);
                this.g("app:layout_goneMarginLeft", constraintSet$Layout0.O, 0x80000000);
                this.g("app:layout_marginRight", constraintSet$Layout0.I, 0);
                this.g("app:layout_goneMarginRight", constraintSet$Layout0.Q, 0x80000000);
                this.g("app:layout_marginStart", constraintSet$Layout0.M, 0);
                this.g("app:layout_goneMarginStart", constraintSet$Layout0.T, 0x80000000);
                this.g("app:layout_marginEnd", constraintSet$Layout0.L, 0);
                this.g("app:layout_goneMarginEnd", constraintSet$Layout0.S, 0x80000000);
                this.g("app:layout_marginTop", constraintSet$Layout0.J, 0);
                this.g("app:layout_goneMarginTop", constraintSet$Layout0.P, 0x80000000);
                this.g("app:layout_marginBottom", constraintSet$Layout0.K, 0);
                this.g("app:layout_goneMarginBottom", constraintSet$Layout0.R, 0x80000000);
                this.g("app:goneBaselineMargin", constraintSet$Layout0.U, 0x80000000);
                this.g("app:baselineMargin", constraintSet$Layout0.N, 0);
                this.d("app:layout_constrainedWidth", constraintSet$Layout0.n0, false);
                this.d("app:layout_constrainedHeight", constraintSet$Layout0.o0, false);
                this.d("app:barrierAllowsGoneWidgets", constraintSet$Layout0.p0, true);
                this.j("app:layout_wrapBehaviorInParent", ((float)constraintSet$Layout0.q0), 0.0f);
                this.o("app:baselineToBaseline", constraintSet$Layout0.r);
                this.o("app:baselineToBottom", constraintSet$Layout0.t);
                this.o("app:baselineToTop", constraintSet$Layout0.s);
                this.o("app:layout_constraintBottom_toBottomOf", constraintSet$Layout0.q);
                this.o("app:layout_constraintBottom_toTopOf", constraintSet$Layout0.p);
                this.o("app:layout_constraintEnd_toEndOf", constraintSet$Layout0.x);
                this.o("app:layout_constraintEnd_toStartOf", constraintSet$Layout0.w);
                this.o("app:layout_constraintLeft_toLeftOf", constraintSet$Layout0.j);
                this.o("app:layout_constraintLeft_toRightOf", constraintSet$Layout0.k);
                this.o("app:layout_constraintRight_toLeftOf", constraintSet$Layout0.l);
                this.o("app:layout_constraintRight_toRightOf", constraintSet$Layout0.m);
                this.o("app:layout_constraintStart_toEndOf", constraintSet$Layout0.u);
                this.o("app:layout_constraintStart_toStartOf", constraintSet$Layout0.v);
                this.o("app:layout_constraintTop_toBottomOf", constraintSet$Layout0.o);
                this.o("app:layout_constraintTop_toTopOf", constraintSet$Layout0.n);
                String[] arr_s = {"spread", "wrap", "percent"};
                this.h("app:layout_constraintHeight_default", constraintSet$Layout0.a0, arr_s, 0);
                this.j("app:layout_constraintHeight_percent", constraintSet$Layout0.g0, 1.0f);
                this.g("app:layout_constraintHeight_min", constraintSet$Layout0.e0, 0);
                this.g("app:layout_constraintHeight_max", constraintSet$Layout0.c0, 0);
                this.d("android:layout_constrainedHeight", constraintSet$Layout0.o0, false);
                this.h("app:layout_constraintWidth_default", constraintSet$Layout0.Z, arr_s, 0);
                this.j("app:layout_constraintWidth_percent", constraintSet$Layout0.f0, 1.0f);
                this.g("app:layout_constraintWidth_min", constraintSet$Layout0.d0, 0);
                this.g("app:layout_constraintWidth_max", constraintSet$Layout0.b0, 0);
                this.d("android:layout_constrainedWidth", constraintSet$Layout0.n0, false);
                this.j("app:layout_constraintVertical_weight", constraintSet$Layout0.V, -1.0f);
                this.j("app:layout_constraintHorizontal_weight", constraintSet$Layout0.W, -1.0f);
                this.k("app:layout_constraintHorizontal_chainStyle", constraintSet$Layout0.X);
                this.k("app:layout_constraintVertical_chainStyle", constraintSet$Layout0.Y);
                this.h("app:barrierDirection", constraintSet$Layout0.h0, new String[]{"left", "right", "top", "bottom", "start", "end"}, -1);
                this.m("app:layout_constraintTag", constraintSet$Layout0.m0, null);
                int[] arr_v = constraintSet$Layout0.k0;
                if(arr_v != null) {
                    this.n("\'ReferenceIds\'", arr_v);
                }
                this.a.write(" />\n");
            }
            this.a.write("</ConstraintSet>\n");
        }

        void j(String s, float f, float f1) throws IOException {
            if(f == f1) {
                return;
            }
            this.a.write("\n       " + s);
            this.a.write("=\"" + f + "\"");
        }

        void k(String s, int v) throws IOException {
            if(v != -1 && v != 0) {
                this.a.write("\n       " + s + "=\"" + v + "\"\n");
            }
        }

        void l(String s, String s1) throws IOException {
            if(s1 == null) {
                return;
            }
            this.a.write(s);
            this.a.write(":");
            this.a.write(", " + s1);
            this.a.write("\n");
        }

        void m(String s, String s1, String s2) throws IOException {
            if(s1 != null && !s1.equals(s2)) {
                this.a.write("\n       " + s);
                this.a.write("=\"" + s1 + "\"");
            }
        }

        void n(String s, int[] arr_v) throws IOException {
            if(arr_v == null) {
                return;
            }
            this.a.write("\n       " + s);
            this.a.write(":");
            for(int v = 0; v < arr_v.length; ++v) {
                this.a.write((v == 0 ? "[" : ", ") + this.a(arr_v[v]));
            }
            this.a.write("],\n");
        }

        void o(String s, int v) throws IOException {
            if(v == -1) {
                return;
            }
            this.a.write("\n       " + s);
            this.a.write("=\"" + this.a(v) + "\"");
        }
    }

    public static final int A = 0;
    private static final int A0 = 28;
    private static final int A1 = 80;
    public static final int B = 1;
    private static final int B0 = 29;
    private static final int B1 = 81;
    public static final int C = 0;
    private static final int C0 = 30;
    private static final int C1 = 82;
    public static final int D = 1;
    private static final int D0 = 0x1F;
    private static final int D1 = 83;
    public static final int E = 0;
    private static final int E0 = 0x20;
    private static final int E1 = 84;
    public static final int F = 4;
    private static final int F0 = 33;
    private static final int F1 = 85;
    public static final int G = 8;
    private static final int G0 = 34;
    private static final int G1 = 86;
    public static final int H = 1;
    private static final int H0 = 35;
    private static final int H1 = 87;
    public static final int I = 2;
    private static final int I0 = 36;
    private static final int I1 = 88;
    public static final int J = 3;
    private static final int J0 = 37;
    private static final int J1 = 89;
    public static final int K = 4;
    private static final int K0 = 38;
    private static final int K1 = 90;
    public static final int L = 5;
    private static final int L0 = 39;
    private static final int L1 = 91;
    public static final int M = 6;
    private static final int M0 = 40;
    private static final int M1 = 92;
    public static final int N = 7;
    private static final int N0 = 41;
    private static final int N1 = 93;
    public static final int O = 8;
    private static final int O0 = 42;
    private static final int O1 = 94;
    public static final int P = 0;
    private static final int P0 = 43;
    private static final int P1 = 0x5F;
    public static final int Q = 1;
    private static final int Q0 = 44;
    private static final int Q1 = 0x60;
    public static final int R = 0;
    private static final int R0 = 45;
    private static final int R1 = 97;
    public static final int S = 1;
    private static final int S0 = 46;
    private static final int S1 = 98;
    public static final int T = 2;
    private static final int T0 = 0x2F;
    private static final int T1 = 99;
    private static final boolean U = false;
    private static final int U0 = 0x30;
    private static final String U1 = "weight";
    private static final int[] V = null;
    private static final int V0 = 49;
    private static final String V1 = "ratio";
    private static final int W = 1;
    private static final int W0 = 50;
    private static final String W1 = "parent";
    private static SparseIntArray X = null;
    private static final int X0 = 51;
    private static SparseIntArray Y = null;
    private static final int Y0 = 52;
    private static final int Z = 1;
    private static final int Z0 = 53;
    private boolean a;
    private static final int a0 = 2;
    private static final int a1 = 54;
    public String b;
    private static final int b0 = 3;
    private static final int b1 = 55;
    public String c;
    private static final int c0 = 4;
    private static final int c1 = 56;
    private String[] d;
    private static final int d0 = 5;
    private static final int d1 = 57;
    public int e;
    private static final int e0 = 6;
    private static final int e1 = 58;
    private HashMap f;
    private static final int f0 = 7;
    private static final int f1 = 59;
    private boolean g;
    private static final int g0 = 8;
    private static final int g1 = 60;
    private HashMap h;
    private static final int h0 = 9;
    private static final int h1 = 61;
    private static final String i = "ConstraintSet";
    private static final int i0 = 10;
    private static final int i1 = 62;
    private static final String j = "XML parser error must be within a Constraint ";
    private static final int j0 = 11;
    private static final int j1 = 0x3F;
    private static final int k = -1;
    private static final int k0 = 12;
    private static final int k1 = 0x40;
    private static final int l = -2;
    private static final int l0 = 13;
    private static final int l1 = 65;
    private static final int m = -3;
    private static final int m0 = 14;
    private static final int m1 = 66;
    private static final int n = -4;
    private static final int n0 = 15;
    private static final int n1 = 67;
    public static final int o = 0;
    private static final int o0 = 16;
    private static final int o1 = 68;
    public static final int p = 1;
    private static final int p0 = 17;
    private static final int p1 = 69;
    public static final int q = 2;
    private static final int q0 = 18;
    private static final int q1 = 70;
    public static final int r = 3;
    private static final int r0 = 19;
    private static final int r1 = 71;
    public static final int s = 4;
    private static final int s0 = 20;
    private static final int s1 = 72;
    public static final int t = -1;
    private static final int t0 = 21;
    private static final int t1 = 73;
    public static final int u = 0;
    private static final int u0 = 22;
    private static final int u1 = 74;
    public static final int v = -2;
    private static final int v0 = 23;
    private static final int v1 = 75;
    public static final int w = 1;
    private static final int w0 = 24;
    private static final int w1 = 76;
    public static final int x = 0;
    private static final int x0 = 25;
    private static final int x1 = 77;
    public static final int y = 2;
    private static final int y0 = 26;
    private static final int y1 = 78;
    public static final int z = 0;
    private static final int z0 = 27;
    private static final int z1 = 0x4F;

    static {
        ConstraintSet.V = new int[]{0, 4, 8};
        ConstraintSet.X = new SparseIntArray();
        ConstraintSet.Y = new SparseIntArray();
        ConstraintSet.X.append(styleable.Constraint_layout_constraintLeft_toLeftOf, 25);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintLeft_toRightOf, 26);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintRight_toLeftOf, 29);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintRight_toRightOf, 30);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintTop_toTopOf, 36);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintTop_toBottomOf, 35);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintBottom_toTopOf, 4);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintBottom_toBottomOf, 3);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintBaseline_toTopOf, 91);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintBaseline_toBottomOf, 92);
        ConstraintSet.X.append(styleable.Constraint_layout_editor_absoluteX, 6);
        ConstraintSet.X.append(styleable.Constraint_layout_editor_absoluteY, 7);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintGuide_begin, 17);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintGuide_end, 18);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintGuide_percent, 19);
        ConstraintSet.X.append(styleable.Constraint_guidelineUseRtl, 99);
        ConstraintSet.X.append(styleable.Constraint_android_orientation, 27);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintStart_toEndOf, 0x20);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintStart_toStartOf, 33);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintEnd_toStartOf, 10);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintEnd_toEndOf, 9);
        ConstraintSet.X.append(styleable.Constraint_layout_goneMarginLeft, 13);
        ConstraintSet.X.append(styleable.Constraint_layout_goneMarginTop, 16);
        ConstraintSet.X.append(styleable.Constraint_layout_goneMarginRight, 14);
        ConstraintSet.X.append(styleable.Constraint_layout_goneMarginBottom, 11);
        ConstraintSet.X.append(styleable.Constraint_layout_goneMarginStart, 15);
        ConstraintSet.X.append(styleable.Constraint_layout_goneMarginEnd, 12);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintVertical_weight, 40);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintHorizontal_weight, 39);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintHorizontal_chainStyle, 41);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintVertical_chainStyle, 42);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintHorizontal_bias, 20);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintVertical_bias, 37);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintDimensionRatio, 5);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintLeft_creator, 87);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintTop_creator, 87);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintRight_creator, 87);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintBottom_creator, 87);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintBaseline_creator, 87);
        ConstraintSet.X.append(styleable.Constraint_android_layout_marginLeft, 24);
        ConstraintSet.X.append(styleable.Constraint_android_layout_marginRight, 28);
        ConstraintSet.X.append(styleable.Constraint_android_layout_marginStart, 0x1F);
        ConstraintSet.X.append(styleable.Constraint_android_layout_marginEnd, 8);
        ConstraintSet.X.append(styleable.Constraint_android_layout_marginTop, 34);
        ConstraintSet.X.append(styleable.Constraint_android_layout_marginBottom, 2);
        ConstraintSet.X.append(styleable.Constraint_android_layout_width, 23);
        ConstraintSet.X.append(styleable.Constraint_android_layout_height, 21);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintWidth, 0x5F);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintHeight, 0x60);
        ConstraintSet.X.append(styleable.Constraint_android_visibility, 22);
        ConstraintSet.X.append(styleable.Constraint_android_alpha, 43);
        ConstraintSet.X.append(styleable.Constraint_android_elevation, 44);
        ConstraintSet.X.append(styleable.Constraint_android_rotationX, 45);
        ConstraintSet.X.append(styleable.Constraint_android_rotationY, 46);
        ConstraintSet.X.append(styleable.Constraint_android_rotation, 60);
        ConstraintSet.X.append(styleable.Constraint_android_scaleX, 0x2F);
        ConstraintSet.X.append(styleable.Constraint_android_scaleY, 0x30);
        ConstraintSet.X.append(styleable.Constraint_android_transformPivotX, 49);
        ConstraintSet.X.append(styleable.Constraint_android_transformPivotY, 50);
        ConstraintSet.X.append(styleable.Constraint_android_translationX, 51);
        ConstraintSet.X.append(styleable.Constraint_android_translationY, 52);
        ConstraintSet.X.append(styleable.Constraint_android_translationZ, 53);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintWidth_default, 54);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintHeight_default, 55);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintWidth_max, 56);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintHeight_max, 57);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintWidth_min, 58);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintHeight_min, 59);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintCircle, 61);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintCircleRadius, 62);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintCircleAngle, 0x3F);
        ConstraintSet.X.append(styleable.Constraint_animateRelativeTo, 0x40);
        ConstraintSet.X.append(styleable.Constraint_transitionEasing, 65);
        ConstraintSet.X.append(styleable.Constraint_drawPath, 66);
        ConstraintSet.X.append(styleable.Constraint_transitionPathRotate, 67);
        ConstraintSet.X.append(styleable.Constraint_motionStagger, 0x4F);
        ConstraintSet.X.append(styleable.Constraint_android_id, 38);
        ConstraintSet.X.append(styleable.Constraint_motionProgress, 68);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintWidth_percent, 69);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintHeight_percent, 70);
        ConstraintSet.X.append(styleable.Constraint_layout_wrapBehaviorInParent, 97);
        ConstraintSet.X.append(styleable.Constraint_chainUseRtl, 71);
        ConstraintSet.X.append(styleable.Constraint_barrierDirection, 72);
        ConstraintSet.X.append(styleable.Constraint_barrierMargin, 73);
        ConstraintSet.X.append(styleable.Constraint_constraint_referenced_ids, 74);
        ConstraintSet.X.append(styleable.Constraint_barrierAllowsGoneWidgets, 75);
        ConstraintSet.X.append(styleable.Constraint_pathMotionArc, 76);
        ConstraintSet.X.append(styleable.Constraint_layout_constraintTag, 77);
        ConstraintSet.X.append(styleable.Constraint_visibilityMode, 78);
        ConstraintSet.X.append(styleable.Constraint_layout_constrainedWidth, 80);
        ConstraintSet.X.append(styleable.Constraint_layout_constrainedHeight, 81);
        ConstraintSet.X.append(styleable.Constraint_polarRelativeTo, 82);
        ConstraintSet.X.append(styleable.Constraint_transformPivotTarget, 83);
        ConstraintSet.X.append(styleable.Constraint_quantizeMotionSteps, 84);
        ConstraintSet.X.append(styleable.Constraint_quantizeMotionPhase, 85);
        ConstraintSet.X.append(styleable.Constraint_quantizeMotionInterpolator, 86);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_editor_absoluteY, 6);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_editor_absoluteY, 7);
        ConstraintSet.Y.append(styleable.ConstraintOverride_android_orientation, 27);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_goneMarginLeft, 13);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_goneMarginTop, 16);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_goneMarginRight, 14);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_goneMarginBottom, 11);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_goneMarginStart, 15);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_goneMarginEnd, 12);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_constraintVertical_weight, 40);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_constraintVertical_bias, 37);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_constraintDimensionRatio, 5);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_constraintLeft_creator, 87);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_constraintTop_creator, 87);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_constraintRight_creator, 87);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_constraintBottom_creator, 87);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_constraintBaseline_creator, 87);
        ConstraintSet.Y.append(styleable.ConstraintOverride_android_layout_marginLeft, 24);
        ConstraintSet.Y.append(styleable.ConstraintOverride_android_layout_marginRight, 28);
        ConstraintSet.Y.append(styleable.ConstraintOverride_android_layout_marginStart, 0x1F);
        ConstraintSet.Y.append(styleable.ConstraintOverride_android_layout_marginEnd, 8);
        ConstraintSet.Y.append(styleable.ConstraintOverride_android_layout_marginTop, 34);
        ConstraintSet.Y.append(styleable.ConstraintOverride_android_layout_marginBottom, 2);
        ConstraintSet.Y.append(styleable.ConstraintOverride_android_layout_width, 23);
        ConstraintSet.Y.append(styleable.ConstraintOverride_android_layout_height, 21);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_constraintWidth, 0x5F);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_constraintHeight, 0x60);
        ConstraintSet.Y.append(styleable.ConstraintOverride_android_visibility, 22);
        ConstraintSet.Y.append(styleable.ConstraintOverride_android_alpha, 43);
        ConstraintSet.Y.append(styleable.ConstraintOverride_android_elevation, 44);
        ConstraintSet.Y.append(styleable.ConstraintOverride_android_rotationX, 45);
        ConstraintSet.Y.append(styleable.ConstraintOverride_android_rotationY, 46);
        ConstraintSet.Y.append(styleable.ConstraintOverride_android_rotation, 60);
        ConstraintSet.Y.append(styleable.ConstraintOverride_android_scaleX, 0x2F);
        ConstraintSet.Y.append(styleable.ConstraintOverride_android_scaleY, 0x30);
        ConstraintSet.Y.append(styleable.ConstraintOverride_android_transformPivotX, 49);
        ConstraintSet.Y.append(styleable.ConstraintOverride_android_transformPivotY, 50);
        ConstraintSet.Y.append(styleable.ConstraintOverride_android_translationX, 51);
        ConstraintSet.Y.append(styleable.ConstraintOverride_android_translationY, 52);
        ConstraintSet.Y.append(styleable.ConstraintOverride_android_translationZ, 53);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_constraintWidth_default, 54);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_constraintHeight_default, 55);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_constraintWidth_max, 56);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_constraintHeight_max, 57);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_constraintWidth_min, 58);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_constraintHeight_min, 59);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_constraintCircleRadius, 62);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_constraintCircleAngle, 0x3F);
        ConstraintSet.Y.append(styleable.ConstraintOverride_animateRelativeTo, 0x40);
        ConstraintSet.Y.append(styleable.ConstraintOverride_transitionEasing, 65);
        ConstraintSet.Y.append(styleable.ConstraintOverride_drawPath, 66);
        ConstraintSet.Y.append(styleable.ConstraintOverride_transitionPathRotate, 67);
        ConstraintSet.Y.append(styleable.ConstraintOverride_motionStagger, 0x4F);
        ConstraintSet.Y.append(styleable.ConstraintOverride_android_id, 38);
        ConstraintSet.Y.append(styleable.ConstraintOverride_motionTarget, 98);
        ConstraintSet.Y.append(styleable.ConstraintOverride_motionProgress, 68);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_constraintWidth_percent, 69);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_constraintHeight_percent, 70);
        ConstraintSet.Y.append(styleable.ConstraintOverride_chainUseRtl, 71);
        ConstraintSet.Y.append(styleable.ConstraintOverride_barrierDirection, 72);
        ConstraintSet.Y.append(styleable.ConstraintOverride_barrierMargin, 73);
        ConstraintSet.Y.append(styleable.ConstraintOverride_constraint_referenced_ids, 74);
        ConstraintSet.Y.append(styleable.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        ConstraintSet.Y.append(styleable.ConstraintOverride_pathMotionArc, 76);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_constraintTag, 77);
        ConstraintSet.Y.append(styleable.ConstraintOverride_visibilityMode, 78);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_constrainedWidth, 80);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_constrainedHeight, 81);
        ConstraintSet.Y.append(styleable.ConstraintOverride_polarRelativeTo, 82);
        ConstraintSet.Y.append(styleable.ConstraintOverride_transformPivotTarget, 83);
        ConstraintSet.Y.append(styleable.ConstraintOverride_quantizeMotionSteps, 84);
        ConstraintSet.Y.append(styleable.ConstraintOverride_quantizeMotionPhase, 85);
        ConstraintSet.Y.append(styleable.ConstraintOverride_quantizeMotionInterpolator, 86);
        ConstraintSet.Y.append(styleable.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    public ConstraintSet() {
        this.c = "";
        this.d = new String[0];
        this.e = 0;
        this.f = new HashMap();
        this.g = true;
        this.h = new HashMap();
    }

    public void A(int v, int v1) {
        if(v1 == 0) {
            this.x(v, 0, 6, 0, 0, 7, 0, 0.5f);
            return;
        }
        this.x(v, v1, 7, 0, v1, 6, 0, 0.5f);
    }

    private static int A0(TypedArray typedArray0, int v, int v1) {
        int v2 = typedArray0.getResourceId(v, v1);
        return v2 == -1 ? typedArray0.getInt(v, -1) : v2;
    }

    public void A1(int v, float f, float f1) {
        Constraint constraintSet$Constraint0 = this.i0(v);
        constraintSet$Constraint0.f.j = f;
        constraintSet$Constraint0.f.k = f1;
    }

    public void B(int v, int v1, int v2, int v3, int v4, int v5, int v6, float f) {
        this.L(v, 6, v1, v2, v3);
        this.L(v, 7, v4, v5, v6);
        Constraint constraintSet$Constraint0 = (Constraint)this.h.get(v);
        if(constraintSet$Constraint0 != null) {
            constraintSet$Constraint0.e.y = f;
        }
    }

    public boolean B0(String[] arr_s) {
        int v = 0;
    label_1:
        while(v < arr_s.length) {
            String s = arr_s[v];
            String[] arr_s1 = this.d;
            int v1 = 0;
            while(v1 < arr_s1.length) {
                if(!arr_s1[v1].equals(s)) {
                    ++v1;
                    continue;
                }
                ++v;
                continue label_1;
            }
            return false;
        }
        return true;
    }

    public void B1(int v, float f) {
        this.i0(v).f.j = f;
    }

    public void C(int v, int v1) {
        if(v1 == 0) {
            this.x(v, 0, 3, 0, 0, 4, 0, 0.5f);
            return;
        }
        this.x(v, v1, 4, 0, v1, 3, 0, 0.5f);
    }

    public void C0(Constraint constraintSet$Constraint0, String s) {
        String[] arr_s = s.split(",");
        for(int v = 0; v < arr_s.length; ++v) {
            String[] arr_s1 = arr_s[v].split("=");
            if(arr_s1.length == 2) {
                constraintSet$Constraint0.p(arr_s1[0], Color.parseColor(arr_s1[1]));
            }
            else {
                Log.w("ConstraintSet", " Unable to parse " + arr_s[v]);
            }
        }
    }

    public void C1(int v, float f) {
        this.i0(v).f.k = f;
    }

    public void D(int v, int v1, int v2, int v3, int v4, int v5, int v6, float f) {
        this.L(v, 3, v1, v2, v3);
        this.L(v, 4, v4, v5, v6);
        Constraint constraintSet$Constraint0 = (Constraint)this.h.get(v);
        if(constraintSet$Constraint0 != null) {
            constraintSet$Constraint0.e.z = f;
        }
    }

    static void D0(Object object0, TypedArray typedArray0, int v, int v1) {
        boolean z;
        if(object0 == null) {
            return;
        }
        int v2 = 0;
    alab1:
        switch(typedArray0.peekValue(v).type) {
            case 3: {
                ConstraintSet.E0(object0, typedArray0.getString(v), v1);
                return;
            label_7:
                int v3 = typedArray0.getInt(v, 0);
                switch(v3) {
                    case -4: {
                        z = true;
                        v2 = -2;
                        break alab1;
                    }
                    case -2: 
                    case -1: {
                        v2 = v3;
                        z = false;
                        break alab1;
                    }
                    default: {
                        z = false;
                        break alab1;
                    }
                }
            }
            case 5: {
                v2 = typedArray0.getDimensionPixelSize(v, 0);
                z = false;
                break;
            }
            default: {
                goto label_7;
            }
        }
        if(object0 instanceof LayoutParams) {
            if(v1 == 0) {
                ((LayoutParams)object0).width = v2;
                ((LayoutParams)object0).a0 = z;
                return;
            }
            ((LayoutParams)object0).height = v2;
            ((LayoutParams)object0).b0 = z;
            return;
        }
        if(object0 instanceof Layout) {
            if(v1 == 0) {
                ((Layout)object0).d = v2;
                ((Layout)object0).n0 = z;
                return;
            }
            ((Layout)object0).e = v2;
            ((Layout)object0).o0 = z;
            return;
        }
        if(object0 instanceof Delta) {
            if(v1 == 0) {
                ((Delta)object0).b(23, v2);
                ((Delta)object0).d(80, z);
                return;
            }
            ((Delta)object0).b(21, v2);
            ((Delta)object0).d(81, z);
        }
    }

    public void D1(int v, float f) {
        this.i0(v).f.l = f;
    }

    public void E(int v) {
        this.h.remove(v);
    }

    static void E0(Object object0, String s, int v) {
        if(s == null) {
            return;
        }
        int v1 = s.indexOf(61);
        if(v1 > 0 && v1 < s.length() - 1) {
            String s1 = s.substring(0, v1);
            String s2 = s.substring(v1 + 1);
            if(s2.length() > 0) {
                String s3 = s1.trim();
                String s4 = s2.trim();
                if("ratio".equalsIgnoreCase(s3)) {
                    if(object0 instanceof LayoutParams) {
                        if(v == 0) {
                            ((LayoutParams)object0).width = 0;
                        }
                        else {
                            ((LayoutParams)object0).height = 0;
                        }
                        ConstraintSet.F0(((LayoutParams)object0), s4);
                        return;
                    }
                    if(object0 instanceof Layout) {
                        ((Layout)object0).A = s4;
                        return;
                    }
                    if(object0 instanceof Delta) {
                        ((Delta)object0).c(5, s4);
                    }
                }
                else if("weight".equalsIgnoreCase(s3)) {
                    try {
                        float f = Float.parseFloat(s4);
                        if(object0 instanceof LayoutParams) {
                            if(v == 0) {
                                ((LayoutParams)object0).width = 0;
                                ((LayoutParams)object0).L = f;
                                return;
                            }
                            ((LayoutParams)object0).height = 0;
                            ((LayoutParams)object0).M = f;
                            return;
                        }
                        if(object0 instanceof Layout) {
                            if(v == 0) {
                                ((Layout)object0).d = 0;
                                ((Layout)object0).W = f;
                                return;
                            }
                            ((Layout)object0).e = 0;
                            ((Layout)object0).V = f;
                            return;
                        }
                        if(object0 instanceof Delta) {
                            if(v == 0) {
                                ((Delta)object0).b(23, 0);
                                ((Delta)object0).a(39, f);
                                return;
                            }
                            ((Delta)object0).b(21, 0);
                            ((Delta)object0).a(40, f);
                        }
                    }
                    catch(NumberFormatException unused_ex) {
                    }
                }
                else if("parent".equalsIgnoreCase(s3)) {
                    try {
                        float f1 = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(s4)));
                        if(object0 instanceof LayoutParams) {
                            if(v == 0) {
                                ((LayoutParams)object0).width = 0;
                                ((LayoutParams)object0).V = f1;
                                ((LayoutParams)object0).P = 2;
                                return;
                            }
                            ((LayoutParams)object0).height = 0;
                            ((LayoutParams)object0).W = f1;
                            ((LayoutParams)object0).Q = 2;
                            return;
                        }
                        if(object0 instanceof Layout) {
                            if(v == 0) {
                                ((Layout)object0).d = 0;
                                ((Layout)object0).f0 = f1;
                                ((Layout)object0).Z = 2;
                                return;
                            }
                            ((Layout)object0).e = 0;
                            ((Layout)object0).g0 = f1;
                            ((Layout)object0).a0 = 2;
                            return;
                        }
                        if(object0 instanceof Delta) {
                            if(v == 0) {
                                ((Delta)object0).b(23, 0);
                                ((Delta)object0).b(54, 2);
                                return;
                            }
                            ((Delta)object0).b(21, 0);
                            ((Delta)object0).b(55, 2);
                        }
                    }
                    catch(NumberFormatException unused_ex) {
                    }
                }
            }
        }
    }

    public void E1(boolean z) {
        this.a = z;
    }

    public void F(int v, int v1) {
        if(this.h.containsKey(v)) {
            Constraint constraintSet$Constraint0 = (Constraint)this.h.get(v);
            if(constraintSet$Constraint0 == null) {
                return;
            }
            switch(v1) {
                case 1: {
                    constraintSet$Constraint0.e.k = -1;
                    constraintSet$Constraint0.e.j = -1;
                    constraintSet$Constraint0.e.H = -1;
                    constraintSet$Constraint0.e.O = 0x80000000;
                    break;
                }
                case 2: {
                    constraintSet$Constraint0.e.m = -1;
                    constraintSet$Constraint0.e.l = -1;
                    constraintSet$Constraint0.e.I = -1;
                    constraintSet$Constraint0.e.Q = 0x80000000;
                    return;
                }
                case 3: {
                    constraintSet$Constraint0.e.o = -1;
                    constraintSet$Constraint0.e.n = -1;
                    constraintSet$Constraint0.e.J = 0;
                    constraintSet$Constraint0.e.P = 0x80000000;
                    return;
                }
                case 4: {
                    constraintSet$Constraint0.e.p = -1;
                    constraintSet$Constraint0.e.q = -1;
                    constraintSet$Constraint0.e.K = 0;
                    constraintSet$Constraint0.e.R = 0x80000000;
                    return;
                }
                case 5: {
                    constraintSet$Constraint0.e.r = -1;
                    constraintSet$Constraint0.e.s = -1;
                    constraintSet$Constraint0.e.t = -1;
                    constraintSet$Constraint0.e.N = 0;
                    constraintSet$Constraint0.e.U = 0x80000000;
                    return;
                }
                case 6: {
                    constraintSet$Constraint0.e.u = -1;
                    constraintSet$Constraint0.e.v = -1;
                    constraintSet$Constraint0.e.M = 0;
                    constraintSet$Constraint0.e.T = 0x80000000;
                    return;
                }
                case 7: {
                    constraintSet$Constraint0.e.w = -1;
                    constraintSet$Constraint0.e.x = -1;
                    constraintSet$Constraint0.e.L = 0;
                    constraintSet$Constraint0.e.S = 0x80000000;
                    return;
                }
                case 8: {
                    constraintSet$Constraint0.e.D = -1.0f;
                    constraintSet$Constraint0.e.C = -1;
                    constraintSet$Constraint0.e.B = -1;
                    return;
                }
                default: {
                    throw new IllegalArgumentException("unknown constraint");
                }
            }
        }
    }

    static void F0(LayoutParams constraintLayout$LayoutParams0, String s) {
        float f = NaNf;
        int v = -1;
        if(s != null) {
            int v1 = s.length();
            int v2 = s.indexOf(44);
            int v3 = 0;
            if(v2 > 0 && v2 < v1 - 1) {
                String s1 = s.substring(0, v2);
                if(s1.equalsIgnoreCase("W")) {
                    v = 0;
                }
                else if(s1.equalsIgnoreCase("H")) {
                    v = 1;
                }
                v3 = v2 + 1;
            }
            int v4 = s.indexOf(58);
            if(v4 < 0 || v4 >= v1 - 1) {
                String s4 = s.substring(v3);
                if(s4.length() > 0) {
                    try {
                        f = Float.parseFloat(s4);
                        constraintLayout$LayoutParams0.I = s;
                        constraintLayout$LayoutParams0.J = f;
                        constraintLayout$LayoutParams0.K = v;
                        return;
                    }
                    catch(NumberFormatException unused_ex) {
                    }
                }
            }
            else {
                String s2 = s.substring(v3, v4);
                String s3 = s.substring(v4 + 1);
                if(s2.length() > 0 && s3.length() > 0) {
                    try {
                        float f1 = Float.parseFloat(s2);
                        float f2 = Float.parseFloat(s3);
                        if(f1 > 0.0f && f2 > 0.0f) {
                            f = v == 1 ? Math.abs(f2 / f1) : Math.abs(f1 / f2);
                        }
                    }
                    catch(NumberFormatException unused_ex) {
                    }
                }
            }
        }
        constraintLayout$LayoutParams0.I = s;
        constraintLayout$LayoutParams0.J = f;
        constraintLayout$LayoutParams0.K = v;
    }

    public void F1(int v, float f) {
        this.i0(v).e.z = f;
    }

    public void G(Context context0, int v) {
        this.H(((ConstraintLayout)LayoutInflater.from(context0).inflate(v, null)));
    }

    public void G0(Constraint constraintSet$Constraint0, String s) {
        String[] arr_s = s.split(",");
        for(int v = 0; v < arr_s.length; ++v) {
            String[] arr_s1 = arr_s[v].split("=");
            if(arr_s1.length == 2) {
                constraintSet$Constraint0.q(arr_s1[0], Float.parseFloat(arr_s1[1]));
            }
            else {
                Log.w("ConstraintSet", " Unable to parse " + arr_s[v]);
            }
        }
    }

    public void G1(int v, int v1) {
        this.i0(v).e.Y = v1;
    }

    public void H(ConstraintLayout constraintLayout0) {
        int v = constraintLayout0.getChildCount();
        this.h.clear();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = constraintLayout0.getChildAt(v1);
            LayoutParams constraintLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            int v2 = view0.getId();
            if(this.g && v2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if(!this.h.containsKey(v2)) {
                this.h.put(v2, new Constraint());
            }
            Constraint constraintSet$Constraint0 = (Constraint)this.h.get(v2);
            if(constraintSet$Constraint0 != null) {
                constraintSet$Constraint0.g = ConstraintAttribute.d(this.f, view0);
                constraintSet$Constraint0.k(v2, constraintLayout$LayoutParams0);
                constraintSet$Constraint0.c.b = view0.getVisibility();
                constraintSet$Constraint0.c.d = view0.getAlpha();
                constraintSet$Constraint0.f.b = view0.getRotation();
                constraintSet$Constraint0.f.c = view0.getRotationX();
                constraintSet$Constraint0.f.d = view0.getRotationY();
                constraintSet$Constraint0.f.e = view0.getScaleX();
                constraintSet$Constraint0.f.f = view0.getScaleY();
                float f = view0.getPivotX();
                float f1 = view0.getPivotY();
                if(((double)f) != 0.0 || ((double)f1) != 0.0) {
                    constraintSet$Constraint0.f.g = f;
                    constraintSet$Constraint0.f.h = f1;
                }
                constraintSet$Constraint0.f.j = view0.getTranslationX();
                constraintSet$Constraint0.f.k = view0.getTranslationY();
                constraintSet$Constraint0.f.l = view0.getTranslationZ();
                Transform constraintSet$Transform0 = constraintSet$Constraint0.f;
                if(constraintSet$Transform0.m) {
                    constraintSet$Transform0.n = view0.getElevation();
                }
                if(view0 instanceof Barrier) {
                    constraintSet$Constraint0.e.p0 = ((Barrier)view0).getAllowsGoneWidget();
                    constraintSet$Constraint0.e.k0 = ((Barrier)view0).getReferencedIds();
                    constraintSet$Constraint0.e.h0 = ((Barrier)view0).getType();
                    constraintSet$Constraint0.e.i0 = ((Barrier)view0).getMargin();
                }
            }
        }
    }

    public void H0(Constraint constraintSet$Constraint0, String s) {
        String[] arr_s = s.split(",");
        for(int v = 0; v < arr_s.length; ++v) {
            String[] arr_s1 = arr_s[v].split("=");
            if(arr_s1.length == 2) {
                constraintSet$Constraint0.q(arr_s1[0], ((float)(((int)Integer.decode(arr_s1[1])))));
            }
            else {
                Log.w("ConstraintSet", " Unable to parse " + arr_s[v]);
            }
        }
    }

    public void H1(int v, float f) {
        this.i0(v).e.V = f;
    }

    public void I(ConstraintSet constraintSet0) {
        this.h.clear();
        for(Object object0: constraintSet0.h.keySet()) {
            Integer integer0 = (Integer)object0;
            Constraint constraintSet$Constraint0 = (Constraint)constraintSet0.h.get(integer0);
            if(constraintSet$Constraint0 != null) {
                this.h.put(integer0, constraintSet$Constraint0.j());
            }
        }
    }

    public void I0(Constraint constraintSet$Constraint0, String s) {
        String[] arr_s = ConstraintSet.L1(s);
        for(int v = 0; v < arr_s.length; ++v) {
            String[] arr_s1 = arr_s[v].split("=");
            Log.w("ConstraintSet", " Unable to parse " + arr_s[v]);
            constraintSet$Constraint0.s(arr_s1[0], arr_s1[1]);
        }
    }

    public void I1(int v, int v1) {
        this.i0(v).c.b = v1;
    }

    public void J(Constraints constraints0) {
        int v = constraints0.getChildCount();
        this.h.clear();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = constraints0.getChildAt(v1);
            androidx.constraintlayout.widget.Constraints.LayoutParams constraints$LayoutParams0 = (androidx.constraintlayout.widget.Constraints.LayoutParams)view0.getLayoutParams();
            int v2 = view0.getId();
            if(this.g && v2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if(!this.h.containsKey(v2)) {
                this.h.put(v2, new Constraint());
            }
            Constraint constraintSet$Constraint0 = (Constraint)this.h.get(v2);
            if(constraintSet$Constraint0 != null) {
                if(view0 instanceof ConstraintHelper) {
                    constraintSet$Constraint0.m(((ConstraintHelper)view0), v2, constraints$LayoutParams0);
                }
                constraintSet$Constraint0.l(v2, constraints$LayoutParams0);
            }
        }
    }

    private void J0(Constraint constraintSet$Constraint0, TypedArray typedArray0, boolean z) {
        if(z) {
            ConstraintSet.K0(constraintSet$Constraint0, typedArray0);
            return;
        }
        int v = typedArray0.getIndexCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            if(v2 != styleable.Constraint_android_id && styleable.Constraint_android_layout_marginStart != v2 && styleable.Constraint_android_layout_marginEnd != v2) {
                constraintSet$Constraint0.d.a = true;
                constraintSet$Constraint0.e.b = true;
                constraintSet$Constraint0.c.a = true;
                constraintSet$Constraint0.f.a = true;
            }
            switch(ConstraintSet.X.get(v2)) {
                case 1: {
                    constraintSet$Constraint0.e.r = ConstraintSet.A0(typedArray0, v2, constraintSet$Constraint0.e.r);
                    break;
                }
                case 2: {
                    constraintSet$Constraint0.e.K = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.K);
                    break;
                }
                case 3: {
                    constraintSet$Constraint0.e.q = ConstraintSet.A0(typedArray0, v2, constraintSet$Constraint0.e.q);
                    break;
                }
                case 4: {
                    constraintSet$Constraint0.e.p = ConstraintSet.A0(typedArray0, v2, constraintSet$Constraint0.e.p);
                    break;
                }
                case 5: {
                    constraintSet$Constraint0.e.A = typedArray0.getString(v2);
                    break;
                }
                case 6: {
                    constraintSet$Constraint0.e.E = typedArray0.getDimensionPixelOffset(v2, constraintSet$Constraint0.e.E);
                    break;
                }
                case 7: {
                    constraintSet$Constraint0.e.F = typedArray0.getDimensionPixelOffset(v2, constraintSet$Constraint0.e.F);
                    break;
                }
                case 8: {
                    constraintSet$Constraint0.e.L = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.L);
                    break;
                }
                case 9: {
                    constraintSet$Constraint0.e.x = ConstraintSet.A0(typedArray0, v2, constraintSet$Constraint0.e.x);
                    break;
                }
                case 10: {
                    constraintSet$Constraint0.e.w = ConstraintSet.A0(typedArray0, v2, constraintSet$Constraint0.e.w);
                    break;
                }
                case 11: {
                    constraintSet$Constraint0.e.R = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.R);
                    break;
                }
                case 12: {
                    constraintSet$Constraint0.e.S = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.S);
                    break;
                }
                case 13: {
                    constraintSet$Constraint0.e.O = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.O);
                    break;
                }
                case 14: {
                    constraintSet$Constraint0.e.Q = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.Q);
                    break;
                }
                case 15: {
                    constraintSet$Constraint0.e.T = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.T);
                    break;
                }
                case 16: {
                    constraintSet$Constraint0.e.P = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.P);
                    break;
                }
                case 17: {
                    constraintSet$Constraint0.e.f = typedArray0.getDimensionPixelOffset(v2, constraintSet$Constraint0.e.f);
                    break;
                }
                case 18: {
                    constraintSet$Constraint0.e.g = typedArray0.getDimensionPixelOffset(v2, constraintSet$Constraint0.e.g);
                    break;
                }
                case 19: {
                    constraintSet$Constraint0.e.h = typedArray0.getFloat(v2, constraintSet$Constraint0.e.h);
                    break;
                }
                case 20: {
                    constraintSet$Constraint0.e.y = typedArray0.getFloat(v2, constraintSet$Constraint0.e.y);
                    break;
                }
                case 21: {
                    constraintSet$Constraint0.e.e = typedArray0.getLayoutDimension(v2, constraintSet$Constraint0.e.e);
                    break;
                }
                case 22: {
                    constraintSet$Constraint0.c.b = typedArray0.getInt(v2, constraintSet$Constraint0.c.b);
                    constraintSet$Constraint0.c.b = ConstraintSet.V[constraintSet$Constraint0.c.b];
                    break;
                }
                case 23: {
                    constraintSet$Constraint0.e.d = typedArray0.getLayoutDimension(v2, constraintSet$Constraint0.e.d);
                    break;
                }
                case 24: {
                    constraintSet$Constraint0.e.H = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.H);
                    break;
                }
                case 25: {
                    constraintSet$Constraint0.e.j = ConstraintSet.A0(typedArray0, v2, constraintSet$Constraint0.e.j);
                    break;
                }
                case 26: {
                    constraintSet$Constraint0.e.k = ConstraintSet.A0(typedArray0, v2, constraintSet$Constraint0.e.k);
                    break;
                }
                case 27: {
                    constraintSet$Constraint0.e.G = typedArray0.getInt(v2, constraintSet$Constraint0.e.G);
                    break;
                }
                case 28: {
                    constraintSet$Constraint0.e.I = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.I);
                    break;
                }
                case 29: {
                    constraintSet$Constraint0.e.l = ConstraintSet.A0(typedArray0, v2, constraintSet$Constraint0.e.l);
                    break;
                }
                case 30: {
                    constraintSet$Constraint0.e.m = ConstraintSet.A0(typedArray0, v2, constraintSet$Constraint0.e.m);
                    break;
                }
                case 0x1F: {
                    constraintSet$Constraint0.e.M = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.M);
                    break;
                }
                case 0x20: {
                    constraintSet$Constraint0.e.u = ConstraintSet.A0(typedArray0, v2, constraintSet$Constraint0.e.u);
                    break;
                }
                case 33: {
                    constraintSet$Constraint0.e.v = ConstraintSet.A0(typedArray0, v2, constraintSet$Constraint0.e.v);
                    break;
                }
                case 34: {
                    constraintSet$Constraint0.e.J = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.J);
                    break;
                }
                case 35: {
                    constraintSet$Constraint0.e.o = ConstraintSet.A0(typedArray0, v2, constraintSet$Constraint0.e.o);
                    break;
                }
                case 36: {
                    constraintSet$Constraint0.e.n = ConstraintSet.A0(typedArray0, v2, constraintSet$Constraint0.e.n);
                    break;
                }
                case 37: {
                    constraintSet$Constraint0.e.z = typedArray0.getFloat(v2, constraintSet$Constraint0.e.z);
                    break;
                }
                case 38: {
                    constraintSet$Constraint0.a = typedArray0.getResourceId(v2, constraintSet$Constraint0.a);
                    break;
                }
                case 39: {
                    constraintSet$Constraint0.e.W = typedArray0.getFloat(v2, constraintSet$Constraint0.e.W);
                    break;
                }
                case 40: {
                    constraintSet$Constraint0.e.V = typedArray0.getFloat(v2, constraintSet$Constraint0.e.V);
                    break;
                }
                case 41: {
                    constraintSet$Constraint0.e.X = typedArray0.getInt(v2, constraintSet$Constraint0.e.X);
                    break;
                }
                case 42: {
                    constraintSet$Constraint0.e.Y = typedArray0.getInt(v2, constraintSet$Constraint0.e.Y);
                    break;
                }
                case 43: {
                    constraintSet$Constraint0.c.d = typedArray0.getFloat(v2, constraintSet$Constraint0.c.d);
                    break;
                }
                case 44: {
                    constraintSet$Constraint0.f.m = true;
                    constraintSet$Constraint0.f.n = typedArray0.getDimension(v2, constraintSet$Constraint0.f.n);
                    break;
                }
                case 45: {
                    constraintSet$Constraint0.f.c = typedArray0.getFloat(v2, constraintSet$Constraint0.f.c);
                    break;
                }
                case 46: {
                    constraintSet$Constraint0.f.d = typedArray0.getFloat(v2, constraintSet$Constraint0.f.d);
                    break;
                }
                case 0x2F: {
                    constraintSet$Constraint0.f.e = typedArray0.getFloat(v2, constraintSet$Constraint0.f.e);
                    break;
                }
                case 0x30: {
                    constraintSet$Constraint0.f.f = typedArray0.getFloat(v2, constraintSet$Constraint0.f.f);
                    break;
                }
                case 49: {
                    constraintSet$Constraint0.f.g = typedArray0.getDimension(v2, constraintSet$Constraint0.f.g);
                    break;
                }
                case 50: {
                    constraintSet$Constraint0.f.h = typedArray0.getDimension(v2, constraintSet$Constraint0.f.h);
                    break;
                }
                case 51: {
                    constraintSet$Constraint0.f.j = typedArray0.getDimension(v2, constraintSet$Constraint0.f.j);
                    break;
                }
                case 52: {
                    constraintSet$Constraint0.f.k = typedArray0.getDimension(v2, constraintSet$Constraint0.f.k);
                    break;
                }
                case 53: {
                    constraintSet$Constraint0.f.l = typedArray0.getDimension(v2, constraintSet$Constraint0.f.l);
                    break;
                }
                case 54: {
                    constraintSet$Constraint0.e.Z = typedArray0.getInt(v2, constraintSet$Constraint0.e.Z);
                    break;
                }
                case 55: {
                    constraintSet$Constraint0.e.a0 = typedArray0.getInt(v2, constraintSet$Constraint0.e.a0);
                    break;
                }
                case 56: {
                    constraintSet$Constraint0.e.b0 = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.b0);
                    break;
                }
                case 57: {
                    constraintSet$Constraint0.e.c0 = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.c0);
                    break;
                }
                case 58: {
                    constraintSet$Constraint0.e.d0 = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.d0);
                    break;
                }
                case 59: {
                    constraintSet$Constraint0.e.e0 = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.e0);
                    break;
                }
                case 60: {
                    constraintSet$Constraint0.f.b = typedArray0.getFloat(v2, constraintSet$Constraint0.f.b);
                    break;
                }
                case 61: {
                    constraintSet$Constraint0.e.B = ConstraintSet.A0(typedArray0, v2, constraintSet$Constraint0.e.B);
                    break;
                }
                case 62: {
                    constraintSet$Constraint0.e.C = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.C);
                    break;
                }
                case 0x3F: {
                    constraintSet$Constraint0.e.D = typedArray0.getFloat(v2, constraintSet$Constraint0.e.D);
                    break;
                }
                case 0x40: {
                    constraintSet$Constraint0.d.b = ConstraintSet.A0(typedArray0, v2, constraintSet$Constraint0.d.b);
                    break;
                }
                case 65: {
                    if(typedArray0.peekValue(v2).type == 3) {
                        constraintSet$Constraint0.d.d = typedArray0.getString(v2);
                    }
                    else {
                        String[] arr_s = Easing.o;
                        constraintSet$Constraint0.d.d = arr_s[typedArray0.getInteger(v2, 0)];
                    }
                    break;
                }
                case 66: {
                    constraintSet$Constraint0.d.f = typedArray0.getInt(v2, 0);
                    break;
                }
                case 67: {
                    constraintSet$Constraint0.d.i = typedArray0.getFloat(v2, constraintSet$Constraint0.d.i);
                    break;
                }
                case 68: {
                    constraintSet$Constraint0.c.e = typedArray0.getFloat(v2, constraintSet$Constraint0.c.e);
                    break;
                }
                case 69: {
                    constraintSet$Constraint0.e.f0 = typedArray0.getFloat(v2, 1.0f);
                    break;
                }
                case 70: {
                    constraintSet$Constraint0.e.g0 = typedArray0.getFloat(v2, 1.0f);
                    break;
                }
                case 71: {
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                }
                case 72: {
                    constraintSet$Constraint0.e.h0 = typedArray0.getInt(v2, constraintSet$Constraint0.e.h0);
                    break;
                }
                case 73: {
                    constraintSet$Constraint0.e.i0 = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.i0);
                    break;
                }
                case 74: {
                    constraintSet$Constraint0.e.l0 = typedArray0.getString(v2);
                    break;
                }
                case 75: {
                    constraintSet$Constraint0.e.p0 = typedArray0.getBoolean(v2, constraintSet$Constraint0.e.p0);
                    break;
                }
                case 76: {
                    constraintSet$Constraint0.d.e = typedArray0.getInt(v2, constraintSet$Constraint0.d.e);
                    break;
                }
                case 77: {
                    constraintSet$Constraint0.e.m0 = typedArray0.getString(v2);
                    break;
                }
                case 78: {
                    constraintSet$Constraint0.c.c = typedArray0.getInt(v2, constraintSet$Constraint0.c.c);
                    break;
                }
                case 0x4F: {
                    constraintSet$Constraint0.d.g = typedArray0.getFloat(v2, constraintSet$Constraint0.d.g);
                    break;
                }
                case 80: {
                    constraintSet$Constraint0.e.n0 = typedArray0.getBoolean(v2, constraintSet$Constraint0.e.n0);
                    break;
                }
                case 81: {
                    constraintSet$Constraint0.e.o0 = typedArray0.getBoolean(v2, constraintSet$Constraint0.e.o0);
                    break;
                }
                case 82: {
                    constraintSet$Constraint0.d.c = typedArray0.getInteger(v2, constraintSet$Constraint0.d.c);
                    break;
                }
                case 83: {
                    constraintSet$Constraint0.f.i = ConstraintSet.A0(typedArray0, v2, constraintSet$Constraint0.f.i);
                    break;
                }
                case 84: {
                    constraintSet$Constraint0.d.k = typedArray0.getInteger(v2, constraintSet$Constraint0.d.k);
                    break;
                }
                case 85: {
                    constraintSet$Constraint0.d.j = typedArray0.getFloat(v2, constraintSet$Constraint0.d.j);
                    break;
                }
                case 86: {
                    int v3 = typedArray0.peekValue(v2).type;
                    if(v3 == 1) {
                        constraintSet$Constraint0.d.n = typedArray0.getResourceId(v2, -1);
                        Motion constraintSet$Motion0 = constraintSet$Constraint0.d;
                        if(constraintSet$Motion0.n != -1) {
                            constraintSet$Motion0.m = -2;
                        }
                    }
                    else if(v3 == 3) {
                        constraintSet$Constraint0.d.l = typedArray0.getString(v2);
                        if(constraintSet$Constraint0.d.l.indexOf("/") > 0) {
                            constraintSet$Constraint0.d.n = typedArray0.getResourceId(v2, -1);
                            constraintSet$Constraint0.d.m = -2;
                        }
                        else {
                            constraintSet$Constraint0.d.m = -1;
                        }
                    }
                    else {
                        constraintSet$Constraint0.d.m = typedArray0.getInteger(v2, constraintSet$Constraint0.d.n);
                    }
                    break;
                }
                case 87: {
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(v2) + "   " + ConstraintSet.X.get(v2));
                    break;
                }
                case 91: {
                    constraintSet$Constraint0.e.s = ConstraintSet.A0(typedArray0, v2, constraintSet$Constraint0.e.s);
                    break;
                }
                case 92: {
                    constraintSet$Constraint0.e.t = ConstraintSet.A0(typedArray0, v2, constraintSet$Constraint0.e.t);
                    break;
                }
                case 93: {
                    constraintSet$Constraint0.e.N = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.N);
                    break;
                }
                case 94: {
                    constraintSet$Constraint0.e.U = typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.U);
                    break;
                }
                case 0x5F: {
                    ConstraintSet.D0(constraintSet$Constraint0.e, typedArray0, v2, 0);
                    break;
                }
                case 0x60: {
                    ConstraintSet.D0(constraintSet$Constraint0.e, typedArray0, v2, 1);
                    break;
                }
                case 97: {
                    constraintSet$Constraint0.e.q0 = typedArray0.getInt(v2, constraintSet$Constraint0.e.q0);
                    break;
                }
                default: {
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(v2) + "   " + ConstraintSet.X.get(v2));
                }
            }
        }
        Layout constraintSet$Layout0 = constraintSet$Constraint0.e;
        if(constraintSet$Layout0.l0 != null) {
            constraintSet$Layout0.k0 = null;
        }
    }

    public void J1(int v, int v1) {
        this.i0(v).c.c = v1;
    }

    public void K(int v, int v1, int v2, int v3) {
        if(!this.h.containsKey(v)) {
            this.h.put(v, new Constraint());
        }
        Constraint constraintSet$Constraint0 = (Constraint)this.h.get(v);
        if(constraintSet$Constraint0 == null) {
            return;
        }
        switch(v1) {
            case 1: {
                if(v3 == 1) {
                    constraintSet$Constraint0.e.j = v2;
                    constraintSet$Constraint0.e.k = -1;
                    return;
                }
                if(v3 != 2) {
                    throw new IllegalArgumentException("left to " + this.K1(v3) + " undefined");
                }
                constraintSet$Constraint0.e.k = v2;
                constraintSet$Constraint0.e.j = -1;
                return;
            }
            case 2: {
                if(v3 == 1) {
                    constraintSet$Constraint0.e.l = v2;
                    constraintSet$Constraint0.e.m = -1;
                    return;
                }
                if(v3 != 2) {
                    throw new IllegalArgumentException("right to " + this.K1(v3) + " undefined");
                }
                constraintSet$Constraint0.e.m = v2;
                constraintSet$Constraint0.e.l = -1;
                return;
            }
            case 3: {
                if(v3 == 3) {
                    constraintSet$Constraint0.e.n = v2;
                    constraintSet$Constraint0.e.o = -1;
                    constraintSet$Constraint0.e.r = -1;
                    constraintSet$Constraint0.e.s = -1;
                    constraintSet$Constraint0.e.t = -1;
                    return;
                }
                if(v3 != 4) {
                    throw new IllegalArgumentException("right to " + this.K1(v3) + " undefined");
                }
                constraintSet$Constraint0.e.o = v2;
                constraintSet$Constraint0.e.n = -1;
                constraintSet$Constraint0.e.r = -1;
                constraintSet$Constraint0.e.s = -1;
                constraintSet$Constraint0.e.t = -1;
                return;
            }
            case 4: {
                if(v3 == 4) {
                    constraintSet$Constraint0.e.q = v2;
                    constraintSet$Constraint0.e.p = -1;
                    constraintSet$Constraint0.e.r = -1;
                    constraintSet$Constraint0.e.s = -1;
                    constraintSet$Constraint0.e.t = -1;
                    return;
                }
                if(v3 != 3) {
                    throw new IllegalArgumentException("right to " + this.K1(v3) + " undefined");
                }
                constraintSet$Constraint0.e.p = v2;
                constraintSet$Constraint0.e.q = -1;
                constraintSet$Constraint0.e.r = -1;
                constraintSet$Constraint0.e.s = -1;
                constraintSet$Constraint0.e.t = -1;
                return;
            }
            case 5: {
                switch(v3) {
                    case 3: {
                        constraintSet$Constraint0.e.s = v2;
                        constraintSet$Constraint0.e.q = -1;
                        constraintSet$Constraint0.e.p = -1;
                        constraintSet$Constraint0.e.n = -1;
                        constraintSet$Constraint0.e.o = -1;
                        return;
                    }
                    case 4: {
                        constraintSet$Constraint0.e.t = v2;
                        constraintSet$Constraint0.e.q = -1;
                        constraintSet$Constraint0.e.p = -1;
                        constraintSet$Constraint0.e.n = -1;
                        constraintSet$Constraint0.e.o = -1;
                        return;
                    }
                    case 5: {
                        constraintSet$Constraint0.e.r = v2;
                        constraintSet$Constraint0.e.q = -1;
                        constraintSet$Constraint0.e.p = -1;
                        constraintSet$Constraint0.e.n = -1;
                        constraintSet$Constraint0.e.o = -1;
                        return;
                    }
                    default: {
                        throw new IllegalArgumentException("right to " + this.K1(v3) + " undefined");
                    }
                }
            }
            case 6: {
                if(v3 == 6) {
                    constraintSet$Constraint0.e.v = v2;
                    constraintSet$Constraint0.e.u = -1;
                    return;
                }
                if(v3 != 7) {
                    throw new IllegalArgumentException("right to " + this.K1(v3) + " undefined");
                }
                constraintSet$Constraint0.e.u = v2;
                constraintSet$Constraint0.e.v = -1;
                return;
            }
            case 7: {
                if(v3 == 7) {
                    constraintSet$Constraint0.e.x = v2;
                    constraintSet$Constraint0.e.w = -1;
                    return;
                }
                if(v3 != 6) {
                    throw new IllegalArgumentException("right to " + this.K1(v3) + " undefined");
                }
                constraintSet$Constraint0.e.w = v2;
                constraintSet$Constraint0.e.x = -1;
                return;
            }
            default: {
                throw new IllegalArgumentException(this.K1(v1) + " to " + this.K1(v3) + " unknown");
            }
        }
    }

    private static void K0(Constraint constraintSet$Constraint0, TypedArray typedArray0) {
        int v = typedArray0.getIndexCount();
        Delta constraintSet$Constraint$Delta0 = new Delta();
        constraintSet$Constraint0.h = constraintSet$Constraint$Delta0;
        constraintSet$Constraint0.d.a = false;
        constraintSet$Constraint0.e.b = false;
        constraintSet$Constraint0.c.a = false;
        constraintSet$Constraint0.f.a = false;
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            switch(ConstraintSet.Y.get(v2)) {
                case 2: {
                    constraintSet$Constraint$Delta0.b(2, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.K));
                    break;
                }
                case 5: {
                    constraintSet$Constraint$Delta0.c(5, typedArray0.getString(v2));
                    break;
                }
                case 6: {
                    constraintSet$Constraint$Delta0.b(6, typedArray0.getDimensionPixelOffset(v2, constraintSet$Constraint0.e.E));
                    break;
                }
                case 7: {
                    constraintSet$Constraint$Delta0.b(7, typedArray0.getDimensionPixelOffset(v2, constraintSet$Constraint0.e.F));
                    break;
                }
                case 8: {
                    constraintSet$Constraint$Delta0.b(8, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.L));
                    break;
                }
                case 11: {
                    constraintSet$Constraint$Delta0.b(11, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.R));
                    break;
                }
                case 12: {
                    constraintSet$Constraint$Delta0.b(12, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.S));
                    break;
                }
                case 13: {
                    constraintSet$Constraint$Delta0.b(13, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.O));
                    break;
                }
                case 14: {
                    constraintSet$Constraint$Delta0.b(14, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.Q));
                    break;
                }
                case 15: {
                    constraintSet$Constraint$Delta0.b(15, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.T));
                    break;
                }
                case 16: {
                    constraintSet$Constraint$Delta0.b(16, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.P));
                    break;
                }
                case 17: {
                    constraintSet$Constraint$Delta0.b(17, typedArray0.getDimensionPixelOffset(v2, constraintSet$Constraint0.e.f));
                    break;
                }
                case 18: {
                    constraintSet$Constraint$Delta0.b(18, typedArray0.getDimensionPixelOffset(v2, constraintSet$Constraint0.e.g));
                    break;
                }
                case 19: {
                    constraintSet$Constraint$Delta0.a(19, typedArray0.getFloat(v2, constraintSet$Constraint0.e.h));
                    break;
                }
                case 20: {
                    constraintSet$Constraint$Delta0.a(20, typedArray0.getFloat(v2, constraintSet$Constraint0.e.y));
                    break;
                }
                case 21: {
                    constraintSet$Constraint$Delta0.b(21, typedArray0.getLayoutDimension(v2, constraintSet$Constraint0.e.e));
                    break;
                }
                case 22: {
                    constraintSet$Constraint$Delta0.b(22, ConstraintSet.V[typedArray0.getInt(v2, constraintSet$Constraint0.c.b)]);
                    break;
                }
                case 23: {
                    constraintSet$Constraint$Delta0.b(23, typedArray0.getLayoutDimension(v2, constraintSet$Constraint0.e.d));
                    break;
                }
                case 24: {
                    constraintSet$Constraint$Delta0.b(24, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.H));
                    break;
                }
                case 27: {
                    constraintSet$Constraint$Delta0.b(27, typedArray0.getInt(v2, constraintSet$Constraint0.e.G));
                    break;
                }
                case 28: {
                    constraintSet$Constraint$Delta0.b(28, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.I));
                    break;
                }
                case 0x1F: {
                    constraintSet$Constraint$Delta0.b(0x1F, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.M));
                    break;
                }
                case 34: {
                    constraintSet$Constraint$Delta0.b(34, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.J));
                    break;
                }
                case 37: {
                    constraintSet$Constraint$Delta0.a(37, typedArray0.getFloat(v2, constraintSet$Constraint0.e.z));
                    break;
                }
                case 38: {
                    int v3 = typedArray0.getResourceId(v2, constraintSet$Constraint0.a);
                    constraintSet$Constraint0.a = v3;
                    constraintSet$Constraint$Delta0.b(38, v3);
                    break;
                }
                case 39: {
                    constraintSet$Constraint$Delta0.a(39, typedArray0.getFloat(v2, constraintSet$Constraint0.e.W));
                    break;
                }
                case 40: {
                    constraintSet$Constraint$Delta0.a(40, typedArray0.getFloat(v2, constraintSet$Constraint0.e.V));
                    break;
                }
                case 41: {
                    constraintSet$Constraint$Delta0.b(41, typedArray0.getInt(v2, constraintSet$Constraint0.e.X));
                    break;
                }
                case 42: {
                    constraintSet$Constraint$Delta0.b(42, typedArray0.getInt(v2, constraintSet$Constraint0.e.Y));
                    break;
                }
                case 43: {
                    constraintSet$Constraint$Delta0.a(43, typedArray0.getFloat(v2, constraintSet$Constraint0.c.d));
                    break;
                }
                case 44: {
                    constraintSet$Constraint$Delta0.d(44, true);
                    constraintSet$Constraint$Delta0.a(44, typedArray0.getDimension(v2, constraintSet$Constraint0.f.n));
                    break;
                }
                case 45: {
                    constraintSet$Constraint$Delta0.a(45, typedArray0.getFloat(v2, constraintSet$Constraint0.f.c));
                    break;
                }
                case 46: {
                    constraintSet$Constraint$Delta0.a(46, typedArray0.getFloat(v2, constraintSet$Constraint0.f.d));
                    break;
                }
                case 0x2F: {
                    constraintSet$Constraint$Delta0.a(0x2F, typedArray0.getFloat(v2, constraintSet$Constraint0.f.e));
                    break;
                }
                case 0x30: {
                    constraintSet$Constraint$Delta0.a(0x30, typedArray0.getFloat(v2, constraintSet$Constraint0.f.f));
                    break;
                }
                case 49: {
                    constraintSet$Constraint$Delta0.a(49, typedArray0.getDimension(v2, constraintSet$Constraint0.f.g));
                    break;
                }
                case 50: {
                    constraintSet$Constraint$Delta0.a(50, typedArray0.getDimension(v2, constraintSet$Constraint0.f.h));
                    break;
                }
                case 51: {
                    constraintSet$Constraint$Delta0.a(51, typedArray0.getDimension(v2, constraintSet$Constraint0.f.j));
                    break;
                }
                case 52: {
                    constraintSet$Constraint$Delta0.a(52, typedArray0.getDimension(v2, constraintSet$Constraint0.f.k));
                    break;
                }
                case 53: {
                    constraintSet$Constraint$Delta0.a(53, typedArray0.getDimension(v2, constraintSet$Constraint0.f.l));
                    break;
                }
                case 54: {
                    constraintSet$Constraint$Delta0.b(54, typedArray0.getInt(v2, constraintSet$Constraint0.e.Z));
                    break;
                }
                case 55: {
                    constraintSet$Constraint$Delta0.b(55, typedArray0.getInt(v2, constraintSet$Constraint0.e.a0));
                    break;
                }
                case 56: {
                    constraintSet$Constraint$Delta0.b(56, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.b0));
                    break;
                }
                case 57: {
                    constraintSet$Constraint$Delta0.b(57, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.c0));
                    break;
                }
                case 58: {
                    constraintSet$Constraint$Delta0.b(58, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.d0));
                    break;
                }
                case 59: {
                    constraintSet$Constraint$Delta0.b(59, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.e0));
                    break;
                }
                case 60: {
                    constraintSet$Constraint$Delta0.a(60, typedArray0.getFloat(v2, constraintSet$Constraint0.f.b));
                    break;
                }
                case 62: {
                    constraintSet$Constraint$Delta0.b(62, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.C));
                    break;
                }
                case 0x3F: {
                    constraintSet$Constraint$Delta0.a(0x3F, typedArray0.getFloat(v2, constraintSet$Constraint0.e.D));
                    break;
                }
                case 0x40: {
                    constraintSet$Constraint$Delta0.b(0x40, ConstraintSet.A0(typedArray0, v2, constraintSet$Constraint0.d.b));
                    break;
                }
                case 65: {
                    if(typedArray0.peekValue(v2).type == 3) {
                        constraintSet$Constraint$Delta0.c(65, typedArray0.getString(v2));
                    }
                    else {
                        String[] arr_s = Easing.o;
                        constraintSet$Constraint$Delta0.c(65, arr_s[typedArray0.getInteger(v2, 0)]);
                    }
                    break;
                }
                case 66: {
                    constraintSet$Constraint$Delta0.b(66, typedArray0.getInt(v2, 0));
                    break;
                }
                case 67: {
                    constraintSet$Constraint$Delta0.a(67, typedArray0.getFloat(v2, constraintSet$Constraint0.d.i));
                    break;
                }
                case 68: {
                    constraintSet$Constraint$Delta0.a(68, typedArray0.getFloat(v2, constraintSet$Constraint0.c.e));
                    break;
                }
                case 69: {
                    constraintSet$Constraint$Delta0.a(69, typedArray0.getFloat(v2, 1.0f));
                    break;
                }
                case 70: {
                    constraintSet$Constraint$Delta0.a(70, typedArray0.getFloat(v2, 1.0f));
                    break;
                }
                case 71: {
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                }
                case 72: {
                    constraintSet$Constraint$Delta0.b(72, typedArray0.getInt(v2, constraintSet$Constraint0.e.h0));
                    break;
                }
                case 73: {
                    constraintSet$Constraint$Delta0.b(73, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.i0));
                    break;
                }
                case 74: {
                    constraintSet$Constraint$Delta0.c(74, typedArray0.getString(v2));
                    break;
                }
                case 75: {
                    constraintSet$Constraint$Delta0.d(75, typedArray0.getBoolean(v2, constraintSet$Constraint0.e.p0));
                    break;
                }
                case 76: {
                    constraintSet$Constraint$Delta0.b(76, typedArray0.getInt(v2, constraintSet$Constraint0.d.e));
                    break;
                }
                case 77: {
                    constraintSet$Constraint$Delta0.c(77, typedArray0.getString(v2));
                    break;
                }
                case 78: {
                    constraintSet$Constraint$Delta0.b(78, typedArray0.getInt(v2, constraintSet$Constraint0.c.c));
                    break;
                }
                case 0x4F: {
                    constraintSet$Constraint$Delta0.a(0x4F, typedArray0.getFloat(v2, constraintSet$Constraint0.d.g));
                    break;
                }
                case 80: {
                    constraintSet$Constraint$Delta0.d(80, typedArray0.getBoolean(v2, constraintSet$Constraint0.e.n0));
                    break;
                }
                case 81: {
                    constraintSet$Constraint$Delta0.d(81, typedArray0.getBoolean(v2, constraintSet$Constraint0.e.o0));
                    break;
                }
                case 82: {
                    constraintSet$Constraint$Delta0.b(82, typedArray0.getInteger(v2, constraintSet$Constraint0.d.c));
                    break;
                }
                case 83: {
                    constraintSet$Constraint$Delta0.b(83, ConstraintSet.A0(typedArray0, v2, constraintSet$Constraint0.f.i));
                    break;
                }
                case 84: {
                    constraintSet$Constraint$Delta0.b(84, typedArray0.getInteger(v2, constraintSet$Constraint0.d.k));
                    break;
                }
                case 85: {
                    constraintSet$Constraint$Delta0.a(85, typedArray0.getFloat(v2, constraintSet$Constraint0.d.j));
                    break;
                }
                case 86: {
                    int v4 = typedArray0.peekValue(v2).type;
                    if(v4 == 1) {
                        constraintSet$Constraint0.d.n = typedArray0.getResourceId(v2, -1);
                        constraintSet$Constraint$Delta0.b(89, constraintSet$Constraint0.d.n);
                        Motion constraintSet$Motion0 = constraintSet$Constraint0.d;
                        if(constraintSet$Motion0.n != -1) {
                            constraintSet$Motion0.m = -2;
                            constraintSet$Constraint$Delta0.b(88, -2);
                        }
                    }
                    else if(v4 == 3) {
                        constraintSet$Constraint0.d.l = typedArray0.getString(v2);
                        constraintSet$Constraint$Delta0.c(90, constraintSet$Constraint0.d.l);
                        if(constraintSet$Constraint0.d.l.indexOf("/") > 0) {
                            constraintSet$Constraint0.d.n = typedArray0.getResourceId(v2, -1);
                            constraintSet$Constraint$Delta0.b(89, constraintSet$Constraint0.d.n);
                            constraintSet$Constraint0.d.m = -2;
                            constraintSet$Constraint$Delta0.b(88, -2);
                        }
                        else {
                            constraintSet$Constraint0.d.m = -1;
                            constraintSet$Constraint$Delta0.b(88, -1);
                        }
                    }
                    else {
                        constraintSet$Constraint0.d.m = typedArray0.getInteger(v2, constraintSet$Constraint0.d.n);
                        constraintSet$Constraint$Delta0.b(88, constraintSet$Constraint0.d.m);
                    }
                    break;
                }
                case 87: {
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(v2) + "   " + ConstraintSet.X.get(v2));
                    break;
                }
                case 93: {
                    constraintSet$Constraint$Delta0.b(93, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.N));
                    break;
                }
                case 94: {
                    constraintSet$Constraint$Delta0.b(94, typedArray0.getDimensionPixelSize(v2, constraintSet$Constraint0.e.U));
                    break;
                }
                case 0x5F: {
                    ConstraintSet.D0(constraintSet$Constraint$Delta0, typedArray0, v2, 0);
                    break;
                }
                case 0x60: {
                    ConstraintSet.D0(constraintSet$Constraint$Delta0, typedArray0, v2, 1);
                    break;
                }
                case 97: {
                    constraintSet$Constraint$Delta0.b(97, typedArray0.getInt(v2, constraintSet$Constraint0.e.q0));
                    break;
                }
                case 98: {
                    if(MotionLayout.G9) {
                        int v5 = typedArray0.getResourceId(v2, constraintSet$Constraint0.a);
                        constraintSet$Constraint0.a = v5;
                        if(v5 == -1) {
                            constraintSet$Constraint0.b = typedArray0.getString(v2);
                        }
                    }
                    else if(typedArray0.peekValue(v2).type == 3) {
                        constraintSet$Constraint0.b = typedArray0.getString(v2);
                    }
                    else {
                        constraintSet$Constraint0.a = typedArray0.getResourceId(v2, constraintSet$Constraint0.a);
                    }
                    break;
                }
                case 99: {
                    constraintSet$Constraint$Delta0.d(99, typedArray0.getBoolean(v2, constraintSet$Constraint0.e.i));
                    break;
                }
                default: {
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(v2) + "   " + ConstraintSet.X.get(v2));
                }
            }
        }
    }

    private String K1(int v) {
        switch(v) {
            case 1: {
                return "left";
            }
            case 2: {
                return "right";
            }
            case 3: {
                return "top";
            }
            case 4: {
                return "bottom";
            }
            case 5: {
                return "baseline";
            }
            case 6: {
                return "start";
            }
            case 7: {
                return "end";
            }
            default: {
                return "undefined";
            }
        }
    }

    public void L(int v, int v1, int v2, int v3, int v4) {
        if(!this.h.containsKey(v)) {
            this.h.put(v, new Constraint());
        }
        Constraint constraintSet$Constraint0 = (Constraint)this.h.get(v);
        if(constraintSet$Constraint0 == null) {
            return;
        }
        switch(v1) {
            case 1: {
                if(v3 == 1) {
                    constraintSet$Constraint0.e.j = v2;
                    constraintSet$Constraint0.e.k = -1;
                }
                else if(v3 == 2) {
                    constraintSet$Constraint0.e.k = v2;
                    constraintSet$Constraint0.e.j = -1;
                }
                else {
                    throw new IllegalArgumentException("Left to " + this.K1(v3) + " undefined");
                }
                constraintSet$Constraint0.e.H = v4;
                return;
            }
            case 2: {
                if(v3 == 1) {
                    constraintSet$Constraint0.e.l = v2;
                    constraintSet$Constraint0.e.m = -1;
                }
                else if(v3 == 2) {
                    constraintSet$Constraint0.e.m = v2;
                    constraintSet$Constraint0.e.l = -1;
                }
                else {
                    throw new IllegalArgumentException("right to " + this.K1(v3) + " undefined");
                }
                constraintSet$Constraint0.e.I = v4;
                return;
            }
            case 3: {
                if(v3 == 3) {
                    constraintSet$Constraint0.e.n = v2;
                    constraintSet$Constraint0.e.o = -1;
                    constraintSet$Constraint0.e.r = -1;
                    constraintSet$Constraint0.e.s = -1;
                    constraintSet$Constraint0.e.t = -1;
                }
                else if(v3 == 4) {
                    constraintSet$Constraint0.e.o = v2;
                    constraintSet$Constraint0.e.n = -1;
                    constraintSet$Constraint0.e.r = -1;
                    constraintSet$Constraint0.e.s = -1;
                    constraintSet$Constraint0.e.t = -1;
                }
                else {
                    throw new IllegalArgumentException("right to " + this.K1(v3) + " undefined");
                }
                constraintSet$Constraint0.e.J = v4;
                return;
            }
            case 4: {
                if(v3 == 4) {
                    constraintSet$Constraint0.e.q = v2;
                    constraintSet$Constraint0.e.p = -1;
                    constraintSet$Constraint0.e.r = -1;
                    constraintSet$Constraint0.e.s = -1;
                    constraintSet$Constraint0.e.t = -1;
                }
                else if(v3 == 3) {
                    constraintSet$Constraint0.e.p = v2;
                    constraintSet$Constraint0.e.q = -1;
                    constraintSet$Constraint0.e.r = -1;
                    constraintSet$Constraint0.e.s = -1;
                    constraintSet$Constraint0.e.t = -1;
                }
                else {
                    throw new IllegalArgumentException("right to " + this.K1(v3) + " undefined");
                }
                constraintSet$Constraint0.e.K = v4;
                return;
            }
            case 5: {
                switch(v3) {
                    case 3: {
                        constraintSet$Constraint0.e.s = v2;
                        constraintSet$Constraint0.e.q = -1;
                        constraintSet$Constraint0.e.p = -1;
                        constraintSet$Constraint0.e.n = -1;
                        constraintSet$Constraint0.e.o = -1;
                        return;
                    }
                    case 4: {
                        constraintSet$Constraint0.e.t = v2;
                        constraintSet$Constraint0.e.q = -1;
                        constraintSet$Constraint0.e.p = -1;
                        constraintSet$Constraint0.e.n = -1;
                        constraintSet$Constraint0.e.o = -1;
                        return;
                    }
                    case 5: {
                        constraintSet$Constraint0.e.r = v2;
                        constraintSet$Constraint0.e.q = -1;
                        constraintSet$Constraint0.e.p = -1;
                        constraintSet$Constraint0.e.n = -1;
                        constraintSet$Constraint0.e.o = -1;
                        return;
                    }
                    default: {
                        throw new IllegalArgumentException("right to " + this.K1(v3) + " undefined");
                    }
                }
            }
            case 6: {
                if(v3 == 6) {
                    constraintSet$Constraint0.e.v = v2;
                    constraintSet$Constraint0.e.u = -1;
                }
                else if(v3 == 7) {
                    constraintSet$Constraint0.e.u = v2;
                    constraintSet$Constraint0.e.v = -1;
                }
                else {
                    throw new IllegalArgumentException("right to " + this.K1(v3) + " undefined");
                }
                constraintSet$Constraint0.e.M = v4;
                return;
            }
            case 7: {
                if(v3 == 7) {
                    constraintSet$Constraint0.e.x = v2;
                    constraintSet$Constraint0.e.w = -1;
                }
                else if(v3 == 6) {
                    constraintSet$Constraint0.e.w = v2;
                    constraintSet$Constraint0.e.x = -1;
                }
                else {
                    throw new IllegalArgumentException("right to " + this.K1(v3) + " undefined");
                }
                constraintSet$Constraint0.e.L = v4;
                return;
            }
            default: {
                throw new IllegalArgumentException(this.K1(v1) + " to " + this.K1(v3) + " unknown");
            }
        }
    }

    public void L0(ConstraintLayout constraintLayout0) {
        int v = constraintLayout0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = constraintLayout0.getChildAt(v1);
            LayoutParams constraintLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            int v2 = view0.getId();
            if(this.g && v2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if(!this.h.containsKey(v2)) {
                this.h.put(v2, new Constraint());
            }
            Constraint constraintSet$Constraint0 = (Constraint)this.h.get(v2);
            if(constraintSet$Constraint0 != null) {
                if(!constraintSet$Constraint0.e.b) {
                    constraintSet$Constraint0.k(v2, constraintLayout$LayoutParams0);
                    if(view0 instanceof ConstraintHelper) {
                        constraintSet$Constraint0.e.k0 = ((ConstraintHelper)view0).getReferencedIds();
                        if(view0 instanceof Barrier) {
                            constraintSet$Constraint0.e.p0 = ((Barrier)view0).getAllowsGoneWidget();
                            constraintSet$Constraint0.e.h0 = ((Barrier)view0).getType();
                            constraintSet$Constraint0.e.i0 = ((Barrier)view0).getMargin();
                        }
                    }
                    constraintSet$Constraint0.e.b = true;
                }
                PropertySet constraintSet$PropertySet0 = constraintSet$Constraint0.c;
                if(!constraintSet$PropertySet0.a) {
                    constraintSet$PropertySet0.b = view0.getVisibility();
                    constraintSet$Constraint0.c.d = view0.getAlpha();
                    constraintSet$Constraint0.c.a = true;
                }
                Transform constraintSet$Transform0 = constraintSet$Constraint0.f;
                if(!constraintSet$Transform0.a) {
                    constraintSet$Transform0.a = true;
                    constraintSet$Transform0.b = view0.getRotation();
                    constraintSet$Constraint0.f.c = view0.getRotationX();
                    constraintSet$Constraint0.f.d = view0.getRotationY();
                    constraintSet$Constraint0.f.e = view0.getScaleX();
                    constraintSet$Constraint0.f.f = view0.getScaleY();
                    float f = view0.getPivotX();
                    float f1 = view0.getPivotY();
                    if(((double)f) != 0.0 || ((double)f1) != 0.0) {
                        constraintSet$Constraint0.f.g = f;
                        constraintSet$Constraint0.f.h = f1;
                    }
                    constraintSet$Constraint0.f.j = view0.getTranslationX();
                    constraintSet$Constraint0.f.k = view0.getTranslationY();
                    constraintSet$Constraint0.f.l = view0.getTranslationZ();
                    Transform constraintSet$Transform1 = constraintSet$Constraint0.f;
                    if(constraintSet$Transform1.m) {
                        constraintSet$Transform1.n = view0.getElevation();
                    }
                }
            }
        }
    }

    private static String[] L1(String s) {
        char[] arr_c = s.toCharArray();
        ArrayList arrayList0 = new ArrayList();
        int v1 = 0;
        int v2 = 0;
        for(int v = 0; v < arr_c.length; ++v) {
            int v3 = arr_c[v];
            if(v3 == 44 && v2 == 0) {
                arrayList0.add(new String(arr_c, v1, v - v1));
                v1 = v + 1;
            }
            else if(v3 == 34) {
                v2 ^= 1;
            }
        }
        arrayList0.add(new String(arr_c, v1, arr_c.length - v1));
        return (String[])arrayList0.toArray(new String[arrayList0.size()]);
    }

    public void M(int v, int v1, int v2, float f) {
        Constraint constraintSet$Constraint0 = this.i0(v);
        constraintSet$Constraint0.e.B = v1;
        constraintSet$Constraint0.e.C = v2;
        constraintSet$Constraint0.e.D = f;
    }

    public void M0(ConstraintSet constraintSet0) {
        for(Object object0: constraintSet0.h.keySet()) {
            Integer integer0 = (Integer)object0;
            integer0.intValue();
            Constraint constraintSet$Constraint0 = (Constraint)constraintSet0.h.get(integer0);
            if(!this.h.containsKey(integer0)) {
                this.h.put(integer0, new Constraint());
            }
            Constraint constraintSet$Constraint1 = (Constraint)this.h.get(integer0);
            if(constraintSet$Constraint1 != null) {
                Layout constraintSet$Layout0 = constraintSet$Constraint1.e;
                if(!constraintSet$Layout0.b) {
                    constraintSet$Layout0.a(constraintSet$Constraint0.e);
                }
                PropertySet constraintSet$PropertySet0 = constraintSet$Constraint1.c;
                if(!constraintSet$PropertySet0.a) {
                    constraintSet$PropertySet0.a(constraintSet$Constraint0.c);
                }
                Transform constraintSet$Transform0 = constraintSet$Constraint1.f;
                if(!constraintSet$Transform0.a) {
                    constraintSet$Transform0.a(constraintSet$Constraint0.f);
                }
                Motion constraintSet$Motion0 = constraintSet$Constraint1.d;
                if(!constraintSet$Motion0.a) {
                    constraintSet$Motion0.a(constraintSet$Constraint0.d);
                }
                for(Object object1: constraintSet$Constraint0.g.keySet()) {
                    String s = (String)object1;
                    if(!constraintSet$Constraint1.g.containsKey(s)) {
                        constraintSet$Constraint1.g.put(s, ((ConstraintAttribute)constraintSet$Constraint0.g.get(s)));
                    }
                }
            }
        }
    }

    public void M1(Writer writer0, ConstraintLayout constraintLayout0, int v) throws IOException {
        writer0.write("\n---------------------------------------------\n");
        if((v & 1) == 1) {
            new WriteXmlEngine(this, writer0, constraintLayout0, v).i();
        }
        else {
            new WriteJsonEngine(this, writer0, constraintLayout0, v).g();
        }
        writer0.write("\n---------------------------------------------\n");
    }

    public void N(int v, int v1) {
        this.i0(v).e.a0 = v1;
    }

    public void N0(String s) {
        this.f.remove(s);
    }

    public void O(int v, int v1) {
        this.i0(v).e.Z = v1;
    }

    public void O0(int v) {
        if(this.h.containsKey(v)) {
            Constraint constraintSet$Constraint0 = (Constraint)this.h.get(v);
            if(constraintSet$Constraint0 == null) {
                return;
            }
            Layout constraintSet$Layout0 = constraintSet$Constraint0.e;
            int v1 = constraintSet$Layout0.k;
            int v2 = constraintSet$Layout0.l;
            if(v1 == -1 && v2 == -1) {
                int v3 = constraintSet$Layout0.u;
                int v4 = constraintSet$Layout0.w;
                if(v3 != -1 || v4 != -1) {
                    if(v3 != -1 && v4 != -1) {
                        this.L(v3, 7, v4, 6, 0);
                        this.L(v4, 6, -1, 7, 0);
                    }
                    else if(v4 != -1) {
                        int v5 = constraintSet$Layout0.m;
                        if(v5 == -1) {
                            int v6 = constraintSet$Layout0.j;
                            if(v6 != -1) {
                                this.L(v4, 6, v6, 6, 0);
                            }
                        }
                        else {
                            this.L(-1, 7, v5, 7, 0);
                        }
                    }
                }
                this.F(v, 6);
                this.F(v, 7);
                return;
            }
            if(v1 == -1 || v2 == -1) {
                int v7 = constraintSet$Layout0.m;
                if(v7 == -1) {
                    int v8 = constraintSet$Layout0.j;
                    if(v8 != -1) {
                        this.L(v2, 1, v8, 1, 0);
                    }
                }
                else {
                    this.L(v1, 2, v7, 2, 0);
                }
            }
            else {
                this.L(v1, 2, v2, 1, 0);
                this.L(v2, 1, v1, 2, 0);
            }
            this.F(v, 1);
            this.F(v, 2);
        }
    }

    public void P(int v, int v1) {
        this.i0(v).e.e = v1;
    }

    public void P0(int v) {
        if(this.h.containsKey(v)) {
            Constraint constraintSet$Constraint0 = (Constraint)this.h.get(v);
            if(constraintSet$Constraint0 == null) {
                return;
            }
            Layout constraintSet$Layout0 = constraintSet$Constraint0.e;
            int v1 = constraintSet$Layout0.o;
            int v2 = constraintSet$Layout0.p;
            if(v1 != -1 || v2 != -1) {
                if(v1 == -1 || v2 == -1) {
                    int v3 = constraintSet$Layout0.q;
                    if(v3 == -1) {
                        int v4 = constraintSet$Layout0.n;
                        if(v4 != -1) {
                            this.L(v2, 3, v4, 3, 0);
                        }
                    }
                    else {
                        this.L(v1, 4, v3, 4, 0);
                    }
                }
                else {
                    this.L(v1, 4, v2, 3, 0);
                    this.L(v2, 3, v1, 4, 0);
                }
            }
        }
        this.F(v, 3);
        this.F(v, 4);
    }

    public void Q(int v, int v1) {
        this.i0(v).e.c0 = v1;
    }

    public void Q0(int v, float f) {
        this.i0(v).c.d = f;
    }

    public void R(int v, int v1) {
        this.i0(v).e.b0 = v1;
    }

    public void R0(int v, boolean z) {
        this.i0(v).f.m = z;
    }

    public void S(int v, int v1) {
        this.i0(v).e.e0 = v1;
    }

    public void S0(int v, int v1) {
        this.i0(v).e.j0 = v1;
    }

    public void T(int v, int v1) {
        this.i0(v).e.d0 = v1;
    }

    public void T0(int v, String s, int v1) {
        this.i0(v).p(s, v1);
    }

    public void U(int v, float f) {
        this.i0(v).e.g0 = f;
    }

    private static void U0(Constraint constraintSet$Constraint0, int v, float f) {
        switch(v) {
            case 19: {
                constraintSet$Constraint0.e.h = f;
                break;
            }
            case 20: {
                constraintSet$Constraint0.e.y = f;
                return;
            }
            case 37: {
                constraintSet$Constraint0.e.z = f;
                return;
            }
            case 39: {
                constraintSet$Constraint0.e.W = f;
                return;
            }
            case 40: {
                constraintSet$Constraint0.e.V = f;
                return;
            }
            case 43: {
                constraintSet$Constraint0.c.d = f;
                return;
            }
            case 44: {
                constraintSet$Constraint0.f.n = f;
                constraintSet$Constraint0.f.m = true;
                return;
            }
            case 45: {
                constraintSet$Constraint0.f.c = f;
                return;
            }
            case 46: {
                constraintSet$Constraint0.f.d = f;
                return;
            }
            case 0x2F: {
                constraintSet$Constraint0.f.e = f;
                return;
            }
            case 0x30: {
                constraintSet$Constraint0.f.f = f;
                return;
            }
            case 49: {
                constraintSet$Constraint0.f.g = f;
                return;
            }
            case 50: {
                constraintSet$Constraint0.f.h = f;
                return;
            }
            case 51: {
                constraintSet$Constraint0.f.j = f;
                return;
            }
            case 52: {
                constraintSet$Constraint0.f.k = f;
                return;
            }
            case 53: {
                constraintSet$Constraint0.f.l = f;
                return;
            }
            case 60: {
                constraintSet$Constraint0.f.b = f;
                return;
            }
            case 0x3F: {
                constraintSet$Constraint0.e.D = f;
                return;
            }
            case 67: {
                constraintSet$Constraint0.d.i = f;
                return;
            }
            case 68: {
                constraintSet$Constraint0.c.e = f;
                return;
            }
            case 69: {
                constraintSet$Constraint0.e.f0 = f;
                return;
            }
            case 70: {
                constraintSet$Constraint0.e.g0 = f;
                return;
            }
            case 0x4F: {
                constraintSet$Constraint0.d.g = f;
                return;
            }
            case 85: {
                constraintSet$Constraint0.d.j = f;
                return;
            }
            case 87: {
                break;
            }
            default: {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            }
        }
    }

    public void V(int v, float f) {
        this.i0(v).e.f0 = f;
    }

    private static void V0(Constraint constraintSet$Constraint0, int v, int v1) {
        switch(v) {
            case 2: {
                constraintSet$Constraint0.e.K = v1;
                return;
            }
            case 6: {
                constraintSet$Constraint0.e.E = v1;
                break;
            }
            case 7: {
                constraintSet$Constraint0.e.F = v1;
                return;
            }
            case 8: {
                constraintSet$Constraint0.e.L = v1;
                return;
            }
            case 11: {
                constraintSet$Constraint0.e.R = v1;
                return;
            }
            case 12: {
                constraintSet$Constraint0.e.S = v1;
                return;
            }
            case 13: {
                constraintSet$Constraint0.e.O = v1;
                return;
            }
            case 14: {
                constraintSet$Constraint0.e.Q = v1;
                return;
            }
            case 15: {
                constraintSet$Constraint0.e.T = v1;
                return;
            }
            case 16: {
                constraintSet$Constraint0.e.P = v1;
                return;
            }
            case 17: {
                constraintSet$Constraint0.e.f = v1;
                return;
            }
            case 18: {
                constraintSet$Constraint0.e.g = v1;
                return;
            }
            case 21: {
                constraintSet$Constraint0.e.e = v1;
                return;
            }
            case 22: {
                constraintSet$Constraint0.c.b = v1;
                return;
            }
            case 23: {
                constraintSet$Constraint0.e.d = v1;
                return;
            }
            case 24: {
                constraintSet$Constraint0.e.H = v1;
                return;
            }
            case 27: {
                constraintSet$Constraint0.e.G = v1;
                return;
            }
            case 28: {
                constraintSet$Constraint0.e.I = v1;
                return;
            }
            case 0x1F: {
                constraintSet$Constraint0.e.M = v1;
                return;
            }
            case 34: {
                constraintSet$Constraint0.e.J = v1;
                return;
            }
            case 38: {
                constraintSet$Constraint0.a = v1;
                return;
            }
            case 41: {
                constraintSet$Constraint0.e.X = v1;
                return;
            }
            case 42: {
                constraintSet$Constraint0.e.Y = v1;
                return;
            }
            case 54: {
                constraintSet$Constraint0.e.Z = v1;
                return;
            }
            case 55: {
                constraintSet$Constraint0.e.a0 = v1;
                return;
            }
            case 56: {
                constraintSet$Constraint0.e.b0 = v1;
                return;
            }
            case 57: {
                constraintSet$Constraint0.e.c0 = v1;
                return;
            }
            case 58: {
                constraintSet$Constraint0.e.d0 = v1;
                return;
            }
            case 59: {
                constraintSet$Constraint0.e.e0 = v1;
                return;
            }
            case 61: {
                constraintSet$Constraint0.e.B = v1;
                return;
            }
            case 62: {
                constraintSet$Constraint0.e.C = v1;
                return;
            }
            case 0x40: {
                constraintSet$Constraint0.d.b = v1;
                return;
            }
            case 66: {
                constraintSet$Constraint0.d.f = v1;
                return;
            }
            case 72: {
                constraintSet$Constraint0.e.h0 = v1;
                return;
            }
            case 73: {
                constraintSet$Constraint0.e.i0 = v1;
                return;
            }
            case 76: {
                constraintSet$Constraint0.d.e = v1;
                return;
            }
            case 78: {
                constraintSet$Constraint0.c.c = v1;
                return;
            }
            case 82: {
                constraintSet$Constraint0.d.c = v1;
                return;
            }
            case 83: {
                constraintSet$Constraint0.f.i = v1;
                return;
            }
            case 84: {
                constraintSet$Constraint0.d.k = v1;
                return;
            }
            case 87: {
                break;
            }
            case 88: {
                constraintSet$Constraint0.d.m = v1;
                return;
            }
            case 89: {
                constraintSet$Constraint0.d.n = v1;
                return;
            }
            case 93: {
                constraintSet$Constraint0.e.N = v1;
                return;
            }
            case 94: {
                constraintSet$Constraint0.e.U = v1;
                return;
            }
            case 97: {
                constraintSet$Constraint0.e.q0 = v1;
                return;
            }
            default: {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            }
        }
    }

    public void W(int v, int v1) {
        this.i0(v).e.d = v1;
    }

    private static void W0(Constraint constraintSet$Constraint0, int v, String s) {
        switch(v) {
            case 5: {
                constraintSet$Constraint0.e.A = s;
                break;
            }
            case 65: {
                constraintSet$Constraint0.d.d = s;
                return;
            }
            case 74: {
                constraintSet$Constraint0.e.l0 = s;
                constraintSet$Constraint0.e.k0 = null;
                return;
            }
            case 77: {
                constraintSet$Constraint0.e.m0 = s;
                return;
            }
            case 87: {
                break;
            }
            case 90: {
                constraintSet$Constraint0.d.l = s;
                return;
            }
            default: {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            }
        }
    }

    public void X(int v, boolean z) {
        this.i0(v).e.o0 = z;
    }

    private static void X0(Constraint constraintSet$Constraint0, int v, boolean z) {
        switch(v) {
            case 44: {
                constraintSet$Constraint0.f.m = z;
                break;
            }
            case 75: {
                constraintSet$Constraint0.e.p0 = z;
                return;
            }
            case 80: {
                constraintSet$Constraint0.e.n0 = z;
                return;
            }
            case 81: {
                constraintSet$Constraint0.e.o0 = z;
                return;
            }
            case 87: {
                break;
            }
            default: {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            }
        }
    }

    public void Y(int v, boolean z) {
        this.i0(v).e.n0 = z;
    }

    public void Y0(int v, String s) {
        this.i0(v).e.A = s;
    }

    private int[] Z(View view0, String s) {
        int v2;
        String[] arr_s = s.split(",");
        Context context0 = view0.getContext();
        int[] arr_v = new int[arr_s.length];
        int v = 0;
        int v1;
        for(v1 = 0; v < arr_s.length; ++v1) {
            String s1 = arr_s[v].trim();
            try {
                v2 = 0;
                v2 = id.class.getField(s1).getInt(null);
            }
            catch(Exception unused_ex) {
            }
            if(v2 == 0) {
                v2 = context0.getResources().getIdentifier(s1, "id", "com.dcinside.app.android");
            }
            if(v2 == 0 && view0.isInEditMode() && view0.getParent() instanceof ConstraintLayout) {
                Object object0 = ((ConstraintLayout)view0.getParent()).getDesignInformation(0, s1);
                if(object0 != null && object0 instanceof Integer) {
                    v2 = (int)(((Integer)object0));
                }
            }
            arr_v[v1] = v2;
            ++v;
        }
        return v1 == arr_s.length ? arr_v : Arrays.copyOf(arr_v, v1);
    }

    public void Z0(int v, int v1) {
        this.i0(v).e.E = v1;
    }

    public void a0(int v, int v1) {
        Constraint constraintSet$Constraint0 = this.i0(v);
        constraintSet$Constraint0.e.a = true;
        constraintSet$Constraint0.e.G = v1;
    }

    public void a1(int v, int v1) {
        this.i0(v).e.F = v1;
    }

    public void b0(int v, int v1, int v2, int[] arr_v) {
        Constraint constraintSet$Constraint0 = this.i0(v);
        constraintSet$Constraint0.e.j0 = 1;
        constraintSet$Constraint0.e.h0 = v1;
        constraintSet$Constraint0.e.i0 = v2;
        constraintSet$Constraint0.e.a = false;
        constraintSet$Constraint0.e.k0 = arr_v;
    }

    public void b1(int v, float f) {
        this.i0(v).f.n = f;
        this.i0(v).f.m = true;
    }

    public void c0(int v, int v1, int v2, int v3, int[] arr_v, float[] arr_f, int v4) {
        this.d0(v, v1, v2, v3, arr_v, arr_f, v4, 1, 2);
    }

    public void c1(int v, String s, float f) {
        this.i0(v).q(s, f);
    }

    private void d0(int v, int v1, int v2, int v3, int[] arr_v, float[] arr_f, int v4, int v5, int v6) {
        if(arr_v.length < 2 || arr_f != null && arr_f.length != arr_v.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if(arr_f != null) {
            Constraint constraintSet$Constraint0 = this.i0(arr_v[0]);
            constraintSet$Constraint0.e.W = arr_f[0];
        }
        this.i0(arr_v[0]).e.X = v4;
        this.L(arr_v[0], v5, v, v1, -1);
        for(int v7 = 1; v7 < arr_v.length; ++v7) {
            this.L(arr_v[v7], v5, arr_v[v7 - 1], v6, -1);
            this.L(arr_v[v7 - 1], v6, arr_v[v7], v5, -1);
            if(arr_f != null) {
                Constraint constraintSet$Constraint1 = this.i0(arr_v[v7]);
                constraintSet$Constraint1.e.W = arr_f[v7];
            }
        }
        this.L(arr_v[arr_v.length - 1], v6, v2, v3, -1);
    }

    public void d1(boolean z) {
        this.g = z;
    }

    public void e0(int v, int v1, int v2, int v3, int[] arr_v, float[] arr_f, int v4) {
        this.d0(v, v1, v2, v3, arr_v, arr_f, v4, 6, 7);
    }

    public void e1(int v, int v1, int v2) {
        Constraint constraintSet$Constraint0 = this.i0(v);
        switch(v1) {
            case 1: {
                constraintSet$Constraint0.e.O = v2;
                return;
            }
            case 2: {
                constraintSet$Constraint0.e.Q = v2;
                return;
            }
            case 3: {
                constraintSet$Constraint0.e.P = v2;
                return;
            }
            case 4: {
                constraintSet$Constraint0.e.R = v2;
                return;
            }
            case 5: {
                constraintSet$Constraint0.e.U = v2;
                return;
            }
            case 6: {
                constraintSet$Constraint0.e.T = v2;
                return;
            }
            case 7: {
                constraintSet$Constraint0.e.S = v2;
                return;
            }
            default: {
                throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void f0(int v, int v1, int v2, int v3, int[] arr_v, float[] arr_f, int v4) {
        if(arr_v.length < 2 || arr_f != null && arr_f.length != arr_v.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if(arr_f != null) {
            Constraint constraintSet$Constraint0 = this.i0(arr_v[0]);
            constraintSet$Constraint0.e.V = arr_f[0];
        }
        this.i0(arr_v[0]).e.Y = v4;
        this.L(arr_v[0], 3, v, v1, 0);
        for(int v5 = 1; v5 < arr_v.length; ++v5) {
            this.L(arr_v[v5], 3, arr_v[v5 - 1], 4, 0);
            this.L(arr_v[v5 - 1], 4, arr_v[v5], 3, 0);
            if(arr_f != null) {
                Constraint constraintSet$Constraint1 = this.i0(arr_v[v5]);
                constraintSet$Constraint1.e.V = arr_f[v5];
            }
        }
        this.L(arr_v[arr_v.length - 1], 4, v2, v3, 0);
    }

    public void f1(int v, int v1) {
        this.i0(v).e.f = v1;
        this.i0(v).e.g = -1;
        this.i0(v).e.h = -1.0f;
    }

    public void g0(MotionScene motionScene0, int[] arr_v) {
        HashSet hashSet0;
        Set set0 = this.h.keySet();
        if(arr_v.length == 0) {
            hashSet0 = new HashSet(set0);
        }
        else {
            hashSet0 = new HashSet();
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                hashSet0.add(((int)arr_v[v1]));
            }
        }
        System.out.println(hashSet0.size() + " constraints");
        StringBuilder stringBuilder0 = new StringBuilder();
        Integer[] arr_integer = (Integer[])hashSet0.toArray(new Integer[0]);
        for(int v = 0; v < arr_integer.length; ++v) {
            Integer integer0 = arr_integer[v];
            Constraint constraintSet$Constraint0 = (Constraint)this.h.get(integer0);
            if(constraintSet$Constraint0 != null) {
                stringBuilder0.append("<Constraint id=");
                stringBuilder0.append(integer0);
                stringBuilder0.append(" \n");
                constraintSet$Constraint0.e.b(motionScene0, stringBuilder0);
                stringBuilder0.append("/>\n");
            }
        }
        System.out.println(stringBuilder0.toString());
    }

    public void g1(int v, int v1) {
        this.i0(v).e.g = v1;
        this.i0(v).e.f = -1;
        this.i0(v).e.h = -1.0f;
    }

    private void h(AttributeType constraintAttribute$AttributeType0, String[] arr_s) {
        for(int v = 0; v < arr_s.length; ++v) {
            if(this.f.containsKey(arr_s[v])) {
                ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)this.f.get(arr_s[v]);
                if(constraintAttribute0 != null && constraintAttribute0.j() != constraintAttribute$AttributeType0) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute0.j().name());
                }
            }
            else {
                ConstraintAttribute constraintAttribute1 = new ConstraintAttribute(arr_s[v], constraintAttribute$AttributeType0);
                this.f.put(arr_s[v], constraintAttribute1);
            }
        }
    }

    private Constraint h0(Context context0, AttributeSet attributeSet0, boolean z) {
        Constraint constraintSet$Constraint0 = new Constraint();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, (z ? styleable.ConstraintOverride : styleable.Constraint));
        this.J0(constraintSet$Constraint0, typedArray0, z);
        typedArray0.recycle();
        return constraintSet$Constraint0;
    }

    public void h1(int v, float f) {
        this.i0(v).e.h = f;
        this.i0(v).e.g = -1;
        this.i0(v).e.f = -1;
    }

    public void i(String[] arr_s) {
        this.h(AttributeType.c, arr_s);
    }

    private Constraint i0(int v) {
        if(!this.h.containsKey(v)) {
            this.h.put(v, new Constraint());
        }
        return (Constraint)this.h.get(v);
    }

    public void i1(int v, float f) {
        this.i0(v).e.y = f;
    }

    public void j(String[] arr_s) {
        this.h(AttributeType.b, arr_s);
    }

    public boolean j0(int v) {
        return this.i0(v).f.m;
    }

    public void j1(int v, int v1) {
        this.i0(v).e.X = v1;
    }

    public void k(String[] arr_s) {
        this.h(AttributeType.a, arr_s);
    }

    // 去混淆评级： 低(20)
    public Constraint k0(int v) {
        return this.h.containsKey(v) ? ((Constraint)this.h.get(v)) : null;
    }

    public void k1(int v, float f) {
        this.i0(v).e.W = f;
    }

    public void l(String[] arr_s) {
        this.h(AttributeType.e, arr_s);
    }

    public HashMap l0() {
        return this.f;
    }

    public void l1(int v, String s, int v1) {
        this.i0(v).r(s, v1);
    }

    public void m(int v, int v1, int v2) {
        this.L(v, 1, v1, (v1 == 0 ? 1 : 2), 0);
        this.L(v, 2, v2, (v2 == 0 ? 2 : 1), 0);
        if(v1 != 0) {
            this.L(v1, 2, v, 1, 0);
        }
        if(v2 != 0) {
            this.L(v2, 1, v, 2, 0);
        }
    }

    static String m0(int v) {
        Field[] arr_field = ConstraintSet.class.getDeclaredFields();
        for(int v1 = 0; v1 < arr_field.length; ++v1) {
            Field field0 = arr_field[v1];
            if(field0.getName().contains("_") && field0.getType() == Integer.TYPE && Modifier.isStatic(field0.getModifiers()) && Modifier.isFinal(field0.getModifiers())) {
                try {
                    if(field0.getInt(null) == v) {
                        return field0.getName();
                    }
                }
                catch(IllegalAccessException illegalAccessException0) {
                    Log.e("ConstraintSet", "Error accessing ConstraintSet field", illegalAccessException0);
                }
            }
        }
        return "UNKNOWN";
    }

    public void m1(int v, int v1) {
        if(v1 >= 0 && v1 <= 3) {
            this.i0(v).e.q0 = v1;
        }
    }

    public void n(int v, int v1, int v2) {
        this.L(v, 6, v1, (v1 == 0 ? 6 : 7), 0);
        this.L(v, 7, v2, (v2 == 0 ? 7 : 6), 0);
        if(v1 != 0) {
            this.L(v1, 7, v, 6, 0);
        }
        if(v2 != 0) {
            this.L(v2, 6, v, 7, 0);
        }
    }

    public int n0(int v) {
        return this.i0(v).e.e;
    }

    public void n1(int v, int v1, int v2) {
        Constraint constraintSet$Constraint0 = this.i0(v);
        switch(v1) {
            case 1: {
                constraintSet$Constraint0.e.H = v2;
                return;
            }
            case 2: {
                constraintSet$Constraint0.e.I = v2;
                return;
            }
            case 3: {
                constraintSet$Constraint0.e.J = v2;
                return;
            }
            case 4: {
                constraintSet$Constraint0.e.K = v2;
                return;
            }
            case 5: {
                constraintSet$Constraint0.e.N = v2;
                return;
            }
            case 6: {
                constraintSet$Constraint0.e.M = v2;
                return;
            }
            case 7: {
                constraintSet$Constraint0.e.L = v2;
                return;
            }
            default: {
                throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void o(int v, int v1, int v2) {
        this.L(v, 3, v1, (v1 == 0 ? 3 : 4), 0);
        this.L(v, 4, v2, (v2 == 0 ? 4 : 3), 0);
        if(v1 != 0) {
            this.L(v1, 4, v, 3, 0);
        }
        if(v2 != 0) {
            this.L(v2, 3, v, 4, 0);
        }
    }

    public int[] o0() {
        Integer[] arr_integer = (Integer[])this.h.keySet().toArray(new Integer[0]);
        int[] arr_v = new int[arr_integer.length];
        for(int v = 0; v < arr_integer.length; ++v) {
            arr_v[v] = (int)arr_integer[v];
        }
        return arr_v;
    }

    public void o1(int v, int[] arr_v) {
        this.i0(v).e.k0 = arr_v;
    }

    public void p(ConstraintLayout constraintLayout0) {
        int v = constraintLayout0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = constraintLayout0.getChildAt(v1);
            int v2 = view0.getId();
            if(this.h.containsKey(v2)) {
                if(this.g && v2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if(this.h.containsKey(v2)) {
                    Constraint constraintSet$Constraint0 = (Constraint)this.h.get(v2);
                    if(constraintSet$Constraint0 != null) {
                        ConstraintAttribute.r(view0, constraintSet$Constraint0.g);
                    }
                }
            }
            else {
                Log.w("ConstraintSet", "id unknown " + Debug.k(view0));
            }
        }
    }

    static String p0(Context context0, int v, XmlPullParser xmlPullParser0) {
        return ".(" + Debug.i(context0, v) + ".xml:" + xmlPullParser0.getLineNumber() + ") \"" + xmlPullParser0.getName() + "\"";
    }

    public void p1(int v, float f) {
        this.i0(v).f.b = f;
    }

    public void q(ConstraintSet constraintSet0) {
        for(Object object0: constraintSet0.h.values()) {
            Constraint constraintSet$Constraint0 = (Constraint)object0;
            if(constraintSet$Constraint0.h == null) {
            }
            else if(constraintSet$Constraint0.b == null) {
                Constraint constraintSet$Constraint1 = this.k0(constraintSet$Constraint0.a);
                constraintSet$Constraint0.h.e(constraintSet$Constraint1);
            }
            else {
                for(Object object1: this.h.keySet()) {
                    Constraint constraintSet$Constraint2 = this.k0(((int)(((Integer)object1))));
                    String s = constraintSet$Constraint2.e.m0;
                    if(s != null && constraintSet$Constraint0.b.matches(s)) {
                        constraintSet$Constraint0.h.e(constraintSet$Constraint2);
                        HashMap hashMap0 = (HashMap)constraintSet$Constraint0.g.clone();
                        constraintSet$Constraint2.g.putAll(hashMap0);
                    }
                }
            }
        }
    }

    public Constraint q0(int v) {
        return this.i0(v);
    }

    public void q1(int v, float f) {
        this.i0(v).f.c = f;
    }

    public void r(ConstraintLayout constraintLayout0) {
        this.t(constraintLayout0, true);
        constraintLayout0.setConstraintSet(null);
        constraintLayout0.requestLayout();
    }

    public int[] r0(int v) {
        int[] arr_v = this.i0(v).e.k0;
        return arr_v == null ? new int[0] : Arrays.copyOf(arr_v, arr_v.length);
    }

    public void r1(int v, float f) {
        this.i0(v).f.d = f;
    }

    public void s(ConstraintHelper constraintHelper0, ConstraintWidget constraintWidget0, LayoutParams constraintLayout$LayoutParams0, SparseArray sparseArray0) {
        int v = constraintHelper0.getId();
        if(this.h.containsKey(v)) {
            Constraint constraintSet$Constraint0 = (Constraint)this.h.get(v);
            if(constraintSet$Constraint0 != null && constraintWidget0 instanceof HelperWidget) {
                constraintHelper0.B(constraintSet$Constraint0, ((HelperWidget)constraintWidget0), constraintLayout$LayoutParams0, sparseArray0);
            }
        }
    }

    public String[] s0() {
        return (String[])Arrays.copyOf(this.d, this.d.length);
    }

    public void s1(int v, float f) {
        this.i0(v).f.e = f;
    }

    void t(ConstraintLayout constraintLayout0, boolean z) {
        int v = constraintLayout0.getChildCount();
        HashSet hashSet0 = new HashSet(this.h.keySet());
        for(int v2 = 0; v2 < v; ++v2) {
            View view0 = constraintLayout0.getChildAt(v2);
            int v3 = view0.getId();
            if(this.h.containsKey(v3)) {
                if(this.g && v3 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if(v3 != -1) {
                    if(this.h.containsKey(v3)) {
                        hashSet0.remove(v3);
                        Constraint constraintSet$Constraint0 = (Constraint)this.h.get(v3);
                        if(constraintSet$Constraint0 != null) {
                            if(view0 instanceof Barrier) {
                                constraintSet$Constraint0.e.j0 = 1;
                                ((Barrier)view0).setId(v3);
                                ((Barrier)view0).setType(constraintSet$Constraint0.e.h0);
                                ((Barrier)view0).setMargin(constraintSet$Constraint0.e.i0);
                                ((Barrier)view0).setAllowsGoneWidget(constraintSet$Constraint0.e.p0);
                                Layout constraintSet$Layout0 = constraintSet$Constraint0.e;
                                int[] arr_v = constraintSet$Layout0.k0;
                                if(arr_v == null) {
                                    String s = constraintSet$Layout0.l0;
                                    if(s != null) {
                                        constraintSet$Layout0.k0 = this.Z(((Barrier)view0), s);
                                        ((Barrier)view0).setReferencedIds(constraintSet$Constraint0.e.k0);
                                    }
                                }
                                else {
                                    ((Barrier)view0).setReferencedIds(arr_v);
                                }
                            }
                            LayoutParams constraintLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                            constraintLayout$LayoutParams0.e();
                            constraintSet$Constraint0.i(constraintLayout$LayoutParams0);
                            if(z) {
                                ConstraintAttribute.r(view0, constraintSet$Constraint0.g);
                            }
                            view0.setLayoutParams(constraintLayout$LayoutParams0);
                            PropertySet constraintSet$PropertySet0 = constraintSet$Constraint0.c;
                            if(constraintSet$PropertySet0.c == 0) {
                                view0.setVisibility(constraintSet$PropertySet0.b);
                            }
                            view0.setAlpha(constraintSet$Constraint0.c.d);
                            view0.setRotation(constraintSet$Constraint0.f.b);
                            view0.setRotationX(constraintSet$Constraint0.f.c);
                            view0.setRotationY(constraintSet$Constraint0.f.d);
                            view0.setScaleX(constraintSet$Constraint0.f.e);
                            view0.setScaleY(constraintSet$Constraint0.f.f);
                            Transform constraintSet$Transform0 = constraintSet$Constraint0.f;
                            if(constraintSet$Transform0.i == -1) {
                                if(!Float.isNaN(constraintSet$Transform0.g)) {
                                    view0.setPivotX(constraintSet$Constraint0.f.g);
                                }
                                if(!Float.isNaN(constraintSet$Constraint0.f.h)) {
                                    view0.setPivotY(constraintSet$Constraint0.f.h);
                                }
                            }
                            else {
                                View view1 = ((View)view0.getParent()).findViewById(constraintSet$Constraint0.f.i);
                                if(view1 != null) {
                                    float f = ((float)(view1.getTop() + view1.getBottom())) / 2.0f;
                                    float f1 = ((float)(view1.getLeft() + view1.getRight())) / 2.0f;
                                    if(view0.getRight() - view0.getLeft() > 0 && view0.getBottom() - view0.getTop() > 0) {
                                        float f2 = f1 - ((float)view0.getLeft());
                                        float f3 = f - ((float)view0.getTop());
                                        view0.setPivotX(f2);
                                        view0.setPivotY(f3);
                                    }
                                }
                            }
                            view0.setTranslationX(constraintSet$Constraint0.f.j);
                            view0.setTranslationY(constraintSet$Constraint0.f.k);
                            view0.setTranslationZ(constraintSet$Constraint0.f.l);
                            Transform constraintSet$Transform1 = constraintSet$Constraint0.f;
                            if(constraintSet$Transform1.m) {
                                view0.setElevation(constraintSet$Transform1.n);
                            }
                        }
                    }
                    else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + v3);
                    }
                }
            }
            else {
                Log.w("ConstraintSet", "id unknown " + Debug.k(view0));
            }
        }
        for(Object object0: hashSet0) {
            Integer integer0 = (Integer)object0;
            Constraint constraintSet$Constraint1 = (Constraint)this.h.get(integer0);
            if(constraintSet$Constraint1 != null) {
                if(constraintSet$Constraint1.e.j0 == 1) {
                    Barrier barrier0 = new Barrier(constraintLayout0.getContext());
                    barrier0.setId(((int)integer0));
                    Layout constraintSet$Layout1 = constraintSet$Constraint1.e;
                    int[] arr_v1 = constraintSet$Layout1.k0;
                    if(arr_v1 == null) {
                        String s1 = constraintSet$Layout1.l0;
                        if(s1 != null) {
                            constraintSet$Layout1.k0 = this.Z(barrier0, s1);
                            barrier0.setReferencedIds(constraintSet$Constraint1.e.k0);
                        }
                    }
                    else {
                        barrier0.setReferencedIds(arr_v1);
                    }
                    barrier0.setType(constraintSet$Constraint1.e.h0);
                    barrier0.setMargin(constraintSet$Constraint1.e.i0);
                    LayoutParams constraintLayout$LayoutParams1 = constraintLayout0.generateDefaultLayoutParams();
                    barrier0.K();
                    constraintSet$Constraint1.i(constraintLayout$LayoutParams1);
                    constraintLayout0.addView(barrier0, constraintLayout$LayoutParams1);
                }
                if(constraintSet$Constraint1.e.a) {
                    Guideline guideline0 = new Guideline(constraintLayout0.getContext());
                    guideline0.setId(((int)integer0));
                    LayoutParams constraintLayout$LayoutParams2 = constraintLayout0.generateDefaultLayoutParams();
                    constraintSet$Constraint1.i(constraintLayout$LayoutParams2);
                    constraintLayout0.addView(guideline0, constraintLayout$LayoutParams2);
                }
            }
        }
        for(int v1 = 0; v1 < v; ++v1) {
            View view2 = constraintLayout0.getChildAt(v1);
            if(view2 instanceof ConstraintHelper) {
                ((ConstraintHelper)view2).s(constraintLayout0);
            }
        }
    }

    public int t0(int v) {
        return this.i0(v).c.b;
    }

    public void t1(int v, float f) {
        this.i0(v).f.f = f;
    }

    public void u(int v, LayoutParams constraintLayout$LayoutParams0) {
        if(this.h.containsKey(v)) {
            Constraint constraintSet$Constraint0 = (Constraint)this.h.get(v);
            if(constraintSet$Constraint0 != null) {
                constraintSet$Constraint0.i(constraintLayout$LayoutParams0);
            }
        }
    }

    public int u0(int v) {
        return this.i0(v).c.c;
    }

    public void u1(String s) {
        this.d = s.split(",");
        for(int v = 0; true; ++v) {
            String[] arr_s = this.d;
            if(v >= arr_s.length) {
                break;
            }
            arr_s[v] = arr_s[v].trim();
        }
    }

    public void v(ConstraintLayout constraintLayout0) {
        this.t(constraintLayout0, false);
        constraintLayout0.setConstraintSet(null);
    }

    public int v0(int v) {
        return this.i0(v).e.d;
    }

    public void v1(String[] arr_s) {
        this.d = arr_s;
        for(int v = 0; true; ++v) {
            String[] arr_s1 = this.d;
            if(v >= arr_s1.length) {
                break;
            }
            arr_s1[v] = arr_s1[v].trim();
        }
    }

    public static Constraint w(Context context0, XmlPullParser xmlPullParser0) {
        AttributeSet attributeSet0 = Xml.asAttributeSet(xmlPullParser0);
        Constraint constraintSet$Constraint0 = new Constraint();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ConstraintOverride);
        ConstraintSet.K0(constraintSet$Constraint0, typedArray0);
        typedArray0.recycle();
        return constraintSet$Constraint0;
    }

    public boolean w0() {
        return this.g;
    }

    public void w1(int v, String s, String s1) {
        this.i0(v).s(s, s1);
    }

    public void x(int v, int v1, int v2, int v3, int v4, int v5, int v6, float f) {
        if(v3 < 0 || v6 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if(f <= 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        switch(v2) {
            case 1: 
            case 2: {
                this.L(v, 1, v1, v2, v3);
                this.L(v, 2, v4, v5, v6);
                Constraint constraintSet$Constraint1 = (Constraint)this.h.get(v);
                if(constraintSet$Constraint1 != null) {
                    constraintSet$Constraint1.e.y = f;
                    return;
                }
                break;
            }
            case 6: 
            case 7: {
                this.L(v, 6, v1, v2, v3);
                this.L(v, 7, v4, v5, v6);
                Constraint constraintSet$Constraint2 = (Constraint)this.h.get(v);
                if(constraintSet$Constraint2 != null) {
                    constraintSet$Constraint2.e.y = f;
                    return;
                }
                break;
            }
            default: {
                this.L(v, 3, v1, v2, v3);
                this.L(v, 4, v4, v5, v6);
                Constraint constraintSet$Constraint0 = (Constraint)this.h.get(v);
                if(constraintSet$Constraint0 != null) {
                    constraintSet$Constraint0.e.z = f;
                }
            }
        }
    }

    public boolean x0() {
        return this.a;
    }

    public void x1(int v, float f, float f1) {
        Constraint constraintSet$Constraint0 = this.i0(v);
        constraintSet$Constraint0.f.h = f1;
        constraintSet$Constraint0.f.g = f;
    }

    public void y(int v, int v1) {
        if(v1 == 0) {
            this.x(v, 0, 1, 0, 0, 2, 0, 0.5f);
            return;
        }
        this.x(v, v1, 2, 0, v1, 1, 0, 0.5f);
    }

    public void y0(Context context0, int v) {
        XmlResourceParser xmlResourceParser0 = context0.getResources().getXml(v);
        try {
            int v1 = xmlResourceParser0.getEventType();
            while(true) {
                switch(v1) {
                    case 1: {
                        return;
                    }
                    case 2: {
                        String s = xmlResourceParser0.getName();
                        Constraint constraintSet$Constraint0 = this.h0(context0, Xml.asAttributeSet(xmlResourceParser0), false);
                        if(s.equalsIgnoreCase("Guideline")) {
                            constraintSet$Constraint0.e.a = true;
                        }
                        this.h.put(constraintSet$Constraint0.a, constraintSet$Constraint0);
                        v1 = xmlResourceParser0.next();
                        break;
                    }
                    default: {
                        v1 = xmlResourceParser0.next();
                        break;
                    }
                }
            }
            goto label_16;
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            goto label_16;
        }
        Log.e("ConstraintSet", "Error parsing resource: " + v, xmlPullParserException0);
        return;
    label_16:
        Log.e("ConstraintSet", "Error parsing resource: " + v, iOException0);
    }

    public void y1(int v, float f) {
        this.i0(v).f.g = f;
    }

    public void z(int v, int v1, int v2, int v3, int v4, int v5, int v6, float f) {
        this.L(v, 1, v1, v2, v3);
        this.L(v, 2, v4, v5, v6);
        Constraint constraintSet$Constraint0 = (Constraint)this.h.get(v);
        if(constraintSet$Constraint0 != null) {
            constraintSet$Constraint0.e.y = f;
        }
    }

    public void z0(Context context0, XmlPullParser xmlPullParser0) {
        try {
            int v = xmlPullParser0.getEventType();
            Constraint constraintSet$Constraint0 = null;
            while(true) {
                switch(v) {
                    case 0: {
                        xmlPullParser0.getName();
                        v = xmlPullParser0.next();
                        break;
                    }
                    case 1: {
                        return;
                    }
                    case 2: {
                        switch(xmlPullParser0.getName()) {
                            case "Barrier": {
                                constraintSet$Constraint0 = this.h0(context0, Xml.asAttributeSet(xmlPullParser0), false);
                                constraintSet$Constraint0.e.j0 = 1;
                                break;
                            }
                            case "Constraint": {
                                constraintSet$Constraint0 = this.h0(context0, Xml.asAttributeSet(xmlPullParser0), false);
                                break;
                            }
                            case "ConstraintOverride": {
                                constraintSet$Constraint0 = this.h0(context0, Xml.asAttributeSet(xmlPullParser0), true);
                                break;
                            }
                            case "CustomAttribute": {
                            label_38:
                                if(constraintSet$Constraint0 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser0.getLineNumber());
                                }
                                ConstraintAttribute.q(context0, xmlPullParser0, constraintSet$Constraint0.g);
                                break;
                            }
                            case "CustomMethod": {
                                goto label_38;
                            }
                            case "Guideline": {
                                constraintSet$Constraint0 = this.h0(context0, Xml.asAttributeSet(xmlPullParser0), false);
                                constraintSet$Constraint0.e.a = true;
                                constraintSet$Constraint0.e.b = true;
                                break;
                            }
                            case "Layout": {
                                if(constraintSet$Constraint0 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser0.getLineNumber());
                                }
                                AttributeSet attributeSet0 = Xml.asAttributeSet(xmlPullParser0);
                                constraintSet$Constraint0.e.c(context0, attributeSet0);
                                break;
                            }
                            case "Motion": {
                                if(constraintSet$Constraint0 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser0.getLineNumber());
                                }
                                AttributeSet attributeSet1 = Xml.asAttributeSet(xmlPullParser0);
                                constraintSet$Constraint0.d.b(context0, attributeSet1);
                                break;
                            }
                            case "PropertySet": {
                                if(constraintSet$Constraint0 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser0.getLineNumber());
                                }
                                AttributeSet attributeSet2 = Xml.asAttributeSet(xmlPullParser0);
                                constraintSet$Constraint0.c.b(context0, attributeSet2);
                                break;
                            }
                            case "Transform": {
                                if(constraintSet$Constraint0 == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser0.getLineNumber());
                                }
                                AttributeSet attributeSet3 = Xml.asAttributeSet(xmlPullParser0);
                                constraintSet$Constraint0.f.b(context0, attributeSet3);
                            }
                        }
                        v = xmlPullParser0.next();
                        break;
                    }
                    case 3: {
                        switch(xmlPullParser0.getName().toLowerCase(Locale.ROOT)) {
                            case "constraint": 
                            case "constraintoverride": 
                            case "guideline": {
                                this.h.put(constraintSet$Constraint0.a, constraintSet$Constraint0);
                                constraintSet$Constraint0 = null;
                                break;
                            }
                            case "constraintset": {
                                return;
                            }
                        }
                        v = xmlPullParser0.next();
                        break;
                    }
                    default: {
                        v = xmlPullParser0.next();
                        break;
                    }
                }
            }
            goto label_57;
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            goto label_57;
        }
        Log.e("ConstraintSet", "Error parsing XML resource", xmlPullParserException0);
        return;
    label_57:
        Log.e("ConstraintSet", "Error parsing XML resource", iOException0);
    }

    public void z1(int v, float f) {
        this.i0(v).f.h = f;
    }
}

