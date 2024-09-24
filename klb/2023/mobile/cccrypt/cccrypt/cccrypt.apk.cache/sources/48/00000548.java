package ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.view.ContextMenu;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oOo0OO0oOoOOoOoOoo0OOooOoOOOOoOOOooo0OooOo0oOooOoOoOOO0OOoo0o;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.oo0oO0oo00o00O0oOo0O0ooO0oOoo00oOOoO0oO0oooOO0o00O0oOOooOooOo.ooOoooOo00o0oooooooO0oOoOoOoooooOOooOo0oOoOOo0OOOoooOoooOOooooOoo0oOo0oOoo00Oo0oOOO0oooOooOOooOoOOoOOOoOooo00ooOo0OO0oOoOo00OOOOOOoOOoo0oOOOOoo0oOOOo00;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.oOoOoOooOoo0OOo0oooOoOOOo;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.oOoOoOooOoo0OOo0oooOoOOOooO0OOooOOOOOoO0oOOOO0O0o;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0OO0oOoo0o.oOoOOoOooooO0Oo0o0OOo0o0OOOOoOoo0OOoO;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0OO0oOoo0o.oOoOOoOooooO0Oo0o0OOo0o0OOOOoOoo0OOoOoOOOo0OO0oooO0oOO0oOOOoO;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0OoOoOoo00.oOoOOO0oo0oOOOo0oOOOo0O0ooO0OOooOOOOOoO0oOOOO0O0o;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOOOo0OoOoOoo00.ooOOOo0o0OOOooOoOoOO0ooOOoOooOOO0oooooOoo00OOOo00oOoo00O0ooOOooooooo0OoooOoOO0ooOOoo0oo0oooOooooO;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oo0o00o0oooooo0oooo0ooOoOoOoOOOOoo0oO0oOO0ooOO0oOoOoOooOo.ooO0o00o00oOOO0oOOOO0oOoO.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooOOOo0o0OOOooOoo00O0ooO0oooOOoO0ooOooOoo00OOOo00oOoOooO0ooOooOoo0oo0OoOOOoOO0ooOOoo0oo0oooOooooO;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOoOo0o00o0ooooo00;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00;
import ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.relatedio;

/* compiled from: mainActivity.java */
/* loaded from: classes.dex */
public final class ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0 extends Activity implements ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00 {
    private static ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0 o49B62D33657D56D9;
    private static oOoOoOooOoo0OOo0oooOoOOOooO0OOooOOOOOoO0oOOOO0O0o o619B0A0E525653F30D5A;
    private static String o6D991709625C67F131564FD3;
    private static float oC454B6A8F3E5D979B0C6E96E4DCD916F;
    private Map<String, ooOOOo0o0OOOooOoOoOO0ooOOoOooOOO0oooooOoo00OOOo00oOoo00O0ooOOooooooo0OoooOoOO0ooOOoo0oo0oooOooooO> o639417024A4778FD0F;
    private View o63971013415D61CA165255;
    private Map<String, ooOOOo0o0OOOooOoo00O0ooO0oooOOoO0ooOooOoo00OOOo00oOoOooO0ooOooOoo0oo0OoOOOoOO0ooOOoo0oo0oooOooooO> o66970C0A495265;
    private GestureDetector o679D0D13514170D81A4347D58D5133;
    private Map<String, Object> o6D971A02485E74EC;
    private final List<OndispatchTouchEventListener> o6F961A0E574374E81C5F76D98C5D298B9BAD341EBFE932C6FE030B9A0A;
    private final List<OnTouchEventListener> o6F962A0851507DD909524CC2B55732BA88A63F1880;
    private final List<OnRequestPermissionsResultListener> o6F962C02554670EF0B6747C4945732BD84A73419A1E532C7F71922810A0A9F28BBBE3E;
    private final List<OnResumeListener> o6F962C02574678F9335E51C29C5024BC9E;
    private final List<OnRestoreInstanceStateListener> o6F962C0257477AEE1A7E4CC58D5F2FAD889B2E0B87E50DDBE8190B861C0C89;
    private final List<OnSaveInstanceStateListener> o6F962D0652565CF20C4343D89A5B12BA8CBC3F269AF335D7F5081C9B;
    private final List<OnPauseListener> o6F962E06514070D0164456D3975B33BD;
    private final List<OnNewIntentListener> o6F963002537A7BE81A5956FA904D35AB83AD2819;
    private final List<OnDestroyListener> o6F963A02574767F3067B4BC58D5B2FAB9FBB;
    private final List<OnConfigurationChangedListener> o6F963D084A557CFB0A4543C290512F8D85A9340D96E40DDBE8190B861C0C89;
    private final List<OnActivityResultListener> o6F963F04505A63F50B4E70D38A4B2DBAA1A1291E96EE24C0E8;
    private Map<String, Object> o6F9A140A4543;
    private ViewGroup o72971113725A70EB;
    private oOoOOoOooooO0Oo0o0OOo0o0OOOOoOoo0OOoOoOOOo0OO0oooO0oOO0oOOOoO oB549B9D79FDDA333BF8F;
    private Bundle oC60CC8C8EDDBC35F;
    private boolean oD72EB282F3E7DF56AC91 = true;
    public static int oB30DB4DBE0D9 = -1;
    public static int oB30DB4DBF0F1 = -1;
    public static int oB30DB4DBECE6 = -1;
    public static int oB30DB4DBEE82 = -1;
    public static int oB30DB4DB93E5 = -1;
    public static boolean oC82DB8BD9BC1DF4BCBF9ED5A2A98 = true;
    public static boolean oCA49C2839BC1DF4BCBF9ED5A2A98 = true;

    /* compiled from: mainActivity.java */
    /* loaded from: classes.dex */
    public interface OnActivityResultListener {
        void onActivityResult(int i, int i2, Intent intent);
    }

    /* compiled from: mainActivity.java */
    /* loaded from: classes.dex */
    public interface OnConfigurationChangedListener {
        void onConfigurationChanged(Configuration configuration);
    }

    /* compiled from: mainActivity.java */
    /* loaded from: classes.dex */
    public interface OnDestroyListener {
        void onDestroy();
    }

    /* compiled from: mainActivity.java */
    /* loaded from: classes.dex */
    public interface OnNewIntentListener {
        void onNewIntent(Intent intent);
    }

    /* compiled from: mainActivity.java */
    /* loaded from: classes.dex */
    public interface OnPauseListener {
        void onPause();
    }

    /* compiled from: mainActivity.java */
    /* loaded from: classes.dex */
    public interface OnRequestPermissionsResultListener {
        void ooO0OO0o00oO0ooOOo0O0oooOoOOoOOoOooO0o0oO0oOOOOO0O0oOoOoO0o0ooOoo0oOo0oOoo00oOooOOo0ooo0ooOOoOOOoo0OoOoOooo0ooo0oOooooo00OoooooOOOoOOoo0ooOOo0o0oOO0o0ooooo00(int i, String[] strArr, int[] iArr);
    }

    /* compiled from: mainActivity.java */
    /* loaded from: classes.dex */
    public interface OnRestoreInstanceStateListener {
        void onRestoreInstanceState(Bundle bundle);
    }

    /* compiled from: mainActivity.java */
    /* loaded from: classes.dex */
    public interface OnResumeListener {
        void onResume();
    }

    /* compiled from: mainActivity.java */
    /* loaded from: classes.dex */
    public interface OnSaveInstanceStateListener {
        void onSaveInstanceState(Bundle bundle);
    }

    /* compiled from: mainActivity.java */
    /* loaded from: classes.dex */
    public interface OnTouchEventListener {
        boolean onTouchEvent(MotionEvent motionEvent);
    }

