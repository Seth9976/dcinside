package com.unity3d.services.core.cache;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.unity3d.services.core.api.Request;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.IWebRequestProgressListener;
import com.unity3d.services.core.request.NetworkIOException;
import com.unity3d.services.core.request.WebRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class CacheThreadHandler extends Handler {
    private boolean _active;
    private boolean _canceled;
    private WebRequest _currentRequest;

    CacheThreadHandler() {
        this._currentRequest = null;
        this._canceled = false;
        this._active = false;
    }

    private void downloadFile(String s, String s1, int v, int v1, int v2, HashMap hashMap0, boolean z, CacheEventSender cacheEventSender0) {
        Map map0;
        int v6;
        boolean z1;
        long v5;
        long v4;
        FileOutputStream fileOutputStream2;
        Throwable throwable1;
        FileOutputStream fileOutputStream1;
        if(!this._canceled && s != null && s1 != null) {
            File file0 = new File(s1);
            if(z) {
                DeviceLog.debug(("Unity Ads cache: resuming download " + s + " to " + s1 + " at " + file0.length() + " bytes"));
            }
            else {
                DeviceLog.debug(("Unity Ads cache: start downloading " + s + " to " + s1));
            }
            if(!Device.isActiveNetworkConnected()) {
                DeviceLog.debug("Unity Ads cache: download cancelled, no internet connection available");
                cacheEventSender0.sendEvent(CacheEvent.DOWNLOAD_ERROR, new Object[]{CacheError.NO_INTERNET, s});
                return;
            }
            this._active = true;
            long v3 = SystemClock.elapsedRealtime();
            FileOutputStream fileOutputStream0 = null;
            try {
                fileOutputStream1 = new FileOutputStream(file0, z);
            }
            catch(FileNotFoundException fileNotFoundException0) {
                goto label_66;
            }
            catch(MalformedURLException malformedURLException0) {
                goto label_79;
            }
            catch(IOException iOException0) {
                goto label_92;
            }
            catch(IllegalStateException illegalStateException0) {
                goto label_105;
            }
            catch(NetworkIOException networkIOException0) {
                goto label_118;
            }
            catch(Exception exception0) {
                goto label_131;
            }
            catch(Throwable throwable0) {
                throwable1 = throwable0;
                fileOutputStream2 = null;
                goto label_149;
            }
            try {
                WebRequest webRequest0 = this.getWebRequest(s, v, v1, hashMap0);
                this._currentRequest = webRequest0;
                webRequest0.setProgressListener(new IWebRequestProgressListener() {
                    private long lastProgressEventTime;

                    {
                        CacheEventSender cacheEventSender0 = cacheEventSender0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                        File file0 = file0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                        int v = v2;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                        this.lastProgressEventTime = System.currentTimeMillis();
                    }

                    @Override  // com.unity3d.services.core.request.IWebRequestProgressListener
                    public void onRequestProgress(String s, long v, long v1) {
                        if(v2 > 0 && System.currentTimeMillis() - this.lastProgressEventTime > ((long)v2)) {
                            this.lastProgressEventTime = System.currentTimeMillis();
                            cacheEventSender0.sendEvent(CacheEvent.DOWNLOAD_PROGRESS, new Object[]{s, v, v1});
                        }
                    }

                    @Override  // com.unity3d.services.core.request.IWebRequestProgressListener
                    public void onRequestStart(String s, long v, int v1, Map map0) {
                        Object[] arr_object = {s, file0.length(), ((long)(v + file0.length())), v1, Request.getResponseHeadersMap(map0)};
                        cacheEventSender0.sendEvent(CacheEvent.DOWNLOAD_STARTED, arr_object);
                    }
                });
                v4 = this._currentRequest.makeStreamRequest(fileOutputStream1);
                this._active = false;
                v5 = this._currentRequest.getContentLength();
                z1 = this._currentRequest.isCanceled();
                v6 = this._currentRequest.getResponseCode();
                fileOutputStream2 = fileOutputStream1;
                map0 = this._currentRequest.getResponseHeaders();
                fileOutputStream2 = fileOutputStream1;
                goto label_61;
            }
            catch(FileNotFoundException fileNotFoundException0) {
                fileOutputStream2 = fileOutputStream1;
                goto label_65;
            }
            catch(MalformedURLException malformedURLException0) {
                fileOutputStream2 = fileOutputStream1;
                goto label_78;
            }
            catch(IOException iOException0) {
                fileOutputStream2 = fileOutputStream1;
                goto label_91;
            }
            catch(IllegalStateException illegalStateException0) {
                fileOutputStream2 = fileOutputStream1;
                goto label_104;
            }
            catch(NetworkIOException networkIOException0) {
                fileOutputStream2 = fileOutputStream1;
                goto label_117;
            }
            catch(Exception exception0) {
                fileOutputStream2 = fileOutputStream1;
                goto label_130;
                try {
                label_61:
                    this.postProcessDownload(v3, s, file0, v4, v5, z1, v6, map0, cacheEventSender0);
                    this._currentRequest = null;
                    goto label_157;
                }
                catch(FileNotFoundException fileNotFoundException0) {
                }
                catch(MalformedURLException malformedURLException0) {
                    goto label_78;
                }
                catch(IOException iOException0) {
                    goto label_91;
                }
                catch(IllegalStateException illegalStateException0) {
                    goto label_104;
                }
                catch(NetworkIOException networkIOException0) {
                    goto label_117;
                }
                catch(Exception exception0) {
                    goto label_130;
                }
                catch(Throwable throwable2) {
                    goto label_148;
                }
            label_65:
                fileOutputStream0 = fileOutputStream2;
                try {
                label_66:
                    DeviceLog.exception("Couldn\'t create target file", fileNotFoundException0);
                    this._active = false;
                    cacheEventSender0.sendEvent(CacheEvent.DOWNLOAD_ERROR, new Object[]{CacheError.FILE_IO_ERROR, s, fileNotFoundException0.getMessage()});
                    this._currentRequest = null;
                    if(fileOutputStream0 != null) {
                        goto label_71;
                    }
                    return;
                }
                catch(Throwable throwable2) {
                    fileOutputStream2 = fileOutputStream0;
                    goto label_148;
                }
                try {
                label_71:
                    fileOutputStream0.close();
                }
                catch(Exception exception1) {
                    DeviceLog.exception("Error closing stream", exception1);
                    cacheEventSender0.sendEvent(CacheEvent.DOWNLOAD_ERROR, new Object[]{CacheError.FILE_IO_ERROR, s, exception1.getMessage()});
                }
                return;
            label_78:
                fileOutputStream0 = fileOutputStream2;
                try {
                label_79:
                    DeviceLog.exception("Malformed URL", malformedURLException0);
                    this._active = false;
                    cacheEventSender0.sendEvent(CacheEvent.DOWNLOAD_ERROR, new Object[]{CacheError.MALFORMED_URL, s, malformedURLException0.getMessage()});
                    this._currentRequest = null;
                    if(fileOutputStream0 != null) {
                        goto label_84;
                    }
                    return;
                }
                catch(Throwable throwable2) {
                    fileOutputStream2 = fileOutputStream0;
                    goto label_148;
                }
                try {
                label_84:
                    fileOutputStream0.close();
                }
                catch(Exception exception2) {
                    DeviceLog.exception("Error closing stream", exception2);
                    cacheEventSender0.sendEvent(CacheEvent.DOWNLOAD_ERROR, new Object[]{CacheError.FILE_IO_ERROR, s, exception2.getMessage()});
                }
                return;
            label_91:
                fileOutputStream0 = fileOutputStream2;
                try {
                label_92:
                    DeviceLog.exception("Couldn\'t request stream", iOException0);
                    this._active = false;
                    cacheEventSender0.sendEvent(CacheEvent.DOWNLOAD_ERROR, new Object[]{CacheError.FILE_IO_ERROR, s, iOException0.getMessage()});
                    this._currentRequest = null;
                    if(fileOutputStream0 != null) {
                        goto label_97;
                    }
                    return;
                }
                catch(Throwable throwable2) {
                    fileOutputStream2 = fileOutputStream0;
                    goto label_148;
                }
                try {
                label_97:
                    fileOutputStream0.close();
                }
                catch(Exception exception3) {
                    DeviceLog.exception("Error closing stream", exception3);
                    cacheEventSender0.sendEvent(CacheEvent.DOWNLOAD_ERROR, new Object[]{CacheError.FILE_IO_ERROR, s, exception3.getMessage()});
                }
                return;
            label_104:
                fileOutputStream0 = fileOutputStream2;
                try {
                label_105:
                    DeviceLog.exception("Illegal state", illegalStateException0);
                    this._active = false;
                    cacheEventSender0.sendEvent(CacheEvent.DOWNLOAD_ERROR, new Object[]{CacheError.ILLEGAL_STATE, s, illegalStateException0.getMessage()});
                    this._currentRequest = null;
                    if(fileOutputStream0 != null) {
                        goto label_110;
                    }
                    return;
                }
                catch(Throwable throwable2) {
                    fileOutputStream2 = fileOutputStream0;
                    goto label_148;
                }
                try {
                label_110:
                    fileOutputStream0.close();
                }
                catch(Exception exception4) {
                    DeviceLog.exception("Error closing stream", exception4);
                    cacheEventSender0.sendEvent(CacheEvent.DOWNLOAD_ERROR, new Object[]{CacheError.FILE_IO_ERROR, s, exception4.getMessage()});
                }
                return;
            label_117:
                fileOutputStream0 = fileOutputStream2;
                try {
                label_118:
                    DeviceLog.exception("Network error", networkIOException0);
                    this._active = false;
                    cacheEventSender0.sendEvent(CacheEvent.DOWNLOAD_ERROR, new Object[]{CacheError.NETWORK_ERROR, s, networkIOException0.getMessage()});
                    this._currentRequest = null;
                    if(fileOutputStream0 != null) {
                        goto label_123;
                    }
                    return;
                }
                catch(Throwable throwable2) {
                    fileOutputStream2 = fileOutputStream0;
                    goto label_148;
                }
                try {
                label_123:
                    fileOutputStream0.close();
                }
                catch(Exception exception5) {
                    DeviceLog.exception("Error closing stream", exception5);
                    cacheEventSender0.sendEvent(CacheEvent.DOWNLOAD_ERROR, new Object[]{CacheError.FILE_IO_ERROR, s, exception5.getMessage()});
                }
                return;
            label_130:
                fileOutputStream0 = fileOutputStream2;
                try {
                label_131:
                    DeviceLog.exception("Unknown error", exception0);
                    this._active = false;
                    cacheEventSender0.sendEvent(CacheEvent.DOWNLOAD_ERROR, new Object[]{CacheError.UNKNOWN_ERROR, s, exception0.getMessage()});
                    this._currentRequest = null;
                }
                catch(Throwable throwable2) {
                    fileOutputStream2 = fileOutputStream0;
                    goto label_148;
                }
                if(fileOutputStream0 != null) {
                    try {
                        fileOutputStream0.close();
                    }
                    catch(Exception exception6) {
                        DeviceLog.exception("Error closing stream", exception6);
                        cacheEventSender0.sendEvent(CacheEvent.DOWNLOAD_ERROR, new Object[]{CacheError.FILE_IO_ERROR, s, exception6.getMessage()});
                    }
                    return;
                }
                return;
            }
            catch(Throwable throwable2) {
            }
        label_148:
            throwable1 = throwable2;
        label_149:
            this._currentRequest = null;
            if(fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                }
                catch(Exception exception7) {
                    DeviceLog.exception("Error closing stream", exception7);
                    cacheEventSender0.sendEvent(CacheEvent.DOWNLOAD_ERROR, new Object[]{CacheError.FILE_IO_ERROR, s, exception7.getMessage()});
                }
            }
            throw throwable1;
            try {
            label_157:
                fileOutputStream2.close();
            }
            catch(Exception exception8) {
                DeviceLog.exception("Error closing stream", exception8);
                cacheEventSender0.sendEvent(CacheEvent.DOWNLOAD_ERROR, new Object[]{CacheError.FILE_IO_ERROR, s, exception8.getMessage()});
            }
        }
    }

    private WebRequest getWebRequest(String s, int v, int v1, HashMap hashMap0) throws MalformedURLException {
        HashMap hashMap1 = new HashMap();
        if(hashMap0 != null) {
            hashMap1.putAll(hashMap0);
        }
        return new WebRequest(s, "GET", hashMap1, v, v1);
    }

    @Override  // android.os.Handler
    public void handleMessage(Message message0) {
        HashMap hashMap1;
        Bundle bundle0 = message0.getData();
        String s = bundle0.getString("source");
        bundle0.remove("source");
        String s1 = bundle0.getString("target");
        bundle0.remove("target");
        int v = bundle0.getInt("connectTimeout");
        bundle0.remove("connectTimeout");
        int v1 = bundle0.getInt("readTimeout");
        bundle0.remove("readTimeout");
        int v2 = bundle0.getInt("progressInterval");
        bundle0.remove("progressInterval");
        boolean z = bundle0.getBoolean("append", false);
        bundle0.remove("append");
        Serializable serializable0 = bundle0.getSerializable("cacheEventSender");
        bundle0.remove("cacheEventSender");
        if(bundle0.size() > 0) {
            DeviceLog.debug("There are headers left in data, reading them");
            HashMap hashMap0 = new HashMap();
            for(Object object0: bundle0.keySet()) {
                hashMap0.put(((String)object0), Arrays.asList(bundle0.getStringArray(((String)object0))));
            }
            hashMap1 = hashMap0;
        }
        else {
            hashMap1 = null;
        }
        File file0 = new File(s1);
        if(z && !file0.exists() || !z && file0.exists()) {
            this._active = false;
            Boolean boolean0 = Boolean.valueOf(file0.exists());
            ((CacheEventSender)serializable0).sendEvent(CacheEvent.DOWNLOAD_ERROR, new Object[]{CacheError.FILE_STATE_WRONG, s, s1, Boolean.valueOf(z), boolean0});
            return;
        }
        if(message0.what == 1) {
            this.downloadFile(s, s1, v, v1, v2, hashMap1, z, ((CacheEventSender)serializable0));
        }
    }

    public boolean isActive() {
        return this._active;
    }

    private void postProcessDownload(long v, String s, File file0, long v1, long v2, boolean z, int v3, Map map0, CacheEventSender cacheEventSender0) {
        long v4 = SystemClock.elapsedRealtime() - v;
        if(!file0.setReadable(true, false)) {
            DeviceLog.debug("Unity Ads cache: could not set file readable!");
        }
        if(!z) {
            DeviceLog.debug(("Unity Ads cache: File " + file0.getName() + " of " + v1 + " bytes downloaded in " + v4 + "ms"));
            Object[] arr_object = {s, v1, v2, v4, v3, Request.getResponseHeadersMap(map0)};
            cacheEventSender0.sendEvent(CacheEvent.DOWNLOAD_END, arr_object);
            return;
        }
        DeviceLog.debug(("Unity Ads cache: downloading of " + s + " stopped"));
        Object[] arr_object1 = {s, v1, v2, v4, v3, Request.getResponseHeadersMap(map0)};
        cacheEventSender0.sendEvent(CacheEvent.DOWNLOAD_STOPPED, arr_object1);
    }

    public void setCancelStatus(boolean z) {
        this._canceled = z;
        if(z) {
            WebRequest webRequest0 = this._currentRequest;
            if(webRequest0 != null) {
                this._active = false;
                webRequest0.cancel();
            }
        }
    }
}

