package fr.castorflex.android.smoothprogressbar;

import android.content.Context;
import android.util.AttributeSet;

public class ContentLoadingSmoothProgressBar extends SmoothProgressBar {
    private static final int MIN_DELAY = 500;
    private static final int MIN_SHOW_TIME = 500;
    private final Runnable mDelayedHide;
    private final Runnable mDelayedShow;
    private boolean mDismissed;
    private boolean mPostedHide;
    private boolean mPostedShow;
    private long mStartTime;

    public ContentLoadingSmoothProgressBar(Context context0) {
        this(context0, null);
    }

    public ContentLoadingSmoothProgressBar(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0, 0);
        this.mStartTime = -1L;
        this.mPostedHide = false;
        this.mPostedShow = false;
        this.mDismissed = false;
        this.mDelayedHide = new Runnable() {
            @Override
            public void run() {
                ContentLoadingSmoothProgressBar.this.mPostedHide = false;
                ContentLoadingSmoothProgressBar.this.mStartTime = -1L;
                ContentLoadingSmoothProgressBar.this.setVisibility(8);
            }
        };
        this.mDelayedShow = new Runnable() {
            @Override
            public void run() {
                ContentLoadingSmoothProgressBar.this.mPostedShow = false;
                if(!ContentLoadingSmoothProgressBar.this.mDismissed) {
                    ContentLoadingSmoothProgressBar.this.mStartTime = System.currentTimeMillis();
                    ContentLoadingSmoothProgressBar.this.setVisibility(0);
                }
            }
        };
    }

    public void hide() {
        this.mDismissed = true;
        this.removeCallbacks(this.mDelayedShow);
        long v = System.currentTimeMillis() - this.mStartTime;
        if(v >= 500L || this.mStartTime == -1L) {
            this.setVisibility(8);
        }
        else if(!this.mPostedHide) {
            this.postDelayed(this.mDelayedHide, 500L - v);
            this.mPostedHide = true;
        }
    }

    @Override  // android.widget.ProgressBar
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.removeCallbacks();
    }

    @Override  // android.widget.ProgressBar
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.removeCallbacks();
    }

    private void removeCallbacks() {
        this.removeCallbacks(this.mDelayedHide);
        this.removeCallbacks(this.mDelayedShow);
    }

    public void show() {
        this.mStartTime = -1L;
        this.mDismissed = false;
        this.removeCallbacks(this.mDelayedHide);
        if(!this.mPostedShow) {
            this.postDelayed(this.mDelayedShow, 500L);
            this.mPostedShow = true;
        }
    }
}

