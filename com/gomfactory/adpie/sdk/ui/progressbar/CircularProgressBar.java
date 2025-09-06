package com.gomfactory.adpie.sdk.ui.progressbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;

public final class CircularProgressBar extends View {
    public static enum GradientDirection {
        LEFT_TO_RIGHT(1),
        RIGHT_TO_LEFT(2),
        TOP_TO_BOTTOM(3),
        BOTTOM_TO_END(4);

        private final int value;

        private GradientDirection(int v1) {
            this.value = v1;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public static enum ProgressDirection {
        TO_RIGHT(1),
        TO_LEFT(2);

        private final int value;

        private ProgressDirection(int v1) {
            this.value = v1;
        }

        public final int getValue() {
            return this.value;
        }
    }

    private static final long DEFAULT_ANIMATION_DURATION = 1500L;
    private static final float DEFAULT_MAX_VALUE = 100.0f;
    private static final float DEFAULT_START_ANGLE = 270.0f;
    private Paint backgroundPaint;
    private int backgroundProgressBarColor;
    private GradientDirection backgroundProgressBarColorDirection;
    private Integer backgroundProgressBarColorEnd;
    private Integer backgroundProgressBarColorStart;
    private float backgroundProgressBarWidth;
    private Paint foregroundPaint;
    private boolean indeterminateMode;
    private Handler indeterminateModeHandler;
    private final Runnable indeterminateModeRunnable;
    private float progress;
    private ValueAnimator progressAnimator;
    private int progressBarColor;
    private GradientDirection progressBarColorDirection;
    private Integer progressBarColorEnd;
    private Integer progressBarColorStart;
    private float progressBarWidth;
    private ProgressDirection progressDirection;
    private ProgressDirection progressDirectionIndeterminateMode;
    private float progressIndeterminateMode;
    private float progressMax;
    private RectF rectF;
    private boolean roundBorder;
    private float startAngle;
    private float startAngleIndeterminateMode;

    public CircularProgressBar(Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.rectF = new RectF();
        Paint paint0 = new Paint();
        paint0.setAntiAlias(true);
        Paint.Style paint$Style0 = Paint.Style.STROKE;
        paint0.setStyle(paint$Style0);
        this.backgroundPaint = paint0;
        Paint paint1 = new Paint();
        paint1.setAntiAlias(true);
        paint1.setStyle(paint$Style0);
        this.foregroundPaint = paint1;
        this.progressMax = 100.0f;
        this.progressBarColor = 0xFF000000;
        this.progressBarColorDirection = GradientDirection.LEFT_TO_RIGHT;
        this.backgroundProgressBarColor = 0xFF888888;
        this.backgroundProgressBarColorDirection = GradientDirection.LEFT_TO_RIGHT;
        this.startAngle = 270.0f;
        this.progressDirection = ProgressDirection.TO_RIGHT;
        this.progressDirectionIndeterminateMode = ProgressDirection.TO_RIGHT;
        this.startAngleIndeterminateMode = 270.0f;
        this.indeterminateModeRunnable = new Runnable() {
            @Override
            public final void run() {
                if(CircularProgressBar.this.getIndeterminateMode()) {
                    CircularProgressBar.this.postIndeterminateModeHandler();
                    ProgressDirection circularProgressBar$ProgressDirection0 = CircularProgressBar.this.reverse(CircularProgressBar.this.progressDirectionIndeterminateMode);
                    CircularProgressBar.this.setProgressDirectionIndeterminateMode(circularProgressBar$ProgressDirection0);
                    if(CircularProgressBar.this.isToRight(CircularProgressBar.this.progressDirectionIndeterminateMode)) {
                        CircularProgressBar.setProgressWithAnimation$default(CircularProgressBar.this, 0.0f, 1500L, null, null, 12, null);
                        return;
                    }
                    CircularProgressBar.setProgressWithAnimation$default(CircularProgressBar.this, CircularProgressBar.this.getProgressMax(), 1500L, null, null, 12, null);
                }
            }
        };
    }

    private LinearGradient createLinearGradient(int v, int v1, GradientDirection circularProgressBar$GradientDirection0) {
        switch(circularProgressBar$GradientDirection0) {
            case 1: {
                return new LinearGradient(0.0f, 0.0f, ((float)this.getWidth()), 0.0f, v, v1, Shader.TileMode.CLAMP);
            }
            case 2: {
                return new LinearGradient(((float)this.getWidth()), 0.0f, 0.0f, 0.0f, v, v1, Shader.TileMode.CLAMP);
            }
            case 3: {
                return new LinearGradient(0.0f, 0.0f, 0.0f, ((float)this.getHeight()), v, v1, Shader.TileMode.CLAMP);
            }
            case 4: {
                return new LinearGradient(0.0f, ((float)this.getHeight()), 0.0f, 0.0f, v, v1, Shader.TileMode.CLAMP);
            }
            default: {
                return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, v, v1, Shader.TileMode.CLAMP);
            }
        }
    }

