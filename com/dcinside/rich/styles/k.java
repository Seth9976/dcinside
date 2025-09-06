package com.dcinside.rich.styles;

import android.text.Editable;
import android.widget.ImageView;
import com.dcinside.rich.RichEditText;
import com.dcinside.rich.RichToolbar;
import com.dcinside.rich.e;

public abstract class k extends a {
    private boolean h;

    k(RichToolbar richToolbar0, ImageView imageView0) {
        super(richToolbar0, imageView0);
        this.d(imageView0);
    }

    @Override  // com.dcinside.rich.styles.b
    public void a(Editable editable0, int v, int v1, boolean z) {
        if(z) {
            if(v1 > v) {
                Object[] arr_object = editable0.getSpans(v, v1, this.i());
                Object object0 = arr_object.length <= 0 ? null : arr_object[0];
                if(object0 == null) {
                    this.m(editable0, v, v1);
                    return;
                }
                if(editable0.getSpanStart(object0) <= v && editable0.getSpanEnd(object0) >= v1) {
                    this.l(editable0, v, v1, object0);
                    return;
                }
                this.m(editable0, v, v1);
                return;
            }
            Object[] arr_object1 = editable0.getSpans(v, v1, this.i());
            if(arr_object1.length > 0) {
                Object object1 = arr_object1[0];
                int v2 = editable0.getSpanStart(object1);
                for(int v3 = 0; v3 < arr_object1.length; ++v3) {
                    Object object2 = arr_object1[v3];
                    int v4 = editable0.getSpanStart(object2);
                    if(v4 > v2) {
                        object1 = object2;
                        v2 = v4;
                    }
                }
                int v5 = editable0.getSpanStart(object1);
                int v6 = editable0.getSpanEnd(object1);
                e.f(("eSpan start == " + v5 + ", eSpan end == " + v6));
                if(v5 >= v6) {
                    editable0.removeSpan(object1);
                    this.n(editable0, v5);
                    this.setChecked(false);
                }
            }
        }
        else if(v1 > v) {
            Object[] arr_object2 = editable0.getSpans(v, v1, this.i());
            if(arr_object2.length > 0) {
                Object object3 = arr_object2[0];
                if(object3 != null) {
                    int v7 = editable0.getSpanStart(object3);
                    int v8 = editable0.getSpanEnd(object3);
                    if(v >= v8) {
                        editable0.removeSpan(object3);
                        this.h(editable0, object3, v7, v - 1, 34);
                        return;
                    }
                    if(v == v7 && v1 == v8) {
                        editable0.removeSpan(object3);
                        return;
                    }
                    if(v > v7 && v1 < v8) {
                        editable0.removeSpan(object3);
                        this.h(editable0, this.q(), v7, v, 34);
                        this.h(editable0, this.q(), v1, v8, 34);
                        return;
                    }
                    if(v == v7 && v1 < v8) {
                        editable0.removeSpan(object3);
                        this.h(editable0, this.q(), v1, v8, 34);
                        return;
                    }
                    if(v > v7 && v1 == v8) {
                        editable0.removeSpan(object3);
                        this.h(editable0, this.q(), v7, v, 34);
                    }
                }
            }
        }
        else if(v1 != v) {
            Object[] arr_object3 = editable0.getSpans(v, v1, this.i());
            if(arr_object3.length > 0) {
                Object object4 = arr_object3[0];
                if(object4 != null && editable0.getSpanStart(object4) < editable0.getSpanEnd(object4)) {
                    this.setChecked(true);
                }
            }
        }
    }

    @Override  // com.dcinside.rich.styles.b
    public boolean isChecked() {
        return this.h;
    }

    protected void l(Editable editable0, int v, int v1, Object object0) {
    }

    private void m(Editable editable0, int v, int v1) {
        Class class0 = this.i();
        Object[] arr_object = editable0.getSpans(v, v, class0);
        Object object0 = null;
        Object object1 = arr_object.length <= 0 ? null : arr_object[0];
        Object[] arr_object1 = editable0.getSpans(v1, v1, class0);
        if(arr_object1.length > 0) {
            object0 = arr_object1[0];
        }
        if(object1 != null && object0 != null) {
            int v2 = editable0.getSpanStart(object1);
            int v3 = editable0.getSpanEnd(object0);
            this.s(editable0, v, v1, class0);
            this.h(editable0, this.q(), v2, v3, 34);
            return;
        }
        if(object1 != null) {
            int v4 = editable0.getSpanStart(object1);
            this.s(editable0, v, v1, class0);
            this.h(editable0, this.q(), v4, v1, 34);
            return;
        }
        if(object0 != null) {
            int v5 = editable0.getSpanEnd(object0);
            this.s(editable0, v, v1, class0);
            this.h(editable0, this.q(), v, v5, 34);
            return;
        }
        this.s(editable0, v, v1, class0);
        this.h(editable0, this.q(), v, v1, 34);
    }

    protected void n(Editable editable0, int v) {
    }

    int o(Editable editable0, int v) {
        if(v > 0 && editable0.charAt(v - 1) != 0x200B) {
            editable0.insert(v, "​ ");
            return v + 2;
        }
        editable0.insert(v, " ");
        return v + 1;
    }

    int p(Editable editable0, int v, int v1) {
        if(editable0.length() > v1 && editable0.charAt(v1 - 1) != 0x200B && editable0.charAt(v1) != 0x200B) {
            editable0.insert(v1, "​");
            ++v1;
        }
        if(v > 0 && editable0.charAt(v - 1) != 0x200B && editable0.charAt(v) != 0x200B) {
            editable0.insert(v, "​");
            return v1 + 1;
        }
        return v1;
    }

    public abstract Object q();

    final void r() {
        RichEditText richEditText0 = this.b();
        if(richEditText0 == null) {
            return;
        }
        Editable editable0 = richEditText0.getEditableText();
        int v = richEditText0.getSelectionStart();
        int v1 = richEditText0.getSelectionEnd();
        boolean z = this.isChecked();
        if(v1 > v) {
            int v2 = this.p(editable0, v, v1);
            richEditText0.setSelection(v, v2);
            this.a(editable0, v, v2, !z);
            this.c();
            return;
        }
        if(v1 == v) {
            int v3 = this.o(editable0, v);
            richEditText0.setSelection(v3 - 1, v3);
            this.a(editable0, v3 - 1, v3, !z);
            this.c();
            return;
        }
        this.a(editable0, v, v1, !z);
        this.c();
    }

    private void s(Editable editable0, int v, int v1, Class class0) {
        Object[] arr_object = editable0.getSpans(v, v1, class0);
        for(int v2 = 0; v2 < arr_object.length; ++v2) {
            editable0.removeSpan(arr_object[v2]);
        }
    }

    @Override  // com.dcinside.rich.styles.b
    public void setChecked(boolean z) {
        this.h = z;
        ImageView imageView0 = this.g();
        if(imageView0 == null) {
            return;
        }
        if(imageView0.getBackground() == null) {
            RichToolbar richToolbar0 = this.e();
            int v = richToolbar0 == null ? 0 : richToolbar0.getSelector();
            if(v == 0) {
                imageView0.setBackground(null);
            }
            else {
                imageView0.setBackgroundResource(v);
            }
        }
        imageView0.setSelected(z);
    }
}

