package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.system.ErrnoException;
import android.system.Os;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import jeb.synthetic.FIN;

final class GifInfoHandle {
    private volatile long a;

    static {
        o.c();
    }

    GifInfoHandle() {
    }

    GifInfoHandle(AssetFileDescriptor assetFileDescriptor0) throws IOException {
        int v = FIN.finallyOpen$NT();
        this.a = GifInfoHandle.x(assetFileDescriptor0.getFileDescriptor(), assetFileDescriptor0.getStartOffset(), false);
        try {
            FIN.finallyCodeBegin$NT(v);
            assetFileDescriptor0.close();
            FIN.finallyCodeEnd$NT(v);
        }
        catch(IOException unused_ex) {
        }
    }

    GifInfoHandle(FileDescriptor fileDescriptor0) throws GifIOException {
        this.a = GifInfoHandle.x(fileDescriptor0, 0L, true);
    }

    GifInfoHandle(InputStream inputStream0) throws GifIOException {
        if(!inputStream0.markSupported()) {
            throw new IllegalArgumentException("InputStream does not support marking");
        }
        this.a = GifInfoHandle.openStream(inputStream0);
    }

    GifInfoHandle(String s) throws GifIOException {
        this.a = GifInfoHandle.openFile(s);
    }

    GifInfoHandle(ByteBuffer byteBuffer0) throws GifIOException {
        this.a = GifInfoHandle.openDirectByteBuffer(byteBuffer0);
    }

    GifInfoHandle(byte[] arr_b) throws GifIOException {
        this.a = GifInfoHandle.openByteArray(arr_b);
    }

    void A() {
        synchronized(this) {
            GifInfoHandle.free(this.a);
            this.a = 0L;
        }
    }

    long B(Bitmap bitmap0) {
        synchronized(this) {
            return GifInfoHandle.renderFrame(this.a, bitmap0);
        }
    }

    boolean C() {
        synchronized(this) {
            return GifInfoHandle.reset(this.a);
        }
    }

    long D() {
        synchronized(this) {
            return GifInfoHandle.restoreRemainder(this.a);
        }
    }

    int E(long[] arr_v, Bitmap bitmap0) {
        synchronized(this) {
            return GifInfoHandle.restoreSavedState(this.a, arr_v, bitmap0);
        }
    }

    void F() {
        synchronized(this) {
            GifInfoHandle.saveRemainder(this.a);
        }
    }

    void G(@IntRange(from = 0L, to = 0x7FFFFFFFL) int v, Bitmap bitmap0) {
        synchronized(this) {
            GifInfoHandle.seekToFrame(this.a, v, bitmap0);
        }
    }

    void H(@IntRange(from = 0L) int v) {
        this.O(v);
        GifInfoHandle.seekToFrameGL(this.a, v);
    }

    void I(@IntRange(from = 0L, to = 0x7FFFFFFFL) int v, Bitmap bitmap0) {
        synchronized(this) {
            GifInfoHandle.seekToTime(this.a, v, bitmap0);
        }
    }

    void J(@IntRange(from = 0L, to = 0xFFFFL) int v) {
        if(v < 0 || v > 0xFFFF) {
            throw new IllegalArgumentException("Loop count of range <0, 65535>");
        }
        synchronized(this) {
            GifInfoHandle.setLoopCount(this.a, ((char)v));
        }
    }

    void K(char c, boolean z) {
        GifInfoHandle.setOptions(this.a, c, z);
    }

    void L(@FloatRange(from = 0.0, fromInclusive = false) float f) {
        if(f <= 0.0f || Float.isNaN(f)) {
            throw new IllegalArgumentException("Speed factor is not positive");
        }
        if(f < 4.656613E-10f) {
            f = 4.656613E-10f;
        }
        synchronized(this) {
            GifInfoHandle.setSpeedFactor(this.a, f);
        }
    }

