package pengjf.cn.smartshape;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Created by pengjf on 2016/6/17.
 */
public class MainActivity extends Activity {

    public static final String TAG = "MainActivity";
    private DrawView mDrawView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDrawView = (DrawView) findViewById(R.id.drawview);
    }
    public void rect(View v){
        Log.d(TAG, "rect: ");
        mDrawView.setDRAW(DrawView.RECT);
        mDrawView.invalidate();
    }
    public void arc(View v){
        Log.d(TAG, "arc: ");
        mDrawView.setDRAW(DrawView.ARC);
        mDrawView.invalidate();
    }
    public void tri(View v){
        Log.d(TAG, "tri: ");
        mDrawView.setDRAW(DrawView.TRI);
        mDrawView.invalidate();
    }
    public void clear(View v){
        Toast.makeText(MainActivity.this, "clear", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "clear: ");
        mDrawView.invalidate();
    }
}
