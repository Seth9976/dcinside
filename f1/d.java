package f1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class d implements f {
    private final List a;
    private static final String b = "ForwardingRequestListener";

    public d(Set set0) {
        this.a = new ArrayList(set0.size());
        for(Object object0: set0) {
            f f0 = (f)object0;
            if(f0 != null) {
                this.a.add(f0);
            }
        }
    }

    public d(f[] arr_f) {
        this.a = new ArrayList(arr_f.length);
        for(int v = 0; v < arr_f.length; ++v) {
            f f0 = arr_f[v];
            if(f0 != null) {
                this.a.add(f0);
            }
        }
    }

    @Override  // com.facebook.imagepipeline.producers.m0
    public void a(String s, String s1) {
        int v = this.a.size();
        for(int v1 = 0; v1 < v; ++v1) {
            f f0 = (f)this.a.get(v1);
            try {
                f0.a(s, s1);
            }
            catch(Exception exception0) {
                this.m("InternalListener exception in onProducerStart", exception0);
            }
        }
    }

    @Override  // f1.f
    public void b(com.facebook.imagepipeline.request.d d0, String s, boolean z) {
        int v = this.a.size();
        for(int v1 = 0; v1 < v; ++v1) {
            f f0 = (f)this.a.get(v1);
            try {
                f0.b(d0, s, z);
            }
            catch(Exception exception0) {
                this.m("InternalListener exception in onRequestSuccess", exception0);
            }
        }
    }

    @Override  // com.facebook.imagepipeline.producers.m0
    public void c(String s, String s1, Throwable throwable0, @h Map map0) {
        int v = this.a.size();
        for(int v1 = 0; v1 < v; ++v1) {
            f f0 = (f)this.a.get(v1);
            try {
                f0.c(s, s1, throwable0, map0);
            }
            catch(Exception exception0) {
                this.m("InternalListener exception in onProducerFinishWithFailure", exception0);
            }
        }
    }

    @Override  // com.facebook.imagepipeline.producers.m0
    public void d(String s, String s1, String s2) {
        int v = this.a.size();
        for(int v1 = 0; v1 < v; ++v1) {
            f f0 = (f)this.a.get(v1);
            try {
                f0.d(s, s1, s2);
            }
            catch(Exception exception0) {
                this.m("InternalListener exception in onIntermediateChunkStart", exception0);
            }
        }
    }

    @Override  // f1.f
    public void e(com.facebook.imagepipeline.request.d d0, Object object0, String s, boolean z) {
        int v = this.a.size();
        for(int v1 = 0; v1 < v; ++v1) {
            f f0 = (f)this.a.get(v1);
            try {
                f0.e(d0, object0, s, z);
            }
            catch(Exception exception0) {
                this.m("InternalListener exception in onRequestStart", exception0);
            }
        }
    }

    @Override  // com.facebook.imagepipeline.producers.m0
    public boolean f(String s) {
        int v = this.a.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((f)this.a.get(v1)).f(s)) {
                return true;
            }
        }
        return false;
    }

    @Override  // com.facebook.imagepipeline.producers.m0
    public void g(String s, String s1, @h Map map0) {
        int v = this.a.size();
        for(int v1 = 0; v1 < v; ++v1) {
            f f0 = (f)this.a.get(v1);
            try {
                f0.g(s, s1, map0);
            }
            catch(Exception exception0) {
                this.m("InternalListener exception in onProducerFinishWithSuccess", exception0);
            }
        }
    }

    @Override  // com.facebook.imagepipeline.producers.m0
    public void h(String s, String s1, @h Map map0) {
        int v = this.a.size();
        for(int v1 = 0; v1 < v; ++v1) {
            f f0 = (f)this.a.get(v1);
            try {
                f0.h(s, s1, map0);
            }
            catch(Exception exception0) {
                this.m("InternalListener exception in onProducerFinishWithCancellation", exception0);
            }
        }
    }

    @Override  // com.facebook.imagepipeline.producers.m0
    public void i(String s, String s1, boolean z) {
        int v = this.a.size();
        for(int v1 = 0; v1 < v; ++v1) {
            f f0 = (f)this.a.get(v1);
            try {
                f0.i(s, s1, z);
            }
            catch(Exception exception0) {
                this.m("InternalListener exception in onProducerFinishWithSuccess", exception0);
            }
        }
    }

    @Override  // f1.f
    public void j(com.facebook.imagepipeline.request.d d0, String s, Throwable throwable0, boolean z) {
        int v = this.a.size();
        for(int v1 = 0; v1 < v; ++v1) {
            f f0 = (f)this.a.get(v1);
            try {
                f0.j(d0, s, throwable0, z);
            }
            catch(Exception exception0) {
                this.m("InternalListener exception in onRequestFailure", exception0);
            }
        }
    }

    @Override  // f1.f
    public void k(String s) {
        int v = this.a.size();
        for(int v1 = 0; v1 < v; ++v1) {
            f f0 = (f)this.a.get(v1);
            try {
                f0.k(s);
            }
            catch(Exception exception0) {
                this.m("InternalListener exception in onRequestCancellation", exception0);
            }
        }
    }

    public void l(f f0) {
        this.a.add(f0);
    }

    private void m(String s, Throwable throwable0) {
        x0.a.v("ForwardingRequestListener", s, throwable0);
    }
}

