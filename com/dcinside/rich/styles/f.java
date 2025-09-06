package com.dcinside.rich.styles;

import android.text.Editable;
import android.text.style.ForegroundColorSpan;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ImageView;
import com.dcinside.rich.RichEditText;
import com.dcinside.rich.RichToolbar;
import com.dcinside.rich.color.c;
import com.dcinside.rich.e;
import com.dcinside.rich.spans.RichColorSpan;

public class f extends g {
    class a implements c {
        final f a;

        @Override  // com.dcinside.rich.color.c
        public void a(int v) {
            f.this.i = v;
            RichEditText richEditText0 = f.this.b();
            if(richEditText0 != null) {
                Editable editable0 = richEditText0.getEditableText();
                int v1 = richEditText0.getSelectionStart();
                int v2 = richEditText0.getSelectionEnd();
                if(v2 > v1) {
                    int v3 = f.this.p(editable0, v1, v2);
                    richEditText0.setSelection(v1, v3);
                    f.this.t(editable0, v1, v3, f.this.i);
                    f.this.c();
                    return;
                }
                if(v1 == v2) {
                    int v4 = f.this.o(editable0, v1);
                    richEditText0.setSelection(v4 - 1, v4);
                    f.this.t(editable0, v4 - 1, v4, f.this.i);
                    f.this.c();
                }
            }
        }
    }

    private int i;
    private c j;

    public f(RichToolbar richToolbar0, ImageView imageView0) {
        super(richToolbar0, imageView0);
        this.i = -1;
        this.j = new a(this);
    }

    private void A(Editable editable0) {
        ForegroundColorSpan[] arr_foregroundColorSpan = (ForegroundColorSpan[])editable0.getSpans(0, editable0.length(), ForegroundColorSpan.class);
        for(int v = 0; v < arr_foregroundColorSpan.length; ++v) {
            ForegroundColorSpan foregroundColorSpan0 = arr_foregroundColorSpan[v];
            e.f(("List All:  :: start == " + editable0.getSpanStart(foregroundColorSpan0) + ", end == " + editable0.getSpanEnd(foregroundColorSpan0)));
        }
    }

    public RichColorSpan B() {
        return new RichColorSpan(this.i);
    }

    protected RichColorSpan C(int v) {
        return new RichColorSpan(v);
    }

    @Override  // com.dcinside.rich.styles.b
    public void d(ImageView imageView0) {
        class b implements View.OnClickListener {
            final f a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                RichToolbar richToolbar0 = f.this.e();
                if(richToolbar0 != null) {
                    richToolbar0.g(f.this.j);
                }
            }
        }

        imageView0.setOnClickListener(new b(this));
    }

    @Override  // com.dcinside.rich.styles.k
    public boolean isChecked() {
        return this.i != -1;
    }

    @Override  // com.dcinside.rich.styles.k
    protected void l(Editable editable0, int v, int v1, Object object0) {
        this.z(editable0, v, v1, ((RichColorSpan)object0));
    }

    @Override  // com.dcinside.rich.styles.k
    public Object q() {
        return this.B();
    }

    @Override  // com.dcinside.rich.styles.k
    public void setChecked(boolean z) {
    }

    @Override  // com.dcinside.rich.styles.g
    protected void u(int v) {
        this.i = v;
        RichToolbar richToolbar0 = this.e();
        if(richToolbar0 != null) {
            richToolbar0.setColorPaletteColor(this.i);
        }
    }

    @Override  // com.dcinside.rich.styles.g
    protected p0.b v(int v) {
        return this.C(v);
    }

    protected void z(Editable editable0, int v, int v1, RichColorSpan richColorSpan0) {
        int v2 = richColorSpan0.getForegroundColor();
        if(v2 != this.i) {
            e.f(("color changed before: " + v2 + ", new == " + this.i));
            this.t(editable0, v, v1, this.i);
            this.A(editable0);
        }
    }
}

