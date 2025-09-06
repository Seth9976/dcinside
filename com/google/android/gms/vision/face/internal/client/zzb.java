package com.google.android.gms.vision.face.internal.client;

import android.content.Context;
import android.graphics.PointF;
import android.media.Image.Plane;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.internal.vision.zzt;
import com.google.android.gms.internal.vision.zzu;
import com.google.android.gms.vision.face.Contour;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.Landmark;
import java.nio.ByteBuffer;

public final class zzb extends zzt {
    private final zzf zza;

    public zzb(Context context0, zzf zzf0) {
        super(context0, "FaceNativeHandle", "face");
        this.zza = zzf0;
        this.zzd();
    }

    private static Face zza(FaceParcel faceParcel0) {
        Landmark[] arr_landmark;
        int v = faceParcel0.zza;
        PointF pointF0 = new PointF(faceParcel0.zzb, faceParcel0.zzc);
        float f = faceParcel0.zzd;
        float f1 = faceParcel0.zze;
        float f2 = faceParcel0.zzf;
        float f3 = faceParcel0.zzg;
        float f4 = faceParcel0.zzh;
        LandmarkParcel[] arr_landmarkParcel = faceParcel0.zzi;
        if(arr_landmarkParcel == null) {
            arr_landmark = new Landmark[0];
        }
        else {
            Landmark[] arr_landmark1 = new Landmark[arr_landmarkParcel.length];
            for(int v1 = 0; v1 < arr_landmarkParcel.length; ++v1) {
                LandmarkParcel landmarkParcel0 = arr_landmarkParcel[v1];
                arr_landmark1[v1] = new Landmark(new PointF(landmarkParcel0.zza, landmarkParcel0.zzb), landmarkParcel0.zzc);
            }
            arr_landmark = arr_landmark1;
        }
        zza[] arr_zza = faceParcel0.zzm;
        if(arr_zza == null) {
            return new Face(v, pointF0, f, f1, f2, f3, f4, arr_landmark, new Contour[0], faceParcel0.zzj, faceParcel0.zzk, faceParcel0.zzl, faceParcel0.zzn);
        }
        Contour[] arr_contour = new Contour[arr_zza.length];
        for(int v2 = 0; v2 < arr_zza.length; ++v2) {
            zza zza0 = arr_zza[v2];
            arr_contour[v2] = new Contour(zza0.zza, zza0.zzb);
        }
        return new Face(v, pointF0, f, f1, f2, f3, f4, arr_landmark, arr_contour, faceParcel0.zzj, faceParcel0.zzk, faceParcel0.zzl, faceParcel0.zzn);
    }

    @Override  // com.google.android.gms.internal.vision.zzt
    @Nullable
    protected final Object zza(DynamiteModule dynamiteModule0, Context context0) throws RemoteException, LoadingException {
        zzi zzi0 = zzu.zza(context0, "com.google.android.gms.vision.dynamite.face") ? zzl.asInterface(dynamiteModule0.instantiate("com.google.android.gms.vision.face.NativeFaceDetectorV2Creator")) : zzl.asInterface(dynamiteModule0.instantiate("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"));
        return zzi0 == null ? null : zzi0.newFaceDetector(ObjectWrapper.wrap(context0), ((zzf)Preconditions.checkNotNull(this.zza)));
    }

    @Override  // com.google.android.gms.internal.vision.zzt
    protected final void zza() throws RemoteException {
        ((zzh)Preconditions.checkNotNull(((zzh)this.zzd()))).zza();
    }

    public final boolean zza(int v) {
        if(!this.zzb()) {
            return false;
        }
        try {
            return ((zzh)Preconditions.checkNotNull(((zzh)this.zzd()))).zza(v);
        }
        catch(RemoteException remoteException0) {
            Log.e("FaceNativeHandle", "Could not call native face detector", remoteException0);
            return false;
        }
    }

    public final Face[] zza(ByteBuffer byteBuffer0, zzs zzs0) {
        FaceParcel[] arr_faceParcel;
        if(!this.zzb()) {
            return new Face[0];
        }
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(byteBuffer0);
            arr_faceParcel = ((zzh)Preconditions.checkNotNull(((zzh)this.zzd()))).zza(iObjectWrapper0, zzs0);
        }
        catch(RemoteException remoteException0) {
            Log.e("FaceNativeHandle", "Could not call native face detector", remoteException0);
            return new Face[0];
        }
        Face[] arr_face = new Face[arr_faceParcel.length];
        for(int v = 0; v < arr_faceParcel.length; ++v) {
            arr_face[v] = zzb.zza(arr_faceParcel[v]);
        }
        return arr_face;
    }

    @RequiresApi(19)
    public final Face[] zza(Image.Plane[] arr_image$Plane, zzs zzs0) {
        FaceParcel[] arr_faceParcel;
        if(!this.zzb()) {
            Log.e("FaceNativeHandle", "Native handle is not ready to be used.");
            return new Face[0];
        }
        if(arr_image$Plane != null && arr_image$Plane.length != 3) {
            throw new IllegalArgumentException("Only android.graphics.ImageFormat#YUV_420_888 is supported which should have 3 planes.");
        }
        try {
            arr_faceParcel = ((zzh)Preconditions.checkNotNull(((zzh)this.zzd()))).zza(ObjectWrapper.wrap(arr_image$Plane[0].getBuffer()), ObjectWrapper.wrap(arr_image$Plane[1].getBuffer()), ObjectWrapper.wrap(arr_image$Plane[2].getBuffer()), arr_image$Plane[0].getPixelStride(), arr_image$Plane[1].getPixelStride(), arr_image$Plane[2].getPixelStride(), arr_image$Plane[0].getRowStride(), arr_image$Plane[1].getRowStride(), arr_image$Plane[2].getRowStride(), zzs0);
        }
        catch(RemoteException remoteException0) {
            Log.e("FaceNativeHandle", "Could not call native face detector", remoteException0);
            return new Face[0];
        }
        Face[] arr_face = new Face[arr_faceParcel.length];
        for(int v = 0; v < arr_faceParcel.length; ++v) {
            arr_face[v] = zzb.zza(arr_faceParcel[v]);
        }
        return arr_face;
    }
}

