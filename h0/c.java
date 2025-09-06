package h0;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class c implements CompoundButton.OnCheckedChangeListener {
    public final d a;

    public c(d d0) {
        this.a = d0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        d.w(this.a, compoundButton0, z);
    }
}

