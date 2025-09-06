package com.dcinside.app.image;

import android.widget.ImageView;

public final class c implements t {
    private ImageView a;
    private com.bumptech.glide.load.resource.gif.c b;

    public c(ImageView imageView0, com.bumptech.glide.load.resource.gif.c c0) {
        this.a = imageView0;
        this.b = c0;
    }

    @Override  // com.dcinside.app.image.t
    public void a() {
        this.b.start();
        this.a.setImageDrawable(this.b);
    }
}