    private float dpToPx(float f) {
        return f * Resources.getSystem().getDisplayMetrics().density;
    }

    public int getBackgroundProgressBarColor() {
        return this.backgroundProgressBarColor;
    }

    public GradientDirection getBackgroundProgressBarColorDirection() {
        return this.backgroundProgressBarColorDirection;
    }

    public Integer getBackgroundProgressBarColorEnd() {
        return this.backgroundProgressBarColorEnd;
    }

    public Integer getBackgroundProgressBarColorStart() {
        return this.backgroundProgressBarColorStart;
    }

    public float getBackgroundProgressBarWidth() {
        return this.backgroundProgressBarWidth;
    }

    public boolean getIndeterminateMode() {
        return this.indeterminateMode;
    }

    public float getProgress() {
        return this.progress;
    }

    public int getProgressBarColor() {
        return this.progressBarColor;
    }

    public GradientDirection getProgressBarColorDirection() {
        return this.progressBarColorDirection;
    }

    public Integer getProgressBarColorEnd() {
        return this.progressBarColorEnd;
    }

    @Nullable
    public Integer getProgressBarColorStart() {
        return this.progressBarColorStart;
    }

    public float getProgressBarWidth() {
        return this.progressBarWidth;
    }

    public ProgressDirection getProgressDirection() {
        return this.progressDirection;
    }

    public float getProgressMax() {
        return this.progressMax;
    }

    public boolean getRoundBorder() {
        return this.roundBorder;
    }

    public float getStartAngle() {
        return this.startAngle;
    }

    private void init(Context context0, AttributeSet attributeSet0) {
    }

    public boolean isToRight(ProgressDirection circularProgressBar$ProgressDirection0) {
        return circularProgressBar$ProgressDirection0 == ProgressDirection.TO_RIGHT;
    }

    private void manageBackgroundProgressBarColor() {
        this.backgroundPaint.setShader(this.createLinearGradient((this.backgroundProgressBarColorStart == null ? this.backgroundProgressBarColor : ((int)this.backgroundProgressBarColorStart)), (this.backgroundProgressBarColorEnd == null ? this.backgroundProgressBarColor : ((int)this.backgroundProgressBarColorEnd)), this.backgroundProgressBarColorDirection));
    }

    private void manageColor() {
        this.foregroundPaint.setShader(this.createLinearGradient((this.progressBarColorStart == null ? this.progressBarColor : ((int)this.progressBarColorStart)), (this.progressBarColorEnd == null ? this.progressBarColor : ((int)this.progressBarColorEnd)), this.progressBarColorDirection));
    }

    @Override  // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator0 = this.progressAnimator;
        if(valueAnimator0 != null) {
            valueAnimator0.cancel();
        }
        Handler handler0 = this.indeterminateModeHandler;
        if(handler0 != null) {
            handler0.removeCallbacks(this.indeterminateModeRunnable);
        }
    }

