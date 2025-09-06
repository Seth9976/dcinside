package com.google.android.material.datepicker;

import O1.a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.drawable;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.R.string;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.M;
import com.google.android.material.shape.k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.SimpleDateFormat;
import java.util.LinkedHashSet;

public final class n extends DialogFragment {
    public static final class e {
        final DateSelector a;
        int b;
        CalendarConstraints c;
        @Nullable
        DayViewDecorator d;
        int e;
        CharSequence f;
        int g;
        CharSequence h;
        int i;
        CharSequence j;
        int k;
        CharSequence l;
        int m;
        CharSequence n;
        @Nullable
        Object o;
        int p;

        private e(DateSelector dateSelector0) {
            this.b = 0;
            this.e = 0;
            this.f = null;
            this.g = 0;
            this.h = null;
            this.i = 0;
            this.j = null;
            this.k = 0;
            this.l = null;
            this.m = 0;
            this.n = null;
            this.o = null;
            this.p = 0;
            this.a = dateSelector0;
        }

        @NonNull
        public n a() {
            if(this.c == null) {
                this.c = new b().a();
            }
            if(this.e == 0) {
                this.e = this.a.b();
            }
            Object object0 = this.o;
            if(object0 != null) {
                this.a.n(object0);
            }
            if(this.c.q() == null) {
                this.c.w(this.b());
            }
            return n.M0(this);
        }

        private Month b() {
            if(!this.a.T().isEmpty()) {
                Object object0 = this.a.T().iterator().next();
                Month month0 = Month.d(((long)(((Long)object0))));
                if(e.f(month0, this.c)) {
                    return month0;
                }
            }
            Month month1 = Month.e();
            return e.f(month1, this.c) ? month1 : this.c.s();
        }

        @NonNull
        @RestrictTo({Scope.b})
        public static e c(@NonNull DateSelector dateSelector0) {
            return new e(dateSelector0);
        }

        @NonNull
        public static e d() {
            return new e(new SingleDateSelector());
        }

        @NonNull
        public static e e() {
            return new e(new RangeDateSelector());
        }

        private static boolean f(Month month0, CalendarConstraints calendarConstraints0) {
            return month0.a(calendarConstraints0.s()) >= 0 && month0.a(calendarConstraints0.i()) <= 0;
        }

        @a
        @NonNull
        public e g(CalendarConstraints calendarConstraints0) {
            this.c = calendarConstraints0;
            return this;
        }

        @a
        @NonNull
        public e h(@Nullable DayViewDecorator dayViewDecorator0) {
            this.d = dayViewDecorator0;
            return this;
        }

        @a
        @NonNull
        public e i(int v) {
            this.p = v;
            return this;
        }

        @a
        @NonNull
        public e j(@StringRes int v) {
            this.m = v;
            this.n = null;
            return this;
        }

        @a
        @NonNull
        public e k(@Nullable CharSequence charSequence0) {
            this.n = charSequence0;
            this.m = 0;
            return this;
        }

        @a
        @NonNull
        public e l(@StringRes int v) {
            this.k = v;
            this.l = null;
            return this;
        }

        @a
        @NonNull
        public e m(@Nullable CharSequence charSequence0) {
            this.l = charSequence0;
            this.k = 0;
            return this;
        }

        @a
        @NonNull
        public e n(@StringRes int v) {
            this.i = v;
            this.j = null;
            return this;
        }

        @a
        @NonNull
        public e o(@Nullable CharSequence charSequence0) {
            this.j = charSequence0;
            this.i = 0;
            return this;
        }

        @a
        @NonNull
        public e p(@StringRes int v) {
            this.g = v;
            this.h = null;
            return this;
        }

        @a
        @NonNull
        public e q(@Nullable CharSequence charSequence0) {
            this.h = charSequence0;
            this.g = 0;
            return this;
        }

        @a
        @NonNull
        public e r(Object object0) {
            this.o = object0;
            return this;
        }

        @a
        @NonNull
        public e s(@Nullable SimpleDateFormat simpleDateFormat0) {
            this.a.Q(simpleDateFormat0);
            return this;
        }

        @a
        @NonNull
        public e t(@StyleRes int v) {
            this.b = v;
            return this;
        }

        @a
        @NonNull
        public e u(@StringRes int v) {
            this.e = v;
            this.f = null;
            return this;
        }

