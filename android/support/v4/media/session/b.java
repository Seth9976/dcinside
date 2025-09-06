package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.List;

@RestrictTo({Scope.a})
public interface b extends IInterface {
    public static class a implements b {
        @Override  // android.support.v4.media.session.b
        public void D0(long v) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public void G0(RatingCompat ratingCompat0) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public void H0(int v, int v1, String s) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public void J0(String s, Bundle bundle0) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public void O0() throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public void P(long v) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public List Q() throws RemoteException {
            return null;
        }

        @Override  // android.support.v4.media.session.b
        public void R(String s, Bundle bundle0) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public boolean S() throws RemoteException {
            return false;
        }

        @Override  // android.support.v4.media.session.b
        public void T(Uri uri0, Bundle bundle0) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public PendingIntent U() throws RemoteException {
            return null;
        }

        @Override  // android.support.v4.media.session.b
        public void V(String s, Bundle bundle0) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public void W(String s, Bundle bundle0) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public void W0(int v, int v1, String s) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public void X(RatingCompat ratingCompat0, Bundle bundle0) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public void Y(int v) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public void Z(String s, Bundle bundle0, ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper0) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public void a0() throws RemoteException {
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override  // android.support.v4.media.session.b
        public PlaybackStateCompat b() throws RemoteException {
            return null;
        }

        @Override  // android.support.v4.media.session.b
        public void b0(boolean z) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public void c() throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public void c0(android.support.v4.media.session.a a0) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public boolean d0() throws RemoteException {
            return false;
        }

        @Override  // android.support.v4.media.session.b
        public void e0(android.support.v4.media.session.a a0) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public Bundle getExtras() throws RemoteException {
            return null;
        }

        @Override  // android.support.v4.media.session.b
        public long getFlags() throws RemoteException {
            return 0L;
        }

        @Override  // android.support.v4.media.session.b
        public MediaMetadataCompat getMetadata() throws RemoteException {
            return null;
        }

        @Override  // android.support.v4.media.session.b
        public String getPackageName() throws RemoteException {
            return null;
        }

        @Override  // android.support.v4.media.session.b
        public String getTag() throws RemoteException {
            return null;
        }

        @Override  // android.support.v4.media.session.b
        public int i() throws RemoteException {
            return 0;
        }

        @Override  // android.support.v4.media.session.b
        public ParcelableVolumeInfo j0() throws RemoteException {
            return null;
        }

        @Override  // android.support.v4.media.session.b
        public void n() throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public void next() throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public void p(float f) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public void p0(String s, Bundle bundle0) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public void pause() throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public void previous() throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public void q(int v) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public boolean r() throws RemoteException {
            return false;
        }

        @Override  // android.support.v4.media.session.b
        public void r0(Uri uri0, Bundle bundle0) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public CharSequence s() throws RemoteException {
            return null;
        }

        @Override  // android.support.v4.media.session.b
        public boolean s0(KeyEvent keyEvent0) throws RemoteException {
            return false;
        }

        @Override  // android.support.v4.media.session.b
        public void stop() throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public void t(boolean z) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public int u() throws RemoteException {
            return 0;
        }

        @Override  // android.support.v4.media.session.b
        public void u0(MediaDescriptionCompat mediaDescriptionCompat0, int v) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public Bundle v() throws RemoteException {
            return null;
        }

        @Override  // android.support.v4.media.session.b
        public int w() throws RemoteException {
            return 0;
        }

        @Override  // android.support.v4.media.session.b
        public void x(int v) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public void y(MediaDescriptionCompat mediaDescriptionCompat0) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.b
        public void z(MediaDescriptionCompat mediaDescriptionCompat0) throws RemoteException {
        }
    }

    public static abstract class android.support.v4.media.session.b.b extends Binder implements b {
        static class android.support.v4.media.session.b.b.a implements b {
            private IBinder a;

            android.support.v4.media.session.b.b.a(IBinder iBinder0) {
                this.a = iBinder0;
            }

