package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.Nullable;

class CardViewBaseImpl implements CardViewImpl {
    final RectF a;

    CardViewBaseImpl() {
        this.a = new RectF();
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public float a(CardViewDelegate cardViewDelegate0) {
        return this.q(cardViewDelegate0).g();
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public float b(CardViewDelegate cardViewDelegate0) {
        return this.q(cardViewDelegate0).i();
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public float c(CardViewDelegate cardViewDelegate0) {
        return this.q(cardViewDelegate0).j();
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public float d(CardViewDelegate cardViewDelegate0) {
        return this.q(cardViewDelegate0).l();
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public void e(CardViewDelegate cardViewDelegate0) {
        Rect rect0 = new Rect();
        this.q(cardViewDelegate0).h(rect0);
        cardViewDelegate0.d(((int)Math.ceil(this.f(cardViewDelegate0))), ((int)Math.ceil(this.c(cardViewDelegate0))));
        cardViewDelegate0.b(rect0.left, rect0.top, rect0.right, rect0.bottom);
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public float f(CardViewDelegate cardViewDelegate0) {
        return this.q(cardViewDelegate0).k();
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public void g(CardViewDelegate cardViewDelegate0, float f) {
        this.q(cardViewDelegate0).q(f);
        this.e(cardViewDelegate0);
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public void h(CardViewDelegate cardViewDelegate0, float f) {
        this.q(cardViewDelegate0).p(f);
        this.e(cardViewDelegate0);
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public void i(CardViewDelegate cardViewDelegate0, float f) {
        this.q(cardViewDelegate0).r(f);
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public ColorStateList j(CardViewDelegate cardViewDelegate0) {
        return this.q(cardViewDelegate0).f();
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public void k(CardViewDelegate cardViewDelegate0) {
        this.q(cardViewDelegate0).m(cardViewDelegate0.g());
        this.e(cardViewDelegate0);
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public void l(CardViewDelegate cardViewDelegate0, Context context0, ColorStateList colorStateList0, float f, float f1, float f2) {
        RoundRectDrawableWithShadow roundRectDrawableWithShadow0 = this.p(context0, colorStateList0, f, f1, f2);
        roundRectDrawableWithShadow0.m(cardViewDelegate0.g());
        cardViewDelegate0.e(roundRectDrawableWithShadow0);
        this.e(cardViewDelegate0);
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public void m(CardViewDelegate cardViewDelegate0) {
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public void n() {
        RoundRectDrawableWithShadow.s = new RoundRectHelper() {
            final CardViewBaseImpl a;

            @Override  // androidx.cardview.widget.RoundRectDrawableWithShadow$RoundRectHelper
            public void a(Canvas canvas0, RectF rectF0, float f, Paint paint0) {
                float f1 = rectF0.width() - 2.0f * f - 1.0f;
                float f2 = rectF0.height();
                if(f >= 1.0f) {
                    float f3 = -(f + 0.5f);
                    CardViewBaseImpl.this.a.set(f3, f3, f + 0.5f, f + 0.5f);
                    int v = canvas0.save();
                    canvas0.translate(rectF0.left + (f + 0.5f), rectF0.top + (f + 0.5f));
                    canvas0.drawArc(CardViewBaseImpl.this.a, 180.0f, 90.0f, true, paint0);
                    canvas0.translate(f1, 0.0f);
                    canvas0.rotate(90.0f);
                    canvas0.drawArc(CardViewBaseImpl.this.a, 180.0f, 90.0f, true, paint0);
                    canvas0.translate(f2 - 2.0f * f - 1.0f, 0.0f);
                    canvas0.rotate(90.0f);
                    canvas0.drawArc(CardViewBaseImpl.this.a, 180.0f, 90.0f, true, paint0);
                    canvas0.translate(f1, 0.0f);
                    canvas0.rotate(90.0f);
                    canvas0.drawArc(CardViewBaseImpl.this.a, 180.0f, 90.0f, true, paint0);
                    canvas0.restoreToCount(v);
                    canvas0.drawRect(rectF0.left + (f + 0.5f) - 1.0f, rectF0.top, rectF0.right - (f + 0.5f) + 1.0f, rectF0.top + (f + 0.5f), paint0);
                    canvas0.drawRect(rectF0.left + (f + 0.5f) - 1.0f, rectF0.bottom - (f + 0.5f), rectF0.right - (f + 0.5f) + 1.0f, rectF0.bottom, paint0);
                }
                canvas0.drawRect(rectF0.left, rectF0.top + f, rectF0.right, rectF0.bottom - f, paint0);
            }
        };
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public void o(CardViewDelegate cardViewDelegate0, @Nullable ColorStateList colorStateList0) {
        this.q(cardViewDelegate0).o(colorStateList0);
    }

    private RoundRectDrawableWithShadow p(Context context0, ColorStateList colorStateList0, float f, float f1, float f2) {
        return new RoundRectDrawableWithShadow(context0.getResources(), colorStateList0, f, f1, f2);
    }

    private RoundRectDrawableWithShadow q(CardViewDelegate cardViewDelegate0) {
        return (RoundRectDrawableWithShadow)cardViewDelegate0.f();
    }
}

