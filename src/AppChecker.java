public class AppChecker {
    public static void main(String[] args) {
        IphoneApp iphone = new IphoneApp("Iphone 1.0");
        iphone.appInfo();
        iphone.runIphoneApp();

        AndroidApp android = new AndroidApp("Android 1.0");
        android.appInfo();
        android.runAdroidApp();
    }


}
