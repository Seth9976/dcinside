package com.facebook.common.activitylistener;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import java.lang.ref.WeakReference;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class b {
    static class com.facebook.common.activitylistener.b.a extends c {
        private final WeakReference c;

        public com.facebook.common.activitylistener.b.a(com.facebook.common.activitylistener.a a0) {
            this.c = new WeakReference(a0);
        }

        @Override  // com.facebook.common.activitylistener.c
        public void b(Activity activity0) {
            com.facebook.common.activitylistener.a a0 = this.h(activity0);
            if(a0 != null) {
                a0.b(activity0);
            }
        }

        @Override  // com.facebook.common.activitylistener.c
        public void c(Activity activity0) {
            com.facebook.common.activitylistener.a a0 = this.h(activity0);
            if(a0 != null) {
                a0.c(activity0);
            }
        }

        @Override  // com.facebook.common.activitylistener.c
        public void d(Activity activity0) {
            com.facebook.common.activitylistener.a a0 = this.h(activity0);
            if(a0 != null) {
                a0.d(activity0);
            }
        }

        @Override  // com.facebook.common.activitylistener.c
        public void e(Activity activity0) {
            com.facebook.common.activitylistener.a a0 = this.h(activity0);
            if(a0 != null) {
                a0.e(activity0);
            }
        }

        @Override  // com.facebook.common.activitylistener.c
        public void f(Activity activity0) {
            com.facebook.common.activitylistener.a a0 = this.h(activity0);
            if(a0 != null) {
                a0.f(activity0);
            }
        }

        @Override  // com.facebook.common.activitylistener.c
        public void g(Activity activity0) {
            com.facebook.common.activitylistener.a a0 = this.h(activity0);
            if(a0 != null) {
                a0.g(activity0);
            }
        }

        @h
        private com.facebook.common.activitylistener.a h(Activity activity0) {
            com.facebook.common.activitylistener.a a0 = (com.facebook.common.activitylistener.a)this.c.get();
            if(a0 == null) {
                com.facebook.common.internal.n.d(Boolean.valueOf(activity0 instanceof d));
                ((d)activity0).b(this);
            }
            return a0;
        }
    }

    @h
    public static d a(Context context0) {
        if(!(context0 instanceof d) && context0 instanceof ContextWrapper) {
            context0 = ((ContextWrapper)context0).getBaseContext();
        }
        return context0 instanceof d ? ((d)context0) : null;
    }

    public static void b(com.facebook.common.activitylistener.a a0, Context context0) {
        d d0 = b.a(context0);
        if(d0 != null) {
            d0.a(new com.facebook.common.activitylistener.b.a(a0));
        }
    }
}

