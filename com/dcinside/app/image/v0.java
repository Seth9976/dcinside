package com.dcinside.app.image;

import android.widget.ImageView;
import com.bumptech.glide.integration.webp.decoder.l;

public final class v0 implements t {
    private ImageView a;
    private l b;

    public v0(ImageView imageView0, l l0) {
        this.a = imageView0;
        this.b = l0;
    }

    @Override  // com.dcinside.app.image.t
    public void a() {
        this.b.start();
        this.a.setImageDrawable(this.b);
    }
}

