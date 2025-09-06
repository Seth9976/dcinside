package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R.id;
import com.google.android.material.R.string;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.C;
import com.google.android.material.internal.M;
import java.lang.reflect.Field;
import java.util.Locale;

class n implements f, k {
    class a extends C {
        final n a;

        @Override  // com.google.android.material.internal.C
        public void afterTextChanged(Editable editable0) {
            try {
                if(TextUtils.isEmpty(editable0)) {
                    n.this.b.m(0);
                    return;
                }
                int v = Integer.parseInt(editable0.toString());
                n.this.b.m(v);
            }
            catch(NumberFormatException unused_ex) {
            }
        }
    }

    class b extends C {
        final n a;

        @Override  // com.google.android.material.internal.C
        public void afterTextChanged(Editable editable0) {
            try {
                if(TextUtils.isEmpty(editable0)) {
                    n.this.b.i(0);
                    return;
                }
                int v = Integer.parseInt(editable0.toString());
                n.this.b.i(v);
            }
            catch(NumberFormatException unused_ex) {
            }
        }
    }

    private final LinearLayout a;
    private final TimeModel b;
    private final TextWatcher c;
    private final TextWatcher d;
    private final ChipTextInputComboView e;
    private final ChipTextInputComboView f;
    private final l g;
    private final EditText h;
    private final EditText i;
    private MaterialButtonToggleGroup j;

    public n(LinearLayout linearLayout0, TimeModel timeModel0) {
        class c implements View.OnClickListener {
            final n a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                int v = (int)(((Integer)view0.getTag(id.selection_type)));
                n.this.d(v);
            }
        }


        class d extends com.google.android.material.timepicker.b {
            final TimeModel e;
            final n f;

            d(Context context0, int v, TimeModel timeModel0) {
                this.e = timeModel0;
                super(context0, v);
            }

            @Override  // com.google.android.material.timepicker.b
            public void g(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
                super.g(view0, accessibilityNodeInfoCompat0);
                accessibilityNodeInfoCompat0.p1(view0.getResources().getString(this.e.d(), new Object[]{String.valueOf(this.e.e())}));
            }
        }


        class e extends com.google.android.material.timepicker.b {
            final TimeModel e;
            final n f;

            e(Context context0, int v, TimeModel timeModel0) {
                this.e = timeModel0;
                super(context0, v);
            }

            @Override  // com.google.android.material.timepicker.b
            public void g(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
                super.g(view0, accessibilityNodeInfoCompat0);
                accessibilityNodeInfoCompat0.p1(view0.getResources().getString(string.material_minute_suffix, new Object[]{String.valueOf(this.e.e)}));
            }
        }

