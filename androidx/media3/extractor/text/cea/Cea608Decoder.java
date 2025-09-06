package androidx.media3.extractor.text.cea;

import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue.Builder;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderException;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.SubtitleInputBuffer;
import androidx.media3.extractor.text.SubtitleOutputBuffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@UnstableApi
public final class Cea608Decoder extends CeaDecoder {
    static final class CueBuilder {
        static class CueStyle {
            public final int a;
            public final boolean b;
            public int c;

            public CueStyle(int v, boolean z, int v1) {
                this.a = v;
                this.b = z;
                this.c = v1;
            }
        }

        private final List a;
        private final List b;
        private final StringBuilder c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private static final int i = 0x20;
        private static final int j = 15;

        public CueBuilder(int v, int v1) {
            this.a = new ArrayList();
            this.b = new ArrayList();
            this.c = new StringBuilder();
            this.j(v);
            this.h = v1;
        }

        public void e(char c) {
            if(this.c.length() < 0x20) {
                this.c.append(c);
            }
        }

        public void f() {
            int v = this.c.length();
            if(v > 0) {
                this.c.delete(v - 1, v);
                for(int v1 = this.a.size() - 1; v1 >= 0; --v1) {
                    CueStyle cea608Decoder$CueBuilder$CueStyle0 = (CueStyle)this.a.get(v1);
                    int v2 = cea608Decoder$CueBuilder$CueStyle0.c;
                    if(v2 != v) {
                        break;
                    }
                    cea608Decoder$CueBuilder$CueStyle0.c = v2 - 1;
                }
            }
        }

        @Nullable
        public Cue g(int v) {
            float f;
            SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder();
            for(int v1 = 0; v1 < this.b.size(); ++v1) {
                spannableStringBuilder0.append(((CharSequence)this.b.get(v1)));
                spannableStringBuilder0.append('\n');
            }
            spannableStringBuilder0.append(this.h());
            if(spannableStringBuilder0.length() == 0) {
                return null;
            }
            int v2 = this.e + this.f;
            int v3 = 0x20 - v2 - spannableStringBuilder0.length();
            int v4 = v2 - v3;
            if(v == 0x80000000) {
                if(this.g != 2 || Math.abs(v4) >= 3 && v3 >= 0) {
                    v = this.g != 2 || v4 <= 0 ? 0 : 2;
                }
                else {
                    v = 1;
                }
            }
            switch(v) {
                case 1: {
                    f = 0.5f;
                    break;
                }
                case 2: {
                    f = ((float)(0x20 - v3)) / 32.0f * 0.8f + 0.1f;
                    break;
                }
                default: {
                    f = ((float)v2) / 32.0f * 0.8f + 0.1f;
                }
            }
            int v5 = this.d;
            if(v5 > 7) {
                return new Builder().A(spannableStringBuilder0).B(Layout.Alignment.ALIGN_NORMAL).t(((float)(v5 - 17)), 1).w(f).x(v).a();
            }
            if(this.g == 1) {
                v5 -= this.h - 1;
            }
            return new Builder().A(spannableStringBuilder0).B(Layout.Alignment.ALIGN_NORMAL).t(((float)v5), 1).w(f).x(v).a();
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(this.c);
            int v = spannableStringBuilder0.length();
            int v1 = 0;
            int v2 = -1;
            int v3 = -1;
            int v4 = 0;
            int v5 = -1;
            int v6 = -1;
            int v7 = 0;
            while(v1 < this.a.size()) {
                CueStyle cea608Decoder$CueBuilder$CueStyle0 = (CueStyle)this.a.get(v1);
                boolean z = cea608Decoder$CueBuilder$CueStyle0.b;
                int v8 = cea608Decoder$CueBuilder$CueStyle0.a;
                if(v8 != 8) {
                    if(v8 != 7) {
                        v6 = Cea608Decoder.Q[v8];
                    }
                    v7 = v8 == 7 ? 1 : 0;
                }
                int v9 = cea608Decoder$CueBuilder$CueStyle0.c;
                ++v1;
                if(v9 != (v1 >= this.a.size() ? v : ((CueStyle)this.a.get(v1)).c)) {
                    if(v2 != -1 && !z) {
                        CueBuilder.q(spannableStringBuilder0, v2, v9);
                        v2 = -1;
                    }
                    else if(v2 == -1 && z) {
                        v2 = v9;
                    }
                    if(v3 != -1 && v7 == 0) {
                        CueBuilder.o(spannableStringBuilder0, v3, v9);
                        v3 = -1;
                    }
                    else if(v3 == -1 && v7 != 0) {
                        v3 = v9;
                    }
                    if(v6 != v5) {
                        CueBuilder.n(spannableStringBuilder0, v4, v9, v5);
                        v5 = v6;
                        v4 = v9;
                    }
                }
            }
            if(v2 != -1 && v2 != v) {
                CueBuilder.q(spannableStringBuilder0, v2, v);
            }
            if(v3 != -1 && v3 != v) {
                CueBuilder.o(spannableStringBuilder0, v3, v);
            }
            if(v4 != v) {
                CueBuilder.n(spannableStringBuilder0, v4, v, v5);
            }
            return new SpannableString(spannableStringBuilder0);
        }

