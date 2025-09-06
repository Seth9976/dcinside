package androidx.media3.extractor.text.cea;

import android.graphics.Color;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue.Builder;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.SubtitleInputBuffer;
import androidx.media3.extractor.text.SubtitleOutputBuffer;
import h4.m;
import j..util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@UnstableApi
public final class Cea708Decoder extends CeaDecoder {
    static final class Cea708CueInfo {
        public final Cue a;
        public final int b;
        private static final Comparator c;

        static {
            Cea708CueInfo.c = (Cea708CueInfo cea708Decoder$Cea708CueInfo0, Cea708CueInfo cea708Decoder$Cea708CueInfo1) -> Integer.compare(cea708Decoder$Cea708CueInfo1.b, cea708Decoder$Cea708CueInfo0.b);
        }

        public Cea708CueInfo(CharSequence charSequence0, Layout.Alignment layout$Alignment0, float f, int v, int v1, float f1, int v2, float f2, boolean z, int v3, int v4) {
            Builder cue$Builder0 = new Builder().A(charSequence0).B(layout$Alignment0).t(f, v).u(v1).w(f1).x(v2).z(f2);
            if(z) {
                cue$Builder0.E(v3);
            }
            this.a = cue$Builder0.a();
            this.b = v4;
        }

        // 检测为 Lambda 实现
        private static int c(Cea708CueInfo cea708Decoder$Cea708CueInfo0, Cea708CueInfo cea708Decoder$Cea708CueInfo1) [...]
    }

    static final class CueInfoBuilder {
        private static final int A = 0;
        private static final int B = 1;
        private static final int C = 2;
        private static final int D = 3;
        private static final int E = 0;
        private static final int F = 1;
        private static final int G = 2;
        private static final int H = 3;
        private static final int I = 0;
        private static final int J = 3;
        public static final int K = 0;
        public static final int L = 0;
        public static final int M = 0;
        private static final int N = 1;
        private static final int O = 0;
        private static final int P = 1;
        private static final int Q = 2;
        private static final int R = 3;
        private static final int S = 4;
        private static final int T = 1;
        private static final int[] U = null;
        private static final int[] V = null;
        private static final int[] W = null;
        private static final boolean[] X = null;
        private static final int[] Y = null;
        private static final int[] Z = null;
        private final List a;
        private static final int[] a0 = null;
        private final SpannableStringBuilder b;
        private static final int[] b0 = null;
        private boolean c;
        private boolean d;
        private int e;
        private boolean f;
        private int g;
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
        private int r;
        private int s;
        private int t;
        private int u;
        private static final int v = 99;
        private static final int w = 74;
        private static final int x = 209;
        private static final int y = 4;
        private static final int z = 15;

        static {
            CueInfoBuilder.K = CueInfoBuilder.h(2, 2, 2, 0);
            int v = CueInfoBuilder.h(0, 0, 0, 0);
            CueInfoBuilder.L = v;
            int v1 = CueInfoBuilder.h(0, 0, 0, 3);
            CueInfoBuilder.M = v1;
            CueInfoBuilder.U = new int[]{0, 0, 0, 0, 0, 2, 0};
            CueInfoBuilder.V = new int[]{0, 0, 0, 0, 0, 0, 2};
            CueInfoBuilder.W = new int[]{3, 3, 3, 3, 3, 3, 1};
            CueInfoBuilder.X = new boolean[]{false, false, false, true, true, true, false};
            CueInfoBuilder.Y = new int[]{v, v1, v, v, v1, v, v};
            CueInfoBuilder.Z = new int[]{0, 1, 2, 3, 4, 3, 4};
            CueInfoBuilder.a0 = new int[]{0, 0, 0, 0, 0, 3, 3};
            CueInfoBuilder.b0 = new int[]{v, v, v, v, v, v1, v1};
        }

        public CueInfoBuilder() {
            this.a = new ArrayList();
            this.b = new SpannableStringBuilder();
            this.l();
        }

