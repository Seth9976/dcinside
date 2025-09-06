package com.google.firebase.messaging;

import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

class c0 {
    interface a {
        Task start();
    }

    private final Executor a;
    @GuardedBy("this")
    private final Map b;

    c0(Executor executor0) {
        this.b = new ArrayMap();
        this.a = executor0;
    }

    Task b(String s, a c0$a0) {
        synchronized(this) {
            Task task0 = (Task)this.b.get(s);
            if(task0 != null) {
                if(Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Joining ongoing request for: " + s);
                }
                return task0;
            }
            if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Making new request for: " + s);
            }
            Task task1 = c0$a0.start();
            b0 b00 = (Task task0) -> synchronized(this) {
                this.b.remove(s);
                return task0;
            };
            Task task2 = task1.continueWithTask(this.a, b00);
            this.b.put(s, task2);
            return task2;
        }
    }

    // 检测为 Lambda 实现
    private Task c(String s, Task task0) throws Exception [...]
}

