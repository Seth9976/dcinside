package com.fsn.cauly.Y;

import android.app.Dialog;
import android.content.Context;
import java.lang.ref.WeakReference;

public class b0 extends Dialog {
    public interface a {
        void a(Dialog arg1);
    }

    WeakReference a;

    public b0(Context context0, int v) {
        super(context0, v);
    }

    public void a(a b0$a0) {
        this.a = new WeakReference(b0$a0);
    }

    @Override  // android.app.Dialog
    public void onDetachedFromWindow() {
        WeakReference weakReference0 = this.a;
        if(weakReference0 != null) {
            a b0$a0 = (a)weakReference0.get();
            if(b0$a0 != null) {
                b0$a0.a(this);
            }
        }
        super.onDetachedFromWindow();
    }
}

