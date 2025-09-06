package q2;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RemoteMessage;
import kotlin.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.k;
import n2.b;
import y4.l;

public final class c {
    @l
    public static final FirebaseMessaging a(@l b b0) {
        L.p(b0, "<this>");
        FirebaseMessaging firebaseMessaging0 = FirebaseMessaging.y();
        L.o(firebaseMessaging0, "getInstance()");
        return firebaseMessaging0;
    }

    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @c0(expression = "", imports = {}))
    @l
    public static final RemoteMessage b(@l String s, @l Function1 function10) {
        L.p(s, "to");
        L.p(function10, "init");
        com.google.firebase.messaging.RemoteMessage.b remoteMessage$b0 = new com.google.firebase.messaging.RemoteMessage.b(s);
        function10.invoke(remoteMessage$b0);
        RemoteMessage remoteMessage0 = remoteMessage$b0.b();
        L.o(remoteMessage0, "builder.build()");
        return remoteMessage0;
    }
}

