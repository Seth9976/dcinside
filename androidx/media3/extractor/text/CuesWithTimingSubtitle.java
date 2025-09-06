package androidx.media3.extractor.text;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.O2;
import com.google.common.collect.c4;
import com.google.common.collect.p3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@UnstableApi
public final class CuesWithTimingSubtitle implements Subtitle {
    private final O2 a;
    private final long[] b;
    private static final String c = "CuesWithTimingSubtitle";
    private static final c4 d;

    static {
        CuesWithTimingSubtitle.d = c4.K().O((CuesWithTiming cuesWithTiming0) -> CuesWithTimingSubtitle.h(cuesWithTiming0.b));
    }

    public CuesWithTimingSubtitle(List list0) {
        if(list0.size() == 1) {
            CuesWithTiming cuesWithTiming0 = (CuesWithTiming)p3.z(list0);
            long v1 = CuesWithTimingSubtitle.h(cuesWithTiming0.b);
            if(cuesWithTiming0.c == 0x8000000000000001L) {
                this.a = O2.B(cuesWithTiming0.a);
                this.b = new long[]{v1};
                return;
            }
            this.a = O2.C(cuesWithTiming0.a, O2.A());
            this.b = new long[]{v1, cuesWithTiming0.c + v1};
            return;
        }
        long[] arr_v = new long[list0.size() * 2];
        this.b = arr_v;
        Arrays.fill(arr_v, 0x7FFFFFFFFFFFFFFFL);
        ArrayList arrayList0 = new ArrayList();
        O2 o20 = O2.Q(CuesWithTimingSubtitle.d, list0);
        int v2 = 0;
        for(int v = 0; v < o20.size(); ++v) {
            CuesWithTiming cuesWithTiming1 = (CuesWithTiming)o20.get(v);
            long v3 = CuesWithTimingSubtitle.h(cuesWithTiming1.b);
            long v4 = cuesWithTiming1.c + v3;
            if(v2 == 0) {
                this.b[v2] = v3;
                arrayList0.add(cuesWithTiming1.a);
                ++v2;
            }
            else {
                long v5 = this.b[v2 - 1];
                if(v5 >= v3) {
                    if(v5 != v3 || !((O2)arrayList0.get(v2 - 1)).isEmpty()) {
                        Log.n("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                        this.b[v2 - 1] = v3;
                    }
                    arrayList0.set(v2 - 1, cuesWithTiming1.a);
                }
            }
            if(cuesWithTiming1.c != 0x8000000000000001L) {
                this.b[v2] = v4;
                arrayList0.add(O2.A());
                ++v2;
            }
        }
        this.a = O2.r(arrayList0);
    }

    @Override  // androidx.media3.extractor.text.Subtitle
    public long a(int v) {
        Assertions.a(v < this.a.size());
        return this.b[v];
    }

    @Override  // androidx.media3.extractor.text.Subtitle
    public int b() {
        return this.a.size();
    }

    @Override  // androidx.media3.extractor.text.Subtitle
    public int c(long v) {
        int v1 = Util.j(this.b, v, false, false);
        return v1 < this.a.size() ? v1 : -1;
    }

    @Override  // androidx.media3.extractor.text.Subtitle
    public List d(long v) {
        return this.f(v);
    }

    public O2 f(long v) {
        int v1 = Util.n(this.b, v, true, false);
        return v1 == -1 ? O2.A() : ((O2)this.a.get(v1));
    }

    // 检测为 Lambda 实现
    private static Comparable g(CuesWithTiming cuesWithTiming0) [...]

    private static long h(long v) {
        return v == 0x8000000000000001L ? 0L : v;
    }
}

