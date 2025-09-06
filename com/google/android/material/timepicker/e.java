package com.google.android.material.timepicker;

import O1.a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.R.attr;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.R.string;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.resources.b;
import java.util.LinkedHashSet;
import java.util.Set;

public final class e extends DialogFragment implements d {
    public static final class com.google.android.material.timepicker.e.d {
        private TimeModel a;
        @Nullable
        private Integer b;
        @StringRes
        private int c;
        private CharSequence d;
        @StringRes
        private int e;
        private CharSequence f;
        @StringRes
        private int g;
        private CharSequence h;
        private int i;

        public com.google.android.material.timepicker.e.d() {
            this.a = new TimeModel();
            this.c = 0;
            this.e = 0;
            this.g = 0;
            this.i = 0;
        }

        @NonNull
        public e j() {
            return e.I0(this);
        }

        @a
        @NonNull
        public com.google.android.material.timepicker.e.d k(@IntRange(from = 0L, to = 23L) int v) {
            this.a.l(v);
            return this;
        }

        @a
        @NonNull
        public com.google.android.material.timepicker.e.d l(int v) {
            this.b = v;
            return this;
        }

        @a
        @NonNull
        public com.google.android.material.timepicker.e.d m(@IntRange(from = 0L, to = 59L) int v) {
            this.a.m(v);
            return this;
        }

        @a
        @NonNull
        public com.google.android.material.timepicker.e.d n(@StringRes int v) {
            this.g = v;
            return this;
        }

        @a
        @NonNull
        public com.google.android.material.timepicker.e.d o(@Nullable CharSequence charSequence0) {
            this.h = charSequence0;
            return this;
        }

        @a
        @NonNull
        public com.google.android.material.timepicker.e.d p(@StringRes int v) {
            this.e = v;
            return this;
        }

        @a
        @NonNull
        public com.google.android.material.timepicker.e.d q(@Nullable CharSequence charSequence0) {
            this.f = charSequence0;
            return this;
        }

        @a
        @NonNull
        public com.google.android.material.timepicker.e.d r(@StyleRes int v) {
            this.i = v;
            return this;
        }

        @a
        @NonNull
        public com.google.android.material.timepicker.e.d s(int v) {
            int v1 = this.a.d;
            int v2 = this.a.e;
            TimeModel timeModel0 = new TimeModel(v);
            this.a = timeModel0;
            timeModel0.m(v2);
            this.a.l(v1);
            return this;
        }

        @a
        @NonNull
        public com.google.android.material.timepicker.e.d t(@StringRes int v) {
            this.c = v;
            return this;
        }

        @a
        @NonNull
        public com.google.android.material.timepicker.e.d u(@Nullable CharSequence charSequence0) {
            this.d = charSequence0;
            return this;
        }
    }

    static final String A = "TIME_PICKER_TITLE_RES";
    static final String B = "TIME_PICKER_TITLE_TEXT";
    static final String C = "TIME_PICKER_POSITIVE_BUTTON_TEXT_RES";
    static final String D = "TIME_PICKER_POSITIVE_BUTTON_TEXT";
    static final String E = "TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES";
    static final String F = "TIME_PICKER_NEGATIVE_BUTTON_TEXT";
    static final String G = "TIME_PICKER_OVERRIDE_THEME_RES_ID";
    private final Set a;
    private final Set b;
    private final Set c;
    private final Set d;
    private TimePickerView e;
    private ViewStub f;
    @Nullable
    private i g;
    @Nullable
    private n h;
    @Nullable
    private k i;
    @DrawableRes
    private int j;
    @DrawableRes
    private int k;
    @StringRes
    private int l;
    private CharSequence m;
    @StringRes
    private int n;
    private CharSequence o;
    @StringRes
    private int p;
    private CharSequence q;
    private MaterialButton r;
    private Button s;
    private int t;
    private TimeModel u;
    private int v;
    public static final int w = 0;
    public static final int x = 1;
    static final String y = "TIME_PICKER_TIME_MODEL";
    static final String z = "TIME_PICKER_INPUT_MODE";

