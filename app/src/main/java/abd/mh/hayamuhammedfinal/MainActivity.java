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
    private  FirebaseAuth auth ;
    private

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

        String etPhone = etPhone.getText().toString();
        boolean isOk = true;
        if (etPhone.length() == 0 || etPhone.length() < 10 ||etPhone.length() >10 ) {
            etPhone.setError("WRONG PHONE");
            isOk = false;
    }
      if (isOk) {

      }

    @Override
    public void onClick(View view) {



    }
}
