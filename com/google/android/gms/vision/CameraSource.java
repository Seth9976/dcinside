package com.google.android.gms.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PictureCallback;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.ShutterCallback;
import android.hardware.Camera.Size;
import android.hardware.Camera;
import android.os.SystemClock;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.images.Size;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import o3.h;
import p3.a;

public class CameraSource {
    public static class Builder {
        private final Detector zza;
        private CameraSource zzb;

        public Builder(@RecentlyNonNull Context context0, @RecentlyNonNull Detector detector0) {
            CameraSource cameraSource0 = new CameraSource(null);
            this.zzb = cameraSource0;
            if(context0 == null) {
                throw new IllegalArgumentException("No context supplied.");
            }
            if(detector0 == null) {
                throw new IllegalArgumentException("No detector supplied.");
            }
            this.zza = detector0;
            cameraSource0.zza = context0;
        }

        @RecentlyNonNull
        public CameraSource build() {
            CameraSource cameraSource0 = this.zzb;
            cameraSource0.getClass();
            cameraSource0.zzn = new zza(cameraSource0, this.zza);
            return this.zzb;
        }

        @RecentlyNonNull
        public Builder setAutoFocusEnabled(boolean z) {
            this.zzb.zzj = z;
            return this;
        }

        @RecentlyNonNull
        public Builder setFacing(int v) {
            if(v != 0 && v != 1) {
                throw new IllegalArgumentException("Invalid camera: " + v);
            }
            this.zzb.zzd = v;
            return this;
        }

        @RecentlyNonNull
        public Builder setFocusMode(@RecentlyNonNull String s) {
            if(!s.equals("continuous-video") && !s.equals("continuous-picture")) {
                Log.w("CameraSource", String.format("FocusMode %s is not supported for now.", s));
                this.zzb.zzk = null;
                return this;
            }
            this.zzb.zzk = s;
            return this;
        }

        @RecentlyNonNull
        public Builder setRequestedFps(float f) {
            if(f <= 0.0f) {
                throw new IllegalArgumentException("Invalid fps: " + f);
            }
            this.zzb.zzg = f;
            return this;
        }

        @RecentlyNonNull
        public Builder setRequestedPreviewSize(int v, int v1) {
            if(v <= 0 || v > 1000000 || v1 <= 0 || v1 > 1000000) {
                throw new IllegalArgumentException("Invalid preview size: " + v + "x" + v1);
            }
            this.zzb.zzh = v;
            this.zzb.zzi = v1;
            return this;
        }
    }

    public interface PictureCallback {
        void onPictureTaken(@RecentlyNonNull byte[] arg1);
    }

    public interface ShutterCallback {
        void onShutter();
    }

    final class zza implements Runnable {
        @h
        private Detector zza;
        private long zzb;
        private final Object zzc;
        private boolean zzd;
        private long zze;
        private int zzf;
        @h
        private ByteBuffer zzg;
        private final CameraSource zzh;

        zza(Detector detector0) {
            this.zzb = SystemClock.elapsedRealtime();
            this.zzc = new Object();
            this.zzd = true;
            this.zzf = 0;
            this.zza = detector0;
        }

        @Override
        @SuppressLint({"InlinedApi"})
        public final void run() {
            ByteBuffer byteBuffer0;
            Frame frame0;
            while(true) {
                synchronized(this.zzc) {
                    while(true) {
                        boolean z = this.zzd;
                        if(!z || this.zzg != null) {
                            break;
                        }
                        try {
                            this.zzc.wait();
                        }
                        catch(InterruptedException interruptedException0) {
                            Log.d("CameraSource", "Frame processing loop terminated.", interruptedException0);
                            return;
                        }
                    }
                    if(!z) {
                        return;
                    }
                    frame0 = new com.google.android.gms.vision.Frame.Builder().setImageData(((ByteBuffer)Preconditions.checkNotNull(this.zzg)), CameraSource.this.zzf.getWidth(), CameraSource.this.zzf.getHeight(), 17).setId(this.zzf).setTimestampMillis(this.zze).setRotation(CameraSource.this.zze).build();
                    byteBuffer0 = this.zzg;
                    this.zzg = null;
                }
                try {
                    ((Detector)Preconditions.checkNotNull(this.zza)).receiveFrame(frame0);
                }
                catch(Exception exception0) {
                    Log.e("CameraSource", "Exception thrown from receiver.", exception0);
                }
                finally {
                    ((Camera)Preconditions.checkNotNull(CameraSource.this.zzc)).addCallbackBuffer(((ByteBuffer)Preconditions.checkNotNull(byteBuffer0)).array());
                }
            }
        }

