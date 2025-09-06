package androidx.compose.ui.autofill;

import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import c.e;
import kotlin.jvm.internal.L;
import kotlin.math.b;
import y4.l;

@RequiresApi(26)
@ExperimentalComposeUiApi
public final class AndroidAutofill implements Autofill {
    @l
    private final View a;
    @l
    private final AutofillTree b;
    @l
    private final AutofillManager c;

    public AndroidAutofill(@l View view0, @l AutofillTree autofillTree0) {
        L.p(view0, "view");
        L.p(autofillTree0, "autofillTree");
        super();
        this.a = view0;
        this.b = autofillTree0;
        AutofillManager autofillManager0 = e.a(view0.getContext().getSystemService(AutofillManager.class));
        if(autofillManager0 == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.c = autofillManager0;
        view0.setImportantForAutofill(1);
    }

    @Override  // androidx.compose.ui.autofill.Autofill
    public void a(@l AutofillNode autofillNode0) {
        L.p(autofillNode0, "autofillNode");
        Rect rect0 = autofillNode0.d();
        if(rect0 == null) {
            throw new IllegalStateException("requestAutofill called before onChildPositioned()");
        }
        android.graphics.Rect rect1 = new android.graphics.Rect(b.L0(rect0.t()), b.L0(rect0.B()), b.L0(rect0.x()), b.L0(rect0.j()));
        this.c.notifyViewEntered(this.a, autofillNode0.e(), rect1);
    }

    @Override  // androidx.compose.ui.autofill.Autofill
    public void b(@l AutofillNode autofillNode0) {
        L.p(autofillNode0, "autofillNode");
        int v = autofillNode0.e();
        this.c.notifyViewExited(this.a, v);
    }

    @l
    public final AutofillManager c() {
        return this.c;
    }

    @l
    public final AutofillTree d() {
        return this.b;
    }

    @l
    public final View e() {
        return this.a;
    }
}

