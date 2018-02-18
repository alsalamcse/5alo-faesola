package abd.mh.hayamuhammedfinal;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuAdapter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import static com.google.firebase.auth.FirebaseAuth.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etPhone ;
    private Button  btSignin ;
    private Button btSignup ;
    private  EditText etPassword ;
    private  FirebaseAuth auth ;
    private FirebaseUser firebaseUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etPhone = (EditText) findViewById(R.id.etPhone);
        btSignin = (Button) findViewById(R.id.btSignin);
        btSignup = (Button) findViewById(R.id.btSignup);
        etPassword=(EditText) findViewById(R.id.etPassword) ;
        btSignin.setOnClickListener();
        auth = FirebaseAuth.getInstance();
        firebaseUser=auth.getCurrentUser();




    }

    private  void dataHandler ( ) {

        String stPhone = etPhone.getText().toString();
        String stpassword = etPassword.getText().toString();
        signIn(etPassword, stpassword);
    }

    private void signIn(String email, String passw) {
        auth.signInWithEmailAndPassword(email, passw).addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(MainFCMAcivity.class);
                    Intent intent;
                    startActivity(intent));
                    finish();
                }
                 else  {
                    Toast.makeText(MainActivity.this, "signIn failed."+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    task.getException().printStackTrace();

                }
            }
        }) {
            if (task.is)
    }


      }

    @Override
    public void onClick(View view) {



    }
}
