package com.dcinside.app.image;

import android.graphics.drawable.AnimatedImageDrawable;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;

public final class b implements t {
    @l
    private final ImageView a;
    @l
    private final AnimatedImageDrawable b;

    public b(@l ImageView imageView0, @l AnimatedImageDrawable animatedImageDrawable0) {
        L.p(imageView0, "view");
        L.p(animatedImageDrawable0, "drawable");
        super();
        this.a = imageView0;
        this.b = animatedImageDrawable0;
    }

    @Override  // com.dcinside.app.image.t
    @RequiresApi(api = 28)
    public void a() {
        this.b.start();
        this.a.setImageDrawable(this.b);
    }
}