        @a
        @NonNull
        public e v(@Nullable CharSequence charSequence0) {
            this.f = charSequence0;
            this.e = 0;
            return this;
        }
    }

    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    private Button A;
    private boolean B;
    @Nullable
    private CharSequence C;
    @Nullable
    private CharSequence D;
    private static final String E = "OVERRIDE_THEME_RES_ID";
    private static final String F = "DATE_SELECTOR_KEY";
    private static final String G = "CALENDAR_CONSTRAINTS_KEY";
    private static final String H = "DAY_VIEW_DECORATOR_KEY";
    private static final String I = "TITLE_TEXT_RES_ID_KEY";
    private static final String J = "TITLE_TEXT_KEY";
    private static final String K = "POSITIVE_BUTTON_TEXT_RES_ID_KEY";
    private static final String L = "POSITIVE_BUTTON_TEXT_KEY";
    private static final String M = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY";
    static final Object M8 = null;
    private static final String N = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY";
    static final Object N8 = null;
    private static final String O = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY";
    public static final int O8 = 0;
    private static final String P = "NEGATIVE_BUTTON_TEXT_KEY";
    public static final int P8 = 1;
    private static final String Q = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY";
    private static final String X = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY";
    private static final String Y = "INPUT_MODE_KEY";
    static final Object Z;
    private final LinkedHashSet a;
    private final LinkedHashSet b;
    private final LinkedHashSet c;
    private final LinkedHashSet d;
    @StyleRes
    private int e;
    @Nullable
    private DateSelector f;
    private u g;
    @Nullable
    private CalendarConstraints h;
    @Nullable
    private DayViewDecorator i;
    private l j;
    @StringRes
    private int k;
    private CharSequence l;
    private boolean m;
    private int n;
    @StringRes
    private int o;
    private CharSequence p;
    @StringRes
    private int q;
    private CharSequence r;
    @StringRes
    private int s;
    private CharSequence t;
    @StringRes
    private int u;
    private CharSequence v;
    private TextView w;
    private TextView x;
    private CheckableImageButton y;
    @Nullable
    private k z;

    static {
        n.Z = "CONFIRM_BUTTON_TAG";
        n.M8 = "CANCEL_BUTTON_TAG";
        n.N8 = "TOGGLE_BUTTON_TAG";
    }

    public n() {
        this.a = new LinkedHashSet();
        this.b = new LinkedHashSet();
        this.c = new LinkedHashSet();
        this.d = new LinkedHashSet();
    }

    @Nullable
    private static CharSequence A0(@Nullable CharSequence charSequence0) {
        if(charSequence0 != null) {
            String[] arr_s = TextUtils.split(String.valueOf(charSequence0), "\n");
            return arr_s.length > 1 ? arr_s[0] : charSequence0;
        }
        return null;
    }

    private String B0() {
        return this.z0().Q1(this.requireContext());
    }

    public String C0() {
        return this.z0().P2(this.getContext());
    }

    public int D0() {
        return this.n;
    }

    private static int E0(@NonNull Context context0) {
        Resources resources0 = context0.getResources();
        int v = resources0.getDimensionPixelOffset(dimen.mtrl_calendar_content_padding);
        Month month0 = Month.e();
        int v1 = resources0.getDimensionPixelSize(dimen.mtrl_calendar_day_width);
        int v2 = resources0.getDimensionPixelOffset(dimen.mtrl_calendar_month_horizontal_padding);
        return v * 2 + v1 * month0.d + (month0.d - 1) * v2;
    }

    @Nullable
    public final Object F0() {
        return this.z0().h0();
    }

    private int G0(Context context0) {
        int v = this.e;
        return v == 0 ? this.z0().j(context0) : v;
    }

    private void H0(Context context0) {
        this.y.setTag(n.N8);
        this.y.setImageDrawable(n.x0(context0));
        this.y.setChecked(this.n != 0);
        ViewCompat.J1(this.y, null);
        this.X0(this.y);
        this.y.setOnClickListener((View view0) -> {
            this.A.setEnabled(this.z0().R());
            this.y.toggle();
            this.n = this.n == 1 ? 0 : 1;
            this.X0(this.y);
            this.S0();
        });
    }

    static boolean I0(@NonNull Context context0) {
        return n.N0(context0, 0x101020D);
    }

    private boolean J0() {
        return this.getResources().getConfiguration().orientation == 2;
    }

    static boolean K0(@NonNull Context context0) {
        return n.N0(context0, attr.nestedScrollable);
    }

