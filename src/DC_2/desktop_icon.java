//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package DC_2;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.WinDef.HDC;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinUser.HHOOK;
import com.sun.jna.platform.win32.WinUser.HOOKPROC;
import com.sun.jna.win32.W32APIOptions;

public class desktop_icon {
    public desktop_icon() {
    }

    HWND GetDCHandle() {
        desktop_icon.User32 lib = (desktop_icon.User32)Native.loadLibrary("user32", desktop_icon.User32.class, desktop_icon.User32.DEFAULT_OPTIONS);
        HWND hWnd = lib.FindWindow("Progman", "Program Manager");
        return hWnd;
    }

    HWND Get_Active() {
        desktop_icon.User32 lib = (desktop_icon.User32)Native.loadLibrary("user32", desktop_icon.User32.class, desktop_icon.User32.DEFAULT_OPTIONS);
        return lib.GetForegroundWindow();
    }

    boolean checkDesktop() {
        desktop_icon.User32 lib = (desktop_icon.User32)Native.loadLibrary("user32", desktop_icon.User32.class, desktop_icon.User32.DEFAULT_OPTIONS);
        HWND hWnd = lib.FindWindow("Notepad", "Untitled - Notepad");
        HWND hWnd2 = lib.GetForegroundWindow();
        return hWnd == hWnd2;
    }


    void test_show()
    {
        desktop_icon.User32 lib = (desktop_icon.User32)Native.loadLibrary("user32", desktop_icon.User32.class, desktop_icon.User32.DEFAULT_OPTIONS);
         HWND hWnd = lib.FindWindow("Progman", "Program Manager");
        hWnd = lib.GetWindow(hWnd, 4);
        hWnd = lib.GetWindow(hWnd, 4);
        lib.ShowWindow(hWnd, 1);
        System.out.println(lib.GetForegroundWindow());
    }

    void showdesktopicon(boolean indikator) {
        desktop_icon.User32 lib = (desktop_icon.User32)Native.loadLibrary("user32", desktop_icon.User32.class, desktop_icon.User32.DEFAULT_OPTIONS);
        HWND hWnd = lib.FindWindow("Progman", "Program Manager");
        hWnd = lib.GetWindow(hWnd, 5);
        hWnd = lib.GetWindow(hWnd, 5);
        if (indikator) {
            lib.ShowWindow(hWnd, 0);
        } else {
            lib.ShowWindow(hWnd, 5);
        }

    }

    public interface User32 extends W32APIOptions {
        int SW_SHOW = 5;
        int GW_CHILD = 5;
        int SW_HIDE = 0;
        int WM_COMMAND = 273;
        int WM_LBUTTONDOWN = 513;
        int WM_KEYDOWN = 256;
        int WH_MOUSE = 7;
        float s = 1.0F;

        boolean checkDesktop();

        void ShowWindow(HWND var1, int var2);

        HDC GetDC(HWND var1);

        HWND FindWindow(String var1, String var2);

        HWND GetWindow(HWND var1, int var2);

        HWND GetForegroundWindow();

        void SendMessage(HWND var1, int var2, int var3, int var4);

        void showdesktopicon(boolean var1);

        void SetCapture(HWND var1);

        void ReleaseCapture();

        HWND GetCursor(HWND var1);

        int GetCursorPos(int[] var1);

        HWND GetCapture();

        HWND SetFocus(HWND var1);

        HWND GetActiveWindow();

        HWND GetDCHalndle();

        void Mouse_Event(int var1, int var2, int var3, int var4, int var5);

        HHOOK SetWindowsHookEx(int var1, HOOKPROC var2, int var3, int var4);
    }
}