    void M() {
        GifInfoHandle.startDecoderThread(this.a);
    }

    void N() {
        GifInfoHandle.stopDecoderThread(this.a);
    }

    private void O(@IntRange(from = 0L) int v) {
        int v1 = GifInfoHandle.getNumberOfFrames(this.a);
        if(v < 0 || v >= v1) {
            throw new IndexOutOfBoundsException("Frame index is not in range <0;" + v1 + '>');
        }
    }

    void a(Surface surface0, long[] arr_v) {
        GifInfoHandle.bindSurface(this.a, surface0, arr_v);
    }

    long b() {
        synchronized(this) {
            return GifInfoHandle.getAllocationByteCount(this.a);
        }
    }

    private static native void bindSurface(long arg0, Surface arg1, long[] arg2) {
    }

    String c() {
        synchronized(this) {
            return GifInfoHandle.getComment(this.a);
        }
    }

    static native int createTempNativeFileDescriptor() throws GifIOException {
    }

    int d() {
        synchronized(this) {
            return GifInfoHandle.getCurrentFrameIndex(this.a);
        }
    }

    int e() {
        synchronized(this) {
            return GifInfoHandle.getCurrentLoop(this.a);
        }
    }

    static native int extractNativeFileDescriptor(FileDescriptor arg0, boolean arg1) throws GifIOException {
    }

