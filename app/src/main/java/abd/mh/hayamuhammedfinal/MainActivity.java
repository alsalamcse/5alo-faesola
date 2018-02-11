package abd.mh.hayamuhammedfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etPhone ;
    private Button  btSignin ;
    private Button btSignup ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etPhone = (EditText) findViewById(R.id.etPhone);
        btSignin = (Button) findViewById(R.id.btSignin);
        btSignup = (Button) findViewById(R.id.btSignup);


        btSignin.setOnClickListener();



    }

    private  void dataHandler ( ) {
        String
    }



}
