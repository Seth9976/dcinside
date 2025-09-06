package com.bumptech.glide.load.resource.gif;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.r;
import com.bumptech.glide.load.resource.drawable.j;

public class e extends j implements r {
    public e(c c0) {
        super(c0);
    }

    @Override  // com.bumptech.glide.load.engine.v
    @NonNull
    public Class a() {
        return c.class;
    }

    @Override  // com.bumptech.glide.load.engine.v
    public int getSize() {
        return ((c)this.a).m();
    }

    @Override  // com.bumptech.glide.load.resource.drawable.j, com.bumptech.glide.load.engine.r
    public void initialize() {
        ((c)this.a).h().prepareToDraw();
    }

    @Override  // com.bumptech.glide.load.engine.v
    public void recycle() {
        ((c)this.a).stop();
        ((c)this.a).p();
    }
}

