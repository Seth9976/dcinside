package androidx.core.view.autofill;

import android.view.autofill.AutofillId;
import androidx.annotation.RequiresApi;

public class AutofillIdCompat {
    private final Object a;

    @RequiresApi(26)
    private AutofillIdCompat(AutofillId autofillId0) {
        this.a = autofillId0;
    }

    @RequiresApi(26)
    public AutofillId a() {
        return (AutofillId)this.a;
    }

    @RequiresApi(26)
    public static AutofillIdCompat b(AutofillId autofillId0) {
        return new AutofillIdCompat(autofillId0);
    }
}