        // 去混淆评级： 低(20)
        public boolean i() {
            return this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
        }

        public void j(int v) {
            this.g = v;
            this.a.clear();
            this.b.clear();
            this.c.setLength(0);
            this.d = 15;
            this.e = 0;
            this.f = 0;
        }

        public void k() {
            SpannableString spannableString0 = this.h();
            this.b.add(spannableString0);
            this.c.setLength(0);
            this.a.clear();
            int v = Math.min(this.h, this.d);
            while(this.b.size() >= v) {
                this.b.remove(0);
            }
        }

        public void l(int v) {
            this.g = v;
        }

        public void m(int v) {
            this.h = v;
        }

        private static void n(SpannableStringBuilder spannableStringBuilder0, int v, int v1, int v2) {
            if(v2 == -1) {
                return;
            }
            spannableStringBuilder0.setSpan(new ForegroundColorSpan(v2), v, v1, 33);
        }

        private static void o(SpannableStringBuilder spannableStringBuilder0, int v, int v1) {
            spannableStringBuilder0.setSpan(new StyleSpan(2), v, v1, 33);
        }

        public void p(int v, boolean z) {
            CueStyle cea608Decoder$CueBuilder$CueStyle0 = new CueStyle(v, z, this.c.length());
            this.a.add(cea608Decoder$CueBuilder$CueStyle0);
        }

        private static void q(SpannableStringBuilder spannableStringBuilder0, int v, int v1) {
            spannableStringBuilder0.setSpan(new UnderlineSpan(), v, v1, 33);
        }
    }

    private long A;
    public static final long B = 16000L;
    private static final String C = "Cea608Decoder";
    private static final int D = 4;
    private static final int E = 2;
    private static final int F = 1;
    private static final int G = 0;
    private static final int H = 1;
    private static final int I = 0;
    private static final int J = 1;
    private static final int K = 0;
    private static final int L = 1;
    private static final int M = 2;
    private static final int N = 3;
    private static final int[] O = null;
    private static final int[] P = null;
    private static final int[] Q = null;
    private static final int R = 7;
    private static final int S = 8;
    private static final int T = 4;
    private static final byte U = -4;
    private static final byte V = 0x20;
    private static final byte W = 33;
    private static final byte X = 36;
    private static final byte Y = 37;
    private static final byte Z = 38;
    private static final byte a0 = 39;
    private static final byte b0 = 41;
    private static final byte c0 = 42;
    private static final byte d0 = 43;
    private static final byte e0 = 44;
    private static final byte f0 = 45;
    private static final byte g0 = 46;
    private static final byte h0 = 0x2F;
    private static final int[] i0;
    private final ParsableByteArray j;
    private static final int[] j0;
    private final int k;
    private static final int[] k0;
    private final int l;
    private static final int[] l0;
    private final int m;
    private static final boolean[] m0;
    private final long n;
    private final ArrayList o;
    private CueBuilder p;
    @Nullable
    private List q;
    @Nullable
    private List r;
    private int s;
    private int t;
    private boolean u;
    private boolean v;
    private byte w;
    private byte x;
    private int y;
    private boolean z;

