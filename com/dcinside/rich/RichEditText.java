package com.dcinside.rich;

import android.content.Context;
import android.graphics.Rect;
import android.text.Editable.Factory;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import androidx.annotation.IdRes;
import androidx.appcompat.widget.AppCompatEditText;
import com.dcinside.rich.spans.RichUnderlineSpan;
import com.dcinside.rich.styles.i;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.j;

public final class RichEditText extends AppCompatEditText {
    @m
    private c g;
    @l
    private a h;
    private int i;
    @IdRes
    private int j;
    @l
    private b k;
    private boolean l;
    @m
    private RichToolbar m;
    @m
    private Function1 n;

    @j
    public RichEditText(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public RichEditText(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public RichEditText(@l Context context0, @m AttributeSet attributeSet0, int v) {
        public static final class a implements TextWatcher {
            final RichEditText a;

            a(RichEditText richEditText0) {
                this.a = richEditText0;
                super();
            }

            @Override  // android.text.TextWatcher
            public void afterTextChanged(@m Editable editable0) {
                c c0 = this.a.g;
                if(c0 != null) {
                    c0.b(this.a, editable0);
                }
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(@m CharSequence charSequence0, int v, int v1, int v2) {
                c c0 = this.a.g;
                if(c0 != null) {
                    c0.a(this.a, charSequence0, v, v1, v2);
                }
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(@m CharSequence charSequence0, int v, int v1, int v2) {
                b b0;
                RichEditText richEditText0 = this.a;
                if(richEditText0.j == 0x1020022) {
                    b0 = b.a;
                }
                else {
                    switch(this.a.i) {
                        case 66: 
                        case 0xA0: {
                            b0 = b.b;
                            break;
                        }
                        default: {
                            b0 = b.c;
                        }
                    }
                }
                richEditText0.k = b0;
                this.a.j = 0;
                this.a.i = 0;
                c c0 = this.a.g;
                if(c0 != null) {
                    c0.c(this.a, charSequence0, v, v1, v2);
                }
            }
        }

        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.h = new a(this);
        this.k = b.c;
        this.l = true;
        this.setTextSize(2, 15.0f);
    }

    public RichEditText(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @l
    public final String getHtml() {
        Editable editable0 = Editable.Factory.getInstance().newEditable(this.getEditableText());
        BaseInputConnection.removeComposingSpans(editable0);
        L.m(editable0);
        String s = com.dcinside.rich.html.a.a.h(editable0, 1);
        editable0.clear();
        return s;
    }

    @l
    public final b getLastAction() {
        return this.k;
    }

    @m
    public final RichToolbar getToolbar() {
        return this.m;
    }

    public final void l(@m String s) {
        if(s == null) {
            s = "";
        }
        Spanned spanned0 = com.dcinside.rich.html.a.d(com.dcinside.rich.html.a.a, s, 17, null, 4, null);
        this.s();
        this.setText(v.j4(spanned0, "\n"));
        this.r();
    }

    private final boolean m(StyleSpan styleSpan0) {
        switch(styleSpan0.getStyle()) {
            case 1: 
            case 3: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    private final boolean n(CharacterStyle characterStyle0, Editable editable0, int v, int v1) {
        return editable0.getSpanStart(characterStyle0) <= v && editable0.getSpanEnd(characterStyle0) >= v1;
    }

    private final boolean o(StyleSpan styleSpan0) {
        switch(styleSpan0.getStyle()) {
            case 2: 
            case 3: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // android.widget.TextView
    protected void onFocusChanged(boolean z, int v, @m Rect rect0) {
        super.onFocusChanged(z, v, rect0);
        if(z) {
            RichToolbar richToolbar0 = this.m;
            if(richToolbar0 != null) {
                richToolbar0.setEditText(this);
            }
        }
    }

    @Override  // android.widget.TextView
    public boolean onKeyDown(int v, @m KeyEvent keyEvent0) {
        this.i = v;
        return super.onKeyDown(v, keyEvent0);
    }

    @Override  // android.widget.TextView
    public void onSelectionChanged(int v, int v1) {
        RichToolbar richToolbar0 = this.m;
        if(richToolbar0 == null) {
            return;
        }
        if(!L.g(richToolbar0.getEditText(), this)) {
            return;
        }
        this.q(richToolbar0, v, v1);
    }

    @Override  // android.widget.TextView
    protected void onTextChanged(@m CharSequence charSequence0, int v, int v1, int v2) {
        super.onTextChanged(charSequence0, v, v1, v2);
        if(!this.l) {
            return;
        }
        L.n(charSequence0, "null cannot be cast to non-null type android.text.Editable");
        List list0 = this.m == null ? null : this.m.getStyles();
        if(list0 != null) {
            for(Object object0: list0) {
                ((com.dcinside.rich.styles.b)object0).a(((Editable)charSequence0), v, v2 + v, ((com.dcinside.rich.styles.b)object0).isChecked());
            }
        }
        this.p();
    }

    @Override  // androidx.appcompat.widget.AppCompatEditText
    public boolean onTextContextMenuItem(int v) {
        this.j = v;
        return super.onTextContextMenuItem(v);
    }

    public final void p() {
        Function1 function10 = this.n;
        if(function10 != null) {
            function10.invoke(this);
        }
        RichToolbar richToolbar0 = this.m;
        if(richToolbar0 == null) {
            return;
        }
        if(!L.g(richToolbar0.getEditText(), this)) {
            return;
        }
        this.q(richToolbar0, this.getSelectionStart(), this.getSelectionEnd());
    }

    private final void q(RichToolbar richToolbar0, int v, int v1) {
        boolean z3;
        boolean z2;
        boolean z1;
        boolean z;
        Editable editable0 = this.getEditableText();
        Class class0 = CharacterStyle.class;
        if(v <= 0 || v != v1) {
            CharacterStyle[] arr_characterStyle1 = (CharacterStyle[])editable0.getSpans(v, v1, class0);
            L.m(arr_characterStyle1);
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            for(int v3 = 0; v3 < arr_characterStyle1.length; ++v3) {
                CharacterStyle characterStyle1 = arr_characterStyle1[v3];
                if(!(characterStyle1 instanceof StyleSpan)) {
                    if(characterStyle1 instanceof RichUnderlineSpan) {
                        if(!z6) {
                            L.m(characterStyle1);
                            L.m(editable0);
                            if(!this.n(characterStyle1, editable0, v, v1)) {
                                z6 = false;
                                continue;
                            }
                        }
                        z6 = true;
                    }
                    else if(characterStyle1 instanceof StrikethroughSpan) {
                        if(!z7) {
                            L.m(characterStyle1);
                            L.m(editable0);
                            if(!this.n(characterStyle1, editable0, v, v1)) {
                                z7 = false;
                                continue;
                            }
                        }
                        z7 = true;
                    }
                }
                else if(!z4 || !z5) {
                    if(z4) {
                        z4 = true;
                    }
                    else {
                        L.m(characterStyle1);
                        if(this.m(((StyleSpan)characterStyle1))) {
                            L.m(editable0);
                            if(!this.n(characterStyle1, editable0, v, v1)) {
                                z4 = false;
                            }
                        }
                        else {
                            z4 = false;
                        }
                    }
                    if(!z5) {
                        L.m(characterStyle1);
                        if(this.o(((StyleSpan)characterStyle1))) {
                            L.m(editable0);
                            if(!this.n(characterStyle1, editable0, v, v1)) {
                                z5 = false;
                                continue;
                            }
                        }
                        else {
                            z5 = false;
                            continue;
                        }
                    }
                    z5 = true;
                }
            }
            z = z4;
            z1 = z5;
            z2 = z6;
            z3 = z7;
        }
        else {
            CharacterStyle[] arr_characterStyle = (CharacterStyle[])editable0.getSpans(v - 1, v, class0);
            L.m(arr_characterStyle);
            z = false;
            z1 = false;
            z2 = false;
            z3 = false;
            for(int v2 = 0; v2 < arr_characterStyle.length; ++v2) {
                CharacterStyle characterStyle0 = arr_characterStyle[v2];
                if(!(characterStyle0 instanceof StyleSpan)) {
                    if(characterStyle0 instanceof RichUnderlineSpan) {
                        z2 = true;
                    }
                    else if(characterStyle0 instanceof StrikethroughSpan) {
                        z3 = true;
                    }
                }
                else if(!z || !z1) {
                    if(z) {
                        z = true;
                    }
                    else {
                        L.m(characterStyle0);
                        if(!this.m(((StyleSpan)characterStyle0))) {
                            z = false;
                        }
                    }
                    if(!z1) {
                        L.m(characterStyle0);
                        if(!this.o(((StyleSpan)characterStyle0))) {
                            z1 = false;
                            continue;
                        }
                    }
                    z1 = true;
                }
            }
        }
        com.dcinside.rich.styles.b b0 = richToolbar0.getBoldStyle();
        if(b0 != null) {
            b0.setChecked(z);
        }
        i i0 = richToolbar0.getItalicStyle();
        if(i0 != null) {
            i0.setChecked(z1);
        }
        com.dcinside.rich.styles.l l0 = richToolbar0.getUnderlineStyle();
        if(l0 != null) {
            l0.setChecked(z2);
        }
        com.dcinside.rich.styles.j j0 = richToolbar0.getStrikeThroughStyle();
        if(j0 != null) {
            j0.setChecked(z3);
        }
    }

    private final void r() {
        this.l = true;
    }

    private final void s() {
        this.l = false;
    }

    public final void setOnStyleApplyListener(@l Function1 function10) {
        L.p(function10, "onStyleApplyListener");
        this.n = function10;
    }

    public final void setRichTextWatcher(@m c c0) {
        this.g = c0;
        if(c0 == null) {
            this.removeTextChangedListener(this.h);
            return;
        }
        this.addTextChangedListener(this.h);
    }

    public final void setToolbar(@m RichToolbar richToolbar0) {
        this.m = richToolbar0;
    }
}

