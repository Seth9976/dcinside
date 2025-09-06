package com.dcinside.app.view;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.StringRes;

public class i extends FrameLayout {
    private EditText a;
    private TextView b;

    public i(Context context0) {
        super(context0);
        View.inflate(context0, 0x7F0E01EE, this);  // layout:view_input_number
        View view0 = this.findViewById(0x7F0B0643);  // id:input_number_increase
        View view1 = this.findViewById(0x7F0B0641);  // id:input_number_decrease
        this.a = (EditText)this.findViewById(0x7F0B0644);  // id:input_number_text
        this.b = (TextView)this.findViewById(0x7F0B0642);  // id:input_number_desc
        view0.setOnClickListener((View view0) -> this.f());
        view1.setOnClickListener((View view0) -> this.e());
    }

    // 检测为 Lambda 实现
    private void c(View view0) [...]

    // 检测为 Lambda 实现
    private void d(View view0) [...]

    private void e() {
        this.a.setText(String.valueOf(Math.max(0, this.getNumber() - 1)));
    }

    private void f() {
        this.a.setText(String.valueOf(Math.max(0, this.getNumber() + 1)));
    }

    public int getNumber() {
        try {
            return Integer.parseInt(this.a.getText().toString());
        }
        catch(Exception unused_ex) {
            return 0;
        }
    }

    public EditText getText() {
        return this.a;
    }

    public void setDesc(@StringRes int v) {
        this.b.setText(v);
    }

    public void setNumber(int v) {
        this.a.setText(String.valueOf(v));
        this.a.setSelection(0, this.a.getText().length());
    }
}