        public void a(char c) {
            if(c == 10) {
                SpannableString spannableString0 = this.d();
                this.a.add(spannableString0);
                this.b.clear();
                if(this.o != -1) {
                    this.o = 0;
                }
                if(this.p != -1) {
                    this.p = 0;
                }
                if(this.q != -1) {
                    this.q = 0;
                }
                if(this.s != -1) {
                    this.s = 0;
                }
                while(this.a.size() >= this.j || this.a.size() >= 15) {
                    this.a.remove(0);
                }
                this.u = this.a.size();
                return;
            }
            this.b.append(c);
        }

        public void b() {
            int v = this.b.length();
            if(v > 0) {
                this.b.delete(v - 1, v);
            }
        }

        @Nullable
        public Cea708CueInfo c() {
            int v3;
            int v2;
            float f1;
            float f;
            Layout.Alignment layout$Alignment0;
            if(this.j()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder();
            boolean z = false;
            for(int v = 0; v < this.a.size(); ++v) {
                spannableStringBuilder0.append(((CharSequence)this.a.get(v)));
                spannableStringBuilder0.append('\n');
            }
            spannableStringBuilder0.append(this.d());
            switch(this.k) {
                case 1: {
                    layout$Alignment0 = Layout.Alignment.ALIGN_OPPOSITE;
                    break;
                }
                case 2: {
                    layout$Alignment0 = Layout.Alignment.ALIGN_CENTER;
                    break;
                }
                case 0: 
                case 3: {
                    layout$Alignment0 = Layout.Alignment.ALIGN_NORMAL;
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.k);
                }
            }
            if(this.f) {
                f = ((float)this.h) / 99.0f;
                f1 = ((float)this.g) / 99.0f;
            }
            else {
                f = ((float)this.h) / 209.0f;
                f1 = ((float)this.g) / 74.0f;
            }
            int v1 = this.i;
            if(v1 / 3 == 0) {
                v2 = 0;
            }
            else {
                v2 = v1 / 3 == 1 ? 1 : 2;
            }
            switch(v1 % 3) {
                case 0: {
                    v3 = 0;
                    break;
                }
                case 1: {
                    v3 = 1;
                    break;
                }
                default: {
                    v3 = 2;
                }
            }
            if(this.n != CueInfoBuilder.L) {
                z = true;
            }
            return new Cea708CueInfo(spannableStringBuilder0, layout$Alignment0, f1 * 0.9f + 0.05f, 0, v2, f * 0.9f + 0.05f, v3, -3.402823E+38f, z, this.n, this.e);
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(this.b);
            int v = spannableStringBuilder0.length();
            if(v > 0) {
                if(this.o != -1) {
                    spannableStringBuilder0.setSpan(new StyleSpan(2), this.o, v, 33);
                }
                if(this.p != -1) {
                    spannableStringBuilder0.setSpan(new UnderlineSpan(), this.p, v, 33);
                }
                if(this.q != -1) {
                    spannableStringBuilder0.setSpan(new ForegroundColorSpan(this.r), this.q, v, 33);
                }
                if(this.s != -1) {
                    spannableStringBuilder0.setSpan(new BackgroundColorSpan(this.t), this.s, v, 33);
                }
            }
            return new SpannableString(spannableStringBuilder0);
        }

        public void e() {
            this.a.clear();
            this.b.clear();
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.s = -1;
            this.u = 0;
        }

        public void f(boolean z, int v, boolean z1, int v1, int v2, int v3, int v4, int v5, int v6) {
            this.c = true;
            this.d = z;
            this.e = v;
            this.f = z1;
            this.g = v1;
            this.h = v2;
            this.i = v4;
            if(this.j != v3 + 1) {
                this.j = v3 + 1;
                while(this.a.size() >= this.j || this.a.size() >= 15) {
                    this.a.remove(0);
                }
            }
            if(v5 != 0 && this.l != v5) {
                this.l = v5;
                this.q(CueInfoBuilder.Y[v5 - 1], CueInfoBuilder.M, CueInfoBuilder.X[v5 - 1], 0, CueInfoBuilder.V[v5 - 1], CueInfoBuilder.W[v5 - 1], CueInfoBuilder.U[v5 - 1]);
            }
            if(v6 != 0 && this.m != v6) {
                this.m = v6;
                this.m(0, 1, 1, false, false, CueInfoBuilder.a0[v6 - 1], CueInfoBuilder.Z[v6 - 1]);
                this.n(CueInfoBuilder.K, CueInfoBuilder.b0[v6 - 1], CueInfoBuilder.L);
            }
        }

