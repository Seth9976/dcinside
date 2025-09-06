package androidx.compose.ui.autofill;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager.AutofillCallback;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.ExperimentalComposeUiApi;
import c.u;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(26)
public final class AutofillCallback extends AutofillManager.AutofillCallback {
    @l
    public static final AutofillCallback a;

    static {
        AutofillCallback.a = new AutofillCallback();
    }

    @DoNotInline
    @ExperimentalComposeUiApi
    public final void a(@l AndroidAutofill androidAutofill0) {
        L.p(androidAutofill0, "autofill");
        androidAutofill0.c().registerCallback(u.a(this));
    }

    @DoNotInline
    @ExperimentalComposeUiApi
    public final void b(@l AndroidAutofill androidAutofill0) {
        L.p(androidAutofill0, "autofill");
        androidAutofill0.c().unregisterCallback(this);
    }

    @Override  // android.view.autofill.AutofillManager$AutofillCallback
    public void onAutofillEvent(@l View view0, int v, int v1) {
        String s;
        L.p(view0, "view");
        super.onAutofillEvent(view0, v, v1);
        switch(v1) {
            case 1: {
                s = "Autofill popup was shown.";
                break;
            }
            case 2: {
                s = "Autofill popup was hidden.";
                break;
            }
            case 3: {
                s = "Autofill popup isn\'t shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
                break;
            }
            default: {
                s = "Unknown status event.";
            }
        }
        Log.d("Autofill Status", s);
    }
}