    public e() {
        this.a = new LinkedHashSet();
        this.b = new LinkedHashSet();
        this.c = new LinkedHashSet();
        this.d = new LinkedHashSet();
        this.l = 0;
        this.n = 0;
        this.p = 0;
        this.t = 0;
        this.v = 0;
    }

    private Pair A0(int v) {
        switch(v) {
            case 0: {
                return new Pair(this.j, string.material_timepicker_text_input_mode_description);
            }
            case 1: {
                return new Pair(this.k, string.material_timepicker_clock_mode_description);
            }
            default: {
                throw new IllegalArgumentException("no icon for mode: " + v);
            }
        }
    }

    @IntRange(from = 0L, to = 23L)
    public int B0() {
        return this.u.d % 24;
    }

    public int C0() {
        return this.t;
    }

    @IntRange(from = 0L, to = 59L)
    public int D0() {
        return this.u.e;
    }

    private int E0() {
        int v = this.v;
        if(v != 0) {
            return v;
        }
        TypedValue typedValue0 = b.a(this.requireContext(), attr.materialTimePickerTheme);
        return typedValue0 == null ? 0 : typedValue0.data;
    }

    @Nullable
    i F0() {
        return this.g;
    }

    private k G0(int v, @NonNull TimePickerView timePickerView0, @NonNull ViewStub viewStub0) {
        if(v == 0) {
            i i0 = this.g == null ? new i(timePickerView0, this.u) : this.g;
            this.g = i0;
            return i0;
        }
        if(this.h == null) {
            this.h = new n(((LinearLayout)viewStub0.inflate()), this.u);
        }
        this.h.f();
        return this.h;
    }

    // 检测为 Lambda 实现
    private void H0() [...]

    @NonNull
    private static e I0(@NonNull com.google.android.material.timepicker.e.d e$d0) {
        e e0 = new e();
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("TIME_PICKER_TIME_MODEL", e$d0.a);
        if(e$d0.b != null) {
            bundle0.putInt("TIME_PICKER_INPUT_MODE", ((int)e$d0.b));
        }
        bundle0.putInt("TIME_PICKER_TITLE_RES", e$d0.c);
        if(e$d0.d != null) {
            bundle0.putCharSequence("TIME_PICKER_TITLE_TEXT", e$d0.d);
        }
        bundle0.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", e$d0.e);
        if(e$d0.f != null) {
            bundle0.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", e$d0.f);
        }
        bundle0.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", e$d0.g);
        if(e$d0.h != null) {
            bundle0.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", e$d0.h);
        }
        bundle0.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", e$d0.i);
        e0.setArguments(bundle0);
        return e0;
    }

    public boolean J0(@NonNull DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        return this.c.remove(dialogInterface$OnCancelListener0);
    }

    public boolean K0(@NonNull DialogInterface.OnDismissListener dialogInterface$OnDismissListener0) {
        return this.d.remove(dialogInterface$OnDismissListener0);
    }

    public boolean L0(@NonNull View.OnClickListener view$OnClickListener0) {
        return this.b.remove(view$OnClickListener0);
    }

    public boolean M0(@NonNull View.OnClickListener view$OnClickListener0) {
        return this.a.remove(view$OnClickListener0);
    }

    private void N0(@Nullable Bundle bundle0) {
        if(bundle0 == null) {
            return;
        }
        TimeModel timeModel0 = (TimeModel)bundle0.getParcelable("TIME_PICKER_TIME_MODEL");
        this.u = timeModel0;
        if(timeModel0 == null) {
            this.u = new TimeModel();
        }
        this.t = bundle0.getInt("TIME_PICKER_INPUT_MODE", (this.u.c == 1 ? 1 : 0));
        this.l = bundle0.getInt("TIME_PICKER_TITLE_RES", 0);
        this.m = bundle0.getCharSequence("TIME_PICKER_TITLE_TEXT");
        this.n = bundle0.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        this.o = bundle0.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
        this.p = bundle0.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        this.q = bundle0.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
        this.v = bundle0.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
    }

