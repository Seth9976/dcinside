package com.dcinside.app.view;

import android.content.Context;
import android.text.InputFilter.LengthFilter;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.StringRes;

public class k extends LinearLayout {
    private TextView a;
    private ClearableEditText b;
    private LinearLayout c;
    private TextView d;
    private TextView e;

    public k(Context context0) {
        super(context0);
        View.inflate(context0, 0x7F0E01F0, this);  // layout:view_input_string
        this.a = (TextView)this.findViewById(0x7F0B066D);  // id:input_string_title
        this.b = (ClearableEditText)this.findViewById(0x7F0B066C);  // id:input_string_text
        this.c = (LinearLayout)this.findViewById(0x7F0B066B);  // id:input_string_recent_parent
        this.d = (TextView)this.findViewById(0x7F0B066A);  // id:input_string_positive
        this.e = (TextView)this.findViewById(0x7F0B0669);  // id:input_string_negative
    }

    public TextView getNegativeButton() {
        return this.e;
    }

    public TextView getPositiveButton() {
        return this.d;
    }

    public LinearLayout getRecentParent() {
        return this.c;
    }

    public String getString() {
        return this.b.getText().toString();
    }

    public ClearableEditText getText() {
        return this.b;
    }

    public void setHint(@StringRes int v) {
        this.b.setHint(v);
    }

    public void setMaxLength(int v) {
        this.b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(v)});
    }

    public void setTitle(@StringRes int v) {
        this.a.setText(v);
    }

    public void setTitle(String s) {
        this.a.setText(s);
    }
}

