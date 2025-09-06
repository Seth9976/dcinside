package com.hjq.toast;

import android.app.Application;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import y2.a;
import y2.b;

public class j extends Toast implements b {
    private TextView a;

    public j(Application application0) {
        super(application0);
    }

    @Override  // y2.b
    public TextView a(View view0) {
        return a.a(this, view0);
    }

    @Override  // android.widget.Toast, y2.b
    public void setText(CharSequence charSequence0) {
        super.setText(charSequence0);
        TextView textView0 = this.a;
        if(textView0 == null) {
            return;
        }
        textView0.setText(charSequence0);
    }

    @Override  // android.widget.Toast, y2.b
    public void setView(View view0) {
        super.setView(view0);
        if(view0 == null) {
            this.a = null;
            return;
        }
        this.a = this.a(view0);
    }
}

