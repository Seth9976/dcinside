package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
public final class AspectRatioFrameLayout extends FrameLayout {
    public interface AspectRatioListener {
        void a(float arg1, float arg2, boolean arg3);
    }

    final class AspectRatioUpdateDispatcher implements Runnable {
        private float a;
        private float b;
        private boolean c;
        private boolean d;
        final AspectRatioFrameLayout e;

        private AspectRatioUpdateDispatcher() {
        }

        AspectRatioUpdateDispatcher(androidx.media3.ui.AspectRatioFrameLayout.1 aspectRatioFrameLayout$10) {
        }

        public void a(float f, float f1, boolean z) {
            this.a = f;
            this.b = f1;
            this.c = z;
            if(!this.d) {
                this.d = true;
                AspectRatioFrameLayout.this.post(this);
            }
        }

        @Override
        public void run() {
            this.d = false;
            if(AspectRatioFrameLayout.this.b == null) {
                return;
            }
            AspectRatioFrameLayout.this.b.a(this.a, this.b, this.c);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface ResizeMode {
    }

    private final AspectRatioUpdateDispatcher a;
    @Nullable
    private AspectRatioListener b;
    private float c;
    private int d;
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 4;
    private static final float j = 0.01f;

    public AspectRatioFrameLayout(Context context0) {
        this(context0, null);
    }

    public AspectRatioFrameLayout(Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.d = 0;
        if(attributeSet0 != null) {
            TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, styleable.AspectRatioFrameLayout, 0, 0);
            try {
                this.d = typedArray0.getInt(styleable.AspectRatioFrameLayout_resize_mode, 0);
            }
            finally {
                typedArray0.recycle();
            }
        }
        this.a = new AspectRatioUpdateDispatcher(this, null);
    }

    public int getResizeMode() {
        return this.d;
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(this.c <= 0.0f) {
            return;
        }
        int v2 = this.getMeasuredWidth();
        int v3 = this.getMeasuredHeight();
        float f = ((float)v2) / ((float)v3);
        float f1 = this.c / f - 1.0f;
        if(Math.abs(f1) <= 0.01f) {
            this.a.a(this.c, f, false);
            return;
        }
        switch(this.d) {
            case 0: {
                if(f1 > 0.0f) {
                    v3 = (int)(((float)v2) / this.c);
                }
                else {
                    v2 = (int)(((float)v3) * this.c);
                }
                break;
            }
            case 1: {
                v3 = (int)(((float)v2) / this.c);
                break;
            }
            case 2: {
                v2 = (int)(((float)v3) * this.c);
                break;
            }
            case 4: {
                if(f1 > 0.0f) {
                    v2 = (int)(((float)v3) * this.c);
                }
                else {
                    v3 = (int)(((float)v2) / this.c);
                }
            }
        }
        this.a.a(this.c, f, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(v2, 0x40000000), View.MeasureSpec.makeMeasureSpec(v3, 0x40000000));
    }

    public void setAspectRatio(float f) {
        if(this.c != f) {
            this.c = f;
            this.requestLayout();
        }
    }

    public void setAspectRatioListener(@Nullable AspectRatioListener aspectRatioFrameLayout$AspectRatioListener0) {
        this.b = aspectRatioFrameLayout$AspectRatioListener0;
    }

    public void setResizeMode(int v) {
        if(this.d != v) {
            this.d = v;
            this.requestLayout();
        }
    }

    class androidx.media3.ui.AspectRatioFrameLayout.1 {
    }

}

