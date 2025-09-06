package com.gomfactory.adpie.sdk.ui.progressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View.MeasureSpec;
import android.view.View;
import androidx.annotation.RequiresApi;
import com.gomfactory.adpie.sdk.AdPieSDK;
import com.gomfactory.adpie.sdk.util.AdPieLog;
import com.gomfactory.adpie.sdk.util.DisplayUtil;

public class CircleProgressBar extends View {
    private static final String TAG = "CircleProgressBar";
    private int centerX;
    private int centerY;
    int color;
    private boolean mIsTimerMode;
    private Paint mPaintProgress;
    private int mProgress;
    private RectF mRectF;
    private int max;
    private Paint paint;
    private Path path;
    private int swipeAndgle;
    private String text;
    private final Rect textBounds;
    private Paint textPaint;

    static {
    }

    public CircleProgressBar(Context context0) {
        super(context0);
        this.textBounds = new Rect();
        this.color = 0xFF44C8E5;
        this.max = 100;
        this.path = new Path();
        this.text = "";
        this.swipeAndgle = 0;
        this.initUI();
    }

    public CircleProgressBar(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.textBounds = new Rect();
        this.color = 0xFF44C8E5;
        this.max = 100;
        this.path = new Path();
        this.text = "";
        this.swipeAndgle = 0;
        this.initUI();
    }

    public CircleProgressBar(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.textBounds = new Rect();
        this.color = 0xFF44C8E5;
        this.max = 100;
        this.path = new Path();
        this.text = "";
        this.swipeAndgle = 0;
        this.initUI();
    }

    @RequiresApi(api = 21)
    public CircleProgressBar(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.textBounds = new Rect();
        this.color = 0xFF44C8E5;
        this.max = 100;
        this.path = new Path();
        this.text = "";
        this.swipeAndgle = 0;
        this.initUI();
    }

    public void drawTextCentred(Canvas canvas0) {
        try {
            this.textPaint.getTextBounds(this.text, 0, this.text.length(), this.textBounds);
            canvas0.drawText(this.text, ((float)this.centerX) - this.textBounds.exactCenterX(), ((float)this.centerY) - this.textBounds.exactCenterY(), this.textPaint);
        }
        catch(Exception exception0) {
            Log.e("CircleProgressBar", exception0.getMessage());
        }
    }

    private void initUI() {
        Paint paint0 = new Paint();
        this.paint = paint0;
        paint0.setAntiAlias(true);
        this.paint.setStrokeWidth(((float)DisplayUtil.dpToPx(this.getContext(), 1)));
        Paint.Style paint$Style0 = Paint.Style.STROKE;
        this.paint.setStyle(paint$Style0);
        this.paint.setColor(this.color);
        Paint paint1 = new Paint();
        this.mPaintProgress = paint1;
        paint1.setAntiAlias(true);
        this.mPaintProgress.setStyle(paint$Style0);
        this.mPaintProgress.setStrokeWidth(((float)DisplayUtil.dpToPx(this.getContext(), 6)));
        this.mPaintProgress.setColor(this.color);
        Paint paint2 = new Paint();
        this.textPaint = paint2;
        paint2.setAntiAlias(true);
        this.textPaint.setStyle(Paint.Style.FILL);
        this.textPaint.setColor(this.color);
        this.textPaint.setStrokeWidth(3.0f);
    }

    @Override  // android.view.View
    protected void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        try {
            canvas0.drawPath(this.path, this.paint);
            canvas0.drawArc(this.mRectF, 270.0f, ((float)this.swipeAndgle), false, this.mPaintProgress);
            this.drawTextCentred(canvas0);
        }
        catch(Exception exception0) {
            Log.e("CircleProgressBar", exception0.getMessage());
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        try {
            int v2 = View.MeasureSpec.getSize(v);
            int v3 = View.MeasureSpec.getSize(v1);
            int v4 = (Math.min(v2, v3) - DisplayUtil.dpToPx(this.getContext(), 2)) / 2;
            this.path.reset();
            this.centerX = v2 / 2;
            this.centerY = v3 / 2;
            Path.Direction path$Direction0 = Path.Direction.CW;
            this.path.addCircle(((float)(v2 / 2)), ((float)(v3 / 2)), ((float)v4), path$Direction0);
            int v5 = v4 - DisplayUtil.dpToPx(this.getContext(), 5);
            this.path.addCircle(((float)this.centerX), ((float)this.centerY), ((float)v5), path$Direction0);
            int v6 = v5 + DisplayUtil.dpToPx(this.getContext(), 2);
            this.mRectF = new RectF(((float)(this.centerX - v6)), ((float)(this.centerY - v6)), ((float)(this.centerX + v6)), ((float)(this.centerY + v6)));
            this.textPaint.setTextSize(((float)v4) * 0.6f);
        }
        catch(Exception exception0) {
            Log.e("CircleProgressBar", exception0.getMessage());
        }
    }

    public void setColor(int v, int v1, int v2) {
        try {
            this.paint.setColor(v);
            this.mPaintProgress.setColor(v1);
            this.textPaint.setColor(v2);
        }
        catch(Exception exception0) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.e("CircleProgressBar", exception0);
            }
        }
    }

    public void setMax(int v) {
        if(v < 0) {
            this.max = 0;
            return;
        }
        this.max = v;
    }

    public void setProgress(int v) {
        int v1 = 0;
        this.mProgress = v < 0 ? 0 : v;
        if(this.mIsTimerMode) {
            int v2 = this.max;
            if(v2 == 0) {
                this.swipeAndgle = 0;
            }
            else {
                int v3 = (v2 - this.mProgress) * 100 / v2;
                if(v3 >= 0) {
                    v1 = v3;
                }
                this.swipeAndgle = v1 * 360 / 100;
            }
            this.text = v + "";
        }
        else {
            int v4 = this.max;
            if(v4 == 0) {
                this.swipeAndgle = 0;
                this.text = "0%";
            }
            else {
                int v5 = v * 100 / v4;
                this.swipeAndgle = v5 * 360 / 100;
                this.text = v5 + "%";
            }
        }
        this.invalidate();
    }

    public void setTimerMode(boolean z) {
        this.mIsTimerMode = z;
    }
}

