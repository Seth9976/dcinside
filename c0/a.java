package C0;

import S0.l;
import com.facebook.common.time.d;
import f1.b;
import k1.n.a;
import k1.n;

@n(a.a)
public class C0.a extends b {
    private final d a;
    private final l b;

    public C0.a(d d0, l l0) {
        this.a = d0;
        this.b = l0;
    }

    @Override  // f1.b
    public void b(com.facebook.imagepipeline.request.d d0, String s, boolean z) {
        long v = this.a.now();
        this.b.c0(v);
        this.b.b0(d0);
        this.b.i0(s);
        this.b.h0(z);
    }

    @Override  // f1.b
    public void e(com.facebook.imagepipeline.request.d d0, Object object0, String s, boolean z) {
        long v = this.a.now();
        this.b.d0(v);
        this.b.b0(d0);
        this.b.Q(object0);
        this.b.i0(s);
        this.b.h0(z);
    }

    @Override  // f1.b
    public void j(com.facebook.imagepipeline.request.d d0, String s, Throwable throwable0, boolean z) {
        long v = this.a.now();
        this.b.c0(v);
        this.b.b0(d0);
        this.b.i0(s);
        this.b.h0(z);
    }

    @Override  // f1.b
    public void k(String s) {
        long v = this.a.now();
        this.b.c0(v);
        this.b.i0(s);
    }
}

