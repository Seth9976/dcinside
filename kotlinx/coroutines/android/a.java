package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.U0;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import y4.l;

public final class a implements MainDispatcherFactory {
    @Override  // kotlinx.coroutines.internal.MainDispatcherFactory
    public int a() {
        return 0x3FFFFFFF;
    }

    @Override  // kotlinx.coroutines.internal.MainDispatcherFactory
    @l
    public String b() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override  // kotlinx.coroutines.internal.MainDispatcherFactory
    @l
    public U0 c(@l List list0) {
        Looper looper0 = Looper.getMainLooper();
        if(looper0 == null) {
            throw new IllegalStateException("The main looper is not available");
        }
        return new d(g.e(looper0, true), null, 2, null);
    }
}

