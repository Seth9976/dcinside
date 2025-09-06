package androidx.work.impl.constraints;

import androidx.work.impl.model.WorkSpec;
import y4.l;

public interface OnConstraintsStateChangedListener {
    void e(@l WorkSpec arg1, @l ConstraintsState arg2);
}

