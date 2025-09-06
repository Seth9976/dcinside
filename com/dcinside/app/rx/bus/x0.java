package com.dcinside.app.rx.bus;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
import android.view.ViewTreeObserver;
import com.dcinside.app.base.i;
import com.dcinside.app.util.Al;
import java.lang.ref.WeakReference;
import y4.l;
import y4.m;

public final class x0 implements ViewTreeObserver.OnGlobalFocusChangeListener, i {
    @l
    private final WeakReference a;

    public x0(@m View view0) {
        this.a = new WeakReference(view0);
        if(view0 != null) {
            ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
            if(viewTreeObserver0 != null) {
                viewTreeObserver0.addOnGlobalFocusChangeListener(this);
            }
        }
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(@m View view0, @m View view1) {
        Context context0;
        if(view1 == null) {
        label_3:
            View view2 = (View)this.a.get();
            context0 = view2 == null ? null : view2.getContext();
            if(context0 == null) {
                return;
            }
        }
        else {
            context0 = view1.getContext();
            if(context0 == null) {
                goto label_3;
            }
        }
        Context context1 = Al.h(context0);
        if(context1 != null) {
            c.a(context1, new s((view1 == null ? 0 : view1.getId())));
        }
    }

    @Override  // com.dcinside.app.base.i
    public void release() {
        View view0 = (View)this.a.get();
        if(view0 == null) {
            return;
        }
        view0.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }
}

