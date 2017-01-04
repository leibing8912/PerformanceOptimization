package cn.jianke.performanceoptimization;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/**
 * @className: MemoryOptimizationActivity
 * @classDescription: 内存优化页面
 * @author: leibing
 * @createTime: 2017/1/4
 */
public class MemoryOptimizationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        switch (level){
            case TRIM_MEMORY_RUNNING_CRITICAL:
                // 应用处于Runnig状态
                // 系统内存已经非常低，你的应用程序应当考虑释放部分资源
                // do release resource
                break;
            case TRIM_MEMORY_UI_HIDDEN:
                // 应用的可见性发生变化
                // 应用已经处于不可见状态，可以考虑释放一些与显示相关的资源
                // release resource
                break;
            case TRIM_MEMORY_BACKGROUND:
                // 应用处于后台
                // 系统内存稍低，你的应用被杀的可能性不大。但可以考虑适当释放资源
                // do release resource
                break;
            case TRIM_MEMORY_COMPLETE:
                // 应用处于后台
                // 系统内存已经非常低，你的应用即将被杀死，请释放所有可能释放的资源
                // do release resource
                break;
            default:
                break;
        }
    }
}
