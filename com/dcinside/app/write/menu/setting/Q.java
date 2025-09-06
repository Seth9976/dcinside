package com.dcinside.app.write.menu.setting;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import java.util.Calendar;

public final class q implements DatePickerDialog.OnDateSetListener {
    public final Calendar a;
    public final PostPollSettingActivity b;

    public q(Calendar calendar0, PostPollSettingActivity postPollSettingActivity0) {
        this.a = calendar0;
        this.b = postPollSettingActivity0;
    }

    @Override  // android.app.DatePickerDialog$OnDateSetListener
    public final void onDateSet(DatePicker datePicker0, int v, int v1, int v2) {
        PostPollSettingActivity.O2(this.a, this.b, datePicker0, v, v1, v2);
    }
}

