package androidx.media3.extractor.text.pgs;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue.Builder;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleParser.OutputOptions;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

@UnstableApi
public final class PgsParser implements SubtitleParser {
    static final class CueBuilder {
        private final ParsableByteArray a;
        private final int[] b;
        private boolean c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;

        public CueBuilder() {
            this.a = new ParsableByteArray();
            this.b = new int[0x100];
        }

        @Nullable
        public Cue d() {
            int v3;
            if(this.d != 0 && this.e != 0 && this.h != 0 && this.i != 0 && this.a.g() != 0 && this.a.f() == this.a.g() && this.c) {
                this.a.Y(0);
                int v = this.h * this.i;
                int[] arr_v = new int[v];
                int v1 = 0;
                while(v1 < v) {
                    int v2 = this.a.L();
                    if(v2 == 0) {
                        int v4 = this.a.L();
                        if(v4 == 0) {
                            continue;
                        }
                        v3 = ((v4 & 0x40) == 0 ? v4 & 0x3F : (v4 & 0x3F) << 8 | this.a.L()) + v1;
                        Arrays.fill(arr_v, v1, v3, ((v4 & 0x80) == 0 ? this.b[0] : this.b[this.a.L()]));
                    }
                    else {
                        v3 = v1 + 1;
                        arr_v[v1] = this.b[v2];
                    }
                    v1 = v3;
                }
                Bitmap bitmap0 = Bitmap.createBitmap(arr_v, this.h, this.i, Bitmap.Config.ARGB_8888);
                return new Builder().r(bitmap0).w(((float)this.f) / ((float)this.d)).x(0).t(((float)this.g) / ((float)this.e), 0).u(0).z(((float)this.h) / ((float)this.d)).s(((float)this.i) / ((float)this.e)).a();
            }
            return null;
        }

        private void e(ParsableByteArray parsableByteArray0, int v) {
            if(v < 4) {
                return;
            }
            parsableByteArray0.Z(3);
            int v1 = v - 4;
            if((parsableByteArray0.L() & 0x80) != 0) {
                if(v1 < 7) {
                    return;
                }
                int v2 = parsableByteArray0.O();
                if(v2 < 4) {
                    return;
                }
                this.h = parsableByteArray0.R();
                this.i = parsableByteArray0.R();
                this.a.U(v2 - 4);
                v1 = v - 11;
            }
            int v3 = this.a.f();
            int v4 = this.a.g();
            if(v3 < v4 && v1 > 0) {
                int v5 = Math.min(v1, v4 - v3);
                parsableByteArray0.n(this.a.e(), v3, v5);
                this.a.Y(v3 + v5);
            }
        }

        private void f(ParsableByteArray parsableByteArray0, int v) {
            if(v < 19) {
                return;
            }
            this.d = parsableByteArray0.R();
            this.e = parsableByteArray0.R();
            parsableByteArray0.Z(11);
            this.f = parsableByteArray0.R();
            this.g = parsableByteArray0.R();
        }

        private void g(ParsableByteArray parsableByteArray0, int v) {
            if(v % 5 != 2) {
                return;
            }
            parsableByteArray0.Z(2);
            Arrays.fill(this.b, 0);
            for(int v1 = 0; v1 < v / 5; ++v1) {
                int v2 = parsableByteArray0.L();
                int v3 = parsableByteArray0.L();
                int v4 = parsableByteArray0.L();
                int v5 = parsableByteArray0.L();
                this.b[v2] = Util.w(((int)(((double)v3) - 0.34414 * ((double)(v5 - 0x80)) - ((double)(v4 - 0x80)) * 0.71414)), 0, 0xFF) << 8 | (parsableByteArray0.L() << 24 | Util.w(((int)(1.402 * ((double)(v4 - 0x80)) + ((double)v3))), 0, 0xFF) << 16) | Util.w(((int)(((double)v3) + ((double)(v5 - 0x80)) * 1.772)), 0, 0xFF);
            }
            this.c = true;
        }

        public void h() {
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.a.U(0);
            this.c = false;
        }
    }

    private final ParsableByteArray a;
    private final ParsableByteArray b;
    private final CueBuilder c;
    @Nullable
    private Inflater d;
    public static final int e = 2;
    private static final int f = 20;
    private static final int g = 21;
    private static final int h = 22;
    private static final int i = 0x80;
    private static final byte j = 120;

    public PgsParser() {
        this.a = new ParsableByteArray();
        this.b = new ParsableByteArray();
        this.c = new CueBuilder();
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public void a(byte[] arr_b, int v, int v1, OutputOptions subtitleParser$OutputOptions0, Consumer consumer0) {
        this.a.W(arr_b, v1 + v);
        this.a.Y(v);
        this.e(this.a);
        this.c.h();
        ArrayList arrayList0 = new ArrayList();
        while(this.a.a() >= 3) {
            Cue cue0 = PgsParser.f(this.a, this.c);
            if(cue0 != null) {
                arrayList0.add(cue0);
            }
        }
        consumer0.accept(new CuesWithTiming(arrayList0, 0x8000000000000001L, 0x8000000000000001L));
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public int b() {
        return 2;
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public void c(byte[] arr_b, OutputOptions subtitleParser$OutputOptions0, Consumer consumer0) {
        e.a(this, arr_b, subtitleParser$OutputOptions0, consumer0);
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public Subtitle d(byte[] arr_b, int v, int v1) {
        return e.b(this, arr_b, v, v1);
    }

    private void e(ParsableByteArray parsableByteArray0) {
        if(parsableByteArray0.a() > 0 && parsableByteArray0.k() == 120) {
            if(this.d == null) {
                this.d = new Inflater();
            }
            if(Util.Z0(parsableByteArray0, this.b, this.d)) {
                parsableByteArray0.W(this.b.e(), this.b.g());
            }
        }
    }

    @Nullable
    private static Cue f(ParsableByteArray parsableByteArray0, CueBuilder pgsParser$CueBuilder0) {
        int v = parsableByteArray0.g();
        int v1 = parsableByteArray0.L();
        int v2 = parsableByteArray0.R();
        int v3 = parsableByteArray0.f() + v2;
        Cue cue0 = null;
        if(v3 > v) {
            parsableByteArray0.Y(v);
            return null;
        }
        if(v1 == 0x80) {
            cue0 = pgsParser$CueBuilder0.d();
            pgsParser$CueBuilder0.h();
        }
        else {
            switch(v1) {
                case 20: {
                    pgsParser$CueBuilder0.g(parsableByteArray0, v2);
                    break;
                }
                case 21: {
                    pgsParser$CueBuilder0.e(parsableByteArray0, v2);
                    break;
                }
                case 22: {
                    pgsParser$CueBuilder0.f(parsableByteArray0, v2);
                }
            }
        }
        parsableByteArray0.Y(v3);
        return cue0;
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public void reset() {
    }
}

