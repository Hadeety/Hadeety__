package mohammed.hatoon.hadeety;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class ChangePassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        EditText newPass=(EditText)findViewById(R.id.NewPassword);
        EditText conPass=(EditText)findViewById(R.id.conPassword);

        if(newPass.equals(conPass)){

        }else{
            Toast.makeText(this,"passwords doesn't match",Toast.LENGTH_LONG);

        }

    }
}
