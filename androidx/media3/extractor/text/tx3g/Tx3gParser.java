package androidx.media3.extractor.text.tx3g;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.common.text.Cue.Builder;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleParser.OutputOptions;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.e;
import com.google.common.base.f;
import com.google.common.collect.O2;
import java.nio.charset.Charset;
import java.util.List;

@UnstableApi
public final class Tx3gParser implements SubtitleParser {
    private final ParsableByteArray a;
    private final boolean b;
    private final int c;
    private final int d;
    private final String e;
    private final float f;
    private final int g;
    public static final int h = 2;
    private static final String i = "Tx3gParser";
    private static final int j = 1937013100;
    private static final int k = 1952608120;
    private static final String l = "Serif";
    private static final int m = 8;
    private static final int n = 2;
    private static final int o = 12;
    private static final int p = 1;
    private static final int q = 2;
    private static final int r = 4;
    private static final int s = 0xFF0000;
    private static final int t = 0;
    private static final int u = 0;
    private static final int v = -1;
    private static final String w = "sans-serif";
    private static final float x = 0.85f;

    public Tx3gParser(List list0) {
        this.a = new ParsableByteArray();
        String s = "sans-serif";
        boolean z = false;
        if(list0.size() == 1) {
            switch(((byte[])list0.get(0)).length) {
                case 0x30: 
                case 53: {
                    byte[] arr_b = (byte[])list0.get(0);
                    this.c = arr_b[24];
                    this.d = (arr_b[26] & 0xFF) << 24 | (arr_b[27] & 0xFF) << 16 | (arr_b[28] & 0xFF) << 8 | arr_b[29] & 0xFF;
                    if("Serif".equals(Util.U(arr_b, 43, arr_b.length - 43))) {
                        s = "serif";
                    }
                    this.e = s;
                    int v = arr_b[25] * 20;
                    this.g = v;
                    if((arr_b[0] & 0x20) != 0) {
                        z = true;
                    }
                    this.b = z;
                    if(z) {
                        this.f = Util.v(((float)(arr_b[11] & 0xFF | (arr_b[10] & 0xFF) << 8)) / ((float)v), 0.0f, 0.95f);
                        return;
                    }
                    this.f = 0.85f;
                    return;
                }
            }
        }
        this.c = 0;
        this.d = -1;
        this.e = "sans-serif";
        this.b = false;
        this.f = 0.85f;
        this.g = -1;
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public void a(byte[] arr_b, int v, int v1, OutputOptions subtitleParser$OutputOptions0, Consumer consumer0) {
        this.a.W(arr_b, v + v1);
        this.a.Y(v);
        String s = Tx3gParser.i(this.a);
        if(s.isEmpty()) {
            consumer0.accept(new CuesWithTiming(O2.A(), 0x8000000000000001L, 0x8000000000000001L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(s);
        int v2 = spannableStringBuilder0.length();
        Tx3gParser.g(spannableStringBuilder0, this.c, 0, 0, v2, 0xFF0000);
        int v3 = spannableStringBuilder0.length();
        Tx3gParser.f(spannableStringBuilder0, this.d, -1, 0, v3, 0xFF0000);
        int v4 = spannableStringBuilder0.length();
        Tx3gParser.h(spannableStringBuilder0, this.e, 0, v4);
        float f = this.f;
        while(this.a.a() >= 8) {
            int v5 = this.a.f();
            int v6 = this.a.s();
            int v7 = this.a.s();
            boolean z = true;
            if(v7 == 1937013100) {
                if(this.a.a() < 2) {
                    z = false;
                }
                Assertions.a(z);
                int v8 = this.a.R();
                for(int v9 = 0; v9 < v8; ++v9) {
                    this.e(this.a, spannableStringBuilder0);
                }
            }
            else if(v7 == 1952608120 && this.b) {
                if(this.a.a() < 2) {
                    z = false;
                }
                Assertions.a(z);
                f = Util.v(((float)this.a.R()) / ((float)this.g), 0.0f, 0.95f);
            }
            this.a.Y(v5 + v6);
        }
        consumer0.accept(new CuesWithTiming(O2.B(new Builder().A(spannableStringBuilder0).t(f, 0).u(0).a()), 0x8000000000000001L, 0x8000000000000001L));
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

    private void e(ParsableByteArray parsableByteArray0, SpannableStringBuilder spannableStringBuilder0) {
        Assertions.a(parsableByteArray0.a() >= 12);
        int v = parsableByteArray0.R();
        int v1 = parsableByteArray0.R();
        parsableByteArray0.Z(2);
        int v2 = parsableByteArray0.L();
        parsableByteArray0.Z(1);
        int v3 = parsableByteArray0.s();
        if(v1 > spannableStringBuilder0.length()) {
            Log.n("Tx3gParser", "Truncating styl end (" + v1 + ") to cueText.length() (" + spannableStringBuilder0.length() + ").");
            v1 = spannableStringBuilder0.length();
        }
        if(v >= v1) {
            Log.n("Tx3gParser", "Ignoring styl with start (" + v + ") >= end (" + v1 + ").");
            return;
        }
        Tx3gParser.g(spannableStringBuilder0, v2, this.c, v, v1, 0);
        Tx3gParser.f(spannableStringBuilder0, v3, this.d, v, v1, 0);
    }

    private static void f(SpannableStringBuilder spannableStringBuilder0, int v, int v1, int v2, int v3, int v4) {
        if(v != v1) {
            spannableStringBuilder0.setSpan(new ForegroundColorSpan(v >>> 8 | (v & 0xFF) << 24), v2, v3, v4 | 33);
        }
    }

    private static void g(SpannableStringBuilder spannableStringBuilder0, int v, int v1, int v2, int v3, int v4) {
        boolean z = true;
        if(v != v1) {
            boolean z1 = (v & 1) != 0;
            boolean z2 = (v & 2) != 0;
            if(!z1) {
                if(z2) {
                    spannableStringBuilder0.setSpan(new StyleSpan(2), v2, v3, v4 | 33);
                }
            }
            else if(z2) {
                spannableStringBuilder0.setSpan(new StyleSpan(3), v2, v3, v4 | 33);
            }
            else {
                spannableStringBuilder0.setSpan(new StyleSpan(1), v2, v3, v4 | 33);
            }
            if((v & 4) == 0) {
                z = false;
            }
            else {
                spannableStringBuilder0.setSpan(new UnderlineSpan(), v2, v3, v4 | 33);
            }
            if(!z && !z1 && !z2) {
                spannableStringBuilder0.setSpan(new StyleSpan(0), v2, v3, v4 | 33);
            }
        }
    }

    private static void h(SpannableStringBuilder spannableStringBuilder0, String s, int v, int v1) {
        if(s != "sans-serif") {
            spannableStringBuilder0.setSpan(new TypefaceSpan(s), v, v1, 0xFF0021);
        }
    }

    private static String i(ParsableByteArray parsableByteArray0) {
        Assertions.a(parsableByteArray0.a() >= 2);
        int v = parsableByteArray0.R();
        if(v == 0) {
            return "";
        }
        int v1 = parsableByteArray0.f();
        Charset charset0 = parsableByteArray0.T();
        int v2 = parsableByteArray0.f();
        if(charset0 == null) {
            charset0 = f.c;
        }
        return parsableByteArray0.J(v - (v2 - v1), charset0);
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public void reset() {
    }
}

