package com.dcinside.app.write.menu.setting;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import java.util.Calendar;

public final class f implements DatePickerDialog.OnDateSetListener {
    public final Calendar a;
    public final PostAutoDeleteActivity b;

    public f(Calendar calendar0, PostAutoDeleteActivity postAutoDeleteActivity0) {
        this.a = calendar0;
        this.b = postAutoDeleteActivity0;
    }

    @Override  // android.app.DatePickerDialog$OnDateSetListener
    public final void onDateSet(DatePicker datePicker0, int v, int v1, int v2) {
        PostAutoDeleteActivity.T1(this.a, this.b, datePicker0, v, v1, v2);
    }
}

