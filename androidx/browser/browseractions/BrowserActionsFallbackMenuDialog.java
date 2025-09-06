package androidx.browser.browseractions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

@Deprecated
class BrowserActionsFallbackMenuDialog extends Dialog {
    private final View a;
    private static final long b = 0xFAL;
    private static final long c = 150L;

    BrowserActionsFallbackMenuDialog(Context context0, View view0) {
        super(context0);
        this.a = view0;
    }

    private void b(boolean z) {
        this.a.setScaleX((z ? 0.0f : 1.0f));
        this.a.setScaleY((z ? 0.0f : 1.0f));
        this.a.animate().scaleX((z ? 1.0f : 0.0f)).scaleY((z ? 1.0f : 0.0f)).setDuration((z ? 0xFAL : 150L)).setInterpolator(new LinearOutSlowInInterpolator()).setListener(new AnimatorListenerAdapter() {
            final BrowserActionsFallbackMenuDialog b;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                if(!z) {
                    BrowserActionsFallbackMenuDialog.this.super.dismiss();
                }
            }
        }).start();
    }

    @Override  // android.app.Dialog
    public void dismiss() {
        this.b(false);
    }

    @Override  // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        if(motionEvent0.getAction() == 0) {
            this.dismiss();
            return true;
        }
        return false;
    }

    @Override  // android.app.Dialog
    public void show() {
        this.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.b(true);
        super.show();
    }
}

