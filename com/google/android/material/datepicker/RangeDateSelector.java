package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;
import androidx.core.util.Preconditions;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.R.string;
import com.google.android.material.internal.l;
import com.google.android.material.resources.b;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

@RestrictTo({Scope.b})
public class RangeDateSelector implements DateSelector {
    class c implements Parcelable.Creator {
        c() {
            super();
        }

        @NonNull
        public RangeDateSelector a(@NonNull Parcel parcel0) {
            RangeDateSelector rangeDateSelector0 = new RangeDateSelector();
            rangeDateSelector0.d = (Long)parcel0.readValue(Long.class.getClassLoader());
            rangeDateSelector0.e = (Long)parcel0.readValue(Long.class.getClassLoader());
            return rangeDateSelector0;
        }

        @NonNull
        public RangeDateSelector[] b(int v) {
            return new RangeDateSelector[v];
        }

        @Override  // android.os.Parcelable$Creator
        @NonNull
        public Object createFromParcel(@NonNull Parcel parcel0) {
            return this.a(parcel0);
        }

        @Override  // android.os.Parcelable$Creator
        @NonNull
        public Object[] newArray(int v) {
            return this.b(v);
        }
    }

    public static final Parcelable.Creator CREATOR;
    @Nullable
    private CharSequence a;
    private String b;
    private final String c;
    @Nullable
    private Long d;
    @Nullable
    private Long e;
    @Nullable
    private Long f;
    @Nullable
    private Long g;
    @Nullable
    private SimpleDateFormat h;

    static {
        RangeDateSelector.CREATOR = new c();
    }

