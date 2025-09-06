package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@RequiresApi(26)
public final class AutofillApi26Helper {
    @l
    public static final AutofillApi26Helper a;

    static {
        AutofillApi26Helper.a = new AutofillApi26Helper();
    }

    @DoNotInline
    @RequiresApi(26)
    @m
    public final AutofillId a(@l ViewStructure viewStructure0) {
        L.p(viewStructure0, "structure");
        return viewStructure0.getAutofillId();
    }

    @DoNotInline
    @RequiresApi(26)
    public final boolean b(@l AutofillValue autofillValue0) {
        L.p(autofillValue0, "value");
        return autofillValue0.isDate();
    }

    @DoNotInline
    @RequiresApi(26)
    public final boolean c(@l AutofillValue autofillValue0) {
        L.p(autofillValue0, "value");
        return autofillValue0.isList();
    }

    @DoNotInline
    @RequiresApi(26)
    public final boolean d(@l AutofillValue autofillValue0) {
        L.p(autofillValue0, "value");
        return autofillValue0.isText();
    }

    @DoNotInline
    @RequiresApi(26)
    public final boolean e(@l AutofillValue autofillValue0) {
        L.p(autofillValue0, "value");
        return autofillValue0.isToggle();
    }

    @DoNotInline
    @RequiresApi(26)
    public final void f(@l ViewStructure viewStructure0, @l String[] arr_s) {
        L.p(viewStructure0, "structure");
        L.p(arr_s, "hints");
        viewStructure0.setAutofillHints(arr_s);
    }

    @DoNotInline
    @RequiresApi(26)
    public final void g(@l ViewStructure viewStructure0, @l AutofillId autofillId0, int v) {
        L.p(viewStructure0, "structure");
        L.p(autofillId0, "parent");
        viewStructure0.setAutofillId(autofillId0, v);
    }

    @DoNotInline
    @RequiresApi(26)
    public final void h(@l ViewStructure viewStructure0, int v) {
        L.p(viewStructure0, "structure");
        viewStructure0.setAutofillType(v);
    }

    @DoNotInline
    @RequiresApi(26)
    @l
    public final CharSequence i(@l AutofillValue autofillValue0) {
        L.p(autofillValue0, "value");
        CharSequence charSequence0 = autofillValue0.getTextValue();
        L.o(charSequence0, "value.textValue");
        return charSequence0;
    }
}