        @SuppressLint({"Assert"})
        final void zza() {
            Detector detector0 = this.zza;
            if(detector0 != null) {
                detector0.release();
                this.zza = null;
            }
        }

        final void zza(boolean z) {
            synchronized(this.zzc) {
                this.zzd = z;
                this.zzc.notifyAll();
            }
        }

        final void zza(byte[] arr_b, Camera camera0) {
            synchronized(this.zzc) {
                ByteBuffer byteBuffer0 = this.zzg;
                if(byteBuffer0 != null) {
                    camera0.addCallbackBuffer(byteBuffer0.array());
                    this.zzg = null;
                }
                if(!CameraSource.this.zzo.containsKey(arr_b)) {
                    Log.d("CameraSource", "Skipping frame. Could not find ByteBuffer associated with the image data from the camera.");
                    return;
                }
                this.zze = SystemClock.elapsedRealtime() - this.zzb;
                ++this.zzf;
                this.zzg = (ByteBuffer)CameraSource.this.zzo.get(arr_b);
                this.zzc.notifyAll();
            }
        }
    }

    final class zzb implements Camera.PreviewCallback {
        private final CameraSource zza;

        private zzb() {
        }

        zzb(com.google.android.gms.vision.zza zza0) {
        }

        @Override  // android.hardware.Camera$PreviewCallback
        public final void onPreviewFrame(byte[] arr_b, Camera camera0) {
            CameraSource.this.zzn.zza(arr_b, camera0);
        }
    }

    final class zzc implements Camera.PictureCallback {
        @h
        private PictureCallback zza;
        private final CameraSource zzb;

        private zzc() {
        }

        zzc(com.google.android.gms.vision.zza zza0) {
        }

        @Override  // android.hardware.Camera$PictureCallback
        public final void onPictureTaken(byte[] arr_b, Camera camera0) {
            PictureCallback cameraSource$PictureCallback0 = this.zza;
            if(cameraSource$PictureCallback0 != null) {
                cameraSource$PictureCallback0.onPictureTaken(arr_b);
            }
            synchronized(CameraSource.this.zzb) {
                if(CameraSource.this.zzc != null) {
                    CameraSource.this.zzc.startPreview();
                }
            }
        }
    }

    static final class zzd implements Camera.ShutterCallback {
        @h
        private ShutterCallback zza;

        private zzd() {
        }

        zzd(com.google.android.gms.vision.zza zza0) {
        }

        @Override  // android.hardware.Camera$ShutterCallback
        public final void onShutter() {
            ShutterCallback cameraSource$ShutterCallback0 = this.zza;
            if(cameraSource$ShutterCallback0 != null) {
                cameraSource$ShutterCallback0.onShutter();
            }
        }
    }

    @VisibleForTesting
    static final class zze {
        private Size zza;
        private Size zzb;

        public zze(Camera.Size camera$Size0, @h Camera.Size camera$Size1) {
            this.zza = new Size(camera$Size0.width, camera$Size0.height);
            if(camera$Size1 != null) {
                this.zzb = new Size(camera$Size1.width, camera$Size1.height);
            }
        }

        public final Size zza() {
            return this.zza;
        }

        @h
        public final Size zzb() {
            return this.zzb;
        }
    }

    @SuppressLint({"InlinedApi"})
    public static final int CAMERA_FACING_BACK = 0;
    @SuppressLint({"InlinedApi"})
    public static final int CAMERA_FACING_FRONT = 1;
    private Context zza;
    private final Object zzb;
    @h
    @a("cameraLock")
    private Camera zzc;
    private int zzd;
    private int zze;
    private Size zzf;
    private float zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    @h
    private String zzk;
    @h
    private SurfaceTexture zzl;
    @h
    private Thread zzm;
    private zza zzn;
    private final IdentityHashMap zzo;

    private CameraSource() {
        this.zzb = new Object();
        this.zzd = 0;
        this.zzg = 30.0f;
        this.zzh = 0x400;
        this.zzi = 0x300;
        this.zzj = false;
        this.zzo = new IdentityHashMap();
    }

    CameraSource(com.google.android.gms.vision.zza zza0) {
    }

    public int getCameraFacing() {
        return this.zzd;
    }

    @RecentlyNonNull
    public Size getPreviewSize() {
        return this.zzf;
    }

    public void release() {
        synchronized(this.zzb) {
            this.stop();
            this.zzn.zza();
        }
    }

