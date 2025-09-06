package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.Subtitle;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class WebvttSubtitle implements Subtitle {
    private final List a;
    private final long[] b;
    private final long[] c;

    public WebvttSubtitle(List list0) {
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list0));
        this.b = new long[list0.size() * 2];
        for(int v = 0; v < list0.size(); ++v) {
            WebvttCueInfo webvttCueInfo0 = (WebvttCueInfo)list0.get(v);
            this.b[v * 2] = webvttCueInfo0.b;
            this.b[v * 2 + 1] = webvttCueInfo0.c;
        }
        long[] arr_v = Arrays.copyOf(this.b, this.b.length);
        this.c = arr_v;
        Arrays.sort(arr_v);
    }

    @Override  // androidx.media3.extractor.text.Subtitle
    public long a(int v) {
        boolean z = false;
        Assertions.a(v >= 0);
        if(v < this.c.length) {
            z = true;
        }
        Assertions.a(z);
        return this.c[v];
    }

    @Override  // androidx.media3.extractor.text.Subtitle
    public int b() {
        return this.c.length;
    }

    @Override  // androidx.media3.extractor.text.Subtitle
    public int c(long v) {
        int v1 = Util.j(this.c, v, false, false);
        return v1 < this.c.length ? v1 : -1;
    }

    @Override  // androidx.media3.extractor.text.Subtitle
    public List d(long v) {
        List list0 = new ArrayList();
        ArrayList arrayList0 = new ArrayList();
        for(int v2 = 0; v2 < this.a.size(); ++v2) {
            if(this.b[v2 * 2] <= v && v < this.b[v2 * 2 + 1]) {
                WebvttCueInfo webvttCueInfo0 = (WebvttCueInfo)this.a.get(v2);
                Cue cue0 = webvttCueInfo0.a;
                if(cue0.e == -3.402823E+38f) {
                    arrayList0.add(webvttCueInfo0);
                }
                else {
                    list0.add(cue0);
                }
            }
        }
        Collections.sort(arrayList0, (WebvttCueInfo webvttCueInfo0, WebvttCueInfo webvttCueInfo1) -> Long.compare(webvttCueInfo0.b, webvttCueInfo1.b));
        for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
            list0.add(((WebvttCueInfo)arrayList0.get(v1)).a.a().t(((float)(-1 - v1)), 1).a());
        }
        return list0;
    }

    // 检测为 Lambda 实现
    private static int f(WebvttCueInfo webvttCueInfo0, WebvttCueInfo webvttCueInfo1) [...]
}

