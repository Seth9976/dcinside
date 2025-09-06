package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import jeb.synthetic.FIN;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@ExperimentalRoomApi
public final class MultiInstanceInvalidationService extends Service {
    private int a;
    @l
    private final Map b;
    @l
    private final RemoteCallbackList c;
    @l
    private final Stub d;

    public MultiInstanceInvalidationService() {
        this.b = new LinkedHashMap();
        this.c = new RemoteCallbackList() {
            public void a(@l IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback0, @l Object object0) {
                L.p(iMultiInstanceInvalidationCallback0, "callback");
                L.p(object0, "cookie");
                this.a.b().remove(((Integer)object0));
            }

            @Override  // android.os.RemoteCallbackList
            public void onCallbackDied(IInterface iInterface0, Object object0) {
                this.a(((IMultiInstanceInvalidationCallback)iInterface0), object0);
            }
        };
        this.d = new Stub() {
            @Override  // androidx.room.IMultiInstanceInvalidationService
            public void E0(int v, @l String[] arr_s) {
                int v4;
                L.p(arr_s, "tables");
                RemoteCallbackList remoteCallbackList0 = this.d.a();
                MultiInstanceInvalidationService multiInstanceInvalidationService0 = this.d;
                synchronized(remoteCallbackList0) {
                    String s = (String)multiInstanceInvalidationService0.b().get(v);
                    if(s == null) {
                        Log.w("ROOM", "Remote invalidation client ID not registered");
                        return;
                    }
                    int v2 = multiInstanceInvalidationService0.a().beginBroadcast();
                    v4 = FIN.finallyOpen$NT();
                    for(int v3 = 0; v3 < v2; ++v3) {
                        Object object0 = multiInstanceInvalidationService0.a().getBroadcastCookie(v3);
                        L.n(object0, "null cannot be cast to non-null type kotlin.Int");
                        if(v != ((int)(((Integer)object0))) && L.g(s, ((String)multiInstanceInvalidationService0.b().get(((Integer)object0))))) {
                            try {
                                ((IMultiInstanceInvalidationCallback)multiInstanceInvalidationService0.a().getBroadcastItem(v3)).h(arr_s);
                            }
                            catch(RemoteException remoteException0) {
                                Log.w("ROOM", "Error invoking a remote callback", remoteException0);
                            }
                        }
                    }
                    FIN.finallyCodeBegin$NT(v4);
                    multiInstanceInvalidationService0.a().finishBroadcast();
                }
                FIN.finallyCodeEnd$NT(v4);
            }

            @Override  // androidx.room.IMultiInstanceInvalidationService
            public int M0(@l IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback0, @m String s) {
                L.p(iMultiInstanceInvalidationCallback0, "callback");
                int v = 0;
                if(s == null) {
                    return 0;
                }
                RemoteCallbackList remoteCallbackList0 = this.d.a();
                MultiInstanceInvalidationService multiInstanceInvalidationService0 = this.d;
                synchronized(remoteCallbackList0) {
                    multiInstanceInvalidationService0.d(multiInstanceInvalidationService0.c() + 1);
                    int v2 = multiInstanceInvalidationService0.c();
                    if(multiInstanceInvalidationService0.a().register(iMultiInstanceInvalidationCallback0, v2)) {
                        multiInstanceInvalidationService0.b().put(v2, s);
                        v = v2;
                    }
                    else {
                        multiInstanceInvalidationService0.d(multiInstanceInvalidationService0.c() - 1);
                    }
                    return v;
                }
            }

            @Override  // androidx.room.IMultiInstanceInvalidationService
            public void g1(@l IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback0, int v) {
                L.p(iMultiInstanceInvalidationCallback0, "callback");
                synchronized(this.d.a()) {
                    this.d.a().unregister(iMultiInstanceInvalidationCallback0);
                    String s = (String)this.d.b().remove(v);
                }
            }
        };
    }

    @l
    public final RemoteCallbackList a() {
        return this.c;
    }

    @l
    public final Map b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final void d(int v) {
        this.a = v;
    }

    @Override  // android.app.Service
    @l
    public IBinder onBind(@l Intent intent0) {
        L.p(intent0, "intent");
        return this.d;
    }
}

