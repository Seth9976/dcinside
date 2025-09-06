package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class b implements OnCompleteListener {
    private final CountDownLatch a;

    b() {
        this.a = new CountDownLatch(1);
    }

    public boolean a(long v, TimeUnit timeUnit0) throws InterruptedException {
        return this.a.await(v, timeUnit0);
    }

    public void b() {
        this.a.countDown();
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(@NonNull Task task0) {
        this.a.countDown();
    }
}

