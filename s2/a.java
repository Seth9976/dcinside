package S2;

import com.unity3d.services.store.core.api.Store;

public final class a implements Runnable {
    public final Integer a;
    public final String b;

    public a(Integer integer0, String s) {
        this.a = integer0;
        this.b = s;
    }

    @Override
    public final void run() {
        Store.lambda$isFeatureSupported$0(this.a, this.b);
    }
}

