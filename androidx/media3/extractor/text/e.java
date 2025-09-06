package androidx.media3.extractor.text;

import androidx.media3.common.util.Consumer;
import com.google.common.collect.O2.a;
import com.google.common.collect.O2;
import j..util.Objects;

public final class e {
    public static void a(SubtitleParser subtitleParser0, byte[] arr_b, OutputOptions subtitleParser$OutputOptions0, Consumer consumer0) {
        subtitleParser0.a(arr_b, 0, arr_b.length, subtitleParser$OutputOptions0, consumer0);
    }

    public static Subtitle b(SubtitleParser subtitleParser0, byte[] arr_b, int v, int v1) {
        a o2$a0 = O2.n();
        OutputOptions subtitleParser$OutputOptions0 = OutputOptions.c;
        Objects.requireNonNull(o2$a0);
        subtitleParser0.a(arr_b, v, v1, subtitleParser$OutputOptions0, new d(o2$a0));
        return new CuesWithTimingSubtitle(o2$a0.n());
    }

    public static void c(SubtitleParser subtitleParser0) {
    }
}

