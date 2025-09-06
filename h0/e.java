package h0;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class e implements CompoundButton.OnCheckedChangeListener {
    public final f a;

    public e(f f0) {
        this.a = f0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        f.w(this.a, compoundButton0, z);
    }
}

