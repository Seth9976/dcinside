package com.bumptech.glide.request.transition;

public class i implements g {
    private final a a;
    private j b;

    public i(a j$a0) {
        this.a = j$a0;
    }

    @Override  // com.bumptech.glide.request.transition.g
    public f a(com.bumptech.glide.load.a a0, boolean z) {
        if(a0 != com.bumptech.glide.load.a.e && z) {
            if(this.b == null) {
                this.b = new j(this.a);
            }
            return this.b;
        }
        return e.b();
    }
}

