package androidx.media3.extractor.mkv;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DrmInitData.SchemeData;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.LongArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.AacUtil.Config;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.AvcConfig;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.DolbyVisionConfig;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.HevcConfig;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap.Unseekable;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput.CryptoData;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.TrueHdSampleRechunker;
import androidx.media3.extractor.text.SubtitleParser.Factory;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import com.google.common.collect.O2;
import h4.d;
import h4.m;
import j..util.DesugarCollections;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

@UnstableApi
public class MatroskaExtractor implements Extractor {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface Flags {
    }

    final class InnerEbmlProcessor implements EbmlProcessor {
        final MatroskaExtractor g;

        private InnerEbmlProcessor() {
        }

        InnerEbmlProcessor(androidx.media3.extractor.mkv.MatroskaExtractor.1 matroskaExtractor$10) {
        }

        @Override  // androidx.media3.extractor.mkv.EbmlProcessor
        public void a(int v) throws ParserException {
            MatroskaExtractor.this.r(v);
        }

        @Override  // androidx.media3.extractor.mkv.EbmlProcessor
        public void b(int v, double f) throws ParserException {
            MatroskaExtractor.this.u(v, f);
        }

        @Override  // androidx.media3.extractor.mkv.EbmlProcessor
        public void c(int v, int v1, ExtractorInput extractorInput0) throws IOException {
            MatroskaExtractor.this.o(v, v1, extractorInput0);
        }

        @Override  // androidx.media3.extractor.mkv.EbmlProcessor
        public void d(int v, long v1) throws ParserException {
            MatroskaExtractor.this.A(v, v1);
        }

        @Override  // androidx.media3.extractor.mkv.EbmlProcessor
        public void e(int v, String s) throws ParserException {
            MatroskaExtractor.this.M(v, s);
        }

        @Override  // androidx.media3.extractor.mkv.EbmlProcessor
        public void f(int v, long v1, long v2) throws ParserException {
            MatroskaExtractor.this.L(v, v1, v2);
        }

        @Override  // androidx.media3.extractor.mkv.EbmlProcessor
        public int g(int v) {
            return MatroskaExtractor.this.x(v);
        }

        @Override  // androidx.media3.extractor.mkv.EbmlProcessor
        public boolean h(int v) {
            return MatroskaExtractor.this.C(v);
        }
    }

    public static final class Track {
        public int A;
        public int B;
        public int C;
        public int D;
        public float E;
        public float F;
        public float G;
        public float H;
        public float I;
        public float J;
        public float K;
        public float L;
        public float M;
        public float N;
        public byte[] O;
        public int P;
        public int Q;
        public int R;
        public long S;
        public long T;
        public TrueHdSampleRechunker U;
        public boolean V;
        public boolean W;
        private String X;
        public TrackOutput Y;
        public int Z;
        public String a;
        private static final int a0 = 0;
        public String b;
        private static final int b0 = 50000;
        public int c;
        private static final int c0 = 1000;
        public int d;
        private static final int d0 = 200;
        public int e;
        public int f;
        private int g;
        public boolean h;
        public byte[] i;
        public CryptoData j;
        public byte[] k;
        public DrmInitData l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public int s;
        public float t;
        public float u;
        public float v;
        public byte[] w;
        public int x;
        public boolean y;
        public int z;

        protected Track() {
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.r = 0;
            this.s = -1;
            this.t = 0.0f;
            this.u = 0.0f;
            this.v = 0.0f;
            this.w = null;
            this.x = -1;
            this.y = false;
            this.z = -1;
            this.A = -1;
            this.B = -1;
            this.C = 1000;
            this.D = 200;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = -1.0f;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = -1.0f;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = -1.0f;
            this.P = 1;
            this.Q = -1;
            this.R = 8000;
            this.S = 0L;
            this.T = 0L;
            this.W = true;
            this.X = "eng";
        }

        @d({"output"})
        private void f() {
            Assertions.g(this.Y);
        }

        @d({"codecPrivate"})
        private byte[] g(String s) throws ParserException {
            byte[] arr_b = this.k;
            if(arr_b == null) {
                throw ParserException.a(("Missing CodecPrivate for codec " + s), null);
            }
            return arr_b;
        }

        @Nullable
        private byte[] h() {
            if(this.E != -1.0f && this.F != -1.0f && this.G != -1.0f && this.H != -1.0f && this.I != -1.0f && this.J != -1.0f && this.K != -1.0f && this.L != -1.0f && this.M != -1.0f && this.N != -1.0f) {
                byte[] arr_b = new byte[25];
                ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b).order(ByteOrder.LITTLE_ENDIAN);
                byteBuffer0.put(0);
                byteBuffer0.putShort(((short)(((int)(this.E * 50000.0f + 0.5f)))));
                byteBuffer0.putShort(((short)(((int)(this.F * 50000.0f + 0.5f)))));
                byteBuffer0.putShort(((short)(((int)(this.G * 50000.0f + 0.5f)))));
                byteBuffer0.putShort(((short)(((int)(this.H * 50000.0f + 0.5f)))));
                byteBuffer0.putShort(((short)(((int)(this.I * 50000.0f + 0.5f)))));
                byteBuffer0.putShort(((short)(((int)(this.J * 50000.0f + 0.5f)))));
                byteBuffer0.putShort(((short)(((int)(this.K * 50000.0f + 0.5f)))));
                byteBuffer0.putShort(((short)(((int)(this.L * 50000.0f + 0.5f)))));
                byteBuffer0.putShort(((short)(((int)(this.M + 0.5f)))));
                byteBuffer0.putShort(((short)(((int)(this.N + 0.5f)))));
                byteBuffer0.putShort(((short)this.C));
                byteBuffer0.putShort(((short)this.D));
                return arr_b;
            }
            return null;
        }

