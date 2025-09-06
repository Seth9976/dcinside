package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;

@RestrictTo({Scope.b})
public final class q extends u {
    @StyleRes
    private int b;
    @Nullable
    private DateSelector c;
    @Nullable
    private CalendarConstraints d;
    private static final String e = "THEME_RES_ID_KEY";
    private static final String f = "DATE_SELECTOR_KEY";
    private static final String g = "CALENDAR_CONSTRAINTS_KEY";

    @Override  // com.google.android.material.datepicker.u
    @NonNull
    public DateSelector k0() {
        DateSelector dateSelector0 = this.c;
        if(dateSelector0 == null) {
            throw new IllegalStateException("dateSelector should not be null. Use MaterialTextInputPicker#newInstance() to create this fragment with a DateSelector, and call this method after the fragment has been created.");
        }
        return dateSelector0;
    }

    @NonNull
    static q m0(DateSelector dateSelector0, @StyleRes int v, @NonNull CalendarConstraints calendarConstraints0) {
        q q0 = new q();
        Bundle bundle0 = new Bundle();
        bundle0.putInt("THEME_RES_ID_KEY", v);
        bundle0.putParcelable("DATE_SELECTOR_KEY", dateSelector0);
        bundle0.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints0);
        q0.setArguments(bundle0);
        return q0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 == null) {
            bundle0 = this.getArguments();
        }
        this.b = bundle0.getInt("THEME_RES_ID_KEY");
        this.c = (DateSelector)bundle0.getParcelable("DATE_SELECTOR_KEY");
        this.d = (CalendarConstraints)bundle0.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override  // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        class a extends t {
            final q a;

            @Override  // com.google.android.material.datepicker.t
            public void a() {
                for(Object object0: q.this.a) {
                    ((t)object0).a();
                }
            }

            @Override  // com.google.android.material.datepicker.t
            public void b(Object object0) {
                for(Object object1: q.this.a) {
                    ((t)object1).b(object0);
                }
            }
        }

        LayoutInflater layoutInflater1 = layoutInflater0.cloneInContext(new ContextThemeWrapper(this.getContext(), this.b));
        return this.c.p(layoutInflater1, viewGroup0, bundle0, this.d, new a(this));
    }

    @Override  // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putInt("THEME_RES_ID_KEY", this.b);
        bundle0.putParcelable("DATE_SELECTOR_KEY", this.c);
        bundle0.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.d);
    }
}

