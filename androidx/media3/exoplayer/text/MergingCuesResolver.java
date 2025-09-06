package androidx.media3.exoplayer.text;

import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.text.CuesWithTiming;
import com.google.common.collect.O2;
import com.google.common.collect.c4;
import java.util.ArrayList;
import java.util.List;

final class MergingCuesResolver implements CuesResolver {
    private final List a;
    private static final c4 b;

    static {
        MergingCuesResolver.b = c4.K().O(new a()).k(c4.K().P().O(new b()));
    }

    public MergingCuesResolver() {
        this.a = new ArrayList();
    }

    @Override  // androidx.media3.exoplayer.text.CuesResolver
    public O2 a(long v) {
        if(!this.a.isEmpty() && v >= ((CuesWithTiming)this.a.get(0)).b) {
            ArrayList arrayList0 = new ArrayList();
            for(int v2 = 0; v2 < this.a.size(); ++v2) {
                CuesWithTiming cuesWithTiming0 = (CuesWithTiming)this.a.get(v2);
                if(v >= cuesWithTiming0.b && v < cuesWithTiming0.d) {
                    arrayList0.add(cuesWithTiming0);
                }
                if(v < cuesWithTiming0.b) {
                    break;
                }
            }
            O2 o20 = O2.Q(MergingCuesResolver.b, arrayList0);
            com.google.common.collect.O2.a o2$a0 = O2.n();
            for(int v1 = 0; v1 < o20.size(); ++v1) {
                o2$a0.l(((CuesWithTiming)o20.get(v1)).a);
            }
            return o2$a0.n();
        }
        return O2.A();
    }

    @Override  // androidx.media3.exoplayer.text.CuesResolver
    public long b(long v) {
        long v2 = 0x8000000000000001L;
        for(int v1 = 0; v1 < this.a.size(); ++v1) {
            long v3 = ((CuesWithTiming)this.a.get(v1)).b;
            long v4 = ((CuesWithTiming)this.a.get(v1)).d;
            if(v < v3) {
                if(v2 == 0x8000000000000001L) {
                    return v3 == 0x8000000000000001L ? 0x8000000000000000L : v3;
                }
                v2 = Math.min(v2, v3);
                return v2 == 0x8000000000000001L ? 0x8000000000000000L : v2;
            }
            if(v < v4) {
                v2 = v2 == 0x8000000000000001L ? v4 : Math.min(v2, v4);
            }
        }
        return v2 == 0x8000000000000001L ? 0x8000000000000000L : v2;
    }

    @Override  // androidx.media3.exoplayer.text.CuesResolver
    public void c(long v) {
        for(int v1 = 0; v1 < this.a.size(); ++v1) {
            int v2 = Long.compare(v, ((CuesWithTiming)this.a.get(v1)).b);
            if(v2 > 0 && v > ((CuesWithTiming)this.a.get(v1)).d) {
                this.a.remove(v1);
                --v1;
            }
            else if(v2 < 0) {
                break;
            }
        }
    }

    @Override  // androidx.media3.exoplayer.text.CuesResolver
    public void clear() {
        this.a.clear();
    }

    @Override  // androidx.media3.exoplayer.text.CuesResolver
    public boolean d(CuesWithTiming cuesWithTiming0, long v) {
        Assertions.a(cuesWithTiming0.b != 0x8000000000000001L);
        Assertions.a(cuesWithTiming0.c != 0x8000000000000001L);
        boolean z = cuesWithTiming0.b <= v && v < cuesWithTiming0.d;
        for(int v1 = this.a.size() - 1; v1 >= 0; --v1) {
            long v2 = ((CuesWithTiming)this.a.get(v1)).b;
            if(cuesWithTiming0.b >= v2) {
                this.a.add(v1 + 1, cuesWithTiming0);
                return z;
            }
        }
        this.a.add(0, cuesWithTiming0);
        return z;
    }

    @Override  // androidx.media3.exoplayer.text.CuesResolver
    public long e(long v) {
        if(!this.a.isEmpty() && v >= ((CuesWithTiming)this.a.get(0)).b) {
            long v2 = ((CuesWithTiming)this.a.get(0)).b;
            for(int v1 = 0; v1 < this.a.size(); ++v1) {
                long v3 = ((CuesWithTiming)this.a.get(v1)).b;
                long v4 = ((CuesWithTiming)this.a.get(v1)).d;
                if(v4 <= v) {
                    v2 = Math.max(v2, v4);
                }
                else {
                    if(v3 > v) {
                        break;
                    }
                    v2 = Math.max(v2, v3);
                }
            }
            return v2;
        }
        return 0x8000000000000001L;
    }
}

