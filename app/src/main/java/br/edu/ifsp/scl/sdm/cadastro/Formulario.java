package br.edu.ifsp.scl.sdm.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;



public class Formulario extends AppCompatActivity implements View.OnClickListener{

    private EditText nomeEt;
    private EditText cidadeEt;
    private EditText telefoneEt;
    private EditText emailEt;
    private Button salvarBt;
    private Spinner estadosSp;
    private Button limparBt;
    private CheckBox selecionadoCb;
    private RadioButton masculino;
    private RadioButton feminino;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeEt = findViewById(R.id.nomeEt);
        cidadeEt = findViewById(R.id.cidadeEt);
        telefoneEt = findViewById(R.id.telefoneEt);
        emailEt = findViewById(R.id.emailEt);
        salvarBt = findViewById(R.id.salvarBt);
        salvarBt.setOnClickListener(this);
        estadosSp = findViewById(R.id.estadosSp);
        selecionadoCb = findViewById(R.id.selecionadoCb);
        masculino = findViewById(R.id.masculino);
        limparBt = findViewById(R.id.limparBt);
        feminino = findViewById(R.id.feminino);
        

       limparBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nomeEt.setText("");
                cidadeEt.setText("");
                emailEt.setText("");
                telefoneEt.setText("");
                feminino.setChecked(false);
                masculino.setChecked(true);
                selecionadoCb.setChecked(false);
                estadosSp.setSelection(0);
            }
        });
    }



    public void onClick(View view) {

               StringBuilder sb = new StringBuilder();

            //EditText nome
            sb.append(nomeEt.getText().toString());
            sb.append('\n');

            //EditText cidade
            sb.append(cidadeEt.getText().toString());
            sb.append('\n');

            //EditText telefone
            sb.append(telefoneEt.getText().toString());
            sb.append('\n');

            //EditText e-mail
            sb.append(emailEt.getText().toString());
            sb.append('\n');

            //spinner
            sb.append(((TextView) estadosSp.getSelectedView()).getText());
            sb.append('\n');

            //Checkbox
            sb.append(selecionadoCb.isChecked() ? "Sim, Deseja ingressar na lista de e-mails!" : "Não deseja ingressar na lista de e-mails!");
            sb.append('\n');

            //RadioButton
            sb.append(masculino.isChecked() ? "Sexo masculino" : "Sexo feminino");

            Toast.makeText(this, sb.toString(), Toast.LENGTH_LONG).show();


    }


  }
