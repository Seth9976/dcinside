package d0;

import com.dcinside.app.msg.MessagingService;
import com.dcinside.app.realm.n;
import io.realm.F0.d;
import io.realm.F0;

public final class c implements d {
    public final n a;

    public c(n n0) {
        this.a = n0;
    }

    @Override  // io.realm.F0$d
    public final void a(F0 f00) {
        MessagingService.G(this.a, f00);
    }
}

