package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.google.firebase.sessions.settings.f;
import java.util.ArrayList;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.time.e;
import y4.l;
import y4.m;

public final class SessionLifecycleService extends Service {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @s0({"SMAP\nSessionLifecycleService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionLifecycleService.kt\ncom/google/firebase/sessions/SessionLifecycleService$MessageHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,252:1\n1855#2,2:253\n1#3:255\n*S KotlinDebug\n*F\n+ 1 SessionLifecycleService.kt\ncom/google/firebase/sessions/SessionLifecycleService$MessageHandler\n*L\n145#1:253,2\n*E\n"})
    public static final class b extends Handler {
        private boolean a;
        private long b;
        @l
        private final ArrayList c;

        public b(@l Looper looper0) {
            L.p(looper0, "looper");
            super(looper0);
            this.c = new ArrayList();
        }

        private final void a() {
            Log.d("SessionLifecycleService", "Broadcasting new session: " + G.f.a().c());
            E.a.a().a(G.f.a().c());
            for(Object object0: new ArrayList(this.c)) {
                L.o(((Messenger)object0), "it");
                this.f(((Messenger)object0));
            }
        }

        private final void b(Message message0) {
            Log.d("SessionLifecycleService", "Activity backgrounding at " + message0.getWhen());
            this.b = message0.getWhen();
        }

        private final void c(Message message0) {
            this.c.add(message0.replyTo);
            Messenger messenger0 = message0.replyTo;
            L.o(messenger0, "msg.replyTo");
            this.f(messenger0);
            Log.d("SessionLifecycleService", "Client " + message0.replyTo + " bound at " + message0.getWhen() + ". Clients: " + this.c.size());
        }

        private final void d(Message message0) {
            Log.d("SessionLifecycleService", "Activity foregrounding at " + message0.getWhen() + '.');
            if(!this.a) {
                Log.d("SessionLifecycleService", "Cold start detected.");
                this.a = true;
                this.g();
            }
            else if(this.e(message0.getWhen())) {
                Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
                this.g();
            }
            this.b = message0.getWhen();
        }

        private final boolean e(long v) {
            return v - this.b > e.L(f.c.c().c());
        }

        private final void f(Messenger messenger0) {
            if(this.a) {
                this.h(messenger0, G.f.a().c().h());
                return;
            }
            String s = z.a.a().b();
            Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + s);
            if(s != null) {
                this.h(messenger0, s);
            }
        }

        private final void g() {
            G.f.a().a();
            Log.d("SessionLifecycleService", "Generated new session " + G.f.a().c().h());
            this.a();
            z.a.a().a(G.f.a().c().h());
        }

        private final void h(Messenger messenger0, String s) {
            try {
                Bundle bundle0 = new Bundle();
                bundle0.putString("SessionUpdateExtra", s);
                Message message0 = Message.obtain(null, 3, 0, 0);
                message0.setData(bundle0);
                messenger0.send(message0);
            }
            catch(DeadObjectException unused_ex) {
                Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger0);
                this.c.remove(messenger0);
            }
            catch(Exception exception0) {
                Log.w("SessionLifecycleService", "Unable to push new session to " + messenger0 + '.', exception0);
            }
        }

        @Override  // android.os.Handler
        public void handleMessage(@l Message message0) {
            L.p(message0, "msg");
            if(this.b > message0.getWhen()) {
                Log.d("SessionLifecycleService", "Ignoring old message from " + message0.getWhen() + " which is older than " + this.b + '.');
                return;
            }
            switch(message0.what) {
                case 1: {
                    this.d(message0);
                    return;
                }
                case 2: {
                    this.b(message0);
                    return;
                }
                case 4: {
                    this.c(message0);
                    return;
                }
                default: {
                    Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + message0);
                    super.handleMessage(message0);
                }
            }
        }
    }

    @l
    private final HandlerThread a;
    @m
    private b b;
    @m
    private Messenger c;
    @l
    public static final a d = null;
    @l
    public static final String e = "SessionLifecycleService";
    @l
    public static final String f = "ClientCallbackMessenger";
    @l
    public static final String g = "SessionUpdateExtra";
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    private static final int k = 4;

    static {
        SessionLifecycleService.d = new a(null);
    }

    public SessionLifecycleService() {
        this.a = new HandlerThread("FirebaseSessions_HandlerThread");
    }

    private final Messenger a(Intent intent0) {
        return Build.VERSION.SDK_INT < 33 ? ((Messenger)intent0.getParcelableExtra("ClientCallbackMessenger")) : ((Messenger)intent0.getParcelableExtra("ClientCallbackMessenger", Messenger.class));
    }

    @l
    public final HandlerThread b() {
        return this.a;
    }

    @Override  // android.app.Service
    @m
    public IBinder onBind(@m Intent intent0) {
        if(intent0 == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent0.getAction());
        Messenger messenger0 = this.a(intent0);
        if(messenger0 != null) {
            Message message0 = Message.obtain(null, 4, 0, 0);
            message0.replyTo = messenger0;
            b sessionLifecycleService$b0 = this.b;
            if(sessionLifecycleService$b0 != null) {
                sessionLifecycleService$b0.sendMessage(message0);
            }
        }
        return this.c == null ? null : this.c.getBinder();
    }

    @Override  // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.a.start();
        Looper looper0 = this.a.getLooper();
        L.o(looper0, "handlerThread.looper");
        this.b = new b(looper0);
        this.c = new Messenger(this.b);
    }

    @Override  // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.a.quit();
    }
}

