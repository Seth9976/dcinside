package com.dcinside.rich.styles;

import android.text.Editable;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ImageView;
import com.dcinside.rich.RichEditText;
import com.dcinside.rich.RichToolbar;
import com.dcinside.rich.size.a;
import com.dcinside.rich.size.b;
import com.dcinside.rich.spans.RichFontSizeSpan;

public class h extends g implements a {
    private int i;
    private b j;
    private boolean k;

    public h(RichToolbar richToolbar0, ImageView imageView0) {
        super(richToolbar0, imageView0);
        this.i = 15;
    }

    // 检测为 Lambda 实现
    private void A() [...]

    @Override  // com.dcinside.rich.styles.b
    public void d(ImageView imageView0) {
        class com.dcinside.rich.styles.h.a implements View.OnClickListener {
            final h a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                h.this.A();
            }
        }

        imageView0.setOnClickListener((/* 缺少LAMBDA参数 */) -> {
            if(h.this.j == null) {
                ImageView imageView0 = h.this.g();
                h.this.j = new b((imageView0 == null ? null : imageView0.getContext()), h.this);
            }
            h.this.j.c(h.this.i);
            h.this.j.showAsDropDown(h.this.e(), 0, 0);
        });
    }

    @Override  // com.dcinside.rich.size.a
    public void f(int v) {
        this.k = true;
        this.i = v;
        RichEditText richEditText0 = this.b();
        if(richEditText0 != null) {
            Editable editable0 = richEditText0.getEditableText();
            int v1 = richEditText0.getSelectionStart();
            int v2 = richEditText0.getSelectionEnd();
            if(v2 > v1) {
                int v3 = this.p(editable0, v1, v2);
                richEditText0.setSelection(v1, v3);
                this.t(editable0, v1, v3, this.i);
                this.c();
                return;
            }
            if(v1 == v2) {
                int v4 = this.o(editable0, v1);
                richEditText0.setSelection(v4 - 1, v4);
                this.t(editable0, v4 - 1, v4, this.i);
                this.c();
            }
        }
    }

    @Override  // com.dcinside.rich.styles.k
    public boolean isChecked() {
        return this.k;
    }

    @Override  // com.dcinside.rich.styles.k
    protected void l(Editable editable0, int v, int v1, Object object0) {
        this.x(editable0, v, v1, ((RichFontSizeSpan)object0));
    }

    @Override  // com.dcinside.rich.styles.k
    public Object q() {
        return this.y();
    }

    @Override  // com.dcinside.rich.styles.k
    public void setChecked(boolean z) {
    }

    @Override  // com.dcinside.rich.styles.g
    protected void u(int v) {
        this.i = v;
        b b0 = this.j;
        if(b0 != null) {
            b0.c(v);
        }
    }

    @Override  // com.dcinside.rich.styles.g
    protected p0.b v(int v) {
        return this.z(v);
    }

    protected void x(Editable editable0, int v, int v1, RichFontSizeSpan richFontSizeSpan0) {
        int v2 = richFontSizeSpan0.getSize();
        int v3 = this.i;
        if(v2 != v3) {
            this.t(editable0, v, v1, v3);
            this.c();
        }
    }

    public RichFontSizeSpan y() {
        return new RichFontSizeSpan(this.i);
    }

    protected RichFontSizeSpan z(int v) {
        return new RichFontSizeSpan(v);
    }
}

