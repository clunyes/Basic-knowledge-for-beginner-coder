package android;

public class activityLauncher {
    /**
     * Activity启动时是通过Binder向AMS(ActivityManagerService)发请求，通过IPC启动Activity的。
     */
    /**
     * 启动流程：
     * ①点击桌面App图标，Launcher进程采用Binder IPC向system_server进程发起startActivity请求；
     * ②system_server进程接收到请求后，向zygote进程发送创建进程的请求；
     * ③Zygote进程fork出新的子进程，即App进程；
     * ④App进程，通过Binder IPC向sytem_server进程发起attachApplication请求；
     * ⑤system_server进程在收到请求后，进行一系列准备工作后，再通过binder IPC向App进程发送scheduleLaunchActivity请求；
     * ⑥App进程的binder线程（ApplicationThread）在收到请求后，通过handler向主线程发送LAUNCH_ACTIVITY消息；
     * ⑦主线程在收到Message后，通过发射机制创建目标Activity，并回调Activity.onCreate()等方法。
     * ⑧到此，App便正式启动，开始进入Activity生命周期，执行完onCreate/onStart/onResume方法，UI渲染结束后便可以看到App的主界面。
     *
     *
     * 简单介绍：
     * ipc----fork一个新的进程app进程---（app进程向system_server）attachApplication----（system_server向app进程）scheduleLaunchActivity
     *
     * app进程向主线程发出LAUNCH_ACTIVITY消息，开始生命周期
     */
}
