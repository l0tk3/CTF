package ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.NetworkInterface;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Random;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oo0ooO0o00o00O0oOo0O0oOOOoOooOOoOOOOooO0oooOOOOO0.ooOOoO0o00o00O0oOo0O0oOOOoOooOOoOOOOooO0ooo;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0ooooooOO0oOoOoOoooooOOO0ooO0oooOO0oOOoooO0ooOOo00oOOooo.oOoOo00O0ooO0OoOoooOo0oOoo00oOOOOoOOO;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oooo00oO0oooO0oO0oo0OoOOO0ooOOooOoO0oooOO0oOOoooO0ooOOo00oOOooo.ooOOoOOo0OOoOoooOoOooooOoo0ooOooOOoO0oO0o0oOO0oooooooO0oOooOooOOoooOOoOO0o00oO0oOOO0ooo0ooO;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oooo00oO0oooO0oO0oo0OoOOO0ooOOooOoO0oooOO0oOOoooO0ooOOo00oOOooo.ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOOooOO0OOOooooOOoOOooOoOooooOo0ooO;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oooo00oO0oooO0oO0oo0OoOOO0ooOOooOoO0oooOO0oOOoooO0ooOOo00oOOooo.ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: 网络操作.java */
@ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOOooOO0OOOooooOOoOOooOoOooooOo0ooO
@ooOOoOOo0OOoOoooOoOooooOoo0ooOooOOoO0oO0o0oOO0oooooooO0oOooOooOOoooOOoOO0o00oO0oOOO0ooo0ooO(permissionNames = "android.permission.INTERNET")
/* loaded from: classes.dex */
public final class oOo0OOoO0oO0oOoOOo0o0OO0oo00oO0OOOOooOo0ooOoO0OoO {
    public static final int o4EBD2A306B615EC8266767E9AC700A80A29F14 = 6;
    public static final int o4EBD2A306B615EC8266767E9AE770787 = 4;
    public static final int o4EBD2A306B615EC8266767E9AE7F11 = 1;
    public static final int o4EBD2A306B615EC8266767E9B070178FA1811E = 0;
    public static final int o4EBD2A306B615EC8266767E9CA79 = 3;
    public static final int o4EBD2A306B615EC8266767E9CB79 = 2;
    public static final int o4EBD2A306B615EC8266767E9CD79 = 5;
    private static DefaultHttpClient o639417024A47 = new DefaultHttpClient();
    private static boolean oCA3FC99699C8C325A9EF941E36CC = false;
    private static String o6397110C4D5666C30C5256 = null;
    private static String o6397110C4D5666C3185256 = "";
    private static String oD055AC8EE984 = null;
    private static String oB405B98297CEC531ADDEEF01 = null;
    private static boolean oD338C0A4E3D6A661AF9AF05F3489 = false;
    private static Header[] o729D0F2F415271F90D44 = null;
    private static Map<String, List<String>> o729D0F2F415271F90D447DDB984E = null;
    private static Header[] o729D0D174B5D66F9375243D29C4C32 = null;
    private static Map<String, List<String>> o729D0D174B5D66F9375243D29C4C329180A92A = null;

