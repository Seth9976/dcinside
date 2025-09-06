package com.github.mikephil.charting.utils;

import android.content.res.AssetManager;
import android.os.Environment;
import android.util.Log;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class d {
    private static final String a = "MPChart-FileUtils";

    public static List a(AssetManager assetManager0, String s) {
        List list0 = new ArrayList();
        BufferedReader bufferedReader0 = null;
        try {
            try {
                bufferedReader0 = new BufferedReader(new InputStreamReader(assetManager0.open(s), "UTF-8"));
                String s1 = bufferedReader0.readLine();
                while(true) {
                    if(s1 == null) {
                        goto label_21;
                    }
                    String[] arr_s = s1.split("#");
                    list0.add(new BarEntry(Float.parseFloat(arr_s[1]), Float.parseFloat(arr_s[0])));
                    s1 = bufferedReader0.readLine();
                }
            }
            catch(IOException iOException0) {
            }
            Log.e("MPChart-FileUtils", iOException0.toString());
            if(bufferedReader0 != null) {
                goto label_12;
            }
            return list0;
        }
        catch(Throwable throwable0) {
            goto label_15;
        }
        try {
        label_12:
            bufferedReader0.close();
        }
        catch(IOException iOException1) {
            Log.e("MPChart-FileUtils", iOException1.toString());
        }
        return list0;
    label_15:
        if(bufferedReader0 != null) {
            try {
                bufferedReader0.close();
            }
            catch(IOException iOException2) {
                Log.e("MPChart-FileUtils", iOException2.toString());
            }
        }
        throw throwable0;
        try {
        label_21:
            bufferedReader0.close();
        }
        catch(IOException iOException1) {
            Log.e("MPChart-FileUtils", iOException1.toString());
        }
        return list0;
    }

    public static List b(AssetManager assetManager0, String s) {
        List list0 = new ArrayList();
        BufferedReader bufferedReader0 = null;
        try {
            try {
                bufferedReader0 = new BufferedReader(new InputStreamReader(assetManager0.open(s), "UTF-8"));
                String s1 = bufferedReader0.readLine();
                while(true) {
                    if(s1 == null) {
                        goto label_32;
                    }
                    String[] arr_s = s1.split("#");
                    if(arr_s.length > 2) {
                        int v1 = arr_s.length - 1;
                        float[] arr_f = new float[v1];
                        for(int v = 0; v < v1; ++v) {
                            arr_f[v] = Float.parseFloat(arr_s[v]);
                        }
                        list0.add(new BarEntry(((float)Integer.parseInt(arr_s[arr_s.length - 1])), arr_f));
                    }
                    else {
                        list0.add(new Entry(Float.parseFloat(arr_s[1]), Float.parseFloat(arr_s[0])));
                    }
                    s1 = bufferedReader0.readLine();
                }
            }
            catch(IOException iOException0) {
            }
            Log.e("MPChart-FileUtils", iOException0.toString());
            if(bufferedReader0 != null) {
                goto label_24;
            }
            return list0;
        }
        catch(Throwable throwable0) {
            goto label_26;
        }
        try {
        label_24:
            bufferedReader0.close();
        }
        catch(IOException iOException1) {
            Log.e("MPChart-FileUtils", iOException1.toString());
        }
        return list0;
    label_26:
        if(bufferedReader0 != null) {
            try {
                bufferedReader0.close();
            }
            catch(IOException iOException2) {
                Log.e("MPChart-FileUtils", iOException2.toString());
            }
        }
        throw throwable0;
        try {
        label_32:
            bufferedReader0.close();
        }
        catch(IOException iOException1) {
            Log.e("MPChart-FileUtils", iOException1.toString());
        }
        return list0;
    }

    public static List c(String s) {
        File file0 = new File(Environment.getExternalStorageDirectory(), s);
        List list0 = new ArrayList();
        try {
            BufferedReader bufferedReader0 = new BufferedReader(new FileReader(file0));
            while(true) {
                String s1 = bufferedReader0.readLine();
                if(s1 == null) {
                    return list0;
                }
                String[] arr_s = s1.split("#");
                if(arr_s.length > 2) {
                    int v1 = arr_s.length - 1;
                    float[] arr_f = new float[v1];
                    for(int v = 0; v < v1; ++v) {
                        arr_f[v] = Float.parseFloat(arr_s[v]);
                    }
                    list0.add(new BarEntry(((float)Integer.parseInt(arr_s[arr_s.length - 1])), arr_f));
                }
                else {
                    list0.add(new Entry(Float.parseFloat(arr_s[0]), ((float)Integer.parseInt(arr_s[1]))));
                }
            }
        }
        catch(IOException iOException0) {
        }
        Log.e("MPChart-FileUtils", iOException0.toString());
        return list0;
    }

    public static void d(List list0, String s) {
        File file0 = new File(Environment.getExternalStorageDirectory(), s);
        if(!file0.exists()) {
            try {
                file0.createNewFile();
            }
            catch(IOException iOException0) {
                Log.e("MPChart-FileUtils", iOException0.toString());
            }
        }
        try {
            BufferedWriter bufferedWriter0 = new BufferedWriter(new FileWriter(file0, true));
            for(Object object0: list0) {
                bufferedWriter0.append(((Entry)object0).d() + "#" + ((Entry)object0).l());
                bufferedWriter0.newLine();
            }
            bufferedWriter0.close();
            return;
        }
        catch(IOException iOException1) {
        }
        Log.e("MPChart-FileUtils", iOException1.toString());
    }
}

