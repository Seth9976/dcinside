package androidx.media3.extractor.text.webvtt;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.LegacySubtitleUtil;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleParser.OutputOptions;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.e;
import java.util.ArrayList;

@UnstableApi
public final class WebvttParser implements SubtitleParser {
    private final ParsableByteArray a;
    private final WebvttCssParser b;
    public static final int c = 1;
    private static final int d = -1;
    private static final int e = 0;
    private static final int f = 1;
    private static final int g = 2;
    private static final int h = 3;
    private static final String i = "NOTE";
    private static final String j = "STYLE";

    public WebvttParser() {
        this.a = new ParsableByteArray();
        this.b = new WebvttCssParser();
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public void a(byte[] arr_b, int v, int v1, OutputOptions subtitleParser$OutputOptions0, Consumer consumer0) {
        this.a.W(arr_b, v1 + v);
        this.a.Y(v);
        ArrayList arrayList0 = new ArrayList();
        try {
            WebvttParserUtil.e(this.a);
        }
        catch(ParserException parserException0) {
            throw new IllegalArgumentException(parserException0);
        }
        while(!TextUtils.isEmpty(this.a.u())) {
        }
        ArrayList arrayList1 = new ArrayList();
        while(true) {
            switch(WebvttParser.e(this.a)) {
                case 0: {
                    LegacySubtitleUtil.c(new WebvttSubtitle(arrayList1), subtitleParser$OutputOptions0, consumer0);
                    return;
                }
                case 1: {
                    WebvttParser.f(this.a);
                    break;
                }
                case 2: {
                    if(!arrayList1.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.a.u();
                    arrayList0.addAll(this.b.d(this.a));
                    break;
                }
                case 3: {
                    WebvttCueInfo webvttCueInfo0 = WebvttCueParser.m(this.a, arrayList0);
                    if(webvttCueInfo0 == null) {
                        break;
                    }
                    arrayList1.add(webvttCueInfo0);
                }
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

    // This method was un-flattened
    private static int e(ParsableByteArray parsableByteArray0) {
        int v1;
        int v = parsableByteArray0.f();
        String s = parsableByteArray0.u();
        if(s == null) {
            v1 = 0;
        }
        else if("STYLE".equals(s)) {
            v1 = 2;
        }
        else {
            v1 = s.startsWith("NOTE") ? 1 : 3;
        }
        parsableByteArray0.Y(v);
        return v1;
    }

    private static void f(ParsableByteArray parsableByteArray0) {
        while(!TextUtils.isEmpty(parsableByteArray0.u())) {
        }
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public void reset() {
    }
}