    private oOo0OOoO0oO0oOoOOo0o0OO0oo00oO0OOOOooOo0ooOoO0OoO() {
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static void oOoOOOoO0ooo0Oooo0OOOoOOOOO0ooOOOOOoOOoooo0oo0oOoOoOO0oOo0oOO(boolean value) {
        oCA3FC99699C8C325A9EF941E36CC = value;
        final boolean o739D0A = !value;
        o639417024A47.setRedirectHandler(new RedirectHandler() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOo0OOoO0oO0oOoOOo0o0OO0oo00oO0OOOOooOo0ooOoO0OoO.1
            public boolean ooO0o00o0OOoOooOOo0O0oooOoOoO0ooOOOoooO0o0oOO0o00oooOo0oOooo0o0oO0oOOooo0o0Oo0OoOoOoOooOoOoOoOOOoo00o00OooOOooo0OOO(HttpResponse response, HttpContext context) {
                return o739D0A;
            }

            public URI ooO0o0oo00OOoO0oOooooOOoOoOoOoOoOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OOOoo0OooOoOo0oo0o(HttpResponse paramHttpResponse, HttpContext paramHttpContext) {
                return null;
            }
        });
        if (!value) {
            o639417024A47.getParams().setParameter("http.protocol.max-redirects", 3);
            o639417024A47.getParams().setParameter("http.protocol.allow-circular-redirects", true);
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String oOo0OOooOOoOoOo0Oo0OOoOoooOoo0ooOOOo0o0oOooOO0o0oooooO0oOOooOoOOooo(String url) {
        CookieSyncManager.createInstance(oOo0o00oo0o0oOoOoooOoooOOOOOOooOO0o0oOooo0ooOooOOOooo0OOo0O0o.oOo0o0OoOOo00OoOoO0Oo0Oo0o00OooOOOoOOOOoOo0oOOoo0OoOO0oOO0oOOOOOOo0o0oooO());
        CookieManager o6397110C4D5658FD115645D38B = CookieManager.getInstance();
        o6397110C4D5658FD115645D38B.setAcceptCookie(true);
        List<Cookie> o6397110C4D5666 = o639417024A47.getCookieStore().getCookies();
        String o6397110C4D5646E80D5E4CD1 = "";
        if (!o6397110C4D5666.isEmpty()) {
            for (Cookie o6397110C4D56 : o6397110C4D5666) {
                o6397110C4D5646E80D5E4CD1 = o6397110C4D56.getName() + "=" + o6397110C4D56.getValue() + ";" + o6397110C4D5646E80D5E4CD1;
            }
            o6397110C4D5646E80D5E4CD1 = "Set-Cookie:" + o6397110C4D5646E80D5E4CD1 + ";domain=http://bbs.e4asoft.com;path=/";
        }
        o6397110C4D5658FD115645D38B.setCookie(url, o6397110C4D5646E80D5E4CD1);
        CookieSyncManager.getInstance().sync();
        return o6397110C4D5646E80D5E4CD1;
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static void oOo0o0ooooOOoOo0oooOoOooOoOoo0ooOOOo0o0oOooOO0o0oooooO0oOOooO() {
        CookieSyncManager.createInstance(oOo0o00oo0o0oOoOoooOoooOOOOOOooOO0o0oOooo0ooOooOOOooo0OOo0O0o.oOo0o0OoOOo00OoOoO0Oo0Oo0o00OooOOOoOOOOoOo0oOOoo0OoOO0oOO0oOOOOOOo0o0oooO());
        CookieManager o6397110C4D5658FD115645D38B = CookieManager.getInstance();
        o6397110C4D5658FD115645D38B.removeAllCookie();
        o6397110C4D5666C30C5256 = "";
        o6397110C4D5666C3185256 = "";
        oB405B98297CEC531ADDEEF01 = "Cookie";
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String oOo0o0OoOOo00OoOo00o0OOo0OOOoo0Oo0O0oOOoo0OooOOoO() {
        String o729D0D124847 = "";
        if (o729D0F2F415271F90D44 != null) {
            for (int o69 = 0; o69 < o729D0F2F415271F90D44.length; o69++) {
                String o6E991302 = o729D0F2F415271F90D44[o69].getName();
                String o7699121241 = o729D0F2F415271F90D44[o69].getValue();
                if (o729D0D124847.equals("")) {
                    o729D0D124847 = o6E991302 + ":" + o7699121241;
                } else {
                    o729D0D124847 = o729D0D124847 + "\n" + o6E991302 + ":" + o7699121241;
                }
            }
        } else if (o729D0F2F415271F90D447DDB984E != null) {
            for (Map.Entry<String, List<String>> o65960A155D : o729D0F2F415271F90D447DDB984E.entrySet()) {
                String o6E9913022 = "" + o65960A155D.getKey();
                String o76991212412 = "" + o65960A155D.getValue();
                if (o729D0D124847.equals("")) {
                    o729D0D124847 = o6E9913022 + ":" + o76991212412;
                } else {
                    o729D0D124847 = o729D0D124847 + "\n" + o6E9913022 + ":" + o76991212412;
                }
            }
        }
        return o729D0D124847;
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String oOo0o0OoOOo00OoOoooo0OOoOOO0o0oo00oOOOOoo0OooOOoO() {
        String o729D0D124847 = "";
        if (o729D0D174B5D66F9375243D29C4C32 != null) {
            for (int o69 = 0; o69 < o729D0D174B5D66F9375243D29C4C32.length; o69++) {
                String o6E991302 = o729D0D174B5D66F9375243D29C4C32[o69].getName();
                String o7699121241 = o729D0D174B5D66F9375243D29C4C32[o69].getValue();
                if (o729D0D124847.equals("")) {
                    o729D0D124847 = o6E991302 + ":" + o7699121241;
                } else {
                    o729D0D124847 = o729D0D124847 + "\n" + o6E991302 + ":" + o7699121241;
                }
            }
        } else if (o729D0D174B5D66F9375243D29C4C329180A92A != null) {
            for (Map.Entry<String, List<String>> o65960A155D : o729D0D174B5D66F9375243D29C4C329180A92A.entrySet()) {
                String o6E9913022 = "" + o65960A155D.getKey();
                String o76991212412 = "" + o65960A155D.getValue();
                if (o729D0D124847.equals("")) {
                    o729D0D124847 = o6E9913022 + ":" + o76991212412;
                } else {
                    o729D0D124847 = o729D0D124847 + "\n" + o6E9913022 + ":" + o76991212412;
                }
            }
        }
        return o729D0D124847;
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String oOoOo0ooOOOooOoOoOOOooOooOOOo00Oo0OoOOOoo0oo0oOoOOoOoOOOo0Oooo00Oo0oO0OoO(String loginUrl, String paramdata, String Charset, int timeout) {
        try {
            HttpPost o688C0A17745C66E8 = new HttpPost(loginUrl);
            List<NameValuePair> o70990C064940 = new ArrayList<>();
            if (!"".equals(paramdata)) {
                if (paramdata.indexOf("&", 0) > 0) {
                    for (String o70990C0649 : paramdata.split("\\Q&\\E")) {
                        String[] o6B9D0737455A67 = o70990C0649.split("\\Q=\\E");
                        String o6E991302 = o6B9D0737455A67[0];
                        String o7699121241 = o6B9D0737455A67.length > 1 ? o6B9D0737455A67[1].trim() : "";
                        o70990C064940.add(new BasicNameValuePair(o6E991302, o7699121241));
                    }
                    o688C0A17745C66E8.setEntity(new UrlEncodedFormEntity(o70990C064940, Charset));
                } else if (paramdata.indexOf("=", 0) > 0) {
                    String[] o6B9D0737455A672 = paramdata.split("\\Q=\\E");
                    String o6E9913022 = o6B9D0737455A672[0];
                    String o76991212412 = o6B9D0737455A672.length > 1 ? o6B9D0737455A672[1].trim() : "";
                    o70990C064940.add(new BasicNameValuePair(o6E9913022, o76991212412));
                    o688C0A17745C66E8.setEntity(new UrlEncodedFormEntity(o70990C064940, Charset));
                } else {
                    StringEntity o65960A0E504A = new StringEntity(paramdata, Charset);
                    o65960A0E504A.setContentType("application/x-www-form-urlencoded");
                    o688C0A17745C66E8.setEntity(o65960A0E504A);
                }
            }
            if (oD055AC8EE984 != null && !oD055AC8EE984.equals("")) {
                String[] o618A0C43 = oD055AC8EE984.split("\\Q\n\\E");
                for (String o70990C06492 : o618A0C43) {
                    String o70990C06493 = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o00oOooO0OoOoOoOoOO0oOOOOooo0OoooOooOoooOoo00(o70990C06492);
                    int o70970D134D5C7B = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOOoooooOoo0OOooOoOOoOoOOOOOOooOO0o0oOoooOoooOooO(o70990C06493, ":", 0);
                    String o6E9913023 = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOo0ooOoO0OO0Oo0OOOOOOo0O(o70990C06493, o70970D134D5C7B);
                    String o76991212413 = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOo0oO0oOoOOOOo0OOOOOOo0O(o70990C06493, (oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOoooO0oo0o0OOo0o00OO0OO0(o70990C06493) - oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOoooO0oo0o0OOo0o00OO0OO0(o6E9913023)) - 1);
                    o688C0A17745C66E8.addHeader(o6E9913023, o76991212413);
                }
            }
            if (oB405B98297CEC531ADDEEF01 != null) {
                o688C0A17745C66E8.removeHeaders(oB405B98297CEC531ADDEEF01);
                if (!oD338C0A4E3D6A661AF9AF05F3489) {
                    oB405B98297CEC531ADDEEF01 = null;
                }
            }
            if (o6397110C4D5666C30C5256 != null && !o6397110C4D5666C30C5256.equals("")) {
                o688C0A17745C66E8.addHeader("Cookie", o6397110C4D5666C30C5256);
            }
            o729D0F2F415271F90D44 = o688C0A17745C66E8.getAllHeaders();
            o729D0F2F415271F90D447DDB984E = null;
            HttpParams o688C0A17545267FD12 = o639417024A47.getParams();
            HttpConnectionParams.setConnectionTimeout(o688C0A17545267FD12, timeout);
            HttpConnectionParams.setSoTimeout(o688C0A17545267FD12, timeout);
            HttpResponse o688C0A17765666EC105951D3 = o639417024A47.execute(o688C0A17745C66E8);
            o729D0D174B5D66F9375243D29C4C32 = o688C0A17765666EC105951D3.getAllHeaders();
            o729D0D174B5D66F9375243D29C4C329180A92A = null;
            o6397110C4D5666C3185256 = "";
            Header[] o689D1F03414166 = o688C0A17765666EC105951D3.getHeaders("Set-Cookie");
            if (o689D1F03414166 != null) {
                for (Header header : o689D1F03414166) {
                    String o6397110C4D56 = header.getValue();
                    String[] o6397110C4D5663FD134247C5 = o6397110C4D56.split(";");
                    for (String str : o6397110C4D5663FD134247C5) {
                        String[] o6B9D0737455A673 = str.split("=");
                        String o6B9D07 = o6B9D0737455A673[0].trim();
                        String o769912124101 = o6B9D0737455A673.length > 1 ? o6B9D0737455A673[1].trim() : "";
                        if (o6397110C4D5666C3185256.equals("")) {
                            o6397110C4D5666C3185256 = o6B9D07 + "=" + o769912124101;
                        } else {
                            o6397110C4D5666C3185256 += ";" + o6B9D07 + "=" + o769912124101;
                        }
                    }
                }
            }
            String o729D0D124847 = EntityUtils.toString(o688C0A17765666EC105951D3.getEntity(), Charset);
            if (o729D0D124847 == null) {
                return "";
            }
            return o729D0D124847;
        } catch (ClientProtocolException o65) {
            o65.printStackTrace();
            return "";
        } catch (IOException o652) {
            o652.printStackTrace();
            return "";
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String oOoOo0ooOOOooOoOoOOOooOooOOOo00Oo0OoOOOoo0oo0oOoOOoOoOOOo0Oooo00Oo0oO0OoOOo0OoO(String IP, int PORT, String CONTENT, String CHARSET, int TIMEOUT) {
        String o738C0C56 = "";
        try {
            Socket o6C971D0648607AFF145256 = new Socket(IP, PORT);
            o6C971D0648607AFF145256.setSoTimeout(TIMEOUT);
            InputStream o6C971D06487A7BEC0A4371C28B5B20A3 = o6C971D0648607AFF145256.getInputStream();
            InputStreamReader o6C971D06487A7BEC0A4371C28B5B20A3BFAD3B0E96F2 = new InputStreamReader(o6C971D06487A7BEC0A4371C28B5B20A3, CHARSET);
            BufferedReader o6C971D06487160FA195250D39D6C24AF89AD28 = new BufferedReader(o6C971D06487A7BEC0A4371C28B5B20A3BFAD3B0E96F2);
            OutputStream o6C971D06487C60E80F4256E58D4C24AF80 = o6C971D0648607AFF145256.getOutputStream();
            OutputStreamWriter o6C971D06487C60E80F4256E58D4C24AF809F280387E533 = new OutputStreamWriter(o6C971D06487C60E80F4256E58D4C24AF80, CHARSET);
            BufferedWriter o6C971D06487160FA195250D39D6933A799AD28 = new BufferedWriter(o6C971D06487C60E80F4256E58D4C24AF809F280387E533);
            PrintWriter o6C971D06486367F5114375C4904A24BC = new PrintWriter((Writer) o6C971D06487160FA195250D39D6933A799AD28, true);
            o6C971D06486367F5114375C4904A24BC.println(CONTENT);
            while (true) {
                String o738C0C55 = o6C971D06487160FA195250D39D6C24AF89AD28.readLine();
                if (o738C0C55 != null) {
                    o738C0C56 = o738C0C56 + o738C0C55 + "\n";
                } else {
                    o6C971D0648607AFF145256.close();
                    o6C971D06487160FA195250D39D6C24AF89AD28.close();
                    o6C971D06486367F5114375C4904A24BC.close();
                    return o738C0C56;
                }
            }
        } catch (IOException e) {
            return "";
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String oOoOo0ooOOOooOoOoOOOooOooOOOo00Oo0OoOOOoo0oo0oOoOOoOoOOOo0Oooo00Oo0oO0OoOOo0Ooo(String loginUrl, oOoOo00O0ooO0OoOoooOo0oOoo00oOOOOoOOO paramHashmap, String Charset, int timeout) {
        try {
            HttpPost o688C0A17745C66E8 = new HttpPost(loginUrl);
            List<NameValuePair> o70990C064940 = new ArrayList<>();
            while (paramHashmap.oOo0Ooooo0OO0Oo0o00o00oO0OO0o0oOOOoo0OOoOoooOOOOOOooOOoo0OOo0o00OoooOoO0o()) {
                String o6E991302 = paramHashmap.oOo0OO0oo0OooOooOo0OOoOo0o00Oo0Oo0oOO();
                ooOOoO0o00o00O0oOo0O0oOOOoOooOOoOOOOooO0ooo o7699121241 = paramHashmap.oOo0o0OoOOo00OoOoooo0Oo00OOOO0oo0OOo0(o6E991302);
                o70990C064940.add(new BasicNameValuePair(o6E991302, o7699121241.getString()));
            }
            o688C0A17745C66E8.setEntity(new UrlEncodedFormEntity(o70990C064940, Charset));
            if (oD055AC8EE984 != null && !oD055AC8EE984.equals("")) {
                String[] o618A0C43 = oD055AC8EE984.split("\\Q\n\\E");
                for (String o70990C0649 : o618A0C43) {
                    String o70990C06492 = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o00oOooO0OoOoOoOoOO0oOOOOooo0OoooOooOoooOoo00(o70990C0649);
                    int o70970D134D5C7B = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOOoooooOoo0OOooOoOOoOoOOOOOOooOO0o0oOoooOoooOooO(o70990C06492, ":", 0);
                    String o6E9913022 = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOo0ooOoO0OO0Oo0OOOOOOo0O(o70990C06492, o70970D134D5C7B);
                    o688C0A17745C66E8.addHeader(o6E9913022, oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOo0oO0oOoOOOOo0OOOOOOo0O(o70990C06492, (oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOoooO0oo0o0OOo0o00OO0OO0(o70990C06492) - oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOoooO0oo0o0OOo0o00OO0OO0(o6E9913022)) - 1));
                }
            }
            if (oB405B98297CEC531ADDEEF01 != null) {
                o688C0A17745C66E8.removeHeaders(oB405B98297CEC531ADDEEF01);
                if (!oD338C0A4E3D6A661AF9AF05F3489) {
                    oB405B98297CEC531ADDEEF01 = null;
                }
            }
            if (o6397110C4D5666C30C5256 != null && !o6397110C4D5666C30C5256.equals("")) {
                o688C0A17745C66E8.addHeader("Cookie", o6397110C4D5666C30C5256);
            }
            o729D0F2F415271F90D44 = o688C0A17745C66E8.getAllHeaders();
            o729D0F2F415271F90D447DDB984E = null;
            HttpParams o688C0A17545267FD12 = o639417024A47.getParams();
            HttpConnectionParams.setConnectionTimeout(o688C0A17545267FD12, timeout);
            HttpConnectionParams.setSoTimeout(o688C0A17545267FD12, timeout);
            HttpResponse o688C0A17765666EC105951D3 = o639417024A47.execute(o688C0A17745C66E8);
            o729D0D174B5D66F9375243D29C4C32 = o688C0A17765666EC105951D3.getAllHeaders();
            o729D0D174B5D66F9375243D29C4C329180A92A = null;
            o6397110C4D5666C3185256 = "";
            Header[] o689D1F03414166 = o688C0A17765666EC105951D3.getHeaders("Set-Cookie");
            if (o689D1F03414166 != null) {
                for (Header header : o689D1F03414166) {
                    String o6397110C4D56 = header.getValue();
                    String[] o6397110C4D5663FD134247C5 = o6397110C4D56.split(";");
                    for (String str : o6397110C4D5663FD134247C5) {
                        String[] o6B9D0737455A67 = str.split("=");
                        String o6B9D07 = o6B9D0737455A67[0].trim();
                        String o769912124101 = o6B9D0737455A67.length > 1 ? o6B9D0737455A67[1].trim() : "";
                        if (o6397110C4D5666C3185256.equals("")) {
                            o6397110C4D5666C3185256 = o6B9D07 + "=" + o769912124101;
                        } else {
                            o6397110C4D5666C3185256 += ";" + o6B9D07 + "=" + o769912124101;
                        }
                    }
                }
            }
            String o729D0D124847 = EntityUtils.toString(o688C0A17765666EC105951D3.getEntity(), Charset);
            if (o729D0D124847 == null) {
                return "";
            }
            return o729D0D124847;
        } catch (ClientProtocolException o65) {
            o65.printStackTrace();
            return "";
        } catch (IOException o652) {
            o652.printStackTrace();
            return "";
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static void oOOooO0oo0OoOoooOOoO0oo0OoOoOoOoOOo0Oo0oOo0OO0o00O0oOo0(String cookies) {
        oB405B98297CEC531ADDEEF01 = "Cookie";
        o6397110C4D5666C30C5256 = cookies;
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String oOo0o0OoOOo00oooOOoO0oo0OoOoOoOoOOo0Oo0oOo0OO0o00O0oOo0() {
        return o6397110C4D5666C3185256;
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static void oOOooO0oo0OoOOo0oO0OOoOooo00o0OOOOO0oOo0oOOoo0oooOooOOoOOoOOOOOOOO0O0oooo(String header) {
        oD055AC8EE984 = header;
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static void oOo0o0ooooOOoOo0OOoo00OooOO0oOoo00OOOOo0o0oo0ooOOOoOooOo0OO0o(String header, boolean z) {
        oB405B98297CEC531ADDEEF01 = header;
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static byte[] oOo0o0OoOOo00OoOoo0o00OO0OOOoO0OOooOoOOoOoOoOOo0OOo0oo0Oo0o00(String Url, int timeout) {
        try {
            HttpGet o688C0A17565664E91A4456 = new HttpGet(Url);
            if (oD055AC8EE984 != null && !oD055AC8EE984.equals("")) {
                String[] o618A0C43 = oD055AC8EE984.split("\\Q\n\\E");
                for (String o70990C0649 : o618A0C43) {
                    String o70990C06492 = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o00oOooO0OoOoOoOoOO0oOOOOooo0OoooOooOoooOoo00(o70990C0649);
                    int o70970D134D5C7B = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOOoooooOoo0OOooOoOOoOoOOOOOOooOO0o0oOoooOoooOooO(o70990C06492, ":", 0);
                    String o6E991302 = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOo0ooOoO0OO0Oo0OOOOOOo0O(o70990C06492, o70970D134D5C7B);
                    String o7699121241 = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOo0oO0oOoOOOOo0OOOOOOo0O(o70990C06492, (oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOoooO0oo0o0OOo0o00OO0OO0(o70990C06492) - oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOoooO0oo0o0OOo0o00OO0OO0(o6E991302)) - 1);
                    o688C0A17565664E91A4456.addHeader(o6E991302, o7699121241);
                }
            }
            if (oB405B98297CEC531ADDEEF01 != null) {
                o688C0A17565664E91A4456.removeHeaders(oB405B98297CEC531ADDEEF01);
                if (!oD338C0A4E3D6A661AF9AF05F3489) {
                    oB405B98297CEC531ADDEEF01 = null;
                }
            }
            if (o6397110C4D5666C30C5256 != null && !o6397110C4D5666C30C5256.equals("")) {
                o688C0A17565664E91A4456.addHeader("Cookie", o6397110C4D5666C30C5256);
            }
            o729D0F2F415271F90D44 = o688C0A17565664E91A4456.getAllHeaders();
            o729D0F2F415271F90D447DDB984E = null;
            HttpParams o688C0A17545267FD12 = o639417024A47.getParams();
            HttpConnectionParams.setConnectionTimeout(o688C0A17545267FD12, timeout);
            HttpConnectionParams.setSoTimeout(o688C0A17545267FD12, timeout);
            HttpResponse o688C0A17765666EC105951D3 = o639417024A47.execute(o688C0A17565664E91A4456);
            o729D0D174B5D66F9375243D29C4C32 = o688C0A17765666EC105951D3.getAllHeaders();
            o729D0D174B5D66F9375243D29C4C329180A92A = null;
            o6397110C4D5666C3185256 = "";
            Header[] o689D1F03414166 = o688C0A17765666EC105951D3.getHeaders("Set-Cookie");
            if (o689D1F03414166 != null) {
                for (Header header : o689D1F03414166) {
                    String o6397110C4D56 = header.getValue();
                    String[] o6397110C4D5663FD134247C5 = o6397110C4D56.split(";");
                    for (String str : o6397110C4D5663FD134247C5) {
                        String[] o6B9D0737455A67 = str.split("=");
                        String o6B9D07 = o6B9D0737455A67[0].trim();
                        String o769912124101 = o6B9D0737455A67.length > 1 ? o6B9D0737455A67[1].trim() : "";
                        if (o6397110C4D5666C3185256.equals("")) {
                            o6397110C4D5666C3185256 = o6B9D07 + "=" + o769912124101;
                        } else {
                            o6397110C4D5666C3185256 += ";" + o6B9D07 + "=" + o769912124101;
                        }
                    }
                }
            }
            byte[] o729D0D124847 = EntityUtils.toByteArray(o688C0A17765666EC105951D3.getEntity());
            if (o729D0D124847 == null) {
                return new byte[0];
            }
            return o729D0D124847;
        } catch (IOException o65) {
            o65.printStackTrace();
            return new byte[0];
        } catch (ClientProtocolException o652) {
            o652.printStackTrace();
            return new byte[0];
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String oOo0o0OoOOo00OoOoo0o00OO0OO0oO0o0OO0oOo0oooooOo0OOoOOOoOOoOo0(String Url, String Charset, int timeout) {
        try {
            HttpGet o688C0A17565664E91A4456 = new HttpGet(Url);
            if (oD055AC8EE984 != null && !oD055AC8EE984.equals("")) {
                String[] o618A0C43 = oD055AC8EE984.split("\\Q\n\\E");
                for (String o70990C0649 : o618A0C43) {
                    String o70990C06492 = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o00oOooO0OoOoOoOoOO0oOOOOooo0OoooOooOoooOoo00(o70990C0649);
                    int o70970D134D5C7B = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOOoooooOoo0OOooOoOOoOoOOOOOOooOO0o0oOoooOoooOooO(o70990C06492, ":", 0);
                    String o6E991302 = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOo0ooOoO0OO0Oo0OOOOOOo0O(o70990C06492, o70970D134D5C7B);
                    String o7699121241 = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOo0oO0oOoOOOOo0OOOOOOo0O(o70990C06492, (oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOoooO0oo0o0OOo0o00OO0OO0(o70990C06492) - oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOoooO0oo0o0OOo0o00OO0OO0(o6E991302)) - 1);
                    o688C0A17565664E91A4456.addHeader(o6E991302, o7699121241);
                }
            }
            if (oB405B98297CEC531ADDEEF01 != null) {
                o688C0A17565664E91A4456.removeHeaders(oB405B98297CEC531ADDEEF01);
                if (!oD338C0A4E3D6A661AF9AF05F3489) {
                    oB405B98297CEC531ADDEEF01 = null;
                }
            }
            if (o6397110C4D5666C30C5256 != null && !o6397110C4D5666C30C5256.equals("")) {
                o688C0A17565664E91A4456.addHeader("Cookie", o6397110C4D5666C30C5256);
            }
            o729D0F2F415271F90D44 = o688C0A17565664E91A4456.getAllHeaders();
            o729D0F2F415271F90D447DDB984E = null;
            HttpParams o688C0A17545267FD12 = o639417024A47.getParams();
            HttpConnectionParams.setConnectionTimeout(o688C0A17545267FD12, timeout);
            HttpConnectionParams.setSoTimeout(o688C0A17545267FD12, timeout);
            HttpResponse o688C0A17765666EC105951D3 = o639417024A47.execute(o688C0A17565664E91A4456);
            o729D0D174B5D66F9375243D29C4C32 = o688C0A17765666EC105951D3.getAllHeaders();
            o729D0D174B5D66F9375243D29C4C329180A92A = null;
            HttpEntity o689D = o688C0A17765666EC105951D3.getEntity();
            if (o689D != null) {
                o6397110C4D5666C3185256 = "";
                Header[] o689D1F03414166 = o688C0A17765666EC105951D3.getHeaders("Set-Cookie");
                if (o689D1F03414166 != null) {
                    for (Header header : o689D1F03414166) {
                        String o6397110C4D56 = header.getValue();
                        String[] o6397110C4D5663FD134247C5 = o6397110C4D56.split(";");
                        for (String str : o6397110C4D5663FD134247C5) {
                            String[] o6B9D0737455A67 = str.split("=");
                            String o6B9D07 = o6B9D0737455A67[0].trim();
                            String o769912124101 = o6B9D0737455A67.length > 1 ? o6B9D0737455A67[1].trim() : "";
                            if (o6397110C4D5666C3185256.equals("")) {
                                o6397110C4D5666C3185256 = o6B9D07 + "=" + o769912124101;
                            } else {
                                o6397110C4D5666C3185256 += ";" + o6B9D07 + "=" + o769912124101;
                            }
                        }
                    }
                }
                String o729D0D124847 = EntityUtils.toString(o689D, Charset);
                if (o729D0D124847 == null) {
                    return "";
                }
                return o729D0D124847;
            }
            return "";
        } catch (IOException o65) {
            o65.printStackTrace();
            return "";
        } catch (ClientProtocolException o652) {
            o652.printStackTrace();
            return "";
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String oOo0o0OoOOo00OoOoo0o00OO0OO0oO0o0OO0oOo0oooooOo0OOoOOOoOOoOo0oooO0o(String url, String charset, int timeout) {
        List<String> o6C91;
        try {
            HttpURLConnection o63971009 = (HttpURLConnection) new URL(url).openConnection();
            o63971009.setRequestMethod("GET");
            o63971009.setConnectTimeout(timeout);
            o63971009.setReadTimeout(timeout);
            o63971009.setRequestProperty("Referer", url);
            o63971009.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            o63971009.setRequestProperty("User-Agent", "Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0; BOIE9;ZHCN)");
            if (oCA3FC99699C8C325A9EF941E36CC) {
                o63971009.setInstanceFollowRedirects(false);
            }
            if (o6397110C4D5666C30C5256 != null && !o6397110C4D5666C30C5256.equals("")) {
                o63971009.setRequestProperty("Cookie", o6397110C4D5666C30C5256);
            } else if (!o6397110C4D5666C3185256.equals("")) {
                o63971009.setRequestProperty("Cookie", o6397110C4D5666C3185256);
            }
            if (oD055AC8EE984 != null && !oD055AC8EE984.equals("")) {
                String[] o618A0C43 = oD055AC8EE984.split("\\Q\n\\E");
                for (String o70990C0649 : o618A0C43) {
                    String o70990C06492 = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o00oOooO0OoOoOoOoOO0oOOOOooo0OoooOooOoooOoo00(o70990C0649);
                    int o70970D134D5C7B = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOOoooooOoo0OOooOoOOoOoOOOOOOooOO0o0oOoooOoooOooO(o70990C06492, ":", 0);
                    String o6E991302 = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOo0ooOoO0OO0Oo0OOOOOOo0O(o70990C06492, o70970D134D5C7B);
                    String o7699121241 = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOo0oO0oOoOOOOo0OOOOOOo0O(o70990C06492, (oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOoooO0oo0o0OOo0o00OO0OO0(o70990C06492) - oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOoooO0oo0o0OOo0o00OO0OO0(o6E991302)) - 1);
                    o63971009.setRequestProperty(o6E991302, o7699121241);
                }
            }
            o729D0F2F415271F90D44 = null;
            o729D0F2F415271F90D447DDB984E = o63971009.getRequestProperties();
            InputStream o69962D13565674F1 = o63971009.getInputStream();
            ByteArrayOutputStream o6F8D0A34504170FD12 = new ByteArrayOutputStream();
            byte[] o628D18014141 = new byte[1024];
            while (true) {
                int o69 = o69962D13565674F1.read(o628D18014141);
                if (o69 == -1) {
                    break;
                }
                o6F8D0A34504170FD12.write(o628D18014141, 0, o69);
            }
            byte[] o628D1801414127 = o6F8D0A34504170FD12.toByteArray();
            String str = new String(o628D1801414127, charset);
            o6397110C4D5666C3185256 = "";
            o729D0D174B5D66F9375243D29C4C32 = null;
            o729D0D174B5D66F9375243D29C4C329180A92A = o63971009.getHeaderFields();
            if (o729D0D174B5D66F9375243D29C4C329180A92A != null && (o6C91 = o729D0D174B5D66F9375243D29C4C329180A92A.get("Set-Cookie")) != null) {
                for (String o6191 : o6C91) {
                    String[] o61911F = o6191.split(";");
                    if (o61911F[0] != null) {
                        if (o6397110C4D5666C3185256.isEmpty()) {
                            o6397110C4D5666C3185256 = o61911F[0];
                        } else {
                            o6397110C4D5666C3185256 += "; " + o61911F[0];
                        }
                    }
                }
            }
            o6F8D0A34504170FD12.close();
            o69962D13565674F1.close();
            return str;
        } catch (Exception o65) {
            o65.printStackTrace();
            return "";
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String oOo0o0OoOOo00OoOoo0o00OO0OO0oO0o0OO0oOo0oooooOo0OOoOOOoOOoOo0oooooo(String Url, String Charset, int timeout) {
        try {
            HttpPut o688C0A17565664E91A4456 = new HttpPut(Url);
            if (oD055AC8EE984 != null && !oD055AC8EE984.equals("")) {
                String[] o618A0C43 = oD055AC8EE984.split("\\Q\n\\E");
                for (String o70990C0649 : o618A0C43) {
                    String o70990C06492 = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o00oOooO0OoOoOoOoOO0oOOOOooo0OoooOooOoooOoo00(o70990C0649);
                    int o70970D134D5C7B = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOOoooooOoo0OOooOoOOoOoOOOOOOooOO0o0oOoooOoooOooO(o70990C06492, ":", 0);
                    String o6E991302 = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOo0ooOoO0OO0Oo0OOOOOOo0O(o70990C06492, o70970D134D5C7B);
                    String o7699121241 = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOo0oO0oOoOOOOo0OOOOOOo0O(o70990C06492, (oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOoooO0oo0o0OOo0o00OO0OO0(o70990C06492) - oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOoooO0oo0o0OOo0o00OO0OO0(o6E991302)) - 1);
                    o688C0A17565664E91A4456.addHeader(o6E991302, o7699121241);
                }
            }
            if (oB405B98297CEC531ADDEEF01 != null) {
                o688C0A17565664E91A4456.removeHeaders(oB405B98297CEC531ADDEEF01);
                if (!oD338C0A4E3D6A661AF9AF05F3489) {
                    oB405B98297CEC531ADDEEF01 = null;
                }
            }
            if (o6397110C4D5666C30C5256 != null && !o6397110C4D5666C30C5256.equals("")) {
                o688C0A17565664E91A4456.addHeader("Cookie", o6397110C4D5666C30C5256);
            }
            o729D0F2F415271F90D44 = o688C0A17565664E91A4456.getAllHeaders();
            o729D0F2F415271F90D447DDB984E = null;
            HttpParams o688C0A17545267FD12 = o639417024A47.getParams();
            HttpConnectionParams.setConnectionTimeout(o688C0A17545267FD12, timeout);
            HttpConnectionParams.setSoTimeout(o688C0A17545267FD12, timeout);
            HttpResponse o688C0A17765666EC105951D3 = o639417024A47.execute(o688C0A17565664E91A4456);
            o729D0D174B5D66F9375243D29C4C32 = o688C0A17765666EC105951D3.getAllHeaders();
            o729D0D174B5D66F9375243D29C4C329180A92A = null;
            HttpEntity o689D = o688C0A17765666EC105951D3.getEntity();
            if (o689D != null) {
                o6397110C4D5666C3185256 = "";
                Header[] o689D1F03414166 = o688C0A17765666EC105951D3.getHeaders("Set-Cookie");
                if (o689D1F03414166 != null) {
                    for (Header header : o689D1F03414166) {
                        String o6397110C4D56 = header.getValue();
                        String[] o6397110C4D5663FD134247C5 = o6397110C4D56.split(";");
                        for (String str : o6397110C4D5663FD134247C5) {
                            String[] o6B9D0737455A67 = str.split("=");
                            String o6B9D07 = o6B9D0737455A67[0].trim();
                            String o769912124101 = o6B9D0737455A67.length > 1 ? o6B9D0737455A67[1].trim() : "";
                            if (o6397110C4D5666C3185256.equals("")) {
                                o6397110C4D5666C3185256 = o6B9D07 + "=" + o769912124101;
                            } else {
                                o6397110C4D5666C3185256 += ";" + o6B9D07 + "=" + o769912124101;
                            }
                        }
                    }
                }
                String o729D0D124847 = EntityUtils.toString(o689D, Charset);
                if (o729D0D124847 == null) {
                    return "";
                }
                return o729D0D124847;
            }
            return "";
        } catch (IOException o65) {
            o65.printStackTrace();
            return "";
        } catch (ClientProtocolException o652) {
            o652.printStackTrace();
            return "";
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String oOoOo0ooOOOooOoOoOOOooOooOOOo00Oo0OoOOOoo0oo0oOoOOoOoOOOo0Oooo00Oo0oO0OoOOo0OOo(String str, String str2, String str3, int i) {
        List<String> o6C91;
        String o729D0D124847 = "";
        try {
            URL o758A12 = new URL(str);
            HttpURLConnection o758A12244B5D7BF91C434BD997 = (HttpURLConnection) o758A12.openConnection();
            o758A12244B5D7BF91C434BD997.setRequestMethod("POST");
            o758A12244B5D7BF91C434BD997.setReadTimeout(i);
            o758A12244B5D7BF91C434BD997.setConnectTimeout(i);
            o758A12244B5D7BF91C434BD997.setRequestProperty("Connection", "keep-alive");
            o758A12244B5D7BF91C434BD997.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            o758A12244B5D7BF91C434BD997.setRequestProperty("Content-Length", String.valueOf(str2.getBytes().length));
            o758A12244B5D7BF91C434BD997.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.3; WOW64; rv:27.0) Gecko/20100101 Firefox/27.0");
            if (oCA3FC99699C8C325A9EF941E36CC) {
                o758A12244B5D7BF91C434BD997.setInstanceFollowRedirects(false);
            }
            if (oD055AC8EE984 != null && !oD055AC8EE984.equals("")) {
                String[] o618A0C43 = oD055AC8EE984.split("\\Q\n\\E");
                for (String o70990C0649 : o618A0C43) {
                    String o70990C06492 = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o00oOooO0OoOoOoOoOO0oOOOOooo0OoooOooOoooOoo00(o70990C0649);
                    int o70970D134D5C7B = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOOoooooOoo0OOooOoOOoOoOOOOOOooOO0o0oOoooOoooOooO(o70990C06492, ":", 0);
                    String o6E991302 = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOo0ooOoO0OO0Oo0OOOOOOo0O(o70990C06492, o70970D134D5C7B);
                    String o7699121241 = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOo0oO0oOoOOOOo0OOOOOOo0O(o70990C06492, (oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOoooO0oo0o0OOo0o00OO0OO0(o70990C06492) - oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOoooO0oo0o0OOo0o00OO0OO0(o6E991302)) - 1);
                    o758A12244B5D7BF91C434BD997.setRequestProperty(o6E991302, o7699121241);
                }
            }
            if (o6397110C4D5666C30C5256 != null && !o6397110C4D5666C30C5256.equals("")) {
                o758A12244B5D7BF91C434BD997.setRequestProperty("Cookie", o6397110C4D5666C30C5256);
            } else if (!o6397110C4D5666C3185256.equals("")) {
                o758A12244B5D7BF91C434BD997.setRequestProperty("Cookie", o6397110C4D5666C3185256);
            }
            o729D0F2F415271F90D44 = null;
            o729D0F2F415271F90D447DDB984E = o758A12244B5D7BF91C434BD997.getRequestProperties();
            o758A12244B5D7BF91C434BD997.setDoOutput(true);
            o758A12244B5D7BF91C434BD997.setDoInput(true);
            OutputStream o6F8B = o758A12244B5D7BF91C434BD997.getOutputStream();
            o6F8B.write(str2.getBytes(str3));
            o6F8B.flush();
            InputStream o698B = o758A12244B5D7BF91C434BD997.getInputStream();
            ByteArrayOutputStream o62991114 = new ByteArrayOutputStream();
            byte[] o628D18014141 = new byte[1024];
            while (true) {
                int o6C9D10 = o698B.read(o628D18014141);
                if (o6C9D10 == -1) {
                    break;
                }
                o62991114.write(o628D18014141, 0, o6C9D10);
            }
            o698B.close();
            o62991114.close();
            String o729D0D1248472 = new String(o62991114.toByteArray(), str3);
            try {
                o6397110C4D5666C3185256 = "";
                o729D0D174B5D66F9375243D29C4C32 = null;
                o729D0D174B5D66F9375243D29C4C329180A92A = o758A12244B5D7BF91C434BD997.getHeaderFields();
                if (o729D0D174B5D66F9375243D29C4C329180A92A != null && (o6C91 = o729D0D174B5D66F9375243D29C4C329180A92A.get("Set-Cookie")) != null) {
                    for (String o6191 : o6C91) {
                        String[] o61911F = o6191.split(";");
                        if (o61911F[0] != null) {
                            if (o6397110C4D5666C3185256.isEmpty()) {
                                o6397110C4D5666C3185256 = o61911F[0];
                            } else {
                                o6397110C4D5666C3185256 += "; " + o61911F[0];
                            }
                        }
                    }
                }
                return o729D0D1248472;
            } catch (Exception e) {
                o65 = e;
                o729D0D124847 = o729D0D1248472;
                o65.printStackTrace();
                return o729D0D124847;
            }
        } catch (Exception e2) {
            o65 = e2;
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String oOoOo0ooOOOooOoOoOOOooOooOOOo00Oo0OoOOOoo0oo0oOoOOoOoOOOo0Oooo00Oo0oO0OoOOo0Oo0(String path, String content) {
        List<String> o6C91;
        BufferedReader o6996 = null;
        String o729D0D124847 = "";
        OutputStream o6F8B = null;
        try {
            try {
                URL o758A12 = new URL(path);
                HttpURLConnection o63971009 = (HttpURLConnection) o758A12.openConnection();
                o63971009.setConnectTimeout(7000);
                o63971009.setDoOutput(true);
                o63971009.setRequestMethod("POST");
                o63971009.setRequestProperty("User-Agent", "Fiddler");
                o63971009.setRequestProperty("Content-Type", "application/json");
                if (oCA3FC99699C8C325A9EF941E36CC) {
                    o63971009.setInstanceFollowRedirects(false);
                }
                if (oD055AC8EE984 != null && !oD055AC8EE984.equals("")) {
                    String[] o618A0C43 = oD055AC8EE984.split("\\Q\n\\E");
                    for (String o70990C0649 : o618A0C43) {
                        String o70990C06492 = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o00oOooO0OoOoOoOoOO0oOOOOooo0OoooOooOoooOoo00(o70990C0649);
                        int o70970D134D5C7B = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOOoooooOoo0OOooOoOOoOoOOOOOOooOO0o0oOoooOoooOooO(o70990C06492, ":", 0);
                        String o6E991302 = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOo0ooOoO0OO0Oo0OOOOOOo0O(o70990C06492, o70970D134D5C7B);
                        String o7699121241 = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOo0oO0oOoOOOOo0OOOOOOo0O(o70990C06492, (oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOoooO0oo0o0OOo0o00OO0OO0(o70990C06492) - oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOoooO0oo0o0OOo0o00OO0OO0(o6E991302)) - 1);
                        o63971009.setRequestProperty(o6E991302, o7699121241);
                    }
                }
                if (o6397110C4D5666C30C5256 != null && !o6397110C4D5666C30C5256.equals("")) {
                    o63971009.setRequestProperty("Cookie", o6397110C4D5666C30C5256);
                } else if (!o6397110C4D5666C3185256.equals("")) {
                    o63971009.setRequestProperty("Cookie", o6397110C4D5666C3185256);
                }
                o729D0F2F415271F90D44 = null;
                o729D0F2F415271F90D447DDB984E = o63971009.getRequestProperties();
                o6F8B = o63971009.getOutputStream();
                o6F8B.write(content.getBytes());
                o6F8B.flush();
                BufferedReader o69962 = new BufferedReader(new InputStreamReader(o63971009.getInputStream()));
                try {
                    if (o63971009.getResponseCode() == 200) {
                        while (true) {
                            String o6C911002 = o69962.readLine();
                            if (o6C911002 == null) {
                                break;
                            }
                            o729D0D124847 = o729D0D124847 + o6C911002;
                        }
                    }
                    o6397110C4D5666C3185256 = "";
                    o729D0D174B5D66F9375243D29C4C32 = null;
                    o729D0D174B5D66F9375243D29C4C329180A92A = o63971009.getHeaderFields();
                    if (o729D0D174B5D66F9375243D29C4C329180A92A != null && (o6C91 = o729D0D174B5D66F9375243D29C4C329180A92A.get("Set-Cookie")) != null) {
                        for (String o6191 : o6C91) {
                            String[] o61911F = o6191.split(";");
                            if (o61911F[0] != null) {
                                if (o6397110C4D5666C3185256.isEmpty()) {
                                    o6397110C4D5666C3185256 = o61911F[0];
                                } else {
                                    o6397110C4D5666C3185256 += "; " + o61911F[0];
                                }
                            }
                        }
                    }
                    if (o6F8B != null) {
                        try {
                            o6F8B.close();
                        } catch (IOException o6580) {
                            o6580.printStackTrace();
                        }
                    }
                    if (o69962 != null) {
                        o69962.close();
                    }
                    return o729D0D124847;
                } catch (MalformedURLException e) {
                    o65 = e;
                    o6996 = o69962;
                    o65.printStackTrace();
                    if (o6F8B != null) {
                        try {
                            o6F8B.close();
                        } catch (IOException o65802) {
                            o65802.printStackTrace();
                            return "";
                        }
                    }
                    if (o6996 != null) {
                        o6996.close();
                        return "";
                    }
                    return "";
                } catch (ProtocolException e2) {
                    o65 = e2;
                    o6996 = o69962;
                    o65.printStackTrace();
                    if (o6F8B != null) {
                        try {
                            o6F8B.close();
                        } catch (IOException o65803) {
                            o65803.printStackTrace();
                            return "";
                        }
                    }
                    if (o6996 != null) {
                        o6996.close();
                        return "";
                    }
                    return "";
                } catch (SocketTimeoutException e3) {
                    o65 = e3;
                    o6996 = o69962;
                    o65.printStackTrace();
                    if (o6F8B != null) {
                        try {
                            o6F8B.close();
                        } catch (IOException o65804) {
                            o65804.printStackTrace();
                            return "";
                        }
                    }
                    if (o6996 != null) {
                        o6996.close();
                        return "";
                    }
                    return "";
                } catch (IOException e4) {
                    o65 = e4;
                    o6996 = o69962;
                    o65.printStackTrace();
                    if (o6F8B != null) {
                        try {
                            o6F8B.close();
                        } catch (IOException o65805) {
                            o65805.printStackTrace();
                            return "";
                        }
                    }
                    if (o6996 != null) {
                        o6996.close();
                        return "";
                    }
                    return "";
                } catch (Throwable th) {
                    th = th;
                    o6996 = o69962;
                    if (o6F8B != null) {
                        try {
                            o6F8B.close();
                        } catch (IOException o65806) {
                            o65806.printStackTrace();
                            throw th;
                        }
                    }
                    if (o6996 != null) {
                        o6996.close();
                    }
                    throw th;
                }
            } catch (MalformedURLException e5) {
                o65 = e5;
            } catch (ProtocolException e6) {
                o65 = e6;
            } catch (SocketTimeoutException e7) {
                o65 = e7;
            } catch (IOException e8) {
                o65 = e8;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static int oOo0o0OoOOo00OoOoo0o00OO0OOOoO0OOooOoOOoOoOoOOo0OOo0oo0Oo0o00o00oO0oOooOOooOo00o00OO0(String url) {
        try {
            HttpURLConnection o63971009 = (HttpURLConnection) new URL(url).openConnection();
            o63971009.setRequestProperty("Accept-Encoding", "identity");
            int o6C9D1000505B = o63971009.getContentLength();
            return o6C9D1000505B;
        } catch (IOException e) {
            return -1;
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static boolean oOo0o0OoOOo00OoOoo0o00OO0OOOoO0OOooOoOo0ooOooOo0OOoOoo0o00OoO() {
        ConnectivityManager o6397102A455D = (ConnectivityManager) oOo0o00oo0o0oOoOoooOoooOOOOOOooOO0o0oOooo0ooOooOOOooo0OOo0O0o.oOo0o0OoOOo00OoOoO0Oo0Oo0o00OooOOOoOOOOoOo0oOOoo0OoOO0oOO0oOOOOOOo0o0oooO().getSystemService("connectivity");
        NetworkInfo.State o6D971C0E4856 = o6397102A455D.getNetworkInfo(0).getState();
        NetworkInfo.State o7791180E = o6397102A455D.getNetworkInfo(1).getState();
        return o6D971C0E4856 == NetworkInfo.State.CONNECTED || o7791180E == NetworkInfo.State.CONNECTED;
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static int oOo0o0OoOOo00OoOoo0o00OO0OOOoO0OOooOoOOooOOo0oOo0OooOO0OO0Ooo() {
        ConnectivityManager o6395 = (ConnectivityManager) oOo0o00oo0o0oOoOoooOoooOOOOOOooOO0o0oOooo0ooOooOOOooo0OOo0O0o.oOo0o0OoOOo00OoOoO0Oo0Oo0o00OooOOOoOOOOoOo0oOOoo0OoOO0oOO0oOOOOOOo0o0oooO().getSystemService("connectivity");
        NetworkInfo o6E91 = o6395.getActiveNetworkInfo();
        if (o6E91 == null || !o6E91.isConnectedOrConnecting()) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 14) {
            switch (o6E91.getType()) {
                case 0:
                    switch (o6E91.getSubtype()) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            return 2;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return 3;
                        case 13:
                            return 5;
                        default:
                            return 6;
                    }
                case 1:
                    return 4;
                default:
                    return 6;
            }
        }
        switch (o6E91.getType()) {
            case 0:
                switch (o6E91.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                        return 3;
                    default:
                        return 6;
                }
            case 1:
                return 4;
            default:
                return 6;
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static void oOoOoOoO0oOooOo0oooOo0OOoOOOo00Oo0OoOOOoo0oo0oOoOOoOoO0OOoOO0OO0oOoo0ooOO() {
        ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext().startActivity(new Intent("android.settings.WIRELESS_SETTINGS"));
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static void oOoOoOoO0oOooOo0oooOo0OOoOO0ooOo0OOoOOoooo0oo0oOoOoOooOOo0OO0OO0oOoO0oooo(String url) {
        Uri o758A17 = Uri.parse(url);
        Intent o698C = new Intent("android.intent.action.VIEW", o758A17);
        ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext().startActivity(o698C);
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String ooOoOooOooOoOoo0oooooOo00o00o00OOooooOOoOoOoO0Ooo(String json, String item, String name, int type) {
        String o7699121241 = "";
        switch (type) {
            case 1:
                try {
                    JSONObject o6A8B11096B517F = new JSONObject(json);
                    o7699121241 = o6A8B11096B517F.getString(name);
                    break;
                } catch (Exception o65) {
                    o65.printStackTrace();
                    return "";
                }
            case 2:
                try {
                    JSONObject o6A8B11096B517F2 = new JSONObject(json).getJSONObject(item);
                    o7699121241 = o6A8B11096B517F2.getString(name);
                    break;
                } catch (Exception o652) {
                    o652.printStackTrace();
                    return "";
                }
            case 3:
                try {
                    JSONObject o649D13086E407AF2 = new JSONObject(json);
                    JSONArray o6E8D1305414159F50C43 = o649D13086E407AF2.getJSONArray(item);
                    for (int o69 = 0; o69 < o6E8D1305414159F50C43.length(); o69++) {
                        if (o69 == 0) {
                            o7699121241 = o6E8D1305414159F50C43.getJSONObject(o69).getString(name);
                        } else {
                            o7699121241 = o7699121241 + "\n" + o6E8D1305414159F50C43.getJSONObject(o69).getString(name);
                        }
                    }
                    break;
                } catch (Exception o653) {
                    o653.printStackTrace();
                    return "";
                }
        }
        return o7699121241;
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String oOo0o0OoOOo00OoOoo0o0OoOOOOOo00Oo0OoOoOOOo0Oo0Oo0() {
        String o688C130B = oOo0o0OoOOo00OoOoo0o00OO0OO0oO0o0OO0oOo0oooooOo0OOoOOOoOOoOo0oooO0o("http://www.123cha.com/", "UTF-8", 5000);
        if (o688C130B.equals("")) {
            return "";
        }
        String[] o688C130B16 = oOOooOOO0ooOOOooOooo00oOOo00oOOOOoOOOOoooooo0ooo0OoOoOOo0OOoo.oOOooOOO0ooOOOooOooo00oOOOOOooOo00oO0OOoO0oo0oo0O(o688C130B, "(?<=\\Q您的ip:[\\E).*?(?=\\Q</a>]\\E)");
        if (o688C130B16.length <= 0) {
            return "";
        }
        String[] o688C130B17 = o688C130B16[0].split("\\Q_blank>\\E");
        if (o688C130B17.length <= 1) {
            return "";
        }
        String o729D0D124847 = o688C130B17[1];
        return o729D0D124847;
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String oOo0o0OoOOo00OoOoOoOoOoooo00OO0Oo0o00OOoOOOoO0oOOOooOoOOOOOOoo00o0ooO0OOOoo0OOOOo0oO0() {
        String o688C130B = oOo0o0OoOOo00OoOoo0o00OO0OO0oO0o0OO0oOo0oooooOo0OOoOOOoOOoOo0oooO0o("http://www.123cha.com/", "UTF-8", 5000);
        if (o688C130B.equals("")) {
            return "";
        }
        String[] o688C130B16 = oOOooOOO0ooOOOooOooo00oOOo00oOOOOoOOOOoooooo0ooo0OoOoOOo0OOoo.oOOooOOO0ooOOOooOooo00oOOOOOooOo00oO0OOoO0oo0oo0O(o688C130B, "(?<=\\Q来自:&nbsp;\\E).*?(?=\\Q&nbsp;++\\E)");
        if (o688C130B16.length <= 0) {
            return "";
        }
        String[] o688C130B17 = o688C130B16[0].split("\\Q&nbsp;\\E");
        if (o688C130B17.length <= 1) {
            return "";
        }
        String o729D0D124847 = o688C130B17[0] + o688C130B17[1];
        return o729D0D124847;
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String oOo0o0OoOOo00OoOOooOoOOOoOOOo00Oo0OoOoOOOo0Oo0Oo0() {
        try {
            Enumeration<NetworkInterface> o6DBD1012495667FD0B5E4DD8 = NetworkInterface.getNetworkInterfaces();
            while (o6DBD1012495667FD0B5E4DD8.hasMoreElements()) {
                NetworkInterface o69960A01 = o6DBD1012495667FD0B5E4DD8.nextElement();
                Enumeration<InetAddress> o65960B0A6D6354F81B45 = o69960A01.getInetAddresses();
                while (o65960B0A6D6354F81B45.hasMoreElements()) {
                    InetAddress o69961B13655771EE1A4451 = o65960B0A6D6354F81B45.nextElement();
                    if (!o69961B13655771EE1A4451.isLoopbackAddress()) {
                        return o69961B13655771EE1A4451.getHostAddress().toString();
                    }
                }
            }
            return "";
        } catch (SocketException o6580) {
            o6580.printStackTrace();
            return "";
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String oOOooo0O0oOooOoOOOoo00Oo0OOOOo0o00ooOoOOOo0Oo0Oo0(String host) {
        try {
            InetAddress o6D812D02564570EE = InetAddress.getByName(host);
            String o749D1317 = "" + o6D812D02564570EE;
            String[] o749D131716 = o749D1317.split("/");
            if (o749D131716.length == 2) {
                return o749D131716[1];
            }
            return "";
        } catch (UnknownHostException e) {
            return "";
        }
    }

    @ooOOoo0o00oooooooo0oooo0ooOoo0OoOOoO0oOOoo0OOOo00oooooooOOoOooOOoO0OOoOO0o00oO0oOOO0o
    public static String oOoOO0oooOoooOo0o0OOooOO0o00oo0o00OOOOo0o0oo0oo0o(String appid, String token, String text, int from, int to) {
        String o668A110A16;
        String o74974C;
        switch (from) {
            case 0:
                o668A110A16 = "auto";
                break;
            case 1:
                o668A110A16 = "zh";
                break;
            case 2:
                o668A110A16 = "en";
                break;
            case 3:
                o668A110A16 = "jp";
                break;
            case 4:
                o668A110A16 = "kor";
                break;
            case 5:
                o668A110A16 = "spa";
                break;
            case 6:
                o668A110A16 = "fra";
                break;
            case 7:
                o668A110A16 = "th";
                break;
            case 8:
                o668A110A16 = "ara";
                break;
            case 9:
                o668A110A16 = "ru";
                break;
            case 10:
                o668A110A16 = "pt";
                break;
            case 11:
                o668A110A16 = "yue";
                break;
            case 12:
                o668A110A16 = "wyw";
                break;
            case 13:
                o668A110A16 = "de";
                break;
            case 14:
                o668A110A16 = "it";
                break;
            default:
                o668A110A16 = "auto";
                break;
        }
        switch (to) {
            case 0:
                o74974C = "auto";
                break;
            case 1:
                o74974C = "zh";
                break;
            case 2:
                o74974C = "en";
                break;
            case 3:
                o74974C = "jp";
                break;
            case 4:
                o74974C = "kor";
                break;
            case 5:
                o74974C = "spa";
                break;
            case 6:
                o74974C = "fra";
                break;
            case 7:
                o74974C = "th";
                break;
            case 8:
                o74974C = "ara";
                break;
            case 9:
                o74974C = "ru";
                break;
            case 10:
                o74974C = "pt";
                break;
            case 11:
                o74974C = "yue";
                break;
            case 12:
                o74974C = "wyw";
                break;
            case 13:
                o74974C = "de";
                break;
            case 14:
            default:
                o74974C = "auto";
                break;
        }
        Random o729910034B5E = new Random();
        int o73991213 = o729910034B5E.nextInt(10000);
        String o73911909 = appid + text + o73991213 + token;
        String o73911909495720 = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOoOoOOoOooOOOooOOOOo0oO0OO0oOoo0Oo0o(encclass.oOo0o0OoOOo00oo0oo0ooOoo0ooooooOOOoOOOooO0o(oOOoo0ooOOooOOo0oOOOOoOo0o00oO0OOOOooOo0ooOoO0OoO.oOo0OOOoo0Oo0Oo0OO0OOoo00o00oooo0OOOOOo0ooOoOoOooOo0ooOOOOOOo(o73911909, "UTF-8")));
        String o758A1216515666E8 = "http://api.fanyi.baidu.com/api/trans/vip/translate?q=" + oOoOooooooo0OOoOOo0o0OOo0OO0oo0o00o00OooOOOooOo0oOoOOO0OOoo0o.ooOOoOOOooOoooo0ooOOOooO0Oo0oOoOO0oooOO0OOO(text, "UTF-8") + "&from=" + o668A110A16 + "&to=" + o74974C + "&appid=" + appid + "&salt=" + o73991213 + "&sign=" + o73911909495720;
        String o749D1317 = oOOoo0ooOOooOOo0oOOOOoOo0o00oO0OOOOooOo0ooOoO0OoO.oOOoo0oooOOOOOo0oo0OoOOOoo00oooo0OOOOOOoOoOoOOo0OOo0OOOo0Oo00(oOo0o0OoOOo00OoOoo0o00OO0OOOoO0OOooOoOOoOoOoOOo0OOo0oo0Oo0o00(o758A1216515666E8, 5000), "UTF-8");
        if (oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOo0o0OoOOo00OoOO0oOoooo0o00oOOo0OOOoOoooO0oo0o0OOo0o00OO0OO0(o749D1317) > 5 && oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOOoooooOoo0OOooOoOOoOoOOOOOOooOO0o0oOoooOoooOooO(o749D1317, "error", 0) == -1) {
            String[] o73900B1D5102 = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOoOo0oooOOOOOo0oO0o0Oo00OOOOooOO0o0oOoooOoooOooO(o749D1317, "dst\":\"");
            if (o73900B1D5102.length >= 2) {
                String[] o73900B1D5101 = oOo0OOOoo0Oo0Oo0OO0OOoo00o00oO0OOOOooOo0ooOoO0OoO.oOoOo0oooOOOOOo0oO0o0Oo00OOOOooOO0o0oOoooOoooOooO(o73900B1D5102[1], "\"");
                if (o73900B1D5101.length >= 2) {
                    return oOoOooooooo0OOoOOo0o0OOo0OO0oo0o00o00OooOOOooOo0oOoOOO0OOoo0o.ooOOoOOOoOOoOooOOOooOOoOOo00o00OOooooOOoo0oo0oo0o(o73900B1D5101[0]);
                }
                return "";
            }
            return "";
        }
        return "";
    }
}