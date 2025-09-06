package com.dcinside.rich.styles;

import android.text.Editable;
import android.widget.ImageView;
import com.dcinside.rich.RichToolbar;
import p0.b;

public abstract class g extends k {
    g(RichToolbar richToolbar0, ImageView imageView0) {
        super(richToolbar0, imageView0);
    }

    @Override  // com.dcinside.rich.styles.k
    protected void n(Editable editable0, int v) {
        b[] arr_b = (b[])editable0.getSpans(v, v, this.i());
        if(arr_b != null && arr_b.length > 0) {
            b b0 = arr_b[0];
            int v1 = editable0.getSpanStart(b0);
            int v2 = editable0.getSpanEnd(b0);
            editable0.removeSpan(b0);
            int v3 = b0.a();
            this.u(v3);
            this.h(editable0, this.v(v3), v1, v2, 18);
        }
    }

    void t(Editable editable0, int v, int v1, int v2) {
        b[] arr_b = (b[])editable0.getSpans(Math.max(v - 1, 0), Math.min(editable0.length(), v1 + 1), this.i());
        if(arr_b != null && arr_b.length != 0) {
            int v4 = -1;
            int v5 = 0x7FFFFFFF;
            b b0 = null;
            b b1 = null;
            int v6 = -1;
            for(int v7 = 0; v7 < arr_b.length; ++v7) {
                b b2 = arr_b[v7];
                int v8 = editable0.getSpanStart(b2);
                if(v8 < v5) {
                    b0 = b2;
                    v5 = v8;
                }
                if(v8 >= v4) {
                    int v9 = editable0.getSpanEnd(b2);
                    if(v9 > v6) {
                        v6 = v9;
                    }
                    b1 = b2;
                    v4 = v8;
                }
            }
            if(b0 != null && b1 != null) {
                int v10 = v1 <= v6 ? v6 : v1;
                for(int v3 = 0; v3 < arr_b.length; ++v3) {
                    editable0.removeSpan(arr_b[v3]);
                }
                int v11 = b0.a();
                int v12 = b1.a();
                if(v11 == v2 && v12 == v2) {
                    this.h(editable0, ((b)this.q()), v5, v10, 18);
                    return;
                }
                if(v11 == v2) {
                    this.h(editable0, this.v(v11), v5, v1, 17);
                    this.h(editable0, this.v(v12), v1, v10, 34);
                    return;
                }
                if(v12 == v2) {
                    this.h(editable0, this.v(v11), v5, v, 17);
                    this.h(editable0, this.v(v12), v, v10, 34);
                    return;
                }
                this.h(editable0, this.v(v11), v5, v, 17);
                this.h(editable0, this.v(v12), v1, v10, 34);
                this.h(editable0, ((b)this.q()), v, v1, 18);
            }
            return;
        }
        this.h(editable0, ((b)this.q()), v, v1, 18);
    }

    protected abstract void u(int arg1);

    protected abstract b v(int arg1);
}