    @RecentlyNonNull
    @RequiresPermission("android.permission.CAMERA")
    public CameraSource start() throws IOException {
        synchronized(this.zzb) {
            if(this.zzc != null) {
                return this;
            }
            this.zzc = this.zza();
            SurfaceTexture surfaceTexture0 = new SurfaceTexture(100);
            this.zzl = surfaceTexture0;
            this.zzc.setPreviewTexture(surfaceTexture0);
            this.zzc.startPreview();
            Thread thread0 = new Thread(this.zzn);
            this.zzm = thread0;
            thread0.setName("gms.vision.CameraSource");
            this.zzn.zza(true);
            Thread thread1 = this.zzm;
            if(thread1 != null) {
                thread1.start();
            }
            return this;
        }
    }

    @RecentlyNonNull
    @RequiresPermission("android.permission.CAMERA")
    public CameraSource start(@RecentlyNonNull SurfaceHolder surfaceHolder0) throws IOException {
        synchronized(this.zzb) {
            if(this.zzc != null) {
                return this;
            }
            Camera camera0 = this.zza();
            this.zzc = camera0;
            camera0.setPreviewDisplay(surfaceHolder0);
            this.zzc.startPreview();
            this.zzm = new Thread(this.zzn);
            this.zzn.zza(true);
            Thread thread0 = this.zzm;
            if(thread0 != null) {
                thread0.start();
            }
            return this;
        }
    }

    public void stop() {
        synchronized(this.zzb) {
            this.zzn.zza(false);
            Thread thread0 = this.zzm;
            if(thread0 != null) {
                try {
                    thread0.join();
                }
                catch(InterruptedException unused_ex) {
                    Log.d("CameraSource", "Frame processing thread interrupted on release.");
                }
                this.zzm = null;
            }
            Camera camera0 = this.zzc;
            if(camera0 != null) {
                camera0.stopPreview();
                this.zzc.setPreviewCallbackWithBuffer(null);
                try {
                    this.zzc.setPreviewTexture(null);
                    this.zzl = null;
                    this.zzc.setPreviewDisplay(null);
                }
                catch(Exception exception0) {
                    Log.e("CameraSource", "Failed to clear camera preview: " + exception0);
                }
                ((Camera)Preconditions.checkNotNull(this.zzc)).release();
                this.zzc = null;
            }
            this.zzo.clear();
        }
    }

    public void takePicture(@h ShutterCallback cameraSource$ShutterCallback0, @h PictureCallback cameraSource$PictureCallback0) {
        synchronized(this.zzb) {
            if(this.zzc != null) {
                zzd cameraSource$zzd0 = new zzd(null);
                cameraSource$zzd0.zza = cameraSource$ShutterCallback0;
                zzc cameraSource$zzc0 = new zzc(this, null);
                cameraSource$zzc0.zza = cameraSource$PictureCallback0;
                this.zzc.takePicture(cameraSource$zzd0, null, null, cameraSource$zzc0);
            }
        }
    }

