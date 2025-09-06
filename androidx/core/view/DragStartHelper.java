package androidx.core.view;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.View;

public class DragStartHelper {
    public interface OnDragStartListener {
        boolean a(View arg1, DragStartHelper arg2);
    }

    private final View a;
    private final OnDragStartListener b;
    private int c;
    private int d;
    private boolean e;
    private final View.OnLongClickListener f;
    private final View.OnTouchListener g;

    public DragStartHelper(View view0, OnDragStartListener dragStartHelper$OnDragStartListener0) {
        this.f = (View view0) -> {
            if(this.e) {
                return true;
            }
            boolean z = this.b.a(view0, this);
            this.e = z;
            return z;
        };
        this.g = (View view0, MotionEvent motionEvent0) -> {
            int v = (int)motionEvent0.getX();
            int v1 = (int)motionEvent0.getY();
            switch(motionEvent0.getAction()) {
                case 0: {
                    this.c = v;
                    this.d = v1;
                    return false;
                }
                case 2: {
                    if(MotionEventCompat.l(motionEvent0, 0x2002) && (motionEvent0.getButtonState() & 1) != 0 && !this.e && (this.c != v || this.d != v1)) {
                        this.c = v;
                        this.d = v1;
                        boolean z = this.b.a(view0, this);
                        this.e = z;
                        return z;
                    }
                    return false;
                }
                case 1: 
                case 3: {
                    this.e = false;
                    return false;
                }
                default: {
                    return false;
                }
            }
        };
        this.a = view0;
        this.b = dragStartHelper$OnDragStartListener0;
    }

    public void a() {
        this.a.setOnLongClickListener(this.f);
        this.a.setOnTouchListener(this.g);
    }

    public void b() {
        this.a.setOnLongClickListener(null);
        this.a.setOnTouchListener(null);
    }

    public void c(Point point0) {
        point0.set(this.c, this.d);
    }

    // 检测为 Lambda 实现
    public boolean d(View view0) [...]

    // 检测为 Lambda 实现
    public boolean e(View view0, MotionEvent motionEvent0) [...]
}