        public static int g(int v, int v1, int v2) {
            return CueInfoBuilder.h(v, v1, v2, 0);
        }

        public static int h(int v, int v1, int v2, int v3) {
            int v5;
            int v4 = 0;
            Assertions.c(v, 0, 4);
            Assertions.c(v1, 0, 4);
            Assertions.c(v2, 0, 4);
            Assertions.c(v3, 0, 4);
            if(v3 == 0 || v3 == 1) {
                v5 = 0xFF;
            }
            else {
                switch(v3) {
                    case 2: {
                        v5 = 0x7F;
                        break;
                    }
                    case 3: {
                        v5 = 0;
                        break;
                    }
                    default: {
                        v5 = 0xFF;
                    }
                }
            }
            if(v2 > 1) {
                v4 = 0xFF;
            }
            return Color.argb(v5, (v <= 1 ? 0 : 0xFF), (v1 <= 1 ? 0 : 0xFF), v4);
        }

        public boolean i() {
            return this.c;
        }

        // 去混淆评级： 低(20)
        public boolean j() {
            return !this.i() || this.a.isEmpty() && this.b.length() == 0;
        }

        public boolean k() {
            return this.d;
        }

        public void l() {
            this.e();
            this.c = false;
            this.d = false;
            this.e = 4;
            this.f = false;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = 15;
            this.k = 0;
            this.l = 0;
            this.m = 0;
            this.n = CueInfoBuilder.L;
            this.r = CueInfoBuilder.K;
            this.t = CueInfoBuilder.L;
        }

        public void m(int v, int v1, int v2, boolean z, boolean z1, int v3, int v4) {
            if(this.o == -1) {
                if(z) {
                    this.o = this.b.length();
                }
            }
            else if(!z) {
                StyleSpan styleSpan0 = new StyleSpan(2);
                int v5 = this.o;
                int v6 = this.b.length();
                this.b.setSpan(styleSpan0, v5, v6, 33);
                this.o = -1;
            }
            if(this.p != -1) {
                if(!z1) {
                    UnderlineSpan underlineSpan0 = new UnderlineSpan();
                    int v7 = this.p;
                    int v8 = this.b.length();
                    this.b.setSpan(underlineSpan0, v7, v8, 33);
                    this.p = -1;
                }
            }
            else if(z1) {
                this.p = this.b.length();
            }
        }

        public void n(int v, int v1, int v2) {
            if(this.q != -1 && this.r != v) {
                ForegroundColorSpan foregroundColorSpan0 = new ForegroundColorSpan(this.r);
                int v3 = this.q;
                int v4 = this.b.length();
                this.b.setSpan(foregroundColorSpan0, v3, v4, 33);
            }
            if(v != CueInfoBuilder.K) {
                this.q = this.b.length();
                this.r = v;
            }
            if(this.s != -1 && this.t != v1) {
                BackgroundColorSpan backgroundColorSpan0 = new BackgroundColorSpan(this.t);
                int v5 = this.s;
                int v6 = this.b.length();
                this.b.setSpan(backgroundColorSpan0, v5, v6, 33);
            }
            if(v1 != CueInfoBuilder.L) {
                this.s = this.b.length();
                this.t = v1;
            }
        }

        public void o(int v, int v1) {
            if(this.u != v) {
                this.a('\n');
            }
            this.u = v;
        }

        public void p(boolean z) {
            this.d = z;
        }

        public void q(int v, int v1, boolean z, int v2, int v3, int v4, int v5) {
            this.n = v;
            this.k = v5;
        }
    }

