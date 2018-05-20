package recyclerviewcheckbox1.com.interfaceinandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        //TODO can use in button click also //
        MyInterface setData = (MyInterface ) MainActivity.this;
        setData.showData(false);


        new MyInterface() {
            @Override
            public void showData(boolean b) {

                Log.d("",""+b);
            }
        };



    }

}