    @VisibleForTesting
    void O0(@Nullable k k0) {
        this.i = k0;
    }

    public void P0(@IntRange(from = 0L, to = 23L) int v) {
        this.u.i(v);
        k k0 = this.i;
        if(k0 != null) {
            k0.invalidate();
        }
    }

    public void Q0(@IntRange(from = 0L, to = 59L) int v) {
        this.u.m(v);
        k k0 = this.i;
        if(k0 != null) {
            k0.invalidate();
        }
    }

    private void R0() {
        Button button0 = this.s;
        if(button0 != null) {
            button0.setVisibility((this.isCancelable() ? 0 : 8));
        }
    }

    private void S0(MaterialButton materialButton0) {
        if(materialButton0 != null && this.e != null && this.f != null) {
            k k0 = this.i;
            if(k0 != null) {
                k0.a();
            }
            k k1 = this.G0(this.t, this.e, this.f);
            this.i = k1;
            k1.show();
            this.i.invalidate();
            Pair pair0 = this.A0(this.t);
            materialButton0.setIconResource(((int)(((Integer)pair0.first))));
            materialButton0.setContentDescription(this.getResources().getString(((int)(((Integer)pair0.second)))));
            materialButton0.sendAccessibilityEvent(4);
        }
    }

    @Override  // com.google.android.material.timepicker.TimePickerView$d
    @RestrictTo({Scope.b})
    public void k() {
        this.t = 1;
        this.S0(this.r);
        this.h.i();
    }

