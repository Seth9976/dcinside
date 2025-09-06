package androidx.media3.extractor.text.ssa;

import android.graphics.PointF;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue.Builder;
import androidx.media3.common.text.Cue;
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
import com.google.common.base.c;
import com.google.common.base.f;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@UnstableApi
public final class SsaParser implements SubtitleParser {
    private final boolean a;
    @Nullable
    private final SsaDialogueFormat b;
    private final ParsableByteArray c;
    private Map d;
    private float e;
    private float f;
    public static final int g = 1;
    private static final String h = "SsaParser";
    private static final Pattern i = null;
    static final String j = "Format:";
    static final String k = "Style:";
    private static final String l = "Dialogue:";
    private static final float m = 0.05f;

    static {
        SsaParser.i = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    }

    public SsaParser() {
        this(null);
    }

    public SsaParser(@Nullable List list0) {
        this.e = -3.402823E+38f;
        this.f = -3.402823E+38f;
        this.c = new ParsableByteArray();
        if(list0 != null && !list0.isEmpty()) {
            this.a = true;
            String s = Util.T(((byte[])list0.get(0)));
            Assertions.a(s.startsWith("Format:"));
            this.b = (SsaDialogueFormat)Assertions.g(SsaDialogueFormat.a(s));
            this.k(new ParsableByteArray(((byte[])list0.get(1))), f.c);
            return;
        }
        this.a = false;
        this.b = null;
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public void a(byte[] arr_b, int v, int v1, OutputOptions subtitleParser$OutputOptions0, Consumer consumer0) {
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        this.c.W(arr_b, v + v1);
        this.c.Y(v);
        Charset charset0 = this.h(this.c);
        if(!this.a) {
            this.k(this.c, charset0);
        }
        this.j(this.c, arrayList0, arrayList1, charset0);
        ArrayList arrayList2 = subtitleParser$OutputOptions0.a == 0x8000000000000001L || !subtitleParser$OutputOptions0.b ? null : new ArrayList();
        for(int v2 = 0; v2 < arrayList0.size(); ++v2) {
            List list0 = (List)arrayList0.get(v2);
            if(!list0.isEmpty() || v2 == 0) {
                if(v2 == arrayList0.size() - 1) {
                    throw new IllegalStateException();
                }
                long v3 = (long)(((Long)arrayList1.get(v2)));
                long v4 = ((long)(((Long)arrayList1.get(v2 + 1)))) - ((long)(((Long)arrayList1.get(v2))));
                if(subtitleParser$OutputOptions0.a == 0x8000000000000001L || v3 >= subtitleParser$OutputOptions0.a) {
                    consumer0.accept(new CuesWithTiming(list0, v3, v4));
                }
                else if(arrayList2 != null) {
                    arrayList2.add(new CuesWithTiming(list0, v3, v4));
                }
            }
        }
        if(arrayList2 != null) {
            for(Object object0: arrayList2) {
                consumer0.accept(((CuesWithTiming)object0));
            }
        }
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public int b() {
        return 1;
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public void c(byte[] arr_b, OutputOptions subtitleParser$OutputOptions0, Consumer consumer0) {
        e.a(this, arr_b, subtitleParser$OutputOptions0, consumer0);
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public Subtitle d(byte[] arr_b, int v, int v1) {
        return e.b(this, arr_b, v, v1);
    }

    private static int e(long v, List list0, List list1) {
        int v2;
        for(int v1 = list0.size() - 1; true; --v1) {
            v2 = 0;
            if(v1 < 0) {
                break;
            }
            if(((long)(((Long)list0.get(v1)))) == v) {
                return v1;
            }
            if(((long)(((Long)list0.get(v1)))) < v) {
                v2 = v1 + 1;
                break;
            }
        }
        list0.add(v2, v);
        list1.add(v2, (v2 == 0 ? new ArrayList() : new ArrayList(((Collection)list1.get(v2 - 1)))));
        return v2;
    }

    private static float f(int v) {
        switch(v) {
            case 0: {
                return 0.05f;
            }
            case 1: {
                return 0.5f;
            }
            case 2: {
                return 0.95f;
            }
            default: {
                return -3.402823E+38f;
            }
        }
    }

    private static Cue g(String s, @Nullable SsaStyle ssaStyle0, Overrides ssaStyle$Overrides0, float f, float f1) {
        SpannableString spannableString0 = new SpannableString(s);
        Builder cue$Builder0 = new Builder().A(spannableString0);
        if(ssaStyle0 != null) {
            if(ssaStyle0.c != null) {
                spannableString0.setSpan(new ForegroundColorSpan(((int)ssaStyle0.c)), 0, spannableString0.length(), 33);
            }
            if(ssaStyle0.j == 3 && ssaStyle0.d != null) {
                spannableString0.setSpan(new BackgroundColorSpan(((int)ssaStyle0.d)), 0, spannableString0.length(), 33);
            }
            float f2 = ssaStyle0.e;
            if(f2 != -3.402823E+38f && f1 != -3.402823E+38f) {
                cue$Builder0.C(f2 / f1, 1);
            }
            boolean z = ssaStyle0.f;
            if(z && ssaStyle0.g) {
                spannableString0.setSpan(new StyleSpan(3), 0, spannableString0.length(), 33);
            }
            else if(z) {
                spannableString0.setSpan(new StyleSpan(1), 0, spannableString0.length(), 33);
            }
            else if(ssaStyle0.g) {
                spannableString0.setSpan(new StyleSpan(2), 0, spannableString0.length(), 33);
            }
            if(ssaStyle0.h) {
                spannableString0.setSpan(new UnderlineSpan(), 0, spannableString0.length(), 33);
            }
            if(ssaStyle0.i) {
                spannableString0.setSpan(new StrikethroughSpan(), 0, spannableString0.length(), 33);
            }
        }
        int v = ssaStyle$Overrides0.a;
        if(v == -1) {
            v = ssaStyle0 == null ? -1 : ssaStyle0.b;
        }
        cue$Builder0.B(SsaParser.q(v)).x(SsaParser.p(v)).u(SsaParser.o(v));
        PointF pointF0 = ssaStyle$Overrides0.b;
        if(pointF0 != null && f1 != -3.402823E+38f && f != -3.402823E+38f) {
            cue$Builder0.w(pointF0.x / f);
            cue$Builder0.t(ssaStyle$Overrides0.b.y / f1, 0);
            return cue$Builder0.a();
        }
        cue$Builder0.w(SsaParser.f(cue$Builder0.i()));
        cue$Builder0.t(SsaParser.f(cue$Builder0.f()), 0);
        return cue$Builder0.a();
    }

    private Charset h(ParsableByteArray parsableByteArray0) {
        Charset charset0 = parsableByteArray0.T();
        return charset0 == null ? f.c : charset0;
    }

    private void i(String s, SsaDialogueFormat ssaDialogueFormat0, List list0, List list1) {
        SsaStyle ssaStyle0;
        Assertions.a(s.startsWith("Dialogue:"));
        String[] arr_s = s.substring(9).split(",", ssaDialogueFormat0.e);
        if(arr_s.length != ssaDialogueFormat0.e) {
            Log.n("SsaParser", "Skipping dialogue line with fewer columns than format: " + s);
            return;
        }
        long v = SsaParser.n(arr_s[ssaDialogueFormat0.a]);
        if(v == 0x8000000000000001L) {
            Log.n("SsaParser", "Skipping invalid timing: " + s);
            return;
        }
        long v1 = SsaParser.n(arr_s[ssaDialogueFormat0.b]);
        if(v1 == 0x8000000000000001L) {
            Log.n("SsaParser", "Skipping invalid timing: " + s);
            return;
        }
        Map map0 = this.d;
        if(map0 == null) {
            ssaStyle0 = null;
        }
        else {
            int v2 = ssaDialogueFormat0.c;
            ssaStyle0 = v2 == -1 ? null : ((SsaStyle)map0.get(arr_s[v2].trim()));
        }
        String s1 = arr_s[ssaDialogueFormat0.d];
        Overrides ssaStyle$Overrides0 = Overrides.b(s1);
        Cue cue0 = SsaParser.g(Overrides.d(s1).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), ssaStyle0, ssaStyle$Overrides0, this.e, this.f);
        int v3 = SsaParser.e(v, list1, list0);
        int v4 = SsaParser.e(v1, list1, list0);
        while(v3 < v4) {
            ((List)list0.get(v3)).add(cue0);
            ++v3;
        }
    }

    private void j(ParsableByteArray parsableByteArray0, List list0, List list1, Charset charset0) {
        SsaDialogueFormat ssaDialogueFormat0 = this.a ? this.b : null;
        String s;
        while((s = parsableByteArray0.v(charset0)) != null) {
            if(s.startsWith("Format:")) {
                ssaDialogueFormat0 = SsaDialogueFormat.a(s);
            }
            else if(!s.startsWith("Dialogue:")) {
            }
            else if(ssaDialogueFormat0 == null) {
                Log.n("SsaParser", "Skipping dialogue line before complete format: " + s);
            }
            else {
                this.i(s, ssaDialogueFormat0, list0, list1);
            }
        }
    }

    private void k(ParsableByteArray parsableByteArray0, Charset charset0) {
        String s;
        while((s = parsableByteArray0.v(charset0)) != null) {
            if("[Script Info]".equalsIgnoreCase(s)) {
                this.l(parsableByteArray0, charset0);
            }
            else if("[V4+ Styles]".equalsIgnoreCase(s)) {
                this.d = SsaParser.m(parsableByteArray0, charset0);
            }
            else if("[V4 Styles]".equalsIgnoreCase(s)) {
                Log.h("SsaParser", "[V4 Styles] are not supported");
            }
            else if("[Events]".equalsIgnoreCase(s)) {
                break;
            }
        }
    }

    private void l(ParsableByteArray parsableByteArray0, Charset charset0) {
        while(true) {
            String s = parsableByteArray0.v(charset0);
            if(s == null || parsableByteArray0.a() != 0 && parsableByteArray0.i(charset0) == 91) {
                break;
            }
            String[] arr_s = s.split(":");
            if(arr_s.length == 2) {
                String s1 = c.g(arr_s[0].trim());
                s1.hashCode();
                if(s1.equals("playresx")) {
                    this.e = Float.parseFloat(arr_s[1].trim());
                }
                else if(s1.equals("playresy")) {
                    this.f = Float.parseFloat(arr_s[1].trim());
                }
                else {
                    continue;
                }
            }
        }
    }

    private static Map m(ParsableByteArray parsableByteArray0, Charset charset0) {
        Map map0 = new LinkedHashMap();
        Format ssaStyle$Format0 = null;
        while(true) {
            String s = parsableByteArray0.v(charset0);
            if(s == null || parsableByteArray0.a() != 0 && parsableByteArray0.i(charset0) == 91) {
                break;
            }
            if(s.startsWith("Format:")) {
                ssaStyle$Format0 = Format.a(s);
            }
            else if(!s.startsWith("Style:")) {
            }
            else if(ssaStyle$Format0 == null) {
                Log.n("SsaParser", "Skipping \'Style:\' line before \'Format:\' line: " + s);
            }
            else {
                SsaStyle ssaStyle0 = SsaStyle.b(s, ssaStyle$Format0);
                if(ssaStyle0 != null) {
                    map0.put(ssaStyle0.a, ssaStyle0);
                }
            }
        }
        return map0;
    }

    private static long n(String s) {
        Matcher matcher0 = SsaParser.i.matcher(s.trim());
        return matcher0.matches() ? Long.parseLong(((String)Util.o(matcher0.group(1)))) * 3600000000L + Long.parseLong(((String)Util.o(matcher0.group(2)))) * 60000000L + Long.parseLong(((String)Util.o(matcher0.group(3)))) * 1000000L + Long.parseLong(((String)Util.o(matcher0.group(4)))) * 10000L : 0x8000000000000001L;
    }

    private static int o(int v) {
        switch(v) {
            case -1: {
                return 0x80000000;
            }
            case 1: 
            case 2: 
            case 3: {
                return 2;
            }
            case 4: 
            case 5: 
            case 6: {
                return 1;
            }
            case 7: 
            case 8: 
            case 9: {
                return 0;
            }
            default: {
                Log.n("SsaParser", "Unknown alignment: " + v);
                return 0x80000000;
            }
        }
    }

    private static int p(int v) {
        switch(v) {
            case -1: {
                return 0x80000000;
            }
            case 1: 
            case 4: 
            case 7: {
                return 0;
            }
            case 2: 
            case 5: 
            case 8: {
                return 1;
            }
            case 3: 
            case 6: 
            case 9: {
                return 2;
            }
            default: {
                Log.n("SsaParser", "Unknown alignment: " + v);
                return 0x80000000;
            }
        }
    }

    @Nullable
    private static Layout.Alignment q(int v) {
        switch(v) {
            case -1: {
                return null;
            }
            case 1: 
            case 4: 
            case 7: {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            case 2: 
            case 5: 
            case 8: {
                return Layout.Alignment.ALIGN_CENTER;
            }
            case 3: 
            case 6: 
            case 9: {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            default: {
                Log.n("SsaParser", "Unknown alignment: " + v);
                return null;
            }
        }
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public void reset() {
    }
}