    static {
        Cea608Decoder.O = new int[]{11, 1, 3, 12, 14, 5, 7, 9};
        Cea608Decoder.P = new int[]{0, 4, 8, 12, 16, 20, 24, 28};
        Cea608Decoder.Q = new int[]{-1, 0xFF00FF00, 0xFF0000FF, 0xFF00FFFF, 0xFFFF0000, 0xFFFFFF00, 0xFFFF00FF};
        Cea608Decoder.i0 = new int[]{0x20, 33, 34, 35, 36, 37, 38, 39, 40, 41, 0xE1, 43, 44, 45, 46, 0x2F, 0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 0x3F, 0x40, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 0x4F, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 0xE9, 93, 0xED, 0xF3, 0xFA, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 0x6F, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 120, 0x79, 0x7A, 0xE7, 0xF7, 209, 0xF1, 0x25A0};
        Cea608Decoder.j0 = new int[]{0xAE, 0xB0, 0xBD, 0xBF, 8482, 0xA2, 0xA3, 9834, 0xE0, 0x20, 0xE8, 0xE2, 0xEA, 0xEE, 0xF4, 0xFB};
        Cea608Decoder.k0 = new int[]{0xC1, 201, 0xD3, 0xDA, 220, 0xFC, 0x2018, 0xA1, 42, 39, 0x2014, 0xA9, 8480, 0x2022, 8220, 0x201D, 0xC0, 0xC2, 0xC7, 200, 202, 203, 0xEB, 206, 0xCF, 0xEF, 0xD4, 0xD9, 0xF9, 0xDB, 0xAB, 0xBB};
        Cea608Decoder.l0 = new int[]{0xC3, 0xE3, 205, 204, 0xEC, 210, 0xF2, 0xD5, 0xF5, 0x7B, 0x7D, 92, 94, 0x5F, 0x7C, 0x7E, 0xC4, 0xE4, 0xD6, 0xF6, 0xDF, 0xA5, 0xA4, 0x2502, 0xC5, 0xE5, 0xD8, 0xF8, 0x250C, 0x2510, 9492, 9496};
        Cea608Decoder.m0 = new boolean[]{false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    }

    public Cea608Decoder(String s, int v, long v1) {
        this.j = new ParsableByteArray();
        this.o = new ArrayList();
        this.p = new CueBuilder(0, 4);
        this.y = 0;
        if(v1 == 0x8000000000000001L) {
            this.n = 0x8000000000000001L;
        }
        else {
            Assertions.a(v1 >= 16000L);
            this.n = v1 * 1000L;
        }
        this.k = "application/x-mp4-cea-608".equals(s) ? 2 : 3;
        switch(v) {
            case 1: {
                this.m = 0;
                this.l = 0;
                break;
            }
            case 2: {
                this.m = 1;
                this.l = 0;
                break;
            }
            case 3: {
                this.m = 0;
                this.l = 1;
                break;
            }
            case 4: {
                this.m = 1;
                this.l = 1;
                break;
            }
            default: {
                Log.n("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                this.m = 0;
                this.l = 0;
            }
        }
        this.O(0);
        this.N();
        this.z = true;
        this.A = 0x8000000000000001L;
    }

    private void A(byte b, byte b1) {
        int v = Cea608Decoder.O[b & 7];
        if((b1 & 0x20) != 0) {
            ++v;
        }
        if(v != this.p.d) {
            if(this.s != 1 && !this.p.i()) {
                CueBuilder cea608Decoder$CueBuilder0 = new CueBuilder(this.s, this.t);
                this.p = cea608Decoder$CueBuilder0;
                this.o.add(cea608Decoder$CueBuilder0);
            }
            this.p.d = v;
        }
        boolean z = false;
        boolean z1 = (b1 & 16) == 16;
        if((b1 & 1) == 1) {
            z = true;
        }
        int v1 = b1 >> 1 & 7;
        this.p.p((z1 ? 8 : v1), z);
        if(z1) {
            this.p.e = Cea608Decoder.P[v1];
        }
    }

    private static boolean B(byte b) {
        return (b & 0xE0) == 0;
    }

    private static boolean C(byte b, byte b1) {
        return (b & 0xF6) == 18 && (b1 & 0xE0) == 0x20;
    }

    private static boolean D(byte b, byte b1) {
        return (b & 0xF7) == 17 && (b1 & 0xF0) == 0x20;
    }

    private static boolean E(byte b, byte b1) {
        return (b & 0xF6) == 20 && (b1 & 0xF0) == 0x20;
    }

    private static boolean F(byte b, byte b1) {
        return (b & 0xF0) == 16 && (b1 & 0xC0) == 0x40;
    }

    private static boolean G(byte b) {
        return (b & 0xF0) == 16;
    }

    private boolean H(boolean z, byte b, byte b1) {
        if(z && Cea608Decoder.G(b)) {
            if(this.v && this.w == b && this.x == b1) {
                this.v = false;
                return true;
            }
            this.v = true;
            this.w = b;
            this.x = b1;
            return false;
        }
        this.v = false;
        return false;
    }

    private static boolean I(byte b) {
        return (b & 0xF6) == 20;
    }

    private static boolean J(byte b, byte b1) {
        return (b & 0xF7) == 17 && (b1 & 0xF0) == 0x30;
    }

    private static boolean K(byte b, byte b1) {
        return (b & 0xF7) == 23 && b1 >= 33 && b1 <= 35;
    }

    private static boolean L(byte b) {
        return 1 <= b && b <= 15;
    }

    private void M(byte b, byte b1) {
        if(Cea608Decoder.L(b)) {
            this.z = false;
            return;
        }
        if(Cea608Decoder.I(b)) {
            if(b1 != 0x20 && b1 != 0x2F && (b1 != 37 && b1 != 38 && b1 != 39)) {
                switch(b1) {
                    case 41: {
                        break;
                    }
                    case 42: 
                    case 43: {
                        this.z = false;
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            this.z = true;
        }
    }

    private void N() {
        this.p.j(this.s);
        this.o.clear();
        this.o.add(this.p);
    }

    private void O(int v) {
        int v1 = this.s;
        if(v1 == v) {
            return;
        }
        this.s = v;
        if(v == 3) {
            for(int v2 = 0; v2 < this.o.size(); ++v2) {
                ((CueBuilder)this.o.get(v2)).l(3);
            }
            return;
        }
        this.N();
        if(v1 == 3 || (v == 0 || v == 1)) {
            this.q = Collections.emptyList();
        }
    }

    private void P(int v) {
        this.t = v;
        this.p.m(v);
    }

    private boolean Q() {
        return this.n != 0x8000000000000001L && this.A != 0x8000000000000001L && this.l() - this.A >= this.n;
    }

    private boolean R(byte b) {
        if(Cea608Decoder.B(b)) {
            this.y = b >> 3 & 1;
        }
        return this.y == this.m;
    }

    @Override  // androidx.media3.extractor.text.cea.CeaDecoder
    @Nullable
    public Object a() throws DecoderException {
        return this.j();
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
        this.O(0);
        this.P(4);
        this.N();
        this.u = false;
        this.v = false;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = true;
        this.A = 0x8000000000000001L;
    }

    @Override  // androidx.media3.extractor.text.cea.CeaDecoder
    protected Subtitle g() {
        this.r = this.q;
        return new CeaSubtitle(((List)Assertions.g(this.q)));
    }

    @Override  // androidx.media3.extractor.text.cea.CeaDecoder
    public String getName() {
        return "Cea608Decoder";
    }

    @Override  // androidx.media3.extractor.text.cea.CeaDecoder
    protected void h(SubtitleInputBuffer subtitleInputBuffer0) {
        ByteBuffer byteBuffer0 = (ByteBuffer)Assertions.g(subtitleInputBuffer0.d);
        byte[] arr_b = byteBuffer0.array();
        this.j.W(arr_b, byteBuffer0.limit());
        boolean z = false;
        while(true) {
            int v = this.k;
            if(this.j.a() < v) {
                break;
            }
            int v1 = v == 2 ? -4 : this.j.L();
            int v2 = this.j.L();
            int v3 = this.j.L();
            if((v1 & 2) == 0 && (v1 & 1) == this.l && (((byte)(v2 & 0x7F)) != 0 || ((byte)(v3 & 0x7F)) != 0)) {
                boolean z1 = this.u;
                boolean z2 = (v1 & 4) == 4 && (Cea608Decoder.m0[v2] && Cea608Decoder.m0[v3]);
                this.u = z2;
                if(!this.H(z2, ((byte)(v2 & 0x7F)), ((byte)(v3 & 0x7F)))) {
                    if(this.u) {
                        this.M(((byte)(v2 & 0x7F)), ((byte)(v3 & 0x7F)));
                        if(!this.z || !this.R(((byte)(v2 & 0x7F)))) {
                            continue;
                        }
                        if(!Cea608Decoder.B(((byte)(v2 & 0x7F)))) {
                            this.p.e(Cea608Decoder.r(((byte)(v2 & 0x7F))));
                            if((((byte)(v3 & 0x7F)) & 0xE0) != 0) {
                                this.p.e(Cea608Decoder.r(((byte)(v3 & 0x7F))));
                            }
                        }
                        else if(Cea608Decoder.J(((byte)(v2 & 0x7F)), ((byte)(v3 & 0x7F)))) {
                            this.p.e(Cea608Decoder.x(((byte)(v3 & 0x7F))));
                        }
                        else if(Cea608Decoder.C(((byte)(v2 & 0x7F)), ((byte)(v3 & 0x7F)))) {
                            this.p.f();
                            this.p.e(Cea608Decoder.w(((byte)(v2 & 0x7F)), ((byte)(v3 & 0x7F))));
                        }
                        else if(Cea608Decoder.D(((byte)(v2 & 0x7F)), ((byte)(v3 & 0x7F)))) {
                            this.y(((byte)(v3 & 0x7F)));
                        }
                        else if(Cea608Decoder.F(((byte)(v2 & 0x7F)), ((byte)(v3 & 0x7F)))) {
                            this.A(((byte)(v2 & 0x7F)), ((byte)(v3 & 0x7F)));
                        }
                        else if(Cea608Decoder.K(((byte)(v2 & 0x7F)), ((byte)(v3 & 0x7F)))) {
                            this.p.f = ((byte)(v3 & 0x7F)) - 0x20;
                        }
                        else if(Cea608Decoder.E(((byte)(v2 & 0x7F)), ((byte)(v3 & 0x7F)))) {
                            this.z(((byte)(v3 & 0x7F)));
                        }
                    }
                    else {
                        if(!z1) {
                            continue;
                        }
                        this.N();
                    }
                    z = true;
                }
            }
        }
        if(z && (this.s == 1 || this.s == 3)) {
            this.q = this.t();
            this.A = this.l();
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
        SubtitleOutputBuffer subtitleOutputBuffer0 = super.j();
        if(subtitleOutputBuffer0 != null) {
            return subtitleOutputBuffer0;
        }
        if(this.Q()) {
            SubtitleOutputBuffer subtitleOutputBuffer1 = this.k();
            if(subtitleOutputBuffer1 != null) {
                this.q = Collections.emptyList();
                this.A = 0x8000000000000001L;
                subtitleOutputBuffer1.r(this.l(), this.g(), 0x7FFFFFFFFFFFFFFFL);
                return subtitleOutputBuffer1;
            }
        }
        return null;
    }

    @Override  // androidx.media3.extractor.text.cea.CeaDecoder
    protected boolean m() {
        return this.q != this.r;
    }

    @Override  // androidx.media3.extractor.text.cea.CeaDecoder
    public void n(SubtitleInputBuffer subtitleInputBuffer0) throws SubtitleDecoderException {
        super.n(subtitleInputBuffer0);
    }

    private static char r(byte b) {
        return (char)Cea608Decoder.i0[(b & 0x7F) - 0x20];
    }

    @Override  // androidx.media3.extractor.text.cea.CeaDecoder
    public void release() {
    }

    private static int s(byte b) [...] // Inlined contents

    private List t() {
        int v = this.o.size();
        ArrayList arrayList0 = new ArrayList(v);
        int v1 = 2;
        for(int v3 = 0; v3 < v; ++v3) {
            Cue cue0 = ((CueBuilder)this.o.get(v3)).g(0x80000000);
            arrayList0.add(cue0);
            if(cue0 != null) {
                v1 = Math.min(v1, cue0.i);
            }
        }
        List list0 = new ArrayList(v);
        for(int v2 = 0; v2 < v; ++v2) {
            Cue cue1 = (Cue)arrayList0.get(v2);
            if(cue1 != null) {
                if(cue1.i != v1) {
                    cue1 = (Cue)Assertions.g(((CueBuilder)this.o.get(v2)).g(v1));
                }
                list0.add(cue1);
            }
        }
        return list0;
    }

    private static char u(byte b) {
        return (char)Cea608Decoder.k0[b & 0x1F];
    }

    private static char v(byte b) {
        return (char)Cea608Decoder.l0[b & 0x1F];
    }

    private static char w(byte b, byte b1) {
        return (b & 1) == 0 ? Cea608Decoder.u(b1) : Cea608Decoder.v(b1);
    }

    private static char x(byte b) {
        return (char)Cea608Decoder.j0[b & 15];
    }

    private void y(byte b) {
        this.p.e(' ');
        this.p.p(b >> 1 & 7, (b & 1) == 1);
    }

    private void z(byte b) {
        switch(b) {
            case 0x20: {
                this.O(2);
                return;
            }
            case 37: {
                this.O(1);
                this.P(2);
                return;
            }
            case 38: {
                this.O(1);
                this.P(3);
                return;
            }
            case 39: {
                this.O(1);
                this.P(4);
                return;
            }
            case 41: {
                this.O(3);
                return;
            }
            default: {
                int v = this.s;
                if(v == 0) {
                    return;
                }
                if(b == 33) {
                    this.p.f();
                }
                else {
                    switch(b) {
                        case 44: {
                            this.q = Collections.emptyList();
                            if(this.s == 1 || this.s == 3) {
                                this.N();
                                return;
                            }
                            break;
                        }
                        case 45: {
                            if(v == 1 && !this.p.i()) {
                                this.p.k();
                                return;
                            }
                            break;
                        }
                        case 46: {
                            this.N();
                            return;
                        }
                        case 0x2F: {
                            this.q = this.t();
                            this.N();
                        }
                    }
                }
            }
        }
    }
}