    int f() {
        synchronized(this) {
            return GifInfoHandle.getCurrentPosition(this.a);
        }
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            this.A();
        }
        finally {
            super.finalize();
        }
    }

    private static native void free(long arg0) {
    }

    int g() {
        synchronized(this) {
            return GifInfoHandle.getDuration(this.a);
        }
    }

    private static native long getAllocationByteCount(long arg0) {
    }

    private static native String getComment(long arg0) {
    }

    private static native int getCurrentFrameIndex(long arg0) {
    }

    private static native int getCurrentLoop(long arg0) {
    }

    private static native int getCurrentPosition(long arg0) {
    }

    private static native int getDuration(long arg0) {
    }

    private static native int getFrameDuration(long arg0, int arg1) {
    }

    private static native int getHeight(long arg0) {
    }

    private static native int getLoopCount(long arg0) {
    }

    private static native long getMetadataByteCount(long arg0) {
    }

    private static native int getNativeErrorCode(long arg0) {
    }

    private static native int getNumberOfFrames(long arg0) {
    }

    private static native long[] getSavedState(long arg0) {
    }

    private static native long getSourceLength(long arg0) {
    }

    private static native int getWidth(long arg0) {
    }

    private static native void glTexImage2D(long arg0, int arg1, int arg2) {
    }

    private static native void glTexSubImage2D(long arg0, int arg1, int arg2) {
    }

    int h(@IntRange(from = 0L) int v) {
        synchronized(this) {
            this.O(v);
            return GifInfoHandle.getFrameDuration(this.a, v);
        }
    }

    int i() {
        synchronized(this) {
            return GifInfoHandle.getHeight(this.a);
        }
    }

    private static native void initTexImageDescriptor(long arg0) {
    }

    private static native boolean isAnimationCompleted(long arg0) {
    }

    private static native boolean isOpaque(long arg0) {
    }

    int j() {
        synchronized(this) {
            return GifInfoHandle.getLoopCount(this.a);
        }
    }

    long k() {
        synchronized(this) {
            return GifInfoHandle.getMetadataByteCount(this.a);
        }
    }

    int l() {
        synchronized(this) {
            return GifInfoHandle.getNativeErrorCode(this.a);
        }
    }

    @RequiresApi(21)
    private static int m(FileDescriptor fileDescriptor0, boolean z) throws GifIOException, ErrnoException {
        int v;
        try {
            v = GifInfoHandle.createTempNativeFileDescriptor();
            Os.dup2(fileDescriptor0, v);
        }
        catch(Throwable throwable0) {
            if(z) {
                Os.close(fileDescriptor0);
            }
            throw throwable0;
        }
        if(z) {
            Os.close(fileDescriptor0);
        }
        return v;
    }

    int n() {
        synchronized(this) {
            return GifInfoHandle.getNumberOfFrames(this.a);
        }
    }

    long[] o() {
        synchronized(this) {
            return GifInfoHandle.getSavedState(this.a);
        }
    }

    static native long openByteArray(byte[] arg0) throws GifIOException {
    }

    static native long openDirectByteBuffer(ByteBuffer arg0) throws GifIOException {
    }

    static native long openFile(String arg0) throws GifIOException {
    }

    static native long openNativeFileDescriptor(int arg0, long arg1) throws GifIOException {
    }

    static native long openStream(InputStream arg0) throws GifIOException {
    }

    long p() {
        synchronized(this) {
            return GifInfoHandle.getSourceLength(this.a);
        }
    }

    private static native void postUnbindSurface(long arg0) {
    }

    int q() {
        synchronized(this) {
            return GifInfoHandle.getWidth(this.a);
        }
    }

    void r(int v, int v1) {
        GifInfoHandle.glTexImage2D(this.a, v, v1);
    }

    private static native long renderFrame(long arg0, Bitmap arg1) {
    }

    private static native boolean reset(long arg0) {
    }

    private static native long restoreRemainder(long arg0) {
    }

    private static native int restoreSavedState(long arg0, long[] arg1, Bitmap arg2) {
    }

    void s(int v, int v1) {
        GifInfoHandle.glTexSubImage2D(this.a, v, v1);
    }

    private static native void saveRemainder(long arg0) {
    }

    private static native void seekToFrame(long arg0, int arg1, Bitmap arg2) {
    }

    private static native void seekToFrameGL(long arg0, int arg1) {
    }

    private static native void seekToTime(long arg0, int arg1, Bitmap arg2) {
    }

    private static native void setLoopCount(long arg0, char arg1) {
    }

    private static native void setOptions(long arg0, char arg1, boolean arg2) {
    }

    private static native void setSpeedFactor(long arg0, float arg1) {
    }

    private static native void startDecoderThread(long arg0) {
    }

    private static native void stopDecoderThread(long arg0) {
    }

    void t() {
        GifInfoHandle.initTexImageDescriptor(this.a);
    }

    boolean u() {
        synchronized(this) {
            return GifInfoHandle.isAnimationCompleted(this.a);
        }
    }

    boolean v() {
        synchronized(this) {
            return GifInfoHandle.isOpaque(this.a);
        }
    }

    boolean w() {
        synchronized(this) {
        }
        return this.a == 0L;
    }

    private static long x(FileDescriptor fileDescriptor0, long v, boolean z) throws GifIOException {
        if(Build.VERSION.SDK_INT > 27) {
            try {
                return GifInfoHandle.openNativeFileDescriptor(GifInfoHandle.m(fileDescriptor0, z), v);
            }
            catch(Exception exception0) {
                throw new GifIOException(h.d.b, exception0.getMessage());
            }
        }
        return GifInfoHandle.openNativeFileDescriptor(GifInfoHandle.extractNativeFileDescriptor(fileDescriptor0, z), v);
    }

    static GifInfoHandle y(ContentResolver contentResolver0, Uri uri0) throws IOException {
        if("file".equals(uri0.getScheme())) {
            return new GifInfoHandle(uri0.getPath());
        }
        AssetFileDescriptor assetFileDescriptor0 = contentResolver0.openAssetFileDescriptor(uri0, "r");
        if(assetFileDescriptor0 == null) {
            throw new IOException("Could not open AssetFileDescriptor for " + uri0);
        }
        return new GifInfoHandle(assetFileDescriptor0);
    }

    void z() {
        synchronized(this) {
            GifInfoHandle.postUnbindSurface(this.a);
        }
    }
}

