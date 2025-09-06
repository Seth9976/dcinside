package com.facebook.drawee.controller;

import S0.c;
import S0.q;
import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import o3.h;
import p3.d;

@d
public class f implements q, com.facebook.drawee.controller.d {
    private final List a;
    private static final String b = "FdingControllerListener";

    public f() {
        this.a = new ArrayList(2);
    }

    @Override  // com.facebook.drawee.controller.d
    public void a(String s, @h Object object0) {
        int v = this.a.size();
        for(int v1 = 0; v1 < v; ++v1) {
            try {
                com.facebook.drawee.controller.d d0 = (com.facebook.drawee.controller.d)this.a.get(v1);
                if(d0 != null) {
                    d0.a(s, object0);
                }
            }
            catch(Exception exception0) {
                this.m("InternalListener exception in onIntermediateImageSet", exception0);
            }
        }
    }

    @Override  // com.facebook.drawee.controller.d
    public void b(String s) {
        synchronized(this) {
            int v1 = this.a.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                try {
                    com.facebook.drawee.controller.d d0 = (com.facebook.drawee.controller.d)this.a.get(v2);
                    if(d0 != null) {
                        d0.b(s);
                    }
                }
                catch(Exception exception0) {
                    this.m("InternalListener exception in onRelease", exception0);
                }
            }
        }
    }

    @Override  // com.facebook.drawee.controller.d
    public void c(String s, Object object0) {
        synchronized(this) {
            int v1 = this.a.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                try {
                    com.facebook.drawee.controller.d d0 = (com.facebook.drawee.controller.d)this.a.get(v2);
                    if(d0 != null) {
                        d0.c(s, object0);
                    }
                }
                catch(Exception exception0) {
                    this.m("InternalListener exception in onSubmit", exception0);
                }
            }
        }
    }

    @Override  // com.facebook.drawee.controller.d
    public void d(String s, Throwable throwable0) {
        synchronized(this) {
            int v1 = this.a.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                try {
                    com.facebook.drawee.controller.d d0 = (com.facebook.drawee.controller.d)this.a.get(v2);
                    if(d0 != null) {
                        d0.d(s, throwable0);
                    }
                }
                catch(Exception exception0) {
                    this.m("InternalListener exception in onFailure", exception0);
                }
            }
        }
    }

    @Override  // com.facebook.drawee.controller.d
    public void e(String s, @h Object object0, @h Animatable animatable0) {
        synchronized(this) {
            int v1 = this.a.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                try {
                    com.facebook.drawee.controller.d d0 = (com.facebook.drawee.controller.d)this.a.get(v2);
                    if(d0 != null) {
                        d0.e(s, object0, animatable0);
                    }
                }
                catch(Exception exception0) {
                    this.m("InternalListener exception in onFinalImageSet", exception0);
                }
            }
        }
    }

    @Override  // com.facebook.drawee.controller.d
    public void f(String s, Throwable throwable0) {
        int v = this.a.size();
        for(int v1 = 0; v1 < v; ++v1) {
            try {
                com.facebook.drawee.controller.d d0 = (com.facebook.drawee.controller.d)this.a.get(v1);
                if(d0 != null) {
                    d0.f(s, throwable0);
                }
            }
            catch(Exception exception0) {
                this.m("InternalListener exception in onIntermediateImageFailed", exception0);
            }
        }
    }

    public void g(com.facebook.drawee.controller.d d0) {
        synchronized(this) {
            this.a.add(d0);
        }
    }

    public void h() {
        synchronized(this) {
            this.a.clear();
        }
    }

    public static f i() {
        return new f();
    }

    @Override  // S0.q
    public void j(String s, Object object0, c c0) {
        int v = this.a.size();
        for(int v1 = 0; v1 < v; ++v1) {
            try {
                com.facebook.drawee.controller.d d0 = (com.facebook.drawee.controller.d)this.a.get(v1);
                if(d0 instanceof q) {
                    ((q)d0).j(s, object0, c0);
                }
            }
            catch(Exception exception0) {
                this.m("InternalListener exception in onImageDrawn", exception0);
            }
        }
    }

    public static f k(com.facebook.drawee.controller.d d0) {
        f f0 = f.i();
        f0.g(d0);
        return f0;
    }

    public static f l(com.facebook.drawee.controller.d d0, com.facebook.drawee.controller.d d1) {
        f f0 = f.i();
        f0.g(d0);
        f0.g(d1);
        return f0;
    }

    private void m(String s, Throwable throwable0) {
        synchronized(this) {
            Log.e("FdingControllerListener", s, throwable0);
        }
    }

    public void n(com.facebook.drawee.controller.d d0) {
        synchronized(this) {
            int v1 = this.a.indexOf(d0);
            if(v1 != -1) {
                this.a.set(v1, null);
            }
        }
    }
}

