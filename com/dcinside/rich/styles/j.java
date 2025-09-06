package com.dcinside.rich.styles;

import android.text.style.StrikethroughSpan;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ImageView;
import com.dcinside.rich.RichToolbar;

public class j extends k {
    public j(RichToolbar richToolbar0, ImageView imageView0) {
        super(richToolbar0, imageView0);
    }

    @Override  // com.dcinside.rich.styles.b
    public void d(ImageView imageView0) {
        class a implements View.OnClickListener {
            final j a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                j.this.r();
            }
        }

        imageView0.setOnClickListener(new a(this));
    }

    @Override  // com.dcinside.rich.styles.k
    public Object q() {
        return this.t();
    }

    public StrikethroughSpan t() {
        return new StrikethroughSpan();
    }
}

