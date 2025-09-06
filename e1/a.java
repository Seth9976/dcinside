package E1;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.b})
public class a implements View.OnTouchListener {
    @NonNull
    private final Dialog a;
    private final int b;
    private final int c;
    private final int d;

    public a(@NonNull Dialog dialog0, @NonNull Rect rect0) {
        this.a = dialog0;
        this.b = rect0.left;
        this.c = rect0.top;
        this.d = ViewConfiguration.get(dialog0.getContext()).getScaledWindowTouchSlop();
    }

    @Override  // android.view.View$OnTouchListener
    public boolean onTouch(@NonNull View view0, @NonNull MotionEvent motionEvent0) {
        View view1 = view0.findViewById(0x1020002);
        int v = view1.getLeft();
        int v1 = this.b + v;
        int v2 = view1.getWidth();
        int v3 = view1.getTop();
        int v4 = this.c + v3;
        if(new RectF(((float)v1), ((float)v4), ((float)(v2 + v1)), ((float)(view1.getHeight() + v4))).contains(motionEvent0.getX(), motionEvent0.getY())) {
            return false;
        }
        MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
        if(motionEvent0.getAction() == 1) {
            motionEvent1.setAction(4);
        }
        if(Build.VERSION.SDK_INT < 28) {
            motionEvent1.setAction(0);
            motionEvent1.setLocation(((float)(-this.d - 1)), ((float)(-this.d - 1)));
        }
        view0.performClick();
        return this.a.onTouchEvent(motionEvent1);
    }
}

