package cejv669.concordia.com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
        public void btnAdd(View v)
        {
            EditText t1 = findViewById(R.id.txtNumber1);
            EditText t2 = findViewById(R.id.txtNumber2);
            TextView tv1 = findViewById(R.id.lblResult);
            TextView tv2 = findViewById(R.id.lblResult2);


            int res;

            tv1.setText(t1.getText().toString() + t2.getText().toString());


            int num1 = Integer.parseInt(t1.getText().toString());
            int num2 = Integer.parseInt(t2.getText().toString());

            res = num1 + num2;
            tv2.setText(Integer.toString(res));
        }


}
