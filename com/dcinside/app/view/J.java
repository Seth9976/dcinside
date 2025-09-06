package com.dcinside.app.view;

import android.content.Context;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;

public class j extends FrameLayout {
    private EditText a;

    public j(Context context0) {
        super(context0);
        View.inflate(context0, 0x7F0E01EF, this);  // layout:view_input_pw
        EditText editText0 = (EditText)this.findViewById(0x7F0B0645);  // id:input_pw_text
        this.a = editText0;
        editText0.setPrivateImeOptions("defaultInputmode=english;");
        this.a.setTransformationMethod(new PasswordTransformationMethod());
    }

    public String getString() {
        return this.a.getText().toString();
    }

    public EditText getText() {
        return this.a;
    }
}