    @Override  // android.view.View
    protected void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        canvas0.drawOval(this.rectF, this.backgroundPaint);
        boolean z = this.indeterminateMode;
        float f = (z ? this.progressIndeterminateMode : this.progress) * 100.0f / this.progressMax;
        boolean z1 = false;
        boolean z2 = z && this.isToRight(this.progressDirectionIndeterminateMode);
        if(!this.indeterminateMode && this.isToRight(this.progressDirection)) {
            z1 = true;
        }
        canvas0.drawArc(this.rectF, (this.indeterminateMode ? this.startAngleIndeterminateMode : this.startAngle), ((float)(z2 || z1 ? 360 : -360)) * f / 100.0f, false, this.foregroundPaint);
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        int v2 = View.getDefaultSize(this.getSuggestedMinimumHeight(), v1);
        int v3 = Math.min(View.getDefaultSize(this.getSuggestedMinimumWidth(), v), v2);
        this.setMeasuredDimension(v3, v3);
        float f = this.progressBarWidth;
        float f1 = this.backgroundProgressBarWidth;
        if(f <= f1) {
            f = f1;
        }
        float f2 = 0.0f + f / 2.0f;
        float f3 = ((float)v3) - f / 2.0f;
        this.rectF.set(f2, f2, f3, f3);
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.manageColor();
        this.manageBackgroundProgressBarColor();
        this.invalidate();
    }

    public void postIndeterminateModeHandler() {
        Handler handler0 = this.indeterminateModeHandler;
        if(handler0 != null) {
            handler0.postDelayed(this.indeterminateModeRunnable, 1500L);
        }
    }

    private float pxToDp(float f) {
        return f / Resources.getSystem().getDisplayMetrics().density;
    }

    // 去混淆评级： 低(20)
    public ProgressDirection reverse(ProgressDirection circularProgressBar$ProgressDirection0) {
        return this.isToRight(circularProgressBar$ProgressDirection0) ? ProgressDirection.TO_LEFT : ProgressDirection.TO_RIGHT;
    }

    @Override  // android.view.View
    public void setBackgroundColor(int v) {
        this.setBackgroundProgressBarColor(v);
    }

    public void setBackgroundProgressBarColor(int v) {
        this.backgroundProgressBarColor = v;
        this.manageBackgroundProgressBarColor();
        this.invalidate();
    }

    public void setBackgroundProgressBarColorDirection(GradientDirection circularProgressBar$GradientDirection0) {
        this.backgroundProgressBarColorDirection = circularProgressBar$GradientDirection0;
        this.manageBackgroundProgressBarColor();
        this.invalidate();
    }

    public void setBackgroundProgressBarColorEnd(@Nullable Integer integer0) {
        this.backgroundProgressBarColorEnd = integer0;
        this.manageBackgroundProgressBarColor();
        this.invalidate();
    }

    public void setBackgroundProgressBarColorStart(@Nullable Integer integer0) {
        this.backgroundProgressBarColorStart = integer0;
        this.manageBackgroundProgressBarColor();
        this.invalidate();
    }

    public void setBackgroundProgressBarWidth(float f) {
        float f1 = this.dpToPx(f);
        this.backgroundProgressBarWidth = f1;
        this.backgroundPaint.setStrokeWidth(f1);
        this.requestLayout();
        this.invalidate();
    }

    public void setIndeterminateMode(boolean z) {
        this.indeterminateMode = z;
        this.setProgressIndeterminateMode(0.0f);
        this.setProgressDirectionIndeterminateMode(ProgressDirection.TO_RIGHT);
        this.setStartAngleIndeterminateMode(270.0f);
        Handler handler0 = this.indeterminateModeHandler;
        if(handler0 != null) {
            handler0.removeCallbacks(this.indeterminateModeRunnable);
        }
        ValueAnimator valueAnimator0 = this.progressAnimator;
        if(valueAnimator0 != null) {
            valueAnimator0.cancel();
        }
        Handler handler1 = new Handler();
        this.indeterminateModeHandler = handler1;
        if(this.indeterminateMode) {
            handler1.post(this.indeterminateModeRunnable);
        }
    }

    public void setProgress(float f) {
        float f1 = this.progressMax;
        if(this.progress > f1) {
            f = f1;
        }
        this.progress = f;
        this.invalidate();
    }

    public void setProgressBarColor(int v) {
        this.progressBarColor = v;
        this.manageColor();
        this.invalidate();
    }

    public void setProgressBarColorDirection(GradientDirection circularProgressBar$GradientDirection0) {
        this.progressBarColorDirection = circularProgressBar$GradientDirection0;
        this.manageColor();
        this.invalidate();
    }

    public void setProgressBarColorEnd(Integer integer0) {
        this.progressBarColorEnd = integer0;
        this.manageColor();
        this.invalidate();
    }

    public void setProgressBarColorStart(@Nullable Integer integer0) {
        this.progressBarColorStart = integer0;
        this.manageColor();
        this.invalidate();
    }

    public void setProgressBarWidth(float f) {
        float f1 = this.dpToPx(f);
        this.progressBarWidth = f1;
        this.foregroundPaint.setStrokeWidth(f1);
        this.requestLayout();
        this.invalidate();
    }

    public void setProgressDirection(ProgressDirection circularProgressBar$ProgressDirection0) {
        this.progressDirection = circularProgressBar$ProgressDirection0;
        this.invalidate();
    }

    public void setProgressDirectionIndeterminateMode(ProgressDirection circularProgressBar$ProgressDirection0) {
        this.progressDirectionIndeterminateMode = circularProgressBar$ProgressDirection0;
        this.invalidate();
    }

    public void setProgressIndeterminateMode(float f) {
        this.progressIndeterminateMode = f;
        this.invalidate();
    }

    public void setProgressMax(float f) {
        if(this.progressMax < 0.0f) {
            f = 100.0f;
        }
        this.progressMax = f;
        this.invalidate();
    }

    public void setProgressWithAnimation(float f) {
        CircularProgressBar.setProgressWithAnimation$default(this, f, null, null, null, 14, null);
    }

    public void setProgressWithAnimation(float f, @Nullable Long long0) {
        CircularProgressBar.setProgressWithAnimation$default(this, f, long0, null, null, 12, null);
    }

    public void setProgressWithAnimation(float f, @Nullable Long long0, @Nullable TimeInterpolator timeInterpolator0) {
        CircularProgressBar.setProgressWithAnimation$default(this, f, long0, timeInterpolator0, null, 8, null);
    }

    public void setProgressWithAnimation(float f, @Nullable Long long0, @Nullable TimeInterpolator timeInterpolator0, @Nullable Long long1) {
        ValueAnimator valueAnimator0 = this.progressAnimator;
        if(valueAnimator0 != null) {
            valueAnimator0.cancel();
        }
        this.progressAnimator = ValueAnimator.ofFloat(new float[]{(this.indeterminateMode ? this.progressIndeterminateMode : this.progress), f});
        if(long0 != null) {
            long v = (long)long0;
            ValueAnimator valueAnimator1 = this.progressAnimator;
            if(valueAnimator1 != null) {
                valueAnimator1.setDuration(v);
            }
        }
        if(timeInterpolator0 != null) {
            ValueAnimator valueAnimator2 = this.progressAnimator;
            if(valueAnimator2 != null) {
                valueAnimator2.setInterpolator(timeInterpolator0);
            }
        }
        if(long1 != null) {
            long v1 = (long)long1;
            ValueAnimator valueAnimator3 = this.progressAnimator;
            if(valueAnimator3 != null) {
                valueAnimator3.setStartDelay(v1);
            }
        }
        ValueAnimator valueAnimator4 = this.progressAnimator;
        if(valueAnimator4 != null) {
            valueAnimator4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
                    Object object0 = valueAnimator0.getAnimatedValue();
                    if(!(object0 instanceof Float)) {
                        object0 = null;
                    }
                    if(((Float)object0) != null) {
                        float f = (float)(((Float)object0));
                        if(CircularProgressBar.this.getIndeterminateMode()) {
                            CircularProgressBar.this.setProgressIndeterminateMode(f);
                        }
                        else {
                            CircularProgressBar.this.setProgress(f);
                        }
                        if(CircularProgressBar.this.getIndeterminateMode()) {
                            float f1 = f * 360.0f / 100.0f;
                            CircularProgressBar circularProgressBar0 = CircularProgressBar.this;
                            if(!circularProgressBar0.isToRight(circularProgressBar0.progressDirectionIndeterminateMode)) {
                                f1 = -f1;
                            }
                            circularProgressBar0.setStartAngleIndeterminateMode(f1 + 270.0f);
                        }
                    }
                }
            });
        }
        ValueAnimator valueAnimator5 = this.progressAnimator;
        if(valueAnimator5 != null) {
            valueAnimator5.start();
        }
    }

    public static void setProgressWithAnimation$default(CircularProgressBar circularProgressBar0, float f, Long long0, TimeInterpolator timeInterpolator0, Long long1, int v, Object object0) {
        if((v & 2) != 0) {
            long0 = null;
        }
        if((v & 4) != 0) {
            timeInterpolator0 = null;
        }
        if((v & 8) != 0) {
            long1 = null;
        }
        circularProgressBar0.setProgressWithAnimation(f, long0, timeInterpolator0, long1);
    }

    public void setRoundBorder(boolean z) {
        this.roundBorder = z;
        this.foregroundPaint.setStrokeCap((z ? Paint.Cap.ROUND : Paint.Cap.BUTT));
        this.invalidate();
    }

    public void setStartAngle(float f) {
        float f1;
        for(f1 = f + 270.0f; f1 > 360.0f; f1 -= 360.0f) {
        }
        if(f1 < 0.0f) {
            f1 = 0.0f;
        }
        else if(f1 > 360.0f) {
            f1 = 360.0f;
        }
        this.startAngle = f1;
        this.invalidate();
    }

    public void setStartAngleIndeterminateMode(float f) {
        this.startAngleIndeterminateMode = f;
        this.invalidate();
    }

    private GradientDirection toGradientDirection(int v) {
        switch(v) {
            case 1: {
                return GradientDirection.LEFT_TO_RIGHT;
            }
            case 2: {
                return GradientDirection.RIGHT_TO_LEFT;
            }
            case 3: {
                return GradientDirection.TOP_TO_BOTTOM;
            }
            case 4: {
                return GradientDirection.BOTTOM_TO_END;
            }
            default: {
                throw new IllegalArgumentException("This value is not supported for GradientDirection: " + v);
            }
        }
    }

    private ProgressDirection toProgressDirection(int v) {
        switch(v) {
            case 1: {
                return ProgressDirection.TO_RIGHT;
            }
            case 2: {
                return ProgressDirection.TO_LEFT;
            }
            default: {
                throw new IllegalArgumentException("This value is not supported for ProgressDirection: " + v);
            }
        }
    }
}

