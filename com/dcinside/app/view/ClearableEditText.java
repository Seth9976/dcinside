package com.dcinside.app.view;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.dcinside.app.internal.t;
import com.dcinside.app.util.vk;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

@s0({"SMAP\nClearableEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClearableEditText.kt\ncom/dcinside/app/view/ClearableEditText\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,123:1\n147#2:124\n*S KotlinDebug\n*F\n+ 1 ClearableEditText.kt\ncom/dcinside/app/view/ClearableEditText\n*L\n55#1:124\n*E\n"})
public final class ClearableEditText extends AppCompatEditText {
    public interface a {
        void z();
    }

    private int g;
    @m
    private Drawable h;
    @l
    private t i;
    private boolean j;

    @j
    public ClearableEditText(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 2, null);
    }

    @j
    public ClearableEditText(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        super(context0, attributeSet0);
        this.i = new t(null, 1, null);
        if(!this.isInEditMode()) {
            this.g = 0;
            Drawable[] arr_drawable = this.getCompoundDrawables();
            this.h = arr_drawable[2];
            if(arr_drawable[2] == null) {
                Drawable drawable0 = ContextCompat.getDrawable(context0, 0x7F080144);  // drawable:btn_release
                if(drawable0 == null) {
                    this.h = null;
                }
                else {
                    Drawable drawable1 = DrawableCompat.r(drawable0);
                    drawable1.setBounds(0, 0, 0, 0);
                    DrawableCompat.n(drawable1, vk.b(context0, 0x7F04032A));  // attr:icTintNormal
                    this.h = drawable1;
                }
            }
            this.setClearIconVisible(false);
        }
    }

    public ClearableEditText(Context context0, AttributeSet attributeSet0, int v, w w0) {
        if((v & 2) != 0) {
            attributeSet0 = null;
        }
        this(context0, attributeSet0);
    }

    public final void f() {
        this.setText(null);
        this.clearFocus();
        a clearableEditText$a0 = (a)this.i.a();
        if(clearableEditText$a0 != null) {
            clearableEditText$a0.z();
        }
    }

    public final void g(boolean z) {
        this.j = z;
        Editable editable0 = this.getText();
        this.setClearIconVisible(m0.a.a.k(editable0));
    }

    public final void h() {
        this.h = null;
        this.setCompoundDrawables(null, null, null, null);
    }

    @Override  // android.widget.TextView
    protected void onFocusChanged(boolean z, int v, @m Rect rect0) {
        boolean z1;
        super.onFocusChanged(z, v, rect0);
        if(z) {
            Editable editable0 = this.getText();
            z1 = m0.a.a.k(editable0);
        }
        else {
            z1 = false;
        }
        this.setClearIconVisible(z1);
    }

    @Override  // android.widget.TextView
    protected void onTextChanged(@l CharSequence charSequence0, int v, int v1, int v2) {
        L.p(charSequence0, "text");
        super.onTextChanged(charSequence0, v, v1, v2);
        if(this.isFocused() && m0.a.a.k(charSequence0)) {
            this.setClearIconVisible(true);
            return;
        }
        if(m0.a.a.i(charSequence0)) {
            this.setClearIconVisible(false);
        }
    }

    @Override  // android.widget.TextView
    public boolean onTouchEvent(@l MotionEvent motionEvent0) {
        L.p(motionEvent0, "event");
        if(this.isEnabled() && motionEvent0.getAction() == 1) {
            Drawable drawable0 = this.h;
            if(this.getCompoundDrawables()[2] != null && drawable0 != null) {
                int v = drawable0.getIntrinsicWidth() + this.g;
                if(motionEvent0.getX() > ((float)(this.getWidth() - this.getPaddingRight() - v))) {
                    this.setText(null);
                    this.clearFocus();
                    a clearableEditText$a0 = (a)this.i.a();
                    if(clearableEditText$a0 != null) {
                        clearableEditText$a0.z();
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent0);
    }

    private final void setClearIconVisible(boolean z) {
        Drawable[] arr_drawable = this.getCompoundDrawables();
        L.o(arr_drawable, "getCompoundDrawables(...)");
        if(z != (arr_drawable[2] != null)) {
            this.setCompoundDrawables(arr_drawable[0], arr_drawable[1], (this.j || z ? this.h : null), arr_drawable[3]);
        }
    }

    @Override  // android.widget.TextView
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if(!z) {
            this.clearFocus();
        }
    }

    public final void setOnClearListener(@l a clearableEditText$a0) {
        L.p(clearableEditText$a0, "l");
        this.i = new t(clearableEditText$a0);
    }
}

