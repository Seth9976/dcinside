package com.gomfactory.adpie.sdk.network;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.gomfactory.adpie.sdk.AdPieSDK;
import com.gomfactory.adpie.sdk.util.AdPieLog;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public class NetworkService implements Runnable {
    public static final String TAG = "NetworkService";
    private boolean isSuccessOpenConnection;
    private String mEncodedParam;
    private Handler mHandler;
    private String mMethod;
    private String mRequestUrl;
    private int responseCode;
    private Thread thread;
    private Thread timerThread;

    static {
    }

    public NetworkService(String s, String s1, Handler handler0, String s2) {
        this.thread = null;
        this.timerThread = null;
        this.mRequestUrl = null;
        this.mMethod = null;
        this.mEncodedParam = null;
        this.mHandler = null;
        this.responseCode = -1;
        this.isSuccessOpenConnection = false;
        if(TextUtils.isEmpty(s2)) {
            this.mRequestUrl = null;
        }
        else if(s2.equalsIgnoreCase("GET")) {
            this.mRequestUrl = this.appendParameter(s, s1);
        }
        else if(s2.equalsIgnoreCase("POST")) {
            this.mRequestUrl = s;
            this.mEncodedParam = s1;
        }
        this.mMethod = s2;
        this.mHandler = handler0;
    }

    private String appendParameter(String s, String s1) {
        if(TextUtils.isEmpty(s1)) {
            return s;
        }
        StringBuilder stringBuilder0 = new StringBuilder(s);
        if(s.indexOf(58) + 2 == s.lastIndexOf(0x2F)) {
            stringBuilder0.append('/');
        }
        int v = s.indexOf(0x3F);
        int v1 = stringBuilder0.length();
        if(v == -1) {
            stringBuilder0.append('?');
        }
        else if(v < v1 - 1 && s.charAt(v1 - 1) != 38) {
            stringBuilder0.append('&');
        }
        stringBuilder0.append(s1);
        return stringBuilder0.toString();
    }

    public void gotFailureMessage() {
        try {
            Handler handler0 = this.mHandler;
            if(handler0 != null) {
                handler0.sendMessage(Message.obtain(handler0, -1));
            }
            this.mHandler = null;
            return;
        }
        catch(Exception exception0) {
        }
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.e("NetworkService", exception0);
        }
    }

    public void gotSuccessMessage(String s) {
        try {
            Handler handler0 = this.mHandler;
            if(handler0 != null) {
                handler0.sendMessage(Message.obtain(handler0, 200, s));
            }
            this.mHandler = null;
            return;
        }
        catch(Exception exception0) {
        }
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.e("NetworkService", exception0);
        }
    }

    public void process() {
        if(TextUtils.isEmpty(this.mMethod)) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.e("NetworkService", new Exception("Undefined http method."));
            }
            this.gotFailureMessage();
            NetworkServiceManager.getInstance().didComplete(this);
            return;
        }
        if(!this.mMethod.equalsIgnoreCase("GET") && !this.mMethod.equalsIgnoreCase("POST")) {
            this.gotFailureMessage();
            NetworkServiceManager.getInstance().didComplete(this);
            return;
        }
        if(TextUtils.isEmpty(this.mRequestUrl)) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.e("NetworkService", new Exception("Request url cannot be null."));
            }
            this.gotFailureMessage();
            NetworkServiceManager.getInstance().didComplete(this);
            return;
        }
        Thread thread0 = new Thread(this);
        this.thread = thread0;
        thread0.start();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.d("NetworkService", "[" + NetworkService.this.mMethod + "]<<url>>" + NetworkService.this.mRequestUrl + " -> (start timer)");
                    }
                    Thread.sleep(3000L);
                    if(!NetworkService.this.isSuccessOpenConnection) {
                        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                            AdPieLog.d("NetworkService", "[" + NetworkService.this.mMethod + "]<<url>>" + NetworkService.this.mRequestUrl + " -> (connection timeout)");
                        }
                        NetworkService.this.gotFailureMessage();
                    }
                }
                catch(InterruptedException unused_ex) {
                }
                NetworkService.this.timerThread = null;
            }
        });
        this.timerThread = thread1;
        thread1.start();
    }

    @Override
    public void run() {
        String s;
        BufferedWriter bufferedWriter1;
        OutputStreamWriter outputStreamWriter1;
        BufferedReader bufferedReader0;
        InputStreamReader inputStreamReader0;
        HttpURLConnection httpURLConnection1;
        BufferedWriter bufferedWriter0;
        OutputStreamWriter outputStreamWriter0;
        HttpURLConnection httpURLConnection0;
        this.responseCode = -1;
        this.isSuccessOpenConnection = false;
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.d("NetworkService", "<<start>>" + this.mRequestUrl);
        }
        try {
            httpURLConnection0 = (HttpURLConnection)(((URLConnection)FirebasePerfUrlConnection.instrument(new URL(this.mRequestUrl).openConnection())));
        }
        catch(Exception exception0) {
            outputStreamWriter0 = null;
            bufferedWriter0 = null;
            httpURLConnection1 = null;
            inputStreamReader0 = null;
            bufferedReader0 = null;
            goto label_118;
        }
        catch(Throwable throwable0) {
            outputStreamWriter0 = null;
            bufferedWriter0 = null;
            httpURLConnection1 = null;
            inputStreamReader0 = null;
            bufferedReader0 = null;
            goto label_143;
        }
        try {
            HttpsURLConnection.setDefaultSSLSocketFactory(new TLSSocketFactory());
            this.isSuccessOpenConnection = true;
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("NetworkService", "[" + this.mMethod + "]<<url>>" + this.mRequestUrl + " -> (open connection!)");
            }
            httpURLConnection0.setConnectTimeout(2000);
            httpURLConnection0.setReadTimeout(4000);
            if(this.mMethod.equalsIgnoreCase("GET")) {
                httpURLConnection0.setRequestMethod("GET");
                outputStreamWriter1 = null;
                bufferedWriter1 = null;
            }
            else if(this.mMethod.equalsIgnoreCase("POST")) {
                httpURLConnection0.setRequestMethod("POST");
                httpURLConnection0.setDoInput(true);
                httpURLConnection0.setDoOutput(true);
                httpURLConnection0.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                if(this.mEncodedParam == null) {
                    outputStreamWriter1 = null;
                    bufferedWriter1 = null;
                }
                else {
                    outputStreamWriter1 = new OutputStreamWriter(httpURLConnection0.getOutputStream(), "UTF-8");
                    bufferedWriter1 = new BufferedWriter(outputStreamWriter1);
                    goto label_69;
                label_38:
                    outputStreamWriter0 = null;
                    inputStreamReader0 = null;
                    bufferedReader0 = null;
                    httpURLConnection1 = httpURLConnection0;
                    bufferedWriter0 = null;
                    goto label_143;
                label_45:
                    outputStreamWriter0 = null;
                    inputStreamReader0 = null;
                    bufferedReader0 = null;
                    httpURLConnection1 = httpURLConnection0;
                    bufferedWriter0 = null;
                    goto label_118;
                }
            }
            else {
                goto label_75;
            }
            goto label_77;
        }
        catch(Exception exception0) {
            goto label_45;
        }
        catch(Throwable throwable0) {
            goto label_38;
        }
        try {
            bufferedWriter1 = new BufferedWriter(outputStreamWriter1);
            goto label_69;
        }
        catch(Exception exception1) {
        }
        catch(Throwable throwable1) {
            goto label_62;
        }
        try {
            inputStreamReader0 = null;
            bufferedReader0 = null;
            httpURLConnection1 = httpURLConnection0;
            bufferedWriter0 = null;
            outputStreamWriter0 = outputStreamWriter1;
            exception0 = exception1;
            goto label_118;
        label_62:
            inputStreamReader0 = null;
            bufferedReader0 = null;
            httpURLConnection1 = httpURLConnection0;
            bufferedWriter0 = null;
            outputStreamWriter0 = outputStreamWriter1;
            throwable0 = throwable1;
            goto label_143;
        label_69:
            bufferedWriter1.write(this.mEncodedParam);
            bufferedWriter1.flush();
            goto label_77;
        label_75:
            outputStreamWriter1 = null;
            bufferedWriter1 = null;
        label_77:
            int v = httpURLConnection0.getResponseCode();
            this.responseCode = v;
            if(v == 200) {
                s = "";
                inputStreamReader0 = new InputStreamReader(httpURLConnection0.getInputStream());
                goto label_88;
            }
            else {
                if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("NetworkService", "[" + this.mMethod + "]<<url>>" + this.mRequestUrl + "<<param>>" + this.mEncodedParam + "<<code>>" + this.responseCode);
                }
                this.gotFailureMessage();
                inputStreamReader0 = null;
                bufferedReader0 = null;
                goto label_162;
            }
            this.thread = null;
            return;
        }
        catch(Exception exception2) {
            goto label_112;
        }
        catch(Throwable throwable2) {
            goto label_108;
        }
        try {
        label_88:
            bufferedReader0 = null;
            bufferedReader0 = new BufferedReader(inputStreamReader0);
            String s1;
            while((s1 = bufferedReader0.readLine()) != null) {
                s = s + s1;
            }
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("NetworkService", "[" + this.mMethod + "]<<url>>" + this.mRequestUrl + "<<param>>" + this.mEncodedParam + "<<response>>" + s);
            }
            this.gotSuccessMessage(s);
            goto label_162;
        }
        catch(Exception exception2) {
            goto label_114;
        }
        catch(Throwable throwable2) {
        }
        try {
            while(true) {
                httpURLConnection1 = httpURLConnection0;
                bufferedWriter0 = bufferedWriter1;
                outputStreamWriter0 = outputStreamWriter1;
                throwable0 = throwable2;
                goto label_143;
            label_108:
                inputStreamReader0 = null;
                bufferedReader0 = null;
            }
        label_112:
            inputStreamReader0 = null;
            bufferedReader0 = null;
        label_114:
            outputStreamWriter0 = outputStreamWriter1;
            exception0 = exception2;
            httpURLConnection1 = httpURLConnection0;
            bufferedWriter0 = bufferedWriter1;
        }
        catch(Exception exception2) {
            goto label_112;
        }
        catch(Throwable throwable2) {
            goto label_108;
        }
        try {
        label_118:
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("NetworkService", "[" + this.mMethod + "]<<url>>" + this.mRequestUrl + "<<param>>" + this.mEncodedParam + " -> error : " + exception0.getMessage());
                AdPieLog.e("NetworkService", exception0);
            }
            this.gotFailureMessage();
        }
        catch(Throwable throwable0) {
            goto label_143;
        }
        if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
            AdPieLog.d("NetworkService", "<<finish>>" + this.mRequestUrl);
        }
        NetworkServiceManager.getInstance().didComplete(this);
        if(bufferedWriter0 != null) {
            try {
                bufferedWriter0.close();
            }
            catch(Exception unused_ex) {
            }
        }
        if(outputStreamWriter0 != null) {
            try {
                outputStreamWriter0.close();
            }
            catch(Exception unused_ex) {
            }
        }
        if(bufferedReader0 != null) {
            try {
                bufferedReader0.close();
            }
            catch(Exception unused_ex) {
            }
        }
        if(inputStreamReader0 != null) {
            try {
                inputStreamReader0.close();
            }
            catch(Exception unused_ex) {
            }
        }
        if(httpURLConnection1 != null) {
            try {
                httpURLConnection1.disconnect();
            }
            catch(Exception unused_ex) {
            }
        }
        Thread thread0 = this.timerThread;
        if(thread0 != null) {
            thread0.interrupt();
            this.timerThread = null;
            this.thread = null;
            return;
        label_143:
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("NetworkService", "<<finish>>" + this.mRequestUrl);
            }
            NetworkServiceManager.getInstance().didComplete(this);
            if(bufferedWriter0 != null) {
                try {
                    bufferedWriter0.close();
                }
                catch(Exception unused_ex) {
                }
            }
            if(outputStreamWriter0 != null) {
                try {
                    outputStreamWriter0.close();
                }
                catch(Exception unused_ex) {
                }
            }
            if(bufferedReader0 != null) {
                try {
                    bufferedReader0.close();
                }
                catch(Exception unused_ex) {
                }
            }
            if(inputStreamReader0 != null) {
                try {
                    inputStreamReader0.close();
                }
                catch(Exception unused_ex) {
                }
            }
            if(httpURLConnection1 != null) {
                try {
                    httpURLConnection1.disconnect();
                }
                catch(Exception unused_ex) {
                }
            }
            Thread thread1 = this.timerThread;
            if(thread1 != null) {
                thread1.interrupt();
                this.timerThread = null;
            }
            this.thread = null;
            throw throwable0;
        label_162:
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("NetworkService", "<<finish>>" + this.mRequestUrl);
            }
            NetworkServiceManager.getInstance().didComplete(this);
            if(bufferedWriter1 != null) {
                try {
                    bufferedWriter1.close();
                }
                catch(Exception unused_ex) {
                }
            }
            if(outputStreamWriter1 != null) {
                try {
                    outputStreamWriter1.close();
                }
                catch(Exception unused_ex) {
                }
            }
            if(bufferedReader0 != null) {
                try {
                    bufferedReader0.close();
                }
                catch(Exception unused_ex) {
                }
            }
            if(inputStreamReader0 != null) {
                try {
                    inputStreamReader0.close();
                }
                catch(Exception unused_ex) {
                }
            }
            try {
                httpURLConnection0.disconnect();
            }
            catch(Exception unused_ex) {
            }
            thread0 = this.timerThread;
            if(thread0 != null) {
                thread0.interrupt();
                this.timerThread = null;
            }
        }
        this.thread = null;
    }
}

