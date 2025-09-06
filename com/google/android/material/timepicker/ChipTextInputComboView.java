package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.C;
import com.google.android.material.internal.M;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

class ChipTextInputComboView extends FrameLayout implements Checkable {
    static class a {
    }

    class b extends C {
        final ChipTextInputComboView a;
        private static final String b = "00";

        private b() {
        }

        b(a chipTextInputComboView$a0) {
        }

        @Override  // com.google.android.material.internal.C
        public void afterTextChanged(Editable editable0) {
            if(TextUtils.isEmpty(editable0)) {
                ChipTextInputComboView.this.a.setText(ChipTextInputComboView.this.d("00"));
                return;
            }
            String s = ChipTextInputComboView.this.d(editable0);
            Chip chip0 = ChipTextInputComboView.this.a;
            if(TextUtils.isEmpty(s)) {
                s = ChipTextInputComboView.this.d("00");
            }
            chip0.setText(s);
        }
    }

    private final Chip a;
    private final TextInputLayout b;
    private final EditText c;
    private TextWatcher d;
    private TextView e;

    public ChipTextInputComboView(@NonNull Context context0) {
        this(context0, null);
    }

    public ChipTextInputComboView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ChipTextInputComboView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        LayoutInflater layoutInflater0 = LayoutInflater.from(context0);
        Chip chip0 = (Chip)layoutInflater0.inflate(layout.material_time_chip, this, false);
        this.a = chip0;
        chip0.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout0 = (TextInputLayout)layoutInflater0.inflate(layout.material_time_input, this, false);
        this.b = textInputLayout0;
        EditText editText0 = textInputLayout0.getEditText();
        this.c = editText0;
        editText0.setVisibility(4);
        b chipTextInputComboView$b0 = new b(this, null);
        this.d = chipTextInputComboView$b0;
        editText0.addTextChangedListener(chipTextInputComboView$b0);
        this.k();
        this.addView(chip0);
        this.addView(textInputLayout0);
        this.e = (TextView)this.findViewById(id.material_label);
        editText0.setId(ViewCompat.F());
        ViewCompat.g2(this.e, editText0.getId());
        editText0.setSaveEnabled(false);
        editText0.setLongClickable(false);
    }

    public void c(InputFilter inputFilter0) {
        InputFilter[] arr_inputFilter = this.c.getFilters();
        InputFilter[] arr_inputFilter1 = (InputFilter[])Arrays.copyOf(arr_inputFilter, arr_inputFilter.length + 1);
        arr_inputFilter1[arr_inputFilter.length] = inputFilter0;
        this.c.setFilters(arr_inputFilter1);
    }

    private String d(CharSequence charSequence0) {
        return TimeModel.a(this.getResources(), charSequence0);
    }

    @VisibleForTesting
    CharSequence e() {
        return this.a.getText();
    }

    public TextInputLayout f() {
        return this.b;
    }

    public void g(AccessibilityDelegateCompat accessibilityDelegateCompat0) {
        ViewCompat.J1(this.a, accessibilityDelegateCompat0);
    }

    public void h(boolean z) {
        this.c.setCursorVisible(z);
    }

    public void i(CharSequence charSequence0) {
        this.e.setText(charSequence0);
    }

    @Override  // android.widget.Checkable
    public boolean isChecked() {
        return this.a.isChecked();
    }

    public void j(CharSequence charSequence0) {
        String s = this.d(charSequence0);
        this.a.setText(s);
        if(!TextUtils.isEmpty(s)) {
            this.c.removeTextChangedListener(this.d);
            this.c.setText(s);
            this.c.addTextChangedListener(this.d);
        }
    }

    private void k() {
        if(Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList0 = this.getContext().getResources().getConfiguration().getLocales();
            this.c.setImeHintLocales(localeList0);
        }
    }

    @Override  // android.view.View
    protected void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.k();
    }

    @Override  // android.widget.Checkable
    public void setChecked(boolean z) {
        this.a.setChecked(z);
        this.c.setVisibility((z ? 0 : 4));
        this.a.setVisibility((z ? 8 : 0));
        if(this.isChecked()) {
            M.z(this.c, false);
        }
    }

    @Override  // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener view$OnClickListener0) {
        this.a.setOnClickListener(view$OnClickListener0);
    }

    @Override  // android.view.View
    public void setTag(int v, Object object0) {
        this.a.setTag(v, object0);
    }

    @Override  // android.widget.Checkable
    public void toggle() {
        this.a.toggle();
    }
}

