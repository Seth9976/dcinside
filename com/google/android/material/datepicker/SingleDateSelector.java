package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.android.material.R.attr;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.R.string;
import com.google.android.material.internal.l;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

@RestrictTo({Scope.b})
public class SingleDateSelector implements DateSelector {
    class b implements Parcelable.Creator {
        b() {
            super();
        }

        @NonNull
        public SingleDateSelector a(@NonNull Parcel parcel0) {
            SingleDateSelector singleDateSelector0 = new SingleDateSelector();
            singleDateSelector0.b = (Long)parcel0.readValue(Long.class.getClassLoader());
            return singleDateSelector0;
        }

        @NonNull
        public SingleDateSelector[] b(int v) {
            return new SingleDateSelector[v];
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
    @Nullable
    private Long b;
    @Nullable
    private SimpleDateFormat c;

    static {
        SingleDateSelector.CREATOR = new b();
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String P2(@NonNull Context context0) {
        Resources resources0 = context0.getResources();
        Long long0 = this.b;
        if(long0 == null) {
            return resources0.getString(string.mtrl_picker_date_header_unselected);
        }
        Object[] arr_object = {j.m(((long)long0))};
        return resources0.getString(string.mtrl_picker_date_header_selected, arr_object);
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public void Q(@Nullable SimpleDateFormat simpleDateFormat0) {
        if(simpleDateFormat0 != null) {
            simpleDateFormat0 = (SimpleDateFormat)C.q(simpleDateFormat0);
        }
        this.c = simpleDateFormat0;
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String Q1(@NonNull Context context0) {
        String s;
        Resources resources0 = context0.getResources();
        Long long0 = this.b;
        if(long0 == null) {
            s = resources0.getString(string.mtrl_picker_announce_current_selection_none);
            return resources0.getString(string.mtrl_picker_announce_current_selection, new Object[]{s});
        }
        s = j.m(((long)long0));
        return resources0.getString(string.mtrl_picker_announce_current_selection, new Object[]{s});
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public boolean R() {
        return this.b != null;
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection T() {
        Collection collection0 = new ArrayList();
        Long long0 = this.b;
        if(long0 != null) {
            ((ArrayList)collection0).add(long0);
        }
        return collection0;
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public void a1(long v) {
        this.b = v;
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public int b() {
        return string.mtrl_picker_date_header_title;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private void e() {
        this.b = null;
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection e3() {
        return new ArrayList();
    }

    @Nullable
    public Long f() {
        return this.b;
    }

    public void g(@Nullable Long long0) {
        this.b = long0 == null ? null : C.a(((long)long0));
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.material.datepicker.DateSelector
    @Nullable
    public String getError() {
        return TextUtils.isEmpty(this.a) ? null : this.a.toString();
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    @Nullable
    public Object h0() {
        return this.f();
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public int j(Context context0) {
        return com.google.android.material.resources.b.g(context0, attr.materialCalendarTheme, n.class.getCanonicalName());
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public void n(@Nullable Object object0) {
        this.g(((Long)object0));
    }

    @Override  // com.google.android.material.datepicker.DateSelector
    public View p(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0, CalendarConstraints calendarConstraints0, @NonNull t t0) {
        class a extends e {
            final t i;
            final TextInputLayout j;
            final SingleDateSelector k;

            a(String s, DateFormat dateFormat0, TextInputLayout textInputLayout0, CalendarConstraints calendarConstraints0, t t0, TextInputLayout textInputLayout1) {
                this.i = t0;
                this.j = textInputLayout1;
                super(s, dateFormat0, textInputLayout0, calendarConstraints0);
            }

            @Override  // com.google.android.material.datepicker.e
            void f() {
                CharSequence charSequence0 = this.j.getError();
                SingleDateSelector.this.a = charSequence0;
                this.i.a();
            }

            @Override  // com.google.android.material.datepicker.e
            void g(@Nullable Long long0) {
                if(long0 == null) {
                    SingleDateSelector.this.e();
                }
                else {
                    SingleDateSelector.this.a1(((long)long0));
                }
                SingleDateSelector.this.a = null;
                this.i.b(SingleDateSelector.this.f());
            }
        }

        View view0 = layoutInflater0.inflate(layout.mtrl_picker_text_input_date, viewGroup0, false);
        View view1 = view0.findViewById(id.mtrl_picker_text_input_date);
        EditText editText0 = ((TextInputLayout)view1).getEditText();
        if(l.b()) {
            editText0.setInputType(17);
        }
        SimpleDateFormat simpleDateFormat0 = this.c;
        boolean z = simpleDateFormat0 != null;
        if(!z) {
            simpleDateFormat0 = C.g();
        }
        String s = z ? simpleDateFormat0.toPattern() : C.h(view0.getResources(), simpleDateFormat0);
        ((TextInputLayout)view1).setPlaceholderText(s);
        Long long0 = this.b;
        if(long0 != null) {
            editText0.setText(simpleDateFormat0.format(long0));
        }
        editText0.addTextChangedListener(new a(this, s, simpleDateFormat0, ((TextInputLayout)view1), calendarConstraints0, t0, ((TextInputLayout)view1)));
        h.c(new EditText[]{editText0});
        return view0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        parcel0.writeValue(this.b);
    }
}

