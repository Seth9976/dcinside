package kotlinx.coroutines.tasks;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlinx.coroutines.x;

public final class b implements OnCompleteListener {
    public final x a;

    public b(x x0) {
        this.a = x0;
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task0) {
        c.f(this.a, task0);
    }
}

