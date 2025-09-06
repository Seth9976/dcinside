package androidx.media3.extractor.text.subrip;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.text.Cue.Builder;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleParser.OutputOptions;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.e;
import com.google.common.base.f;
import com.google.common.collect.O2;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@UnstableApi
public final class SubripParser implements SubtitleParser {
    private final StringBuilder a;
    private final ArrayList b;
    private final ParsableByteArray c;
    public static final int d = 1;
    private static final float e = 0.08f;
    private static final float f = 0.92f;
    private static final float g = 0.5f;
    private static final String h = "SubripParser";
    private static final String i = "(?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?";
    private static final Pattern j = null;
    private static final Pattern k = null;
    private static final String l = "\\{\\\\an[1-9]\\}";
    private static final String m = "{\\an1}";
    private static final String n = "{\\an2}";
    private static final String o = "{\\an3}";
    private static final String p = "{\\an4}";
    private static final String q = "{\\an5}";
    private static final String r = "{\\an6}";
    private static final String s = "{\\an7}";
    private static final String t = "{\\an8}";
    private static final String u = "{\\an9}";

    static {
        SubripParser.j = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
        SubripParser.k = Pattern.compile("\\{\\\\.*?\\}");
    }

    public SubripParser() {
        this.a = new StringBuilder();
        this.b = new ArrayList();
        this.c = new ParsableByteArray();
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public void a(byte[] arr_b, int v, int v1, OutputOptions subtitleParser$OutputOptions0, Consumer consumer0) {
        String s4;
        Consumer consumer2;
        Consumer consumer1 = consumer0;
        this.c.W(arr_b, v + v1);
        this.c.Y(v);
        Charset charset0 = this.f(this.c);
        ArrayList arrayList0 = subtitleParser$OutputOptions0.a == 0x8000000000000001L || !subtitleParser$OutputOptions0.b ? null : new ArrayList();
        String s;
        while((s = this.c.v(charset0)) != null) {
            if(s.length() != 0) {
                try {
                    Integer.parseInt(s);
                }
                catch(NumberFormatException unused_ex) {
                    consumer2 = consumer1;
                    Log.n("SubripParser", "Skipping invalid index: " + s);
                    goto label_51;
                }
                String s1 = this.c.v(charset0);
                if(s1 == null) {
                    Log.n("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher0 = SubripParser.j.matcher(s1);
                if(matcher0.matches()) {
                    long v2 = SubripParser.h(matcher0, 1);
                    long v3 = SubripParser.h(matcher0, 6);
                    int v4 = 0;
                    this.a.setLength(0);
                    this.b.clear();
                    for(String s2 = this.c.v(charset0); !TextUtils.isEmpty(s2); s2 = this.c.v(charset0)) {
                        if(this.a.length() > 0) {
                            this.a.append("<br>");
                        }
                        String s3 = this.i(s2, this.b);
                        this.a.append(s3);
                    }
                    Spanned spanned0 = Html.fromHtml(this.a.toString());
                    while(true) {
                        s4 = null;
                        if(v4 < this.b.size()) {
                            String s5 = (String)this.b.get(v4);
                            if(s5.matches("\\{\\\\an[1-9]\\}")) {
                                s4 = s5;
                            }
                            else {
                                ++v4;
                                continue;
                            }
                        }
                        break;
                    }
                    if(subtitleParser$OutputOptions0.a == 0x8000000000000001L || v2 >= subtitleParser$OutputOptions0.a) {
                        consumer0.accept(new CuesWithTiming(O2.B(this.e(spanned0, s4)), v2, v3 - v2));
                    }
                    else if(arrayList0 != null) {
                        arrayList0.add(new CuesWithTiming(O2.B(this.e(spanned0, s4)), v2, v3 - v2));
                    }
                    consumer1 = consumer0;
                }
                else {
                    consumer2 = consumer1;
                    Log.n("SubripParser", "Skipping invalid timing: " + s1);
                label_51:
                    consumer1 = consumer2;
                }
            }
        }
        if(arrayList0 != null) {
            for(Object object0: arrayList0) {
                consumer1.accept(((CuesWithTiming)object0));
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

    private Cue e(Spanned spanned0, @Nullable String s) {
        int v1;
        int v;
        Builder cue$Builder0 = new Builder().A(spanned0);
        if(s == null) {
            return cue$Builder0.a();
        }
        switch(s) {
            case "{\an1}": {
                cue$Builder0.x(0);
                break;
            }
            case "{\an2}": {
                v = 6;
                goto label_23;
            }
            case "{\an3}": {
                cue$Builder0.x(2);
                break;
            }
            case "{\an4}": {
                cue$Builder0.x(0);
                break;
            }
            case "{\an5}": {
                v = 7;
                goto label_23;
            }
            case "{\an6}": {
                cue$Builder0.x(2);
                break;
            }
            case "{\an7}": {
                cue$Builder0.x(0);
                break;
            }
            case "{\an8}": {
                v = 8;
                goto label_23;
            }
            case "{\an9}": {
                v = 5;
            label_23:
                if(v == 5) {
                    cue$Builder0.x(2);
                }
                else {
                    cue$Builder0.x(1);
                }
                break;
            }
            default: {
                v = -1;
                goto label_23;
            }
        }
        switch(s) {
            case "{\an1}": 
            case "{\an2}": 
            case "{\an3}": {
                cue$Builder0.u(2);
                return cue$Builder0.w(SubripParser.g(cue$Builder0.i())).t(SubripParser.g(cue$Builder0.f()), 0).a();
            }
            case "{\an4}": {
                v1 = 6;
                goto label_43;
            }
            case "{\an5}": {
                v1 = 7;
                goto label_43;
            }
            case "{\an6}": {
                v1 = 8;
                goto label_43;
            }
            case "{\an7}": {
                break;
            }
            case "{\an8}": {
                v1 = 4;
                goto label_43;
            }
            case "{\an9}": {
                v1 = 5;
            label_43:
                if(v1 != 4 && v1 != 5) {
                    cue$Builder0.u(1);
                    return cue$Builder0.w(SubripParser.g(cue$Builder0.i())).t(SubripParser.g(cue$Builder0.f()), 0).a();
                }
                break;
            }
            default: {
                v1 = -1;
                goto label_43;
            }
        }
        cue$Builder0.u(0);
        return cue$Builder0.w(SubripParser.g(cue$Builder0.i())).t(SubripParser.g(cue$Builder0.f()), 0).a();
    }

    private Charset f(ParsableByteArray parsableByteArray0) {
        Charset charset0 = parsableByteArray0.T();
        return charset0 == null ? f.c : charset0;
    }

    @VisibleForTesting(otherwise = 2)
    public static float g(int v) {
        switch(v) {
            case 0: {
                return 0.08f;
            }
            case 1: {
                return 0.5f;
            }
            case 2: {
                return 0.92f;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }

    private static long h(Matcher matcher0, int v) {
        String s = matcher0.group(v + 1);
        long v1 = (s == null ? 0L : Long.parseLong(s) * 3600000L) + Long.parseLong(((String)Assertions.g(matcher0.group(v + 2)))) * 60000L + Long.parseLong(((String)Assertions.g(matcher0.group(v + 3)))) * 1000L;
        String s1 = matcher0.group(v + 4);
        if(s1 != null) {
            v1 += Long.parseLong(s1);
        }
        return v1 * 1000L;
    }

    private String i(String s, ArrayList arrayList0) {
        String s1 = s.trim();
        StringBuilder stringBuilder0 = new StringBuilder(s1);
        Matcher matcher0 = SubripParser.k.matcher(s1);
        for(int v = 0; matcher0.find(); v += v2) {
            String s2 = matcher0.group();
            arrayList0.add(s2);
            int v1 = matcher0.start();
            int v2 = s2.length();
            stringBuilder0.replace(v1 - v, v1 - v + v2, "");
        }
        return stringBuilder0.toString();
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public void reset() {
    }
}

