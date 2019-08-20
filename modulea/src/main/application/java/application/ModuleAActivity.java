package application;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;


import com.devyk.component_eventbus.proevent.EventManager;
import com.devyk.component_eventbus.proevent.dispatcher.IMessageHandler;
import com.dn_alan.module2.R;

/**
 * <pre>
 *     author  : devyk on 2019-08-08 17:11
 *     blog    : https://juejin.im/user/578259398ac2470061f3a3fb/posts
 *     github  : https://github.com/yangkun19921001
 *     mailbox : yang1001yk@gmail.com
 *     desc    : This is ModuleAActivity
 * </pre>
 */
public class ModuleAActivity extends Activity implements IMessageHandler {

    private String TAG = "ModuleAActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module_a_activity);
        EventManager.getInstance().registerMessager(200, this);
    }

    @Override
    public Handler getHandler() {
        return new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                Log.d(TAG, "拿到数据");
                switch (msg.what) {
                    case 200:
                        String message = msg.getData().getString("1212");
                        Toast.makeText(getApplicationContext(), getApplicationContext().getPackageName() + " 收到：" + message, Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        };
    }
}
