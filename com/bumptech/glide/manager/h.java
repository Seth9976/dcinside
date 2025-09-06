package com.bumptech.glide.manager;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver.OnDrawListener;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.resource.bitmap.D;
import com.bumptech.glide.util.o;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

@RequiresApi(26)
final class h implements i {
    final Set a;
    volatile boolean b;

    h() {
        this.a = Collections.newSetFromMap(new WeakHashMap());
    }

    @Override  // com.bumptech.glide.manager.i
    public void a(Activity activity0) {
        class a implements ViewTreeObserver.OnDrawListener {
            final View a;
            final h b;

            a(View view0) {
                this.a = view0;
                super();
            }

            @Override  // android.view.ViewTreeObserver$OnDrawListener
            public void onDraw() {
                class com.bumptech.glide.manager.h.a.a implements Runnable {
                    final ViewTreeObserver.OnDrawListener a;
                    final a b;

                    com.bumptech.glide.manager.h.a.a(ViewTreeObserver.OnDrawListener viewTreeObserver$OnDrawListener0) {
                        this.a = viewTreeObserver$OnDrawListener0;
                        super();
                    }

                    @Override
                    public void run() {
                        D.c().i();
                        h.this.b = true;
                        h.b(a.this.a, this.a);
                        h.this.a.clear();
                    }
                }

                o.y(new com.bumptech.glide.manager.h.a.a(this, this));
            }
        }

        if(this.b) {
            return;
        }
        if(!this.a.add(activity0)) {
            return;
        }
        View view0 = activity0.getWindow().getDecorView();
        view0.getViewTreeObserver().addOnDrawListener(new a(this, view0));
    }

    static void b(View view0, ViewTreeObserver.OnDrawListener viewTreeObserver$OnDrawListener0) {
        view0.getViewTreeObserver().removeOnDrawListener(viewTreeObserver$OnDrawListener0);
    }
}