    static final class DtvCcPacket {
        public final int a;
        public final int b;
        public final byte[] c;
        int d;

        public DtvCcPacket(int v, int v1) {
            this.a = v;
            this.b = v1;
            this.c = new byte[v1 * 2 - 1];
            this.d = 0;
        }
    }

    private static final int A = 0x7F;
    private static final int A0 = 0x30;
    private static final int B = 0x9F;
    private static final int B0 = 49;
    private static final int C = 0xFF;
    private static final int C0 = 50;
    private static final int D = 0x1F;
    private static final int D0 = 51;
    private static final int E = 0x7F;
    private static final int E0 = 52;
    private static final int F = 0x9F;
    private static final int F0 = 53;
    private static final int G = 0xFF;
    private static final int G0 = 57;
    private static final int H = 0;
    private static final int H0 = 58;
    private static final int I = 3;
    private static final int I0 = 60;
    private static final int J = 8;
    private static final int J0 = 61;
    private static final int K = 12;
    private static final int K0 = 0x3F;
    private static final int L = 13;
    private static final int L0 = 0x76;
    private static final int M = 14;
    private static final int M0 = 0x77;
    private static final int N = 16;
    private static final int N0 = 120;
    private static final int O = 17;
    private static final int O0 = 0x79;
    private static final int P = 23;
    private static final int P0 = 0x7A;
    private static final int Q = 24;
    private static final int Q0 = 0x7B;
    private static final int R = 0x1F;
    private static final int R0 = 0x7C;
    private static final int S = 0x80;
    private static final int S0 = 0x7D;
    private static final int T = 0x81;
    private static final int T0 = 0x7E;
    private static final int U = 130;
    private static final int U0 = 0x7F;
    private static final int V = 0x83;
    private static final int W = 0x84;
    private static final int X = 0x85;
    private static final int Y = 0x86;
    private static final int Z = 0x87;
    private static final int a0 = 0x88;
    private static final int b0 = 0x89;
    private static final int c0 = 0x8A;
    private static final int d0 = 0x8B;
    private static final int e0 = 140;
    private static final int f0 = 0x8D;
    private static final int g0 = 0x8E;
    private static final int h0 = 0x8F;
    private static final int i0 = 0x90;
    private final ParsableByteArray j;
    private static final int j0 = 0x91;
    private final ParsableBitArray k;
    private static final int k0 = 0x92;
    private int l;
    private static final int l0 = 0x97;
    private final boolean m;
    private static final int m0 = 0x98;
    private final int n;
    private static final int n0 = 0x99;
    private final CueInfoBuilder[] o;
    private static final int o0 = 0x9A;
    private CueInfoBuilder p;
    private static final int p0 = 0x9B;
    @Nullable
    private List q;
    private static final int q0 = 0x9C;
    @Nullable
    private List r;
    private static final int r0 = 0x9D;
    @Nullable
    private DtvCcPacket s;
    private static final int s0 = 0x9E;
    private int t;
    private static final int t0 = 0x9F;
    private static final String u = "Cea708Decoder";
    private static final int u0 = 0x7F;
    private static final int v = 8;
    private static final int v0 = 0x20;
    private static final int w = 2;
    private static final int w0 = 33;
    private static final int x = 3;
    private static final int x0 = 37;
    private static final int y = 4;
    private static final int y0 = 42;
    private static final int z = 0x1F;
    private static final int z0 = 44;

    public Cea708Decoder(int v, @Nullable List list0) {
        this.j = new ParsableByteArray();
        this.k = new ParsableBitArray();
        this.l = -1;
        boolean z = true;
        if(v == -1) {
            v = 1;
        }
        this.n = v;
        if(list0 == null || !CodecSpecificDataUtil.i(list0)) {
            z = false;
        }
        this.m = z;
        this.o = new CueInfoBuilder[8];
        for(int v1 = 0; v1 < 8; ++v1) {
            this.o[v1] = new CueInfoBuilder();
        }
        this.p = this.o[0];
    }