    @Override  // androidx.fragment.app.DialogFragment
    public final void onCancel(@NonNull DialogInterface dialogInterface0) {
        for(Object object0: this.c) {
            ((DialogInterface.OnCancelListener)object0).onCancel(dialogInterface0);
        }
        super.onCancel(dialogInterface0);
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 == null) {
            bundle0 = this.getArguments();
        }
        this.N0(bundle0);
    }

    @Override  // androidx.fragment.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle0) {
        Dialog dialog0 = new Dialog(this.requireContext(), this.E0());
        Context context0 = dialog0.getContext();
        com.google.android.material.shape.k k0 = new com.google.android.material.shape.k(context0, null, attr.materialTimePickerStyle, style.Widget_MaterialComponents_TimePicker);
        TypedArray typedArray0 = context0.obtainStyledAttributes(null, styleable.MaterialTimePicker, attr.materialTimePickerStyle, style.Widget_MaterialComponents_TimePicker);
        this.k = typedArray0.getResourceId(styleable.MaterialTimePicker_clockIcon, 0);
        this.j = typedArray0.getResourceId(styleable.MaterialTimePicker_keyboardIcon, 0);
        int v = typedArray0.getColor(styleable.MaterialTimePicker_backgroundTint, 0);
        typedArray0.recycle();
        k0.a0(context0);
        k0.p0(ColorStateList.valueOf(v));
        Window window0 = dialog0.getWindow();
        window0.setBackgroundDrawable(k0);
        window0.requestFeature(1);
        window0.setLayout(-2, -2);
        k0.o0(ViewCompat.V(window0.getDecorView()));
        return dialog0;
    }

    @Override  // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        class com.google.android.material.timepicker.e.a implements View.OnClickListener {
            final e a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                for(Object object0: e.this.a) {
                    ((View.OnClickListener)object0).onClick(view0);
                }
                e.this.dismiss();
            }
        }


        class com.google.android.material.timepicker.e.b implements View.OnClickListener {
            final e a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                for(Object object0: e.this.b) {
                    ((View.OnClickListener)object0).onClick(view0);
                }
                e.this.dismiss();
            }
        }


        class c implements View.OnClickListener {
            final e a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                e.this.t = e.this.t == 0 ? 1 : 0;
                e.this.S0(e.this.r);
            }
        }

        View view0 = (ViewGroup)layoutInflater0.inflate(layout.material_timepicker_dialog, viewGroup0);
        TimePickerView timePickerView0 = (TimePickerView)view0.findViewById(id.material_timepicker_view);
        this.e = timePickerView0;
        timePickerView0.M(this);
        this.f = (ViewStub)view0.findViewById(id.material_textinput_timepicker);
        this.r = (MaterialButton)view0.findViewById(id.material_timepicker_mode_button);
        TextView textView0 = (TextView)view0.findViewById(id.header_title);
        int v = this.l;
        if(v != 0) {
            textView0.setText(v);
        }
        else if(!TextUtils.isEmpty(this.m)) {
            textView0.setText(this.m);
        }
        this.S0(this.r);
        Button button0 = (Button)view0.findViewById(id.material_timepicker_ok_button);
        button0.setOnClickListener(new com.google.android.material.timepicker.e.a(this));
        int v1 = this.n;
        if(v1 != 0) {
            button0.setText(v1);
        }
        else if(!TextUtils.isEmpty(this.o)) {
            button0.setText(this.o);
        }
        Button button1 = (Button)view0.findViewById(id.material_timepicker_cancel_button);
        this.s = button1;
        button1.setOnClickListener(new com.google.android.material.timepicker.e.b(this));
        int v2 = this.p;
        if(v2 != 0) {
            this.s.setText(v2);
        }
        else if(!TextUtils.isEmpty(this.q)) {
            this.s.setText(this.q);
        }
        this.R0();
        this.r.setOnClickListener(new c(this));
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onDestroyView() {
        super.onDestroyView();
        this.i = null;
        this.g = null;
        this.h = null;
        TimePickerView timePickerView0 = this.e;
        if(timePickerView0 != null) {
            timePickerView0.M(null);
            this.e = null;
        }
    }

    @Override  // androidx.fragment.app.DialogFragment
    public final void onDismiss(@NonNull DialogInterface dialogInterface0) {
        for(Object object0: this.d) {
            ((DialogInterface.OnDismissListener)object0).onDismiss(dialogInterface0);
        }
        super.onDismiss(dialogInterface0);
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onSaveInstanceState(@NonNull Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putParcelable("TIME_PICKER_TIME_MODEL", this.u);
        bundle0.putInt("TIME_PICKER_INPUT_MODE", this.t);
        bundle0.putInt("TIME_PICKER_TITLE_RES", this.l);
        bundle0.putCharSequence("TIME_PICKER_TITLE_TEXT", this.m);
        bundle0.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.n);
        bundle0.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.o);
        bundle0.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.p);
        bundle0.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.q);
        bundle0.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.v);
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view0, @Nullable Bundle bundle0) {
        super.onViewCreated(view0, bundle0);
        if(this.i instanceof n) {
            view0.postDelayed(() -> {
                k k0 = this.i;
                if(k0 instanceof n) {
                    ((n)k0).i();
                }
            }, 100L);
        }
    }

    public boolean s0(@NonNull DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        return this.c.add(dialogInterface$OnCancelListener0);
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        this.R0();
    }

    public boolean t0(@NonNull DialogInterface.OnDismissListener dialogInterface$OnDismissListener0) {
        return this.d.add(dialogInterface$OnDismissListener0);
    }

    public boolean u0(@NonNull View.OnClickListener view$OnClickListener0) {
        return this.b.add(view$OnClickListener0);
    }

    public boolean v0(@NonNull View.OnClickListener view$OnClickListener0) {
        return this.a.add(view$OnClickListener0);
    }

    public void w0() {
        this.c.clear();
    }

    public void x0() {
        this.d.clear();
    }

    public void y0() {
        this.b.clear();
    }

    public void z0() {
        this.a.clear();
    }
}

