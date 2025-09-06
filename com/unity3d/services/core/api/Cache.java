package com.unity3d.services.core.api;

import android.annotation.TargetApi;
import android.media.MediaMetadataRetriever;
import android.util.Base64;
import android.util.SparseArray;
import com.unity3d.services.core.cache.CacheDirectory;
import com.unity3d.services.core.cache.CacheDirectoryType;
import com.unity3d.services.core.cache.CacheError;
import com.unity3d.services.core.cache.CacheThread;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.WebRequestError;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Cache {
    @WebViewExposed
    public static void deleteFile(String s, WebViewCallback webViewCallback0) {
        if(new File(Cache.fileIdToFilename(s)).delete()) {
            webViewCallback0.invoke(new Object[0]);
            return;
        }
        webViewCallback0.error(CacheError.FILE_IO_ERROR, new Object[0]);
    }

    @WebViewExposed
    public static void download(String s, String s1, JSONArray jSONArray0, Boolean boolean0, WebViewCallback webViewCallback0) {
        HashMap hashMap0;
        if(!Device.isActiveNetworkConnected()) {
            webViewCallback0.error(CacheError.NO_INTERNET, new Object[0]);
            return;
        }
        try {
            hashMap0 = Request.getHeadersMap(jSONArray0);
        }
        catch(Exception exception0) {
            DeviceLog.exception("Error mapping headers for the request", exception0);
            webViewCallback0.error(WebRequestError.MAPPING_HEADERS_FAILED, new Object[]{s, s1});
            return;
        }
        CacheThread.download(s, Cache.fileIdToFilename(s1), hashMap0, boolean0.booleanValue(), SharedInstances.INSTANCE.getWebViewEventSender());
        webViewCallback0.invoke(new Object[0]);
    }

    private static String fileIdToFilename(String s) {
        return SdkProperties.getCacheDirectory() == null ? "" : SdkProperties.getCacheDirectory() + "/" + "UnityAdsCache-" + s;
    }

    @WebViewExposed
    public static void getCacheDirectoryExists(WebViewCallback webViewCallback0) {
        File file0 = SdkProperties.getCacheDirectory();
        if(file0 == null) {
            webViewCallback0.error(CacheError.CACHE_DIRECTORY_NULL, new Object[0]);
            return;
        }
        webViewCallback0.invoke(new Object[]{Boolean.valueOf(file0.exists())});
    }

    @WebViewExposed
    public static void getCacheDirectoryType(WebViewCallback webViewCallback0) {
        CacheDirectory cacheDirectory0 = SdkProperties.getCacheDirectoryObject();
        if(cacheDirectory0 != null && cacheDirectory0.getCacheDirectory(ClientProperties.getApplicationContext()) != null) {
            if(!cacheDirectory0.getCacheDirectory(ClientProperties.getApplicationContext()).exists()) {
                webViewCallback0.error(CacheError.CACHE_DIRECTORY_DOESNT_EXIST, new Object[0]);
                return;
            }
            CacheDirectoryType cacheDirectoryType0 = cacheDirectory0.getType();
            if(cacheDirectoryType0 == null) {
                webViewCallback0.error(CacheError.CACHE_DIRECTORY_TYPE_NULL, new Object[0]);
                return;
            }
            webViewCallback0.invoke(new Object[]{cacheDirectoryType0.name()});
            return;
        }
        webViewCallback0.error(CacheError.CACHE_DIRECTORY_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void getFileContent(String s, String s1, WebViewCallback webViewCallback0) {
        String s3;
        byte[] arr_b;
        String s2 = Cache.fileIdToFilename(s);
        File file0 = new File(s2);
        if(!file0.exists()) {
            webViewCallback0.error(CacheError.FILE_NOT_FOUND, new Object[]{s, s2});
            return;
        }
        try {
            arr_b = Utilities.readFileBytes(file0);
        }
        catch(IOException iOException0) {
            webViewCallback0.error(CacheError.FILE_IO_ERROR, new Object[]{s, s2, iOException0.getMessage() + ", " + iOException0.getClass().getName()});
            return;
        }
        if(s1 == null) {
            webViewCallback0.error(CacheError.UNSUPPORTED_ENCODING, new Object[]{s, s2, null});
            return;
        }
        boolean z = false;
        if(s1.equals("UTF-8")) {
            z = true;
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
            s3 = Charset.forName("UTF-8").decode(byteBuffer0).toString();
        }
        else if(s1.equals("Base64")) {
            z = true;
            s3 = Base64.encodeToString(arr_b, 2);
        }
        if(z) {
            webViewCallback0.invoke(new Object[]{s3});
            return;
        }
        webViewCallback0.error(CacheError.UNSUPPORTED_ENCODING, new Object[]{s, s2, s1});
    }

    @WebViewExposed
    public static void getFileInfo(String s, WebViewCallback webViewCallback0) {
        try {
            webViewCallback0.invoke(new Object[]{Cache.getFileJson(s)});
        }
        catch(JSONException jSONException0) {
            DeviceLog.exception("Error creating JSON", jSONException0);
            webViewCallback0.error(CacheError.JSON_ERROR, new Object[0]);
        }
    }

    private static JSONObject getFileJson(String s) throws JSONException {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("id", s);
        File file0 = new File(Cache.fileIdToFilename(s));
        if(file0.exists()) {
            jSONObject0.put("found", true);
            jSONObject0.put("size", file0.length());
            jSONObject0.put("mtime", file0.lastModified());
            return jSONObject0;
        }
        jSONObject0.put("found", false);
        return jSONObject0;
    }

    @WebViewExposed
    public static void getFilePath(String s, WebViewCallback webViewCallback0) {
        if(new File(Cache.fileIdToFilename(s)).exists()) {
            webViewCallback0.invoke(new Object[]{Cache.fileIdToFilename(s)});
            return;
        }
        webViewCallback0.error(CacheError.FILE_NOT_FOUND, new Object[0]);
    }

    @WebViewExposed
    public static void getFiles(WebViewCallback webViewCallback0) {
        File file0 = SdkProperties.getCacheDirectory();
        if(file0 == null) {
            return;
        }
        DeviceLog.debug("Unity Ads cache: checking app directory for Unity Ads cached files");
        File[] arr_file = file0.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File file0, String s) {
                return s.startsWith("UnityAdsCache-");
            }
        });
        if(arr_file == null || arr_file.length == 0) {
            webViewCallback0.invoke(new Object[]{new JSONArray()});
        }
        try {
            JSONArray jSONArray0 = new JSONArray();
            for(int v = 0; v < arr_file.length; ++v) {
                File file1 = arr_file[v];
                String s = file1.getName().substring(14);
                DeviceLog.debug(("Unity Ads cache: found " + s + ", " + file1.length() + " bytes"));
                jSONArray0.put(Cache.getFileJson(s));
            }
            webViewCallback0.invoke(new Object[]{jSONArray0});
            return;
        }
        catch(JSONException jSONException0) {
        }
        DeviceLog.exception("Error creating JSON", jSONException0);
        webViewCallback0.error(CacheError.JSON_ERROR, new Object[0]);
    }

    @WebViewExposed
    public static void getFreeSpace(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getFreeSpace(SdkProperties.getCacheDirectory())});
    }

    @WebViewExposed
    public static void getHash(String s, WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Utilities.Sha256(s)});
    }

    @TargetApi(10)
    private static SparseArray getMetaData(String s, JSONArray jSONArray0) throws JSONException, IOException, RuntimeException {
        File file0 = new File(s);
        SparseArray sparseArray0 = new SparseArray();
        if(!file0.exists()) {
            throw new IOException("File: " + file0.getAbsolutePath() + " doesn\'t exist");
        }
        MediaMetadataRetriever mediaMetadataRetriever0 = new MediaMetadataRetriever();
        mediaMetadataRetriever0.setDataSource(file0.getAbsolutePath());
        for(int v = 0; v < jSONArray0.length(); ++v) {
            int v1 = jSONArray0.getInt(v);
            String s1 = mediaMetadataRetriever0.extractMetadata(v1);
            if(s1 != null) {
                sparseArray0.put(v1, s1);
            }
        }
        return sparseArray0;
    }

    @WebViewExposed
    public static void getMetaData(String s, JSONArray jSONArray0, WebViewCallback webViewCallback0) {
        SparseArray sparseArray0;
        String s1 = Cache.fileIdToFilename(s);
        try {
            sparseArray0 = Cache.getMetaData(s1, jSONArray0);
        }
        catch(JSONException jSONException0) {
            webViewCallback0.error(CacheError.JSON_ERROR, new Object[]{jSONException0.getMessage()});
            return;
        }
        catch(RuntimeException runtimeException0) {
            webViewCallback0.error(CacheError.INVALID_ARGUMENT, new Object[]{runtimeException0.getMessage()});
            return;
        }
        catch(IOException iOException0) {
            webViewCallback0.error(CacheError.FILE_IO_ERROR, new Object[]{iOException0.getMessage()});
            return;
        }
        JSONArray jSONArray1 = new JSONArray();
        for(int v = 0; v < sparseArray0.size(); ++v) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(sparseArray0.keyAt(v));
            jSONArray2.put(sparseArray0.valueAt(v));
            jSONArray1.put(jSONArray2);
        }
        webViewCallback0.invoke(new Object[]{jSONArray1});
    }

    @WebViewExposed
    public static void getProgressInterval(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{0});
    }

    // 去混淆评级： 低(20)
    @WebViewExposed
    public static void getTimeouts(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{30000, 30000});
    }

    @WebViewExposed
    public static void getTotalSpace(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getTotalSpace(SdkProperties.getCacheDirectory())});
    }

    @WebViewExposed
    public static void isCaching(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Boolean.FALSE});
    }

    @WebViewExposed
    public static void recreateCacheDirectory(WebViewCallback webViewCallback0) {
        if(SdkProperties.getCacheDirectory().exists()) {
            webViewCallback0.error(CacheError.CACHE_DIRECTORY_EXISTS, new Object[0]);
            return;
        }
        SdkProperties.setCacheDirectory(null);
        if(SdkProperties.getCacheDirectory() == null) {
            webViewCallback0.error(CacheError.CACHE_DIRECTORY_NULL, new Object[0]);
            return;
        }
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void setFileContent(String s, String s1, String s2, WebViewCallback webViewCallback0) {
        FileOutputStream fileOutputStream0;
        byte[] arr_b;
        String s3 = Cache.fileIdToFilename(s);
        try {
            arr_b = s2.getBytes("UTF-8");
        }
        catch(UnsupportedEncodingException unused_ex) {
            webViewCallback0.error(CacheError.UNSUPPORTED_ENCODING, new Object[]{s, s3, s1});
            return;
        }
        if(s1 != null && s1.length() > 0) {
            if(s1.equals("Base64")) {
                arr_b = Base64.decode(s2, 2);
            }
            else if(!s1.equals("UTF-8")) {
                webViewCallback0.error(CacheError.UNSUPPORTED_ENCODING, new Object[]{s, s3, s1});
                return;
            }
        }
        try {
            try {
                fileOutputStream0 = null;
                fileOutputStream0 = new FileOutputStream(s3);
                fileOutputStream0.write(arr_b);
                fileOutputStream0.flush();
                goto label_36;
            }
            catch(FileNotFoundException unused_ex) {
            }
            catch(IOException unused_ex) {
                goto label_21;
            }
            webViewCallback0.error(CacheError.FILE_NOT_FOUND, new Object[]{s, s3, s1});
            if(fileOutputStream0 != null) {
                goto label_19;
            }
            return;
        }
        catch(Throwable throwable0) {
            goto label_30;
        }
        try {
        label_19:
            fileOutputStream0.close();
        }
        catch(Exception exception0) {
            DeviceLog.exception("Error closing FileOutputStream", exception0);
        }
        return;
        try {
        label_21:
            webViewCallback0.error(CacheError.FILE_IO_ERROR, new Object[]{s, s3, s1});
            if(fileOutputStream0 != null) {
                goto label_23;
            }
            return;
        }
        catch(Throwable throwable0) {
            goto label_30;
        }
        try {
        label_23:
            fileOutputStream0.close();
        }
        catch(Exception exception0) {
            DeviceLog.exception("Error closing FileOutputStream", exception0);
        }
        return;
    label_30:
        if(fileOutputStream0 != null) {
            try {
                fileOutputStream0.close();
            }
            catch(Exception exception1) {
                DeviceLog.exception("Error closing FileOutputStream", exception1);
            }
        }
        throw throwable0;
        try {
        label_36:
            fileOutputStream0.close();
        }
        catch(Exception exception2) {
            DeviceLog.exception("Error closing FileOutputStream", exception2);
        }
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void setProgressInterval(Integer integer0, WebViewCallback webViewCallback0) {
        CacheThread.setProgressInterval(((int)integer0));
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void setTimeouts(Integer integer0, Integer integer1, WebViewCallback webViewCallback0) {
        CacheThread.setConnectTimeout(((int)integer0));
        CacheThread.setReadTimeout(((int)integer1));
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void stop(WebViewCallback webViewCallback0) {
        webViewCallback0.error(CacheError.NOT_CACHING, new Object[0]);
    }
}

