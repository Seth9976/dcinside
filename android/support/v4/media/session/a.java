package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.List;

@RestrictTo({Scope.a})
public interface a extends IInterface {
    public static class android.support.v4.media.session.a.a implements a {
        @Override  // android.support.v4.media.session.a
        public void A(int v) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.a
        public void B(String s, Bundle bundle0) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.a
        public void B0(int v) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.a
        public void C() throws RemoteException {
        }

        @Override  // android.support.v4.media.session.a
        public void D(List list0) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.a
        public void E() throws RemoteException {
        }

        @Override  // android.support.v4.media.session.a
        public void F0(ParcelableVolumeInfo parcelableVolumeInfo0) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.a
        public void K0(Bundle bundle0) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.a
        public void P0(boolean z) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.a
        public void U0(boolean z) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.a
        public void V0(CharSequence charSequence0) throws RemoteException {
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override  // android.support.v4.media.session.a
        public void h1(PlaybackStateCompat playbackStateCompat0) throws RemoteException {
        }

        @Override  // android.support.v4.media.session.a
        public void v0(MediaMetadataCompat mediaMetadataCompat0) throws RemoteException {
        }
    }

    public static abstract class b extends Binder implements a {
        static class android.support.v4.media.session.a.b.a implements a {
            private IBinder a;

            android.support.v4.media.session.a.b.a(IBinder iBinder0) {
                this.a = iBinder0;
            }

            @Override  // android.support.v4.media.session.a
            public void A(int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcel0.writeInt(v);
                    this.a.transact(9, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.a
            public void B(String s, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcel0.writeString(s);
                    c.f(parcel0, bundle0, 0);
                    this.a.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.a
            public void B0(int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcel0.writeInt(v);
                    this.a.transact(12, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.a
            public void C() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    this.a.transact(13, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.a
            public void D(List list0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    c.e(parcel0, list0, 0);
                    this.a.transact(5, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.a
            public void E() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    this.a.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.a
            public void F0(ParcelableVolumeInfo parcelableVolumeInfo0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    c.f(parcel0, parcelableVolumeInfo0, 0);
                    this.a.transact(8, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.a
            public void K0(Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    c.f(parcel0, bundle0, 0);
                    this.a.transact(7, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.a
            public void P0(boolean z) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcel0.writeInt(((int)z));
                    this.a.transact(11, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.a
            public void U0(boolean z) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcel0.writeInt(((int)z));
                    this.a.transact(10, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // android.support.v4.media.session.a
            public void V0(CharSequence charSequence0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if(charSequence0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        TextUtils.writeToParcel(charSequence0, parcel0, 0);
                    }
                    this.a.transact(6, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override  // android.support.v4.media.session.a
            public void h1(PlaybackStateCompat playbackStateCompat0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    c.f(parcel0, playbackStateCompat0, 0);
                    this.a.transact(3, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            public String i1() {
                return "android.support.v4.media.session.IMediaControllerCallback";
            }

            @Override  // android.support.v4.media.session.a
            public void v0(MediaMetadataCompat mediaMetadataCompat0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    c.f(parcel0, mediaMetadataCompat0, 0);
                    this.a.transact(4, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

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
        static final int m = 13;

        public b() {
            this.attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static a i1(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            return iInterface0 != null && iInterface0 instanceof a ? ((a)iInterface0) : new android.support.v4.media.session.a.b.a(iBinder0);
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            }
            if(v == 0x5F4E5446) {
                parcel1.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            boolean z = false;
            switch(v) {
                case 1: {
                    this.B(parcel0.readString(), ((Bundle)c.d(parcel0, Bundle.CREATOR)));
                    return true;
                }
                case 2: {
                    this.E();
                    return true;
                }
                case 3: {
                    this.h1(((PlaybackStateCompat)c.d(parcel0, PlaybackStateCompat.CREATOR)));
                    return true;
                }
                case 4: {
                    this.v0(((MediaMetadataCompat)c.d(parcel0, MediaMetadataCompat.CREATOR)));
                    return true;
                }
                case 5: {
                    this.D(parcel0.createTypedArrayList(QueueItem.CREATOR));
                    return true;
                }
                case 6: {
                    this.V0(((CharSequence)c.d(parcel0, TextUtils.CHAR_SEQUENCE_CREATOR)));
                    return true;
                }
                case 7: {
                    this.K0(((Bundle)c.d(parcel0, Bundle.CREATOR)));
                    return true;
                }
                case 8: {
                    this.F0(((ParcelableVolumeInfo)c.d(parcel0, ParcelableVolumeInfo.CREATOR)));
                    return true;
                }
                case 9: {
                    this.A(parcel0.readInt());
                    return true;
                }
                case 10: {
                    if(parcel0.readInt() != 0) {
                        z = true;
                    }
                    this.U0(z);
                    return true;
                }
                case 11: {
                    if(parcel0.readInt() != 0) {
                        z = true;
                    }
                    this.P0(z);
                    return true;
                }
                case 12: {
                    this.B0(parcel0.readInt());
                    return true;
                }
                case 13: {
                    this.C();
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

    public static final String g0 = "android.support.v4.media.session.IMediaControllerCallback";

    void A(int arg1) throws RemoteException;

    void B(String arg1, Bundle arg2) throws RemoteException;

    void B0(int arg1) throws RemoteException;

    void C() throws RemoteException;

    void D(List arg1) throws RemoteException;

    void E() throws RemoteException;

    void F0(ParcelableVolumeInfo arg1) throws RemoteException;

    void K0(Bundle arg1) throws RemoteException;

    void P0(boolean arg1) throws RemoteException;

    void U0(boolean arg1) throws RemoteException;

    void V0(CharSequence arg1) throws RemoteException;

    void h1(PlaybackStateCompat arg1) throws RemoteException;

    void v0(MediaMetadataCompat arg1) throws RemoteException;
}

