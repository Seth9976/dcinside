package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class CardViewApi21Impl implements CardViewImpl {
    @Override  // androidx.cardview.widget.CardViewImpl
    public float a(CardViewDelegate cardViewDelegate0) {
        return this.p(cardViewDelegate0).d();
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public float b(CardViewDelegate cardViewDelegate0) {
        return this.p(cardViewDelegate0).c();
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public float c(CardViewDelegate cardViewDelegate0) {
        return this.a(cardViewDelegate0) * 2.0f;
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public float d(CardViewDelegate cardViewDelegate0) {
        return cardViewDelegate0.h().getElevation();
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public void e(CardViewDelegate cardViewDelegate0) {
        if(!cardViewDelegate0.c()) {
            cardViewDelegate0.b(0, 0, 0, 0);
            return;
        }
        float f = this.b(cardViewDelegate0);
        float f1 = this.a(cardViewDelegate0);
        int v = (int)Math.ceil(RoundRectDrawableWithShadow.c(f, f1, cardViewDelegate0.g()));
        int v1 = (int)Math.ceil(RoundRectDrawableWithShadow.d(f, f1, cardViewDelegate0.g()));
        cardViewDelegate0.b(v, v1, v, v1);
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public float f(CardViewDelegate cardViewDelegate0) {
        return this.a(cardViewDelegate0) * 2.0f;
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public void g(CardViewDelegate cardViewDelegate0, float f) {
        this.p(cardViewDelegate0).g(f, cardViewDelegate0.c(), cardViewDelegate0.g());
        this.e(cardViewDelegate0);
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public void h(CardViewDelegate cardViewDelegate0, float f) {
        this.p(cardViewDelegate0).h(f);
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public void i(CardViewDelegate cardViewDelegate0, float f) {
        cardViewDelegate0.h().setElevation(f);
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public ColorStateList j(CardViewDelegate cardViewDelegate0) {
        return this.p(cardViewDelegate0).b();
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public void k(CardViewDelegate cardViewDelegate0) {
        this.g(cardViewDelegate0, this.b(cardViewDelegate0));
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public void l(CardViewDelegate cardViewDelegate0, Context context0, ColorStateList colorStateList0, float f, float f1, float f2) {
        cardViewDelegate0.e(new RoundRectDrawable(colorStateList0, f));
        View view0 = cardViewDelegate0.h();
        view0.setClipToOutline(true);
        view0.setElevation(f1);
        this.g(cardViewDelegate0, f2);
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public void m(CardViewDelegate cardViewDelegate0) {
        this.g(cardViewDelegate0, this.b(cardViewDelegate0));
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public void n() {
    }

    @Override  // androidx.cardview.widget.CardViewImpl
    public void o(CardViewDelegate cardViewDelegate0, @Nullable ColorStateList colorStateList0) {
        this.p(cardViewDelegate0).f(colorStateList0);
    }

    private RoundRectDrawable p(CardViewDelegate cardViewDelegate0) {
        return (RoundRectDrawable)cardViewDelegate0.f();
    }
}