        this.c = new a(this);
        this.d = new b(this);
        this.a = linearLayout0;
        this.b = timeModel0;
        Resources resources0 = linearLayout0.getResources();
        ChipTextInputComboView chipTextInputComboView0 = (ChipTextInputComboView)linearLayout0.findViewById(id.material_minute_text_input);
        this.e = chipTextInputComboView0;
        ChipTextInputComboView chipTextInputComboView1 = (ChipTextInputComboView)linearLayout0.findViewById(id.material_hour_text_input);
        this.f = chipTextInputComboView1;
        TextView textView0 = (TextView)chipTextInputComboView0.findViewById(id.material_label);
        TextView textView1 = (TextView)chipTextInputComboView1.findViewById(id.material_label);
        textView0.setText(resources0.getString(string.material_timepicker_minute));
        textView1.setText(resources0.getString(string.material_timepicker_hour));
        chipTextInputComboView0.setTag(id.selection_type, 12);
        chipTextInputComboView1.setTag(id.selection_type, 10);
        if(timeModel0.c == 0) {
            this.l();
        }
        c n$c0 = new c(this);
        chipTextInputComboView1.setOnClickListener(n$c0);
        chipTextInputComboView0.setOnClickListener(n$c0);
        chipTextInputComboView1.c(timeModel0.f());
        chipTextInputComboView0.c(timeModel0.g());
        this.h = chipTextInputComboView1.f().getEditText();
        this.i = chipTextInputComboView0.f().getEditText();
        this.g = new l(chipTextInputComboView1, chipTextInputComboView0, timeModel0);
        chipTextInputComboView1.g(new d(this, linearLayout0.getContext(), string.material_hour_selection, timeModel0));
        chipTextInputComboView0.g(new e(this, linearLayout0.getContext(), string.material_minute_selection, timeModel0));
        this.initialize();
    }

    @Override  // com.google.android.material.timepicker.k
    public void a() {
        View view0 = this.a.getFocusedChild();
        if(view0 != null) {
            M.r(view0, false);
        }
        this.a.setVisibility(8);
    }

    @Override  // com.google.android.material.timepicker.TimePickerView$f
    public void d(int v) {
        this.b.f = v;
        boolean z = false;
        this.e.setChecked(v == 12);
        ChipTextInputComboView chipTextInputComboView0 = this.f;
        if(v == 10) {
            z = true;
        }
        chipTextInputComboView0.setChecked(z);
        this.m();
    }

    private void e() {
        this.h.addTextChangedListener(this.d);
        this.i.addTextChangedListener(this.c);
    }

    public void f() {
        this.e.setChecked(false);
        this.f.setChecked(false);
    }

    // 检测为 Lambda 实现
    private void g(MaterialButtonToggleGroup materialButtonToggleGroup0, int v, boolean z) [...]

    private void h() {
        this.h.removeTextChangedListener(this.d);
        this.i.removeTextChangedListener(this.c);
    }

    public void i() {
        boolean z = false;
        this.e.setChecked(this.b.f == 12);
        ChipTextInputComboView chipTextInputComboView0 = this.f;
        if(this.b.f == 10) {
            z = true;
        }
        chipTextInputComboView0.setChecked(z);
    }

    @Override  // com.google.android.material.timepicker.k
    public void initialize() {
        this.e();
        this.k(this.b);
        this.g.a();
    }

    @Override  // com.google.android.material.timepicker.k
    public void invalidate() {
        this.k(this.b);
    }

    private static void j(EditText editText0, @ColorInt int v) {
        try {
            Context context0 = editText0.getContext();
            Field field0 = TextView.class.getDeclaredField("mCursorDrawableRes");
            field0.setAccessible(true);
            int v1 = field0.getInt(editText0);
            Field field1 = TextView.class.getDeclaredField("mEditor");
            field1.setAccessible(true);
            Object object0 = field1.get(editText0);
            Field field2 = object0.getClass().getDeclaredField("mCursorDrawable");
            field2.setAccessible(true);
            Drawable drawable0 = AppCompatResources.b(context0, v1);
            drawable0.setColorFilter(v, PorterDuff.Mode.SRC_IN);
            field2.set(object0, new Drawable[]{drawable0, drawable0});
        }
        catch(Throwable unused_ex) {
        }
    }

    private void k(TimeModel timeModel0) {
        this.h();
        Locale locale0 = this.a.getResources().getConfiguration().locale;
        Object[] arr_object = {timeModel0.e};
        Object[] arr_object1 = {timeModel0.e()};
        this.e.j(String.format(locale0, "%02d", arr_object));
        this.f.j(String.format(locale0, "%02d", arr_object1));
        this.e();
        this.m();
    }

    private void l() {
        MaterialButtonToggleGroup materialButtonToggleGroup0 = (MaterialButtonToggleGroup)this.a.findViewById(id.material_clock_period_toggle);
        this.j = materialButtonToggleGroup0;
        materialButtonToggleGroup0.b((MaterialButtonToggleGroup materialButtonToggleGroup0, int v, boolean z) -> {
            if(!z) {
                return;
            }
            this.b.o((v == id.material_clock_period_pm_button ? 1 : 0));
        });
        this.j.setVisibility(0);
        this.m();
    }

    private void m() {
        MaterialButtonToggleGroup materialButtonToggleGroup0 = this.j;
        if(materialButtonToggleGroup0 == null) {
            return;
        }
        materialButtonToggleGroup0.e((this.b.g == 0 ? id.material_clock_period_am_button : id.material_clock_period_pm_button));
    }

    @Override  // com.google.android.material.timepicker.k
    public void show() {
        this.a.setVisibility(0);
        this.d(this.b.f);
    }
}

