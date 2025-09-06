package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.R.styleable;

public class MotionButton extends AppCompatButton {
    private float d;
    private float e;
    private Path f;
    ViewOutlineProvider g;
    RectF h;

    public MotionButton(Context context0) {
        super(context0);
        this.d = 0.0f;
        this.e = NaNf;
        this.d(context0, null);
    }

    public MotionButton(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.d = 0.0f;
        this.e = NaNf;
        this.d(context0, attributeSet0);
    }

    public MotionButton(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.d = 0.0f;
        this.e = NaNf;
        this.d(context0, attributeSet0);
    }

    private void d(Context context0, AttributeSet attributeSet0) {
        this.setPadding(0, 0, 0, 0);
        if(attributeSet0 != null) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ImageFilterView);
            int v1 = typedArray0.getIndexCount();
            for(int v = 0; v < v1; ++v) {
                int v2 = typedArray0.getIndex(v);
                if(v2 == styleable.ImageFilterView_round) {
                    this.setRound(typedArray0.getDimension(v2, 0.0f));
                }
                else if(v2 == styleable.ImageFilterView_roundPercent) {
                    this.setRoundPercent(typedArray0.getFloat(v2, 0.0f));
                }
            }
            typedArray0.recycle();
        }
    }

    @Override  // android.view.View
    public void draw(@NonNull Canvas canvas0) {
        super.draw(canvas0);
    }

    public float getRound() {
        return this.e;
    }

    public float getRoundPercent() {
        return this.d;
    }

    @RequiresApi(21)
    public void setRound(float f) {
        if(Float.isNaN(f)) {
            this.e = f;
            float f1 = this.d;
            this.d = -1.0f;
            this.setRoundPercent(f1);
            return;
        }
        boolean z = this.e != f;
        this.e = f;
        if(f == 0.0f) {
            this.setClipToOutline(false);
        }
        else {
            if(this.f == null) {
                this.f = new Path();
            }
            if(this.h == null) {
                this.h = new RectF();
            }
            if(this.g == null) {
                androidx.constraintlayout.utils.widget.MotionButton.2 motionButton$20 = new ViewOutlineProvider() {
                    final MotionButton a;

                    @Override  // android.view.ViewOutlineProvider
                    public void getOutline(View view0, Outline outline0) {
                        outline0.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), MotionButton.this.e);
                    }
                };
                this.g = motionButton$20;
                this.setOutlineProvider(motionButton$20);
            }
            this.setClipToOutline(true);
            int v = this.getWidth();
            int v1 = this.getHeight();
            this.h.set(0.0f, 0.0f, ((float)v), ((float)v1));
            this.f.reset();
            this.f.addRoundRect(this.h, this.e, this.e, Path.Direction.CW);
        }
        if(z) {
            this.invalidateOutline();
        }
    }

    @RequiresApi(21)
    public void setRoundPercent(float f) {
        boolean z = this.d != f;
        this.d = f;
        if(f == 0.0f) {
            this.setClipToOutline(false);
        }
        else {
            if(this.f == null) {
                this.f = new Path();
            }
            if(this.h == null) {
                this.h = new RectF();
            }
            if(this.g == null) {
                androidx.constraintlayout.utils.widget.MotionButton.1 motionButton$10 = new ViewOutlineProvider() {
                    final MotionButton a;

                    @Override  // android.view.ViewOutlineProvider
                    public void getOutline(View view0, Outline outline0) {
                        int v = MotionButton.this.getWidth();
                        int v1 = MotionButton.this.getHeight();
                        outline0.setRoundRect(0, 0, v, v1, ((float)Math.min(v, v1)) * MotionButton.this.d / 2.0f);
                    }
                };
                this.g = motionButton$10;
                this.setOutlineProvider(motionButton$10);
            }
            this.setClipToOutline(true);
            int v = this.getWidth();
            int v1 = this.getHeight();
            float f1 = ((float)Math.min(v, v1)) * this.d / 2.0f;
            this.h.set(0.0f, 0.0f, ((float)v), ((float)v1));
            this.f.reset();
            this.f.addRoundRect(this.h, f1, f1, Path.Direction.CW);
        }
        if(z) {
            this.invalidateOutline();
        }
    }
}