            @Override  // android.support.v4.media.session.b
            public void D0(long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcel0.writeLong(v);
                    this.a.transact(17, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void G0(RatingCompat ratingCompat0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    c.f(parcel0, ratingCompat0, 0);
                    this.a.transact(25, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void H0(int v, int v1, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    parcel0.writeString(s);
                    this.a.transact(12, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void J0(String s, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcel0.writeString(s);
                    c.f(parcel0, bundle0, 0);
                    this.a.transact(35, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void O0() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(22, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void P(long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcel0.writeLong(v);
                    this.a.transact(24, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public List Q() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(29, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.createTypedArrayList(QueueItem.CREATOR);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void R(String s, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcel0.writeString(s);
                    c.f(parcel0, bundle0, 0);
                    this.a.transact(26, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public boolean S() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    boolean z = false;
                    this.a.transact(38, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        z = true;
                    }
                    return z;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void T(Uri uri0, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    c.f(parcel0, uri0, 0);
                    c.f(parcel0, bundle0, 0);
                    this.a.transact(36, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public PendingIntent U() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(8, parcel0, parcel1, 0);
                    parcel1.readException();
                    return (PendingIntent)c.d(parcel1, PendingIntent.CREATOR);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void V(String s, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcel0.writeString(s);
                    c.f(parcel0, bundle0, 0);
                    this.a.transact(34, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void W(String s, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcel0.writeString(s);
                    c.f(parcel0, bundle0, 0);
                    this.a.transact(14, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void W0(int v, int v1, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    parcel0.writeString(s);
                    this.a.transact(11, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void X(RatingCompat ratingCompat0, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    c.f(parcel0, ratingCompat0, 0);
                    c.f(parcel0, bundle0, 0);
                    this.a.transact(51, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void Y(int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcel0.writeInt(v);
                    this.a.transact(44, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void Z(String s, Bundle bundle0, ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcel0.writeString(s);
                    c.f(parcel0, bundle0, 0);
                    c.f(parcel0, mediaSessionCompat$ResultReceiverWrapper0, 0);
                    this.a.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void a0() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(23, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override  // android.support.v4.media.session.b
            public PlaybackStateCompat b() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(28, parcel0, parcel1, 0);
                    parcel1.readException();
                    return (PlaybackStateCompat)c.d(parcel1, PlaybackStateCompat.CREATOR);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void b0(boolean z) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcel0.writeInt(((int)z));
                    this.a.transact(40, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void c() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(13, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void c0(android.support.v4.media.session.a a0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcel0.writeStrongInterface(a0);
                    this.a.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public boolean d0() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    boolean z = false;
                    this.a.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        z = true;
                    }
                    return z;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void e0(android.support.v4.media.session.a a0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcel0.writeStrongInterface(a0);
                    this.a.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public Bundle getExtras() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(0x1F, parcel0, parcel1, 0);
                    parcel1.readException();
                    return (Bundle)c.d(parcel1, Bundle.CREATOR);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public long getFlags() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(9, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readLong();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public MediaMetadataCompat getMetadata() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(27, parcel0, parcel1, 0);
                    parcel1.readException();
                    return (MediaMetadataCompat)c.d(parcel1, MediaMetadataCompat.CREATOR);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public String getPackageName() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public String getTag() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public int i() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(37, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            public String i1() {
                return "android.support.v4.media.session.IMediaSession";
            }

            @Override  // android.support.v4.media.session.b
            public ParcelableVolumeInfo j0() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(10, parcel0, parcel1, 0);
                    parcel1.readException();
                    return (ParcelableVolumeInfo)c.d(parcel1, ParcelableVolumeInfo.CREATOR);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void n() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(33, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void next() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(20, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void p(float f) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcel0.writeFloat(f);
                    this.a.transact(49, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void p0(String s, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcel0.writeString(s);
                    c.f(parcel0, bundle0, 0);
                    this.a.transact(15, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void pause() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(18, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void previous() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(21, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void q(int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcel0.writeInt(v);
                    this.a.transact(39, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public boolean r() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    boolean z = false;
                    this.a.transact(45, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        z = true;
                    }
                    return z;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void r0(Uri uri0, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    c.f(parcel0, uri0, 0);
                    c.f(parcel0, bundle0, 0);
                    this.a.transact(16, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public CharSequence s() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(30, parcel0, parcel1, 0);
                    parcel1.readException();
                    return (CharSequence)c.d(parcel1, TextUtils.CHAR_SEQUENCE_CREATOR);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public boolean s0(KeyEvent keyEvent0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    boolean z = false;
                    c.f(parcel0, keyEvent0, 0);
                    this.a.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        z = true;
                    }
                    return z;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void stop() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(19, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void t(boolean z) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcel0.writeInt(((int)z));
                    this.a.transact(46, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public int u() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(0x20, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void u0(MediaDescriptionCompat mediaDescriptionCompat0, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    c.f(parcel0, mediaDescriptionCompat0, 0);
                    parcel0.writeInt(v);
                    this.a.transact(42, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public Bundle v() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(50, parcel0, parcel1, 0);
                    parcel1.readException();
                    return (Bundle)c.d(parcel1, Bundle.CREATOR);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public int w() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.a.transact(0x2F, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void x(int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcel0.writeInt(v);
                    this.a.transact(0x30, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void y(MediaDescriptionCompat mediaDescriptionCompat0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    c.f(parcel0, mediaDescriptionCompat0, 0);
                    this.a.transact(43, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.b
            public void z(MediaDescriptionCompat mediaDescriptionCompat0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    c.f(parcel0, mediaDescriptionCompat0, 0);
                    this.a.transact(41, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        static final int A = 50;
        static final int B = 33;
        static final int C = 34;
        static final int D = 35;
        static final int E = 36;
        static final int F = 13;
        static final int G = 14;
        static final int H = 15;
        static final int I = 16;
        static final int J = 17;
        static final int K = 18;
        static final int L = 19;
        static final int M = 20;
        static final int M8 = 46;
        static final int N = 21;
        static final int N8 = 39;
        static final int O = 22;
        static final int O8 = 40;
        static final int P = 23;
        static final int P8 = 0x30;
        static final int Q = 24;
        static final int Q8 = 26;
        static final int X = 25;
        static final int Y = 51;
        static final int Z = 49;
        static final int a = 1;
        static final int b = 2;
        static final int c = 3;
        static final int d = 4;
        static final int e = 5;
        static final int f = 6;
        static final int g = 7;
        static final int h = 8;
        static final int i = 9;
        static final int j = 10;
        static final int k = 11;
        static final int l = 12;
        static final int m = 27;
        static final int n = 28;
        static final int o = 29;
        static final int p = 30;
        static final int q = 0x1F;
        static final int r = 0x20;
        static final int s = 45;
        static final int t = 37;
        static final int u = 38;
        static final int v = 0x2F;
        static final int w = 41;
        static final int x = 42;
        static final int y = 43;
        static final int z = 44;

        public android.support.v4.media.session.b.b() {
            this.attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static b i1(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return iInterface0 != null && iInterface0 instanceof b ? ((b)iInterface0) : new android.support.v4.media.session.b.b.a(iBinder0);
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("android.support.v4.media.session.IMediaSession");
            }
            if(v == 0x5F4E5446) {
                parcel1.writeString("android.support.v4.media.session.IMediaSession");
                return true;
            }
            boolean z = false;
            switch(v) {
                case 1: {
                    this.Z(parcel0.readString(), ((Bundle)c.d(parcel0, Bundle.CREATOR)), ((ResultReceiverWrapper)c.d(parcel0, ResultReceiverWrapper.CREATOR)));
                    parcel1.writeNoException();
                    return true;
                }
                case 2: {
                    boolean z1 = this.s0(((KeyEvent)c.d(parcel0, KeyEvent.CREATOR)));
                    parcel1.writeNoException();
                    parcel1.writeInt(((int)z1));
                    return true;
                }
                case 3: {
                    this.c0(android.support.v4.media.session.a.b.i1(parcel0.readStrongBinder()));
                    parcel1.writeNoException();
                    return true;
                }
                case 4: {
                    this.e0(android.support.v4.media.session.a.b.i1(parcel0.readStrongBinder()));
                    parcel1.writeNoException();
                    return true;
                }
                case 5: {
                    boolean z2 = this.d0();
                    parcel1.writeNoException();
                    parcel1.writeInt(((int)z2));
                    return true;
                }
                case 6: {
                    String s = this.getPackageName();
                    parcel1.writeNoException();
                    parcel1.writeString(s);
                    return true;
                }
                case 7: {
                    String s1 = this.getTag();
                    parcel1.writeNoException();
                    parcel1.writeString(s1);
                    return true;
                }
                case 8: {
                    PendingIntent pendingIntent0 = this.U();
                    parcel1.writeNoException();
                    c.f(parcel1, pendingIntent0, 1);
                    return true;
                }
                case 9: {
                    long v2 = this.getFlags();
                    parcel1.writeNoException();
                    parcel1.writeLong(v2);
                    return true;
                }
                case 10: {
                    ParcelableVolumeInfo parcelableVolumeInfo0 = this.j0();
                    parcel1.writeNoException();
                    c.f(parcel1, parcelableVolumeInfo0, 1);
                    return true;
                }
                case 11: {
                    this.W0(parcel0.readInt(), parcel0.readInt(), parcel0.readString());
                    parcel1.writeNoException();
                    return true;
                }
                case 12: {
                    this.H0(parcel0.readInt(), parcel0.readInt(), parcel0.readString());
                    parcel1.writeNoException();
                    return true;
                }
                case 13: {
                    this.c();
                    parcel1.writeNoException();
                    return true;
                }
                case 14: {
                    this.W(parcel0.readString(), ((Bundle)c.d(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    return true;
                }
                case 15: {
                    this.p0(parcel0.readString(), ((Bundle)c.d(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    return true;
                }
                case 16: {
                    this.r0(((Uri)c.d(parcel0, Uri.CREATOR)), ((Bundle)c.d(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    return true;
                }
                case 17: {
                    this.D0(parcel0.readLong());
                    parcel1.writeNoException();
                    return true;
                }
                case 18: {
                    this.pause();
                    parcel1.writeNoException();
                    return true;
                }
                case 19: {
                    this.stop();
                    parcel1.writeNoException();
                    return true;
                }
                case 20: {
                    this.next();
                    parcel1.writeNoException();
                    return true;
                }
                case 21: {
                    this.previous();
                    parcel1.writeNoException();
                    return true;
                }
                case 22: {
                    this.O0();
                    parcel1.writeNoException();
                    return true;
                }
                case 23: {
                    this.a0();
                    parcel1.writeNoException();
                    return true;
                }
                case 24: {
                    this.P(parcel0.readLong());
                    parcel1.writeNoException();
                    return true;
                }
                case 25: {
                    this.G0(((RatingCompat)c.d(parcel0, RatingCompat.CREATOR)));
                    parcel1.writeNoException();
                    return true;
                }
                case 26: {
                    this.R(parcel0.readString(), ((Bundle)c.d(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    return true;
                }
                case 27: {
                    MediaMetadataCompat mediaMetadataCompat0 = this.getMetadata();
                    parcel1.writeNoException();
                    c.f(parcel1, mediaMetadataCompat0, 1);
                    return true;
                }
                case 28: {
                    PlaybackStateCompat playbackStateCompat0 = this.b();
                    parcel1.writeNoException();
                    c.f(parcel1, playbackStateCompat0, 1);
                    return true;
                }
                case 29: {
                    List list0 = this.Q();
                    parcel1.writeNoException();
                    c.e(parcel1, list0, 1);
                    return true;
                }
                case 30: {
                    CharSequence charSequence0 = this.s();
                    parcel1.writeNoException();
                    if(charSequence0 != null) {
                        parcel1.writeInt(1);
                        TextUtils.writeToParcel(charSequence0, parcel1, 1);
                        return true;
                    }
                    parcel1.writeInt(0);
                    return true;
                }
                case 0x1F: {
                    Bundle bundle0 = this.getExtras();
                    parcel1.writeNoException();
                    c.f(parcel1, bundle0, 1);
                    return true;
                }
                case 0x20: {
                    int v3 = this.u();
                    parcel1.writeNoException();
                    parcel1.writeInt(v3);
                    return true;
                }
                case 33: {
                    this.n();
                    parcel1.writeNoException();
                    return true;
                }
                case 34: {
                    this.V(parcel0.readString(), ((Bundle)c.d(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    return true;
                }
                case 35: {
                    this.J0(parcel0.readString(), ((Bundle)c.d(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    return true;
                }
                case 36: {
                    this.T(((Uri)c.d(parcel0, Uri.CREATOR)), ((Bundle)c.d(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    return true;
                }
                case 37: {
                    int v4 = this.i();
                    parcel1.writeNoException();
                    parcel1.writeInt(v4);
                    return true;
                }
                case 38: {
                    boolean z3 = this.S();
                    parcel1.writeNoException();
                    parcel1.writeInt(((int)z3));
                    return true;
                }
                case 39: {
                    this.q(parcel0.readInt());
                    parcel1.writeNoException();
                    return true;
                }
                case 40: {
                    if(parcel0.readInt() != 0) {
                        z = true;
                    }
                    this.b0(z);
                    parcel1.writeNoException();
                    return true;
                }
                case 41: {
                    this.z(((MediaDescriptionCompat)c.d(parcel0, MediaDescriptionCompat.CREATOR)));
                    parcel1.writeNoException();
                    return true;
                }
                case 42: {
                    this.u0(((MediaDescriptionCompat)c.d(parcel0, MediaDescriptionCompat.CREATOR)), parcel0.readInt());
                    parcel1.writeNoException();
                    return true;
                }
                case 43: {
                    this.y(((MediaDescriptionCompat)c.d(parcel0, MediaDescriptionCompat.CREATOR)));
                    parcel1.writeNoException();
                    return true;
                }
                case 44: {
                    this.Y(parcel0.readInt());
                    parcel1.writeNoException();
                    return true;
                }
                case 45: {
                    boolean z4 = this.r();
                    parcel1.writeNoException();
                    parcel1.writeInt(((int)z4));
                    return true;
                }
                case 46: {
                    if(parcel0.readInt() != 0) {
                        z = true;
                    }
                    this.t(z);
                    parcel1.writeNoException();
                    return true;
                }
                case 0x2F: {
                    int v5 = this.w();
                    parcel1.writeNoException();
                    parcel1.writeInt(v5);
                    return true;
                }
                case 0x30: {
                    this.x(parcel0.readInt());
                    parcel1.writeNoException();
                    return true;
                }
                case 49: {
                    this.p(parcel0.readFloat());
                    parcel1.writeNoException();
                    return true;
                }
                case 50: {
                    Bundle bundle1 = this.v();
                    parcel1.writeNoException();
                    c.f(parcel1, bundle1, 1);
                    return true;
                }
                case 51: {
                    this.X(((RatingCompat)c.d(parcel0, RatingCompat.CREATOR)), ((Bundle)c.d(parcel0, Bundle.CREATOR)));
                    parcel1.writeNoException();
                    return true;
                }
                default: {
                    return super.onTransact(v, parcel0, parcel1, v1);
                }
            }
        }
    }

    public static class c {
        private static Object d(Parcel parcel0, Parcelable.Creator parcelable$Creator0) {
            return parcel0.readInt() == 0 ? null : parcelable$Creator0.createFromParcel(parcel0);
        }

        private static void e(Parcel parcel0, List list0, int v) {
            if(list0 == null) {
                parcel0.writeInt(-1);
                return;
            }
            int v1 = list0.size();
            parcel0.writeInt(v1);
            for(int v2 = 0; v2 < v1; ++v2) {
                c.f(parcel0, ((Parcelable)list0.get(v2)), v);
            }
        }

        private static void f(Parcel parcel0, Parcelable parcelable0, int v) {
            if(parcelable0 != null) {
                parcel0.writeInt(1);
                parcelable0.writeToParcel(parcel0, v);
                return;
            }
            parcel0.writeInt(0);
        }
    }

    public static final String h0 = "android.support.v4.media.session.IMediaSession";

    void D0(long arg1) throws RemoteException;

    void G0(RatingCompat arg1) throws RemoteException;

    void H0(int arg1, int arg2, String arg3) throws RemoteException;

    void J0(String arg1, Bundle arg2) throws RemoteException;

    void O0() throws RemoteException;

    void P(long arg1) throws RemoteException;

    List Q() throws RemoteException;

    void R(String arg1, Bundle arg2) throws RemoteException;

    boolean S() throws RemoteException;

    void T(Uri arg1, Bundle arg2) throws RemoteException;

    PendingIntent U() throws RemoteException;

    void V(String arg1, Bundle arg2) throws RemoteException;

    void W(String arg1, Bundle arg2) throws RemoteException;

    void W0(int arg1, int arg2, String arg3) throws RemoteException;

    void X(RatingCompat arg1, Bundle arg2) throws RemoteException;

    void Y(int arg1) throws RemoteException;

    void Z(String arg1, Bundle arg2, ResultReceiverWrapper arg3) throws RemoteException;

    void a0() throws RemoteException;

    PlaybackStateCompat b() throws RemoteException;

    void b0(boolean arg1) throws RemoteException;

    void c() throws RemoteException;

    void c0(android.support.v4.media.session.a arg1) throws RemoteException;

    boolean d0() throws RemoteException;

    void e0(android.support.v4.media.session.a arg1) throws RemoteException;

    Bundle getExtras() throws RemoteException;

    long getFlags() throws RemoteException;

    MediaMetadataCompat getMetadata() throws RemoteException;

    String getPackageName() throws RemoteException;

    String getTag() throws RemoteException;

    int i() throws RemoteException;

    ParcelableVolumeInfo j0() throws RemoteException;

    void n() throws RemoteException;

    void next() throws RemoteException;

    void p(float arg1) throws RemoteException;

    void p0(String arg1, Bundle arg2) throws RemoteException;

    void pause() throws RemoteException;

    void previous() throws RemoteException;

    void q(int arg1) throws RemoteException;

    boolean r() throws RemoteException;

    void r0(Uri arg1, Bundle arg2) throws RemoteException;

    CharSequence s() throws RemoteException;

    boolean s0(KeyEvent arg1) throws RemoteException;

    void stop() throws RemoteException;

    void t(boolean arg1) throws RemoteException;

    int u() throws RemoteException;

    void u0(MediaDescriptionCompat arg1, int arg2) throws RemoteException;

    Bundle v() throws RemoteException;

    int w() throws RemoteException;

    void x(int arg1) throws RemoteException;

    void y(MediaDescriptionCompat arg1) throws RemoteException;

    void z(MediaDescriptionCompat arg1) throws RemoteException;
}

