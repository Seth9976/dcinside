package com.google.android.material.textfield;

import I1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.D;
import com.google.android.material.internal.l;

public class TextInputEditText extends AppCompatEditText {
    private final Rect g;
    private boolean h;

    public TextInputEditText(@NonNull Context context0) {
        this(context0, null);
    }

    public TextInputEditText(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.editTextStyle);
    }

    public TextInputEditText(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(a.c(context0, attributeSet0, v, 0), attributeSet0, v);
        this.g = new Rect();
        TypedArray typedArray0 = D.k(context0, attributeSet0, styleable.TextInputEditText, v, style.Widget_Design_TextInputEditText, new int[0]);
        this.setTextInputLayoutFocusedRectEnabled(typedArray0.getBoolean(styleable.TextInputEditText_textInputLayoutFocusedRectEnabled, false));
        typedArray0.recycle();
    }

    @NonNull
    private String f(@NonNull TextInputLayout textInputLayout0) {
        Editable editable0 = this.getText();
        CharSequence charSequence0 = textInputLayout0.getHint();
        boolean z = TextUtils.isEmpty(editable0);
        String s = "";
        String s1 = TextUtils.isEmpty(charSequence0) ? "" : charSequence0.toString();
        if(!z) {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(editable0);
            if(!TextUtils.isEmpty(s1)) {
                s = ", " + s1;
            }
            stringBuilder0.append(s);
            return stringBuilder0.toString();
        }
        return TextUtils.isEmpty(s1) ? "" : s1;
    }

    public boolean g() {
        return this.h;
    }

    @Override  // android.widget.TextView
    public void getFocusedRect(@Nullable Rect rect0) {
        super.getFocusedRect(rect0);
        TextInputLayout textInputLayout0 = this.getTextInputLayout();
        if(this.h(textInputLayout0) && rect0 != null) {
            textInputLayout0.getFocusedRect(this.g);
            rect0.bottom = this.g.bottom;
        }
    }

    @Override  // android.view.View
    public boolean getGlobalVisibleRect(@Nullable Rect rect0, @Nullable Point point0) {
        TextInputLayout textInputLayout0 = this.getTextInputLayout();
        if(this.h(textInputLayout0)) {
            boolean z = textInputLayout0.getGlobalVisibleRect(rect0, point0);
            if(z && point0 != null) {
                point0.offset(-this.getScrollX(), -this.getScrollY());
            }
            return z;
        }
        return super.getGlobalVisibleRect(rect0, point0);
    }

    @Override  // android.widget.TextView
    @Nullable
    public CharSequence getHint() {
        TextInputLayout textInputLayout0 = this.getTextInputLayout();
        return textInputLayout0 == null || !textInputLayout0.c0() ? super.getHint() : textInputLayout0.getHint();
    }

    @Nullable
    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout0 = this.getTextInputLayout();
        return textInputLayout0 == null ? null : textInputLayout0.getHint();
    }

    @Nullable
    private TextInputLayout getTextInputLayout() {
        for(ViewParent viewParent0 = this.getParent(); viewParent0 instanceof View; viewParent0 = viewParent0.getParent()) {
            if(viewParent0 instanceof TextInputLayout) {
                return (TextInputLayout)viewParent0;
            }
        }
        return null;
    }

    private boolean h(@Nullable TextInputLayout textInputLayout0) {
        return textInputLayout0 != null && this.h;
    }

    @Override  // android.widget.TextView
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout0 = this.getTextInputLayout();
        if(textInputLayout0 != null && textInputLayout0.c0() && super.getHint() == null && l.d()) {
            this.setHint("");
        }
    }

    @Override  // androidx.appcompat.widget.AppCompatEditText
    @Nullable
    public InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo0) {
        InputConnection inputConnection0 = super.onCreateInputConnection(editorInfo0);
        if(inputConnection0 != null && editorInfo0.hintText == null) {
            editorInfo0.hintText = this.getHintFromLayout();
        }
        return inputConnection0;
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        TextInputLayout textInputLayout0 = this.getTextInputLayout();
        if(Build.VERSION.SDK_INT < 23 && textInputLayout0 != null) {
            accessibilityNodeInfo0.setText(this.f(textInputLayout0));
        }
    }

    @Override  // android.view.View
    public boolean requestRectangleOnScreen(@Nullable Rect rect0) {
        TextInputLayout textInputLayout0 = this.getTextInputLayout();
        if(this.h(textInputLayout0) && rect0 != null) {
            int v = textInputLayout0.getHeight();
            int v1 = this.getHeight();
            this.g.set(rect0.left, rect0.top, rect0.right, rect0.bottom + (v - v1));
            return super.requestRectangleOnScreen(this.g);
        }
        return super.requestRectangleOnScreen(rect0);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.h = z;
    }
}

