package com.dcinside.rich.styles;

import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ImageView;
import com.dcinside.rich.RichToolbar;
import com.dcinside.rich.spans.RichBoldSpan;

public class e extends k {
    public e(RichToolbar richToolbar0, ImageView imageView0) {
        super(richToolbar0, imageView0);
    }

    @Override  // com.dcinside.rich.styles.b
    public void d(ImageView imageView0) {
        class a implements View.OnClickListener {
            final e a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                e.this.r();
            }
        }

        imageView0.setOnClickListener(new a(this));
    }

    @Override  // com.dcinside.rich.styles.k
    public Object q() {
        return this.t();
    }

    public RichBoldSpan t() {
        return new RichBoldSpan();
    }
}

