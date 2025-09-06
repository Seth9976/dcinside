package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ShowableListMenu;

@RestrictTo({Scope.c})
public abstract class ForwardingListener implements View.OnAttachStateChangeListener, View.OnTouchListener {
    class DisallowIntercept implements Runnable {
        final ForwardingListener a;

        @Override
        public void run() {
            ViewParent viewParent0 = ForwardingListener.this.d.getParent();
            if(viewParent0 != null) {
                viewParent0.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    class TriggerLongPress implements Runnable {
        final ForwardingListener a;

        @Override
        public void run() {
            ForwardingListener.this.e();
        }
    }

    private final float a;
    private final int b;
    private final int c;
    final View d;
    private Runnable e;
    private Runnable f;
    private boolean g;
    private int h;
    private final int[] i;

    public ForwardingListener(View view0) {
        this.i = new int[2];
        this.d = view0;
        view0.setLongClickable(true);
        view0.addOnAttachStateChangeListener(this);
        this.a = (float)ViewConfiguration.get(view0.getContext()).getScaledTouchSlop();
        this.b = 100;
        this.c = (ViewConfiguration.getLongPressTimeout() + 100) / 2;
    }

    private void a() {
        Runnable runnable0 = this.f;
        if(runnable0 != null) {
            this.d.removeCallbacks(runnable0);
        }
        Runnable runnable1 = this.e;
        if(runnable1 != null) {
            this.d.removeCallbacks(runnable1);
        }
    }

    public abstract ShowableListMenu b();

    protected boolean c() {
        ShowableListMenu showableListMenu0 = this.b();
        if(showableListMenu0 != null && !showableListMenu0.b()) {
            showableListMenu0.show();
        }
        return true;
    }

    protected boolean d() {
        ShowableListMenu showableListMenu0 = this.b();
        if(showableListMenu0 != null && showableListMenu0.b()) {
            showableListMenu0.dismiss();
        }
        return true;
    }

    // 检测为 Lambda 实现
    void e() [...]

    private boolean f(MotionEvent motionEvent0) {
        View view0 = this.d;
        ShowableListMenu showableListMenu0 = this.b();
        if(showableListMenu0 != null && showableListMenu0.b()) {
            DropDownListView dropDownListView0 = (DropDownListView)showableListMenu0.j();
            if(dropDownListView0 != null && dropDownListView0.isShown()) {
                MotionEvent motionEvent1 = MotionEvent.obtainNoHistory(motionEvent0);
                this.i(view0, motionEvent1);
                this.j(dropDownListView0, motionEvent1);
                boolean z = dropDownListView0.f(motionEvent1, this.h);
                motionEvent1.recycle();
                switch(motionEvent0.getActionMasked()) {
                    case 1: 
                    case 3: {
                        return false;
                    }
                    default: {
                        return z;
                    }
                }
            }
        }
        return false;
    }

    private boolean g(MotionEvent motionEvent0) {
        View view0 = this.d;
        if(!view0.isEnabled()) {
            return false;
        }
        switch(motionEvent0.getActionMasked()) {
            case 0: {
                this.h = motionEvent0.getPointerId(0);
                if(this.e == null) {
                    this.e = new DisallowIntercept(this);
                }
                view0.postDelayed(this.e, ((long)this.b));
                if(this.f == null) {
                    this.f = () -> {
                        ForwardingListener.this.a();
                        View view0 = ForwardingListener.this.d;
                        if(!view0.isEnabled() || view0.isLongClickable() || !ForwardingListener.this.c()) {
                            return;
                        }
                        view0.getParent().requestDisallowInterceptTouchEvent(true);
                        long v = SystemClock.uptimeMillis();
                        MotionEvent motionEvent0 = MotionEvent.obtain(v, v, 3, 0.0f, 0.0f, 0);
                        view0.onTouchEvent(motionEvent0);
                        motionEvent0.recycle();
                        ForwardingListener.this.g = true;
                    };
                }
                view0.postDelayed(this.f, ((long)this.c));
                return false;
            }
            case 2: {
                int v = motionEvent0.findPointerIndex(this.h);
                if(v >= 0 && !ForwardingListener.h(view0, motionEvent0.getX(v), motionEvent0.getY(v), this.a)) {
                    this.a();
                    view0.getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                return false;
            }
            case 1: 
            case 3: {
                this.a();
                return false;
            }
            default: {
                return false;
            }
        }
    }

    private static boolean h(View view0, float f, float f1, float f2) {
        return f >= -f2 && f1 >= -f2 && f < ((float)(view0.getRight() - view0.getLeft())) + f2 && f1 < ((float)(view0.getBottom() - view0.getTop())) + f2;
    }

    private boolean i(View view0, MotionEvent motionEvent0) {
        view0.getLocationOnScreen(this.i);
        motionEvent0.offsetLocation(((float)this.i[0]), ((float)this.i[1]));
        return true;
    }

    private boolean j(View view0, MotionEvent motionEvent0) {
        view0.getLocationOnScreen(this.i);
        motionEvent0.offsetLocation(((float)(-this.i[0])), ((float)(-this.i[1])));
        return true;
    }

    @Override  // android.view.View$OnTouchListener
    public boolean onTouch(View view0, MotionEvent motionEvent0) {
        boolean z1;
        boolean z = this.g;
        if(!z) {
            z1 = this.g(motionEvent0) && this.c();
            if(z1) {
                long v = SystemClock.uptimeMillis();
                MotionEvent motionEvent1 = MotionEvent.obtain(v, v, 3, 0.0f, 0.0f, 0);
                this.d.onTouchEvent(motionEvent1);
                motionEvent1.recycle();
            }
        }
        else if(!this.f(motionEvent0) && this.d()) {
            z1 = false;
        }
        else {
            z1 = true;
        }
        this.g = z1;
        return z1 || z;
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view0) {
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view0) {
        this.g = false;
        this.h = -1;
        Runnable runnable0 = this.e;
        if(runnable0 != null) {
            this.d.removeCallbacks(runnable0);
        }
    }
}

