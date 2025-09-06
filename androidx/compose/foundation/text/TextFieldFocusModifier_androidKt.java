package androidx.compose.foundation.text;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.compose.ui.text.input.TextInputSession;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class TextFieldFocusModifier_androidKt {
    @l
    public static final Modifier a(@l Modifier modifier0, @l TextFieldState textFieldState0, @l FocusManager focusManager0) {
        L.p(modifier0, "<this>");
        L.p(textFieldState0, "state");
        L.p(focusManager0, "focusManager");
        return KeyInputModifierKt.b(modifier0, new Function1(focusManager0, textFieldState0) {
            final FocusManager e;
            final TextFieldState f;

            {
                this.e = focusManager0;
                this.f = textFieldState0;
                super(1);
            }

            @l
            public final Boolean a(@l KeyEvent keyEvent0) {
                L.p(keyEvent0, "keyEvent");
                InputDevice inputDevice0 = keyEvent0.getDevice();
                if(inputDevice0 == null) {
                    return false;
                }
                if(inputDevice0.getKeyboardType() == 2 && inputDevice0.isVirtual()) {
                    return false;
                }
                if(!KeyEventType.g(KeyEvent_androidKt.b(keyEvent0), 2)) {
                    return false;
                }
                switch(Key_androidKt.b(KeyEvent_androidKt.a(keyEvent0))) {
                    case 19: {
                        return Boolean.valueOf(this.e.i(5));
                    }
                    case 20: {
                        return Boolean.valueOf(this.e.i(6));
                    }
                    case 21: {
                        return Boolean.valueOf(this.e.i(3));
                    }
                    case 22: {
                        return Boolean.valueOf(this.e.i(4));
                    }
                    case 23: {
                        TextInputSession textInputSession0 = this.f.e();
                        if(textInputSession0 != null) {
                            textInputSession0.f();
                        }
                        return true;
                    }
                    default: {
                        return false;
                    }
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((androidx.compose.ui.input.key.KeyEvent)object0).h());
            }
        });
    }
}