    public RangeDateSelector() {
        this.c = " ";
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String P2(@NonNull Context context0) {
        Resources resources0 = context0.getResources();
        Long long0 = this.d;
        if(long0 == null && this.e == null) {
            return resources0.getString(string.mtrl_picker_range_header_unselected);
        }
        Long long1 = this.e;
        if(long1 == null) {
            Object[] arr_object = {j.c(((long)long0))};
            return resources0.getString(string.mtrl_picker_range_header_only_start_selected, arr_object);
        }
        if(long0 == null) {
            Object[] arr_object1 = {j.c(((long)long1))};
            return resources0.getString(string.mtrl_picker_range_header_only_end_selected, arr_object1);
        }
        Pair pair0 = j.a(long0, long1);
        return resources0.getString(string.mtrl_picker_range_header_selected, new Object[]{pair0.a, pair0.b});
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public void Q(@Nullable SimpleDateFormat simpleDateFormat0) {
        if(simpleDateFormat0 != null) {
            simpleDateFormat0 = (SimpleDateFormat)C.q(simpleDateFormat0);
        }
        this.h = simpleDateFormat0;
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String Q1(@NonNull Context context0) {
        Resources resources0 = context0.getResources();
        Pair pair0 = j.a(this.d, this.e);
        String s = pair0.a == null ? resources0.getString(string.mtrl_picker_announce_current_selection_none) : ((String)pair0.a);
        Object object0 = pair0.b;
        if(object0 == null) {
            String s1 = resources0.getString(string.mtrl_picker_announce_current_selection_none);
            return resources0.getString(string.mtrl_picker_announce_current_range_selection, new Object[]{s, s1});
        }
        return resources0.getString(string.mtrl_picker_announce_current_range_selection, new Object[]{s, ((String)object0)});
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public boolean R() {
        return this.d != null && this.e != null && this.i(((long)this.d), ((long)this.e));
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection T() {
        Collection collection0 = new ArrayList();
        Long long0 = this.d;
        if(long0 != null) {
            ((ArrayList)collection0).add(long0);
        }
        Long long1 = this.e;
        if(long1 != null) {
            ((ArrayList)collection0).add(long1);
        }
        return collection0;
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public void a1(long v) {
        Long long0 = this.d;
        if(long0 == null) {
            this.d = v;
            return;
        }
        if(this.e == null && this.i(((long)long0), v)) {
            this.e = v;
            return;
        }
        this.e = null;
        this.d = v;
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public int b() {
        return string.mtrl_picker_range_header_title;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection e3() {
        Collection collection0 = new ArrayList();
        ((ArrayList)collection0).add(new Pair(this.d, this.e));
        return collection0;
    }

    private void g(@NonNull TextInputLayout textInputLayout0, @NonNull TextInputLayout textInputLayout1) {
        if(textInputLayout0.getError() != null && this.b.contentEquals(textInputLayout0.getError())) {
            textInputLayout0.setError(null);
        }
        if(textInputLayout1.getError() != null && " ".contentEquals(textInputLayout1.getError())) {
            textInputLayout1.setError(null);
        }
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.material.datepicker.DateSelector
    @Nullable
    public String getError() {
        return TextUtils.isEmpty(this.a) ? null : this.a.toString();
    }

    @NonNull
    public Pair h() {
        return new Pair(this.d, this.e);
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Object h0() {
        return this.h();
    }

    private boolean i(long v, long v1) {
        return v <= v1;
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public int j(@NonNull Context context0) {
        Resources resources0 = context0.getResources();
        DisplayMetrics displayMetrics0 = resources0.getDisplayMetrics();
        int v = resources0.getDimensionPixelSize(dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis);
        return Math.min(displayMetrics0.widthPixels, displayMetrics0.heightPixels) <= v ? b.g(context0, attr.materialCalendarFullscreenTheme, n.class.getCanonicalName()) : b.g(context0, attr.materialCalendarTheme, n.class.getCanonicalName());
    }

    private void l(@NonNull TextInputLayout textInputLayout0, @NonNull TextInputLayout textInputLayout1) {
        textInputLayout0.setError(this.b);
        textInputLayout1.setError(" ");
    }

    public void m(@NonNull Pair pair0) {
        Object object0 = pair0.a;
        if(object0 != null && pair0.b != null) {
            Preconditions.a(this.i(((long)(((Long)object0))), ((long)(((Long)pair0.b)))));
        }
        Long long0 = null;
        this.d = pair0.a == null ? null : C.a(((long)(((Long)pair0.a))));
        Object object1 = pair0.b;
        if(object1 != null) {
            long0 = C.a(((long)(((Long)object1))));
        }
        this.e = long0;
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public void n(@NonNull Object object0) {
        this.m(((Pair)object0));
    }

    private void o(@NonNull TextInputLayout textInputLayout0, @NonNull TextInputLayout textInputLayout1) {
        if(!TextUtils.isEmpty(textInputLayout0.getError())) {
            this.a = textInputLayout0.getError();
            return;
        }
        if(!TextUtils.isEmpty(textInputLayout1.getError())) {
            this.a = textInputLayout1.getError();
            return;
        }
        this.a = null;
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public View p(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0, CalendarConstraints calendarConstraints0, @NonNull t t0) {
        class a extends e {
            final TextInputLayout i;
            final TextInputLayout j;
            final t k;
            final RangeDateSelector l;

            a(String s, DateFormat dateFormat0, TextInputLayout textInputLayout0, CalendarConstraints calendarConstraints0, TextInputLayout textInputLayout1, TextInputLayout textInputLayout2, t t0) {
                this.i = textInputLayout1;
                this.j = textInputLayout2;
                this.k = t0;
                super(s, dateFormat0, textInputLayout0, calendarConstraints0);
            }

            @Override  // com.google.android.material.datepicker.e
            void f() {
                RangeDateSelector.this.f = null;
                RangeDateSelector.this.q(this.i, this.j, this.k);
            }

            @Override  // com.google.android.material.datepicker.e
            void g(@Nullable Long long0) {
                RangeDateSelector.this.f = long0;
                RangeDateSelector.this.q(this.i, this.j, this.k);
            }
        }


        class com.google.android.material.datepicker.RangeDateSelector.b extends e {
            final TextInputLayout i;
            final TextInputLayout j;
            final t k;
            final RangeDateSelector l;

            com.google.android.material.datepicker.RangeDateSelector.b(String s, DateFormat dateFormat0, TextInputLayout textInputLayout0, CalendarConstraints calendarConstraints0, TextInputLayout textInputLayout1, TextInputLayout textInputLayout2, t t0) {
                this.i = textInputLayout1;
                this.j = textInputLayout2;
                this.k = t0;
                super(s, dateFormat0, textInputLayout0, calendarConstraints0);
            }

            @Override  // com.google.android.material.datepicker.e
            void f() {
                RangeDateSelector.this.g = null;
                RangeDateSelector.this.q(this.i, this.j, this.k);
            }

            @Override  // com.google.android.material.datepicker.e
            void g(@Nullable Long long0) {
                RangeDateSelector.this.g = long0;
                RangeDateSelector.this.q(this.i, this.j, this.k);
            }
        }

        View view0 = layoutInflater0.inflate(layout.mtrl_picker_text_input_date_range, viewGroup0, false);
        View view1 = view0.findViewById(id.mtrl_picker_text_input_range_start);
        View view2 = view0.findViewById(id.mtrl_picker_text_input_range_end);
        EditText editText0 = ((TextInputLayout)view1).getEditText();
        EditText editText1 = ((TextInputLayout)view2).getEditText();
        if(l.b()) {
            editText0.setInputType(17);
            editText1.setInputType(17);
        }
        this.b = view0.getResources().getString(string.mtrl_picker_invalid_range);
        SimpleDateFormat simpleDateFormat0 = this.h;
        boolean z = simpleDateFormat0 != null;
        if(!z) {
            simpleDateFormat0 = C.g();
        }
        Long long0 = this.d;
        if(long0 != null) {
            editText0.setText(simpleDateFormat0.format(long0));
            this.f = this.d;
        }
        Long long1 = this.e;
        if(long1 != null) {
            editText1.setText(simpleDateFormat0.format(long1));
            this.g = this.e;
        }
        String s = z ? simpleDateFormat0.toPattern() : C.h(view0.getResources(), simpleDateFormat0);
        ((TextInputLayout)view1).setPlaceholderText(s);
        ((TextInputLayout)view2).setPlaceholderText(s);
        editText0.addTextChangedListener(new a(this, s, simpleDateFormat0, ((TextInputLayout)view1), calendarConstraints0, ((TextInputLayout)view1), ((TextInputLayout)view2), t0));
        editText1.addTextChangedListener(new com.google.android.material.datepicker.RangeDateSelector.b(this, s, simpleDateFormat0, ((TextInputLayout)view2), calendarConstraints0, ((TextInputLayout)view1), ((TextInputLayout)view2), t0));
        h.c(new EditText[]{editText0, editText1});
        return view0;
    }

    private void q(@NonNull TextInputLayout textInputLayout0, @NonNull TextInputLayout textInputLayout1, @NonNull t t0) {
        Long long0 = this.f;
        if(long0 == null || this.g == null) {
            this.g(textInputLayout0, textInputLayout1);
            t0.a();
        }
        else if(this.i(((long)long0), ((long)this.g))) {
            this.d = this.f;
            this.e = this.g;
            t0.b(this.h());
        }
        else {
            this.l(textInputLayout0, textInputLayout1);
            t0.a();
        }
        this.o(textInputLayout0, textInputLayout1);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        parcel0.writeValue(this.d);
        parcel0.writeValue(this.e);
    }
}