    // 检测为 Lambda 实现
    private void L0(View view0) [...]

    @NonNull
    static n M0(@NonNull e n$e0) {
        n n0 = new n();
        Bundle bundle0 = new Bundle();
        bundle0.putInt("OVERRIDE_THEME_RES_ID", n$e0.b);
        bundle0.putParcelable("DATE_SELECTOR_KEY", n$e0.a);
        bundle0.putParcelable("CALENDAR_CONSTRAINTS_KEY", n$e0.c);
        bundle0.putParcelable("DAY_VIEW_DECORATOR_KEY", n$e0.d);
        bundle0.putInt("TITLE_TEXT_RES_ID_KEY", n$e0.e);
        bundle0.putCharSequence("TITLE_TEXT_KEY", n$e0.f);
        bundle0.putInt("INPUT_MODE_KEY", n$e0.p);
        bundle0.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", n$e0.g);
        bundle0.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", n$e0.h);
        bundle0.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", n$e0.i);
        bundle0.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", n$e0.j);
        bundle0.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", n$e0.k);
        bundle0.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", n$e0.l);
        bundle0.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", n$e0.m);
        bundle0.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", n$e0.n);
        n0.setArguments(bundle0);
        return n0;
    }

    static boolean N0(@NonNull Context context0, int v) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(com.google.android.material.resources.b.g(context0, attr.materialCalendarStyle, l.class.getCanonicalName()), new int[]{v});
        boolean z = typedArray0.getBoolean(0, false);
        typedArray0.recycle();
        return z;
    }

    public boolean O0(DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        return this.c.remove(dialogInterface$OnCancelListener0);
    }

    public boolean P0(DialogInterface.OnDismissListener dialogInterface$OnDismissListener0) {
        return this.d.remove(dialogInterface$OnDismissListener0);
    }

    public boolean Q0(View.OnClickListener view$OnClickListener0) {
        return this.b.remove(view$OnClickListener0);
    }

    public boolean R0(o o0) {
        return this.a.remove(o0);
    }

    private void S0() {
        class d extends t {
            final n a;

            @Override  // com.google.android.material.datepicker.t
            public void a() {
                n.this.A.setEnabled(false);
            }

            @Override  // com.google.android.material.datepicker.t
            public void b(Object object0) {
                String s = n.this.C0();
                n.this.V0(s);
                boolean z = n.this.z0().R();
                n.this.A.setEnabled(z);
            }
        }

        int v = this.G0(this.requireContext());
        l l0 = l.C0(this.z0(), v, this.h, this.i);
        this.j = l0;
        if(this.n == 1) {
            l0 = q.m0(this.z0(), v, this.h);
        }
        this.g = l0;
        this.W0();
        this.V0(this.C0());
        FragmentTransaction fragmentTransaction0 = this.getChildFragmentManager().u();
        fragmentTransaction0.C(id.mtrl_calendar_frame, this.g);
        fragmentTransaction0.s();
        this.g.i0(new d(this));
    }

    public static long T0() {
        return Month.e().f;
    }

    public static long U0() {
        return C.v().getTimeInMillis();
    }

    @VisibleForTesting
    void V0(String s) {
        this.x.setContentDescription(this.B0());
        this.x.setText(s);
    }

    private void W0() {
        this.w.setText((this.n != 1 || !this.J0() ? this.C : this.D));
    }

    private void X0(@NonNull CheckableImageButton checkableImageButton0) {
        String s = this.n == 1 ? checkableImageButton0.getContext().getString(string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton0.getContext().getString(string.mtrl_picker_toggle_to_text_input_mode);
        this.y.setContentDescription(s);
    }

    @Override  // androidx.fragment.app.DialogFragment
    public final void onCancel(@NonNull DialogInterface dialogInterface0) {
        for(Object object0: this.c) {
            ((DialogInterface.OnCancelListener)object0).onCancel(dialogInterface0);
        }
        super.onCancel(dialogInterface0);
    }

    @Override  // androidx.fragment.app.DialogFragment
    public final void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 == null) {
            bundle0 = this.getArguments();
        }
        this.e = bundle0.getInt("OVERRIDE_THEME_RES_ID");
        this.f = (DateSelector)bundle0.getParcelable("DATE_SELECTOR_KEY");
        this.h = (CalendarConstraints)bundle0.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.i = (DayViewDecorator)bundle0.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.k = bundle0.getInt("TITLE_TEXT_RES_ID_KEY");
        this.l = bundle0.getCharSequence("TITLE_TEXT_KEY");
        this.n = bundle0.getInt("INPUT_MODE_KEY");
        this.o = bundle0.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.p = bundle0.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.q = bundle0.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.r = bundle0.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.s = bundle0.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.t = bundle0.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.u = bundle0.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.v = bundle0.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence0 = this.l == null ? this.requireContext().getResources().getText(this.k) : this.l;
        this.C = charSequence0;
        this.D = n.A0(charSequence0);
    }

    @Override  // androidx.fragment.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle0) {
        Dialog dialog0 = new Dialog(this.requireContext(), this.G0(this.requireContext()));
        Context context0 = dialog0.getContext();
        this.m = n.I0(context0);
        this.z = new k(context0, null, attr.materialCalendarStyle, style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArray0 = context0.obtainStyledAttributes(null, styleable.MaterialCalendar, attr.materialCalendarStyle, style.Widget_MaterialComponents_MaterialCalendar);
        int v = typedArray0.getColor(styleable.MaterialCalendar_backgroundTint, 0);
        typedArray0.recycle();
        this.z.a0(context0);
        this.z.p0(ColorStateList.valueOf(v));
        this.z.o0(ViewCompat.V(dialog0.getWindow().getDecorView()));
        return dialog0;
    }

    @Override  // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        class com.google.android.material.datepicker.n.a implements View.OnClickListener {
            final n a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                for(Object object0: n.this.a) {
                    ((o)object0).a(n.this.F0());
                }
                n.this.dismiss();
            }
        }


        class com.google.android.material.datepicker.n.b implements View.OnClickListener {
            final n a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                for(Object object0: n.this.b) {
                    ((View.OnClickListener)object0).onClick(view0);
                }
                n.this.dismiss();
            }
        }

        View view0 = layoutInflater0.inflate((this.m ? layout.mtrl_picker_fullscreen : layout.mtrl_picker_dialog), viewGroup0);
        Context context0 = view0.getContext();
        if(this.m) {
            view0.findViewById(id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(n.E0(context0), -2));
        }
        else {
            view0.findViewById(id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(n.E0(context0), -1));
        }
        TextView textView0 = (TextView)view0.findViewById(id.mtrl_picker_header_selection_text);
        this.x = textView0;
        ViewCompat.L1(textView0, 1);
        this.y = (CheckableImageButton)view0.findViewById(id.mtrl_picker_header_toggle);
        this.w = (TextView)view0.findViewById(id.mtrl_picker_title_text);
        this.H0(context0);
        this.A = (Button)view0.findViewById(id.confirm_button);
        if(this.z0().R()) {
            this.A.setEnabled(true);
        }
        else {
            this.A.setEnabled(false);
        }
        this.A.setTag(n.Z);
        CharSequence charSequence0 = this.p;
        if(charSequence0 == null) {
            int v = this.o;
            if(v != 0) {
                this.A.setText(v);
            }
        }
        else {
            this.A.setText(charSequence0);
        }
        CharSequence charSequence1 = this.r;
        if(charSequence1 != null) {
            this.A.setContentDescription(charSequence1);
        }
        else if(this.q != 0) {
            this.A.setContentDescription(this.getContext().getResources().getText(this.q));
        }
        this.A.setOnClickListener(new com.google.android.material.datepicker.n.a(this));
        Button button0 = (Button)view0.findViewById(id.cancel_button);
        button0.setTag(n.M8);
        CharSequence charSequence2 = this.t;
        if(charSequence2 == null) {
            int v1 = this.s;
            if(v1 != 0) {
                button0.setText(v1);
            }
        }
        else {
            button0.setText(charSequence2);
        }
        CharSequence charSequence3 = this.v;
        if(charSequence3 != null) {
            button0.setContentDescription(charSequence3);
        }
        else if(this.u != 0) {
            button0.setContentDescription(this.getContext().getResources().getText(this.u));
        }
        button0.setOnClickListener(new com.google.android.material.datepicker.n.b(this));
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public final void onDismiss(@NonNull DialogInterface dialogInterface0) {
        for(Object object0: this.d) {
            ((DialogInterface.OnDismissListener)object0).onDismiss(dialogInterface0);
        }
        ViewGroup viewGroup0 = (ViewGroup)this.getView();
        if(viewGroup0 != null) {
            viewGroup0.removeAllViews();
        }
        super.onDismiss(dialogInterface0);
    }

    @Override  // androidx.fragment.app.DialogFragment
    public final void onSaveInstanceState(@NonNull Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putInt("OVERRIDE_THEME_RES_ID", this.e);
        bundle0.putParcelable("DATE_SELECTOR_KEY", this.f);
        b calendarConstraints$b0 = new b(this.h);
        Month month0 = this.j == null ? null : this.j.x0();
        if(month0 != null) {
            calendarConstraints$b0.d(month0.f);
        }
        bundle0.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints$b0.a());
        bundle0.putParcelable("DAY_VIEW_DECORATOR_KEY", this.i);
        bundle0.putInt("TITLE_TEXT_RES_ID_KEY", this.k);
        bundle0.putCharSequence("TITLE_TEXT_KEY", this.l);
        bundle0.putInt("INPUT_MODE_KEY", this.n);
        bundle0.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.o);
        bundle0.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.p);
        bundle0.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.q);
        bundle0.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.r);
        bundle0.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.s);
        bundle0.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.t);
        bundle0.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.u);
        bundle0.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.v);
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onStart() {
        super.onStart();
        Window window0 = this.requireDialog().getWindow();
        if(this.m) {
            window0.setLayout(-1, -1);
            window0.setBackgroundDrawable(this.z);
            this.y0(window0);
        }
        else {
            window0.setLayout(-2, -2);
            int v = this.getResources().getDimensionPixelOffset(dimen.mtrl_calendar_dialog_background_inset);
            Rect rect0 = new Rect(v, v, v, v);
            window0.setBackgroundDrawable(new InsetDrawable(this.z, v, v, v, v));
            window0.getDecorView().setOnTouchListener(new E1.a(this.requireDialog(), rect0));
        }
        this.S0();
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onStop() {
        this.g.j0();
        super.onStop();
    }

    public boolean p0(DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        return this.c.add(dialogInterface$OnCancelListener0);
    }

    public boolean q0(DialogInterface.OnDismissListener dialogInterface$OnDismissListener0) {
        return this.d.add(dialogInterface$OnDismissListener0);
    }

    public boolean r0(View.OnClickListener view$OnClickListener0) {
        return this.b.add(view$OnClickListener0);
    }

    public boolean s0(o o0) {
        return this.a.add(o0);
    }

    public void t0() {
        this.c.clear();
    }

    public void u0() {
        this.d.clear();
    }

    public void v0() {
        this.b.clear();
    }

    public void w0() {
        this.a.clear();
    }

    @NonNull
    private static Drawable x0(Context context0) {
        Drawable drawable0 = new StateListDrawable();
        Drawable drawable1 = AppCompatResources.b(context0, drawable.material_ic_calendar_black_24dp);
        ((StateListDrawable)drawable0).addState(new int[]{0x10100A0}, drawable1);
        Drawable drawable2 = AppCompatResources.b(context0, drawable.material_ic_edit_black_24dp);
        ((StateListDrawable)drawable0).addState(new int[0], drawable2);
        return drawable0;
    }

    private void y0(Window window0) {
        class c implements OnApplyWindowInsetsListener {
            final int a;
            final View b;
            final int c;
            final n d;

            c(int v, View view0, int v1) {
                this.a = v;
                this.b = view0;
                this.c = v1;
                super();
            }

            @Override  // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat a(View view0, WindowInsetsCompat windowInsetsCompat0) {
                int v = windowInsetsCompat0.f(0x207).b;
                if(this.a >= 0) {
                    ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.b.getLayoutParams();
                    viewGroup$LayoutParams0.height = this.a + v;
                    ViewGroup.LayoutParams viewGroup$LayoutParams1 = this.b.getLayoutParams();
                    this.b.setLayoutParams(viewGroup$LayoutParams1);
                }
                int v1 = this.b.getPaddingLeft();
                int v2 = this.b.getPaddingRight();
                int v3 = this.b.getPaddingBottom();
                this.b.setPadding(v1, this.c + v, v2, v3);
                return windowInsetsCompat0;
            }
        }

        if(this.B) {
            return;
        }
        View view0 = this.requireView().findViewById(id.fullscreen_header);
        com.google.android.material.internal.e.b(window0, true, M.j(view0), null);
        int v = view0.getPaddingTop();
        ViewCompat.m2(view0, new c(this, view0.getLayoutParams().height, view0, v));
        this.B = true;
    }

    private DateSelector z0() {
        if(this.f == null) {
            this.f = (DateSelector)this.getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f;
    }
}

