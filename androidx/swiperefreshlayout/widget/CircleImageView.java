package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;

class CircleImageView extends ImageView {
    class OvalShadow extends OvalShape {
        private RadialGradient a;
        private Paint b;
        final CircleImageView c;

        OvalShadow(int v) {
            this.b = new Paint();
            circleImageView0.b = v;
            this.a(((int)this.rect().width()));
        }

        private void a(int v) {
            RadialGradient radialGradient0 = new RadialGradient(((float)(v / 2)), ((float)(v / 2)), ((float)CircleImageView.this.b), new int[]{0x3D000000, 0}, null, Shader.TileMode.CLAMP);
            this.a = radialGradient0;
            this.b.setShader(radialGradient0);
        }

        @Override  // android.graphics.drawable.shapes.OvalShape
        public void draw(Canvas canvas0, Paint paint0) {
            int v = CircleImageView.this.getWidth();
            int v1 = CircleImageView.this.getHeight();
            float f = (float)(v / 2);
            canvas0.drawCircle(f, ((float)(v1 / 2)), f, this.b);
            canvas0.drawCircle(f, ((float)(v1 / 2)), ((float)(v / 2 - CircleImageView.this.b)), paint0);
        }

        @Override  // android.graphics.drawable.shapes.RectShape
        protected void onResize(float f, float f1) {
            super.onResize(f, f1);
            this.a(((int)f));
        }
    }

    private Animation.AnimationListener a;
    int b;
    private static final int c = 0x1E000000;
    private static final int d = 0x3D000000;
    private static final float e = 0.0f;
    private static final float f = 1.75f;
    private static final float g = 3.5f;
    private static final int h = 4;

    CircleImageView(Context context0, int v) {
        super(context0);
        float f = this.getContext().getResources().getDisplayMetrics().density;
        this.b = (int)(3.5f * f);
        ShapeDrawable shapeDrawable0 = new ShapeDrawable(new OvalShape());
        ViewCompat.X1(this, f * 4.0f);
        shapeDrawable0.getPaint().setColor(v);
        ViewCompat.R1(this, shapeDrawable0);
    }

    private boolean a() [...] // Inlined contents

    public void b(Animation.AnimationListener animation$AnimationListener0) {
        this.a = animation$AnimationListener0;
    }

    public void c(int v) {
        this.setBackgroundColor(ContextCompat.getColor(this.getContext(), v));
    }

    @Override  // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animation$AnimationListener0 = this.a;
        if(animation$AnimationListener0 != null) {
            animation$AnimationListener0.onAnimationEnd(this.getAnimation());
        }
    }

    @Override  // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animation$AnimationListener0 = this.a;
        if(animation$AnimationListener0 != null) {
            animation$AnimationListener0.onAnimationStart(this.getAnimation());
        }
    }

    @Override  // android.widget.ImageView
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
    }

    @Override  // android.view.View
    public void setBackgroundColor(int v) {
        if(this.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable)this.getBackground()).getPaint().setColor(v);
        }
    }
}

