package androidx.media3.extractor.text;

import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.UnstableApi;
import java.util.List;

@UnstableApi
public class LegacySubtitleUtil {
    private static int a(Subtitle subtitle0, long v) {
        if(v == 0x8000000000000001L) {
            return 0;
        }
        int v1 = subtitle0.c(v);
        if(v1 == -1) {
            v1 = subtitle0.b();
        }
        return v1 <= 0 || subtitle0.a(v1 - 1) != v ? v1 : v1 - 1;
    }

    private static void b(Subtitle subtitle0, int v, Consumer consumer0) {
        long v1 = subtitle0.a(v);
        List list0 = subtitle0.d(v1);
        if(list0.isEmpty()) {
            return;
        }
        if(v == subtitle0.b() - 1) {
            throw new IllegalStateException();
        }
        long v2 = subtitle0.a(v + 1) - subtitle0.a(v);
        if(v2 > 0L) {
            consumer0.accept(new CuesWithTiming(list0, v1, v2));
        }
    }

    public static void c(Subtitle subtitle0, OutputOptions subtitleParser$OutputOptions0, Consumer consumer0) {
        boolean z;
        int v = LegacySubtitleUtil.a(subtitle0, subtitleParser$OutputOptions0.a);
        if(subtitleParser$OutputOptions0.a == 0x8000000000000001L || v >= subtitle0.b()) {
            z = false;
        }
        else {
            List list0 = subtitle0.d(subtitleParser$OutputOptions0.a);
            long v2 = subtitle0.a(v);
            if(list0.isEmpty()) {
                z = false;
            }
            else {
                long v3 = subtitleParser$OutputOptions0.a;
                if(v3 < v2) {
                    consumer0.accept(new CuesWithTiming(list0, v3, v2 - v3));
                    z = true;
                }
                else {
                    z = false;
                }
            }
        }
        for(int v4 = v; v4 < subtitle0.b(); ++v4) {
            LegacySubtitleUtil.b(subtitle0, v4, consumer0);
        }
        if(subtitleParser$OutputOptions0.b) {
            if(z) {
                --v;
            }
            for(int v1 = 0; v1 < v; ++v1) {
                LegacySubtitleUtil.b(subtitle0, v1, consumer0);
            }
            if(z) {
                List list1 = subtitle0.d(subtitleParser$OutputOptions0.a);
                long v5 = subtitle0.a(v);
                long v6 = subtitle0.a(v);
                consumer0.accept(new CuesWithTiming(list1, v5, subtitleParser$OutputOptions0.a - v6));
            }
        }
    }
}

