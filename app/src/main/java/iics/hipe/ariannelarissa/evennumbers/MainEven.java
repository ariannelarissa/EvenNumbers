package iics.hipe.ariannelarissa.evennumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainEven extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_even);

        Button displayButton = (Button) findViewById(R.id.Display_button);
        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                TextView resultTextView = (TextView) findViewById(R.id.textView_disp);

                int num;
                for(num=1; num<=20; num++ ) {
                    if(num % 2 == 0) {
                        resultTextView.append(Integer.toString(num));
                        resultTextView.append(" ");
                    }
                }


            }
        });
    }
}
