package com.bumptech.glide.integration.webp.decoder;

import com.bumptech.glide.load.engine.r;
import com.bumptech.glide.load.resource.drawable.j;

public class n extends j implements r {
    public n(l l0) {
        super(l0);
    }

    @Override  // com.bumptech.glide.load.engine.v
    public Class a() {
        return l.class;
    }

    @Override  // com.bumptech.glide.load.engine.v
    public int getSize() {
        return ((l)this.a).o();
    }

    @Override  // com.bumptech.glide.load.resource.drawable.j, com.bumptech.glide.load.engine.r
    public void initialize() {
        ((l)this.a).h().prepareToDraw();
    }

    @Override  // com.bumptech.glide.load.engine.v
    public void recycle() {
        ((l)this.a).stop();
        ((l)this.a).r();
    }
}

