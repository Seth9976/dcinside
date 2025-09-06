package com.unity3d.services.core.cache;

import android.content.Context;
import android.os.Environment;
import com.unity3d.services.core.log.DeviceLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import jeb.synthetic.TWR;

public class CacheDirectory {
    private static final String TEST_FILE_NAME = "UnityAdsTest.txt";
    private String _cacheDirName;
    private File _cacheDirectory;
    private boolean _initialized;
    private final boolean _preferExternalStorage;
    private CacheDirectoryType _type;

    public CacheDirectory(String s) {
        this._initialized = false;
        this._cacheDirectory = null;
        this._type = null;
        this._cacheDirName = s;
        this._preferExternalStorage = true;
    }

    public CacheDirectory(String s, boolean z) {
        this._initialized = false;
        this._cacheDirectory = null;
        this._type = null;
        this._preferExternalStorage = z;
        this._cacheDirName = s;
    }

    public File createCacheDirectory(File file0, String s) {
        if(file0 == null) {
            return null;
        }
        File file1 = new File(file0, s);
        file1.mkdirs();
        return file1.isDirectory() ? file1 : null;
    }

    private void createNoMediaFile(File file0) {
        File file1 = new File(file0, ".nomedia");
        try {
            if(file1.createNewFile()) {
                DeviceLog.debug("Successfully created .nomedia file");
                return;
            }
            DeviceLog.debug("Using existing .nomedia file");
            return;
        }
        catch(Exception exception0) {
        }
        DeviceLog.exception("Failed to create .nomedia file", exception0);
    }

    public File getCacheDirectory(Context context0) {
        File file0;
        synchronized(this) {
            if(context0 == null) {
                return null;
            }
            if(this._initialized) {
                return this._cacheDirectory;
            }
            this._initialized = true;
            if(this._preferExternalStorage) {
                if("mounted".equals(Environment.getExternalStorageState())) {
                    try {
                        file0 = this.createCacheDirectory(context0.getExternalCacheDir(), this._cacheDirName);
                    }
                    catch(Exception exception0) {
                        DeviceLog.exception("Creating external cache directory failed", exception0);
                        return null;
                    }
                    if(this.testCacheDirectory(file0)) {
                        this.createNoMediaFile(file0);
                        this._cacheDirectory = file0;
                        this._type = CacheDirectoryType.EXTERNAL;
                        DeviceLog.debug(("Unity Ads is using external cache directory: " + file0.getAbsolutePath()));
                        return this._cacheDirectory;
                    }
                }
                else {
                    DeviceLog.debug("External media not mounted");
                }
            }
            File file1 = this.createCacheDirectory(context0.getNoBackupFilesDir(), this._cacheDirName);
            if(this.testCacheDirectory(file1)) {
                this._cacheDirectory = file1;
                this._type = CacheDirectoryType.INTERNAL;
                DeviceLog.debug(("Unity Ads is using internal cache directory: " + file1.getAbsolutePath()));
                return this._cacheDirectory;
            }
            DeviceLog.error("Unity Ads failed to initialize cache directory");
            return null;
        }
    }

    public CacheDirectoryType getType() {
        return this._type;
    }

    public boolean testCacheDirectory(File file0) {
        FileInputStream fileInputStream0;
        FileOutputStream fileOutputStream0;
        File file1;
        byte[] arr_b1;
        byte[] arr_b;
        if(file0 != null && file0.isDirectory()) {
            try {
                arr_b = "test".getBytes("UTF-8");
                arr_b1 = new byte[arr_b.length];
                file1 = new File(file0, "UnityAdsTest.txt");
                fileOutputStream0 = new FileOutputStream(file1);
            }
            catch(Exception exception0) {
                goto label_30;
            }
            try {
                fileOutputStream0.write(arr_b);
                fileOutputStream0.flush();
                goto label_11;
            }
            catch(Throwable throwable0) {
                try {
                    TWR.safeClose$NT(fileOutputStream0, throwable0);
                    throw throwable0;
                label_11:
                    fileOutputStream0.close();
                    fileInputStream0 = new FileInputStream(file1);
                }
                catch(Exception exception0) {
                    goto label_30;
                }
            }
            try {
                int v = fileInputStream0.read(arr_b1, 0, arr_b.length);
                goto label_18;
            }
            catch(Throwable throwable1) {
                try {
                    TWR.safeClose$NT(fileInputStream0, throwable1);
                    throw throwable1;
                label_18:
                    fileInputStream0.close();
                    if(!file1.delete()) {
                        DeviceLog.debug(("Failed to delete testfile " + file1.getAbsoluteFile()));
                        return false;
                    }
                    if(v != arr_b.length) {
                        DeviceLog.debug("Read buffer size mismatch");
                        return false;
                    }
                    if(new String(arr_b1, "UTF-8").equals("test")) {
                        return true;
                    }
                    DeviceLog.debug("Read buffer content mismatch");
                    return false;
                }
                catch(Exception exception0) {
                }
            }
        label_30:
            DeviceLog.debug(("Unity Ads exception while testing cache directory " + file0.getAbsolutePath() + ": " + exception0.getMessage()));
        }
        return false;
    }
}

