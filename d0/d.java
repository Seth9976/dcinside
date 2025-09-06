package d0;

import android.content.Context;
import com.dcinside.app.msg.NotificationDeleteReceiver;
import io.realm.F0;
import io.realm.g1;
import java.util.ArrayList;

public final class d implements io.realm.F0.d {
    public final g1 a;
    public final Context b;
    public final ArrayList c;

    public d(g1 g10, Context context0, ArrayList arrayList0) {
        this.a = g10;
        this.b = context0;
        this.c = arrayList0;
    }

    @Override  // io.realm.F0$d
    public final void a(F0 f00) {
        NotificationDeleteReceiver.d(this.a, this.b, this.c, f00);
    }
}

