package com.dcinside.app.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class TouchyRecyclerView extends RecyclerView implements GestureDetector.OnGestureListener {
    public interface a {
        void a();
    }

    private a a;
    private GestureDetector b;

    public TouchyRecyclerView(Context context0) {
        super(context0);
        this.b = new GestureDetector(context0, this);
    }

    public TouchyRecyclerView(Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.b = new GestureDetector(context0, this);
    }

    public TouchyRecyclerView(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.b = new GestureDetector(context0, this);
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchTouchEvent(MotionEvent motionEvent0) {
        this.b.onTouchEvent(motionEvent0);
        return super.dispatchTouchEvent(motionEvent0);
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public boolean onDown(MotionEvent motionEvent0) {
        return false;
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public boolean onFling(MotionEvent motionEvent0, MotionEvent motionEvent1, float f, float f1) {
        return false;
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public void onLongPress(MotionEvent motionEvent0) {
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public boolean onScroll(MotionEvent motionEvent0, MotionEvent motionEvent1, float f, float f1) {
        return false;
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public void onShowPress(MotionEvent motionEvent0) {
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent0) {
        if(this.a != null && this.findChildViewUnder(motionEvent0.getX(), motionEvent0.getY()) == null) {
            this.a.a();
        }
        return false;
    }

    public void setOnNoChildClickListener(a touchyRecyclerView$a0) {
        this.a = touchyRecyclerView$a0;
    }
}

