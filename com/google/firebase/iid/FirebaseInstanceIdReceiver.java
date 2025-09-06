package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.O;
import com.google.firebase.messaging.o;
import java.util.concurrent.ExecutionException;

public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    private static final String a = "FirebaseMessaging";

    private static Intent a(@NonNull Context context0, @NonNull String s, @NonNull Bundle bundle0) {
        return new Intent(s).putExtras(bundle0);
    }

    @Override  // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    @WorkerThread
    protected int onMessageReceive(@NonNull Context context0, @NonNull CloudMessage cloudMessage0) {
        try {
            return (int)(((Integer)Tasks.await(new o(context0).k(cloudMessage0.getIntent()))));
        }
        catch(ExecutionException | InterruptedException executionException0) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", executionException0);
            return 500;
        }
    }

    @Override  // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    @WorkerThread
    protected void onNotificationDismissed(@NonNull Context context0, @NonNull Bundle bundle0) {
        Intent intent0 = FirebaseInstanceIdReceiver.a(context0, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle0);
        if(O.E(intent0)) {
            O.v(intent0);
        }
    }
}

