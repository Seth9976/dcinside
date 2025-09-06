package com.dcinside.app.bookmark;

import android.content.Context;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.SimpleOnItemTouchListener;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.util.ql.b.f;

public final class y extends SimpleOnItemTouchListener {
    private final f a;
    private final f b;
    private final GestureDetector c;
    private final int d;

    public y(Context context0, f ql$b$f0, f ql$b$f1) {
        class a extends GestureDetector.SimpleOnGestureListener {
            @Override  // android.view.GestureDetector$SimpleOnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent0) {
                return true;
            }
        }

        this.d = 0;
        this.a = ql$b$f0;
        this.b = ql$b$f1;
        this.c = new GestureDetector(context0, new a(this));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$SimpleOnItemTouchListener
    public boolean i(@NonNull RecyclerView recyclerView0, @NonNull MotionEvent motionEvent0) {
        if(this.c.onTouchEvent(motionEvent0)) {
            float f = motionEvent0.getX();
            float f1 = motionEvent0.getY();
            View view0 = recyclerView0.findChildViewUnder(f, f1);
            if(view0 instanceof ViewGroup) {
                int v = ((ViewGroup)view0).getChildCount();
                for(int v1 = 0; v1 < v; ++v1) {
                    View view1 = ((ViewGroup)view0).getChildAt(v1);
                    if(view1.isEnabled() && ((float)view1.getTop()) <= f1 && f1 <= ((float)view1.getBottom())) {
                        Object object0 = view1.getTag(0x7F0B0999);  // id:paging_menu_real_position
                        if(object0 instanceof Integer) {
                            int v2 = (int)(((Integer)object0));
                            if(v2 >= 0) {
                                if(((float)(view1.getWidth() - this.d)) > f) {
                                    f ql$b$f0 = this.a;
                                    if(ql$b$f0 != null) {
                                        ql$b$f0.a(view1, v2);
                                        return false;
                                    }
                                }
                                else {
                                    f ql$b$f1 = this.b;
                                    if(ql$b$f1 != null) {
                                        ql$b$f1.a(view1, v2);
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}

