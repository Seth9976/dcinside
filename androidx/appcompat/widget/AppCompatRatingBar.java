package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R.attr;

public class AppCompatRatingBar extends RatingBar {
    private final AppCompatProgressBarHelper a;

    public AppCompatRatingBar(@NonNull Context context0) {
        this(context0, null);
    }

    public AppCompatRatingBar(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.ratingBarStyle);
    }

    public AppCompatRatingBar(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        ThemeUtils.a(this, this.getContext());
        AppCompatProgressBarHelper appCompatProgressBarHelper0 = new AppCompatProgressBarHelper(this);
        this.a = appCompatProgressBarHelper0;
        appCompatProgressBarHelper0.c(attributeSet0, v);
    }

    @Override  // android.widget.RatingBar
    protected void onMeasure(int v, int v1) {
        synchronized(this) {
            super.onMeasure(v, v1);
            Bitmap bitmap0 = this.a.b();
            if(bitmap0 != null) {
                this.setMeasuredDimension(View.resolveSizeAndState(bitmap0.getWidth() * this.getNumStars(), v, 0), this.getMeasuredHeight());
            }
        }
    }
}