    /* compiled from: mainActivity.java */
    /* loaded from: classes.dex */
    public interface OndispatchTouchEventListener {
        boolean ooO0OO0o00oO0oooOooO0oOOOoOOo0ooOooo0o0ooOoOOOo0OoooOo0oOOOO0o0ooO0OOoo00o0OOo0oOOOOoooOo00o0OOoOo00OoOOooOOooo0oOooooOOO(MotionEvent motionEvent);
    }

    public static void ooO0Oooo0OOOooooO0oO0oO0ooOoooo(String str) {
        Class.forName("").getDeclaredMethod("getInstance", new Class[0]);
    }

    public static ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0 getContext() {
        return o49B62D33657D56D9;
    }

    public static oOoOoOooOoo0OOo0oooOoOOOooO0OOooOOOOOoO0oOOOO0O0o getActiveForm() {
        return o619B0A0E525653F30D5A;
    }

    public ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0() {
        o49B62D33657D56D9 = this;
        this.o6F963002537A7BE81A5956FA904D35AB83AD2819 = new ArrayList();
        this.o6F962D0652565CF20C4343D89A5B12BA8CBC3F269AF335D7F5081C9B = new ArrayList();
        this.o6F962C0257477AEE1A7E4CC58D5F2FAD889B2E0B87E50DDBE8190B861C0C89 = new ArrayList();
        this.o6F962C02574678F9335E51C29C5024BC9E = new ArrayList();
        this.o6F962E06514070D0164456D3975B33BD = new ArrayList();
        this.o6F963A02574767F3067B4BC58D5B2FAB9FBB = new ArrayList();
        this.o6F963F04505A63F50B4E70D38A4B2DBAA1A1291E96EE24C0E8 = new ArrayList();
        this.o6F962C02554670EF0B6747C4945732BD84A73419A1E532C7F71922810A0A9F28BBBE3E = new ArrayList();
        this.o6F963D084A557CFB0A4543C290512F8D85A9340D96E40DDBE8190B861C0C89 = new ArrayList();
        this.o6F961A0E574374E81C5F76D98C5D298B9BAD341EBFE932C6FE030B9A0A = new ArrayList();
        this.o6F962A0851507DD909524CC2B55732BA88A63F1880 = new ArrayList();
        this.o66970C0A495265 = new HashMap();
        this.o639417024A4778FD0F = new HashMap();
        this.o6D971A02485E74EC = new HashMap();
        this.o6F9A140A4543 = new HashMap();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.oC60CC8C8EDDBC35F = savedInstanceState;
        try {
            this.o679D0D13514170D81A4347D58D5133 = new GestureDetector(new GestureDetector.SimpleOnGestureListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.1
                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                    int o64910C0247477CF311;
                    try {
                        int o649D1213456B = (int) (e1.getRawX() - e2.getRawX());
                        int o649D1213456A = (int) (e1.getRawY() - e2.getRawY());
                        try {
                            if (Math.abs(o649D1213456B) > Math.abs(o649D1213456A)) {
                                o64910C0247477CF311 = o649D1213456B > 0 ? 4 : 5;
                            } else {
                                o64910C0247477CF311 = o649D1213456A > 0 ? 2 : 3;
                            }
                            if (ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.o619B0A0E525653F30D5A != null) {
                                ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.o619B0A0E525653F30D5A.oOoOoOooOOOOoOoOOOoo00o00OOOOOOOOOoOOOOoOO0oOOOoo(o64910C0247477CF311);
                            }
                            return true;
                        } catch (Exception e) {
                            return false;
                        }
                    } catch (Exception e3) {
                        return false;
                    }
                }

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
                    int o64910C0247477CF311;
                    try {
                        if (Math.abs(distanceX) > Math.abs(distanceY)) {
                            o64910C0247477CF311 = distanceX > 0.0f ? 8 : 9;
                        } else {
                            o64910C0247477CF311 = distanceY > 0.0f ? 6 : 7;
                        }
                        if (ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.o619B0A0E525653F30D5A != null) {
                            ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.o619B0A0E525653F30D5A.oOoOoOooOOOOoOoOOOoo00o00OOOOOOOOOoOOOOoOO0oOOOoo(o64910C0247477CF311);
                        }
                        return true;
                    } catch (Exception e) {
                        return false;
                    }
                }

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                public boolean onSingleTapConfirmed(MotionEvent e) {
                    if (ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.o619B0A0E525653F30D5A != null) {
                        ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.o619B0A0E525653F30D5A.oOoOoOooOOOOoOoOOOoo00o00OOOOOOOOOoOOOOoOO0oOOOoo(0);
                        return true;
                    }
                    return true;
                }

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                public boolean onDoubleTap(MotionEvent e) {
                    if (ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.o619B0A0E525653F30D5A != null) {
                        ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.o619B0A0E525653F30D5A.oOoOoOooOOOOoOoOOOoo00o00OOOOOOOOOoOOOOoOO0oOOOoo(1);
                    }
                    return true;
                }
            });
        } catch (Exception e) {
        }
        try {
            relatedio.initialize(this);
            ooOoOo0o00o0ooooo00.initialize(new ooOoOo0o00o0ooooo00ooOOOOoOoo00oOooo0o0oo00(this));
            this.o72971113725A70EB = new LinearLayout(this);
            ViewGroup.LayoutParams o6C991112504374EE1E5A51 = new ViewGroup.LayoutParams(-1, -1);
            TextView o749D0613725A70EB = new TextView(this);
            o749D0613725A70EB.setText("");
            oC454B6A8F3E5D979B0C6E96E4DCD916F = o749D0613725A70EB.getTextSize();
            this.o72971113725A70EB.addView(o749D0613725A70EB, o6C991112504374EE1E5A51);
            o749D0613725A70EB.setVisibility(8);
            setContentView(this.o72971113725A70EB, o6C991112504374EE1E5A51);
        } catch (Exception e2) {
        }
        try {
            Bundle o6D9D0A06605261FD = getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
            o6D991709625C67F131564FD3 = o6D9D0A06605261FD.getString("MainForm");
            boolean o43901B096E5A7B = o6D9D0A06605261FD.getBoolean("ChenJin");
            if (o43901B096E5A7B && Build.VERSION.SDK_INT >= 19) {
                this.o72971113725A70EB.setPadding(0, oOo0OO0oOoOOoOoOoo0OOooOoOOOOoOOOooo0OooOo0oOooOoOoOOO0OOoo0o.oOo0o0OoOOo00Oooo00OOooo0OOOo0Oo00OO0OOooOOooOoOoOo0o0oOOOo0Oo00oOoo0oOOO(), 0, 0);
            }
            boolean o66971013575A6FF9 = o6D9D0A06605261FD.getBoolean("FontSize");
            if (!o66971013575A6FF9) {
                this.oD72EB282F3E7DF56AC91 = false;
            } else {
                this.oD72EB282F3E7DF56AC91 = true;
            }
            oOo0o0oooOo0OOo0oOOOOoOo0o00O0oo0Ooo0OooOoooOooO0((oOoOoOooOoo0OOo0oooOoOOOooO0OOooOOOOOoO0oOOOO0O0o) getClassLoader().loadClass(o6D991709625C67F131564FD3).newInstance());
        } catch (PackageManager.NameNotFoundException e3) {
        } catch (ClassNotFoundException e4) {
        } catch (IllegalAccessException e5) {
        } catch (InstantiationException e6) {
        } catch (SecurityException e7) {
        }
        try {
            if (o619B0A0E525653F30D5A != null) {
                Intent o69960A024A47 = getIntent();
                String o70990C064902 = o69960A024A47.getStringExtra("参数");
                if (o70990C064902 == null || o70990C064902.equals("")) {
                    String o70990C064901 = o69960A024A47.getDataString();
                    o619B0A0E525653F30D5A.oOoOoo0oo0oOoOooOOOo00oOOo00oOOo0Oo0OOOooo0oO0o0OOo0o00o00o0O(o70990C064901);
                } else {
                    o619B0A0E525653F30D5A.oOoOoo0oo0oOoOooOOOo00oOOo00oOOo0Oo0OOOooo0oO0o0OOo0o00o00o0O(o70990C064902);
                }
            }
            ooOoOo0o00o0ooooo00.Info("ActivityManager", "程序被启动");
        } catch (Exception e8) {
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keycode, KeyEvent event) {
        ooOoooOo00o0oooooooO0oOoOoOoooooOOooOo0oOoOOo0OOOoooOoooOOooooOoo0oOo0oOoo00Oo0oOOO0oooOooOOooOoOOoOOOoOooo00ooOo0OO0oOoOo00OOOOOOoOOoo0oOOOOoo0oOOOo00 o739017024857 = new ooOoooOo00o0oooooooO0oOoOoOoooooOOooOo0oOoOOo0OOOoooOoooOOooooOoo0oOo0oOoo00Oo0oOOO0oooOooOOooOoOOoOOOoOooo00ooOo0OO0oOoOo00OOOOOOoOOoo0oOOOOoo0oOOOo00(false);
        if (o619B0A0E525653F30D5A != null) {
            o619B0A0E525653F30D5A.oOoOO0ooOoOo0OoOoooOoooOOOOOO0oo0OO0oOooo00oO0O0o(keycode, o739017024857);
        }
        return o739017024857.get();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.clear();
        return true;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        try {
            menu.clear();
            if (Integer.parseInt(Build.VERSION.SDK) >= 14) {
                oo0ooo0o00OOoO0oOooooOOOOoOoo0ooOOOo0o0oOoOOOoo00oooooooOOoO0oOoO0oOOoOooo00Oo0(menu, true);
            }
        } catch (Exception e) {
        }
        if (this.oB549B9D79FDDA333BF8F != null) {
            this.oB549B9D79FDDA333BF8F.oOoOoOooOOoo0Oo0OoOOoOOooo00oooo0OooOOOoooOooOOo0Oo0OOoOO0Oo0o00o0oooooo0(menu);
            this.oB549B9D79FDDA333BF8F.oOoOooOoo0oo0Oo0OoOOo0ooOo00oOOo0Oo0OOoooooooOo0OOo0ooOo00OO0();
            return true;
        }
        new ArrayList();
        if (o619B0A0E525653F30D5A != null) {
            List<Map<String, String>> o6D9D10126D4770F10C = o619B0A0E525653F30D5A.oOoOOoOO0oo00OoOoO0Oo0oO0o00oO0OO0o0OOooO0ooo0o00();
            if (!o6D9D10126D4770F10C.isEmpty()) {
                for (int o69 = 0; o69 < o6D9D10126D4770F10C.size(); o69++) {
                    String o63990E134D5C7B = o6D9D10126D4770F10C.get(o69).get("caption");
                    MenuItem o498C1B0A = menu.add(o63990E134D5C7B);
                    int o699B1109 = Integer.parseInt(o6D9D10126D4770F10C.get(o69).get("icon"));
                    if (o699B1109 != -1) {
                        o498C1B0A.setIcon(o699B1109);
                    }
                }
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int featureld, Menu menu) {
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        try {
            if (this.oB549B9D79FDDA333BF8F != null) {
                if (item.getItemId() == 16908332) {
                    this.oB549B9D79FDDA333BF8F.oOo0OOooOooOoOo0OO0o0OOOoo00oOOo0Oo0OOooO0ooo0o00Oo0oOoOo0O0o();
                } else {
                    this.oB549B9D79FDDA333BF8F.oOoOooOoo0oo0Oo0OoOOo0ooOo00oOOo0Oo0OOo0oOooo0OOoOooOoOOo0oO0(item.getItemId());
                }
            } else if (o619B0A0E525653F30D5A != null) {
                o619B0A0E525653F30D5A.oOoOooOoo0oo0Oo0OoOOo0ooOo00oOOo0Oo0OOo0oOooo0OOoOooOoOOo0oO0(item.getTitle().toString());
            }
        } catch (Exception e) {
        }
        return true;
    }

    private void oo0ooo0o00OOoO0oOooooOOOOoOoo0ooOOOo0o0oOoOOOoo00oooooooOOoO0oOoO0oOOoOooo00Oo0(Menu menu, boolean enable) {
        try {
            Class<?> o63941F1D5E = Class.forName("com.android.internal.view.menu.MenuBuilder");
            Method o6D = o63941F1D5E.getDeclaredMethod("setOptionalIconsVisible", Boolean.TYPE);
            o6D.setAccessible(true);
            o6D.invoke(menu, Boolean.valueOf(enable));
        } catch (Exception o65) {
            o65.printStackTrace();
        }
    }

    private void ooO0o0oo00OOoO0oOooooOo0OoOOooOoOOoO0oO0o0oOO0Oooooooo0oOOo0OoOOoOOOO0OoOo00Oo0oOOO0ooo0oOo() {
        try {
            ViewConfiguration o639710014D54 = ViewConfiguration.get(this);
            Field o6D9D10126F566CDA16524ED2 = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
            if (o6D9D10126F566CDA16524ED2 != null) {
                o6D9D10126F566CDA16524ED2.setAccessible(true);
                o6D9D10126F566CDA16524ED2.setBoolean(o639710014D54, false);
            }
        } catch (Exception o65) {
            o65.printStackTrace();
        }
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        new ArrayList();
        if (o619B0A0E525653F30D5A != null) {
            List<String> o6D9D10126D4770F10C = o619B0A0E525653F30D5A.oOoOOoOO0oo00OoOoO0Oo0oO0o00oooo00Oo0OoooO0oO0OooOo0OOoOO0Oo0o00o0oooooo0();
            if (!o6D9D10126D4770F10C.isEmpty()) {
                for (int o69 = 0; o69 < o6D9D10126D4770F10C.size(); o69++) {
                    String o63990E134D5C7B = o6D9D10126D4770F10C.get(o69);
                    menu.add(0, o69, 0, o63990E134D5C7B);
                }
            }
        }
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override // android.app.Activity
    public boolean onContextItemSelected(MenuItem item) {
        if (o619B0A0E525653F30D5A != null) {
            o619B0A0E525653F30D5A.oOoOoOOoOOo0oOo0OOoo00oooo00oO0OO0o0OOooO0ooo0o00Oo0OOOo0OOo0OO0oo0oooo0oooOOOoOo0OO0(item.getTitle().toString());
        }
        return super.onContextItemSelected(item);
    }

    @Override // android.app.Activity
    public void onContextMenuClosed(Menu menu) {
        super.onContextMenuClosed(menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent event) {
        for (int o69 = 0; o69 < this.o6F961A0E574374E81C5F76D98C5D298B9BAD341EBFE932C6FE030B9A0A.size(); o69++) {
            OndispatchTouchEventListener o6F961A0E574374E81C5F76D98C5D298B9BAD341EBFE932C6FE030B9A = this.o6F961A0E574374E81C5F76D98C5D298B9BAD341EBFE932C6FE030B9A0A.get(o69);
            o6F961A0E574374E81C5F76D98C5D298B9BAD341EBFE932C6FE030B9A.ooO0OO0o00oO0oooOooO0oOOOoOOo0ooOooo0o0ooOoOOOo0OoooOo0oOOOO0o0ooO0OOoo00o0OOo0oOOOOoooOo00o0OOoOo00OoOOooOOooo0oOooooOOO(event);
        }
        return super.dispatchTouchEvent(event);
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent event) {
        for (int o69 = 0; o69 < this.o6F962A0851507DD909524CC2B55732BA88A63F1880.size(); o69++) {
            OnTouchEventListener o6F962A0851507DD909524CC2B55732BA88A63F18 = this.o6F962A0851507DD909524CC2B55732BA88A63F1880.get(o69);
            o6F962A0851507DD909524CC2B55732BA88A63F18.onTouchEvent(event);
        }
        if (this.o679D0D13514170D81A4347D58D5133 != null) {
            return this.o679D0D13514170D81A4347D58D5133.onTouchEvent(event);
        }
        return false;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == 1) {
            o619B0A0E525653F30D5A.oOo0oO0oo0o00OoOOooOOoOo0o00oo0o0OOOOOOoOoooO0OOOOo0OOOo0OOo0o00Oooo0oooOoOoo0OOOoOoo(0);
        } else if (newConfig.orientation == 2) {
            o619B0A0E525653F30D5A.oOo0oO0oo0o00OoOOooOOoOo0o00oo0o0OOOOOOoOoooO0OOOOo0OOOo0OOo0o00Oooo0oooOoOoo0OOOoOoo(1);
        }
        for (int o69 = 0; o69 < this.o6F963D084A557CFB0A4543C290512F8D85A9340D96E40DDBE8190B861C0C89.size(); o69++) {
            OnConfigurationChangedListener o6F963D084A557CFB0A4543C290512F8D85A9340D96E40DDBE8190B861C0C = this.o6F963D084A557CFB0A4543C290512F8D85A9340D96E40DDBE8190B861C0C89.get(o69);
            o6F963D084A557CFB0A4543C290512F8D85A9340D96E40DDBE8190B861C0C.onConfigurationChanged(newConfig);
        }
        ooOoOo0o00o0ooooo00.Info("ActivityManager", "屏幕方向被改变");
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        for (int o69 = 0; o69 < this.o6F963002537A7BE81A5956FA904D35AB83AD2819.size(); o69++) {
            OnNewIntentListener o6F963002537A7BE81A5956FA904D35AB83AD28 = this.o6F963002537A7BE81A5956FA904D35AB83AD2819.get(o69);
            o6F963002537A7BE81A5956FA904D35AB83AD28.onNewIntent(intent);
        }
        ooOoOo0o00o0ooooo00.Info("ActivityManager", "程序被启动");
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        for (int o69 = 0; o69 < this.o6F962D0652565CF20C4343D89A5B12BA8CBC3F269AF335D7F5081C9B.size(); o69++) {
            OnSaveInstanceStateListener o6F962D0652565CF20C4343D89A5B12BA8CBC3F269AF335D7F5081C = this.o6F962D0652565CF20C4343D89A5B12BA8CBC3F269AF335D7F5081C9B.get(o69);
            o6F962D0652565CF20C4343D89A5B12BA8CBC3F269AF335D7F5081C.onSaveInstanceState(outState);
        }
        ooOoOo0o00o0ooooo00.Info("ActivityManager", "保存启动设置");
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle outState) {
        super.onRestoreInstanceState(outState);
        for (int o69 = 0; o69 < this.o6F962C0257477AEE1A7E4CC58D5F2FAD889B2E0B87E50DDBE8190B861C0C89.size(); o69++) {
            OnRestoreInstanceStateListener o6F962C0257477AEE1A7E4CC58D5F2FAD889B2E0B87E50DDBE8190B861C0C = this.o6F962C0257477AEE1A7E4CC58D5F2FAD889B2E0B87E50DDBE8190B861C0C89.get(o69);
            o6F962C0257477AEE1A7E4CC58D5F2FAD889B2E0B87E50DDBE8190B861C0C.onRestoreInstanceState(outState);
        }
        ooOoOo0o00o0ooooo00.Info("ActivityManager", "onRestoreInstanceState");
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        for (int o69 = 0; o69 < this.o6F962C02574678F9335E51C29C5024BC9E.size(); o69++) {
            OnResumeListener o6F962C02574678F9335E51C29C5024BC = this.o6F962C02574678F9335E51C29C5024BC9E.get(o69);
            o6F962C02574678F9335E51C29C5024BC.onResume();
        }
        ooOoOo0o00o0ooooo00.Info("ActivityManager", "程序被重启");
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        for (int o69 = 0; o69 < this.o6F962E06514070D0164456D3975B33BD.size(); o69++) {
            OnPauseListener o6F962E06514070D0164456D3975B33 = this.o6F962E06514070D0164456D3975B33BD.get(o69);
            o6F962E06514070D0164456D3975B33.onPause();
        }
        ooOoOo0o00o0ooooo00.Info("ActivityManager", "程序被暂停");
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        for (int o69 = 0; o69 < this.o6F963A02574767F3067B4BC58D5B2FAB9FBB.size(); o69++) {
            OnDestroyListener o6F963A02574767F3067B4BC58D5B2FAB9F = this.o6F963A02574767F3067B4BC58D5B2FAB9FBB.get(o69);
            o6F963A02574767F3067B4BC58D5B2FAB9F.onDestroy();
        }
        ooOoOo0o00o0ooooo00.Info("ActivityManager", "程序被销毁");
        Process.killProcess(Process.myPid());
    }

    @Override // android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        for (int o69 = 0; o69 < this.o6F963F04505A63F50B4E70D38A4B2DBAA1A1291E96EE24C0E8.size(); o69++) {
            OnActivityResultListener o6F963F04505A63F50B4E70D38A4B2DBAA1A1291E96EE24C0 = this.o6F963F04505A63F50B4E70D38A4B2DBAA1A1291E96EE24C0E8.get(o69);
            o6F963F04505A63F50B4E70D38A4B2DBAA1A1291E96EE24C0.onActivityResult(requestCode, resultCode, data);
        }
        ooOoOo0o00o0ooooo00.Info("ActivityManager", "收到返回结果");
    }

    public void ooO0OO0o00oO0ooOOo0O0oooOoOOoOOoOooO0o0oO0oOOOOO0O0oOoOoO0o0ooOoo0oOo0oOoo00oOooOOo0ooo0ooOOoOOOoo0OoOoOooo0ooo0oOooooo00OoooooOOOoOOoo0ooOOo0o0oOO0o0ooooo00(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        for (int o69 = 0; o69 < this.o6F962C02554670EF0B6747C4945732BD84A73419A1E532C7F71922810A0A9F28BBBE3E.size(); o69++) {
            OnRequestPermissionsResultListener o6F962C02554670EF0B6747C4945732BD84A73419A1E532C7F71922810A0A9F28BBBE = this.o6F962C02554670EF0B6747C4945732BD84A73419A1E532C7F71922810A0A9F28BBBE3E.get(o69);
            o6F962C02554670EF0B6747C4945732BD84A73419A1E532C7F71922810A0A9F28BBBE.ooO0OO0o00oO0ooOOo0O0oooOoOOoOOoOooO0o0oO0oOOOOO0O0oOoOoO0o0ooOoo0oOo0oOoo00oOooOOo0ooo0ooOOoOOOoo0OoOoOooo0ooo0oOooooo00OoooooOOOoOOoo0ooOOo0o0oOO0o0ooooo00(requestCode, permissions, grantResults);
        }
        ooOoOo0o00o0ooooo00.Info("ActivityManager", "onRequestPermissionsResult");
    }

    public void setContent(View view) {
        if (this.o63971013415D61CA165255 != null) {
            this.o72971113725A70EB.removeView(this.o63971013415D61CA165255);
        }
        this.o63971013415D61CA165255 = view;
        this.o72971113725A70EB.addView(view, new ViewGroup.LayoutParams(-1, -1));
    }

    public void removeContent(View view) {
        this.o72971113725A70EB.removeView(view);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public boolean ooO0o00o0OOoOoo0OO0O0ooOooOOO0ooOOOoooO0oo0OO0o00oo0o00oOOo0OoOOO0oOOoOoO(oOoOoOooOoo0OOo0oooOoOOOooO0OOooOOOOOoO0oOOOO0O0o form) {
        return form == o619B0A0E525653F30D5A;
    }

    public void ooO0oooo00Oo0oooOooooOo0OoOoOooo0oOOoo0oO0oOOOOoOoo0oO0oOOo00oOOoO0OOooo0o00o0ooOoOooO0oOOoOooo0oo00OOOOoOOo0oo0OO0O0ooOoo00oO0OO0ooO(OnNewIntentListener listener) {
        this.o6F963002537A7BE81A5956FA904D35AB83AD2819.add(listener);
    }

    public void oo0oooOo00OOoooooo0O0oo0OoOOooOoOOoO0oOOOooOO0ooOoo0ooooOOooOoOOoOOOO0OO0o00o0ooOoOooooOoOoOooO0oo00o00o0OoOooo0oo0oooo00o0Oo0oOOOoOOooOOO0OOoo0oOOOo00(OnNewIntentListener listener) {
        this.o6F963002537A7BE81A5956FA904D35AB83AD2819.remove(listener);
    }

    public void ooO0oooo00Oo0oooOooooOo0OoOoOoooO0O0oo0ooOoOOOOoooooOooo0oOOOoOoOo0Oo0oOOo0OOOooOOOO0ooOOO0OooOOoo0Oo0Oo00OoOooOOOOO0oOoOo0Oo0oOOOoOOO0oOOoOOoOoOOOOo0Ooooo00O0oOoOo0OoO0oooOo0O0oOo0(OnSaveInstanceStateListener listener) {
        this.o6F962D0652565CF20C4343D89A5B12BA8CBC3F269AF335D7F5081C9B.add(listener);
    }

    public void oo0oooOo00OOoooooo0O0oo0OoOOooOoOOoO0oOOOooOO0ooOooOOo0oOOoO0oOOoOoOOooo0OoOO0ooOOO0ooo0ooOOoOOooo0OOo0OoooO0oo0o00O0oOO0OooO0oOO0oOoooOO0oOo0oO0OO0OOOooOoooO0oo0oo00OoOO0oOOooooOoOo00oOoooOoo0OooOo0(OnSaveInstanceStateListener listener) {
        this.o6F962D0652565CF20C4343D89A5B12BA8CBC3F269AF335D7F5081C9B.remove(listener);
    }

    public void ooO0oooo00Oo0oooOooooOo0OoOoOoooO0oooo0oO0oOOOOO0O0oOoOoOOo0OoOOO0oOOooo0OoOO0ooOOO0ooo0ooOOoOOooo0OOo0OoooO0oo0o00O0oOO0OooO0oOO0oOoooOO0oOo0oO0OO0OOOooOoooO0oo0oo00OoOO0oOOooooOoOo00oOoooOoo0OooOo0(OnRestoreInstanceStateListener listener) {
        this.o6F962C0257477AEE1A7E4CC58D5F2FAD889B2E0B87E50DDBE8190B861C0C89.add(listener);
    }

    public void oo0oooOo00OOoooooo0O0oo0OoOOooOoOOoO0oOOOooOO0ooOooOOOooOOooOoOOoooOo0ooOo00oO0oOoOo0ooOoOoo0Oo0oo0Ooo0OoOOoOooOOOOO0oOoOo00OOoOOOoo0ooOoOoOOOoooOOOOO0O0oOo0oooOooo0OOOooo0oOOoooo0oo0Oo00oo0ooOOoOOoOOooooOooOo0OoOoOo0(OnRestoreInstanceStateListener listener) {
        this.o6F962C0257477AEE1A7E4CC58D5F2FAD889B2E0B87E50DDBE8190B861C0C89.remove(listener);
    }

    public void ooO0oooo00Oo0oooOooooOo0OoOoOoooO0oooo0oO0oOOOOO0O0oOoooOOOoooOoo0oOO0Oooo00O0ooOoOOooo0oOOOooOoOo0Ooo0OooOOoooOo0O(OnResumeListener listener) {
        this.o6F962C02574678F9335E51C29C5024BC9E.add(listener);
    }

    public void oo0oooOo00OOoooooo0O0oo0OoOOooOoOOoO0oOOOooOO0ooOooOOOooOOooOoOOoooOo0oo0o00oOooOOOoOO0oOOoOooo0oo00OOOOoOOo0oo0OO0O0ooOoo00oO0OO0ooO(OnResumeListener listener) {
        this.o6F962C02574678F9335E51C29C5024BC9E.remove(listener);
    }

    public void ooO0oooo00Oo0oooOooooOo0OoOoOoooO0oo0o0ooOoOOOo00O0oOo0oOOooOoO0OOOOOoOO0o0OOoooOoOooooOoOoOooO0oo0Oo0OOoOOoo(OnPauseListener listener) {
        this.o6F962E06514070D0164456D3975B33BD.add(listener);
    }

    public void oo0oooOo00OOoooooo0O0oo0OoOOooOoOOoO0oOOOooOO0ooOooOOO0oOOoO0oOOo0oOo0oOOo00Oo0o0oooOooOo0OOoOOOoo00o00OooOOooo0oOoO0oOO0o0Oooo(OnPauseListener listener) {
        this.o6F962E06514070D0164456D3975B33BD.remove(listener);
    }

    public void ooO0oooo00Oo0oooOooooOo0OoOoOooo0oo0oo0oO0oOOOOO0O0oOoOoOooOOoOoOOoOo0OO0OoOoOOoOOo0ooo0ooOOoOOooo0Oo0OOoooO0oo0OO0oooo0O(OnDestroyListener listener) {
        this.o6F963A02574767F3067B4BC58D5B2FAB9FBB.add(listener);
    }

    public void oo0oooOo00OOoooooo0O0oo0OoOOooOoOOoO0oOOOooOO0ooOoo0OoOoOOooOoOOoooOo0ooOo0OOoOoOOooooo0o0Oo0OooOo0OoOoOoOOoOooOOOOO0oOO0o00OOoOOOoOOoo0oo0(OnDestroyListener listener) {
        this.o6F963A02574767F3067B4BC58D5B2FAB9FBB.remove(listener);
    }

    public void ooO0oooo00Oo0oooOooooOo0OoOoOooo0oooOo0ooO0OOOo0OooooO0oOoooooOoOoOOo0ooOo0OO0ooO0Oo0ooOoOoOoOOOoo00o0OOoooOoooOOOOooOoO0o00OooOO0oo0oo0oOOOOoo0oOO0oOOO0oo0OoooOo0(OnActivityResultListener listener) {
        this.o6F963F04505A63F50B4E70D38A4B2DBAA1A1291E96EE24C0E8.add(listener);
    }

    public void oo0oooOo00OOoooooo0O0oo0OoOOooOoOOoO0oOOOooOO0ooOoo0OOOoOOoOooOOoO0OOoOO0o0OOO0oOOo0ooo0oOOOoOo0oOoOOO0OooOOoooOo00oooOO0o00OO0OO0oOoO0oOOoOOoOoOOOOo0Ooooo00O0oOoOo0OoO0oooOo0O0oOo0(OnActivityResultListener listener) {
        this.o6F963F04505A63F50B4E70D38A4B2DBAA1A1291E96EE24C0E8.remove(listener);
    }

    public void ooO0oooo00Oo0oooOooooOo0OoOoOoooO0oooo0oO0oOOOOOoO0oOoooOOooOoOOoooOo0ooOOooo00oOOOoOoo0oo0Ooooo0o0OoOoOoOOoOooOo00O0ooo0o00Oo0OOOOOOoo0ooOOOOO0oOO0OOOoooOOOoooOoOo0OoOoO0oOOooo0ooOo00oo0oo0oOOOooOooOooo00ooOoo0oOOOoOO0oOOO(OnRequestPermissionsResultListener listener) {
        this.o6F962C02554670EF0B6747C4945732BD84A73419A1E532C7F71922810A0A9F28BBBE3E.add(listener);
    }

    public void oo0oooOo00OOoooooo0O0oo0OoOOooOoOOoO0oOOOooOO0ooOooOOOooOOooOoOOoo0Oo0oo0o00Oo0oOoOOooo0oOOo00OOOo0Oo0OOoOOoooo0o0oO0ooo0o0OO0oOO0oo0ooOo0OOOoOOoOO0oOOoooOOOoo0Oo0o0OOOoO0oOooO0oOoOo00oO0oo0ooOo00ooOOoooOOoo0OOOoOoOoooooo00oooooOoO0ooooOOooO(OnRequestPermissionsResultListener listener) {
        this.o6F962C02554670EF0B6747C4945732BD84A73419A1E532C7F71922810A0A9F28BBBE3E.remove(listener);
    }

    public void ooO0oooo00Oo0oooOooooOo0OoOoOooo0oO0oo0oOooOO0ooOoooo00oOOOOOoOooOOOo0oo0o0OOoOoOOOO0oo0oOOOooo0oo0OooOOoooO0oooo00O0oooOo00ooOOOOOOOooOoO0OOoo0oOO0OO0ooOoooO0oo0oo00OoOO0oOOooooOoOo00oOoooOoo0OooOo0(OnConfigurationChangedListener listener) {
        this.o6F963D084A557CFB0A4543C290512F8D85A9340D96E40DDBE8190B861C0C89.add(listener);
    }

    public void oo0oooOo00OOoooooo0O0oo0OoOOooOoOOoO0oOOOooOO0ooOoo0Oo0oOOo0OoOoOo0OOoO0oo00O0ooOOo00oo0oOoOoOOo0o0OOo0OoOOo0oo0oo0O0ooOOo00OOoOo0oo0ooOo00OOooo0OO0oOOO0oOooO0oOoOo0OOo0oo0oOOoooo0oo0Oo00oo0ooOOoOOoOOooooOooOo0OoOoOo0(OnConfigurationChangedListener listener) {
        this.o6F963D084A557CFB0A4543C290512F8D85A9340D96E40DDBE8190B861C0C89.remove(listener);
    }

    public void ooO0oooo00Oo0oooOooooOo0OoOoOoooOOo0oo0oOo0OOOOO0O0oOO0oOOoO0oOOoO0OOooOOo00ooooO0OooooOOOOOoOOoOo0OOOOOooO0ooooOO0oooOo0o00oO0OOOOOOoo0oOOOO0OOOOO0ooOoooOOOoooOooo0OOOooooo0ooooOoOo0Oo0O(OndispatchTouchEventListener listener) {
        this.o6F961A0E574374E81C5F76D98C5D298B9BAD341EBFE932C6FE030B9A0A.add(listener);
    }

    public void oo0oooOo00OOoooooo0O0oo0OoOOooOoOOoO0oOOOooOO0ooOoooOoOoOOOOOoOOoooOo0oO0o00o0OoOoOooooOooOOoooO0OoOo00Oooo0oooOOO0O0oo00o00OoOOo0oOOoo0o0oOOoo0oOO0oOOoooo00ooOooOo0OoooO0oOooO0oOooo00OO0ooOo0OOoOOoOOoOOOO(OndispatchTouchEventListener listener) {
        this.o6F961A0E574374E81C5F76D98C5D298B9BAD341EBFE932C6FE030B9A0A.remove(listener);
    }

    public void ooO0oooo00Oo0oooOooooOo0OoOoOoooO0o0oo0oOooOOOo00oooOo0oOOOO0oO0o0oOo0O0oo00Oo0oOOO0ooo0oOOo0OooOo0OoOoOoOOoOooOOOOO0oOO0o00OOoOOOoOOoo0oo0(OnTouchEventListener listener) {
        this.o6F962A0851507DD909524CC2B55732BA88A63F1880.add(listener);
    }

    public void oo0oooOo00OOoooooo0O0oo0OoOOooOoOOoO0oOOOooOO0ooOooOOoOoOOo0OoOOo0oOOooOOo00oooo0oOoOoo0o0oOooOoOo0Ooo0OoOOo0ooooO0O0ooo0o0OO0oOO0oOoooOoOoOOoOo0OO0OOOoooOO0(OnTouchEventListener listener) {
        this.o6F962A0851507DD909524CC2B55732BA88A63F1880.remove(listener);
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int id) {
        Calendar o639912024A5774EE = Calendar.getInstance();
        Dialog o64911F0B4B54 = null;
        final int o769D0C144D5C7B = Build.VERSION.SDK_INT;
        switch (id) {
            case 0:
                DatePickerDialog.OnDateSetListener o64990A02685A66E81A5947C4 = new DatePickerDialog.OnDateSetListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.2
                    @Override // android.app.DatePickerDialog.OnDateSetListener
                    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                        String o729D0D124847;
                        String o729D0D1248472;
                        String o729D0D1248473;
                        String o729D0D1248474;
                        if (o769D0C144D5C7B == 16) {
                            if (ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.oC82DB8BD9BC1DF4BCBF9ED5A2A98) {
                                ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.oC82DB8BD9BC1DF4BCBF9ED5A2A98 = false;
                                return;
                            }
                            ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.oC82DB8BD9BC1DF4BCBF9ED5A2A98 = true;
                            if (month + 1 < 10) {
                                o729D0D1248473 = year + "/0" + (month + 1);
                            } else {
                                o729D0D1248473 = year + "/" + (month + 1);
                            }
                            if (dayOfMonth < 10) {
                                o729D0D1248474 = o729D0D1248473 + "/0" + dayOfMonth;
                            } else {
                                o729D0D1248474 = o729D0D1248473 + "/" + dayOfMonth;
                            }
                            ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.o619B0A0E525653F30D5A.oOo0o0OooOOOoOoOo0OOoOOOoo00OoOOo0oooOoooOoooOo0oOooOOOo00oO0OO0oO0oOoo0o(o729D0D1248474);
                            ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext().removeDialog(0);
                            return;
                        }
                        if (month + 1 < 10) {
                            o729D0D124847 = year + "/0" + (month + 1);
                        } else {
                            o729D0D124847 = year + "/" + (month + 1);
                        }
                        if (dayOfMonth < 10) {
                            o729D0D1248472 = o729D0D124847 + "/0" + dayOfMonth;
                        } else {
                            o729D0D1248472 = o729D0D124847 + "/" + dayOfMonth;
                        }
                        ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.o619B0A0E525653F30D5A.oOo0o0OooOOOoOoOo0OOoOOOoo00OoOOo0oooOoooOoooOo0oOooOOOo00oO0OO0oO0oOoo0o(o729D0D1248472);
                        ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext().removeDialog(0);
                    }
                };
                if (oB30DB4DBE0D9 > -1 && oB30DB4DBF0F1 > -1 && oB30DB4DBECE6 > -1) {
                    o64911F0B4B54 = new DatePickerDialog(this, o64990A02685A66E81A5947C4, oB30DB4DBE0D9, oB30DB4DBF0F1, oB30DB4DBECE6);
                } else {
                    o64911F0B4B54 = new DatePickerDialog(this, o64990A02685A66E81A5947C4, o639912024A5774EE.get(1), o639912024A5774EE.get(2), o639912024A5774EE.get(5));
                }
                o64911F0B4B54.setCancelable(false);
                o64911F0B4B54.setCanceledOnTouchOutside(false);
                o64911F0B4B54.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.3
                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface param) {
                        ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext().removeDialog(0);
                    }
                });
                o64911F0B4B54.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.4
                    @Override // android.content.DialogInterface.OnDismissListener
                    public void onDismiss(DialogInterface param) {
                        ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext().removeDialog(0);
                    }
                });
                break;
            case 1:
                TimePickerDialog.OnTimeSetListener o74911302685A66E81A5947C4 = new TimePickerDialog.OnTimeSetListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.5
                    @Override // android.app.TimePickerDialog.OnTimeSetListener
                    public void onTimeSet(TimePicker timerPicker, int hourOfDay, int minute) {
                        String o729D0D124847;
                        String o729D0D1248472;
                        String o729D0D1248473;
                        String o729D0D1248474;
                        if (o769D0C144D5C7B == 16) {
                            if (ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.oCA49C2839BC1DF4BCBF9ED5A2A98) {
                                ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.oCA49C2839BC1DF4BCBF9ED5A2A98 = false;
                                return;
                            }
                            ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.oCA49C2839BC1DF4BCBF9ED5A2A98 = true;
                            if (hourOfDay < 10) {
                                o729D0D1248473 = "0" + hourOfDay;
                            } else {
                                o729D0D1248473 = "" + hourOfDay;
                            }
                            if (minute < 10) {
                                o729D0D1248474 = o729D0D1248473 + ":0" + minute;
                            } else {
                                o729D0D1248474 = o729D0D1248473 + ":" + minute;
                            }
                            ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.o619B0A0E525653F30D5A.oOo0OoooOoo00Oo0ooOo0Ooo0o00OoOOo0oooOoooOoooOo0oOooOOOo00oO0OO0oO0oOoo0o(o729D0D1248474);
                            ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext().removeDialog(1);
                            return;
                        }
                        if (hourOfDay < 10) {
                            o729D0D124847 = "0" + hourOfDay;
                        } else {
                            o729D0D124847 = "" + hourOfDay;
                        }
                        if (minute < 10) {
                            o729D0D1248472 = o729D0D124847 + ":0" + minute;
                        } else {
                            o729D0D1248472 = o729D0D124847 + ":" + minute;
                        }
                        ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.o619B0A0E525653F30D5A.oOo0OoooOoo00Oo0ooOo0Ooo0o00OoOOo0oooOoooOoooOo0oOooOOOo00oO0OO0oO0oOoo0o(o729D0D1248472);
                        ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext().removeDialog(1);
                    }
                };
                if (oB30DB4DBEE82 > -1 && oB30DB4DB93E5 > -1) {
                    o64911F0B4B54 = new TimePickerDialog(this, o74911302685A66E81A5947C4, oB30DB4DBEE82, oB30DB4DB93E5, true);
                } else {
                    o64911F0B4B54 = new TimePickerDialog(this, o74911302685A66E81A5947C4, o639912024A5774EE.get(11), o639912024A5774EE.get(12), true);
                }
                o64911F0B4B54.setCancelable(false);
                o64911F0B4B54.setCanceledOnTouchOutside(false);
                o64911F0B4B54.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.6
                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface param) {
                        ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext().removeDialog(1);
                    }
                });
                o64911F0B4B54.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooO0oooo00oO0oooOooooooOOoOoOoOoOOOooo0oooo.ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.7
                    @Override // android.content.DialogInterface.OnDismissListener
                    public void onDismiss(DialogInterface param) {
                        ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.getContext().removeDialog(1);
                    }
                });
                break;
        }
        return o64911F0B4B54;
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public oOoOoOooOoo0OOo0oooOoOOOooO0OOooOOOOOoO0oOOOO0O0o oOoOoO0oo0o00OoOoO0Oo0oO0o00O0oo0Ooo0OooOoooOooO0(String formname) {
        if (this.o66970C0A495265.containsKey(formname)) {
            return this.o66970C0A495265.get(formname);
        }
        return null;
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public void oOoOooooOOOoOOo0Oooo0Ooooo00O0oo0Ooo0OooOoooOooO0(String formname, oOoOoOooOoo0OOo0oooOoOOOooO0OOooOOOOOoO0oOOOO0O0o formImpl) {
        this.o66970C0A495265.put(formname, formImpl);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public void oOo0OO0O0oooOOo0oOOOoOOOOo00O0oo0Ooo0OooOoooOooO0(String formname) {
        if (this.o66970C0A495265.containsKey(formname)) {
            this.o66970C0A495265.get(formname);
            this.o66970C0A495265.remove(formname);
        }
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public void oOo0o0oooOo0OOo0oOOOOoOo0o00O0oo0Ooo0OooOoooOooO0(oOoOoOooOoo0OOo0oooOoOOOo form) {
        try {
            oOoOoOooOoo0OOo0oooOoOOOooO0OOooOOOOOoO0oOOOO0O0o o66970C0A6D5E65F0 = (oOoOoOooOoo0OOo0oooOoOOOooO0OOooOOOOOoO0oOOOO0O0o) form;
            setContent(o66970C0A6D5E65F0.getView());
            form.oB112B285(form.oB112B285());
            o619B0A0E525653F30D5A = o66970C0A6D5E65F0;
            View o76 = getCurrentFocus();
            if (o76 != null) {
                o76.clearFocus();
            }
            o619B0A0E525653F30D5A.oOo0o0oooOo0OOo0oOOOOoOo0OOOo00OOoo00OoooOooOOoo0();
            if (this.oB549B9D79FDDA333BF8F != null) {
                this.oB549B9D79FDDA333BF8F.oOoOooOoo0oo0Oo0OoOOo0ooOo00oOOo0Oo0OOoooooooOo0OOo0ooOo00OO0();
                getWindow().invalidatePanelMenu(0);
            }
        } catch (Exception e) {
        }
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public oOoOOO0oo0oOOOo0oOOOo0O0ooO0OOooOOOOOoO0oOOOO0O0o oOoOoO0oo0o00OoOoO0Oo0oO0o00OoOOO0OOOOooOOOoo0OoO(String clientname) {
        if (this.o639417024A4778FD0F.containsKey(clientname)) {
            return this.o639417024A4778FD0F.get(clientname);
        }
        return null;
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public void oOoOooooOOOoOOo0Oooo0Ooooo00OoOOO0OOOOooOOOoo0OoO(String clientname, oOoOOO0oo0oOOOo0oOOOo0O0ooO0OOooOOOOOoO0oOOOO0O0o clientImpl) {
        this.o639417024A4778FD0F.put(clientname, clientImpl);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public Object oOoOoO0oo0o00OoOoO0Oo0oO0OOOO0oo00O0oOooOooo0ooOO(String modelname) {
        if (this.o6D971A02485E74EC.containsKey(modelname)) {
            return this.o6D971A02485E74EC.get(modelname);
        }
        return null;
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public void oOoOooooOOOoOOo0Oooo0OoooOOOO0oo00O0oOooOooo0ooOO(String modelname, Object model) {
        this.o6D971A02485E74EC.put(modelname, model);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public void oOoOooooOOOoOOo0Oooo0Ooooo00ooOOOOo0oOOoOoooO0OO0(String objname, Object obj) {
        this.o6F9A140A4543.put(objname, obj);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public Object oOoOoO0oo0o00OoOoO0Oo0oO0o00ooOOOOo0oOOoOoooO0OO0(String objname) {
        if (this.o6F9A140A4543.containsKey(objname)) {
            return this.o6F9A140A4543.get(objname);
        }
        return null;
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public void oOoOoOOoOOo0oOo0OOoo00oooOOOo0OOOoooOOOoOO0ooOooO(String msg) {
        Toast.makeText(getApplicationContext(), msg, 0).show();
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public void oOoOOOooooo00OoOoOoo00OO0o00o0oOO0OO0Oo0oOOoO0OOO() {
        oOoOoOooOoo0OOo0oooOoOOOoOO0ooOOO0O0oOooOO0oO0OO0OoOoo0o00OO0();
        finish();
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public void oOo0o0ooOoo0oOooo0OOoooooo00o00OOoooOOOoOO0oO0oOoOo0Oo0OO0OoOOO0ooOoOooOo() {
        oOoOoOooOoo0OOo0oooOoOOOoOO0ooOOO0O0oOooOO0oO0OO0OoOoo0o00OO0();
        Process.killProcess(Process.myPid());
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public void oOoOoOooOoo0OOo0oooOoOOOoOO0ooOOO0O0oOooOO0oO0OO0OoOoo0o00OO0() {
        moveTaskToBack(true);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public void oOoOo0ooOoOOoOo0oOOOoOOO0OO0o0oo00oOOOo0oO0oOOOO0() {
        Intent o69960A024A47 = new Intent(getApplicationContext(), ooO0OOoo00o00oooo0oO0oo00oO0oOOoOOO0ooO0oooOO0oOOO0oo00oOOOOOoOOoO0Oo0OO0.class);
        o69960A024A47.setFlags(335544320);
        getApplicationContext().startActivity(o69960A024A47);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public void oOoOo0ooOoOOoOo0oOOOoOOO0OO0oo0OO0oo0OOooO0o0oOoo() {
        Intent o69 = new Intent("android.intent.action.MAIN");
        o69.setFlags(268435456);
        o69.addCategory("android.intent.category.HOME");
        startActivity(o69);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public void oOoOoOOoOOo0oOo0OOoo00oooOOOo0OOOoooOOOoOO0ooOooOoOoOOo(String imagePath, String text, int style, int loaction) {
        Context o63971013414B61 = getContext();
        Toast o74971F1450 = Toast.makeText(o63971013414B61, text, 1);
        if (loaction == 1) {
            o74971F1450.setGravity(17, 0, 0);
        } else {
            o74971F1450.setGravity(80, 0, 0);
        }
        ImageView o699519 = new ImageView(o63971013414B61);
        oOo0o00oooO0oOooo0OOoooOoOOOo00o0OOO0OOoOoooO0OOo(o699519, imagePath);
        LinearLayout o6C9907085147 = (LinearLayout) o74971F1450.getView();
        switch (style) {
            case 1:
                o6C9907085147.setOrientation(0);
                o6C9907085147.setGravity(19);
                o6C9907085147.addView(o699519, 0);
                break;
            case 2:
                o6C9907085147.setOrientation(1);
                o6C9907085147.setGravity(19);
                o6C9907085147.addView(o699519, 0);
                break;
            case 3:
                o6C9907085147.setOrientation(0);
                o6C9907085147.setGravity(19);
                o6C9907085147.addView(o699519);
                break;
            case 4:
                o6C9907085147.setOrientation(1);
                o6C9907085147.setGravity(19);
                o6C9907085147.addView(o699519);
                break;
        }
        o74971F1450.show();
    }

    private void oOo0o00oooO0oOooo0OOoooOoOOOo00o0OOO0OOoOoooO0OOo(ImageView view, String imagePath) {
        if (imagePath.length() > 0) {
            if (imagePath.startsWith("/")) {
                File o66 = new File(imagePath);
                if (o66.exists()) {
                    Bitmap o62910A0A4543 = BitmapFactory.decodeFile(imagePath);
                    view.setImageBitmap(o62910A0A4543);
                    view.setAdjustViewBounds(true);
                    return;
                }
                return;
            }
            try {
                Drawable o648A1F10455179F9 = Drawable.createFromStream(getContext().getResources().getAssets().open(imagePath), imagePath);
                view.setImageDrawable(o648A1F10455179F9);
                view.setAdjustViewBounds(true);
                return;
            } catch (IOException e) {
                return;
            }
        }
        view.setImageDrawable(null);
        view.setAdjustViewBounds(true);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public boolean oOo0Ooooo0OO0Oo0o00o00oO0OO0O0oOOOo00OOoooOooOOo0OoOoo0o00OO0() {
        String o74970E2647477CEA16435BF5955F32BDA3A9370F = ooO0o0oo00OOoO0oOoooo0oo0oOoOoOoOooo0oOOoOoOO0OO0O0oOoOoOOOOOoOOoOoOOoOO0o0OOOooOoo0oO0oOO0OooOO0o0OO0oOooOOo(this);
        return o74970E2647477CEA16435BF5955F32BDA3A9370F.equals("com.e4a.runtime.android.mainActivity");
    }

    private String ooO0o0oo00OOoO0oOoooo0oo0oOoOoOoOooo0oOOoOoOO0OO0O0oOoOoOOOOOoOOoOoOOoOO0o0OOOooOoo0oO0oOO0OooOO0o0OO0oOooOOo(Context context) {
        ActivityManager o619B0A0E525A61E532564CD79E5B33 = (ActivityManager) context.getSystemService("activity");
        List<ActivityManager.RunningTaskInfo> o728D10094D5D72C81E4449FF97582EBD = o619B0A0E525A61E532564CD79E5B33.getRunningTasks(1);
        if (o728D10094D5D72C81E4449FF97582EBD == null) {
            return null;
        }
        ComponentName o66 = o728D10094D5D72C81E4449FF97582EBD.get(0).topActivity;
        String o74970E2647477CEA16435BF5955F32BDA3A9370F = o66.getClassName();
        return o74970E2647477CEA16435BF5955F32BDA3A9370F;
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public void oOOoo0ooOOOooOo0Oo0o0OoO0o00oooo00Oo0OoooO0oO0OooOo0OOoOO0Oo0o00o0oooooo0(View v) {
        registerForContextMenu(v);
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public Application oOoOOoOO0oo00OoOoO0Oo0oO0OOOOo0o00o0OOooOoOoOoOooOooOo0o00oooOO0oooo0ooOO() {
        return getApplication();
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public Context oOoOOoOO0oo00OoOoO0Oo0oO0OOOOo0o00o0OOooOoOoOoOooOooOo0o00oooOO0oooo0ooOOoo0O0oOO0oooo0OOOOO0oOo0ooOoo0O0oOo0() {
        return getApplicationContext();
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public Context oOoOOoOO0oo00OoOoO0Oo0oO0OOOOOoOO0Oo0OOoOoooOOOOOOoOoooOO0oo0() {
        return getContext();
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public Intent oOoOOoOO0oo00OoOoO0Oo0oO0OOOooOOo0o0oOoooo0oo0oo0Oo0OOoOO0o00OOOo0OoOoOoO() {
        return getIntent();
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public Bundle oOoOOoOO0oo00OoOoO0Oo0oO0OOOooOOo0o0oOoooo0oo0oo0OoOoO0OOoOO0OO0oOoo0ooOO() {
        return this.oC60CC8C8EDDBC35F;
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public float oOOoo0ooOOooOOo0oOOOOoOo0OO0oo0OOOoOOOOoo00o0oo00Oo0OoOOo0oOoOO0ooOoooo0o(float f) {
        return (oC454B6A8F3E5D979B0C6E96E4DCD916F / 9.0f) * f;
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public float oOo0o0OoOOo00OoOoooOOoooOOOOo00o0OO0oOOoooooo0O0oOoOo0oOO0o0OOO0oOOoO0O0ooo0oOOOOoOoOOO0oOOoo0OOooo0OOooO0o00() {
        return oC454B6A8F3E5D979B0C6E96E4DCD916F;
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public boolean oOo0Ooooo0OO0Oo0o00o00oO0OO0oo0OOOo0oOOoOO0oOOoO0OooOo0o00ooo() {
        return this.oD72EB282F3E7DF56AC91;
    }

    @Override // ooO0oo0o00o0oooooo0.ooO0oOOOo0Oo0oooOO0.oo0oooOo0OOOooooO0oooooo0oOoOOooOOOOOo0oO0o.ooOooooo0Oo0OO0oOOOO0oOoOoOoOOooOOO0oo0ooOoOOOo0OooooO0oOOo0OoOoOo0OO0O0oo0OOo0oOOO0oooOooOOoOOooo0OoOoOooo0ooo0oOooooo00
    public void oOoOO0oO0oOoOOo0o0OOo0OO0o00OO0OOoOOoOoooo0oo0oo0OoOOO0o0OOO0(oOoOOoOooooO0Oo0o0OOo0o0OOOOoOoo0OOoO actionbar) {
        if (Build.VERSION.SDK_INT >= 11) {
            ooO0o0oo00OOoO0oOooooOo0OoOOooOoOOoO0oO0o0oOO0Oooooooo0oOOo0OoOOoOOOO0OoOo00Oo0oOOO0ooo0oOo();
            this.oB549B9D79FDDA333BF8F = (oOoOOoOooooO0Oo0o0OOo0o0OOOOoOoo0OOoOoOOOo0OO0oooO0oOO0oOOOoO) actionbar;
        }
    }
}