        @d({"this.output"})
        @m({"codecId"})
        public void i(ExtractorOutput extractorOutput0, int v) throws ParserException {
            float f;
            int v10;
            int v8;
            String s3;
            List list1;
            List list0;
            int v5;
            String s2;
            int v4;
            int v1;
            String s = this.b;
            s.hashCode();
            String s1 = "audio/raw";
            ColorInfo colorInfo0 = null;
            switch(s) {
                case "A_AAC": {
                    v1 = 13;
                    break;
                }
                case "A_AC3": {
                    v1 = 14;
                    break;
                }
                case "A_DTS": {
                    v1 = 15;
                    break;
                }
                case "A_DTS/EXPRESS": {
                    v1 = 21;
                    break;
                }
                case "A_DTS/LOSSLESS": {
                    v1 = 12;
                    break;
                }
                case "A_EAC3": {
                    v1 = 30;
                    break;
                }
                case "A_FLAC": {
                    v1 = 0x1F;
                    break;
                }
                case "A_MPEG/L2": {
                    v1 = 5;
                    break;
                }
                case "A_MPEG/L3": {
                    v1 = 6;
                    break;
                }
                case "A_MS/ACM": {
                    v1 = 2;
                    break;
                }
                case "A_OPUS": {
                    v1 = 0x20;
                    break;
                }
                case "A_PCM/FLOAT/IEEE": {
                    v1 = 22;
                    break;
                }
                case "A_PCM/INT/BIG": {
                    v1 = 23;
                    break;
                }
                case "A_PCM/INT/LIT": {
                    v1 = 24;
                    break;
                }
                case "A_TRUEHD": {
                    v1 = 3;
                    break;
                }
                case "A_VORBIS": {
                    v1 = 4;
                    break;
                }
                case "S_DVBSUB": {
                    v1 = 8;
                    break;
                }
                case "S_HDMV/PGS": {
                    v1 = 19;
                    break;
                }
                case "S_TEXT/ASS": {
                    v1 = 25;
                    break;
                }
                case "S_TEXT/UTF8": {
                    v1 = 28;
                    break;
                }
                case "S_TEXT/WEBVTT": {
                    v1 = 27;
                    break;
                }
                case "S_VOBSUB": {
                    v1 = 11;
                    break;
                }
                case "V_AV1": {
                    v1 = 16;
                    break;
                }
                case "V_MPEG2": {
                    v1 = 29;
                    break;
                }
                case "V_MPEG4/ISO/AP": {
                    v1 = 0;
                    break;
                }
                case "V_MPEG4/ISO/ASP": {
                    v1 = 9;
                    break;
                }
                case "V_MPEG4/ISO/AVC": {
                    v1 = 10;
                    break;
                }
                case "V_MPEG4/ISO/SP": {
                    v1 = 1;
                    break;
                }
                case "V_MPEGH/ISO/HEVC": {
                    v1 = 26;
                    break;
                }
                case "V_MS/VFW/FOURCC": {
                    v1 = 7;
                    break;
                }
                case "V_THEORA": {
                    v1 = 20;
                    break;
                }
                case "V_VP8": {
                    v1 = 17;
                    break;
                }
                case "V_VP9": {
                    v1 = 18;
                    break;
                }
                default: {
                    v1 = -1;
                }
            }
            int v2 = 0;
            switch(v1) {
                case 2: {
                    if(Track.l(new ParsableByteArray(this.g(this.b)))) {
                        int v3 = Util.z0(this.Q);
                        if(v3 == 0) {
                            Log.n("MatroskaExtractor", "Unsupported PCM bit depth: " + this.Q + ". Setting mimeType to " + "audio/x-unknown");
                            list0 = null;
                            s2 = null;
                            s1 = "audio/x-unknown";
                            v5 = -1;
                            goto label_228;
                        }
                        else {
                            v4 = v3;
                            list0 = null;
                            s2 = null;
                            v5 = -1;
                            break;
                        }
                    }
                    else {
                        Log.n("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                        list0 = null;
                        s2 = null;
                        s1 = "audio/x-unknown";
                        v5 = -1;
                        goto label_228;
                    }
                    break;
                }
                case 3: {
                    this.U = new TrueHdSampleRechunker();
                    s1 = "audio/true-hd";
                    list0 = null;
                    s2 = null;
                    v5 = -1;
                    goto label_228;
                }
                case 4: {
                    list0 = Track.m(this.g(this.b));
                    s1 = "audio/vorbis";
                    v5 = 0x2000;
                    s2 = null;
                    goto label_228;
                }
                case 5: {
                    s1 = "audio/mpeg-L2";
                    list0 = null;
                    s2 = null;
                    v5 = 0x1000;
                    goto label_228;
                }
                case 6: {
                    s1 = "audio/mpeg";
                    list0 = null;
                    s2 = null;
                    v5 = 0x1000;
                    goto label_228;
                }
                case 7: {
                    Pair pair0 = Track.k(new ParsableByteArray(this.g(this.b)));
                    s1 = (String)pair0.first;
                    list0 = (List)pair0.second;
                    s2 = null;
                    v5 = -1;
                    goto label_228;
                }
                case 8: {
                    byte[] arr_b = new byte[4];
                    System.arraycopy(this.g(this.b), 0, arr_b, 0, 4);
                    list0 = O2.B(arr_b);
                    s1 = "application/dvbsubs";
                    s2 = null;
                    v5 = -1;
                    goto label_228;
                }
                case 0: 
                case 1: 
                case 9: {
                    list0 = this.k == null ? null : Collections.singletonList(this.k);
                    s1 = "video/mp4v-es";
                    s2 = null;
                    v5 = -1;
                    goto label_228;
                }
                case 10: {
                    AvcConfig avcConfig0 = AvcConfig.b(new ParsableByteArray(this.g(this.b)));
                    list1 = avcConfig0.a;
                    this.Z = avcConfig0.b;
                    s3 = avcConfig0.l;
                    s1 = "video/avc";
                    goto label_195;
                }
                case 11: {
                    list0 = O2.B(this.g(this.b));
                    s1 = "application/vobsub";
                    s2 = null;
                    v5 = -1;
                    goto label_228;
                }
                case 12: {
                    s1 = "audio/vnd.dts.hd";
                    list0 = null;
                    s2 = null;
                    v5 = -1;
                    goto label_228;
                }
                case 13: {
                    list0 = Collections.singletonList(this.g(this.b));
                    Config aacUtil$Config0 = AacUtil.f(this.k);
                    this.R = aacUtil$Config0.a;
                    this.P = aacUtil$Config0.b;
                    s2 = aacUtil$Config0.c;
                    s1 = "audio/mp4a-latm";
                    v5 = -1;
                    goto label_228;
                }
                case 14: {
                    s1 = "audio/ac3";
                    list0 = null;
                    s2 = null;
                    v5 = -1;
                    goto label_228;
                }
                case 16: {
                    s1 = "video/av01";
                    list0 = null;
                    s2 = null;
                    v5 = -1;
                    goto label_228;
                }
                case 17: {
                    s1 = "video/x-vnd.on2.vp8";
                    list0 = null;
                    s2 = null;
                    v5 = -1;
                    goto label_228;
                }
                case 18: {
                    s1 = "video/x-vnd.on2.vp9";
                    list0 = null;
                    s2 = null;
                    v5 = -1;
                    goto label_228;
                }
                case 19: {
                    s1 = "application/pgs";
                    list0 = null;
                    s2 = null;
                    v5 = -1;
                    goto label_228;
                }
                case 20: {
                    s1 = "video/x-unknown";
                    list0 = null;
                    s2 = null;
                    v5 = -1;
                    goto label_228;
                }
                case 15: 
                case 21: {
                    s1 = "audio/vnd.dts";
                    list0 = null;
                    s2 = null;
                    v5 = -1;
                    goto label_228;
                }
                case 22: {
                    if(this.Q == 0x20) {
                        list0 = null;
                        s2 = null;
                        v5 = -1;
                        v4 = 4;
                    }
                    else {
                        Log.n("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + this.Q + ". Setting mimeType to " + "audio/x-unknown");
                        list0 = null;
                        s2 = null;
                        s1 = "audio/x-unknown";
                        v5 = -1;
                        goto label_228;
                    }
                    break;
                }
                case 23: {
                    int v6 = this.Q;
                    if(v6 == 8) {
                        list0 = null;
                        s2 = null;
                        v5 = -1;
                        v4 = 3;
                    }
                    else {
                        if(v6 == 16) {
                            v4 = 0x10000000;
                        }
                        else {
                            switch(v6) {
                                case 24: {
                                    v4 = 0x50000000;
                                    break;
                                }
                                case 0x20: {
                                    v4 = 0x60000000;
                                    break;
                                }
                                default: {
                                    Log.n("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + this.Q + ". Setting mimeType to " + "audio/x-unknown");
                                    list0 = null;
                                    s2 = null;
                                    s1 = "audio/x-unknown";
                                    v5 = -1;
                                    goto label_228;
                                }
                            }
                        }
                        list0 = null;
                        s2 = null;
                        v5 = -1;
                        break;
                    }
                    break;
                }
                case 24: {
                    int v7 = Util.z0(this.Q);
                    if(v7 == 0) {
                        Log.n("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.Q + ". Setting mimeType to " + "audio/x-unknown");
                        list0 = null;
                        s2 = null;
                        s1 = "audio/x-unknown";
                        v5 = -1;
                        goto label_228;
                    }
                    else {
                        v4 = v7;
                        list0 = null;
                        s2 = null;
                        v5 = -1;
                    }
                    break;
                }
                case 25: {
                    list0 = O2.C(MatroskaExtractor.g3, this.g(this.b));
                    s2 = null;
                    s1 = "text/x-ssa";
                    v5 = -1;
                    goto label_228;
                }
                case 26: {
                    HevcConfig hevcConfig0 = HevcConfig.a(new ParsableByteArray(this.g(this.b)));
                    list1 = hevcConfig0.a;
                    this.Z = hevcConfig0.b;
                    s3 = hevcConfig0.l;
                    s1 = "video/hevc";
                label_195:
                    v5 = -1;
                    v4 = -1;
                    s2 = s3;
                    list0 = list1;
                    break;
                }
                case 27: {
                    list0 = null;
                    s2 = null;
                    s1 = "text/vtt";
                    v5 = -1;
                    goto label_228;
                }
                case 28: {
                    list0 = null;
                    s2 = null;
                    s1 = "application/x-subrip";
                    v5 = -1;
                    goto label_228;
                }
                case 29: {
                    s1 = "video/mpeg2";
                    list0 = null;
                    s2 = null;
                    v5 = -1;
                    goto label_228;
                }
                case 30: {
                    s1 = "audio/eac3";
                    list0 = null;
                    s2 = null;
                    v5 = -1;
                    goto label_228;
                }
                case 0x1F: {
                    list0 = Collections.singletonList(this.g(this.b));
                    s1 = "audio/flac";
                    s2 = null;
                    v5 = -1;
                    goto label_228;
                }
                case 0x20: {
                    list0 = new ArrayList(3);
                    list0.add(this.g(this.b));
                    ByteBuffer byteBuffer0 = ByteBuffer.allocate(8);
                    ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
                    list0.add(byteBuffer0.order(byteOrder0).putLong(this.S).array());
                    list0.add(ByteBuffer.allocate(8).order(byteOrder0).putLong(this.T).array());
                    s1 = "audio/opus";
                    v5 = 5760;
                    s2 = null;
                label_228:
                    v4 = -1;
                    break;
                }
                default: {
                    throw ParserException.a("Unrecognized codec identifier.", null);
                }
            }
            if(this.O != null) {
                DolbyVisionConfig dolbyVisionConfig0 = DolbyVisionConfig.a(new ParsableByteArray(this.O));
                if(dolbyVisionConfig0 != null) {
                    s2 = dolbyVisionConfig0.c;
                    s1 = "video/dolby-vision";
                }
            }
            boolean z = this.W;
            Builder format$Builder0 = new Builder();
            if(MimeTypes.q(s1)) {
                format$Builder0.N(this.P).p0(this.R).i0(v4);
                v8 = 1;
            }
            else if(MimeTypes.u(s1)) {
                if(this.r == 0) {
                    int v9 = this.p;
                    v10 = -1;
                    if(v9 == -1) {
                        v9 = this.m;
                    }
                    this.p = v9;
                    this.q = this.q == -1 ? this.n : this.q;
                }
                else {
                    v10 = -1;
                }
                int v11 = this.p;
                if(v11 == -1) {
                    f = -1.0f;
                }
                else {
                    int v12 = this.q;
                    f = v12 == -1 ? -1.0f : ((float)(this.n * v11)) / ((float)(this.m * v12));
                }
                if(this.y) {
                    byte[] arr_b1 = this.h();
                    colorInfo0 = new androidx.media3.common.ColorInfo.Builder().d(this.z).c(this.B).e(this.A).f(arr_b1).g(this.o).b(this.o).a();
                }
                if(this.a != null && MatroskaExtractor.t3.containsKey(this.a)) {
                    v10 = (int)(((Integer)MatroskaExtractor.t3.get(this.a)));
                }
                if(this.s != 0 || Float.compare(this.t, 0.0f) != 0 || Float.compare(this.u, 0.0f) != 0) {
                    v2 = v10;
                }
                else if(Float.compare(this.v, 0.0f) != 0) {
                    if(Float.compare(this.v, 90.0f) == 0) {
                        v2 = 90;
                    }
                    else if(Float.compare(this.v, -180.0f) == 0 || Float.compare(this.v, 180.0f) == 0) {
                        v2 = 180;
                    }
                    else if(Float.compare(this.v, -90.0f) == 0) {
                        v2 = 270;
                    }
                    else {
                        v2 = v10;
                    }
                }
                format$Builder0.v0(this.m).Y(this.n).k0(f).n0(v2).l0(this.w).r0(this.x).P(colorInfo0);
                v8 = 2;
            }
            else {
                if(!"application/x-subrip".equals(s1) && !"text/x-ssa".equals(s1) && !"text/vtt".equals(s1) && !"application/vobsub".equals(s1) && !"application/pgs".equals(s1) && !"application/dvbsubs".equals(s1)) {
                    throw ParserException.a("Unexpected MIME type.", null);
                }
                v8 = 3;
            }
            if(this.a != null && !MatroskaExtractor.t3.containsKey(this.a)) {
                format$Builder0.c0(this.a);
            }
            Format format0 = format$Builder0.Z(v).o0(s1).f0(v5).e0(this.X).q0(z).b0(list0).O(s2).U(this.l).K();
            TrackOutput trackOutput0 = extractorOutput0.b(this.c, v8);
            this.Y = trackOutput0;
            trackOutput0.d(format0);
        }

        @m({"output"})
        public void j() {
            TrueHdSampleRechunker trueHdSampleRechunker0 = this.U;
            if(trueHdSampleRechunker0 != null) {
                trueHdSampleRechunker0.a(this.Y, this.j);
            }
        }

        private static Pair k(ParsableByteArray parsableByteArray0) throws ParserException {
            try {
                parsableByteArray0.Z(16);
                long v = parsableByteArray0.A();
                if(v == 1482049860L) {
                    return new Pair("video/divx", null);
                }
                if(v == 0x33363248L) {
                    return new Pair("video/3gpp", null);
                }
                if(v == 0x31435657L) {
                    int v1 = parsableByteArray0.f() + 20;
                    byte[] arr_b = parsableByteArray0.e();
                    while(v1 < arr_b.length - 4) {
                        if(arr_b[v1] == 0 && arr_b[v1 + 1] == 0 && arr_b[v1 + 2] == 1 && arr_b[v1 + 3] == 15) {
                            return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(arr_b, v1, arr_b.length)));
                        }
                        ++v1;
                    }
                    throw ParserException.a("Failed to find FourCC VC1 initialization data", null);
                }
            }
            catch(ArrayIndexOutOfBoundsException unused_ex) {
                throw ParserException.a("Error parsing FourCC private data", null);
            }
            Log.n("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
            return new Pair("video/x-unknown", null);
        }

        private static boolean l(ParsableByteArray parsableByteArray0) throws ParserException {
            try {
                int v = parsableByteArray0.D();
                if(v == 1) {
                    return true;
                }
                if(v != 0xFFFE) {
                    return false;
                }
                parsableByteArray0.Y(24);
                return parsableByteArray0.E() != MatroskaExtractor.s3.getMostSignificantBits() || parsableByteArray0.E() != MatroskaExtractor.s3.getLeastSignificantBits() ? false : true;
            }
            catch(ArrayIndexOutOfBoundsException unused_ex) {
                throw ParserException.a("Error parsing MS/ACM codec private", null);
            }
        }

        private static List m(byte[] arr_b) throws ParserException {
            int v6;
            int v2;
            try {
                if(arr_b[0] != 2) {
                    throw ParserException.a("Error parsing vorbis codec private", null);
                }
                int v = 1;
                int v1 = 0;
                while(true) {
                    v2 = arr_b[v];
                    if((v2 & 0xFF) != 0xFF) {
                        break;
                    }
                    v1 += 0xFF;
                    ++v;
                }
                int v3 = v + 1;
                int v4 = v1 + (v2 & 0xFF);
                int v5 = 0;
                while(true) {
                    v6 = arr_b[v3];
                    if((v6 & 0xFF) != 0xFF) {
                        break;
                    }
                    v5 += 0xFF;
                    ++v3;
                }
                if(arr_b[v3 + 1] != 1) {
                    throw ParserException.a("Error parsing vorbis codec private", null);
                }
                byte[] arr_b1 = new byte[v4];
                System.arraycopy(arr_b, v3 + 1, arr_b1, 0, v4);
                int v7 = v3 + 1 + v4;
                if(arr_b[v7] != 3) {
                    throw ParserException.a("Error parsing vorbis codec private", null);
                }
                int v8 = v7 + (v5 + (v6 & 0xFF));
                if(arr_b[v8] != 5) {
                    throw ParserException.a("Error parsing vorbis codec private", null);
                }
                byte[] arr_b2 = new byte[arr_b.length - v8];
                System.arraycopy(arr_b, v8, arr_b2, 0, arr_b.length - v8);
                List list0 = new ArrayList(2);
                list0.add(arr_b1);
                list0.add(arr_b2);
                return list0;
            }
            catch(ArrayIndexOutOfBoundsException unused_ex) {
                throw ParserException.a("Error parsing vorbis codec private", null);
            }
        }

        public void n() {
            TrueHdSampleRechunker trueHdSampleRechunker0 = this.U;
            if(trueHdSampleRechunker0 != null) {
                trueHdSampleRechunker0.b();
            }
        }

        // 去混淆评级： 低(20)
        private boolean o(boolean z) {
            return "A_OPUS".equals(this.b) ? z : this.f > 0;
        }
    }

    private boolean A;
    private static final String A0 = "V_MS/VFW/FOURCC";
    private static final int A1 = 0x1654AE6B;
    private static final int A2 = 0x55B0;
    private int B;
    private static final String B0 = "V_THEORA";
    private static final int B1 = 0xAE;
    private static final int B2 = 0x55B9;
    private long C;
    private static final String C0 = "A_VORBIS";
    private static final int C1 = 0xD7;
    private static final int C2 = 0x55B2;
    private boolean D;
    private static final String D0 = "A_OPUS";
    private static final int D1 = 0x83;
    private static final int D2 = 0x55BA;
    private long E;
    private static final String E0 = "A_AAC";
    private static final int E1 = 0x88;
    private static final int E2 = 0x55BB;
    private long F;
    private static final String F0 = "A_MPEG/L2";
    private static final int F1 = 21930;
    private static final int F2 = 0x55BC;
    private long G;
    private static final String G0 = "A_MPEG/L3";
    private static final int G1 = 2352003;
    private static final int G2 = 0x55BD;
    @Nullable
    private LongArray H;
    private static final String H0 = "A_AC3";
    private static final int H1 = 0x55EE;
    private static final int H2 = 0x55D0;
    @Nullable
    private LongArray I;
    private static final String I0 = "A_EAC3";
    private static final int I1 = 0x41E4;
    private static final int I2 = 0x55D1;
    private boolean J;
    private static final String J0 = "A_TRUEHD";
    private static final int J1 = 0x41E7;
    private static final int J2 = 21970;
    private boolean K;
    private static final String K0 = "A_DTS";
    private static final int K1 = 0x41ED;
    private static final int K2 = 0x55D3;
    private int L;
    private static final String L0 = "A_DTS/EXPRESS";
    private static final int L1 = 0x536E;
    private static final int L2 = 0x55D4;
    private long M;
    private static final String M0 = "A_DTS/LOSSLESS";
    private static final int M1 = 0x86;
    private static final int M2 = 0x55D5;
    private long N;
    private static final String N0 = "A_FLAC";
    private static final int N1 = 25506;
    private static final int N2 = 0x55D6;
    private int O;
    private static final String O0 = "A_MS/ACM";
    private static final int O1 = 0x56AA;
    private static final int O2 = 0x55D7;
    private int P;
    private static final String P0 = "A_PCM/INT/LIT";
    private static final int P1 = 22203;
    private static final int P2 = 0x55D8;
    private int[] Q;
    private static final String Q0 = "A_PCM/INT/BIG";
    private static final int Q1 = 30114;
    private static final int Q2 = 0x55D9;
    private int R;
    private static final String R0 = "A_PCM/FLOAT/IEEE";
    private static final int R1 = 0xE0;
    private static final int R2 = 0x55DA;
    private int S;
    private static final String S0 = "S_TEXT/UTF8";
    private static final int S1 = 0xB0;
    private static final int S2 = 4;
    private int T;
    private static final String T0 = "S_TEXT/ASS";
    private static final int T1 = 0xBA;
    private static final int T2 = 1685480259;
    private int U;
    private static final String U0 = "S_TEXT/WEBVTT";
    private static final int U1 = 0x54B0;
    private static final int U2 = 0x64767643;
    private boolean V;
    private static final String V0 = "S_VOBSUB";
    private static final int V1 = 21690;
    private static final int V2 = 0;
    private long W;
    private static final String W0 = "S_HDMV/PGS";
    private static final int W1 = 0x54B2;
    private static final int W2 = 1;
    private int X;
    private static final String X0 = "S_DVBSUB";
    private static final int X1 = 0xE1;
    private static final int X2 = 2;
    private int Y;
    private static final int Y0 = 0x2000;
    private static final int Y1 = 0x9F;
    private static final int Y2 = 3;
    private int Z;
    private static final int Z0 = 5760;
    private static final int Z1 = 0x6264;
    private static final int Z2 = 1482049860;
    private boolean a0;
    private static final int a1 = 8;
    private static final int a2 = 0xB5;
    private static final int a3 = 0x33363248;
    private boolean b0;
    private static final int b1 = 2;
    private static final int b2 = 0x6D80;
    private static final int b3 = 0x31435657;
    private boolean c0;
    private static final int c1 = 0x1A45DFA3;
    private static final int c2 = 0x6240;
    private static final byte[] c3 = null;
    private final EbmlReader d;
    private int d0;
    private static final int d1 = 0x42F7;
    private static final int d2 = 0x5031;
    private static final int d3 = 19;
    private final VarintReader e;
    private byte e0;
    private static final int e1 = 17026;
    private static final int e2 = 20530;
    private static final long e3 = 1000L;
    private final SparseArray f;
    private boolean f0;
    private static final int f1 = 17029;
    private static final int f2 = 0x5034;
    private static final String f3 = "%02d:%02d:%02d,%03d";
    private final boolean g;
    private ExtractorOutput g0;
    private static final int g1 = 0x18538067;
    private static final int g2 = 16980;
    private static final byte[] g3 = null;
    private final boolean h;
    public static final int h0 = 1;
    private static final int h1 = 357149030;
    private static final int h2 = 0x4255;
    private static final byte[] h3 = null;
    private final Factory i;
    public static final int i0 = 2;
    private static final int i1 = 290298740;
    private static final int i2 = 0x5035;
    private static final int i3 = 21;
    private final ParsableByteArray j;
    @Deprecated
    public static final ExtractorsFactory j0 = null;
    private static final int j1 = 0x4DBB;
    private static final int j2 = 18401;
    private static final long j3 = 10000L;
    private final ParsableByteArray k;
    private static final String k0 = "MatroskaExtractor";
    private static final int k1 = 0x53AB;
    private static final int k2 = 18402;
    private static final String k3 = "%01d:%02d:%02d:%02d";
    private final ParsableByteArray l;
    private static final int l0 = -1;
    private static final int l1 = 21420;
    private static final int l2 = 18407;
    private static final byte[] l3 = null;
    private final ParsableByteArray m;
    private static final int m0 = 0;
    private static final int m1 = 357149030;
    private static final int m2 = 18408;
    private static final int m3 = 25;
    private final ParsableByteArray n;
    private static final int n0 = 1;
    private static final int n1 = 2807729;
    private static final int n2 = 0x1C53BB6B;
    private static final long n3 = 1000L;
    private final ParsableByteArray o;
    private static final int o0 = 2;
    private static final int o1 = 0x4489;
    private static final int o2 = 0xBB;
    private static final String o3 = "%02d:%02d:%02d.%03d";
    private final ParsableByteArray p;
    private static final String p0 = "matroska";
    private static final int p1 = 0x1F43B675;
    private static final int p2 = 0xB3;
    private static final int p3 = 18;
    private final ParsableByteArray q;
    private static final String q0 = "webm";
    private static final int q1 = 0xE7;
    private static final int q2 = 0xB7;
    private static final int q3 = 0xFFFE;
    private final ParsableByteArray r;
    private static final String r0 = "V_VP8";
    private static final int r1 = 0xA3;
    private static final int r2 = 0xF1;
    private static final int r3 = 1;
    private final ParsableByteArray s;
    private static final String s0 = "V_VP9";
    private static final int s1 = 0xA0;
    private static final int s2 = 0x22B59C;
    private static final UUID s3 = null;
    private ByteBuffer t;
    private static final String t0 = "V_AV1";
    private static final int t1 = 0xA1;
    private static final int t2 = 30320;
    private static final Map t3 = null;
    private long u;
    private static final String u0 = "V_MPEG2";
    private static final int u1 = 0x9B;
    private static final int u2 = 30321;
    private long v;
    private static final String v0 = "V_MPEG4/ISO/SP";
    private static final int v1 = 30113;
    private static final int v2 = 30322;
    private long w;
    private static final String w0 = "V_MPEG4/ISO/ASP";
    private static final int w1 = 0xA6;
    private static final int w2 = 30323;
    private long x;
    private static final String x0 = "V_MPEG4/ISO/AP";
    private static final int x1 = 0xEE;
    private static final int x2 = 30324;
    private long y;
    private static final String y0 = "V_MPEG4/ISO/AVC";
    private static final int y1 = 0xA5;
    private static final int y2 = 30325;
    @Nullable
    private Track z;
    private static final String z0 = "V_MPEGH/ISO/HEVC";
    private static final int z1 = 0xFB;
    private static final int z2 = 0x53B8;

    static {
        MatroskaExtractor.j0 = new b();
        MatroskaExtractor.c3 = new byte[]{49, 10, 0x30, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 44, 0x30, 0x30, 0x30, 0x20, 45, 45, 62, 0x20, 0x30, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 44, 0x30, 0x30, 0x30, 10};
        MatroskaExtractor.g3 = new byte[]{70, 0x6F, 0x72, 109, 97, 0x74, 58, 0x20, 83, 0x74, 97, 0x72, 0x74, 44, 0x20, 69, 110, 100, 44, 0x20, 82, 101, 97, 100, 0x4F, 0x72, 100, 101, 0x72, 44, 0x20, 76, 97, 0x79, 101, 0x72, 44, 0x20, 83, 0x74, 0x79, 108, 101, 44, 0x20, 78, 97, 109, 101, 44, 0x20, 77, 97, 0x72, 103, 105, 110, 76, 44, 0x20, 77, 97, 0x72, 103, 105, 110, 82, 44, 0x20, 77, 97, 0x72, 103, 105, 110, 86, 44, 0x20, 69, 102, 102, 101, 99, 0x74, 44, 0x20, 84, 101, 120, 0x74};
        MatroskaExtractor.h3 = new byte[]{68, 105, 97, 108, 0x6F, 103, 0x75, 101, 58, 0x20, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 44, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 44};
        MatroskaExtractor.l3 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 0x30, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 46, 0x30, 0x30, 0x30, 0x20, 45, 45, 62, 0x20, 0x30, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 46, 0x30, 0x30, 0x30, 10};
        MatroskaExtractor.s3 = new UUID(0x100000000001000L, 0x800000AA00389B71L);
        HashMap hashMap0 = new HashMap();
        hashMap0.put("htc_video_rotA-000", 0);
        hashMap0.put("htc_video_rotA-090", 90);
        hashMap0.put("htc_video_rotA-180", 180);
        hashMap0.put("htc_video_rotA-270", 270);
        MatroskaExtractor.t3 = DesugarCollections.unmodifiableMap(hashMap0);
    }

    @Deprecated
    public MatroskaExtractor() {
        this(new DefaultEbmlReader(), 2, Factory.a);
    }

    @Deprecated
    public MatroskaExtractor(int v) {
        this(new DefaultEbmlReader(), v | 2, Factory.a);
    }

    MatroskaExtractor(EbmlReader ebmlReader0, int v, Factory subtitleParser$Factory0) {
        this.v = -1L;
        this.w = 0x8000000000000001L;
        this.x = 0x8000000000000001L;
        this.y = 0x8000000000000001L;
        this.E = -1L;
        this.F = -1L;
        this.G = 0x8000000000000001L;
        this.d = ebmlReader0;
        ebmlReader0.b(new InnerEbmlProcessor(this, null));
        this.i = subtitleParser$Factory0;
        boolean z = false;
        this.g = (v & 1) == 0;
        if((v & 2) == 0) {
            z = true;
        }
        this.h = z;
        this.e = new VarintReader();
        this.f = new SparseArray();
        this.l = new ParsableByteArray(4);
        this.m = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
        this.n = new ParsableByteArray(4);
        this.j = new ParsableByteArray(NalUnitUtil.j);
        this.k = new ParsableByteArray(4);
        this.o = new ParsableByteArray();
        this.p = new ParsableByteArray();
        this.q = new ParsableByteArray(8);
        this.r = new ParsableByteArray();
        this.s = new ParsableByteArray();
        this.Q = new int[1];
    }

    public MatroskaExtractor(Factory subtitleParser$Factory0) {
        this(new DefaultEbmlReader(), 0, subtitleParser$Factory0);
    }

    public MatroskaExtractor(Factory subtitleParser$Factory0, int v) {
        this(new DefaultEbmlReader(), v, subtitleParser$Factory0);
    }

    @CallSuper
    protected void A(int v, long v1) throws ParserException {
        switch(v) {
            case 0x5031: {
                if(v1 != 0L) {
                    throw ParserException.a(("ContentEncodingOrder " + v1 + " not supported"), null);
                }
                break;
            }
            case 20530: {
                if(v1 != 1L) {
                    throw ParserException.a(("ContentEncodingScope " + v1 + " not supported"), null);
                }
                break;
            }
            default: {
                boolean z = false;
                switch(v) {
                    case 0x83: {
                        this.w(0x83).d = (int)v1;
                        return;
                    }
                    case 0x88: {
                        Track matroskaExtractor$Track0 = this.w(0x88);
                        if(v1 == 1L) {
                            z = true;
                        }
                        matroskaExtractor$Track0.W = z;
                        return;
                    }
                    case 0x9B: {
                        this.N = this.J(v1);
                        return;
                    }
                    case 0x9F: {
                        this.w(0x9F).P = (int)v1;
                        return;
                    }
                    case 0xB0: {
                        this.w(0xB0).m = (int)v1;
                        return;
                    }
                    case 0xB3: {
                        this.l(0xB3);
                        this.H.a(this.J(v1));
                        return;
                    }
                    case 0xBA: {
                        this.w(0xBA).n = (int)v1;
                        return;
                    }
                    case 0xD7: {
                        this.w(0xD7).c = (int)v1;
                        return;
                    }
                    case 0xE7: {
                        this.G = this.J(v1);
                        return;
                    }
                    case 0xEE: {
                        this.U = (int)v1;
                        return;
                    }
                    case 0xF1: {
                        if(!this.J) {
                            this.l(0xF1);
                            this.I.a(v1);
                            this.J = true;
                            return;
                        }
                        break;
                    }
                    case 0xFB: {
                        this.V = true;
                        return;
                    }
                    case 0x41E7: {
                        this.w(0x41E7).g = (int)v1;
                        return;
                    }
                    case 16980: {
                        if(v1 != 3L) {
                            throw ParserException.a(("ContentCompAlgo " + v1 + " not supported"), null);
                        }
                        break;
                    }
                    case 17029: {
                        if(v1 < 1L || v1 > 2L) {
                            throw ParserException.a(("DocTypeReadVersion " + v1 + " not supported"), null);
                        }
                        break;
                    }
                    case 0x42F7: {
                        if(v1 != 1L) {
                            throw ParserException.a(("EBMLReadVersion " + v1 + " not supported"), null);
                        }
                        break;
                    }
                    case 18401: {
                        if(v1 != 5L) {
                            throw ParserException.a(("ContentEncAlgo " + v1 + " not supported"), null);
                        }
                        break;
                    }
                    case 18408: {
                        if(v1 != 1L) {
                            throw ParserException.a(("AESSettingsCipherMode " + v1 + " not supported"), null);
                        }
                        break;
                    }
                    case 21420: {
                        this.C = v1 + this.v;
                        return;
                    }
                    case 0x53B8: {
                        this.m(0x53B8);
                        switch(((int)v1)) {
                            case 0: {
                                this.z.x = 0;
                                return;
                            }
                            case 1: {
                                this.z.x = 2;
                                return;
                            }
                            case 3: {
                                this.z.x = 1;
                                return;
                            }
                        }
                        if(((int)v1) == 15) {
                            this.z.x = 3;
                            return;
                        }
                        break;
                    }
                    case 0x54B0: {
                        this.w(0x54B0).p = (int)v1;
                        return;
                    }
                    case 0x54B2: {
                        this.w(0x54B2).r = (int)v1;
                        return;
                    }
                    case 21690: {
                        this.w(21690).q = (int)v1;
                        return;
                    }
                    case 21930: {
                        Track matroskaExtractor$Track1 = this.w(21930);
                        if(v1 == 1L) {
                            z = true;
                        }
                        matroskaExtractor$Track1.V = z;
                        return;
                    }
                    case 0x55B2: {
                        this.m(0x55B2);
                        this.z.y = true;
                        this.z.o = (int)v1;
                        return;
                    }
                    case 0x55B9: {
                        this.m(0x55B9);
                        switch(((int)v1)) {
                            case 1: {
                                this.z.B = 2;
                                return;
                            }
                            case 2: {
                                this.z.B = 1;
                                return;
                            }
                            default: {
                                return;
                            }
                        }
                    }
                    case 0x55BA: {
                        this.m(0x55BA);
                        int v2 = ColorInfo.m(((int)v1));
                        if(v2 != -1) {
                            this.z.A = v2;
                            return;
                        }
                        break;
                    }
                    case 0x55BB: {
                        this.m(0x55BB);
                        this.z.y = true;
                        int v3 = ColorInfo.l(((int)v1));
                        if(v3 != -1) {
                            this.z.z = v3;
                            return;
                        }
                        break;
                    }
                    case 0x55BC: {
                        this.w(0x55BC).C = (int)v1;
                        return;
                    }
                    case 0x55BD: {
                        this.w(0x55BD).D = (int)v1;
                        return;
                    }
                    case 0x55EE: {
                        this.w(0x55EE).f = (int)v1;
                        return;
                    }
                    case 0x56AA: {
                        this.w(0x56AA).S = v1;
                        return;
                    }
                    case 22203: {
                        this.w(22203).T = v1;
                        return;
                    }
                    case 0x6264: {
                        this.w(0x6264).Q = (int)v1;
                        return;
                    }
                    case 30114: {
                        this.W = v1;
                        return;
                    }
                    case 30321: {
                        this.m(30321);
                        switch(((int)v1)) {
                            case 0: {
                                this.z.s = 0;
                                return;
                            }
                            case 1: {
                                this.z.s = 1;
                                return;
                            }
                            case 2: {
                                this.z.s = 2;
                                return;
                            }
                            case 3: {
                                this.z.s = 3;
                                return;
                            }
                            default: {
                                return;
                            }
                        }
                    }
                    case 2352003: {
                        this.w(2352003).e = (int)v1;
                        return;
                    }
                    case 2807729: {
                        this.w = v1;
                    }
                }
            }
        }
    }

    // 去混淆评级： 中等(82)
    private static boolean B(String s) {
        s.hashCode();
        switch(s) {
            case "A_AAC": 
            case "A_AC3": 
            case "A_DTS": 
            case "A_DTS/EXPRESS": 
            case "A_DTS/LOSSLESS": 
            case "A_EAC3": 
            case "A_FLAC": 
            case "A_MPEG/L2": 
            case "A_MPEG/L3": 
            case "A_MS/ACM": 
            case "A_OPUS": 
            case "A_PCM/FLOAT/IEEE": 
            case "A_PCM/INT/BIG": 
            case "A_PCM/INT/LIT": 
            case "A_TRUEHD": 
            case "A_VORBIS": 
            case "S_DVBSUB": 
            case "S_HDMV/PGS": 
            case "S_TEXT/ASS": 
            case "S_TEXT/UTF8": 
            case "S_TEXT/WEBVTT": 
            case "S_VOBSUB": 
            case "V_AV1": 
            case "V_MPEG2": 
            case "V_MPEG4/ISO/AP": 
            case "V_MPEG4/ISO/ASP": 
            case "V_MPEG4/ISO/AVC": 
            case "V_MPEG4/ISO/SP": 
            case "V_MPEGH/ISO/HEVC": 
            case "V_MS/VFW/FOURCC": 
            case "V_THEORA": 
            case "V_VP8": 
            case "V_VP9": {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @CallSuper
    protected boolean C(int v) {
        return v == 357149030 || v == 0x1654AE6B || v == 0x1C53BB6B || v == 0x1F43B675;
    }

    private static Extractor[] D(Factory subtitleParser$Factory0) {
        return new Extractor[]{new MatroskaExtractor(subtitleParser$Factory0)};
    }

    private static Extractor[] E() {
        return new Extractor[]{new MatroskaExtractor(Factory.a, 2)};
    }

    private boolean F(PositionHolder positionHolder0, long v) {
        if(this.D) {
            this.F = v;
            positionHolder0.a = this.E;
            this.D = false;
            return true;
        }
        if(this.A) {
            long v1 = this.F;
            if(v1 != -1L) {
                positionHolder0.a = v1;
                this.F = -1L;
                return true;
            }
        }
        return false;
    }

    public static ExtractorsFactory G(Factory subtitleParser$Factory0) {
        return new a(subtitleParser$Factory0);
    }

    private void H(ExtractorInput extractorInput0, int v) throws IOException {
        if(this.l.g() >= v) {
            return;
        }
        if(this.l.b() < v) {
            this.l.c(Math.max(this.l.b() * 2, v));
        }
        extractorInput0.readFully(this.l.e(), this.l.g(), v - this.l.g());
        this.l.X(v);
    }

    private void I() {
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.a0 = false;
        this.b0 = false;
        this.c0 = false;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = false;
        this.o.U(0);
    }

    private long J(long v) throws ParserException {
        long v1 = this.w;
        if(v1 == 0x8000000000000001L) {
            throw ParserException.a("Can\'t scale timecode prior to timecodeScale being set.", null);
        }
        return Util.Z1(v, v1, 1000L);
    }

    private static void K(String s, long v, byte[] arr_b) {
        int v1;
        byte[] arr_b1;
        s.hashCode();
        switch(s) {
            case "S_TEXT/ASS": {
                arr_b1 = MatroskaExtractor.v(v, "%01d:%02d:%02d:%02d", 10000L);
                v1 = 21;
                break;
            }
            case "S_TEXT/UTF8": {
                arr_b1 = MatroskaExtractor.v(v, "%02d:%02d:%02d,%03d", 1000L);
                v1 = 19;
                break;
            }
            case "S_TEXT/WEBVTT": {
                arr_b1 = MatroskaExtractor.v(v, "%02d:%02d:%02d.%03d", 1000L);
                v1 = 25;
                break;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
        System.arraycopy(arr_b1, 0, arr_b, v1, arr_b1.length);
    }

    @CallSuper
    protected void L(int v, long v1, long v2) throws ParserException {
        this.n();
        switch(v) {
            case 0xA0: {
                this.V = false;
                this.W = 0L;
                break;
            }
            case 0xAE: {
                this.z = new Track();
                return;
            }
            case 0xBB: {
                this.J = false;
                return;
            }
            case 0x4DBB: {
                this.B = -1;
                this.C = -1L;
                return;
            }
            case 0x5035: {
                this.w(0x5035).h = true;
                return;
            }
            case 0x55D0: {
                this.w(0x55D0).y = true;
                return;
            }
            case 0x18538067: {
                if(this.v != -1L && this.v != v1) {
                    throw ParserException.a("Multiple Segment elements not supported", null);
                }
                this.v = v1;
                this.u = v2;
                return;
            }
            case 0x1C53BB6B: {
                this.H = new LongArray();
                this.I = new LongArray();
                return;
            }
            case 0x1F43B675: {
                if(!this.A) {
                    if(this.g && this.E != -1L) {
                        this.D = true;
                        return;
                    }
                    this.g0.r(new Unseekable(this.y));
                    this.A = true;
                    return;
                }
                break;
            }
        }
    }

    @CallSuper
    protected void M(int v, String s) throws ParserException {
        switch(v) {
            case 0x86: {
                this.w(0x86).b = s;
                return;
            }
            case 17026: {
                if(!"webm".equals(s) && !"matroska".equals(s)) {
                    throw ParserException.a(("DocType " + s + " not supported"), null);
                }
                return;
            }
            case 0x536E: {
                this.w(0x536E).a = s;
                return;
            }
            case 0x22B59C: {
                this.w(0x22B59C).X = s;
            }
        }
    }

    @m({"#2.output"})
    private int N(ExtractorInput extractorInput0, Track matroskaExtractor$Track0, int v, boolean z) throws IOException {
        if("S_TEXT/UTF8".equals(matroskaExtractor$Track0.b)) {
            this.O(extractorInput0, MatroskaExtractor.c3, v);
            return this.t();
        }
        if("S_TEXT/ASS".equals(matroskaExtractor$Track0.b)) {
            this.O(extractorInput0, MatroskaExtractor.h3, v);
            return this.t();
        }
        if("S_TEXT/WEBVTT".equals(matroskaExtractor$Track0.b)) {
            this.O(extractorInput0, MatroskaExtractor.l3, v);
            return this.t();
        }
        TrackOutput trackOutput0 = matroskaExtractor$Track0.Y;
        boolean z1 = true;
        if(!this.a0) {
            if(matroskaExtractor$Track0.h) {
                this.T &= 0xBFFFFFFF;
                int v1 = 0x80;
                if(!this.b0) {
                    extractorInput0.readFully(this.l.e(), 0, 1);
                    ++this.X;
                    if((this.l.e()[0] & 0x80) == 0x80) {
                        throw ParserException.a("Extension bit is set in signal byte", null);
                    }
                    this.e0 = this.l.e()[0];
                    this.b0 = true;
                }
                int v2 = this.e0;
                if((v2 & 1) == 1) {
                    boolean z2 = (v2 & 2) == 2;
                    this.T |= 0x40000000;
                    if(!this.f0) {
                        extractorInput0.readFully(this.q.e(), 0, 8);
                        this.X += 8;
                        this.f0 = true;
                        byte[] arr_b = this.l.e();
                        if(!z2) {
                            v1 = 0;
                        }
                        arr_b[0] = (byte)(v1 | 8);
                        this.l.Y(0);
                        trackOutput0.a(this.l, 1, 1);
                        ++this.Y;
                        this.q.Y(0);
                        trackOutput0.a(this.q, 8, 1);
                        this.Y += 8;
                    }
                    if(z2) {
                        if(!this.c0) {
                            extractorInput0.readFully(this.l.e(), 0, 1);
                            ++this.X;
                            this.l.Y(0);
                            this.d0 = this.l.L();
                            this.c0 = true;
                        }
                        int v3 = this.d0 * 4;
                        this.l.U(v3);
                        extractorInput0.readFully(this.l.e(), 0, v3);
                        this.X += v3;
                        int v4 = (short)(this.d0 / 2 + 1);
                        int v5 = v4 * 6 + 2;
                        if(this.t == null || this.t.capacity() < v5) {
                            this.t = ByteBuffer.allocate(v5);
                        }
                        this.t.position(0);
                        this.t.putShort(((short)v4));
                        int v6 = 0;
                        int v7;
                        for(v7 = 0; true; v7 = v9) {
                            int v8 = this.d0;
                            if(v6 >= v8) {
                                break;
                            }
                            int v9 = this.l.P();
                            if(v6 % 2 == 0) {
                                this.t.putShort(((short)(v9 - v7)));
                            }
                            else {
                                this.t.putInt(v9 - v7);
                            }
                            ++v6;
                        }
                        int v10 = v - this.X - v7;
                        if(v8 % 2 == 1) {
                            this.t.putInt(v10);
                        }
                        else {
                            this.t.putShort(((short)v10));
                            this.t.putInt(0);
                        }
                        byte[] arr_b1 = this.t.array();
                        this.r.W(arr_b1, v5);
                        trackOutput0.a(this.r, v5, 1);
                        this.Y += v5;
                    }
                }
            }
            else {
                byte[] arr_b2 = matroskaExtractor$Track0.i;
                if(arr_b2 != null) {
                    this.o.W(arr_b2, arr_b2.length);
                }
            }
            if(matroskaExtractor$Track0.o(z)) {
                this.T |= 0x10000000;
                this.s.U(0);
                int v11 = this.o.g() + v - this.X;
                this.l.U(4);
                this.l.e()[0] = (byte)(v11 >> 24 & 0xFF);
                this.l.e()[1] = (byte)(v11 >> 16 & 0xFF);
                this.l.e()[2] = (byte)(v11 >> 8 & 0xFF);
                this.l.e()[3] = (byte)(v11 & 0xFF);
                trackOutput0.a(this.l, 4, 2);
                this.Y += 4;
            }
            this.a0 = true;
        }
        int v12 = v + this.o.g();
        if("V_MPEG4/ISO/AVC".equals(matroskaExtractor$Track0.b) || "V_MPEGH/ISO/HEVC".equals(matroskaExtractor$Track0.b)) {
            byte[] arr_b3 = this.k.e();
            arr_b3[0] = 0;
            arr_b3[1] = 0;
            arr_b3[2] = 0;
            int v15 = matroskaExtractor$Track0.Z;
            while(this.X < v12) {
                int v16 = this.Z;
                if(v16 == 0) {
                    this.Q(extractorInput0, arr_b3, 4 - v15, v15);
                    this.X += v15;
                    this.k.Y(0);
                    this.Z = this.k.P();
                    this.j.Y(0);
                    trackOutput0.b(this.j, 4);
                    this.Y += 4;
                }
                else {
                    int v17 = this.P(extractorInput0, trackOutput0, v16);
                    this.X += v17;
                    this.Y += v17;
                    this.Z -= v17;
                }
            }
        }
        else {
            if(matroskaExtractor$Track0.U != null) {
                if(this.o.g() != 0) {
                    z1 = false;
                }
                Assertions.i(z1);
                matroskaExtractor$Track0.U.d(extractorInput0);
            }
            int v13;
            while((v13 = this.X) < v12) {
                int v14 = this.P(extractorInput0, trackOutput0, v12 - v13);
                this.X += v14;
                this.Y += v14;
            }
        }
        if("A_VORBIS".equals(matroskaExtractor$Track0.b)) {
            this.m.Y(0);
            trackOutput0.b(this.m, 4);
            this.Y += 4;
        }
        return this.t();
    }

    private void O(ExtractorInput extractorInput0, byte[] arr_b, int v) throws IOException {
        int v1 = arr_b.length + v;
        if(this.p.b() < v1) {
            byte[] arr_b1 = Arrays.copyOf(arr_b, v1 + v);
            this.p.V(arr_b1);
        }
        else {
            System.arraycopy(arr_b, 0, this.p.e(), 0, arr_b.length);
        }
        extractorInput0.readFully(this.p.e(), arr_b.length, v);
        this.p.Y(0);
        this.p.X(v1);
    }

    private int P(ExtractorInput extractorInput0, TrackOutput trackOutput0, int v) throws IOException {
        int v1 = this.o.a();
        if(v1 > 0) {
            int v2 = Math.min(v, v1);
            trackOutput0.b(this.o, v2);
            return v2;
        }
        return trackOutput0.e(extractorInput0, v, false);
    }

    private void Q(ExtractorInput extractorInput0, byte[] arr_b, int v, int v1) throws IOException {
        int v2 = Math.min(v1, this.o.a());
        extractorInput0.readFully(arr_b, v + v2, v1 - v2);
        if(v2 > 0) {
            this.o.n(arr_b, v, v2);
        }
    }

    @Override  // androidx.media3.extractor.Extractor
    @CallSuper
    public void a(long v, long v1) {
        this.G = 0x8000000000000001L;
        this.L = 0;
        this.d.reset();
        this.e.e();
        this.I();
        for(int v2 = 0; v2 < this.f.size(); ++v2) {
            ((Track)this.f.valueAt(v2)).n();
        }
    }

    @Override  // androidx.media3.extractor.Extractor
    public Extractor c() {
        return this;
    }

    @Override  // androidx.media3.extractor.Extractor
    public List d() {
        return androidx.media3.extractor.d.a(this);
    }

    @Override  // androidx.media3.extractor.Extractor
    public final int e(ExtractorInput extractorInput0, PositionHolder positionHolder0) throws IOException {
        this.K = false;
        boolean z = true;
        while(z) {
            z = this.d.a(extractorInput0);
            if(z && this.F(positionHolder0, extractorInput0.getPosition())) {
                return 1;
            }
            if(false) {
                break;
            }
        }
        for(int v = 0; v < this.f.size(); ++v) {
            Track matroskaExtractor$Track0 = (Track)this.f.valueAt(v);
            matroskaExtractor$Track0.f();
            matroskaExtractor$Track0.j();
        }
        return -1;
    }

    @Override  // androidx.media3.extractor.Extractor
    public final boolean g(ExtractorInput extractorInput0) throws IOException {
        return new Sniffer().b(extractorInput0);
    }

    @Override  // androidx.media3.extractor.Extractor
    public final void h(ExtractorOutput extractorOutput0) {
        this.g0 = extractorOutput0;
        if(this.h) {
            extractorOutput0 = new SubtitleTranscodingExtractorOutput(extractorOutput0, this.i);
        }
        this.g0 = extractorOutput0;
    }

    @d({"cueTimesUs", "cueClusterPositions"})
    private void l(int v) throws ParserException {
        if(this.H == null || this.I == null) {
            throw ParserException.a(("Element " + v + " must be in a Cues"), null);
        }
    }

    @d({"currentTrack"})
    private void m(int v) throws ParserException {
        if(this.z == null) {
            throw ParserException.a(("Element " + v + " must be in a TrackEntry"), null);
        }
    }

    @d({"extractorOutput"})
    private void n() {
        Assertions.k(this.g0);
    }

    @CallSuper
    protected void o(int v, int v1, ExtractorInput extractorInput0) throws IOException {
        Track matroskaExtractor$Track7;
        long v16;
        Track matroskaExtractor$Track6;
        int v12;
        int v9;
        int v7;
        Track matroskaExtractor$Track5;
        if(v != 0xA1 && v != 0xA3) {
            switch(v) {
                case 0xA5: {
                    if(this.L != 2) {
                        return;
                    }
                    this.z(((Track)this.f.get(this.R)), this.U, extractorInput0, v1);
                    return;
                }
                case 0x41ED: {
                    this.y(this.w(0x41ED), extractorInput0, v1);
                    return;
                }
                case 0x4255: {
                    this.m(0x4255);
                    Track matroskaExtractor$Track3 = this.z;
                    byte[] arr_b3 = new byte[v1];
                    matroskaExtractor$Track3.i = arr_b3;
                    extractorInput0.readFully(arr_b3, 0, v1);
                    return;
                }
                case 18402: {
                    byte[] arr_b2 = new byte[v1];
                    extractorInput0.readFully(arr_b2, 0, v1);
                    Track matroskaExtractor$Track2 = this.w(18402);
                    matroskaExtractor$Track2.j = new CryptoData(1, arr_b2, 0, 0);
                    return;
                }
                case 0x53AB: {
                    Arrays.fill(this.n.e(), 0);
                    extractorInput0.readFully(this.n.e(), 4 - v1, v1);
                    this.n.Y(0);
                    this.B = (int)this.n.N();
                    return;
                }
                case 25506: {
                    this.m(25506);
                    Track matroskaExtractor$Track1 = this.z;
                    byte[] arr_b1 = new byte[v1];
                    matroskaExtractor$Track1.k = arr_b1;
                    extractorInput0.readFully(arr_b1, 0, v1);
                    return;
                }
                case 30322: {
                    this.m(30322);
                    Track matroskaExtractor$Track0 = this.z;
                    byte[] arr_b = new byte[v1];
                    matroskaExtractor$Track0.w = arr_b;
                    extractorInput0.readFully(arr_b, 0, v1);
                    return;
                }
                default: {
                    throw ParserException.a(("Unexpected id: " + v), null);
                }
            }
        }
        if(this.L == 0) {
            this.R = (int)this.e.d(extractorInput0, false, true, 8);
            this.S = this.e.b();
            this.N = 0x8000000000000001L;
            this.L = 1;
            this.l.U(0);
        }
        Track matroskaExtractor$Track4 = (Track)this.f.get(this.R);
        if(matroskaExtractor$Track4 == null) {
            extractorInput0.r(v1 - this.S);
            this.L = 0;
            return;
        }
        matroskaExtractor$Track4.f();
        if(this.L == 1) {
            this.H(extractorInput0, 3);
            int v2 = (this.l.e()[2] & 6) >> 1;
            if(v2 == 0) {
                this.P = 1;
                int[] arr_v = MatroskaExtractor.s(this.Q, 1);
                this.Q = arr_v;
                arr_v[0] = v1 - this.S - 3;
                matroskaExtractor$Track5 = matroskaExtractor$Track4;
                goto label_135;
            }
            else {
                int v3 = 4;
                this.H(extractorInput0, 4);
                int v4 = (this.l.e()[3] & 0xFF) + 1;
                this.P = v4;
                int[] arr_v1 = MatroskaExtractor.s(this.Q, v4);
                this.Q = arr_v1;
                if(v2 == 2) {
                    Arrays.fill(arr_v1, 0, this.P, (v1 - this.S - 4) / this.P);
                    matroskaExtractor$Track5 = matroskaExtractor$Track4;
                    goto label_135;
                }
                else if(v2 == 1) {
                    int v5 = 0;
                    int v6 = 0;
                    while(true) {
                        v7 = this.P;
                        if(v5 >= v7 - 1) {
                            break;
                        }
                        this.Q[v5] = 0;
                        while(true) {
                            this.H(extractorInput0, v3 + 1);
                            int v8 = this.l.e()[v3] & 0xFF;
                            int[] arr_v2 = this.Q;
                            v9 = arr_v2[v5] + v8;
                            arr_v2[v5] = v9;
                            if(v8 != 0xFF) {
                                break;
                            }
                            ++v3;
                        }
                        v6 += v9;
                        ++v5;
                        ++v3;
                    }
                    this.Q[v7 - 1] = v1 - this.S - v3 - v6;
                    matroskaExtractor$Track5 = matroskaExtractor$Track4;
                    goto label_135;
                }
                else {
                    if(v2 != 3) {
                        throw ParserException.a(("Unexpected lacing value: " + v2), null);
                    }
                    int v10 = 0;
                    int v11 = 0;
                    while(true) {
                        v12 = this.P;
                        if(v10 >= v12 - 1) {
                            goto label_133;
                        }
                        this.Q[v10] = 0;
                        int v13 = v3 + 1;
                        this.H(extractorInput0, v13);
                        if(this.l.e()[v3] == 0) {
                            throw ParserException.a("No valid varint length mask found", null);
                        }
                        int v14 = 0;
                        while(true) {
                            if(v14 < 8) {
                                int v15 = 1 << 7 - v14;
                                if((this.l.e()[v3] & v15) == 0) {
                                    ++v14;
                                    continue;
                                }
                                else {
                                    v13 += v14;
                                    this.H(extractorInput0, v13);
                                    matroskaExtractor$Track6 = matroskaExtractor$Track4;
                                    v16 = (long)(~v15 & (this.l.e()[v3] & 0xFF));
                                    for(int v17 = v3 + 1; v17 < v13; ++v17) {
                                        v16 = v16 << 8 | ((long)(this.l.e()[v17] & 0xFF));
                                    }
                                    if(v10 > 0) {
                                        v16 -= (1L << v14 * 7 + 6) - 1L;
                                    }
                                    break;
                                }
                            }
                            matroskaExtractor$Track6 = matroskaExtractor$Track4;
                            v16 = 0L;
                            break;
                        }
                        v3 = v13;
                        if(v16 < 0xFFFFFFFF80000000L || v16 > 0x7FFFFFFFL) {
                            break;
                        }
                        int v18 = (int)v16;
                        int[] arr_v3 = this.Q;
                        if(v10 != 0) {
                            v18 += arr_v3[v10 - 1];
                        }
                        arr_v3[v10] = v18;
                        v11 += v18;
                        ++v10;
                        matroskaExtractor$Track4 = matroskaExtractor$Track6;
                    }
                    throw ParserException.a("EBML lacing sample size out of range.", null);
                label_133:
                    matroskaExtractor$Track5 = matroskaExtractor$Track4;
                    this.Q[v12 - 1] = v1 - this.S - v3 - v11;
                label_135:
                    this.M = this.G + this.J(((long)(this.l.e()[0] << 8 | this.l.e()[1] & 0xFF)));
                    matroskaExtractor$Track7 = matroskaExtractor$Track5;
                    this.T = matroskaExtractor$Track7.d == 2 || v == 0xA3 && (this.l.e()[2] & 0x80) == 0x80 ? 1 : 0;
                    this.L = 2;
                    this.O = 0;
                }
            }
        }
        else {
            matroskaExtractor$Track7 = matroskaExtractor$Track4;
        }
        if(v == 0xA3) {
            int v19;
            while((v19 = this.O) < this.P) {
                int v20 = this.N(extractorInput0, matroskaExtractor$Track7, this.Q[v19], false);
                this.q(matroskaExtractor$Track7, ((long)(this.O * matroskaExtractor$Track7.e / 1000)) + this.M, this.T, v20, 0);
                ++this.O;
            }
            this.L = 0;
            return;
        }
        int v21;
        while((v21 = this.O) < this.P) {
            int[] arr_v4 = this.Q;
            arr_v4[v21] = this.N(extractorInput0, matroskaExtractor$Track7, arr_v4[v21], true);
            ++this.O;
        }
    }

    private SeekMap p(@Nullable LongArray longArray0, @Nullable LongArray longArray1) {
        if(this.v != -1L && this.y != 0x8000000000000001L && longArray0 != null && longArray0.c() != 0 && longArray1 != null && longArray1.c() == longArray0.c()) {
            int v = longArray0.c();
            int[] arr_v = new int[v];
            long[] arr_v1 = new long[v];
            long[] arr_v2 = new long[v];
            long[] arr_v3 = new long[v];
            for(int v2 = 0; v2 < v; ++v2) {
                arr_v3[v2] = longArray0.b(v2);
                arr_v1[v2] = this.v + longArray1.b(v2);
            }
            for(int v1 = 0; v1 < v - 1; ++v1) {
                arr_v[v1] = (int)(arr_v1[v1 + 1] - arr_v1[v1]);
                arr_v2[v1] = arr_v3[v1 + 1] - arr_v3[v1];
            }
            arr_v[v - 1] = (int)(this.v + this.u - arr_v1[v - 1]);
            long v3 = this.y - arr_v3[v - 1];
            arr_v2[v - 1] = v3;
            if(v3 <= 0L) {
                Log.n("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + v3);
                arr_v = Arrays.copyOf(arr_v, v - 1);
                arr_v1 = Arrays.copyOf(arr_v1, v - 1);
                arr_v2 = Arrays.copyOf(arr_v2, v - 1);
                arr_v3 = Arrays.copyOf(arr_v3, v - 1);
            }
            return new ChunkIndex(arr_v, arr_v1, arr_v2, arr_v3);
        }
        return new Unseekable(this.y);
    }

    @m({"#1.output"})
    private void q(Track matroskaExtractor$Track0, long v, int v1, int v2, int v3) {
        TrueHdSampleRechunker trueHdSampleRechunker0 = matroskaExtractor$Track0.U;
        if(trueHdSampleRechunker0 == null) {
            if("S_TEXT/UTF8".equals(matroskaExtractor$Track0.b) || "S_TEXT/ASS".equals(matroskaExtractor$Track0.b) || "S_TEXT/WEBVTT".equals(matroskaExtractor$Track0.b)) {
                if(this.P > 1) {
                    Log.n("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                }
                else {
                    long v4 = this.N;
                    if(v4 == 0x8000000000000001L) {
                        Log.n("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    }
                    else {
                        MatroskaExtractor.K(matroskaExtractor$Track0.b, v4, this.p.e());
                        for(int v5 = this.p.f(); v5 < this.p.g(); ++v5) {
                            if(this.p.e()[v5] == 0) {
                                this.p.X(v5);
                                break;
                            }
                        }
                        matroskaExtractor$Track0.Y.b(this.p, this.p.g());
                        v2 += this.p.g();
                    }
                }
            }
            if((0x10000000 & v1) != 0) {
                if(this.P > 1) {
                    this.s.U(0);
                }
                else {
                    int v6 = this.s.g();
                    matroskaExtractor$Track0.Y.a(this.s, v6, 2);
                    v2 += v6;
                }
            }
            matroskaExtractor$Track0.Y.f(v, v1, v2, v3, matroskaExtractor$Track0.j);
        }
        else {
            trueHdSampleRechunker0.c(matroskaExtractor$Track0.Y, v, v1, v2, v3, matroskaExtractor$Track0.j);
        }
        this.K = true;
    }

    @CallSuper
    protected void r(int v) throws ParserException {
        this.n();
        switch(v) {
            case 0xA0: {
                if(this.L != 2) {
                    return;
                }
                Track matroskaExtractor$Track0 = (Track)this.f.get(this.R);
                matroskaExtractor$Track0.f();
                if(this.W > 0L && "A_OPUS".equals(matroskaExtractor$Track0.b)) {
                    byte[] arr_b = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.W).array();
                    this.s.V(arr_b);
                }
                int v2 = 0;
                for(int v1 = 0; v1 < this.P; ++v1) {
                    v2 += this.Q[v1];
                }
                int v3 = 0;
                while(v3 < this.P) {
                    long v4 = this.M + ((long)(matroskaExtractor$Track0.e * v3 / 1000));
                    int v5 = v3 != 0 || this.V ? this.T : this.T | 1;
                    int v6 = this.Q[v3];
                    int v7 = v2 - v6;
                    this.q(matroskaExtractor$Track0, v4, v5, v6, v7);
                    ++v3;
                    v2 = v7;
                }
                this.L = 0;
                return;
            }
            case 0xAE: {
                Track matroskaExtractor$Track1 = (Track)Assertions.k(this.z);
                String s = matroskaExtractor$Track1.b;
                if(s == null) {
                    throw ParserException.a("CodecId is missing in TrackEntry element", null);
                }
                if(MatroskaExtractor.B(s)) {
                    matroskaExtractor$Track1.i(this.g0, matroskaExtractor$Track1.c);
                    this.f.put(matroskaExtractor$Track1.c, matroskaExtractor$Track1);
                }
                this.z = null;
                return;
            }
            case 0x4DBB: {
                int v8 = this.B;
                if(v8 == -1) {
                    throw ParserException.a("Mandatory element SeekID or SeekPosition not found", null);
                }
                long v9 = this.C;
                if(v9 == -1L) {
                    throw ParserException.a("Mandatory element SeekID or SeekPosition not found", null);
                }
                if(v8 == 0x1C53BB6B) {
                    this.E = v9;
                    return;
                }
                break;
            }
            case 0x6240: {
                this.m(0x6240);
                Track matroskaExtractor$Track2 = this.z;
                if(matroskaExtractor$Track2.h) {
                    if(matroskaExtractor$Track2.j == null) {
                        throw ParserException.a("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    matroskaExtractor$Track2.l = new DrmInitData(new SchemeData[]{new SchemeData(C.g2, "video/webm", this.z.j.b)});
                    return;
                }
                break;
            }
            case 0x6D80: {
                this.m(0x6D80);
                if(this.z.h && this.z.i != null) {
                    throw ParserException.a("Combining encryption and compression is not supported", null);
                }
                break;
            }
            case 357149030: {
                if(this.w == 0x8000000000000001L) {
                    this.w = 1000000L;
                }
                long v10 = this.x;
                if(v10 != 0x8000000000000001L) {
                    this.y = this.J(v10);
                    return;
                }
                break;
            }
            case 0x1654AE6B: {
                if(this.f.size() == 0) {
                    throw ParserException.a("No valid tracks were found", null);
                }
                this.g0.m();
                return;
            }
            case 0x1C53BB6B: {
                if(!this.A) {
                    this.g0.r(this.p(this.H, this.I));
                    this.A = true;
                }
                this.H = null;
                this.I = null;
            }
        }
    }

    @Override  // androidx.media3.extractor.Extractor
    public final void release() {
    }

    private static int[] s(@Nullable int[] arr_v, int v) {
        if(arr_v == null) {
            return new int[v];
        }
        return arr_v.length < v ? new int[Math.max(arr_v.length * 2, v)] : arr_v;
    }

    private int t() {
        int v = this.Y;
        this.I();
        return v;
    }

    @CallSuper
    protected void u(int v, double f) throws ParserException {
        switch(v) {
            case 0xB5: {
                this.w(0xB5).R = (int)f;
                return;
            }
            case 0x4489: {
                this.x = (long)f;
                return;
            }
            case 0x55D1: {
                this.w(0x55D1).E = (float)f;
                return;
            }
            case 21970: {
                this.w(21970).F = (float)f;
                return;
            }
            case 0x55D3: {
                this.w(0x55D3).G = (float)f;
                return;
            }
            case 0x55D4: {
                this.w(0x55D4).H = (float)f;
                return;
            }
            case 0x55D5: {
                this.w(0x55D5).I = (float)f;
                return;
            }
            case 0x55D6: {
                this.w(0x55D6).J = (float)f;
                return;
            }
            case 0x55D7: {
                this.w(0x55D7).K = (float)f;
                return;
            }
            case 0x55D8: {
                this.w(0x55D8).L = (float)f;
                return;
            }
            case 0x55D9: {
                this.w(0x55D9).M = (float)f;
                return;
            }
            case 0x55DA: {
                this.w(0x55DA).N = (float)f;
                return;
            }
            case 30323: {
                this.w(30323).t = (float)f;
                return;
            }
            case 30324: {
                this.w(30324).u = (float)f;
                return;
            }
            case 30325: {
                this.w(30325).v = (float)f;
            }
        }
    }

    private static byte[] v(long v, String s, long v1) {
        Assertions.a(v != 0x8000000000000001L);
        long v2 = v - ((long)(((int)(v / 3600000000L)))) * 3600000000L;
        long v3 = v2 - ((long)(((int)(v2 / 60000000L)))) * 60000000L;
        return Util.O0(String.format(Locale.US, s, ((int)(v / 3600000000L)), ((int)(v2 / 60000000L)), ((int)(v3 / 1000000L)), ((int)((v3 - ((long)(((int)(v3 / 1000000L)))) * 1000000L) / v1))));
    }

    protected Track w(int v) throws ParserException {
        this.m(v);
        return this.z;
    }

    @CallSuper
    protected int x(int v) {
        switch(v) {
            case 0xA1: 
            case 0xA3: 
            case 0xA5: 
            case 0x41ED: 
            case 0x4255: 
            case 18402: 
            case 0x53AB: 
            case 25506: 
            case 30322: {
                return 4;
            }
            case 0xB5: 
            case 0x4489: 
            case 0x55D1: 
            case 21970: 
            case 0x55D3: 
            case 0x55D4: 
            case 0x55D5: 
            case 0x55D6: 
            case 0x55D7: 
            case 0x55D8: 
            case 0x55D9: 
            case 0x55DA: 
            case 30323: 
            case 30324: 
            case 30325: {
                return 5;
            }
            case 0x86: 
            case 17026: 
            case 0x536E: 
            case 0x22B59C: {
                return 3;
            }
            case 0x83: 
            case 0x88: 
            case 0x9B: 
            case 0x9F: 
            case 0xB0: 
            case 0xB3: 
            case 0xBA: 
            case 0xD7: 
            case 0xE7: 
            case 0xEE: 
            case 0xF1: 
            case 0xFB: 
            case 0x41E7: 
            case 16980: 
            case 17029: 
            case 0x42F7: 
            case 18401: 
            case 18408: 
            case 0x5031: 
            case 20530: 
            case 21420: 
            case 0x53B8: 
            case 0x54B0: 
            case 0x54B2: 
            case 21690: 
            case 21930: 
            case 0x55B2: 
            case 0x55B9: 
            case 0x55BA: 
            case 0x55BB: 
            case 0x55BC: 
            case 0x55BD: 
            case 0x55EE: 
            case 0x56AA: 
            case 22203: 
            case 0x6264: 
            case 30114: 
            case 30321: 
            case 2352003: 
            case 2807729: {
                return 2;
            }
            case 0xA0: 
            case 0xA6: 
            case 0xAE: 
            case 0xB7: 
            case 0xBB: 
            case 0xE0: 
            case 0xE1: 
            case 0x41E4: 
            case 18407: 
            case 0x4DBB: 
            case 0x5034: 
            case 0x5035: 
            case 0x55B0: 
            case 0x55D0: 
            case 0x6240: 
            case 0x6D80: 
            case 30113: 
            case 30320: 
            case 290298740: 
            case 357149030: 
            case 0x1654AE6B: 
            case 0x18538067: 
            case 0x1A45DFA3: 
            case 0x1C53BB6B: 
            case 0x1F43B675: {
                return 1;
            }
            default: {
                return 0;
            }
        }
    }

    protected void y(Track matroskaExtractor$Track0, ExtractorInput extractorInput0, int v) throws IOException {
        if(matroskaExtractor$Track0.g != 1685480259 && matroskaExtractor$Track0.g != 0x64767643) {
            extractorInput0.r(v);
            return;
        }
        byte[] arr_b = new byte[v];
        matroskaExtractor$Track0.O = arr_b;
        extractorInput0.readFully(arr_b, 0, v);
    }

    protected void z(Track matroskaExtractor$Track0, int v, ExtractorInput extractorInput0, int v1) throws IOException {
        if(v == 4 && "V_VP9".equals(matroskaExtractor$Track0.b)) {
            this.s.U(v1);
            extractorInput0.readFully(this.s.e(), 0, v1);
            return;
        }
        extractorInput0.r(v1);
    }

    class androidx.media3.extractor.mkv.MatroskaExtractor.1 {
    }

}

