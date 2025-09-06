package androidx.media3.common.util;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import com.google.common.base.c;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@UnstableApi
public final class ColorParser {
    private static final String a = "rgb";
    private static final String b = "rgba";
    private static final Pattern c;
    private static final Pattern d;
    private static final Pattern e;
    private static final Map f;

    static {
        ColorParser.c = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
        ColorParser.d = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
        ColorParser.e = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
        HashMap hashMap0 = new HashMap();
        ColorParser.f = hashMap0;
        hashMap0.put("aliceblue", 0xFFF0F8FF);
        hashMap0.put("antiquewhite", 0xFFFAEBD7);
        hashMap0.put("aqua", 0xFF00FFFF);
        hashMap0.put("aquamarine", 0xFF7FFFD4);
        hashMap0.put("azure", 0xFFF0FFFF);
        hashMap0.put("beige", 0xFFF5F5DC);
        hashMap0.put("bisque", -6972);
        hashMap0.put("black", 0xFF000000);
        hashMap0.put("blanchedalmond", -5171);
        hashMap0.put("blue", 0xFF0000FF);
        hashMap0.put("blueviolet", -7722014);
        hashMap0.put("brown", 0xFFA52A2A);
        hashMap0.put("burlywood", -2180985);
        hashMap0.put("cadetblue", 0xFF5F9EA0);
        hashMap0.put("chartreuse", 0xFF7FFF00);
        hashMap0.put("chocolate", 0xFFD2691E);
        hashMap0.put("coral", 0xFFFF7F50);
        hashMap0.put("cornflowerblue", -10185235);
        hashMap0.put("cornsilk", 0xFFFFF8DC);
        hashMap0.put("crimson", 0xFFDC143C);
        hashMap0.put("cyan", 0xFF00FFFF);
        hashMap0.put("darkblue", 0xFF00008B);
        hashMap0.put("darkcyan", 0xFF008B8B);
        hashMap0.put("darkgoldenrod", 0xFFB8860B);
        hashMap0.put("darkgray", 0xFFA9A9A9);
        hashMap0.put("darkgreen", 0xFF006400);
        hashMap0.put("darkgrey", 0xFFA9A9A9);
        hashMap0.put("darkkhaki", 0xFFBDB76B);
        hashMap0.put("darkmagenta", 0xFF8B008B);
        hashMap0.put("darkolivegreen", 0xFF556B2F);
        hashMap0.put("darkorange", 0xFFFF8C00);
        hashMap0.put("darkorchid", -6737204);
        hashMap0.put("darkred", 0xFF8B0000);
        hashMap0.put("darksalmon", -1468806);
        hashMap0.put("darkseagreen", 0xFF8FBC8F);
        hashMap0.put("darkslateblue", -12042869);
        hashMap0.put("darkslategray", 0xFF2F4F4F);
        hashMap0.put("darkslategrey", 0xFF2F4F4F);
        hashMap0.put("darkturquoise", 0xFF00CED1);
        hashMap0.put("darkviolet", 0xFF9400D3);
        hashMap0.put("deeppink", -60269);
        hashMap0.put("deepskyblue", 0xFF00BFFF);
        hashMap0.put("dimgray", 0xFF696969);
        hashMap0.put("dimgrey", 0xFF696969);
        hashMap0.put("dodgerblue", 0xFF1E90FF);
        hashMap0.put("firebrick", -5103070);
        hashMap0.put("floralwhite", 0xFFFFFAF0);
        hashMap0.put("forestgreen", 0xFF228B22);
        hashMap0.put("fuchsia", 0xFFFF00FF);
        hashMap0.put("gainsboro", -2302756);
        hashMap0.put("ghostwhite", 0xFFF8F8FF);
        hashMap0.put("gold", 0xFFFFD700);
        hashMap0.put("goldenrod", 0xFFDAA520);
        hashMap0.put("gray", 0xFF808080);
        hashMap0.put("green", 0xFF008000);
        hashMap0.put("greenyellow", 0xFFADFF2F);
        hashMap0.put("grey", 0xFF808080);
        hashMap0.put("honeydew", 0xFFF0FFF0);
        hashMap0.put("hotpink", 0xFFFF69B4);
        hashMap0.put("indianred", 0xFFCD5C5C);
        hashMap0.put("indigo", 0xFF4B0082);
        hashMap0.put("ivory", -16);
        hashMap0.put("khaki", 0xFFF0E68C);
        hashMap0.put("lavender", 0xFFE6E6FA);
        hashMap0.put("lavenderblush", 0xFFFFF0F5);
        hashMap0.put("lawngreen", 0xFF7CFC00);
        hashMap0.put("lemonchiffon", 0xFFFFFACD);
        hashMap0.put("lightblue", 0xFFADD8E6);
        hashMap0.put("lightcoral", 0xFFF08080);
        hashMap0.put("lightcyan", 0xFFE0FFFF);
        hashMap0.put("lightgoldenrodyellow", -329006);
        hashMap0.put("lightgray", 0xFFD3D3D3);
        hashMap0.put("lightgreen", 0xFF90EE90);
        hashMap0.put("lightgrey", 0xFFD3D3D3);
        hashMap0.put("lightpink", 0xFFFFB6C1);
        hashMap0.put("lightsalmon", 0xFFFFA07A);
        hashMap0.put("lightseagreen", 0xFF20B2AA);
        hashMap0.put("lightskyblue", 0xFF87CEFA);
        hashMap0.put("lightslategray", 0xFF778899);
        hashMap0.put("lightslategrey", 0xFF778899);
        hashMap0.put("lightsteelblue", 0xFFB0C4DE);
        hashMap0.put("lightyellow", 0xFFFFFFE0);
        hashMap0.put("lime", 0xFF00FF00);
        hashMap0.put("limegreen", 0xFF32CD32);
        hashMap0.put("linen", 0xFFFAF0E6);
        hashMap0.put("magenta", 0xFFFF00FF);
        hashMap0.put("maroon", 0xFF800000);
        hashMap0.put("mediumaquamarine", -10039894);
        hashMap0.put("mediumblue", 0xFF0000CD);
        hashMap0.put("mediumorchid", 0xFFBA55D3);
        hashMap0.put("mediumpurple", 0xFF9370DB);
        hashMap0.put("mediumseagreen", 0xFF3CB371);
        hashMap0.put("mediumslateblue", 0xFF7B68EE);
        hashMap0.put("mediumspringgreen", 0xFF00FA9A);
        hashMap0.put("mediumturquoise", -12004916);
        hashMap0.put("mediumvioletred", -3730043);
        hashMap0.put("midnightblue", 0xFF191970);
        hashMap0.put("mintcream", 0xFFF5FFFA);
        hashMap0.put("mistyrose", 0xFFFFE4E1);
        hashMap0.put("moccasin", -6987);
        hashMap0.put("navajowhite", -8531);
        hashMap0.put("navy", 0xFF000080);
        hashMap0.put("oldlace", 0xFFFDF5E6);
        hashMap0.put("olive", 0xFF808000);
        hashMap0.put("olivedrab", 0xFF6B8E23);
        hashMap0.put("orange", 0xFFFFA500);
        hashMap0.put("orangered", 0xFFFF4500);
        hashMap0.put("orchid", 0xFFDA70D6);
        hashMap0.put("palegoldenrod", -1120086);
        hashMap0.put("palegreen", 0xFF98FB98);
        hashMap0.put("paleturquoise", 0xFFAFEEEE);
        hashMap0.put("palevioletred", 0xFFDB7093);
        hashMap0.put("papayawhip", 0xFFFFEFD5);
        hashMap0.put("peachpuff", -9543);
        hashMap0.put("peru", -3308225);
        hashMap0.put("pink", 0xFFFFC0CB);
        hashMap0.put("plum", 0xFFDDA0DD);
        hashMap0.put("powderblue", 0xFFB0E0E6);
        hashMap0.put("purple", 0xFF800080);
        hashMap0.put("rebeccapurple", -10079335);
        hashMap0.put("red", 0xFFFF0000);
        hashMap0.put("rosybrown", 0xFFBC8F8F);
        hashMap0.put("royalblue", 0xFF4169E1);
        hashMap0.put("saddlebrown", -7650029);
        hashMap0.put("salmon", 0xFFFA8072);
        hashMap0.put("sandybrown", 0xFFF4A460);
        hashMap0.put("seagreen", 0xFF2E8B57);
        hashMap0.put("seashell", 0xFFFFF5EE);
        hashMap0.put("sienna", 0xFFA0522D);
        hashMap0.put("silver", 0xFFC0C0C0);
        hashMap0.put("skyblue", 0xFF87CEEB);
        hashMap0.put("slateblue", -9807155);
        hashMap0.put("slategray", 0xFF708090);
        hashMap0.put("slategrey", 0xFF708090);
        hashMap0.put("snow", 0xFFFFFAFA);
        hashMap0.put("springgreen", 0xFF00FF7F);
        hashMap0.put("steelblue", 0xFF4682B4);
        hashMap0.put("tan", 0xFFD2B48C);
        hashMap0.put("teal", 0xFF008080);
        hashMap0.put("thistle", 0xFFD8BFD8);
        hashMap0.put("tomato", -40121);
        hashMap0.put("transparent", 0);
        hashMap0.put("turquoise", 0xFF40E0D0);
        hashMap0.put("violet", -1146130);
        hashMap0.put("wheat", 0xFFF5DEB3);
        hashMap0.put("white", -1);
        hashMap0.put("whitesmoke", 0xFFF5F5F5);
        hashMap0.put("yellow", 0xFFFFFF00);
        hashMap0.put("yellowgreen", 0xFF9ACD32);
    }

