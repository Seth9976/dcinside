package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnSuccessListener;

public final class w implements OnSuccessListener {
    public final FirebaseMessaging a;

    public w(FirebaseMessaging firebaseMessaging0) {
        this.a = firebaseMessaging0;
    }

    @Override  // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object object0) {
        this.a.U(((m0)object0));
    }
}

