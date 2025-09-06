package com.github.mikephil.charting.utils;

public class j extends i {
    public j(l l0) {
        super(l0);
    }

    @Override  // com.github.mikephil.charting.utils.i
    public void p(boolean z) {
        this.b.reset();
        if(!z) {
            this.b.postTranslate(this.c.P(), this.c.n() - this.c.O());
            return;
        }
        this.b.setTranslate(-(this.c.o() - this.c.Q()), this.c.n() - this.c.O());
        this.b.postScale(-1.0f, 1.0f);
    }
}

