package com.fsn.cauly;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

class BDFileUtil {
    public static boolean copy(File file0, File file1) {
        OutputStream outputStream0;
        FileInputStream fileInputStream1;
        FileOutputStream fileOutputStream0;
        FileInputStream fileInputStream0 = null;
        try {
            if(file0.isDirectory()) {
                if(!file1.exists()) {
                    file1.mkdir();
                }
                String[] arr_s = file0.list();
                for(int v = 0; v < arr_s.length; ++v) {
                    BDFileUtil.copy(new File(file0, arr_s[v]), new File(file1, arr_s[v]));
                }
                fileOutputStream0 = null;
            }
            else {
                fileInputStream1 = new FileInputStream(file0);
                fileOutputStream0 = null;
                fileOutputStream0 = new FileOutputStream(file1);
                goto label_26;
            }
            goto label_48;
        }
        catch(Exception unused_ex) {
        }
        catch(Throwable throwable0) {
            outputStream0 = null;
            goto label_43;
        }
        fileOutputStream0 = null;
        goto label_34;
        try {
            fileOutputStream0 = null;
            fileOutputStream0 = new FileOutputStream(file1);
            goto label_26;
        }
        catch(Exception unused_ex) {
            goto label_33;
        }
        catch(Throwable throwable0) {
        }
        outputStream0 = null;
        fileInputStream0 = fileInputStream1;
        goto label_43;
        try {
        label_26:
            byte[] arr_b = new byte[0x400];
            int v1;
            while((v1 = fileInputStream1.read(arr_b)) > 0) {
                fileOutputStream0.write(arr_b, 0, v1);
            }
            fileInputStream0 = fileInputStream1;
            goto label_48;
        }
        catch(Exception unused_ex) {
        label_33:
            fileInputStream0 = fileInputStream1;
        label_34:
            if(fileInputStream0 != null) {
                try {
                    fileInputStream0.close();
                }
                catch(Exception unused_ex) {
                }
            }
            if(fileOutputStream0 != null) {
                try {
                    fileOutputStream0.close();
                }
                catch(Exception unused_ex) {
                }
            }
            return false;
        }
        catch(Throwable throwable1) {
            fileInputStream0 = fileInputStream1;
            outputStream0 = fileOutputStream0;
            throwable0 = throwable1;
        }
    label_43:
        if(fileInputStream0 != null) {
            try {
                fileInputStream0.close();
            }
            catch(Exception unused_ex) {
            }
        }
        if(outputStream0 != null) {
            try {
                outputStream0.close();
            }
            catch(Exception unused_ex) {
            }
        }
        throw throwable0;
    label_48:
        if(fileInputStream0 != null) {
            try {
                fileInputStream0.close();
            }
            catch(Exception unused_ex) {
            }
        }
        if(fileOutputStream0 != null) {
            try {
                fileOutputStream0.close();
            }
            catch(Exception unused_ex) {
            }
        }
        return true;
    }

    public static boolean copy(String s, String s1) {
        return BDFileUtil.copy(new File(s), new File(s1));
    }

    public static boolean deleteDirectory(File file0) {
        if(file0.exists()) {
            File[] arr_file = file0.listFiles();
            if(arr_file != null && arr_file.length > 0) {
                for(int v = 0; v < arr_file.length; ++v) {
                    if(arr_file[v].isDirectory()) {
                        BDFileUtil.deleteDirectory(arr_file[v]);
                    }
                    else {
                        arr_file[v].delete();
                    }
                }
            }
        }
        return file0.delete();
    }

    public static boolean deleteDirectory(String s) {
        return BDFileUtil.deleteDirectory(new File(s));
    }

    public static boolean deleteFile(String s) {
        return new File(s).delete();
    }

    public static String extractFilePath(String s) {
        int v = s.lastIndexOf(0x2F);
        return v == -1 ? "" : s.substring(0, v);
    }

    public static boolean fileExists(String s) {
        return new File(s).exists();
    }

    public static long getFileSize(String s) {
        return new File(s).length();
    }

    public static String getFileString(File file0) {
        FileInputStream fileInputStream0 = null;
        try {
            fileInputStream0 = new FileInputStream(file0);
            byte[] arr_b = new byte[((int)file0.length())];
            fileInputStream0.read(arr_b);
            fileInputStream0.close();
            return new String(arr_b, "UTF-8");
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
            if(fileInputStream0 != null) {
                try {
                    fileInputStream0.close();
                    return null;
                }
                catch(IOException iOException0) {
                    iOException0.printStackTrace();
                }
            }
            return null;
        }
    }

    public static String getFileString(String s) {
        return BDFileUtil.getFileString(new File(s));
    }

    public static boolean makeDirectory(String s) {
        try {
            new File(s).mkdirs();
            return true;
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    public static boolean move(File file0, File file1) {
        try {
            if(file0.isDirectory()) {
                if(!file1.exists()) {
                    file1.mkdir();
                }
                String[] arr_s = file0.list();
                for(int v = 0; v < arr_s.length; ++v) {
                    BDFileUtil.move(new File(file0, arr_s[v]), new File(file1, arr_s[v]));
                }
                return true;
            }
            return file0.renameTo(file1);
        }
        catch(Exception unused_ex) {
        }
        catch(Throwable throwable0) {
            throw throwable0;
        }
        return false;
    }

    public static boolean move(String s, String s1) {
        return BDFileUtil.move(new File(s), new File(s1));
    }

    public static String replaceExtName(String s, String s1) {
        int v = s.toLowerCase().lastIndexOf(".");
        return v == -1 ? s : s.substring(0, v + 1) + s1;
    }

    public static void safeCloseInputStream(InputStream inputStream0) {
        if(inputStream0 == null) {
            return;
        }
        try {
            inputStream0.close();
        }
        catch(Exception unused_ex) {
        }
    }

    public static void safeCloseOutputStream(OutputStream outputStream0) {
        if(outputStream0 == null) {
            return;
        }
        try {
            outputStream0.close();
        }
        catch(Exception unused_ex) {
        }
    }

    public static boolean writeFileString(String s, String s1) {
        boolean z;
        IOException iOException1;
        FileOutputStream fileOutputStream0;
        byte[] arr_b;
        try {
            arr_b = s1.getBytes("UTF-8");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            unsupportedEncodingException0.printStackTrace();
            return false;
        }
        File file0 = new File(s);
        try {
            file0.createNewFile();
            fileOutputStream0 = new FileOutputStream(file0);
        }
        catch(IOException iOException0) {
            iOException1 = iOException0;
            fileOutputStream0 = null;
            goto label_17;
        }
        try {
            fileOutputStream0.write(arr_b);
            z = true;
            goto label_19;
        }
        catch(IOException iOException1) {
        }
    label_17:
        iOException1.printStackTrace();
        z = false;
    label_19:
        if(fileOutputStream0 != null) {
            try {
                fileOutputStream0.close();
                return z;
            }
            catch(IOException iOException2) {
                iOException2.printStackTrace();
                return false;
            }
        }
        return z;
    }
}

