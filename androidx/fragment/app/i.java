package androidx.fragment.app;

import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.util.Consumer;

public final class i implements Consumer {
    public final FragmentManager a;

    public i(FragmentManager fragmentManager0) {
        this.a = fragmentManager0;
    }

    @Override  // androidx.core.util.Consumer
    public final void accept(Object object0) {
        this.a.i1(((PictureInPictureModeChangedInfo)object0));
    }
}

