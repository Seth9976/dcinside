package com.dcinside.app.util;

import java.io.IOException;
import java.util.Locale;
import m0.a;
import rx.g;

public final class xk {
    private static final CharSequence[] a = null;
    private static final String b = "해당 게시물은 삭제되었습니다";
    private static final String c = "글없음";
    private static final String d = "nodata";
    private static final String e = "추가";
    private static final String f = "오류";
    private static final String g = "비밀번호 오류";
    private static final String h = "error";
    private static final String i = "이미지없음";
    private static final String j = "사용불가";
    private static final String k = "no gallery";
    private static final String l = "비밀번호가 틀립니다.";
    private static final String m = "모바일웹";
    private static final String n = "멤버만 이용할 수 있습니다.";
    private static final String o = "매니저만 이용할 수 있습니다.";
    private static final String p = "앱 스토어의 약관, 정책 준수 필요성에 따라 성인 갤러리는 모바일웹에서 확인할 수 있습니다.";
    private static final String q = "앱 스토어의 약관, 정책 준수 필요성에 따라 성인 게시물은 모바일웹에서 확인할 수 있습니다.";
    private static final String r = "comment_noti";

    static {
        xk.a = new CharSequence[]{"<!doctype", "<html", "<!--", "<body", "<!make", "<meta", "<script"};
    }

    public static boolean a(String s) {
        return "comment_noti".equals(s);
    }

    // 去混淆评级： 低(20)
    public static boolean b(String s) {
        return "이미 실베로 추천하였습니다.".equals(s) || "이미 실베로 추천되었습니다".equals(s);
    }

    public static boolean c(CharSequence charSequence0) {
        return "해당 게시물은 삭제되었습니다".equals(charSequence0);
    }

    public static boolean d(CharSequence charSequence0) {
        return "글없음".equals(charSequence0);
    }

    public static boolean e(String s) {
        return "오류".equals(s);
    }

    public static boolean f(String s) {
        return "추가".equals(s);
    }

    public static boolean g(String s) {
        return "no gallery".equals(s);
    }

    // 去混淆评级： 低(20)
    public static boolean h(String s) {
        return "이미 힛갤로 추천하였습니다.".equals(s) || "이미 힛갤로 추천되었습니다.".equals(s);
    }

    public static boolean i(CharSequence charSequence0) {
        return "이미지없음".equals(charSequence0);
    }

    // 去混淆评级： 低(20)
    public static boolean j(String s) {
        return "앱 스토어의 약관, 정책 준수 필요성에 따라 성인 갤러리는 모바일웹에서 확인할 수 있습니다.".equals(s) || "앱 스토어의 약관, 정책 준수 필요성에 따라 성인 게시물은 모바일웹에서 확인할 수 있습니다.".equals(s);
    }

    private static String k(String s) {
        if(s == null) {
            return null;
        }
        try {
            String s1 = s.trim();
            if(s1.isEmpty()) {
                return null;
            }
            if(s1.startsWith("<script type=\'text/javascript\'>") && s1.contains("location.replace(\'http://m.dcinside.com/error.php\');")) {
                return "서버에 연결할 수 없습니다.";
            }
            if(s1.startsWith("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">") && s1.contains("This page can\'t be displayed.")) {
                return Dl.A(s1).S2();
            }
            return a.b(s1.substring(0, Math.min(s1.length(), 100)).toLowerCase(Locale.getDefault()), xk.a) ? "서버에 연결할 수 없습니다." : null;
        }
        catch(Exception unused_ex) {
        }
        return null;
    }

    public static boolean l(String s) {
        return s.trim().startsWith("자동 입력 방지 코드");
    }

    public static boolean m(String s) {
        return "비밀번호 오류".equals(s);
    }

    public static boolean n(String s) {
        return s == null ? false : s.contains("모바일웹");
    }

    public static boolean o(CharSequence charSequence0) {
        return "nodata".equals(charSequence0);
    }

    public static boolean p(String s) {
        return "사용불가".equals(s);
    }

    // 去混淆评级： 低(20)
    public static boolean q(String s) {
        return "멤버만 이용할 수 있습니다.".equals(s) || "매니저만 이용할 수 있습니다.".equals(s);
    }

    public static g r(String s, Throwable throwable0) {
        String s1 = xk.k(s);
        return s1 == null ? g.X1(throwable0) : g.X1(new IOException(s1, throwable0));
    }

    public static boolean s(CharSequence charSequence0) {
        return "error".equals(charSequence0);
    }

    public static boolean t(String s) {
        return "비밀번호가 틀립니다.".equals(s);
    }
}

