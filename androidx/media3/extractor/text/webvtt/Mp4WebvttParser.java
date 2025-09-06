package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.text.Cue.Builder;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
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
import java.util.Collections;

@UnstableApi
public final class Mp4WebvttParser implements SubtitleParser {
    private final ParsableByteArray a;
    public static final int b = 2;
    private static final int c = 8;
    private static final int d = 0x7061796C;
    private static final int e = 1937011815;
    private static final int f = 0x76747463;

    public Mp4WebvttParser() {
        this.a = new ParsableByteArray();
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public void a(byte[] arr_b, int v, int v1, OutputOptions subtitleParser$OutputOptions0, Consumer consumer0) {
        this.a.W(arr_b, v1 + v);
        this.a.Y(v);
        ArrayList arrayList0 = new ArrayList();
        while(this.a.a() > 0) {
            Assertions.b(this.a.a() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int v2 = this.a.s();
            if(this.a.s() == 0x76747463) {
                arrayList0.add(Mp4WebvttParser.e(this.a, v2 - 8));
            }
            else {
                this.a.Z(v2 - 8);
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

    private static Cue e(ParsableByteArray parsableByteArray0, int v) {
        String s = null;
        Builder cue$Builder0 = null;
        while(v > 0) {
            Assertions.b(v >= 8, "Incomplete vtt cue box header found.");
            int v1 = parsableByteArray0.s();
            int v2 = parsableByteArray0.s();
            String s1 = Util.U(parsableByteArray0.e(), parsableByteArray0.f(), v1 - 8);
            parsableByteArray0.Z(v1 - 8);
            v = v - 8 - (v1 - 8);
            if(v2 == 1937011815) {
                cue$Builder0 = WebvttCueParser.o(s1);
            }
            else if(v2 == 0x7061796C) {
                s = WebvttCueParser.q(null, s1.trim(), Collections.emptyList());
            }
        }
        if(s == null) {
            s = "";
        }
        return cue$Builder0 == null ? WebvttCueParser.l(s) : cue$Builder0.A(s).a();
    }

    @Override  // androidx.media3.extractor.text.SubtitleParser
    public void reset() {
    }
}

