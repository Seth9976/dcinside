package com.kakao.adfit.e;

public abstract class k {
    private boolean a;

    public k() {
        this.a = true;
    }

    public final boolean f() {
        return this.a;
    }

    protected abstract void g();

    public final void h() {
        if(this.a) {
            this.a = false;
            this.g();
        }
    }
}

