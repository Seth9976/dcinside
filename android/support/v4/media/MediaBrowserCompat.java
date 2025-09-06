package android.support.v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser.ConnectionCallback;
import android.media.browse.MediaBrowser.ItemCallback;
import android.media.browse.MediaBrowser.MediaItem;
import android.media.browse.MediaBrowser.SubscriptionCallback;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.core.app.BundleCompat;
import androidx.media.MediaBrowserCompatUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public final class MediaBrowserCompat {
    static class CustomActionResultReceiver extends ResultReceiver {
        private final String d;
        private final Bundle e;
        private final d f;

        CustomActionResultReceiver(String s, Bundle bundle0, d mediaBrowserCompat$d0, Handler handler0) {
            super(handler0);
            this.d = s;
            this.e = bundle0;
            this.f = mediaBrowserCompat$d0;
        }

        @Override  // android.support.v4.os.ResultReceiver
        protected void a(int v, Bundle bundle0) {
            if(this.f == null) {
                return;
            }
            MediaSessionCompat.b(bundle0);
            switch(v) {
                case -1: {
                    return;
                }
                case 0: {
                    return;
                }
                default: {
                    if(v != 1) {
                        Log.w("MediaBrowserCompat", "Unknown result code: " + v + " (extras=" + this.e + ", resultData=" + bundle0 + ")");
                    }
                }
            }
        }
    }

    static class ItemReceiver extends ResultReceiver {
        private final String d;
        private final e e;

        ItemReceiver(String s, e mediaBrowserCompat$e0, Handler handler0) {
            super(handler0);
            this.d = s;
            this.e = mediaBrowserCompat$e0;
        }

        @Override  // android.support.v4.os.ResultReceiver
        protected void a(int v, Bundle bundle0) {
            if(bundle0 != null) {
                bundle0 = MediaSessionCompat.G(bundle0);
            }
            if(v == 0 && bundle0 != null && bundle0.containsKey("media_item")) {
                Parcelable parcelable0 = bundle0.getParcelable("media_item");
                if(parcelable0 != null && !(parcelable0 instanceof MediaItem)) {
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class MediaItem implements Parcelable {
        class a implements Parcelable.Creator {
            a() {
                super();
            }

            public MediaItem a(Parcel parcel0) {
                return new MediaItem(parcel0);
            }

            public MediaItem[] b(int v) {
                return new MediaItem[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.b(v);
            }
        }

        public static final Parcelable.Creator CREATOR = null;
        private final int a;
        private final MediaDescriptionCompat b;
        public static final int c = 1;
        public static final int d = 2;

        static {
            MediaItem.CREATOR = new a();
        }

        MediaItem(Parcel parcel0) {
            this.a = parcel0.readInt();
            this.b = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel0);
        }

        public MediaItem(@NonNull MediaDescriptionCompat mediaDescriptionCompat0, int v) {
            if(mediaDescriptionCompat0 == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if(TextUtils.isEmpty(mediaDescriptionCompat0.h())) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.a = v;
            this.b = mediaDescriptionCompat0;
        }

        public static MediaItem a(Object object0) {
            if(object0 != null) {
                int v = android.support.v4.media.MediaBrowserCompat.a.b(((MediaBrowser.MediaItem)object0));
                return new MediaItem(MediaDescriptionCompat.a(android.support.v4.media.MediaBrowserCompat.a.a(((MediaBrowser.MediaItem)object0))), v);
            }
            return null;
        }

        public static List c(List list0) {
            if(list0 != null) {
                List list1 = new ArrayList(list0.size());
                for(Object object0: list0) {
                    list1.add(MediaItem.a(object0));
                }
                return list1;
            }
            return null;
        }

        @NonNull
        public MediaDescriptionCompat d() {
            return this.b;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int e() {
            return this.a;
        }

        @Nullable
        public String f() {
            return this.b.h();
        }

        public boolean g() {
            return (this.a & 1) != 0;
        }

        public boolean h() {
            return (this.a & 2) != 0;
        }

        // 去混淆评级： 低(20)
        @Override
        @NonNull
        public String toString() {
            return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.b + '}';
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeInt(this.a);
            this.b.writeToParcel(parcel0, v);
        }
    }

    static class SearchResultReceiver extends ResultReceiver {
        private final String d;
        private final Bundle e;
        private final l f;

        SearchResultReceiver(String s, Bundle bundle0, l mediaBrowserCompat$l0, Handler handler0) {
            super(handler0);
            this.d = s;
            this.e = bundle0;
            this.f = mediaBrowserCompat$l0;
        }

        @Override  // android.support.v4.os.ResultReceiver
        protected void a(int v, Bundle bundle0) {
            if(bundle0 != null) {
                bundle0 = MediaSessionCompat.G(bundle0);
            }
            if(v == 0 && bundle0 != null && bundle0.containsKey("search_results")) {
                Parcelable[] arr_parcelable = bundle0.getParcelableArray("search_results");
                if(arr_parcelable != null) {
                    ArrayList arrayList0 = new ArrayList(arr_parcelable.length);
                    for(int v1 = 0; v1 < arr_parcelable.length; ++v1) {
                        arrayList0.add(((MediaItem)arr_parcelable[v1]));
                    }
                }
            }
        }
    }

    @RequiresApi(21)
    static class android.support.v4.media.MediaBrowserCompat.a {
        @DoNotInline
        static MediaDescription a(MediaBrowser.MediaItem mediaBrowser$MediaItem0) {
            return mediaBrowser$MediaItem0.getDescription();
        }

        @DoNotInline
        static int b(MediaBrowser.MediaItem mediaBrowser$MediaItem0) {
            return mediaBrowser$MediaItem0.getFlags();
        }
    }

    static class b extends Handler {
        private final WeakReference a;
        private WeakReference b;

        b(k mediaBrowserCompat$k0) {
            this.a = new WeakReference(mediaBrowserCompat$k0);
        }

        void a(Messenger messenger0) {
            this.b = new WeakReference(messenger0);
        }

        @Override  // android.os.Handler
        public void handleMessage(@NonNull Message message0) {
            if(this.b != null && this.b.get() != null && this.a.get() != null) {
                Bundle bundle0 = message0.getData();
                MediaSessionCompat.b(bundle0);
                k mediaBrowserCompat$k0 = (k)this.a.get();
                Messenger messenger0 = (Messenger)this.b.get();
                try {
                    switch(message0.what) {
                        case 1: {
                            Bundle bundle1 = bundle0.getBundle("data_root_hints");
                            MediaSessionCompat.b(bundle1);
                            mediaBrowserCompat$k0.i(messenger0, bundle0.getString("data_media_item_id"), ((Token)bundle0.getParcelable("data_media_session_token")), bundle1);
                            return;
                        }
                        case 2: {
                            mediaBrowserCompat$k0.f(messenger0);
                            return;
                        }
                        case 3: {
                            Bundle bundle2 = bundle0.getBundle("data_options");
                            MediaSessionCompat.b(bundle2);
                            Bundle bundle3 = bundle0.getBundle("data_notify_children_changed_options");
                            MediaSessionCompat.b(bundle3);
                            mediaBrowserCompat$k0.g(messenger0, bundle0.getString("data_media_item_id"), bundle0.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                            return;
                        }
                        default: {
                            Log.w("MediaBrowserCompat", "Unhandled message: " + message0 + "\n  Client version: " + 1 + "\n  Service version: " + message0.arg1);
                        }
                    }
                }
                catch(BadParcelableException unused_ex) {
                    Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                    if(message0.what == 1) {
                        mediaBrowserCompat$k0.f(messenger0);
                    }
                }
            }
        }
    }

    public static class c {
        @RequiresApi(21)
        class android.support.v4.media.MediaBrowserCompat.c.a extends MediaBrowser.ConnectionCallback {
            final c a;

            @Override  // android.media.browse.MediaBrowser$ConnectionCallback
            public void onConnected() {
                android.support.v4.media.MediaBrowserCompat.c.b mediaBrowserCompat$c$b0 = c.this.b;
                if(mediaBrowserCompat$c$b0 != null) {
                    mediaBrowserCompat$c$b0.onConnected();
                }
                c.this.a();
            }

            @Override  // android.media.browse.MediaBrowser$ConnectionCallback
            public void onConnectionFailed() {
                android.support.v4.media.MediaBrowserCompat.c.b mediaBrowserCompat$c$b0 = c.this.b;
                if(mediaBrowserCompat$c$b0 != null) {
                    mediaBrowserCompat$c$b0.h();
                }
                c.this.b();
            }

            @Override  // android.media.browse.MediaBrowser$ConnectionCallback
            public void onConnectionSuspended() {
                android.support.v4.media.MediaBrowserCompat.c.b mediaBrowserCompat$c$b0 = c.this.b;
                if(mediaBrowserCompat$c$b0 != null) {
                    mediaBrowserCompat$c$b0.e();
                }
                c.this.c();
            }
        }

        interface android.support.v4.media.MediaBrowserCompat.c.b {
            void e();

            void h();

            void onConnected();
        }

        final MediaBrowser.ConnectionCallback a;
        android.support.v4.media.MediaBrowserCompat.c.b b;

        public c() {
            this.a = new android.support.v4.media.MediaBrowserCompat.c.a(this);
        }

        public void a() {
        }

        public void b() {
        }

        public void c() {
        }

        void d(android.support.v4.media.MediaBrowserCompat.c.b mediaBrowserCompat$c$b0) {
            this.b = mediaBrowserCompat$c$b0;
        }
    }

    public static abstract class d {
        public void a(String s, Bundle bundle0, Bundle bundle1) {
        }

        public void b(String s, Bundle bundle0, Bundle bundle1) {
        }

        public void c(String s, Bundle bundle0, Bundle bundle1) {
        }
    }

    public static abstract class e {
        @RequiresApi(23)
        class android.support.v4.media.MediaBrowserCompat.e.a extends MediaBrowser.ItemCallback {
            final e a;

            @Override  // android.media.browse.MediaBrowser$ItemCallback
            public void onError(@NonNull String s) {
            }

            @Override  // android.media.browse.MediaBrowser$ItemCallback
            public void onItemLoaded(MediaBrowser.MediaItem mediaBrowser$MediaItem0) {
                MediaItem.a(mediaBrowser$MediaItem0);
            }
        }

        final MediaBrowser.ItemCallback a;

        public e() {
            if(Build.VERSION.SDK_INT >= 23) {
                this.a = new android.support.v4.media.MediaBrowserCompat.e.a(this);
                return;
            }
            this.a = null;
        }

        public void a(@NonNull String s) {
        }

        public void b(MediaItem mediaBrowserCompat$MediaItem0) {
        }
    }

    interface f {
        void a(@NonNull String arg1, Bundle arg2, @Nullable d arg3);

        void b();

        void c(@NonNull String arg1, Bundle arg2, @NonNull l arg3);

        ComponentName d();

        void disconnect();

        @Nullable
        Bundle getExtras();

        @NonNull
        String getRoot();

        @NonNull
        Token getSessionToken();

        boolean isConnected();

        void j(@NonNull String arg1, @NonNull e arg2);

        void k(@NonNull String arg1, @Nullable Bundle arg2, @NonNull o arg3);

        void l(@NonNull String arg1, o arg2);

        @Nullable
        Bundle m();
    }

    @RequiresApi(21)
    static class g implements android.support.v4.media.MediaBrowserCompat.c.b, f, k {
        final Context a;
        protected final MediaBrowser b;
        protected final Bundle c;
        protected final b d;
        private final ArrayMap e;
        protected int f;
        protected m g;
        protected Messenger h;
        private Token i;
        private Bundle j;

        g(Context context0, ComponentName componentName0, c mediaBrowserCompat$c0, Bundle bundle0) {
            this.d = new b(this);
            this.e = new ArrayMap();
            this.a = context0;
            Bundle bundle1 = bundle0 == null ? new Bundle() : new Bundle(bundle0);
            this.c = bundle1;
            bundle1.putInt("extra_client_version", 1);
            bundle1.putInt("extra_calling_pid", Process.myPid());
            mediaBrowserCompat$c0.d(this);
            this.b = new MediaBrowser(context0, componentName0, mediaBrowserCompat$c0.a, bundle1);
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$f
        public void a(@NonNull String s, Bundle bundle0, @Nullable d mediaBrowserCompat$d0) {
            class android.support.v4.media.MediaBrowserCompat.g.f implements Runnable {
                final d a;
                final String b;
                final Bundle c;
                final g d;

                android.support.v4.media.MediaBrowserCompat.g.f(d mediaBrowserCompat$d0, String s, Bundle bundle0) {
                    this.a = mediaBrowserCompat$d0;
                    this.b = s;
                    this.c = bundle0;
                    super();
                }

                @Override
                public void run() {
                }
            }


            class android.support.v4.media.MediaBrowserCompat.g.g implements Runnable {
                final d a;
                final String b;
                final Bundle c;
                final g d;

                android.support.v4.media.MediaBrowserCompat.g.g(d mediaBrowserCompat$d0, String s, Bundle bundle0) {
                    this.a = mediaBrowserCompat$d0;
                    this.b = s;
                    this.c = bundle0;
                    super();
                }

                @Override
                public void run() {
                }
            }

            if(!this.isConnected()) {
                throw new IllegalStateException("Cannot send a custom action (" + s + ") with extras " + bundle0 + " because the browser is not connected to the service.");
            }
            if(this.g == null) {
                Log.i("MediaBrowserCompat", "The connected service doesn\'t support sendCustomAction.");
                if(mediaBrowserCompat$d0 != null) {
                    android.support.v4.media.MediaBrowserCompat.g.f mediaBrowserCompat$g$f0 = new android.support.v4.media.MediaBrowserCompat.g.f(this, mediaBrowserCompat$d0, s, bundle0);
                    this.d.post(mediaBrowserCompat$g$f0);
                }
            }
            CustomActionResultReceiver mediaBrowserCompat$CustomActionResultReceiver0 = new CustomActionResultReceiver(s, bundle0, mediaBrowserCompat$d0, this.d);
            try {
                this.g.h(s, bundle0, mediaBrowserCompat$CustomActionResultReceiver0, this.h);
            }
            catch(RemoteException remoteException0) {
                Log.i("MediaBrowserCompat", "Remote error sending a custom action: action=" + s + ", extras=" + bundle0, remoteException0);
                if(mediaBrowserCompat$d0 != null) {
                    android.support.v4.media.MediaBrowserCompat.g.g mediaBrowserCompat$g$g0 = new android.support.v4.media.MediaBrowserCompat.g.g(this, mediaBrowserCompat$d0, s, bundle0);
                    this.d.post(mediaBrowserCompat$g$g0);
                }
            }
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$f
        public void b() {
            this.b.connect();
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$f
        public void c(@NonNull String s, Bundle bundle0, @NonNull l mediaBrowserCompat$l0) {
            class android.support.v4.media.MediaBrowserCompat.g.d implements Runnable {
                final l a;
                final String b;
                final Bundle c;
                final g d;

                android.support.v4.media.MediaBrowserCompat.g.d(l mediaBrowserCompat$l0, String s, Bundle bundle0) {
                    this.a = mediaBrowserCompat$l0;
                    this.b = s;
                    this.c = bundle0;
                    super();
                }

                @Override
                public void run() {
                }
            }


            class android.support.v4.media.MediaBrowserCompat.g.e implements Runnable {
                final l a;
                final String b;
                final Bundle c;
                final g d;

                android.support.v4.media.MediaBrowserCompat.g.e(l mediaBrowserCompat$l0, String s, Bundle bundle0) {
                    this.a = mediaBrowserCompat$l0;
                    this.b = s;
                    this.c = bundle0;
                    super();
                }

                @Override
                public void run() {
                }
            }

            if(!this.isConnected()) {
                throw new IllegalStateException("search() called while not connected");
            }
            if(this.g == null) {
                Log.i("MediaBrowserCompat", "The connected service doesn\'t support search.");
                android.support.v4.media.MediaBrowserCompat.g.d mediaBrowserCompat$g$d0 = new android.support.v4.media.MediaBrowserCompat.g.d(this, mediaBrowserCompat$l0, s, bundle0);
                this.d.post(mediaBrowserCompat$g$d0);
                return;
            }
            SearchResultReceiver mediaBrowserCompat$SearchResultReceiver0 = new SearchResultReceiver(s, bundle0, mediaBrowserCompat$l0, this.d);
            try {
                this.g.g(s, bundle0, mediaBrowserCompat$SearchResultReceiver0, this.h);
            }
            catch(RemoteException remoteException0) {
                Log.i("MediaBrowserCompat", "Remote error searching items with query: " + s, remoteException0);
                android.support.v4.media.MediaBrowserCompat.g.e mediaBrowserCompat$g$e0 = new android.support.v4.media.MediaBrowserCompat.g.e(this, mediaBrowserCompat$l0, s, bundle0);
                this.d.post(mediaBrowserCompat$g$e0);
            }
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$f
        public ComponentName d() {
            return this.b.getServiceComponent();
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$f
        public void disconnect() {
            m mediaBrowserCompat$m0 = this.g;
            if(mediaBrowserCompat$m0 != null) {
                Messenger messenger0 = this.h;
                if(messenger0 != null) {
                    try {
                        mediaBrowserCompat$m0.j(messenger0);
                    }
                    catch(RemoteException unused_ex) {
                        Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                    }
                }
            }
            this.b.disconnect();
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$c$b
        public void e() {
            this.g = null;
            this.h = null;
            this.i = null;
            this.d.a(null);
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$k
        public void f(Messenger messenger0) {
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$k
        public void g(Messenger messenger0, String s, List list0, Bundle bundle0, Bundle bundle1) {
            if(this.h != messenger0) {
                return;
            }
            n mediaBrowserCompat$n0 = (n)this.e.get(s);
            if(mediaBrowserCompat$n0 == null) {
                if(MediaBrowserCompat.c) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn\'t subscribed id=" + s);
                }
                return;
            }
            if(mediaBrowserCompat$n0.a(bundle0) != null) {
                if(bundle0 == null) {
                    if(list0 == null) {
                        return;
                    }
                    this.j = null;
                    return;
                }
                if(list0 == null) {
                    return;
                }
                this.j = null;
            }
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$f
        @Nullable
        public Bundle getExtras() {
            return this.b.getExtras();
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$f
        @NonNull
        public String getRoot() {
            return this.b.getRoot();
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$f
        @NonNull
        public Token getSessionToken() {
            if(this.i == null) {
                this.i = Token.c(this.b.getSessionToken());
            }
            return this.i;
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$c$b
        public void h() {
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$k
        public void i(Messenger messenger0, String s, Token mediaSessionCompat$Token0, Bundle bundle0) {
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$f
        public boolean isConnected() {
            return this.b.isConnected();
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$f
        public void j(@NonNull String s, @NonNull e mediaBrowserCompat$e0) {
            class android.support.v4.media.MediaBrowserCompat.g.a implements Runnable {
                final e a;
                final String b;
                final g c;

                android.support.v4.media.MediaBrowserCompat.g.a(e mediaBrowserCompat$e0, String s) {
                    this.a = mediaBrowserCompat$e0;
                    this.b = s;
                    super();
                }

                @Override
                public void run() {
                }
            }


            class android.support.v4.media.MediaBrowserCompat.g.b implements Runnable {
                final e a;
                final String b;
                final g c;

                android.support.v4.media.MediaBrowserCompat.g.b(e mediaBrowserCompat$e0, String s) {
                    this.a = mediaBrowserCompat$e0;
                    this.b = s;
                    super();
                }

                @Override
                public void run() {
                }
            }


            class android.support.v4.media.MediaBrowserCompat.g.c implements Runnable {
                final e a;
                final String b;
                final g c;

                android.support.v4.media.MediaBrowserCompat.g.c(e mediaBrowserCompat$e0, String s) {
                    this.a = mediaBrowserCompat$e0;
                    this.b = s;
                    super();
                }

                @Override
                public void run() {
                }
            }

            if(TextUtils.isEmpty(s)) {
                throw new IllegalArgumentException("mediaId is empty");
            }
            if(mediaBrowserCompat$e0 == null) {
                throw new IllegalArgumentException("cb is null");
            }
            if(!this.b.isConnected()) {
                Log.i("MediaBrowserCompat", "Not connected, unable to retrieve the MediaItem.");
                android.support.v4.media.MediaBrowserCompat.g.a mediaBrowserCompat$g$a0 = new android.support.v4.media.MediaBrowserCompat.g.a(this, mediaBrowserCompat$e0, s);
                this.d.post(mediaBrowserCompat$g$a0);
                return;
            }
            if(this.g == null) {
                android.support.v4.media.MediaBrowserCompat.g.b mediaBrowserCompat$g$b0 = new android.support.v4.media.MediaBrowserCompat.g.b(this, mediaBrowserCompat$e0, s);
                this.d.post(mediaBrowserCompat$g$b0);
                return;
            }
            ItemReceiver mediaBrowserCompat$ItemReceiver0 = new ItemReceiver(s, mediaBrowserCompat$e0, this.d);
            try {
                this.g.d(s, mediaBrowserCompat$ItemReceiver0, this.h);
            }
            catch(RemoteException unused_ex) {
                Log.i("MediaBrowserCompat", "Remote error getting media item: " + s);
                android.support.v4.media.MediaBrowserCompat.g.c mediaBrowserCompat$g$c0 = new android.support.v4.media.MediaBrowserCompat.g.c(this, mediaBrowserCompat$e0, s);
                this.d.post(mediaBrowserCompat$g$c0);
            }
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$f
        public void k(@NonNull String s, Bundle bundle0, @NonNull o mediaBrowserCompat$o0) {
            n mediaBrowserCompat$n0 = (n)this.e.get(s);
            if(mediaBrowserCompat$n0 == null) {
                mediaBrowserCompat$n0 = new n();
                this.e.put(s, mediaBrowserCompat$n0);
            }
            mediaBrowserCompat$o0.e(mediaBrowserCompat$n0);
            Bundle bundle1 = bundle0 == null ? null : new Bundle(bundle0);
            mediaBrowserCompat$n0.e(bundle1, mediaBrowserCompat$o0);
            m mediaBrowserCompat$m0 = this.g;
            if(mediaBrowserCompat$m0 == null) {
                this.b.subscribe(s, mediaBrowserCompat$o0.a);
                return;
            }
            try {
                mediaBrowserCompat$m0.a(s, mediaBrowserCompat$o0.b, bundle1, this.h);
            }
            catch(RemoteException unused_ex) {
                Log.i("MediaBrowserCompat", "Remote error subscribing media item: " + s);
            }
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$f
        public void l(@NonNull String s, o mediaBrowserCompat$o0) {
            n mediaBrowserCompat$n0 = (n)this.e.get(s);
            if(mediaBrowserCompat$n0 == null) {
                return;
            }
            m mediaBrowserCompat$m0 = this.g;
            if(mediaBrowserCompat$m0 != null) {
                try {
                    if(mediaBrowserCompat$o0 == null) {
                        mediaBrowserCompat$m0.f(s, null, this.h);
                    }
                    else {
                        List list2 = mediaBrowserCompat$n0.b();
                        List list3 = mediaBrowserCompat$n0.c();
                        int v1 = list2.size() - 1;
                    label_26:
                        while(v1 >= 0) {
                            if(list2.get(v1) == mediaBrowserCompat$o0) {
                                this.g.f(s, mediaBrowserCompat$o0.b, this.h);
                                list2.remove(v1);
                                list3.remove(v1);
                            }
                            --v1;
                        }
                    }
                }
                catch(RemoteException unused_ex) {
                    Log.d("MediaBrowserCompat", "removeSubscription failed with RemoteException parentId=" + s);
                    if(true) {
                        goto label_35;
                    }
                    goto label_26;
                }
            }
            else if(mediaBrowserCompat$o0 == null) {
                this.b.unsubscribe(s);
            }
            else {
                List list0 = mediaBrowserCompat$n0.b();
                List list1 = mediaBrowserCompat$n0.c();
                for(int v = list0.size() - 1; v >= 0; --v) {
                    if(list0.get(v) == mediaBrowserCompat$o0) {
                        list0.remove(v);
                        list1.remove(v);
                    }
                }
                if(list0.size() == 0) {
                    this.b.unsubscribe(s);
                }
            }
        label_35:
            if(mediaBrowserCompat$n0.d() || mediaBrowserCompat$o0 == null) {
                this.e.remove(s);
            }
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$f
        public Bundle m() {
            return this.j;
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$c$b
        public void onConnected() {
            Bundle bundle0;
            try {
                bundle0 = this.b.getExtras();
            }
            catch(IllegalStateException illegalStateException0) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", illegalStateException0);
                return;
            }
            if(bundle0 == null) {
                return;
            }
            this.f = bundle0.getInt("extra_service_version", 0);
            IBinder iBinder0 = BundleCompat.a(bundle0, "extra_messenger");
            if(iBinder0 != null) {
                this.g = new m(iBinder0, this.c);
                Messenger messenger0 = new Messenger(this.d);
                this.h = messenger0;
                this.d.a(messenger0);
                try {
                    this.g.e(this.a, this.h);
                }
                catch(RemoteException unused_ex) {
                    Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                }
            }
            android.support.v4.media.session.b b0 = android.support.v4.media.session.b.b.i1(BundleCompat.a(bundle0, "extra_session_binder"));
            if(b0 != null) {
                this.i = Token.d(this.b.getSessionToken(), b0);
            }
        }
    }

    @RequiresApi(23)
    static class h extends g {
        h(Context context0, ComponentName componentName0, c mediaBrowserCompat$c0, Bundle bundle0) {
            super(context0, componentName0, mediaBrowserCompat$c0, bundle0);
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$g
        public void j(@NonNull String s, @NonNull e mediaBrowserCompat$e0) {
            if(this.g == null) {
                this.b.getItem(s, mediaBrowserCompat$e0.a);
                return;
            }
            super.j(s, mediaBrowserCompat$e0);
        }
    }

    @RequiresApi(26)
    static class i extends h {
        i(Context context0, ComponentName componentName0, c mediaBrowserCompat$c0, Bundle bundle0) {
            super(context0, componentName0, mediaBrowserCompat$c0, bundle0);
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$g
        public void k(@NonNull String s, @Nullable Bundle bundle0, @NonNull o mediaBrowserCompat$o0) {
            if(this.g != null && this.f >= 2) {
                super.k(s, bundle0, mediaBrowserCompat$o0);
                return;
            }
            if(bundle0 == null) {
                this.b.subscribe(s, mediaBrowserCompat$o0.a);
                return;
            }
            this.b.subscribe(s, bundle0, mediaBrowserCompat$o0.a);
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$g
        public void l(@NonNull String s, o mediaBrowserCompat$o0) {
            if(this.g != null && this.f >= 2) {
                super.l(s, mediaBrowserCompat$o0);
                return;
            }
            if(mediaBrowserCompat$o0 == null) {
                this.b.unsubscribe(s);
                return;
            }
            this.b.unsubscribe(s, mediaBrowserCompat$o0.a);
        }
    }

    static class j implements f, k {
        class android.support.v4.media.MediaBrowserCompat.j.g implements ServiceConnection {
            final j a;

            boolean a(String s) {
                j mediaBrowserCompat$j0 = j.this;
                if(mediaBrowserCompat$j0.h == this && (mediaBrowserCompat$j0.g != 0 && mediaBrowserCompat$j0.g != 1)) {
                    return true;
                }
                if(mediaBrowserCompat$j0.g != 0 && mediaBrowserCompat$j0.g != 1) {
                    Log.i("MediaBrowserCompat", s + " for " + j.this.b + " with mServiceConnection=" + j.this.h + " this=" + this);
                }
                return false;
            }

            private void b(Runnable runnable0) {
                if(Thread.currentThread() == j.this.e.getLooper().getThread()) {
                    runnable0.run();
                    return;
                }
                j.this.e.post(runnable0);
            }

            @Override  // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
                class android.support.v4.media.MediaBrowserCompat.j.g.a implements Runnable {
                    final ComponentName a;
                    final IBinder b;
                    final android.support.v4.media.MediaBrowserCompat.j.g c;

                    android.support.v4.media.MediaBrowserCompat.j.g.a(ComponentName componentName0, IBinder iBinder0) {
                        this.a = componentName0;
                        this.b = iBinder0;
                        super();
                    }

                    @Override
                    public void run() {
                        boolean z = MediaBrowserCompat.c;
                        if(z) {
                            Log.d("MediaBrowserCompat", "MediaServiceConnection.onServiceConnected name=" + this.a + " binder=" + this.b);
                            j.this.e();
                        }
                        if(!android.support.v4.media.MediaBrowserCompat.j.g.this.a("onServiceConnected")) {
                            return;
                        }
                        j.this.i = new m(this.b, j.this.d);
                        j.this.j = new Messenger(j.this.e);
                        j.this.e.a(j.this.j);
                        j.this.g = 2;
                        try {
                            if(z) {
                                Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                                j.this.e();
                            }
                            j.this.i.b(j.this.a, j.this.j);
                        }
                        catch(RemoteException unused_ex) {
                            Log.w("MediaBrowserCompat", "RemoteException during connect for " + j.this.b);
                            if(MediaBrowserCompat.c) {
                                Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                                j.this.e();
                            }
                        }
                    }
                }

                this.b(new android.support.v4.media.MediaBrowserCompat.j.g.a(this, componentName0, iBinder0));
            }

            @Override  // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName0) {
                class android.support.v4.media.MediaBrowserCompat.j.g.b implements Runnable {
                    final ComponentName a;
                    final android.support.v4.media.MediaBrowserCompat.j.g b;

                    android.support.v4.media.MediaBrowserCompat.j.g.b(ComponentName componentName0) {
                        this.a = componentName0;
                        super();
                    }

                    @Override
                    public void run() {
                        if(MediaBrowserCompat.c) {
                            Log.d("MediaBrowserCompat", "MediaServiceConnection.onServiceDisconnected name=" + this.a + " this=" + this + " mServiceConnection=" + j.this.h);
                            j.this.e();
                        }
                        if(!android.support.v4.media.MediaBrowserCompat.j.g.this.a("onServiceDisconnected")) {
                            return;
                        }
                        j.this.i = null;
                        j.this.j = null;
                        j.this.e.a(null);
                        j.this.g = 4;
                        j.this.c.c();
                    }
                }

                this.b(new android.support.v4.media.MediaBrowserCompat.j.g.b(this, componentName0));
            }
        }

        final Context a;
        final ComponentName b;
        final c c;
        final Bundle d;
        final b e;
        private final ArrayMap f;
        int g;
        android.support.v4.media.MediaBrowserCompat.j.g h;
        m i;
        Messenger j;
        private String k;
        private Token l;
        private Bundle m;
        private Bundle n;
        static final int o = 0;
        static final int p = 1;
        static final int q = 2;
        static final int r = 3;
        static final int s = 4;

        public j(Context context0, ComponentName componentName0, c mediaBrowserCompat$c0, Bundle bundle0) {
            this.e = new b(this);
            this.f = new ArrayMap();
            this.g = 1;
            if(context0 == null) {
                throw new IllegalArgumentException("context must not be null");
            }
            if(componentName0 == null) {
                throw new IllegalArgumentException("service component must not be null");
            }
            if(mediaBrowserCompat$c0 == null) {
                throw new IllegalArgumentException("connection callback must not be null");
            }
            this.a = context0;
            this.b = componentName0;
            this.c = mediaBrowserCompat$c0;
            this.d = bundle0 == null ? null : new Bundle(bundle0);
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$f
        public void a(@NonNull String s, Bundle bundle0, @Nullable d mediaBrowserCompat$d0) {
            class android.support.v4.media.MediaBrowserCompat.j.f implements Runnable {
                final d a;
                final String b;
                final Bundle c;
                final j d;

                android.support.v4.media.MediaBrowserCompat.j.f(d mediaBrowserCompat$d0, String s, Bundle bundle0) {
                    this.a = mediaBrowserCompat$d0;
                    this.b = s;
                    this.c = bundle0;
                    super();
                }

                @Override
                public void run() {
                }
            }

            if(!this.isConnected()) {
                throw new IllegalStateException("Cannot send a custom action (" + s + ") with extras " + bundle0 + " because the browser is not connected to the service.");
            }
            CustomActionResultReceiver mediaBrowserCompat$CustomActionResultReceiver0 = new CustomActionResultReceiver(s, bundle0, mediaBrowserCompat$d0, this.e);
            try {
                this.i.h(s, bundle0, mediaBrowserCompat$CustomActionResultReceiver0, this.j);
            }
            catch(RemoteException remoteException0) {
                Log.i("MediaBrowserCompat", "Remote error sending a custom action: action=" + s + ", extras=" + bundle0, remoteException0);
                if(mediaBrowserCompat$d0 != null) {
                    android.support.v4.media.MediaBrowserCompat.j.f mediaBrowserCompat$j$f0 = new android.support.v4.media.MediaBrowserCompat.j.f(this, mediaBrowserCompat$d0, s, bundle0);
                    this.e.post(mediaBrowserCompat$j$f0);
                }
            }
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$f
        public void b() {
            class android.support.v4.media.MediaBrowserCompat.j.a implements Runnable {
                final j a;

                @Override
                public void run() {
                    boolean z;
                    j mediaBrowserCompat$j0 = j.this;
                    if(mediaBrowserCompat$j0.g == 0) {
                        return;
                    }
                    mediaBrowserCompat$j0.g = 2;
                    if(MediaBrowserCompat.c && mediaBrowserCompat$j0.h != null) {
                        throw new RuntimeException("mServiceConnection should be null. Instead it is " + j.this.h);
                    }
                    if(mediaBrowserCompat$j0.i != null) {
                        throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + j.this.i);
                    }
                    if(mediaBrowserCompat$j0.j != null) {
                        throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + j.this.j);
                    }
                    Intent intent0 = new Intent("android.media.browse.MediaBrowserService");
                    intent0.setComponent(j.this.b);
                    j.this.h = new android.support.v4.media.MediaBrowserCompat.j.g(j.this);
                    try {
                        z = j.this.a.bindService(intent0, j.this.h, 1);
                    }
                    catch(Exception unused_ex) {
                        Log.e("MediaBrowserCompat", "Failed binding to service " + j.this.b);
                        z = false;
                    }
                    if(!z) {
                        j.this.h();
                        j.this.c.b();
                    }
                    if(MediaBrowserCompat.c) {
                        Log.d("MediaBrowserCompat", "connect...");
                        j.this.e();
                    }
                }
            }

            if(this.g != 0 && this.g != 1) {
                throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + j.n(this.g) + ")");
            }
            this.g = 2;
            android.support.v4.media.MediaBrowserCompat.j.a mediaBrowserCompat$j$a0 = new android.support.v4.media.MediaBrowserCompat.j.a(this);
            this.e.post(mediaBrowserCompat$j$a0);
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$f
        public void c(@NonNull String s, Bundle bundle0, @NonNull l mediaBrowserCompat$l0) {
            class android.support.v4.media.MediaBrowserCompat.j.e implements Runnable {
                final l a;
                final String b;
                final Bundle c;
                final j d;

                android.support.v4.media.MediaBrowserCompat.j.e(l mediaBrowserCompat$l0, String s, Bundle bundle0) {
                    this.a = mediaBrowserCompat$l0;
                    this.b = s;
                    this.c = bundle0;
                    super();
                }

                @Override
                public void run() {
                }
            }

            if(!this.isConnected()) {
                throw new IllegalStateException("search() called while not connected (state=" + j.n(this.g) + ")");
            }
            SearchResultReceiver mediaBrowserCompat$SearchResultReceiver0 = new SearchResultReceiver(s, bundle0, mediaBrowserCompat$l0, this.e);
            try {
                this.i.g(s, bundle0, mediaBrowserCompat$SearchResultReceiver0, this.j);
            }
            catch(RemoteException remoteException0) {
                Log.i("MediaBrowserCompat", "Remote error searching items with query: " + s, remoteException0);
                android.support.v4.media.MediaBrowserCompat.j.e mediaBrowserCompat$j$e0 = new android.support.v4.media.MediaBrowserCompat.j.e(this, mediaBrowserCompat$l0, s, bundle0);
                this.e.post(mediaBrowserCompat$j$e0);
            }
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$f
        @NonNull
        public ComponentName d() {
            if(!this.isConnected()) {
                throw new IllegalStateException("getServiceComponent() called while not connected (state=" + this.g + ")");
            }
            return this.b;
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$f
        public void disconnect() {
            class android.support.v4.media.MediaBrowserCompat.j.b implements Runnable {
                final j a;

                @Override
                public void run() {
                    j mediaBrowserCompat$j0 = j.this;
                    Messenger messenger0 = mediaBrowserCompat$j0.j;
                    if(messenger0 != null) {
                        try {
                            mediaBrowserCompat$j0.i.c(messenger0);
                        }
                        catch(RemoteException unused_ex) {
                            Log.w("MediaBrowserCompat", "RemoteException during connect for " + j.this.b);
                        }
                    }
                    int v = j.this.g;
                    j.this.h();
                    if(v != 0) {
                        j.this.g = v;
                    }
                    if(MediaBrowserCompat.c) {
                        Log.d("MediaBrowserCompat", "disconnect...");
                        j.this.e();
                    }
                }
            }

            this.g = 0;
            android.support.v4.media.MediaBrowserCompat.j.b mediaBrowserCompat$j$b0 = new android.support.v4.media.MediaBrowserCompat.j.b(this);
            this.e.post(mediaBrowserCompat$j$b0);
        }

        void e() {
            Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
            Log.d("MediaBrowserCompat", "  mServiceComponent=" + this.b);
            Log.d("MediaBrowserCompat", "  mCallback=" + this.c);
            Log.d("MediaBrowserCompat", "  mRootHints=" + this.d);
            Log.d("MediaBrowserCompat", "  mState=" + j.n(this.g));
            Log.d("MediaBrowserCompat", "  mServiceConnection=" + this.h);
            Log.d("MediaBrowserCompat", "  mServiceBinderWrapper=" + this.i);
            Log.d("MediaBrowserCompat", "  mCallbacksMessenger=" + this.j);
            Log.d("MediaBrowserCompat", "  mRootId=" + this.k);
            Log.d("MediaBrowserCompat", "  mMediaSessionToken=" + this.l);
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$k
        public void f(Messenger messenger0) {
            Log.e("MediaBrowserCompat", "onConnectFailed for " + this.b);
            if(!this.o(messenger0, "onConnectFailed")) {
                return;
            }
            if(this.g != 2) {
                Log.w("MediaBrowserCompat", "onConnect from service while mState=" + j.n(this.g) + "... ignoring");
                return;
            }
            this.h();
            this.c.b();
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$k
        public void g(Messenger messenger0, String s, List list0, Bundle bundle0, Bundle bundle1) {
            if(!this.o(messenger0, "onLoadChildren")) {
                return;
            }
            boolean z = MediaBrowserCompat.c;
            if(z) {
                Log.d("MediaBrowserCompat", "onLoadChildren for " + this.b + " id=" + s);
            }
            n mediaBrowserCompat$n0 = (n)this.f.get(s);
            if(mediaBrowserCompat$n0 == null) {
                if(z) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn\'t subscribed id=" + s);
                }
                return;
            }
            if(mediaBrowserCompat$n0.a(bundle0) != null) {
                if(bundle0 == null) {
                    if(list0 == null) {
                        return;
                    }
                    this.n = null;
                    return;
                }
                if(list0 == null) {
                    return;
                }
                this.n = null;
            }
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$f
        @Nullable
        public Bundle getExtras() {
            if(!this.isConnected()) {
                throw new IllegalStateException("getExtras() called while not connected (state=" + j.n(this.g) + ")");
            }
            return this.m;
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$f
        @NonNull
        public String getRoot() {
            if(!this.isConnected()) {
                throw new IllegalStateException("getRoot() called while not connected(state=" + j.n(this.g) + ")");
            }
            return this.k;
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$f
        @NonNull
        public Token getSessionToken() {
            if(!this.isConnected()) {
                throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.g + ")");
            }
            return this.l;
        }

        void h() {
            android.support.v4.media.MediaBrowserCompat.j.g mediaBrowserCompat$j$g0 = this.h;
            if(mediaBrowserCompat$j$g0 != null) {
                this.a.unbindService(mediaBrowserCompat$j$g0);
            }
            this.g = 1;
            this.h = null;
            this.i = null;
            this.j = null;
            this.e.a(null);
            this.k = null;
            this.l = null;
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$k
        public void i(Messenger messenger0, String s, Token mediaSessionCompat$Token0, Bundle bundle0) {
            if(!this.o(messenger0, "onConnect")) {
                return;
            }
            if(this.g != 2) {
                Log.w("MediaBrowserCompat", "onConnect from service while mState=" + j.n(this.g) + "... ignoring");
                return;
            }
            this.k = s;
            this.l = mediaSessionCompat$Token0;
            this.m = bundle0;
            this.g = 3;
            if(MediaBrowserCompat.c) {
                Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                this.e();
            }
            this.c.a();
            try {
                Iterator iterator0 = this.f.entrySet().iterator();
                while(true) {
                label_14:
                    if(!iterator0.hasNext()) {
                        return;
                    }
                    Object object0 = iterator0.next();
                    String s1 = (String)((Map.Entry)object0).getKey();
                    n mediaBrowserCompat$n0 = (n)((Map.Entry)object0).getValue();
                    List list0 = mediaBrowserCompat$n0.b();
                    List list1 = mediaBrowserCompat$n0.c();
                    for(int v = 0; v < list0.size(); ++v) {
                        this.i.a(s1, ((o)list0.get(v)).b, ((Bundle)list1.get(v)), this.j);
                    }
                }
            }
            catch(RemoteException unused_ex) {
                Log.d("MediaBrowserCompat", "addSubscription failed with RemoteException.");
                return;
            }
            goto label_14;
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$f
        public boolean isConnected() {
            return this.g == 3;
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$f
        public void j(@NonNull String s, @NonNull e mediaBrowserCompat$e0) {
            class android.support.v4.media.MediaBrowserCompat.j.c implements Runnable {
                final e a;
                final String b;
                final j c;

                android.support.v4.media.MediaBrowserCompat.j.c(e mediaBrowserCompat$e0, String s) {
                    this.a = mediaBrowserCompat$e0;
                    this.b = s;
                    super();
                }

                @Override
                public void run() {
                }
            }


            class android.support.v4.media.MediaBrowserCompat.j.d implements Runnable {
                final e a;
                final String b;
                final j c;

                android.support.v4.media.MediaBrowserCompat.j.d(e mediaBrowserCompat$e0, String s) {
                    this.a = mediaBrowserCompat$e0;
                    this.b = s;
                    super();
                }

                @Override
                public void run() {
                }
            }

            if(TextUtils.isEmpty(s)) {
                throw new IllegalArgumentException("mediaId is empty");
            }
            if(mediaBrowserCompat$e0 == null) {
                throw new IllegalArgumentException("cb is null");
            }
            if(!this.isConnected()) {
                Log.i("MediaBrowserCompat", "Not connected, unable to retrieve the MediaItem.");
                android.support.v4.media.MediaBrowserCompat.j.c mediaBrowserCompat$j$c0 = new android.support.v4.media.MediaBrowserCompat.j.c(this, mediaBrowserCompat$e0, s);
                this.e.post(mediaBrowserCompat$j$c0);
                return;
            }
            ItemReceiver mediaBrowserCompat$ItemReceiver0 = new ItemReceiver(s, mediaBrowserCompat$e0, this.e);
            try {
                this.i.d(s, mediaBrowserCompat$ItemReceiver0, this.j);
            }
            catch(RemoteException unused_ex) {
                Log.i("MediaBrowserCompat", "Remote error getting media item: " + s);
                android.support.v4.media.MediaBrowserCompat.j.d mediaBrowserCompat$j$d0 = new android.support.v4.media.MediaBrowserCompat.j.d(this, mediaBrowserCompat$e0, s);
                this.e.post(mediaBrowserCompat$j$d0);
            }
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$f
        public void k(@NonNull String s, Bundle bundle0, @NonNull o mediaBrowserCompat$o0) {
            n mediaBrowserCompat$n0 = (n)this.f.get(s);
            if(mediaBrowserCompat$n0 == null) {
                mediaBrowserCompat$n0 = new n();
                this.f.put(s, mediaBrowserCompat$n0);
            }
            Bundle bundle1 = bundle0 == null ? null : new Bundle(bundle0);
            mediaBrowserCompat$n0.e(bundle1, mediaBrowserCompat$o0);
            if(this.isConnected()) {
                try {
                    this.i.a(s, mediaBrowserCompat$o0.b, bundle1, this.j);
                }
                catch(RemoteException unused_ex) {
                    Log.d("MediaBrowserCompat", "addSubscription failed with RemoteException parentId=" + s);
                }
            }
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$f
        public void l(@NonNull String s, o mediaBrowserCompat$o0) {
            n mediaBrowserCompat$n0 = (n)this.f.get(s);
            if(mediaBrowserCompat$n0 == null) {
                return;
            }
            try {
                if(mediaBrowserCompat$o0 != null) {
                    List list0 = mediaBrowserCompat$n0.b();
                    List list1 = mediaBrowserCompat$n0.c();
                    int v = list0.size() - 1;
                label_10:
                    while(v >= 0) {
                        if(list0.get(v) == mediaBrowserCompat$o0) {
                            if(this.isConnected()) {
                                this.i.f(s, mediaBrowserCompat$o0.b, this.j);
                            }
                            list0.remove(v);
                            list1.remove(v);
                        }
                        --v;
                    }
                }
                else if(this.isConnected()) {
                    this.i.f(s, null, this.j);
                }
            }
            catch(RemoteException unused_ex) {
                Log.d("MediaBrowserCompat", "removeSubscription failed with RemoteException parentId=" + s);
                if(true) {
                    goto label_20;
                }
                goto label_10;
            }
        label_20:
            if(mediaBrowserCompat$n0.d() || mediaBrowserCompat$o0 == null) {
                this.f.remove(s);
            }
        }

        @Override  // android.support.v4.media.MediaBrowserCompat$f
        public Bundle m() {
            return this.n;
        }

        private static String n(int v) {
            switch(v) {
                case 0: {
                    return "CONNECT_STATE_DISCONNECTING";
                }
                case 1: {
                    return "CONNECT_STATE_DISCONNECTED";
                }
                case 2: {
                    return "CONNECT_STATE_CONNECTING";
                }
                case 3: {
                    return "CONNECT_STATE_CONNECTED";
                }
                case 4: {
                    return "CONNECT_STATE_SUSPENDED";
                }
                default: {
                    return "UNKNOWN/" + v;
                }
            }
        }

        private boolean o(Messenger messenger0, String s) {
            if(this.j == messenger0 && (this.g != 0 && this.g != 1)) {
                return true;
            }
            if(this.g != 0 && this.g != 1) {
                Log.i("MediaBrowserCompat", s + " for " + this.b + " with mCallbacksMessenger=" + this.j + " this=" + this);
            }
            return false;
        }
    }

    interface k {
        void f(Messenger arg1);

        void g(Messenger arg1, String arg2, List arg3, Bundle arg4, Bundle arg5);

        void i(Messenger arg1, String arg2, Token arg3, Bundle arg4);
    }

    public static abstract class l {
        public void a(@NonNull String s, Bundle bundle0) {
        }

        public void b(@NonNull String s, Bundle bundle0, @NonNull List list0) {
        }
    }

    static class m {
        private Messenger a;
        private Bundle b;

        public m(IBinder iBinder0, Bundle bundle0) {
            this.a = new Messenger(iBinder0);
            this.b = bundle0;
        }

        void a(String s, IBinder iBinder0, Bundle bundle0, Messenger messenger0) throws RemoteException {
            Bundle bundle1 = new Bundle();
            bundle1.putString("data_media_item_id", s);
            BundleCompat.b(bundle1, "data_callback_token", iBinder0);
            bundle1.putBundle("data_options", bundle0);
            this.i(3, bundle1, messenger0);
        }

        void b(Context context0, Messenger messenger0) throws RemoteException {
            Bundle bundle0 = new Bundle();
            bundle0.putString("data_package_name", "com.dcinside.app.android");
            bundle0.putInt("data_calling_pid", Process.myPid());
            bundle0.putBundle("data_root_hints", this.b);
            this.i(1, bundle0, messenger0);
        }

        void c(Messenger messenger0) throws RemoteException {
            this.i(2, null, messenger0);
        }

        void d(String s, ResultReceiver resultReceiver0, Messenger messenger0) throws RemoteException {
            Bundle bundle0 = new Bundle();
            bundle0.putString("data_media_item_id", s);
            bundle0.putParcelable("data_result_receiver", resultReceiver0);
            this.i(5, bundle0, messenger0);
        }

        void e(Context context0, Messenger messenger0) throws RemoteException {
            Bundle bundle0 = new Bundle();
            bundle0.putString("data_package_name", "com.dcinside.app.android");
            bundle0.putInt("data_calling_pid", Process.myPid());
            bundle0.putBundle("data_root_hints", this.b);
            this.i(6, bundle0, messenger0);
        }

        void f(String s, IBinder iBinder0, Messenger messenger0) throws RemoteException {
            Bundle bundle0 = new Bundle();
            bundle0.putString("data_media_item_id", s);
            BundleCompat.b(bundle0, "data_callback_token", iBinder0);
            this.i(4, bundle0, messenger0);
        }

        void g(String s, Bundle bundle0, ResultReceiver resultReceiver0, Messenger messenger0) throws RemoteException {
            Bundle bundle1 = new Bundle();
            bundle1.putString("data_search_query", s);
            bundle1.putBundle("data_search_extras", bundle0);
            bundle1.putParcelable("data_result_receiver", resultReceiver0);
            this.i(8, bundle1, messenger0);
        }

        void h(String s, Bundle bundle0, ResultReceiver resultReceiver0, Messenger messenger0) throws RemoteException {
            Bundle bundle1 = new Bundle();
            bundle1.putString("data_custom_action", s);
            bundle1.putBundle("data_custom_action_extras", bundle0);
            bundle1.putParcelable("data_result_receiver", resultReceiver0);
            this.i(9, bundle1, messenger0);
        }

        private void i(int v, Bundle bundle0, Messenger messenger0) throws RemoteException {
            Message message0 = Message.obtain();
            message0.what = v;
            message0.arg1 = 1;
            message0.setData(bundle0);
            message0.replyTo = messenger0;
            this.a.send(message0);
        }

        void j(Messenger messenger0) throws RemoteException {
            this.i(7, null, messenger0);
        }
    }

    static class n {
        private final List a;
        private final List b;

        public n() {
            this.a = new ArrayList();
            this.b = new ArrayList();
        }

        public o a(Bundle bundle0) {
            for(int v = 0; v < this.b.size(); ++v) {
                if(MediaBrowserCompatUtils.a(((Bundle)this.b.get(v)), bundle0)) {
                    return (o)this.a.get(v);
                }
            }
            return null;
        }

        public List b() {
            return this.a;
        }

        public List c() {
            return this.b;
        }

        public boolean d() {
            return this.a.isEmpty();
        }

        public void e(Bundle bundle0, o mediaBrowserCompat$o0) {
            for(int v = 0; v < this.b.size(); ++v) {
                if(MediaBrowserCompatUtils.a(((Bundle)this.b.get(v)), bundle0)) {
                    this.a.set(v, mediaBrowserCompat$o0);
                    return;
                }
            }
            this.a.add(mediaBrowserCompat$o0);
            this.b.add(bundle0);
        }
    }

    public static abstract class o {
        @RequiresApi(21)
        class android.support.v4.media.MediaBrowserCompat.o.a extends MediaBrowser.SubscriptionCallback {
            final o a;

            List a(List list0, Bundle bundle0) {
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

            @Override  // android.media.browse.MediaBrowser$SubscriptionCallback
            public void onChildrenLoaded(@NonNull String s, List list0) {
                WeakReference weakReference0 = o.this.c;
                n mediaBrowserCompat$n0 = weakReference0 == null ? null : ((n)weakReference0.get());
                if(mediaBrowserCompat$n0 == null) {
                    MediaItem.c(list0);
                    return;
                }
                List list1 = MediaItem.c(list0);
                List list2 = mediaBrowserCompat$n0.b();
                List list3 = mediaBrowserCompat$n0.c();
                for(int v = 0; v < list2.size(); ++v) {
                    Bundle bundle0 = (Bundle)list3.get(v);
                    if(bundle0 != null) {
                        this.a(list1, bundle0);
                    }
                }
            }

            @Override  // android.media.browse.MediaBrowser$SubscriptionCallback
            public void onError(@NonNull String s) {
            }
        }

        @RequiresApi(26)
        class android.support.v4.media.MediaBrowserCompat.o.b extends android.support.v4.media.MediaBrowserCompat.o.a {
            final o b;

            @Override  // android.media.browse.MediaBrowser$SubscriptionCallback
            public void onChildrenLoaded(@NonNull String s, @NonNull List list0, @NonNull Bundle bundle0) {
                MediaSessionCompat.b(bundle0);
                MediaItem.c(list0);
            }

            @Override  // android.media.browse.MediaBrowser$SubscriptionCallback
            public void onError(@NonNull String s, @NonNull Bundle bundle0) {
                MediaSessionCompat.b(bundle0);
            }
        }

        final MediaBrowser.SubscriptionCallback a;
        final IBinder b;
        WeakReference c;

        public o() {
            this.b = new Binder();
            if(Build.VERSION.SDK_INT >= 26) {
                this.a = new android.support.v4.media.MediaBrowserCompat.o.b(this);
                return;
            }
            this.a = new android.support.v4.media.MediaBrowserCompat.o.a(this);
        }

        public void a(@NonNull String s, @NonNull List list0) {
        }

        public void b(@NonNull String s, @NonNull List list0, @NonNull Bundle bundle0) {
        }

        public void c(@NonNull String s) {
        }

        public void d(@NonNull String s, @NonNull Bundle bundle0) {
        }

        void e(n mediaBrowserCompat$n0) {
            this.c = new WeakReference(mediaBrowserCompat$n0);
        }
    }

    private final f a;
    static final String b = "MediaBrowserCompat";
    static final boolean c = false;
    public static final String d = "android.media.browse.extra.PAGE";
    public static final String e = "android.media.browse.extra.PAGE_SIZE";
    public static final String f = "android.media.browse.extra.MEDIA_ID";
    public static final String g = "android.media.browse.extra.DOWNLOAD_PROGRESS";
    public static final String h = "android.support.v4.media.action.DOWNLOAD";
    public static final String i = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";

    static {
        MediaBrowserCompat.c = Log.isLoggable("MediaBrowserCompat", 3);
    }

    public MediaBrowserCompat(Context context0, ComponentName componentName0, c mediaBrowserCompat$c0, Bundle bundle0) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 26) {
            this.a = new i(context0, componentName0, mediaBrowserCompat$c0, bundle0);
            return;
        }
        if(v >= 23) {
            this.a = new h(context0, componentName0, mediaBrowserCompat$c0, bundle0);
            return;
        }
        this.a = new g(context0, componentName0, mediaBrowserCompat$c0, bundle0);
    }

    public void a() {
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        this.a.b();
    }

    public void b() {
        this.a.disconnect();
    }

    @Nullable
    public Bundle c() {
        return this.a.getExtras();
    }

    public void d(@NonNull String s, @NonNull e mediaBrowserCompat$e0) {
        this.a.j(s, mediaBrowserCompat$e0);
    }

    @Nullable
    @RestrictTo({Scope.c})
    public Bundle e() {
        return this.a.m();
    }

    @NonNull
    public String f() {
        return this.a.getRoot();
    }

    @NonNull
    public ComponentName g() {
        return this.a.d();
    }

    @NonNull
    public Token h() {
        return this.a.getSessionToken();
    }

    public boolean i() {
        return this.a.isConnected();
    }

    public void j(@NonNull String s, Bundle bundle0, @NonNull l mediaBrowserCompat$l0) {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException("query cannot be empty");
        }
        if(mediaBrowserCompat$l0 == null) {
            throw new IllegalArgumentException("callback cannot be null");
        }
        this.a.c(s, bundle0, mediaBrowserCompat$l0);
    }

    public void k(@NonNull String s, Bundle bundle0, @Nullable d mediaBrowserCompat$d0) {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException("action cannot be empty");
        }
        this.a.a(s, bundle0, mediaBrowserCompat$d0);
    }

    public void l(@NonNull String s, @NonNull Bundle bundle0, @NonNull o mediaBrowserCompat$o0) {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if(mediaBrowserCompat$o0 == null) {
            throw new IllegalArgumentException("callback is null");
        }
        if(bundle0 == null) {
            throw new IllegalArgumentException("options are null");
        }
        this.a.k(s, bundle0, mediaBrowserCompat$o0);
    }

    public void m(@NonNull String s, @NonNull o mediaBrowserCompat$o0) {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if(mediaBrowserCompat$o0 == null) {
            throw new IllegalArgumentException("callback is null");
        }
        this.a.k(s, null, mediaBrowserCompat$o0);
    }

    public void n(@NonNull String s) {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        this.a.l(s, null);
    }

    public void o(@NonNull String s, @NonNull o mediaBrowserCompat$o0) {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if(mediaBrowserCompat$o0 == null) {
            throw new IllegalArgumentException("callback is null");
        }
        this.a.l(s, mediaBrowserCompat$o0);
    }
}

