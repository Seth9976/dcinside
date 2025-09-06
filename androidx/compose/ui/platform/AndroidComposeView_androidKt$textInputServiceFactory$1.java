package androidx.compose.ui.platform;

import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class AndroidComposeView_androidKt.textInputServiceFactory.1 extends N implements Function1 {
    public static final AndroidComposeView_androidKt.textInputServiceFactory.1 e;

    static {
        AndroidComposeView_androidKt.textInputServiceFactory.1.e = new AndroidComposeView_androidKt.textInputServiceFactory.1();
    }

    AndroidComposeView_androidKt.textInputServiceFactory.1() {
        super(1);
    }

    @l
    public final TextInputService a(@l PlatformTextInputService platformTextInputService0) {
        L.p(platformTextInputService0, "it");
        return new TextInputService(platformTextInputService0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(((PlatformTextInputService)object0));
    }
}

