package com.google.android.material.datepicker;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R.string;
import com.google.android.material.internal.C;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

abstract class e extends C {
    @NonNull
    private final TextInputLayout a;
    private final String b;
    private final DateFormat c;
    private final CalendarConstraints d;
    private final String e;
    private final Runnable f;
    private Runnable g;
    private int h;

    e(String s, DateFormat dateFormat0, @NonNull TextInputLayout textInputLayout0, CalendarConstraints calendarConstraints0) {
        this.h = 0;
        this.b = s;
        this.c = dateFormat0;
        this.a = textInputLayout0;
        this.d = calendarConstraints0;
        this.e = textInputLayout0.getContext().getString(string.mtrl_picker_out_of_range);
        this.f = () -> {
            Context context0 = this.a.getContext();
            String s1 = context0.getString(string.mtrl_picker_invalid_format);
            String s2 = context0.getString(string.mtrl_picker_invalid_format_use);
            String s3 = context0.getString(string.mtrl_picker_invalid_format_example);
            Date date0 = new Date(com.google.android.material.datepicker.C.v().getTimeInMillis());
            Object[] arr_object = {this.i(this.c.format(date0))};
            this.a.setError(s1 + "\n" + String.format(s2, this.i(s)) + "\n" + String.format(s3, arr_object));
            this.f();
        };
    }

    @Override  // com.google.android.material.internal.C
    public void afterTextChanged(@NonNull Editable editable0) {
        if(Locale.getDefault().getLanguage().equals("ko")) {
            return;
        }
        if(editable0.length() != 0 && editable0.length() < this.b.length() && editable0.length() >= this.h) {
            int v = editable0.length();
            int v1 = this.b.charAt(v);
            if(!Character.isLetterOrDigit(((char)v1))) {
                editable0.append(((char)v1));
            }
        }
    }

    @Override  // com.google.android.material.internal.C
    public void beforeTextChanged(@NonNull CharSequence charSequence0, int v, int v1, int v2) {
        this.h = charSequence0.length();
    }

    private Runnable c(long v) {
        return () -> {
            Object[] arr_object = {this.i(j.c(v))};
            this.a.setError(String.format(this.e, arr_object));
            this.f();
        };
    }

    // 检测为 Lambda 实现
    private void d(long v) [...]

    // 检测为 Lambda 实现
    private void e(String s) [...]

    void f() {
    }

    abstract void g(@Nullable Long arg1);

    public void h(View view0, Runnable runnable0) {
        view0.post(runnable0);
    }

    private String i(String s) {
        return s.replace(' ', ' ');
    }

    @Override  // com.google.android.material.internal.C
    public void onTextChanged(@NonNull CharSequence charSequence0, int v, int v1, int v2) {
        this.a.removeCallbacks(this.f);
        this.a.removeCallbacks(this.g);
        this.a.setError(null);
        this.g(null);
        if(!TextUtils.isEmpty(charSequence0) && charSequence0.length() >= this.b.length()) {
            try {
                Date date0 = this.c.parse(charSequence0.toString());
                this.a.setError(null);
                long v3 = date0.getTime();
                if(this.d.h().k(v3) && this.d.v(v3)) {
                    this.g(date0.getTime());
                    return;
                }
                Runnable runnable0 = this.c(v3);
                this.g = runnable0;
                this.h(this.a, runnable0);
            }
            catch(ParseException unused_ex) {
                this.h(this.a, this.f);
            }
        }
    }
}

