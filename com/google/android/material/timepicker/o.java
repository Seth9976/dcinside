package com.google.android.material.timepicker;

import com.google.android.material.button.MaterialButtonToggleGroup.d;
import com.google.android.material.button.MaterialButtonToggleGroup;

public final class o implements d {
    public final TimePickerView a;

    public o(TimePickerView timePickerView0) {
        this.a = timePickerView0;
    }

    @Override  // com.google.android.material.button.MaterialButtonToggleGroup$d
    public final void a(MaterialButtonToggleGroup materialButtonToggleGroup0, int v, boolean z) {
        this.a.F(materialButtonToggleGroup0, v, z);
    }
}

