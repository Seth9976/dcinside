package com.bytedance.sdk.component.pglcrypt;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public class PglCryptUtils {
    public static final int BASE64_FAILED = 504;
    public static final int COMPRESS_FAILED = 503;
    public static final int CRYPT_OK = 0;
    public static final int CYPHER_VERSION = 4;
    public static final int DECRYPT_FAILED = 506;
    public static final int ENCRYPT_FAILED = 505;
    public static final int INPUT_INVALID = 502;
    public static final String KEY_CYPHER = "cypher";
    public static final String KEY_MESSAGE = "message";
    public static final int LOAD_SO_FAILED = 501;
    private static volatile PglCryptUtils PjT = null;
    public static final int UNKNOWN_ERR = 507;
    private static volatile boolean Zh = true;

    static {
    }

    private static String PjT(byte[] arr_b) {
        Throwable throwable1;
        GZIPInputStream gZIPInputStream0;
        String s1;
        Exception exception1;
        ByteArrayOutputStream byteArrayOutputStream0;
        ByteArrayInputStream byteArrayInputStream0;
        String s = null;
        if(arr_b != null && arr_b.length != 0) {
            try {
                byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
                byteArrayOutputStream0 = null;
                byteArrayOutputStream0 = new ByteArrayOutputStream();
            }
            catch(Exception exception0) {
                exception1 = exception0;
                s1 = null;
                goto label_35;
            }
            catch(Throwable throwable0) {
                gZIPInputStream0 = null;
                throwable1 = throwable0;
                byteArrayOutputStream0 = null;
                goto label_49;
            }
            try {
                gZIPInputStream0 = new GZIPInputStream(byteArrayInputStream0);
                goto label_21;
            }
            catch(Exception exception2) {
                exception1 = exception2;
                s1 = null;
                goto label_35;
                try {
                label_21:
                    byte[] arr_b1 = new byte[0x400];
                    int v;
                    while((v = gZIPInputStream0.read(arr_b1)) != -1) {
                        byteArrayOutputStream0.write(arr_b1, 0, v);
                    }
                    s = byteArrayOutputStream0.toString("utf-8");
                    byteArrayInputStream0.close();
                    goto label_57;
                }
                catch(Exception exception3) {
                    s1 = s;
                    s = gZIPInputStream0;
                    exception1 = exception3;
                }
                catch(Throwable throwable1) {
                    goto label_49;
                }
                try {
                label_35:
                    Log.e("ARMOR", exception1.toString());
                    goto label_41;
                }
                catch(Throwable throwable2) {
                }
                gZIPInputStream0 = s;
                throwable1 = throwable2;
                goto label_49;
            }
            catch(Throwable throwable2) {
                gZIPInputStream0 = s;
                throwable1 = throwable2;
                goto label_49;
            }
        label_41:
            if(s == null) {
                goto label_43;
            }
            else {
                try {
                    ((GZIPInputStream)s).close();
                label_43:
                    if(byteArrayOutputStream0 != null) {
                        byteArrayOutputStream0.close();
                        return s1;
                    }
                    return s1;
                }
                catch(Exception exception4) {
                }
            }
            Log.e("ARMOR", exception4.toString());
            return s1;
            try {
            label_49:
                if(gZIPInputStream0 != null) {
                    gZIPInputStream0.close();
                }
                if(byteArrayOutputStream0 != null) {
                    byteArrayOutputStream0.close();
                }
            }
            catch(Exception exception5) {
                Log.e("ARMOR", exception5.toString());
            }
            throw throwable1;
            try {
            label_57:
                gZIPInputStream0.close();
                byteArrayOutputStream0.close();
            }
            catch(Exception exception6) {
                Log.e("ARMOR", exception6.toString());
            }
            return s;
        }
        return null;
    }

    private static byte[] PjT(String s) {
        GZIPOutputStream gZIPOutputStream0;
        ByteArrayOutputStream byteArrayOutputStream0;
        byte[] arr_b = null;
        if(s != null && s.length() != 0) {
            try {
                byteArrayOutputStream0 = null;
                byteArrayOutputStream0 = new ByteArrayOutputStream();
                gZIPOutputStream0 = null;
                gZIPOutputStream0 = new GZIPOutputStream(byteArrayOutputStream0);
            }
            catch(Exception exception0) {
                gZIPOutputStream0 = null;
                goto label_16;
            }
            catch(Throwable throwable0) {
                goto label_25;
            }
            try {
                gZIPOutputStream0.write(s.getBytes("utf-8"));
                goto label_34;
            }
            catch(Exception exception0) {
                try {
                label_16:
                    Log.e("ARMOR", exception0.toString());
                    if(gZIPOutputStream0 != null) {
                        goto label_18;
                    }
                    goto label_19;
                }
                catch(Throwable throwable0) {
                    goto label_24;
                }
                try {
                label_18:
                    gZIPOutputStream0.close();
                label_19:
                    if(byteArrayOutputStream0 != null) {
                        arr_b = byteArrayOutputStream0.toByteArray();
                        byteArrayOutputStream0.close();
                    }
                }
                catch(Exception exception1) {
                    Log.e("ARMOR", exception1.toString());
                }
                return arr_b;
            }
            catch(Throwable throwable0) {
            label_24:
                arr_b = gZIPOutputStream0;
            }
            try {
            label_25:
                if(arr_b != null) {
                    ((OutputStream)arr_b).close();
                }
                if(byteArrayOutputStream0 != null) {
                    byteArrayOutputStream0.toByteArray();
                    byteArrayOutputStream0.close();
                }
            }
            catch(Exception exception2) {
                Log.e("ARMOR", exception2.toString());
            }
            throw throwable0;
            try {
            label_34:
                gZIPOutputStream0.close();
                arr_b = byteArrayOutputStream0.toByteArray();
                byteArrayOutputStream0.close();
            }
            catch(Exception exception1) {
                Log.e("ARMOR", exception1.toString());
            }
            return arr_b;
        }
        return null;
    }

    public static native byte[] bc(int arg0, byte[] arg1) {
    }

    public Pair cypher4Decrypt(String s) {
        byte[] arr_b1;
        if(!PglCryptUtils.Zh) {
            return new Pair(501, null);
        }
        if(s != null && s.length() != 0) {
            byte[] arr_b = Base64.decode(s, 0);
            if(arr_b != null && arr_b.length != 0) {
                try {
                    arr_b1 = PglCryptUtils.bc(0x3F3, arr_b);
                }
                catch(Throwable throwable0) {
                    Log.e("ARMOR", throwable0.toString());
                    arr_b1 = null;
                }
                if(arr_b1 != null && arr_b1.length != 0) {
                    String s1 = PglCryptUtils.PjT(arr_b1);
                    return TextUtils.isEmpty(s1) ? new Pair(503, null) : new Pair(0, s1);
                }
                return new Pair(506, null);
            }
            return new Pair(504, null);
        }
        return new Pair(502, null);
    }

    public Pair cypher4Encrypt(JSONObject jSONObject0) throws JSONException {
        Pair pair0 = this.cypher4EncryptWithNoWrapBase64(jSONObject0.toString());
        if(pair0 == null) {
            return new Pair(507, null);
        }
        if(((int)(((Integer)pair0.first))) == 0) {
            JSONObject jSONObject1 = new JSONObject();
            String s = (String)pair0.second;
            if(TextUtils.isEmpty(s)) {
                return new Pair(504, null);
            }
            jSONObject1.put("message", s);
            jSONObject1.put("cypher", 4);
            return new Pair(0, jSONObject1);
        }
        return new Pair(pair0.first, null);
    }

    public Pair cypher4Encrypt(byte[] arr_b) {
        if(!PglCryptUtils.Zh) {
            return new Pair(501, null);
        }
        if(arr_b != null && arr_b.length != 0) {
            try {
                byte[] arr_b1 = PglCryptUtils.bc(1010, arr_b);
                return arr_b1 == null || arr_b1.length == 0 ? new Pair(505, null) : new Pair(0, arr_b1);
            }
            catch(Throwable throwable0) {
                Log.e("ARMOR", throwable0.toString());
                throw new NullPointerException();
            }
        }
        return new Pair(502, null);
    }

    public Pair cypher4EncryptWithNoWrapBase64(String s) {
        if(!PglCryptUtils.Zh) {
            return new Pair(501, null);
        }
        if(TextUtils.isEmpty(s)) {
            return new Pair(502, null);
        }
        byte[] arr_b = PglCryptUtils.PjT(s);
        if(arr_b != null && arr_b.length != 0) {
            Pair pair0 = this.cypher4Encrypt(arr_b);
            if(pair0 == null) {
                return new Pair(507, null);
            }
            if(((int)(((Integer)pair0.first))) == 0) {
                String s1 = Base64.encodeToString(((byte[])pair0.second), 2);
                return TextUtils.isEmpty(s1) ? new Pair(504, null) : new Pair(0, s1);
            }
            return new Pair(pair0.first, null);
        }
        return new Pair(503, null);
    }

    public static PglCryptUtils getInstance() {
        if(PglCryptUtils.PjT == null) {
            Class class0 = PglCryptUtils.class;
            __monitor_enter(class0);
            try {
                if(PglCryptUtils.PjT == null) {
                    System.loadLibrary("pglarmor");
                    goto label_7;
                }
                goto label_8;
            }
            catch(Throwable unused_ex) {
                try {
                    PglCryptUtils.Zh = false;
                label_7:
                    PglCryptUtils.PjT = new PglCryptUtils();
                label_8:
                    __monitor_exit(class0);
                    return PglCryptUtils.PjT;
                }
                catch(Throwable throwable0) {
                }
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return PglCryptUtils.PjT;
    }
}

