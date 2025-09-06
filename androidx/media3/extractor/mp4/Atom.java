package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class Atom {
    static final class ContainerAtom extends Atom {
        public final long G1;
        public final List H1;
        public final List I1;

        public ContainerAtom(int v, long v1) {
            super(v);
            this.G1 = v1;
            this.H1 = new ArrayList();
            this.I1 = new ArrayList();
        }

        public void d(ContainerAtom atom$ContainerAtom0) {
            this.I1.add(atom$ContainerAtom0);
        }

        public void e(LeafAtom atom$LeafAtom0) {
            this.H1.add(atom$LeafAtom0);
        }

        public int f(int v) {
            int v1 = this.H1.size();
            int v4 = 0;
            for(int v3 = 0; v3 < v1; ++v3) {
                if(((LeafAtom)this.H1.get(v3)).a == v) {
                    ++v4;
                }
            }
            int v5 = this.I1.size();
            for(int v2 = 0; v2 < v5; ++v2) {
                if(((ContainerAtom)this.I1.get(v2)).a == v) {
                    ++v4;
                }
            }
            return v4;
        }

        @Nullable
        public ContainerAtom g(int v) {
            int v1 = this.I1.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                ContainerAtom atom$ContainerAtom0 = (ContainerAtom)this.I1.get(v2);
                if(atom$ContainerAtom0.a == v) {
                    return atom$ContainerAtom0;
                }
            }
            return null;
        }

        @Nullable
        public LeafAtom h(int v) {
            int v1 = this.H1.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                LeafAtom atom$LeafAtom0 = (LeafAtom)this.H1.get(v2);
                if(atom$LeafAtom0.a == v) {
                    return atom$LeafAtom0;
                }
            }
            return null;
        }

        @Override  // androidx.media3.extractor.mp4.Atom
        public String toString() {
            return Atom.a(this.a) + " leaves: " + Arrays.toString(this.H1.toArray()) + " containers: " + Arrays.toString(this.I1.toArray());
        }
    }

    static final class LeafAtom extends Atom {
        public final ParsableByteArray G1;

        public LeafAtom(int v, ParsableByteArray parsableByteArray0) {
            super(v);
            this.G1 = parsableByteArray0;
        }
    }

    public static final int A = 1211250227;
    public static final int A0 = 0x73696E66;
    public static final int A1 = 0x644F7073;
    public static final int B = 1681012275;
    public static final int B0 = 0x7363686D;
    public static final int B1 = 0x664C6143;
    public static final int C = 1835295092;
    public static final int C0 = 0x73636869;
    public static final int C1 = 0x64664C61;
    public static final int D = 0x6D703461;
    public static final int D0 = 1952804451;
    public static final int D1 = 0x74776F73;
    public static final int E = 0x2E6D7032;
    public static final int E0 = 1701733238;
    public static final int E1 = 1668050025;
    public static final int F = 0x2E6D7033;
    public static final int F0 = 1701733217;
    public static final int F1 = 1835295606;
    public static final int G = 0x6D686131;
    public static final int G0 = 0x66726D61;
    public static final int H = 1835560241;
    public static final int H0 = 0x7361697A;
    public static final int I = 0x6D686143;
    public static final int I0 = 0x7361696F;
    public static final int J = 1835557200;
    public static final int J0 = 0x73626770;
    public static final int K = 2002876005;
    public static final int K0 = 0x73677064;
    public static final int L = 0x6C70636D;
    public static final int L0 = 1970628964;
    public static final int M = 0x736F7774;
    public static final int M0 = 1936027235;
    public static final int N = 0x61632D33;
    public static final int N0 = 0x70617370;
    public static final int O = 1684103987;
    public static final int O0 = 1414810956;
    public static final int P = 1700998451;
    public static final int P0 = 0x6D317620;
    public static final int Q = 0x64656333;
    public static final int Q0 = 1836070006;
    public static final int R = 0x61632D34;
    public static final int R0 = 1937011827;
    public static final int S = 1684103988;
    public static final int S0 = 1937011571;
    public static final int T = 0x6D6C7061;
    public static final int T0 = 0x63747473;
    public static final int U = 0x646D6C70;
    public static final int U0 = 1937011555;
    public static final int V = 0x64747363;
    public static final int V0 = 1937011578;
    public static final int W = 1685353320;
    public static final int W0 = 1937013298;
    public static final int X = 0x6474736C;
    public static final int X0 = 1937007471;
    public static final int Y = 0x64747365;
    public static final int Y0 = 0x636F3634;
    public static final int Z = 0x64747378;
    public static final int Z0 = 1954034535;
    public final int a;
    public static final int a0 = 1684305011;
    public static final int a1 = 2004251764;
    public static final int b = 8;
    public static final int b0 = 0x75647473;
    public static final int b1 = 1937010800;
    public static final int c = 12;
    public static final int c0 = 0x74666474;
    public static final int c1 = 0x63363038;
    public static final int d = 16;
    public static final int d0 = 0x74666864;
    public static final int d1 = 1935764850;
    public static final int e = 1;
    public static final int e0 = 0x74726578;
    public static final int e1 = 0x73617762;
    public static final int f = 0;
    public static final int f0 = 0x7472756E;
    public static final int f1 = 0x75647461;
    public static final int g = 0x66747970;
    public static final int g0 = 1936286840;
    public static final int g1 = 0x6D657461;
    public static final int h = 0x61766331;
    public static final int h0 = 0x6D6F6F76;
    public static final int h1 = 0xA978797A;
    public static final int i = 0x61766333;
    public static final int i0 = 0x6D707664;
    public static final int i1 = 1936553057;
    public static final int j = 0x61766343;
    public static final int j0 = 0x6D766864;
    public static final int j1 = 1935766900;
    public static final int k = 1752589105;
    public static final int k0 = 1953653099;
    public static final int k1 = 1936877170;
    public static final int l = 0x68657631;
    public static final int l0 = 0x6D646961;
    public static final int l1 = 1801812339;
    public static final int m = 0x68766343;
    public static final int m0 = 1835626086;
    public static final int m1 = 0x696C7374;
    public static final int n = 0x76703038;
    public static final int n0 = 1937007212;
    public static final int n1 = 1835360622;
    public static final int o = 0x76703039;
    public static final int o0 = 1702061171;
    public static final int o1 = 0x6E616D65;
    public static final int p = 0x76706343;
    public static final int p0 = 0x6D6F6F66;
    public static final int p1 = 1684108385;
    public static final int q = 0x61763031;
    public static final int q0 = 1953653094;
    public static final int q1 = 1701671783;
    public static final int r = 0x61763143;
    public static final int r0 = 0x6D766578;
    public static final int r1 = 0x73743364;
    public static final int s = 0x636F6C72;
    public static final int s0 = 1835362404;
    public static final int s1 = 0x73763364;
    public static final int t = 0x64766176;
    public static final int t0 = 0x746B6864;
    public static final int t1 = 0x70726F6A;
    public static final int u = 0x64766131;
    public static final int u0 = 1701082227;
    public static final int u1 = 0x63616D6D;
    public static final int v = 0x64766865;
    public static final int v0 = 1701606260;
    public static final int v1 = 0x6D657474;
    public static final int w = 0x64766831;
    public static final int w0 = 0x6D646864;
    public static final int w1 = 0x616C6163;
    public static final int x = 1685480259;
    public static final int x0 = 0x68646C72;
    public static final int x1 = 0x616C6177;
    public static final int y = 0x64767643;
    public static final int y0 = 1937011556;
    public static final int y1 = 1970037111;
    public static final int z = 1932670515;
    public static final int z0 = 0x70737368;
    public static final int z1 = 0x4F707573;

    public Atom(int v) {
        this.a = v;
    }

    public static String a(int v) {
        return "" + ((char)(v >> 24 & 0xFF)) + ((char)(v >> 16 & 0xFF)) + ((char)(v >> 8 & 0xFF)) + ((char)(v & 0xFF));
    }

    public static int b(int v) [...] // Inlined contents

    public static int c(int v) [...] // Inlined contents

    @Override
    public String toString() {
        return Atom.a(this.a);
    }
}

