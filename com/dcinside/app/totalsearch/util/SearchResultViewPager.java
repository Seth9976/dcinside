package com.dcinside.app.totalsearch.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class SearchResultViewPager extends ViewPager {
    public SearchResultViewPager(Context context0) {
        super(context0);
    }

    public SearchResultViewPager(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    @Override  // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        return super.onInterceptTouchEvent(motionEvent0);
    }

    public void setScrollEnable(boolean z) {
        this.requestDisallowInterceptTouchEvent(!z);
    }
}