    @ColorInt
    private static int a(String s, boolean z) {
        Assertions.a(!TextUtils.isEmpty(s));
        String s1 = s.replace(" ", "");
        if(s1.charAt(0) == 35) {
            int v = (int)Long.parseLong(s1.substring(1), 16);
            if(s1.length() == 7) {
                return 0xFF000000 | v;
            }
            if(s1.length() != 9) {
                throw new IllegalArgumentException();
            }
            return (v & 0xFF) << 24 | v >>> 8;
        }
        if(s1.startsWith("rgba")) {
            Matcher matcher0 = (z ? ColorParser.e : ColorParser.d).matcher(s1);
            if(matcher0.matches()) {
                return z ? Color.argb(((int)(Float.parseFloat(((String)Assertions.g(matcher0.group(4)))) * 255.0f)), Integer.parseInt(((String)Assertions.g(matcher0.group(1))), 10), Integer.parseInt(((String)Assertions.g(matcher0.group(2))), 10), Integer.parseInt(((String)Assertions.g(matcher0.group(3))), 10)) : Color.argb(Integer.parseInt(((String)Assertions.g(matcher0.group(4))), 10), Integer.parseInt(((String)Assertions.g(matcher0.group(1))), 10), Integer.parseInt(((String)Assertions.g(matcher0.group(2))), 10), Integer.parseInt(((String)Assertions.g(matcher0.group(3))), 10));
            }
        }
        else if(s1.startsWith("rgb")) {
            Matcher matcher1 = ColorParser.c.matcher(s1);
            if(matcher1.matches()) {
                return Color.rgb(Integer.parseInt(((String)Assertions.g(matcher1.group(1))), 10), Integer.parseInt(((String)Assertions.g(matcher1.group(2))), 10), Integer.parseInt(((String)Assertions.g(matcher1.group(3))), 10));
            }
        }
        else {
            String s2 = c.g(s1);
            Integer integer0 = (Integer)ColorParser.f.get(s2);
            if(integer0 != null) {
                return (int)integer0;
            }
        }
        throw new IllegalArgumentException();
    }

    @ColorInt
    public static int b(String s) {
        return ColorParser.a(s, true);
    }

    @ColorInt
    public static int c(String s) {
        return ColorParser.a(s, false);
    }
}

