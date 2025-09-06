package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View.OnKeyListener;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView.OnEditorActionListener;
import android.widget.TextView;

class l implements View.OnKeyListener, TextView.OnEditorActionListener {
    private final ChipTextInputComboView a;
    private final ChipTextInputComboView b;
    private final TimeModel c;
    private boolean d;

    l(ChipTextInputComboView chipTextInputComboView0, ChipTextInputComboView chipTextInputComboView1, TimeModel timeModel0) {
        this.d = false;
        this.a = chipTextInputComboView0;
        this.b = chipTextInputComboView1;
        this.c = timeModel0;
    }

    public void a() {
        EditText editText0 = this.a.f().getEditText();
        EditText editText1 = this.b.f().getEditText();
        editText0.setImeOptions(0x10000005);
        editText1.setImeOptions(0x10000006);
        editText0.setOnEditorActionListener(this);
        editText0.setOnKeyListener(this);
        editText1.setOnKeyListener(this);
    }

    private void b(EditText editText0) {
        if(editText0.getSelectionStart() == 0 && editText0.length() == 2) {
            editText0.getText().clear();
        }
    }

    private void c(int v) {
        boolean z = false;
        this.b.setChecked(v == 12);
        ChipTextInputComboView chipTextInputComboView0 = this.a;
        if(v == 10) {
            z = true;
        }
        chipTextInputComboView0.setChecked(z);
        this.c.f = v;
    }

    private boolean d(int v, KeyEvent keyEvent0, EditText editText0) {
        Editable editable0 = editText0.getText();
        if(editable0 == null) {
            return false;
        }
        if(v >= 7 && v <= 16 && keyEvent0.getAction() == 1 && editText0.getSelectionStart() == 2 && editable0.length() == 2) {
            this.c(12);
            return true;
        }
        this.b(editText0);
        return false;
    }

    private boolean e(int v, KeyEvent keyEvent0, EditText editText0) {
        if(v == 67 && keyEvent0.getAction() == 0 && TextUtils.isEmpty(editText0.getText())) {
            this.c(10);
            return true;
        }
        this.b(editText0);
        return false;
    }

    @Override  // android.widget.TextView$OnEditorActionListener
    public boolean onEditorAction(TextView textView0, int v, KeyEvent keyEvent0) {
        if(v == 5) {
            this.c(12);
        }
        return v == 5;
    }

    @Override  // android.view.View$OnKeyListener
    public boolean onKey(View view0, int v, KeyEvent keyEvent0) {
        if(this.d) {
            return false;
        }
        this.d = true;
        boolean z = this.c.f == 12 ? this.e(v, keyEvent0, ((EditText)view0)) : this.d(v, keyEvent0, ((EditText)view0));
        this.d = false;
        return z;
    }
}

