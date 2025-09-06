package androidx.core.view;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

public final class u implements View.OnTouchListener {
    public final DragStartHelper a;

    public u(DragStartHelper dragStartHelper0) {
        this.a = dragStartHelper0;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        return this.a.e(view0, motionEvent0);
    }
}

