package androidx.window.layout;

import android.app.Activity;
import y4.l;

public interface ExtensionInterfaceCompat {
    public interface ExtensionCallbackInterface {
        void a(@l Activity arg1, @l WindowLayoutInfo arg2);
    }

    void a(@l ExtensionCallbackInterface arg1);

    boolean b();

    void c(@l Activity arg1);

    void d(@l Activity arg1);
}