    @SuppressLint({"InlinedApi"})
    private final Camera zza() throws IOException {
        int v14;
        int v13;
        int v12;
        Camera.Size camera$Size1;
        int v = this.zzd;
        Camera.CameraInfo camera$CameraInfo0 = new Camera.CameraInfo();
        int v1;
        for(v1 = 0; true; ++v1) {
            if(v1 >= Camera.getNumberOfCameras()) {
                v1 = -1;
                break;
            }
            Camera.getCameraInfo(v1, camera$CameraInfo0);
            if(camera$CameraInfo0.facing == v) {
                break;
            }
        }
        if(v1 == -1) {
            throw new IOException("Could not find requested camera.");
        }
        Camera camera0 = Camera.open(v1);
        int v2 = this.zzh;
        int v3 = this.zzi;
        Camera.Parameters camera$Parameters0 = camera0.getParameters();
        List list0 = camera$Parameters0.getSupportedPreviewSizes();
        List list1 = camera$Parameters0.getSupportedPictureSizes();
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = list0.iterator();
    label_19:
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Camera.Size camera$Size0 = (Camera.Size)object0;
            float f = ((float)camera$Size0.width) / ((float)camera$Size0.height);
            Iterator iterator1 = list1.iterator();
            do {
                if(!iterator1.hasNext()) {
                    continue label_19;
                }
                Object object1 = iterator1.next();
                camera$Size1 = (Camera.Size)object1;
            }
            while(Math.abs(f - ((float)camera$Size1.width) / ((float)camera$Size1.height)) >= 0.01f);
            arrayList0.add(new zze(camera$Size0, camera$Size1));
        }
        if(arrayList0.size() == 0) {
            Log.w("CameraSource", "No preview sizes have a corresponding same-aspect-ratio picture size");
            for(Object object2: list0) {
                arrayList0.add(new zze(((Camera.Size)object2), null));
            }
        }
        int v4 = arrayList0.size();
        int v5 = 0x7FFFFFFF;
        zze cameraSource$zze0 = null;
        int v6 = 0;
        int v7 = 0x7FFFFFFF;
        while(v6 < v4) {
            Object object3 = arrayList0.get(v6);
            ++v6;
            zze cameraSource$zze1 = (zze)object3;
            Size size0 = cameraSource$zze1.zza();
            int v8 = Math.abs(size0.getWidth() - v2) + Math.abs(size0.getHeight() - v3);
            if(v8 < v7) {
                cameraSource$zze0 = cameraSource$zze1;
                v7 = v8;
            }
        }
        zze cameraSource$zze2 = (zze)Preconditions.checkNotNull(cameraSource$zze0);
        if(cameraSource$zze2 == null) {
            throw new IOException("Could not find suitable preview size.");
        }
        Size size1 = cameraSource$zze2.zzb();
        this.zzf = cameraSource$zze2.zza();
        int v9 = (int)(this.zzg * 1000.0f);
        int[] arr_v = null;
        for(Object object4: camera0.getParameters().getSupportedPreviewFpsRange()) {
            int[] arr_v1 = (int[])object4;
            int v10 = Math.abs(v9 - arr_v1[0]) + Math.abs(v9 - arr_v1[1]);
            if(v10 < v5) {
                arr_v = arr_v1;
                v5 = v10;
            }
        }
        int[] arr_v2 = (int[])Preconditions.checkNotNull(arr_v);
        if(arr_v2 == null) {
            throw new IOException("Could not find suitable preview frames per second range.");
        }
        Camera.Parameters camera$Parameters1 = camera0.getParameters();
        if(size1 != null) {
            camera$Parameters1.setPictureSize(size1.getWidth(), size1.getHeight());
        }
        camera$Parameters1.setPreviewSize(this.zzf.getWidth(), this.zzf.getHeight());
        camera$Parameters1.setPreviewFpsRange(arr_v2[0], arr_v2[1]);
        camera$Parameters1.setPreviewFormat(17);
        int v11 = ((WindowManager)Preconditions.checkNotNull(((WindowManager)this.zza.getSystemService("window")))).getDefaultDisplay().getRotation();
        switch(v11) {
            case 0: {
                v12 = 0;
                break;
            }
            case 1: {
                v12 = 90;
                break;
            }
            case 2: {
                v12 = 180;
                break;
            }
            case 3: {
                v12 = 270;
                break;
            }
            default: {
                Log.e("CameraSource", "Bad rotation value: " + v11);
                v12 = 0;
            }
        }
        Camera.CameraInfo camera$CameraInfo1 = new Camera.CameraInfo();
        Camera.getCameraInfo(v1, camera$CameraInfo1);
        if(camera$CameraInfo1.facing == 1) {
            v13 = (camera$CameraInfo1.orientation + v12) % 360;
            v14 = (360 - v13) % 360;
        }
        else {
            v13 = (camera$CameraInfo1.orientation - v12 + 360) % 360;
            v14 = v13;
        }
        this.zze = v13 / 90;
        camera0.setDisplayOrientation(v14);
        camera$Parameters1.setRotation(v13);
        if(this.zzk != null) {
            if(camera$Parameters1.getSupportedFocusModes().contains(this.zzk)) {
                camera$Parameters1.setFocusMode(((String)Preconditions.checkNotNull(this.zzk)));
            }
            else {
                Log.w("CameraSource", String.format("FocusMode %s is not supported on this device.", this.zzk));
                this.zzk = null;
            }
        }
        if(this.zzk == null && this.zzj) {
            if(camera$Parameters1.getSupportedFocusModes().contains("continuous-video")) {
                camera$Parameters1.setFocusMode("continuous-video");
                this.zzk = "continuous-video";
            }
            else {
                Log.i("CameraSource", "Camera auto focus is not supported on this device.");
            }
        }
        camera0.setParameters(camera$Parameters1);
        camera0.setPreviewCallbackWithBuffer(new zzb(this, null));
        camera0.addCallbackBuffer(this.zza(this.zzf));
        camera0.addCallbackBuffer(this.zza(this.zzf));
        camera0.addCallbackBuffer(this.zza(this.zzf));
        camera0.addCallbackBuffer(this.zza(this.zzf));
        return camera0;
    }

    @SuppressLint({"InlinedApi"})
    private final byte[] zza(Size size0) {
        byte[] arr_b = new byte[((int)Math.ceil(((double)(((long)size0.getHeight()) * ((long)size0.getWidth()) * ((long)ImageFormat.getBitsPerPixel(17)))) / 8.0)) + 1];
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
        if(!byteBuffer0.hasArray() || byteBuffer0.array() != arr_b) {
            throw new IllegalStateException("Failed to create valid buffer for camera source.");
        }
        this.zzo.put(arr_b, byteBuffer0);
        return arr_b;
    }
}