    private void A(int v) {
        if(v == 0xA0) {
            this.p.a('㏄');
            return;
        }
        Log.n("Cea708Decoder", "Invalid G3 character: " + v);
        this.p.a('_');
    }

    private void B() {
        int v = this.k.h(4);
        int v1 = this.k.h(2);
        int v2 = this.k.h(2);
        boolean z = this.k.g();
        boolean z1 = this.k.g();
        int v3 = this.k.h(3);
        int v4 = this.k.h(3);
        this.p.m(v, v1, v2, z, z1, v3, v4);
    }

    private void C() {
        int v = this.k.h(2);
        int v1 = CueInfoBuilder.h(this.k.h(2), this.k.h(2), this.k.h(2), v);
        int v2 = this.k.h(2);
        int v3 = CueInfoBuilder.h(this.k.h(2), this.k.h(2), this.k.h(2), v2);
        this.k.s(2);
        int v4 = CueInfoBuilder.g(this.k.h(2), this.k.h(2), this.k.h(2));
        this.p.n(v1, v3, v4);
    }

    private void D() {
        this.k.s(4);
        int v = this.k.h(4);
        this.k.s(2);
        int v1 = this.k.h(6);
        this.p.o(v, v1);
    }

    private void E() {
        int v = this.k.h(2);
        int v1 = CueInfoBuilder.h(this.k.h(2), this.k.h(2), this.k.h(2), v);
        int v2 = this.k.h(2);
        int v3 = CueInfoBuilder.g(this.k.h(2), this.k.h(2), this.k.h(2));
        if(this.k.g()) {
            v2 |= 4;
        }
        boolean z = this.k.g();
        int v4 = this.k.h(2);
        int v5 = this.k.h(2);
        int v6 = this.k.h(2);
        this.k.s(8);
        this.p.q(v1, v3, z, v2, v4, v5, v6);
    }

