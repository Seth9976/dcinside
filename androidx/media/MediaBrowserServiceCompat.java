package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser.MediaItem;
import android.media.session.MediaSession.Token;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder.DeathRecipient;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService.BrowserRoot;
import android.service.media.MediaBrowserService.Result;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.core.app.BundleCompat;
import androidx.core.util.Pair;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class MediaBrowserServiceCompat extends Service {
    public static final class BrowserRoot {
        private final String a;
        private final Bundle b;
        public static final String c = "android.service.media.extra.RECENT";
        public static final String d = "android.service.media.extra.OFFLINE";
        public static final String e = "android.service.media.extra.SUGGESTED";
        @Deprecated
        public static final String f = "android.service.media.extra.SUGGESTION_KEYWORDS";

        public BrowserRoot(@NonNull String s, @Nullable Bundle bundle0) {
            if(s == null) {
                throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
            }
            this.a = s;
            this.b = bundle0;
        }

        public Bundle c() {
            return this.b;
        }

        public String d() {
            return this.a;
        }
    }

    class ConnectionRecord implements IBinder.DeathRecipient {
        public final String a;
        public final int b;
        public final int c;
        public final RemoteUserInfo d;
        public final Bundle e;
        public final ServiceCallbacks f;
        public final HashMap g;
        public BrowserRoot h;
        final MediaBrowserServiceCompat i;

        ConnectionRecord(String s, int v, int v1, Bundle bundle0, ServiceCallbacks mediaBrowserServiceCompat$ServiceCallbacks0) {
            this.g = new HashMap();
            this.a = s;
            this.b = v;
            this.c = v1;
            this.d = new RemoteUserInfo(s, v, v1);
            this.e = bundle0;
            this.f = mediaBrowserServiceCompat$ServiceCallbacks0;
        }

        @Override  // android.os.IBinder$DeathRecipient
        public void binderDied() {
            androidx.media.MediaBrowserServiceCompat.ConnectionRecord.1 mediaBrowserServiceCompat$ConnectionRecord$10 = new Runnable() {
                final ConnectionRecord a;

                @Override
                public void run() {
                    IBinder iBinder0 = ConnectionRecord.this.f.asBinder();
                    MediaBrowserServiceCompat.this.e.remove(iBinder0);
                }
            };
            MediaBrowserServiceCompat.this.g.post(mediaBrowserServiceCompat$ConnectionRecord$10);
        }
    }

    interface MediaBrowserServiceImpl {
        RemoteUserInfo a();

        Bundle b();

        IBinder c(Intent arg1);

        void d(String arg1, Bundle arg2);

        void e(Token arg1);

        void f(RemoteUserInfo arg1, String arg2, Bundle arg3);

        void onCreate();
    }

    @RequiresApi(21)
    class MediaBrowserServiceImplApi21 implements MediaBrowserServiceImpl {
        @RequiresApi(21)
        class MediaBrowserServiceApi21 extends MediaBrowserService {
            final MediaBrowserServiceImplApi21 a;

            MediaBrowserServiceApi21(Context context0) {
                this.attachBaseContext(context0);
            }

            @Override  // android.service.media.MediaBrowserService
            public MediaBrowserService.BrowserRoot onGetRoot(String s, int v, Bundle bundle0) {
                MediaSessionCompat.b(bundle0);
                Bundle bundle1 = bundle0 == null ? null : new Bundle(bundle0);
                BrowserRoot mediaBrowserServiceCompat$BrowserRoot0 = MediaBrowserServiceImplApi21.this.k(s, v, bundle1);
                return mediaBrowserServiceCompat$BrowserRoot0 == null ? null : new MediaBrowserService.BrowserRoot(mediaBrowserServiceCompat$BrowserRoot0.a, mediaBrowserServiceCompat$BrowserRoot0.b);
            }

            @Override  // android.service.media.MediaBrowserService
            public void onLoadChildren(String s, MediaBrowserService.Result mediaBrowserService$Result0) {
                ResultWrapper mediaBrowserServiceCompat$ResultWrapper0 = new ResultWrapper(mediaBrowserService$Result0);
                MediaBrowserServiceImplApi21.this.l(s, mediaBrowserServiceCompat$ResultWrapper0);
            }
        }

        final List a;
        MediaBrowserService b;
        Messenger c;
        final MediaBrowserServiceCompat d;

        MediaBrowserServiceImplApi21() {
            this.a = new ArrayList();
        }

        @Override  // androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl
        public RemoteUserInfo a() {
            ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0 = MediaBrowserServiceCompat.this.f;
            if(mediaBrowserServiceCompat$ConnectionRecord0 == null) {
                throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            return mediaBrowserServiceCompat$ConnectionRecord0.d;
        }

        @Override  // androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl
        public Bundle b() {
            if(this.c == null) {
                return null;
            }
            ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0 = MediaBrowserServiceCompat.this.f;
            if(mediaBrowserServiceCompat$ConnectionRecord0 == null) {
                throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            return mediaBrowserServiceCompat$ConnectionRecord0.e == null ? null : new Bundle(MediaBrowserServiceCompat.this.f.e);
        }

        @Override  // androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl
        public IBinder c(Intent intent0) {
            return this.b.onBind(intent0);
        }

        @Override  // androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl
        public void d(String s, Bundle bundle0) {
            this.j(s, bundle0);
            this.h(s, bundle0);
        }

        @Override  // androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl
        public void e(Token mediaSessionCompat$Token0) {
            androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.1 mediaBrowserServiceCompat$MediaBrowserServiceImplApi21$10 = () -> {
                if(!MediaBrowserServiceImplApi21.this.a.isEmpty()) {
                    b b0 = this.a.e();
                    if(b0 != null) {
                        for(Object object0: MediaBrowserServiceImplApi21.this.a) {
                            BundleCompat.b(((Bundle)object0), "extra_session_binder", b0.asBinder());
                        }
                    }
                    MediaBrowserServiceImplApi21.this.a.clear();
                }
                MediaBrowserServiceImplApi21.this.b.setSessionToken(((MediaSession.Token)this.a.g()));
            };
            MediaBrowserServiceCompat.this.g.a(mediaBrowserServiceCompat$MediaBrowserServiceImplApi21$10);

            class androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.1 implements Runnable {
                final MediaBrowserServiceImplApi21 b;

                androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.1(Token mediaSessionCompat$Token0) {
                }

                @Override
                public void run() {
                    MediaBrowserServiceImplApi21.this.m(this.a);
                }
            }

        }

        @Override  // androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl
        public void f(RemoteUserInfo mediaSessionManager$RemoteUserInfo0, String s, Bundle bundle0) {
            this.g(mediaSessionManager$RemoteUserInfo0, s, bundle0);
        }

        void g(RemoteUserInfo mediaSessionManager$RemoteUserInfo0, String s, Bundle bundle0) {
            androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.4 mediaBrowserServiceCompat$MediaBrowserServiceImplApi21$40 = new Runnable() {
                final MediaBrowserServiceImplApi21 d;

                @Override
                public void run() {
                    for(int v = 0; v < MediaBrowserServiceCompat.this.e.size(); ++v) {
                        ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0 = (ConnectionRecord)MediaBrowserServiceCompat.this.e.l(v);
                        if(mediaBrowserServiceCompat$ConnectionRecord0.d.equals(mediaSessionManager$RemoteUserInfo0)) {
                            MediaBrowserServiceImplApi21.this.i(mediaBrowserServiceCompat$ConnectionRecord0, s, bundle0);
                        }
                    }
                }
            };
            MediaBrowserServiceCompat.this.g.post(mediaBrowserServiceCompat$MediaBrowserServiceImplApi21$40);
        }

        void h(String s, Bundle bundle0) {
            androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.3 mediaBrowserServiceCompat$MediaBrowserServiceImplApi21$30 = new Runnable() {
                final MediaBrowserServiceImplApi21 c;

                @Override
                public void run() {
                    for(Object object0: MediaBrowserServiceCompat.this.e.keySet()) {
                        ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0 = (ConnectionRecord)MediaBrowserServiceCompat.this.e.get(((IBinder)object0));
                        MediaBrowserServiceImplApi21.this.i(mediaBrowserServiceCompat$ConnectionRecord0, s, bundle0);
                    }
                }
            };
            MediaBrowserServiceCompat.this.g.post(mediaBrowserServiceCompat$MediaBrowserServiceImplApi21$30);
        }

        void i(ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0, String s, Bundle bundle0) {
            List list0 = (List)mediaBrowserServiceCompat$ConnectionRecord0.g.get(s);
            if(list0 != null) {
                for(Object object0: list0) {
                    Pair pair0 = (Pair)object0;
                    if(MediaBrowserCompatUtils.b(bundle0, ((Bundle)pair0.b))) {
                        MediaBrowserServiceCompat.this.u(s, mediaBrowserServiceCompat$ConnectionRecord0, ((Bundle)pair0.b), bundle0);
                    }
                }
            }
        }

        void j(String s, Bundle bundle0) {
            this.b.notifyChildrenChanged(s);
        }

        public BrowserRoot k(String s, int v, Bundle bundle0) {
            int v2;
            Bundle bundle1;
            if(bundle0 == null || bundle0.getInt("extra_client_version", 0) == 0) {
                bundle1 = null;
                v2 = -1;
            }
            else {
                bundle0.remove("extra_client_version");
                this.c = new Messenger(MediaBrowserServiceCompat.this.g);
                bundle1 = new Bundle();
                bundle1.putInt("extra_service_version", 2);
                BundleCompat.b(bundle1, "extra_messenger", this.c.getBinder());
                Token mediaSessionCompat$Token0 = MediaBrowserServiceCompat.this.h;
                if(mediaSessionCompat$Token0 == null) {
                    this.a.add(bundle1);
                }
                else {
                    b b0 = mediaSessionCompat$Token0.e();
                    BundleCompat.b(bundle1, "extra_session_binder", (b0 == null ? null : b0.asBinder()));
                }
                int v1 = bundle0.getInt("extra_calling_pid", -1);
                bundle0.remove("extra_calling_pid");
                v2 = v1;
            }
            ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0 = new ConnectionRecord(MediaBrowserServiceCompat.this, s, v2, v, bundle0, null);
            MediaBrowserServiceCompat.this.f = mediaBrowserServiceCompat$ConnectionRecord0;
            BrowserRoot mediaBrowserServiceCompat$BrowserRoot0 = MediaBrowserServiceCompat.this.m(s, v, bundle0);
            MediaBrowserServiceCompat mediaBrowserServiceCompat0 = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat0.f = null;
            if(mediaBrowserServiceCompat$BrowserRoot0 == null) {
                return null;
            }
            if(this.c != null) {
                mediaBrowserServiceCompat0.d.add(mediaBrowserServiceCompat$ConnectionRecord0);
            }
            if(bundle1 == null) {
                return new BrowserRoot(mediaBrowserServiceCompat$BrowserRoot0.d(), mediaBrowserServiceCompat$BrowserRoot0.c());
            }
            if(mediaBrowserServiceCompat$BrowserRoot0.c() != null) {
                bundle1.putAll(mediaBrowserServiceCompat$BrowserRoot0.c());
            }
            return new BrowserRoot(mediaBrowserServiceCompat$BrowserRoot0.d(), bundle1);
        }

        public void l(String s, ResultWrapper mediaBrowserServiceCompat$ResultWrapper0) {
            androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.2 mediaBrowserServiceCompat$MediaBrowserServiceImplApi21$20 = new Result(s) {
                final MediaBrowserServiceImplApi21 g;

                @Override  // androidx.media.MediaBrowserServiceCompat$Result
                public void b() {
                    mediaBrowserServiceCompat$ResultWrapper0.a();
                }

                @Override  // androidx.media.MediaBrowserServiceCompat$Result
                void g(@Nullable Object object0) {
                    this.l(((List)object0));
                }

                void l(@Nullable List list0) {
                    List list1;
                    if(list0 != null) {
                        ArrayList arrayList0 = new ArrayList(list0.size());
                        for(Object object0: list0) {
                            Parcel parcel0 = Parcel.obtain();
                            ((MediaItem)object0).writeToParcel(parcel0, 0);
                            arrayList0.add(parcel0);
                        }
                        list1 = arrayList0;
                    }
                    else if(Build.VERSION.SDK_INT >= 24) {
                        list1 = null;
                    }
                    else {
                        list1 = Collections.emptyList();
                    }
                    mediaBrowserServiceCompat$ResultWrapper0.c(list1);
                }
            };
            MediaBrowserServiceCompat.this.f = MediaBrowserServiceCompat.this.c;
            MediaBrowserServiceCompat.this.n(s, mediaBrowserServiceCompat$MediaBrowserServiceImplApi21$20);
            MediaBrowserServiceCompat.this.f = null;
        }

        // 检测为 Lambda 实现
        void m(Token mediaSessionCompat$Token0) [...]

        @Override  // androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl
        public void onCreate() {
            MediaBrowserServiceApi21 mediaBrowserServiceCompat$MediaBrowserServiceImplApi21$MediaBrowserServiceApi210 = new MediaBrowserServiceApi21(this, MediaBrowserServiceCompat.this);
            this.b = mediaBrowserServiceCompat$MediaBrowserServiceImplApi21$MediaBrowserServiceApi210;
            mediaBrowserServiceCompat$MediaBrowserServiceImplApi21$MediaBrowserServiceApi210.onCreate();
        }
    }

    @RequiresApi(23)
    class MediaBrowserServiceImplApi23 extends MediaBrowserServiceImplApi21 {
        class MediaBrowserServiceApi23 extends MediaBrowserServiceApi21 {
            final MediaBrowserServiceImplApi23 b;

            MediaBrowserServiceApi23(Context context0) {
                super(context0);
            }

            @Override  // android.service.media.MediaBrowserService
            public void onLoadItem(String s, MediaBrowserService.Result mediaBrowserService$Result0) {
                ResultWrapper mediaBrowserServiceCompat$ResultWrapper0 = new ResultWrapper(mediaBrowserService$Result0);
                MediaBrowserServiceImplApi23.this.n(s, mediaBrowserServiceCompat$ResultWrapper0);
            }
        }

        final MediaBrowserServiceCompat e;

        public void n(String s, ResultWrapper mediaBrowserServiceCompat$ResultWrapper0) {
            androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.1 mediaBrowserServiceCompat$MediaBrowserServiceImplApi23$10 = new Result(s) {
                final MediaBrowserServiceImplApi23 g;

                @Override  // androidx.media.MediaBrowserServiceCompat$Result
                public void b() {
                    mediaBrowserServiceCompat$ResultWrapper0.a();
                }

                @Override  // androidx.media.MediaBrowserServiceCompat$Result
                void g(@Nullable Object object0) {
                    this.l(((MediaItem)object0));
                }

                void l(@Nullable MediaItem mediaBrowserCompat$MediaItem0) {
                    if(mediaBrowserCompat$MediaItem0 == null) {
                        mediaBrowserServiceCompat$ResultWrapper0.c(null);
                        return;
                    }
                    Parcel parcel0 = Parcel.obtain();
                    mediaBrowserCompat$MediaItem0.writeToParcel(parcel0, 0);
                    mediaBrowserServiceCompat$ResultWrapper0.c(parcel0);
                }
            };
            MediaBrowserServiceCompat.this.f = MediaBrowserServiceCompat.this.c;
            MediaBrowserServiceCompat.this.p(s, mediaBrowserServiceCompat$MediaBrowserServiceImplApi23$10);
            MediaBrowserServiceCompat.this.f = null;
        }

        @Override  // androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21
        public void onCreate() {
            MediaBrowserServiceApi23 mediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi230 = new MediaBrowserServiceApi23(this, MediaBrowserServiceCompat.this);
            this.b = mediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi230;
            mediaBrowserServiceCompat$MediaBrowserServiceImplApi23$MediaBrowserServiceApi230.onCreate();
        }
    }

    @RequiresApi(26)
    class MediaBrowserServiceImplApi26 extends MediaBrowserServiceImplApi23 {
        class MediaBrowserServiceApi26 extends MediaBrowserServiceApi23 {
            final MediaBrowserServiceImplApi26 c;

            MediaBrowserServiceApi26(Context context0) {
                super(context0);
            }

            @Override  // android.service.media.MediaBrowserService
            public void onLoadChildren(String s, MediaBrowserService.Result mediaBrowserService$Result0, Bundle bundle0) {
                MediaSessionCompat.b(bundle0);
                MediaBrowserServiceCompat.this.f = MediaBrowserServiceCompat.this.c;
                ResultWrapper mediaBrowserServiceCompat$ResultWrapper0 = new ResultWrapper(mediaBrowserService$Result0);
                MediaBrowserServiceImplApi26.this.o(s, mediaBrowserServiceCompat$ResultWrapper0, bundle0);
                MediaBrowserServiceCompat.this.f = null;
            }
        }

        final MediaBrowserServiceCompat f;

        @Override  // androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21
        public Bundle b() {
            MediaBrowserServiceCompat mediaBrowserServiceCompat0 = MediaBrowserServiceCompat.this;
            ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0 = mediaBrowserServiceCompat0.f;
            if(mediaBrowserServiceCompat$ConnectionRecord0 == null) {
                throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            if(mediaBrowserServiceCompat$ConnectionRecord0 == mediaBrowserServiceCompat0.c) {
                return this.b.getBrowserRootHints();
            }
            return mediaBrowserServiceCompat$ConnectionRecord0.e == null ? null : new Bundle(MediaBrowserServiceCompat.this.f.e);
        }

        @Override  // androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21
        void j(String s, Bundle bundle0) {
            if(bundle0 != null) {
                this.b.notifyChildrenChanged(s, bundle0);
                return;
            }
            super.j(s, null);
        }

        public void o(String s, ResultWrapper mediaBrowserServiceCompat$ResultWrapper0, Bundle bundle0) {
            androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplApi26.1 mediaBrowserServiceCompat$MediaBrowserServiceImplApi26$10 = new Result(s) {
                final MediaBrowserServiceImplApi26 h;

                @Override  // androidx.media.MediaBrowserServiceCompat$Result
                public void b() {
                    mediaBrowserServiceCompat$ResultWrapper0.a();
                }

                @Override  // androidx.media.MediaBrowserServiceCompat$Result
                void g(@Nullable Object object0) {
                    this.l(((List)object0));
                }

                void l(@Nullable List list0) {
                    if(list0 == null) {
                        mediaBrowserServiceCompat$ResultWrapper0.c(null);
                        return;
                    }
                    if((this.c() & 1) != 0) {
                        list0 = MediaBrowserServiceCompat.this.b(list0, bundle0);
                    }
                    ArrayList arrayList0 = new ArrayList(list0.size());
                    for(Object object0: list0) {
                        Parcel parcel0 = Parcel.obtain();
                        ((MediaItem)object0).writeToParcel(parcel0, 0);
                        arrayList0.add(parcel0);
                    }
                    mediaBrowserServiceCompat$ResultWrapper0.c(arrayList0);
                }
            };
            MediaBrowserServiceCompat.this.f = MediaBrowserServiceCompat.this.c;
            MediaBrowserServiceCompat.this.o(s, mediaBrowserServiceCompat$MediaBrowserServiceImplApi26$10, bundle0);
            MediaBrowserServiceCompat.this.f = null;
        }

        @Override  // androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi23
        public void onCreate() {
            MediaBrowserServiceApi26 mediaBrowserServiceCompat$MediaBrowserServiceImplApi26$MediaBrowserServiceApi260 = new MediaBrowserServiceApi26(this, MediaBrowserServiceCompat.this);
            this.b = mediaBrowserServiceCompat$MediaBrowserServiceImplApi26$MediaBrowserServiceApi260;
            mediaBrowserServiceCompat$MediaBrowserServiceImplApi26$MediaBrowserServiceApi260.onCreate();
        }
    }

    @RequiresApi(28)
    class MediaBrowserServiceImplApi28 extends MediaBrowserServiceImplApi26 {
        final MediaBrowserServiceCompat g;

        @Override  // androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImplApi21
        public RemoteUserInfo a() {
            MediaBrowserServiceCompat mediaBrowserServiceCompat0 = MediaBrowserServiceCompat.this;
            ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0 = mediaBrowserServiceCompat0.f;
            if(mediaBrowserServiceCompat$ConnectionRecord0 == null) {
                throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            return mediaBrowserServiceCompat$ConnectionRecord0 == mediaBrowserServiceCompat0.c ? new RemoteUserInfo(this.b.getCurrentBrowserInfo()) : mediaBrowserServiceCompat$ConnectionRecord0.d;
        }
    }

    class MediaBrowserServiceImplBase implements MediaBrowserServiceImpl {
        private Messenger a;
        final MediaBrowserServiceCompat b;

        @Override  // androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl
        public RemoteUserInfo a() {
            ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0 = MediaBrowserServiceCompat.this.f;
            if(mediaBrowserServiceCompat$ConnectionRecord0 == null) {
                throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            return mediaBrowserServiceCompat$ConnectionRecord0.d;
        }

        @Override  // androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl
        public Bundle b() {
            ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0 = MediaBrowserServiceCompat.this.f;
            if(mediaBrowserServiceCompat$ConnectionRecord0 == null) {
                throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            return mediaBrowserServiceCompat$ConnectionRecord0.e == null ? null : new Bundle(MediaBrowserServiceCompat.this.f.e);
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl
        public IBinder c(Intent intent0) {
            return "android.media.browse.MediaBrowserService".equals(intent0.getAction()) ? this.a.getBinder() : null;
        }

        @Override  // androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl
        public void d(@NonNull String s, Bundle bundle0) {
            androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplBase.2 mediaBrowserServiceCompat$MediaBrowserServiceImplBase$20 = new Runnable() {
                final MediaBrowserServiceImplBase c;

                @Override
                public void run() {
                    for(Object object0: MediaBrowserServiceCompat.this.e.keySet()) {
                        ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0 = (ConnectionRecord)MediaBrowserServiceCompat.this.e.get(((IBinder)object0));
                        MediaBrowserServiceImplBase.this.g(mediaBrowserServiceCompat$ConnectionRecord0, s, bundle0);
                    }
                }
            };
            MediaBrowserServiceCompat.this.g.post(mediaBrowserServiceCompat$MediaBrowserServiceImplBase$20);
        }

        @Override  // androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl
        public void e(Token mediaSessionCompat$Token0) {
            androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplBase.1 mediaBrowserServiceCompat$MediaBrowserServiceImplBase$10 = new Runnable() {
                final MediaBrowserServiceImplBase b;

                @Override
                public void run() {
                    Iterator iterator0 = MediaBrowserServiceCompat.this.e.values().iterator();
                    while(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0 = (ConnectionRecord)object0;
                        try {
                            mediaBrowserServiceCompat$ConnectionRecord0.f.c(mediaBrowserServiceCompat$ConnectionRecord0.h.d(), mediaSessionCompat$Token0, mediaBrowserServiceCompat$ConnectionRecord0.h.c());
                        }
                        catch(RemoteException unused_ex) {
                            Log.w("MBServiceCompat", "Connection for " + mediaBrowserServiceCompat$ConnectionRecord0.a + " is no longer valid.");
                            iterator0.remove();
                        }
                    }
                }
            };
            MediaBrowserServiceCompat.this.g.post(mediaBrowserServiceCompat$MediaBrowserServiceImplBase$10);
        }

        @Override  // androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl
        public void f(@NonNull RemoteUserInfo mediaSessionManager$RemoteUserInfo0, @NonNull String s, Bundle bundle0) {
            androidx.media.MediaBrowserServiceCompat.MediaBrowserServiceImplBase.3 mediaBrowserServiceCompat$MediaBrowserServiceImplBase$30 = new Runnable() {
                final MediaBrowserServiceImplBase d;

                @Override
                public void run() {
                    for(int v = 0; v < MediaBrowserServiceCompat.this.e.size(); ++v) {
                        ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0 = (ConnectionRecord)MediaBrowserServiceCompat.this.e.l(v);
                        if(mediaBrowserServiceCompat$ConnectionRecord0.d.equals(mediaSessionManager$RemoteUserInfo0)) {
                            MediaBrowserServiceImplBase.this.g(mediaBrowserServiceCompat$ConnectionRecord0, s, bundle0);
                            return;
                        }
                    }
                }
            };
            MediaBrowserServiceCompat.this.g.post(mediaBrowserServiceCompat$MediaBrowserServiceImplBase$30);
        }

        void g(ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0, String s, Bundle bundle0) {
            List list0 = (List)mediaBrowserServiceCompat$ConnectionRecord0.g.get(s);
            if(list0 != null) {
                for(Object object0: list0) {
                    Pair pair0 = (Pair)object0;
                    if(MediaBrowserCompatUtils.b(bundle0, ((Bundle)pair0.b))) {
                        MediaBrowserServiceCompat.this.u(s, mediaBrowserServiceCompat$ConnectionRecord0, ((Bundle)pair0.b), bundle0);
                    }
                }
            }
        }

        @Override  // androidx.media.MediaBrowserServiceCompat$MediaBrowserServiceImpl
        public void onCreate() {
            this.a = new Messenger(MediaBrowserServiceCompat.this.g);
        }
    }

    public static class Result {
        private final Object a;
        private boolean b;
        private boolean c;
        private boolean d;
        private int e;

        Result(Object object0) {
            this.a = object0;
        }

        private void a(@Nullable Bundle bundle0) {
            if(bundle0 == null) {
                return;
            }
            if(bundle0.containsKey("android.media.browse.extra.DOWNLOAD_PROGRESS")) {
                float f = bundle0.getFloat("android.media.browse.extra.DOWNLOAD_PROGRESS");
                if(f < -0.00001f || f > 1.00001f) {
                    throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0]");
                }
            }
        }

        public void b() {
            if(this.b) {
                throw new IllegalStateException("detach() called when detach() had already been called for: " + this.a);
            }
            if(this.c) {
                throw new IllegalStateException("detach() called when sendResult() had already been called for: " + this.a);
            }
            if(this.d) {
                throw new IllegalStateException("detach() called when sendError() had already been called for: " + this.a);
            }
            this.b = true;
        }

        int c() {
            return this.e;
        }

        // 去混淆评级： 低(30)
        boolean d() {
            return this.b || this.c || this.d;
        }

        void e(@Nullable Bundle bundle0) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.a);
        }

        void f(@Nullable Bundle bundle0) {
            throw new UnsupportedOperationException("It is not supported to send an interim update for " + this.a);
        }

        void g(@Nullable Object object0) {
        }

        public void h(@Nullable Bundle bundle0) {
            if(this.c || this.d) {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.a);
            }
            this.d = true;
            this.e(bundle0);
        }

        public void i(@Nullable Bundle bundle0) {
            if(this.c || this.d) {
                throw new IllegalStateException("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: " + this.a);
            }
            this.a(bundle0);
            this.f(bundle0);
        }

        public void j(@Nullable Object object0) {
            if(this.c || this.d) {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.a);
            }
            this.c = true;
            this.g(object0);
        }

        void k(int v) {
            this.e = v;
        }
    }

    @RequiresApi(21)
    static class ResultWrapper {
        MediaBrowserService.Result a;

        ResultWrapper(MediaBrowserService.Result mediaBrowserService$Result0) {
            this.a = mediaBrowserService$Result0;
        }

        public void a() {
            this.a.detach();
        }

        List b(List list0) {
            if(list0 == null) {
                return null;
            }
            List list1 = new ArrayList(list0.size());
            for(Object object0: list0) {
                ((Parcel)object0).setDataPosition(0);
                list1.add(((MediaBrowser.MediaItem)MediaBrowser.MediaItem.CREATOR.createFromParcel(((Parcel)object0))));
                ((Parcel)object0).recycle();
            }
            return list1;
        }

        public void c(Object object0) {
            if(object0 instanceof List) {
                this.a.sendResult(this.b(((List)object0)));
                return;
            }
            if(object0 instanceof Parcel) {
                ((Parcel)object0).setDataPosition(0);
                this.a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(((Parcel)object0)));
                ((Parcel)object0).recycle();
                return;
            }
            this.a.sendResult(null);
        }
    }

    class ServiceBinderImpl {
        final MediaBrowserServiceCompat a;

        public void a(String s, IBinder iBinder0, Bundle bundle0, ServiceCallbacks mediaBrowserServiceCompat$ServiceCallbacks0) {
            androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.3 mediaBrowserServiceCompat$ServiceBinderImpl$30 = new Runnable() {
                final ServiceBinderImpl e;

                @Override
                public void run() {
                    IBinder iBinder0 = mediaBrowserServiceCompat$ServiceCallbacks0.asBinder();
                    ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0 = (ConnectionRecord)MediaBrowserServiceCompat.this.e.get(iBinder0);
                    if(mediaBrowserServiceCompat$ConnectionRecord0 == null) {
                        Log.w("MBServiceCompat", "addSubscription for callback that isn\'t registered id=" + s);
                        return;
                    }
                    MediaBrowserServiceCompat.this.a(s, mediaBrowserServiceCompat$ConnectionRecord0, iBinder0, bundle0);
                }
            };
            MediaBrowserServiceCompat.this.g.a(mediaBrowserServiceCompat$ServiceBinderImpl$30);
        }

        public void b(String s, int v, int v1, Bundle bundle0, ServiceCallbacks mediaBrowserServiceCompat$ServiceCallbacks0) {
            if(!MediaBrowserServiceCompat.this.h(s, v1)) {
                throw new IllegalArgumentException("Package/uid mismatch: uid=" + v1 + " package=" + s);
            }
            androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.1 mediaBrowserServiceCompat$ServiceBinderImpl$10 = new Runnable() {
                final ServiceBinderImpl f;

                @Override
                public void run() {
                    IBinder iBinder0 = mediaBrowserServiceCompat$ServiceCallbacks0.asBinder();
                    MediaBrowserServiceCompat.this.e.remove(iBinder0);
                    ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0 = new ConnectionRecord(MediaBrowserServiceCompat.this, s, v, v1, bundle0, mediaBrowserServiceCompat$ServiceCallbacks0);
                    MediaBrowserServiceCompat.this.f = mediaBrowserServiceCompat$ConnectionRecord0;
                    BrowserRoot mediaBrowserServiceCompat$BrowserRoot0 = MediaBrowserServiceCompat.this.m(s, v1, bundle0);
                    mediaBrowserServiceCompat$ConnectionRecord0.h = mediaBrowserServiceCompat$BrowserRoot0;
                    MediaBrowserServiceCompat mediaBrowserServiceCompat0 = MediaBrowserServiceCompat.this;
                    mediaBrowserServiceCompat0.f = null;
                    if(mediaBrowserServiceCompat$BrowserRoot0 == null) {
                        Log.i("MBServiceCompat", "No root for client " + s + " from service " + this.getClass().getName());
                        try {
                            mediaBrowserServiceCompat$ServiceCallbacks0.b();
                        }
                        catch(RemoteException unused_ex) {
                            Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + s);
                        }
                        return;
                    }
                    try {
                        mediaBrowserServiceCompat0.e.put(iBinder0, mediaBrowserServiceCompat$ConnectionRecord0);
                        iBinder0.linkToDeath(mediaBrowserServiceCompat$ConnectionRecord0, 0);
                        if(MediaBrowserServiceCompat.this.h != null) {
                            mediaBrowserServiceCompat$ServiceCallbacks0.c(mediaBrowserServiceCompat$ConnectionRecord0.h.d(), MediaBrowserServiceCompat.this.h, mediaBrowserServiceCompat$ConnectionRecord0.h.c());
                        }
                    }
                    catch(RemoteException unused_ex) {
                        Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + s);
                        MediaBrowserServiceCompat.this.e.remove(iBinder0);
                    }
                }
            };
            MediaBrowserServiceCompat.this.g.a(mediaBrowserServiceCompat$ServiceBinderImpl$10);
        }

        public void c(ServiceCallbacks mediaBrowserServiceCompat$ServiceCallbacks0) {
            androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.2 mediaBrowserServiceCompat$ServiceBinderImpl$20 = new Runnable() {
                final ServiceBinderImpl b;

                @Override
                public void run() {
                    IBinder iBinder0 = mediaBrowserServiceCompat$ServiceCallbacks0.asBinder();
                    ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0 = (ConnectionRecord)MediaBrowserServiceCompat.this.e.remove(iBinder0);
                    if(mediaBrowserServiceCompat$ConnectionRecord0 != null) {
                        mediaBrowserServiceCompat$ConnectionRecord0.f.asBinder().unlinkToDeath(mediaBrowserServiceCompat$ConnectionRecord0, 0);
                    }
                }
            };
            MediaBrowserServiceCompat.this.g.a(mediaBrowserServiceCompat$ServiceBinderImpl$20);
        }

        public void d(String s, ResultReceiver resultReceiver0, ServiceCallbacks mediaBrowserServiceCompat$ServiceCallbacks0) {
            if(!TextUtils.isEmpty(s) && resultReceiver0 != null) {
                androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.5 mediaBrowserServiceCompat$ServiceBinderImpl$50 = new Runnable() {
                    final ServiceBinderImpl d;

                    @Override
                    public void run() {
                        IBinder iBinder0 = mediaBrowserServiceCompat$ServiceCallbacks0.asBinder();
                        ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0 = (ConnectionRecord)MediaBrowserServiceCompat.this.e.get(iBinder0);
                        if(mediaBrowserServiceCompat$ConnectionRecord0 == null) {
                            Log.w("MBServiceCompat", "getMediaItem for callback that isn\'t registered id=" + s);
                            return;
                        }
                        MediaBrowserServiceCompat.this.v(s, mediaBrowserServiceCompat$ConnectionRecord0, resultReceiver0);
                    }
                };
                MediaBrowserServiceCompat.this.g.a(mediaBrowserServiceCompat$ServiceBinderImpl$50);
            }
        }

        public void e(ServiceCallbacks mediaBrowserServiceCompat$ServiceCallbacks0, String s, int v, int v1, Bundle bundle0) {
            androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.6 mediaBrowserServiceCompat$ServiceBinderImpl$60 = new Runnable() {
                final ServiceBinderImpl f;

                @Override
                public void run() {
                    ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0;
                    IBinder iBinder0 = mediaBrowserServiceCompat$ServiceCallbacks0.asBinder();
                    MediaBrowserServiceCompat.this.e.remove(iBinder0);
                    Iterator iterator0 = MediaBrowserServiceCompat.this.d.iterator();
                    while(true) {
                        mediaBrowserServiceCompat$ConnectionRecord0 = null;
                        if(!iterator0.hasNext()) {
                            break;
                        }
                        Object object0 = iterator0.next();
                        ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord1 = (ConnectionRecord)object0;
                        if(mediaBrowserServiceCompat$ConnectionRecord1.c == v1) {
                            if(TextUtils.isEmpty(s) || v <= 0) {
                                mediaBrowserServiceCompat$ConnectionRecord0 = new ConnectionRecord(MediaBrowserServiceCompat.this, mediaBrowserServiceCompat$ConnectionRecord1.a, mediaBrowserServiceCompat$ConnectionRecord1.b, mediaBrowserServiceCompat$ConnectionRecord1.c, bundle0, mediaBrowserServiceCompat$ServiceCallbacks0);
                            }
                            iterator0.remove();
                            break;
                        }
                    }
                    if(mediaBrowserServiceCompat$ConnectionRecord0 == null) {
                        mediaBrowserServiceCompat$ConnectionRecord0 = new ConnectionRecord(MediaBrowserServiceCompat.this, s, v, v1, bundle0, mediaBrowserServiceCompat$ServiceCallbacks0);
                    }
                    MediaBrowserServiceCompat.this.e.put(iBinder0, mediaBrowserServiceCompat$ConnectionRecord0);
                    try {
                        iBinder0.linkToDeath(mediaBrowserServiceCompat$ConnectionRecord0, 0);
                    }
                    catch(RemoteException unused_ex) {
                        Log.w("MBServiceCompat", "IBinder is already dead.");
                    }
                }
            };
            MediaBrowserServiceCompat.this.g.a(mediaBrowserServiceCompat$ServiceBinderImpl$60);
        }

        public void f(String s, IBinder iBinder0, ServiceCallbacks mediaBrowserServiceCompat$ServiceCallbacks0) {
            androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.4 mediaBrowserServiceCompat$ServiceBinderImpl$40 = new Runnable() {
                final ServiceBinderImpl d;

                @Override
                public void run() {
                    IBinder iBinder0 = mediaBrowserServiceCompat$ServiceCallbacks0.asBinder();
                    ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0 = (ConnectionRecord)MediaBrowserServiceCompat.this.e.get(iBinder0);
                    if(mediaBrowserServiceCompat$ConnectionRecord0 == null) {
                        Log.w("MBServiceCompat", "removeSubscription for callback that isn\'t registered id=" + s);
                        return;
                    }
                    if(!MediaBrowserServiceCompat.this.x(s, mediaBrowserServiceCompat$ConnectionRecord0, iBinder0)) {
                        Log.w("MBServiceCompat", "removeSubscription called for " + s + " which is not subscribed");
                    }
                }
            };
            MediaBrowserServiceCompat.this.g.a(mediaBrowserServiceCompat$ServiceBinderImpl$40);
        }

        public void g(String s, Bundle bundle0, ResultReceiver resultReceiver0, ServiceCallbacks mediaBrowserServiceCompat$ServiceCallbacks0) {
            if(!TextUtils.isEmpty(s) && resultReceiver0 != null) {
                androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.8 mediaBrowserServiceCompat$ServiceBinderImpl$80 = new Runnable() {
                    final ServiceBinderImpl e;

                    @Override
                    public void run() {
                        IBinder iBinder0 = mediaBrowserServiceCompat$ServiceCallbacks0.asBinder();
                        ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0 = (ConnectionRecord)MediaBrowserServiceCompat.this.e.get(iBinder0);
                        if(mediaBrowserServiceCompat$ConnectionRecord0 == null) {
                            Log.w("MBServiceCompat", "search for callback that isn\'t registered query=" + s);
                            return;
                        }
                        MediaBrowserServiceCompat.this.w(s, bundle0, mediaBrowserServiceCompat$ConnectionRecord0, resultReceiver0);
                    }
                };
                MediaBrowserServiceCompat.this.g.a(mediaBrowserServiceCompat$ServiceBinderImpl$80);
            }
        }

        public void h(String s, Bundle bundle0, ResultReceiver resultReceiver0, ServiceCallbacks mediaBrowserServiceCompat$ServiceCallbacks0) {
            if(!TextUtils.isEmpty(s) && resultReceiver0 != null) {
                androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.9 mediaBrowserServiceCompat$ServiceBinderImpl$90 = new Runnable() {
                    final ServiceBinderImpl e;

                    @Override
                    public void run() {
                        IBinder iBinder0 = mediaBrowserServiceCompat$ServiceCallbacks0.asBinder();
                        ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0 = (ConnectionRecord)MediaBrowserServiceCompat.this.e.get(iBinder0);
                        if(mediaBrowserServiceCompat$ConnectionRecord0 == null) {
                            Log.w("MBServiceCompat", "sendCustomAction for callback that isn\'t registered action=" + s + ", extras=" + bundle0);
                            return;
                        }
                        MediaBrowserServiceCompat.this.t(s, bundle0, mediaBrowserServiceCompat$ConnectionRecord0, resultReceiver0);
                    }
                };
                MediaBrowserServiceCompat.this.g.a(mediaBrowserServiceCompat$ServiceBinderImpl$90);
            }
        }

        public void i(ServiceCallbacks mediaBrowserServiceCompat$ServiceCallbacks0) {
            androidx.media.MediaBrowserServiceCompat.ServiceBinderImpl.7 mediaBrowserServiceCompat$ServiceBinderImpl$70 = new Runnable() {
                final ServiceBinderImpl b;

                @Override
                public void run() {
                    IBinder iBinder0 = mediaBrowserServiceCompat$ServiceCallbacks0.asBinder();
                    ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0 = (ConnectionRecord)MediaBrowserServiceCompat.this.e.remove(iBinder0);
                    if(mediaBrowserServiceCompat$ConnectionRecord0 != null) {
                        iBinder0.unlinkToDeath(mediaBrowserServiceCompat$ConnectionRecord0, 0);
                    }
                }
            };
            MediaBrowserServiceCompat.this.g.a(mediaBrowserServiceCompat$ServiceBinderImpl$70);
        }
    }

    interface ServiceCallbacks {
        void a(String arg1, List arg2, Bundle arg3, Bundle arg4) throws RemoteException;

        IBinder asBinder();

        void b() throws RemoteException;

        void c(String arg1, Token arg2, Bundle arg3) throws RemoteException;
    }

    static class ServiceCallbacksCompat implements ServiceCallbacks {
        final Messenger a;

        ServiceCallbacksCompat(Messenger messenger0) {
            this.a = messenger0;
        }

        @Override  // androidx.media.MediaBrowserServiceCompat$ServiceCallbacks
        public void a(String s, List list0, Bundle bundle0, Bundle bundle1) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", s);
            bundle2.putBundle("data_options", bundle0);
            bundle2.putBundle("data_notify_children_changed_options", bundle1);
            if(list0 != null) {
                bundle2.putParcelableArrayList("data_media_item_list", (list0 instanceof ArrayList ? ((ArrayList)list0) : new ArrayList(list0)));
            }
            this.d(3, bundle2);
        }

        @Override  // androidx.media.MediaBrowserServiceCompat$ServiceCallbacks
        public IBinder asBinder() {
            return this.a.getBinder();
        }

        @Override  // androidx.media.MediaBrowserServiceCompat$ServiceCallbacks
        public void b() throws RemoteException {
            this.d(2, null);
        }

        @Override  // androidx.media.MediaBrowserServiceCompat$ServiceCallbacks
        public void c(String s, Token mediaSessionCompat$Token0, Bundle bundle0) throws RemoteException {
            if(bundle0 == null) {
                bundle0 = new Bundle();
            }
            bundle0.putInt("extra_service_version", 2);
            Bundle bundle1 = new Bundle();
            bundle1.putString("data_media_item_id", s);
            bundle1.putParcelable("data_media_session_token", mediaSessionCompat$Token0);
            bundle1.putBundle("data_root_hints", bundle0);
            this.d(1, bundle1);
        }

        private void d(int v, Bundle bundle0) throws RemoteException {
            Message message0 = Message.obtain();
            message0.what = v;
            message0.arg1 = 2;
            message0.setData(bundle0);
            this.a.send(message0);
        }
    }

    static final class ServiceHandler extends Handler {
        @Nullable
        private MediaBrowserServiceCompat a;

        @MainThread
        ServiceHandler(@NonNull MediaBrowserServiceCompat mediaBrowserServiceCompat0) {
            this.a = mediaBrowserServiceCompat0;
        }

        public void a(Runnable runnable0) {
            if(Thread.currentThread() == this.getLooper().getThread()) {
                runnable0.run();
                return;
            }
            this.post(runnable0);
        }

        @MainThread
        public void b() {
            this.a = null;
        }

        @Override  // android.os.Handler
        @MainThread
        public void handleMessage(@NonNull Message message0) {
            MediaBrowserServiceCompat mediaBrowserServiceCompat0 = this.a;
            if(mediaBrowserServiceCompat0 != null) {
                mediaBrowserServiceCompat0.g(message0);
                return;
            }
            this.removeCallbacksAndMessages(null);
        }

        @Override  // android.os.Handler
        public boolean sendMessageAtTime(Message message0, long v) {
            Bundle bundle0 = message0.getData();
            bundle0.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            bundle0.putInt("data_calling_uid", Binder.getCallingUid());
            int v1 = Binder.getCallingPid();
            if(v1 > 0) {
                bundle0.putInt("data_calling_pid", v1);
                return super.sendMessageAtTime(message0, v);
            }
            if(!bundle0.containsKey("data_calling_pid")) {
                bundle0.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message0, v);
        }
    }

    private MediaBrowserServiceImpl a;
    private final ServiceBinderImpl b;
    final ConnectionRecord c;
    final ArrayList d;
    final ArrayMap e;
    ConnectionRecord f;
    final ServiceHandler g;
    Token h;
    static final String i = "MBServiceCompat";
    static final boolean j = false;
    private static final float k = 0.00001f;
    public static final String l = "android.media.browse.MediaBrowserService";
    @RestrictTo({Scope.a})
    public static final String m = "media_item";
    @RestrictTo({Scope.a})
    public static final String n = "search_results";
    static final int o = 1;
    static final int p = 2;
    static final int q = 4;
    @RestrictTo({Scope.a})
    public static final int r = -1;
    @RestrictTo({Scope.a})
    public static final int s = 0;
    @RestrictTo({Scope.a})
    public static final int t = 1;

    static {
        MediaBrowserServiceCompat.j = Log.isLoggable("MBServiceCompat", 3);
    }

    public MediaBrowserServiceCompat() {
        this.b = new ServiceBinderImpl(this);
        this.c = new ConnectionRecord(this, "android.media.session.MediaController", -1, -1, null, null);
        this.d = new ArrayList();
        this.e = new ArrayMap();
        this.g = new ServiceHandler(this);
    }

    void a(String s, ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0, IBinder iBinder0, Bundle bundle0) {
        List list0 = (List)mediaBrowserServiceCompat$ConnectionRecord0.g.get(s);
        if(list0 == null) {
            list0 = new ArrayList();
        }
        for(Object object0: list0) {
            if(iBinder0 == ((Pair)object0).a && MediaBrowserCompatUtils.a(bundle0, ((Bundle)((Pair)object0).b))) {
                return;
            }
            if(false) {
                break;
            }
        }
        list0.add(new Pair(iBinder0, bundle0));
        mediaBrowserServiceCompat$ConnectionRecord0.g.put(s, list0);
        this.u(s, mediaBrowserServiceCompat$ConnectionRecord0, bundle0, null);
        this.f = null;
    }

    List b(List list0, Bundle bundle0) {
        if(list0 == null) {
            return null;
        }
        int v = bundle0.getInt("android.media.browse.extra.PAGE", -1);
        int v1 = bundle0.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if(v == -1 && v1 == -1) {
            return list0;
        }
        int v2 = v1 * v;
        int v3 = v2 + v1;
        if(v >= 0 && v1 >= 1 && v2 < list0.size()) {
            if(v3 > list0.size()) {
                v3 = list0.size();
            }
            return list0.subList(v2, v3);
        }
        return Collections.emptyList();
    }

    @RestrictTo({Scope.c})
    public void c(Context context0) {
        this.attachBaseContext(context0);
    }

    public final Bundle d() {
        return this.a.b();
    }

    @Override  // android.app.Service
    public void dump(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
    }

    @NonNull
    public final RemoteUserInfo e() {
        return this.a.a();
    }

    @Nullable
    public Token f() {
        return this.h;
    }

    void g(Message message0) {
        Bundle bundle0 = message0.getData();
        switch(message0.what) {
            case 1: {
                Bundle bundle1 = bundle0.getBundle("data_root_hints");
                MediaSessionCompat.b(bundle1);
                String s = bundle0.getString("data_package_name");
                int v = bundle0.getInt("data_calling_pid");
                int v1 = bundle0.getInt("data_calling_uid");
                ServiceCallbacksCompat mediaBrowserServiceCompat$ServiceCallbacksCompat0 = new ServiceCallbacksCompat(message0.replyTo);
                this.b.b(s, v, v1, bundle1, mediaBrowserServiceCompat$ServiceCallbacksCompat0);
                return;
            }
            case 2: {
                ServiceCallbacksCompat mediaBrowserServiceCompat$ServiceCallbacksCompat1 = new ServiceCallbacksCompat(message0.replyTo);
                this.b.c(mediaBrowserServiceCompat$ServiceCallbacksCompat1);
                return;
            }
            case 3: {
                Bundle bundle2 = bundle0.getBundle("data_options");
                MediaSessionCompat.b(bundle2);
                String s1 = bundle0.getString("data_media_item_id");
                IBinder iBinder0 = BundleCompat.a(bundle0, "data_callback_token");
                ServiceCallbacksCompat mediaBrowserServiceCompat$ServiceCallbacksCompat2 = new ServiceCallbacksCompat(message0.replyTo);
                this.b.a(s1, iBinder0, bundle2, mediaBrowserServiceCompat$ServiceCallbacksCompat2);
                return;
            }
            case 4: {
                String s2 = bundle0.getString("data_media_item_id");
                IBinder iBinder1 = BundleCompat.a(bundle0, "data_callback_token");
                ServiceCallbacksCompat mediaBrowserServiceCompat$ServiceCallbacksCompat3 = new ServiceCallbacksCompat(message0.replyTo);
                this.b.f(s2, iBinder1, mediaBrowserServiceCompat$ServiceCallbacksCompat3);
                return;
            }
            case 5: {
                String s3 = bundle0.getString("data_media_item_id");
                ResultReceiver resultReceiver0 = (ResultReceiver)bundle0.getParcelable("data_result_receiver");
                ServiceCallbacksCompat mediaBrowserServiceCompat$ServiceCallbacksCompat4 = new ServiceCallbacksCompat(message0.replyTo);
                this.b.d(s3, resultReceiver0, mediaBrowserServiceCompat$ServiceCallbacksCompat4);
                return;
            }
            case 6: {
                Bundle bundle3 = bundle0.getBundle("data_root_hints");
                MediaSessionCompat.b(bundle3);
                ServiceCallbacksCompat mediaBrowserServiceCompat$ServiceCallbacksCompat5 = new ServiceCallbacksCompat(message0.replyTo);
                String s4 = bundle0.getString("data_package_name");
                int v2 = bundle0.getInt("data_calling_pid");
                int v3 = bundle0.getInt("data_calling_uid");
                this.b.e(mediaBrowserServiceCompat$ServiceCallbacksCompat5, s4, v2, v3, bundle3);
                return;
            }
            case 7: {
                ServiceCallbacksCompat mediaBrowserServiceCompat$ServiceCallbacksCompat6 = new ServiceCallbacksCompat(message0.replyTo);
                this.b.i(mediaBrowserServiceCompat$ServiceCallbacksCompat6);
                return;
            }
            case 8: {
                Bundle bundle4 = bundle0.getBundle("data_search_extras");
                MediaSessionCompat.b(bundle4);
                String s5 = bundle0.getString("data_search_query");
                ResultReceiver resultReceiver1 = (ResultReceiver)bundle0.getParcelable("data_result_receiver");
                ServiceCallbacksCompat mediaBrowserServiceCompat$ServiceCallbacksCompat7 = new ServiceCallbacksCompat(message0.replyTo);
                this.b.g(s5, bundle4, resultReceiver1, mediaBrowserServiceCompat$ServiceCallbacksCompat7);
                return;
            }
            case 9: {
                Bundle bundle5 = bundle0.getBundle("data_custom_action_extras");
                MediaSessionCompat.b(bundle5);
                String s6 = bundle0.getString("data_custom_action");
                ResultReceiver resultReceiver2 = (ResultReceiver)bundle0.getParcelable("data_result_receiver");
                ServiceCallbacksCompat mediaBrowserServiceCompat$ServiceCallbacksCompat8 = new ServiceCallbacksCompat(message0.replyTo);
                this.b.h(s6, bundle5, resultReceiver2, mediaBrowserServiceCompat$ServiceCallbacksCompat8);
                return;
            }
            default: {
                Log.w("MBServiceCompat", "Unhandled message: " + message0 + "\n  Service version: " + 2 + "\n  Client version: " + message0.arg1);
            }
        }
    }

    boolean h(String s, int v) {
        if(s == null) {
            return false;
        }
        String[] arr_s = this.getPackageManager().getPackagesForUid(v);
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            if(arr_s[v1].equals(s)) {
                return true;
            }
        }
        return false;
    }

    @RestrictTo({Scope.c})
    public void i(@NonNull RemoteUserInfo mediaSessionManager$RemoteUserInfo0, @NonNull String s, @NonNull Bundle bundle0) {
        if(mediaSessionManager$RemoteUserInfo0 == null) {
            throw new IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
        }
        if(s == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if(bundle0 == null) {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
        this.a.f(mediaSessionManager$RemoteUserInfo0, s, bundle0);
    }

    public void j(@NonNull String s) {
        if(s == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        this.a.d(s, null);
    }

    public void k(@NonNull String s, @NonNull Bundle bundle0) {
        if(s == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if(bundle0 == null) {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
        this.a.d(s, bundle0);
    }

    public void l(@NonNull String s, Bundle bundle0, @NonNull Result mediaBrowserServiceCompat$Result0) {
        mediaBrowserServiceCompat$Result0.h(null);
    }

    @Nullable
    public abstract BrowserRoot m(@NonNull String arg1, int arg2, @Nullable Bundle arg3);

    public abstract void n(@NonNull String arg1, @NonNull Result arg2);

    public void o(@NonNull String s, @NonNull Result mediaBrowserServiceCompat$Result0, @NonNull Bundle bundle0) {
        mediaBrowserServiceCompat$Result0.k(1);
        this.n(s, mediaBrowserServiceCompat$Result0);
    }

    @Override  // android.app.Service
    public IBinder onBind(Intent intent0) {
        return this.a.c(intent0);
    }

    @Override  // android.app.Service
    public void onCreate() {
        super.onCreate();
        int v = Build.VERSION.SDK_INT;
        if(v >= 28) {
            this.a = new MediaBrowserServiceImplApi28(this);
        }
        else if(v >= 26) {
            this.a = new MediaBrowserServiceImplApi26(this);
        }
        else if(v >= 23) {
            this.a = new MediaBrowserServiceImplApi23(this);
        }
        else {
            this.a = new MediaBrowserServiceImplApi21(this);
        }
        this.a.onCreate();
    }

    @Override  // android.app.Service
    @CallSuper
    @MainThread
    public void onDestroy() {
        this.g.b();
    }

    public void p(String s, @NonNull Result mediaBrowserServiceCompat$Result0) {
        mediaBrowserServiceCompat$Result0.k(2);
        mediaBrowserServiceCompat$Result0.j(null);
    }

    public void q(@NonNull String s, Bundle bundle0, @NonNull Result mediaBrowserServiceCompat$Result0) {
        mediaBrowserServiceCompat$Result0.k(4);
        mediaBrowserServiceCompat$Result0.j(null);
    }

    @RestrictTo({Scope.c})
    public void r(String s, Bundle bundle0) {
    }

    @RestrictTo({Scope.c})
    public void s(String s) {
    }

    void t(String s, Bundle bundle0, ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0, ResultReceiver resultReceiver0) {
        androidx.media.MediaBrowserServiceCompat.4 mediaBrowserServiceCompat$40 = new Result(s) {
            final MediaBrowserServiceCompat g;

            @Override  // androidx.media.MediaBrowserServiceCompat$Result
            void e(@Nullable Bundle bundle0) {
                resultReceiver0.c(-1, bundle0);
            }

            @Override  // androidx.media.MediaBrowserServiceCompat$Result
            void f(@Nullable Bundle bundle0) {
                resultReceiver0.c(1, bundle0);
            }

            @Override  // androidx.media.MediaBrowserServiceCompat$Result
            void g(@Nullable Object object0) {
                this.l(((Bundle)object0));
            }

            void l(@Nullable Bundle bundle0) {
                resultReceiver0.c(0, bundle0);
            }
        };
        this.f = mediaBrowserServiceCompat$ConnectionRecord0;
        this.l(s, bundle0, mediaBrowserServiceCompat$40);
        this.f = null;
        if(!mediaBrowserServiceCompat$40.d()) {
            throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + s + " extras=" + bundle0);
        }
    }

    void u(String s, ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0, Bundle bundle0, Bundle bundle1) {
        androidx.media.MediaBrowserServiceCompat.1 mediaBrowserServiceCompat$10 = new Result(s) {
            final MediaBrowserServiceCompat j;

            @Override  // androidx.media.MediaBrowserServiceCompat$Result
            void g(@Nullable Object object0) {
                this.l(((List)object0));
            }

            void l(@Nullable List list0) {
                IBinder iBinder0 = mediaBrowserServiceCompat$ConnectionRecord0.f.asBinder();
                if(MediaBrowserServiceCompat.this.e.get(iBinder0) != mediaBrowserServiceCompat$ConnectionRecord0) {
                    if(MediaBrowserServiceCompat.j) {
                        Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + mediaBrowserServiceCompat$ConnectionRecord0.a + " id=" + s);
                    }
                    return;
                }
                if((this.c() & 1) != 0) {
                    list0 = MediaBrowserServiceCompat.this.b(list0, bundle0);
                }
                try {
                    mediaBrowserServiceCompat$ConnectionRecord0.f.a(s, list0, bundle0, bundle1);
                }
                catch(RemoteException unused_ex) {
                    Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + s + " package=" + mediaBrowserServiceCompat$ConnectionRecord0.a);
                }
            }
        };
        this.f = mediaBrowserServiceCompat$ConnectionRecord0;
        if(bundle0 == null) {
            this.n(s, mediaBrowserServiceCompat$10);
        }
        else {
            this.o(s, mediaBrowserServiceCompat$10, bundle0);
        }
        this.f = null;
        if(!mediaBrowserServiceCompat$10.d()) {
            throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + mediaBrowserServiceCompat$ConnectionRecord0.a + " id=" + s);
        }
    }

    void v(String s, ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0, ResultReceiver resultReceiver0) {
        androidx.media.MediaBrowserServiceCompat.2 mediaBrowserServiceCompat$20 = new Result(s) {
            final MediaBrowserServiceCompat g;

            @Override  // androidx.media.MediaBrowserServiceCompat$Result
            void g(@Nullable Object object0) {
                this.l(((MediaItem)object0));
            }

            void l(@Nullable MediaItem mediaBrowserCompat$MediaItem0) {
                if((this.c() & 2) != 0) {
                    resultReceiver0.c(-1, null);
                    return;
                }
                Bundle bundle0 = new Bundle();
                bundle0.putParcelable("media_item", mediaBrowserCompat$MediaItem0);
                resultReceiver0.c(0, bundle0);
            }
        };
        this.f = mediaBrowserServiceCompat$ConnectionRecord0;
        this.p(s, mediaBrowserServiceCompat$20);
        this.f = null;
        if(!mediaBrowserServiceCompat$20.d()) {
            throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + s);
        }
    }

    void w(String s, Bundle bundle0, ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0, ResultReceiver resultReceiver0) {
        androidx.media.MediaBrowserServiceCompat.3 mediaBrowserServiceCompat$30 = new Result(s) {
            final MediaBrowserServiceCompat g;

            @Override  // androidx.media.MediaBrowserServiceCompat$Result
            void g(@Nullable Object object0) {
                this.l(((List)object0));
            }

            void l(@Nullable List list0) {
                if((this.c() & 4) == 0 && list0 != null) {
                    Bundle bundle0 = new Bundle();
                    bundle0.putParcelableArray("search_results", ((Parcelable[])list0.toArray(new MediaItem[0])));
                    resultReceiver0.c(0, bundle0);
                    return;
                }
                resultReceiver0.c(-1, null);
            }
        };
        this.f = mediaBrowserServiceCompat$ConnectionRecord0;
        this.q(s, bundle0, mediaBrowserServiceCompat$30);
        this.f = null;
        if(!mediaBrowserServiceCompat$30.d()) {
            throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + s);
        }
    }

    boolean x(String s, ConnectionRecord mediaBrowserServiceCompat$ConnectionRecord0, IBinder iBinder0) {
        try {
            boolean z = false;
            if(iBinder0 != null) {
                List list0 = (List)mediaBrowserServiceCompat$ConnectionRecord0.g.get(s);
                if(list0 != null) {
                    Iterator iterator0 = list0.iterator();
                    while(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        if(iBinder0 == ((Pair)object0).a) {
                            iterator0.remove();
                            z = true;
                        }
                    }
                    if(list0.size() == 0) {
                        mediaBrowserServiceCompat$ConnectionRecord0.g.remove(s);
                    }
                }
            }
            else if(mediaBrowserServiceCompat$ConnectionRecord0.g.remove(s) != null) {
                z = true;
            }
            return z;
        }
        finally {
            this.f = null;
        }
    }

    public void y(Token mediaSessionCompat$Token0) {
        if(mediaSessionCompat$Token0 == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if(this.h != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.h = mediaSessionCompat$Token0;
        this.a.e(mediaSessionCompat$Token0);
    }
}

