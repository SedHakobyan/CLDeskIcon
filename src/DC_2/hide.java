//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package DC_2;

import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef.HMODULE;
import com.sun.jna.platform.win32.WinDef.LRESULT;
import com.sun.jna.platform.win32.WinDef.WPARAM;
import com.sun.jna.platform.win32.WinUser;
import com.sun.jna.platform.win32.WinUser.HHOOK;
import com.sun.jna.platform.win32.WinUser.HOOKPROC;
import com.sun.jna.platform.win32.WinUser.KBDLLHOOKSTRUCT;
import com.sun.jna.platform.win32.WinUser.LowLevelKeyboardProc;
import com.sun.jna.platform.win32.WinUser.MSG;

public class hide {
    public static HOOKPROC procedure1;
    private static LowLevelKeyboardProc keyboardHook;
    private static volatile boolean quit;
    private static HHOOK hhk;

    public hide() {
    }

    public static void main(String[] args) {
        final desktop_icon des = new desktop_icon();
        System.out.println("vot = "+des.GetDCHandle().);
        System.out.println ("active wind = " + des.Get_Active());
        System.out.println("null string =" + WinUser.WM_KEYUP);
         des.test_show();

       HMODULE hMod = Kernel32.INSTANCE.GetModuleHandle(null);
       /* final User32 lib = User32.INSTANCE;
        HMODULE hMod = Kernel32.INSTANCE.GetModuleHandle((String)null);
        keyboardHook = new LowLevelKeyboardProc() {
            public LRESULT callback(int nCode, WPARAM wParam, KBDLLHOOKSTRUCT info) {
                if (nCode >= 0) {
                    switch(wParam.intValue()) {
                        case 257:
                            boolean hide = false;
                            switch(info.vkCode) {
                                case 27:
                                    DC_2.hide.quit = true;
                                    break;
                                case 121:
                                    if (des.GetDCHandle().equals(des.Get_Active())) {
                                        hide = false;
                                        des.showdesktopicon(hide);
                                        System.out.println("no");
                                    }
                                    break;
                                case 122:
                                    if (des.GetDCHandle().equals(des.Get_Active())) {
                                        hide = true;
                                        des.showdesktopicon(hide);
                                        System.out.println("yes" + des.GetDCHandle().toString() + des.Get_Active());
                                    } else {
                                        System.out.println("not" + des.GetDCHandle().toString() + " " + des.Get_Active().toString());
                                    }
                            }
                    }
                }

                return lib.CallNextHookEx(hide.hhk, nCode, wParam, info.getPointer());
            }
        };

        hhk = lib.SetWindowsHookEx(13, keyboardHook, hMod, 0);
        (new Thread() {
            public void run() {
                while(!hide.quit) {
                    try {
                        Thread.sleep(10L);
                    } catch (Exception var2) {
                        ;
                    }
                }

                System.err.println("unhook and exit" + lib.FindWindow("progman", (String)null).toString());
                lib.UnhookWindowsHookEx(hide.hhk);
                System.exit(0);
            }
        }).start();
        MSG msg = new MSG();

        int result;
        while((result = lib.GetMessage(msg, lib.FindWindow("Notepad", "Untitled - Notepad"), 0, 0)) != 0) {
            if (result == -1) {
                System.err.println("error in get message");
                break;
            }

            System.err.println("got message");
            lib.TranslateMessage(msg);
            lib.DispatchMessage(msg);
        }

        lib.UnhookWindowsHookEx(hhk);
    */ }
}

