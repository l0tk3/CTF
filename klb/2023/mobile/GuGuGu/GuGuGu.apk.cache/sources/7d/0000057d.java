package com.e4a.runtime;

import android.support.v4.view.MotionEventCompat;
import com.e4a.runtime.annotations.SimpleFunction;
import com.e4a.runtime.annotations.SimpleObject;
import java.io.UnsupportedEncodingException;

@SimpleObject
/* renamed from: com.e4a.runtime.转换操作  reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0035 {
    private C0035() {
    }

    @SimpleFunction
    /* renamed from: 字符转代码  reason: contains not printable characters */
    public static int m588(String str) {
        try {
            return str.charAt(0);
        } catch (IndexOutOfBoundsException e) {
            return -1;
        }
    }

    @SimpleFunction
    /* renamed from: 代码转字符  reason: contains not printable characters */
    public static String m579(int value) {
        try {
            return Character.toString((char) value);
        } catch (Exception e) {
            return "";
        }
    }

    @SimpleFunction
    /* renamed from: 到十六进制  reason: contains not printable characters */
    public static String m581(long v) {
        try {
            String o738C0C = Long.toHexString(v);
            if (o738C0C.length() < 2) {
                return "0" + o738C0C;
            }
            return o738C0C;
        } catch (Exception e) {
            return "";
        }
    }

    @SimpleFunction
    /* renamed from: 到十进制  reason: contains not printable characters */
    public static long m582(String v) {
        try {
            if ("".equals(v)) {
                return 0L;
            }
            return Long.valueOf(v, 16).longValue();
        } catch (Exception e) {
            return 0L;
        }
    }

    @SimpleFunction
    /* renamed from: 到二进制  reason: contains not printable characters */
    public static String m580(int v) {
        try {
            return Integer.toBinaryString(v);
        } catch (Exception e) {
            return "";
        }
    }

    @SimpleFunction
    /* renamed from: 文本到二进制  reason: contains not printable characters */
    public static String m601(String str) {
        try {
            char[] o738C0C244C5267 = str.toCharArray();
            String o729D0D124847 = "";
            for (int o69 = 0; o69 < o738C0C244C5267.length; o69++) {
                o729D0D124847 = o729D0D124847 + Integer.toBinaryString(o738C0C244C5267[o69]) + " ";
            }
            return o729D0D124847;
        } catch (Exception e) {
            return "";
        }
    }

    @SimpleFunction
    /* renamed from: 二进制到十进制  reason: contains not printable characters */
    public static long m578(String v) {
        try {
            if ("".equals(v)) {
                return 0L;
            }
            return Long.valueOf(v, 2).longValue();
        } catch (Exception e) {
            return 0L;
        }
    }

    @SimpleFunction
    /* renamed from: 到文本  reason: contains not printable characters */
    public static String m585(double v) {
        try {
            return String.valueOf(v);
        } catch (Exception e) {
            return "";
        }
    }

    @SimpleFunction
    /* renamed from: 到数值  reason: contains not printable characters */
    public static double m583(String v) {
        try {
            if ("".equals(v)) {
                return 0.0d;
            }
            return Double.parseDouble(v);
        } catch (Exception e) {
            return 0.0d;
        }
    }

    @SimpleFunction
    /* renamed from: 字节到文本  reason: contains not printable characters */
    public static String m592(byte[] v, String encoding) {
        try {
            return new String(v, encoding);
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    @SimpleFunction
    /* renamed from: 文本到字节  reason: contains not printable characters */
    public static byte[] m602(String v, String encoding) {
        try {
            return v.getBytes(encoding);
        } catch (UnsupportedEncodingException e) {
            return new byte[0];
        }
    }

    @SimpleFunction
    /* renamed from: 到整数  reason: contains not printable characters */
    public static int m584(String v) {
        try {
            if ("".equals(v)) {
                return 0;
            }
            return Integer.parseInt(v);
        } catch (Exception e) {
            return 0;
        }
    }

    @SimpleFunction
    /* renamed from: 整数到文本  reason: contains not printable characters */
    public static String m600(int v) {
        try {
            return Integer.toString(v);
        } catch (Exception e) {
            return "";
        }
    }

    @SimpleFunction
    /* renamed from: 字节到整数  reason: contains not printable characters */
    public static int m590(byte[] res) {
        try {
            return (res[0] & 255) | ((res[1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | ((res[2] << 24) >>> 8) | (res[3] << 24);
        } catch (Exception e) {
            return 0;
        }
    }

    @SimpleFunction
    /* renamed from: 字节到整数2  reason: contains not printable characters */
    public static int m5912(byte b) {
        return b;
    }

    @SimpleFunction
    /* renamed from: 字节到无符号整数  reason: contains not printable characters */
    public static int m593(byte b) {
        return b & 255;
    }

    @SimpleFunction
    /* renamed from: 整数到字节  reason: contains not printable characters */
    public static byte[] m598(int res) {
        try {
            byte[] o74990C00414766 = {(byte) (res & 255), (byte) ((res >> 8) & 255), (byte) ((res >> 16) & 255), (byte) (res >>> 24)};
            return o74990C00414766;
        } catch (Exception e) {
            return new byte[0];
        }
    }

    @SimpleFunction
    /* renamed from: 整数到字节2  reason: contains not printable characters */
    public static byte m5992(int i) {
        return (byte) i;
    }

    @SimpleFunction
    /* renamed from: 长整数到字节  reason: contains not printable characters */
    public static byte[] m603(long x) {
        try {
            byte[] o629A = {(byte) (x >> 56), (byte) (x >> 48), (byte) (x >> 40), (byte) (x >> 32), (byte) (x >> 24), (byte) (x >> 16), (byte) (x >> 8), (byte) (x >> 0)};
            return o629A;
        } catch (Exception e) {
            return new byte[0];
        }
    }

    @SimpleFunction
    /* renamed from: 字节到长整数  reason: contains not printable characters */
    public static long m594(byte[] bb) {
        try {
            return ((bb[0] & 255) << 56) | ((bb[1] & 255) << 48) | ((bb[2] & 255) << 40) | ((bb[3] & 255) << 32) | ((bb[4] & 255) << 24) | ((bb[5] & 255) << 16) | ((bb[6] & 255) << 8) | ((bb[7] & 255) << 0);
        } catch (Exception e) {
            return 0L;
        }
    }

    @SimpleFunction
    /* renamed from: 小数到字节  reason: contains not printable characters */
    public static byte[] m596(double a) {
        try {
            long o76 = Double.doubleToLongBits(a);
            byte[] o778A1713417160FA195250 = {(byte) (o76 >>> 56), (byte) (o76 >>> 48), (byte) (o76 >>> 40), (byte) (o76 >>> 32), (byte) (o76 >>> 24), (byte) (o76 >>> 16), (byte) (o76 >>> 8), (byte) (o76 >>> 0)};
            return o778A1713417160FA195250;
        } catch (Exception e) {
            return new byte[0];
        }
    }

    @SimpleFunction
    /* renamed from: 字节到小数  reason: contains not printable characters */
    public static double m589(byte[] readBuffer) {
        try {
            return Double.longBitsToDouble((readBuffer[0] << 56) + ((readBuffer[1] & 255) << 48) + ((readBuffer[2] & 255) << 40) + ((readBuffer[3] & 255) << 32) + ((readBuffer[4] & 255) << 24) + ((readBuffer[5] & 255) << 16) + ((readBuffer[6] & 255) << 8) + ((readBuffer[7] & 255) << 0));
        } catch (Exception e) {
            return 0.0d;
        }
    }

    @SimpleFunction
    /* renamed from: 到长整数  reason: contains not printable characters */
    public static long m586(String v) {
        try {
            if ("".equals(v)) {
                return 0L;
            }
            return Long.parseLong(v);
        } catch (Exception e) {
            return 0L;
        }
    }

    @SimpleFunction
    /* renamed from: 长整数到文本  reason: contains not printable characters */
    public static String m604(long v) {
        try {
            return Long.toString(v);
        } catch (Exception e) {
            return "";
        }
    }

    @SimpleFunction
    /* renamed from: 数值到金额  reason: contains not printable characters */
    public static String m597(double amount) {
        if (amount > 1.0E18d || amount < -1.0E18d) {
            return "";
        }
        try {
            String[] o63901709414070D816504BC28A = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
            boolean o6E9D1906505A63F9 = false;
            if (amount < 0.0d) {
                o6E9D1906505A63F9 = true;
                amount *= -1.0d;
            }
            long o749D1317 = Math.round(100.0d * amount);
            int o6E8D1321415D = (int) (o749D1317 % 10);
            long o749D13172 = o749D1317 / 10;
            int o6E8D132D4D527A = (int) (o749D13172 % 10);
            long o749D13173 = o749D13172 / 10;
            int[] o70990C1357 = new int[20];
            int o6E8D1337454161EF = 0;
            int o69 = 0;
            while (o749D13173 != 0) {
                int o70990C13 = (int) (o749D13173 % 10000);
                o70990C1357[o69] = o70990C13;
                o6E8D1337454161EF++;
                o749D13173 /= 10000;
                o69++;
            }
            boolean o629D1808565642FD117E51EC9C4C2E = true;
            String o63901709414070CF0B45 = "";
            for (int o692 = 0; o692 < o6E8D1337454161EF; o692++) {
                String o70990C13675B7CF21A4447 = partTranslate(o70990C1357[o692]);
                if (o692 % 2 == 0) {
                    if ("".equals(o70990C13675B7CF21A4447)) {
                        o629D1808565642FD117E51EC9C4C2E = true;
                    } else {
                        o629D1808565642FD117E51EC9C4C2E = false;
                    }
                }
                if (o692 != 0) {
                    if (o692 % 2 == 0) {
                        o63901709414070CF0B45 = "亿" + o63901709414070CF0B45;
                    } else if ("".equals(o70990C13675B7CF21A4447) && !o629D1808565642FD117E51EC9C4C2E) {
                        o63901709414070CF0B45 = "零" + o63901709414070CF0B45;
                    } else {
                        if (o70990C1357[o692 - 1] < 1000 && o70990C1357[o692 - 1] > 0) {
                            o63901709414070CF0B45 = "零" + o63901709414070CF0B45;
                        }
                        o63901709414070CF0B45 = "万" + o63901709414070CF0B45;
                    }
                }
                o63901709414070CF0B45 = o70990C13675B7CF21A4447 + o63901709414070CF0B45;
            }
            if ("".equals(o63901709414070CF0B45)) {
                o63901709414070CF0B45 = o63901709414070D816504BC28A[0];
            } else if (o6E9D1906505A63F9) {
                o63901709414070CF0B45 = "负" + o63901709414070CF0B45;
            }
            String o63901709414070CF0B452 = o63901709414070CF0B45 + "元";
            if (o6E8D1321415D == 0 && o6E8D132D4D527A == 0) {
                return o63901709414070CF0B452 + "整";
            }
            if (o6E8D1321415D == 0) {
                return o63901709414070CF0B452 + o63901709414070D816504BC28A[o6E8D132D4D527A] + "角";
            }
            if (o6E8D132D4D527A == 0) {
                return o63901709414070CF0B452 + "零" + o63901709414070D816504BC28A[o6E8D1321415D] + "分";
            }
            return o63901709414070CF0B452 + o63901709414070D816504BC28A[o6E8D132D4D527A] + "角" + o63901709414070D816504BC28A[o6E8D1321415D] + "分";
        } catch (Exception e) {
            return "";
        }
    }

    private static String partTranslate(int amountPart) {
        if (amountPart < 0 || amountPart > 10000) {
            return "";
        }
        String[] o63901709414070D816504BC28A = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        String[] o7596171357 = {"", "拾", "佰", "仟"};
        int o749D1317 = amountPart;
        String o619511124A4746E80D = new Integer(amountPart).toString();
        int o619511124A4746E80D7B47D89E4A29 = o619511124A4746E80D.length();
        boolean o6C990D136D404FF90D58 = true;
        String o63901709414070CF0B45 = "";
        for (int o69 = 0; o69 < o619511124A4746E80D7B47D89E4A29 && o749D1317 != 0; o69++) {
            int o6491190E50 = o749D1317 % 10;
            if (o6491190E50 == 0) {
                if (!o6C990D136D404FF90D58) {
                    o63901709414070CF0B45 = "零" + o63901709414070CF0B45;
                }
                o6C990D136D404FF90D58 = true;
            } else {
                o63901709414070CF0B45 = o63901709414070D816504BC28A[o6491190E50] + o7596171357[o69] + o63901709414070CF0B45;
                o6C990D136D404FF90D58 = false;
            }
            o749D1317 /= 10;
        }
        return o63901709414070CF0B45;
    }

    private static int parse(char c) {
        if (c >= 'a') {
            return ((c - 'a') + 10) & 15;
        }
        if (c >= 'A') {
            return ((c - 'A') + 10) & 15;
        }
        return (c - '0') & 15;
    }

    @SimpleFunction
    /* renamed from: 字节集到十六进制  reason: contains not printable characters */
    public static String m595(byte[] b) {
        if (b == null) {
            return "";
        }
        try {
            if (b.length == 0) {
                return "";
            }
            byte[] o689D06 = "0123456789ABCDEF".getBytes();
            byte[] o628D1801 = new byte[b.length * 2];
            for (int o69 = 0; o69 < b.length; o69++) {
                o628D1801[o69 * 2] = o689D06[(b[o69] >> 4) & 15];
                o628D1801[(o69 * 2) + 1] = o689D06[b[o69] & 15];
            }
            return new String(o628D1801);
        } catch (Exception e) {
            return "";
        }
    }

    @SimpleFunction
    /* renamed from: 十六进制到字节集  reason: contains not printable characters */
    public static byte[] m587(String hexstr) {
        try {
            if (hexstr == null) {
                return new byte[0];
            }
            if (hexstr.equals("")) {
                return new byte[0];
            }
            byte[] o62 = new byte[hexstr.length() / 2];
            int o6A = 0;
            for (int o69 = 0; o69 < o62.length; o69++) {
                int o6A2 = o6A + 1;
                char o63C8 = hexstr.charAt(o6A);
                o6A = o6A2 + 1;
                char o63C9 = hexstr.charAt(o6A2);
                o62[o69] = (byte) ((parse(o63C8) << 4) | parse(o63C9));
            }
            return o62;
        } catch (Exception e) {
            return new byte[0];
        }
    }
}