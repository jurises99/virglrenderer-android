package process;

public class p20 extends android.app.Service
{
    @Override
    public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
    }
	@Override
    public void onCreate() {
		super.onCreate();
		common.overlay.start(this,20);
		}
	@Override
    public void onDestroy() {
		super.onDestroy();
		System.exit(0);
		}
}