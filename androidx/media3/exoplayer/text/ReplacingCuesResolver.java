package androidx.media3.exoplayer.text;

import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.text.CuesWithTiming;
import com.google.common.collect.O2;
import com.google.common.collect.p3;
import java.util.ArrayList;

final class ReplacingCuesResolver implements CuesResolver {
    private final ArrayList a;

    public ReplacingCuesResolver() {
        this.a = new ArrayList();
    }

    @Override  // androidx.media3.exoplayer.text.CuesResolver
    public O2 a(long v) {
        int v1 = this.f(v);
        if(v1 == 0) {
            return O2.A();
        }
        CuesWithTiming cuesWithTiming0 = (CuesWithTiming)this.a.get(v1 - 1);
        return cuesWithTiming0.d == 0x8000000000000001L || v < cuesWithTiming0.d ? cuesWithTiming0.a : O2.A();
    }

    @Override  // androidx.media3.exoplayer.text.CuesResolver
    public long b(long v) {
        if(this.a.isEmpty()) {
            return 0x8000000000000000L;
        }
        if(v < ((CuesWithTiming)this.a.get(0)).b) {
            return ((CuesWithTiming)this.a.get(0)).b;
        }
        for(int v1 = 1; v1 < this.a.size(); ++v1) {
            CuesWithTiming cuesWithTiming0 = (CuesWithTiming)this.a.get(v1);
            if(v < cuesWithTiming0.b) {
                long v2 = ((CuesWithTiming)this.a.get(v1 - 1)).d;
                return v2 != 0x8000000000000001L && v2 > v && v2 < cuesWithTiming0.b ? v2 : cuesWithTiming0.b;
            }
        }
        long v3 = ((CuesWithTiming)p3.w(this.a)).d;
        return v3 == 0x8000000000000001L || v >= v3 ? 0x8000000000000000L : v3;
    }

    @Override  // androidx.media3.exoplayer.text.CuesResolver
    public void c(long v) {
        int v1 = this.f(v);
        if(v1 > 0) {
            this.a.subList(0, v1).clear();
        }
    }

    @Override  // androidx.media3.exoplayer.text.CuesResolver
    public void clear() {
        this.a.clear();
    }

    @Override  // androidx.media3.exoplayer.text.CuesResolver
    public boolean d(CuesWithTiming cuesWithTiming0, long v) {
        Assertions.a(cuesWithTiming0.b != 0x8000000000000001L);
        boolean z = cuesWithTiming0.b <= v && (cuesWithTiming0.d == 0x8000000000000001L || v < cuesWithTiming0.d);
        for(int v1 = this.a.size() - 1; v1 >= 0; --v1) {
            long v2 = ((CuesWithTiming)this.a.get(v1)).b;
            if(cuesWithTiming0.b >= v2) {
                this.a.add(v1 + 1, cuesWithTiming0);
                return z;
            }
            if(((CuesWithTiming)this.a.get(v1)).b <= v) {
                z = false;
            }
        }
        this.a.add(0, cuesWithTiming0);
        return z;
    }

    @Override  // androidx.media3.exoplayer.text.CuesResolver
    public long e(long v) {
        if(!this.a.isEmpty() && v >= ((CuesWithTiming)this.a.get(0)).b) {
            for(int v1 = 1; v1 < this.a.size(); ++v1) {
                long v2 = ((CuesWithTiming)this.a.get(v1)).b;
                int v3 = Long.compare(v, v2);
                if(v3 == 0) {
                    return v2;
                }
                if(v3 < 0) {
                    CuesWithTiming cuesWithTiming0 = (CuesWithTiming)this.a.get(v1 - 1);
                    return cuesWithTiming0.d != 0x8000000000000001L && cuesWithTiming0.d <= v ? cuesWithTiming0.d : cuesWithTiming0.b;
                }
            }
            CuesWithTiming cuesWithTiming1 = (CuesWithTiming)p3.w(this.a);
            return cuesWithTiming1.d != 0x8000000000000001L && v >= cuesWithTiming1.d ? cuesWithTiming1.d : cuesWithTiming1.b;
        }
        return 0x8000000000000001L;
    }

    private int f(long v) {
        for(int v1 = 0; v1 < this.a.size(); ++v1) {
            if(v < ((CuesWithTiming)this.a.get(v1)).b) {
                return v1;
            }
        }
        return this.a.size();
    }
}