    @m({"currentDtvCcPacket"})
    private void F() {
        int v4;
        if(this.s.d != this.s.b * 2 - 1) {
            Log.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + (this.s.b * 2 - 1) + ", but current index is " + this.s.d + " (sequence number " + this.s.a + ");");
        }
        this.k.p(this.s.c, this.s.d);
        boolean z = false;
        while(this.k.b() > 0) {
            int v = this.k.h(3);
            int v1 = this.k.h(5);
            if(v == 7) {
                this.k.s(2);
                v = this.k.h(6);
                if(v < 7) {
                    Log.n("Cea708Decoder", "Invalid extended service number: " + v);
                }
            }
            if(v1 == 0) {
                if(v == 0) {
                    break;
                }
                Log.n("Cea708Decoder", "serviceNumber is non-zero (" + v + ") when blockSize is 0");
                break;
            }
            if(v == this.n) {
                int v2 = this.k.e() + v1 * 8;
                while(this.k.e() < v2) {
                    int v3 = this.k.h(8);
                    if(v3 == 16) {
                        v4 = this.k.h(8);
                        if(v4 <= 0x1F) {
                            this.u(v4);
                            continue;
                        }
                        else if(v4 <= 0x7F) {
                            this.z(v4);
                        }
                        else if(v4 <= 0x9F) {
                            this.v(v4);
                            continue;
                        }
                        else if(v4 <= 0xFF) {
                            this.A(v4);
                        }
                        else {
                            goto label_51;
                        }
                    }
                    else {
                        if(v3 <= 0x1F) {
                            this.s(v3);
                        }
                        else if(v3 <= 0x7F) {
                            this.x(v3);
                            z = true;
                        }
                        else if(v3 <= 0x9F) {
                            this.t(v3);
                            z = true;
                        }
                        else if(v3 <= 0xFF) {
                            this.y(v3);
                            z = true;
                        }
                        else {
                            Log.n("Cea708Decoder", "Invalid base command: " + v3);
                        }
                        continue;
                    }
                    z = true;
                    continue;
                label_51:
                    Log.n("Cea708Decoder", "Invalid extended command: " + v4);
                }
            }
            else {
                this.k.t(v1);
            }
        }
        if(z) {
            this.q = this.r();
        }
    }

    private void G() {
        for(int v = 0; v < 8; ++v) {
            this.o[v].l();
        }
    }

    @Override  // androidx.media3.extractor.text.cea.CeaDecoder
    public void f(long v) {
        super.f(v);
    }

    @Override  // androidx.media3.extractor.text.cea.CeaDecoder
    public void flush() {
        super.flush();
        this.q = null;
        this.r = null;
        this.t = 0;
        this.p = this.o[0];
        this.G();
        this.s = null;
    }

    @Override  // androidx.media3.extractor.text.cea.CeaDecoder
    protected Subtitle g() {
        this.r = this.q;
        return new CeaSubtitle(((List)Assertions.g(this.q)));
    }

    @Override  // androidx.media3.extractor.text.cea.CeaDecoder
    public String getName() {
        return "Cea708Decoder";
    }

    @Override  // androidx.media3.extractor.text.cea.CeaDecoder
    protected void h(SubtitleInputBuffer subtitleInputBuffer0) {
        ByteBuffer byteBuffer0 = (ByteBuffer)Assertions.g(subtitleInputBuffer0.d);
        byte[] arr_b = byteBuffer0.array();
        this.j.W(arr_b, byteBuffer0.limit());
        while(this.j.a() >= 3) {
            int v = this.j.L();
            int v1 = v & 3;
            boolean z = false;
            byte b = (byte)this.j.L();
            byte b1 = (byte)this.j.L();
            if((v1 == 2 || v1 == 3) && (v & 4) == 4) {
                switch(v1) {
                    case 2: {
                        z = true;
                    label_13:
                        Assertions.a(z);
                        DtvCcPacket cea708Decoder$DtvCcPacket0 = this.s;
                        if(cea708Decoder$DtvCcPacket0 == null) {
                            Log.d("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                            continue;
                        }
                        else {
                            int v2 = cea708Decoder$DtvCcPacket0.d;
                            cea708Decoder$DtvCcPacket0.d = v2 + 1;
                            cea708Decoder$DtvCcPacket0.c[v2] = b;
                            cea708Decoder$DtvCcPacket0.d = v2 + 2;
                            cea708Decoder$DtvCcPacket0.c[v2 + 1] = b1;
                            break;
                        }
                        goto label_24;
                    }
                    case 3: {
                    label_24:
                        this.q();
                        int v3 = (b & 0xC0) >> 6;
                        if(this.l != -1 && v3 != (this.l + 1) % 4) {
                            this.G();
                            Log.n("Cea708Decoder", "Sequence number discontinuity. previous=" + this.l + " current=" + v3);
                        }
                        this.l = v3;
                        DtvCcPacket cea708Decoder$DtvCcPacket1 = new DtvCcPacket(v3, ((b & 0x3F) == 0 ? 0x40 : b & 0x3F));
                        this.s = cea708Decoder$DtvCcPacket1;
                        int v4 = cea708Decoder$DtvCcPacket1.d;
                        cea708Decoder$DtvCcPacket1.d = v4 + 1;
                        cea708Decoder$DtvCcPacket1.c[v4] = b1;
                        break;
                    }
                    default: {
                        goto label_13;
                    }
                }
                if(this.s.d == this.s.b * 2 - 1) {
                    this.q();
                }
            }
        }
    }

    @Override  // androidx.media3.extractor.text.cea.CeaDecoder
    @Nullable
    public SubtitleInputBuffer i() throws SubtitleDecoderException {
        return super.i();
    }

    @Override  // androidx.media3.extractor.text.cea.CeaDecoder
    @Nullable
    public SubtitleOutputBuffer j() throws SubtitleDecoderException {
        return super.j();
    }

    @Override  // androidx.media3.extractor.text.cea.CeaDecoder
    protected boolean m() {
        return this.q != this.r;
    }

    @Override  // androidx.media3.extractor.text.cea.CeaDecoder
    public void n(SubtitleInputBuffer subtitleInputBuffer0) throws SubtitleDecoderException {
        super.n(subtitleInputBuffer0);
    }

    private void q() {
        if(this.s == null) {
            return;
        }
        this.F();
        this.s = null;
    }

    private List r() {
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 0; v1 < 8; ++v1) {
            if(!this.o[v1].j() && this.o[v1].k()) {
                Cea708CueInfo cea708Decoder$Cea708CueInfo0 = this.o[v1].c();
                if(cea708Decoder$Cea708CueInfo0 != null) {
                    arrayList0.add(cea708Decoder$Cea708CueInfo0);
                }
            }
        }
        Collections.sort(arrayList0, Cea708CueInfo.c);
        ArrayList arrayList1 = new ArrayList(arrayList0.size());
        for(int v = 0; v < arrayList0.size(); ++v) {
            arrayList1.add(((Cea708CueInfo)arrayList0.get(v)).a);
        }
        return DesugarCollections.unmodifiableList(arrayList1);
    }

    @Override  // androidx.media3.extractor.text.cea.CeaDecoder
    public void release() {
        super.release();
    }

    private void s(int v) {
        switch(v) {
            case 3: {
                this.q = this.r();
                break;
            }
            case 8: {
                this.p.b();
                return;
            }
            case 12: {
                this.G();
                return;
            }
            case 13: {
                this.p.a('\n');
                return;
            }
            case 0: 
            case 14: {
                break;
            }
            default: {
                if(v >= 17 && v <= 23) {
                    Log.n("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + v);
                    this.k.s(8);
                    return;
                }
                if(v >= 24 && v <= 0x1F) {
                    Log.n("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + v);
                    this.k.s(16);
                    return;
                }
                Log.n("Cea708Decoder", "Invalid C0 command: " + v);
            }
        }
    }

    private void t(int v) {
        int v1 = 1;
        switch(v) {
            case 0x80: 
            case 0x81: 
            case 130: 
            case 0x83: 
            case 0x84: 
            case 0x85: 
            case 0x86: 
            case 0x87: {
                if(this.t != v - 0x80) {
                    this.t = v - 0x80;
                    this.p = this.o[v - 0x80];
                    return;
                }
                break;
            }
            case 0x88: {
                while(v1 <= 8) {
                    if(this.k.g()) {
                        this.o[8 - v1].e();
                    }
                    ++v1;
                }
                return;
            }
            case 0x89: {
                for(int v2 = 1; v2 <= 8; ++v2) {
                    if(this.k.g()) {
                        this.o[8 - v2].p(true);
                    }
                }
                return;
            }
            case 0x8A: {
                while(v1 <= 8) {
                    if(this.k.g()) {
                        this.o[8 - v1].p(false);
                    }
                    ++v1;
                }
                return;
            }
            case 0x8B: {
                for(int v3 = 1; v3 <= 8; ++v3) {
                    if(this.k.g()) {
                        CueInfoBuilder cea708Decoder$CueInfoBuilder0 = this.o[8 - v3];
                        cea708Decoder$CueInfoBuilder0.p(!cea708Decoder$CueInfoBuilder0.k());
                    }
                }
                return;
            }
            case 140: {
                while(v1 <= 8) {
                    if(this.k.g()) {
                        this.o[8 - v1].l();
                    }
                    ++v1;
                }
                return;
            }
            case 0x8D: {
                this.k.s(8);
                return;
            }
            case 0x8E: {
                break;
            }
            case 0x8F: {
                this.G();
                return;
            }
            case 0x90: {
                if(!this.p.i()) {
                    this.k.s(16);
                    return;
                }
                this.B();
                return;
            }
            case 0x91: {
                if(!this.p.i()) {
                    this.k.s(24);
                    return;
                }
                this.C();
                return;
            }
            case 0x92: {
                if(!this.p.i()) {
                    this.k.s(16);
                    return;
                }
                this.D();
                return;
            }
            case 0x97: {
                if(!this.p.i()) {
                    this.k.s(0x20);
                    return;
                }
                this.E();
                return;
            }
            case 0x98: 
            case 0x99: 
            case 0x9A: 
            case 0x9B: 
            case 0x9C: 
            case 0x9D: 
            case 0x9E: 
            case 0x9F: {
                this.w(v - 0x98);
                if(this.t != v - 0x98) {
                    this.t = v - 0x98;
                    this.p = this.o[v - 0x98];
                    return;
                }
                break;
            }
            default: {
                Log.n("Cea708Decoder", "Invalid C1 command: " + v);
            }
        }
    }

    private void u(int v) {
        if(v > 7) {
            if(v <= 15) {
                this.k.s(8);
                return;
            }
            if(v <= 23) {
                this.k.s(16);
                return;
            }
            if(v <= 0x1F) {
                this.k.s(24);
            }
        }
    }

    private void v(int v) {
        if(v <= 0x87) {
            this.k.s(0x20);
            return;
        }
        if(v <= 0x8F) {
            this.k.s(40);
            return;
        }
        if(v <= 0x9F) {
            this.k.s(2);
            int v1 = this.k.h(6);
            this.k.s(v1 * 8);
        }
    }

    private void w(int v) {
        CueInfoBuilder cea708Decoder$CueInfoBuilder0 = this.o[v];
        this.k.s(2);
        boolean z = this.k.g();
        this.k.s(2);
        int v1 = this.k.h(3);
        boolean z1 = this.k.g();
        int v2 = this.k.h(7);
        int v3 = this.k.h(8);
        int v4 = this.k.h(4);
        int v5 = this.k.h(4);
        this.k.s(2);
        this.k.s(6);
        this.k.s(2);
        cea708Decoder$CueInfoBuilder0.f(z, v1, z1, v2, v3, v5, v4, this.k.h(3), this.k.h(3));
    }

    private void x(int v) {
        if(v == 0x7F) {
            this.p.a('♫');
            return;
        }
        this.p.a(((char)(v & 0xFF)));
    }

    private void y(int v) {
        this.p.a(((char)(v & 0xFF)));
    }

    private void z(int v) {
        switch(v) {
            case 0x20: {
                this.p.a(' ');
                return;
            }
            case 33: {
                this.p.a(' ');
                return;
            }
            case 37: {
                this.p.a('…');
                return;
            }
            case 42: {
                this.p.a('Š');
                return;
            }
            case 44: {
                this.p.a('Œ');
                return;
            }
            case 0x30: {
                this.p.a('█');
                return;
            }
            case 49: {
                this.p.a('‘');
                return;
            }
            case 50: {
                this.p.a('’');
                return;
            }
            case 51: {
                this.p.a('“');
                return;
            }
            case 52: {
                this.p.a('”');
                return;
            }
            case 53: {
                this.p.a('•');
                return;
            }
            case 57: {
                this.p.a('™');
                return;
            }
            case 58: {
                this.p.a('š');
                return;
            }
            case 60: {
                this.p.a('œ');
                return;
            }
            case 61: {
                this.p.a('℠');
                return;
            }
            case 0x3F: {
                this.p.a('Ÿ');
                return;
            }
            case 0x76: {
                this.p.a('⅛');
                return;
            }
            case 0x77: {
                this.p.a('⅜');
                return;
            }
            case 120: {
                this.p.a('⅝');
                return;
            }
            case 0x79: {
                this.p.a('⅞');
                return;
            }
            case 0x7A: {
                this.p.a('│');
                return;
            }
            case 0x7B: {
                this.p.a('┐');
                return;
            }
            case 0x7C: {
                this.p.a('└');
                return;
            }
            case 0x7D: {
                this.p.a('─');
                return;
            }
            case 0x7E: {
                this.p.a('┘');
                return;
            }
            case 0x7F: {
                this.p.a('┌');
                return;
            }
            default: {
                Log.n("Cea708Decoder", "Invalid G2 character: " + v);
            }
        }
    }
}

