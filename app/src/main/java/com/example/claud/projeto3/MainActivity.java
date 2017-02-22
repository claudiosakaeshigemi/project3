package com.example.claud.projeto3;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String resposta = "";
    int pontos = 0;
    String  lider = "Hank" ;
    String  nomeDoDragao = "Tiamat" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resposta = "";
    }


    public void validar(View view) {

        EditText editTextNomeLider = (EditText)findViewById(R.id.edit_text_nome);
        nomeLider(editTextNomeLider);

        EditText editTextNomeDragao = (EditText)findViewById(R.id.edit_text_nomeDragao);


        CheckBox hank = (CheckBox) findViewById(R.id.checkbox_hank);
        boolean hasHank = hank.isChecked();

        CheckBox eric = (CheckBox) findViewById(R.id.checkbox_eric);
        boolean hasEric = eric.isChecked();

        CheckBox diana = (CheckBox) findViewById(R.id.checkbox_diana);
        boolean hasDiana = diana.isChecked();

        CheckBox sheila = (CheckBox) findViewById(R.id.checkbox_sheila);
        boolean hasShela = sheila.isChecked();

        CheckBox bobby = (CheckBox) findViewById(R.id.checkbox_bobby);
        boolean hasBobby = bobby.isChecked();

        CheckBox presto = (CheckBox) findViewById(R.id.checkbox_presto);
        boolean hasPresto = presto.isChecked();

        checkboxValidacao(hasHank, hasEric, hasDiana, hasShela, hasBobby, hasPresto);
        nomeDoDragao( editTextNomeDragao );

        display(resposta);
        resposta = "";
        pontos = 0;
    }
    private String nomeLider(EditText nomeLider){
        if ( lider.equalsIgnoreCase( nomeLider.getText( ).toString( ) ) ) {
            resposta += "\n \n NOME DO LIDER:  Correto! O líder é o Hank! ";
            pontos += 5;
        }else{
            resposta += "\n \n NOME DO LÍDER: Tente de novo.";
        }
        return resposta;
    }
    private String nomeDoDragao(EditText nomeDragrao){
        if ( nomeDoDragao.equalsIgnoreCase( nomeDragrao.getText( ).toString( ) ) ) {
            resposta += "\n \n NOME DO DRAGÃO: Correto! O nome do Dragão é Tiamat.";
            pontos += 5;
        } else {
            resposta += "\n \n NOME DO DRAGÃO: Tente novamente.";
        }
        return resposta;
    }

    public void RadioMascote(View view) {
        boolean checkedMascote = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_fada:
                if (checkedMascote) {
                    resposta += "\n Errado. Não é uma fada. \n ";
                    break;
                }

            case R.id.radio_unicornio:
                if (checkedMascote) {
                    pontos += 5;
                    resposta += " \n Correto! Realmente é um unicórnio! ";
                    break;
                }

            case R.id.radio_dragao:
                if (checkedMascote) {
                    resposta += " \n Errado. Não é um dragão!";
                    break;
                }
        }
    }
    public String checkboxValidacao(boolean hasHank, boolean hasEric, boolean hasDiana, boolean hasShela, boolean hasBobby, boolean hasPresto) {

        if (hasHank) {
            resposta += "\n Hank: Um arco e flecha realmente tem um bom poder de ataque ";
            pontos += 5;
        }

        if (hasEric) {
            resposta += " \n Eric: Possui um escudo! Ótimo para defesa";
        }

        if (hasDiana) {
            resposta += " \n Diana: possui um bastão,junto com as suas habilidades acrobátas, faz uma excelente arma!";
            pontos += 5;
        }

        if (hasShela) {
            resposta += "\n Sheila: Capa Invisível, bom para passar despercebido dos seus oponentes.";
        }

        if (hasBobby) {
            resposta += " \n Bobby:  Possui uma clava, ótimo para nocautear seus oponentes.";
            pontos += 5;
        }

        if (hasPresto) {
            resposta += " \n Presto:O mágico do grupo, quando ele acerta a mágica,pode fazer bons danos nos seus oponentes!";
            pontos += 5;
        }
        return resposta;
    }

    public void armaMagica(View view) {
        boolean checkedArmaMagica = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_forte:
                if (checkedArmaMagica) {
                    resposta += "\n \n Errado. A capa concede um outro poder.";
                    break;
                }
            case R.id.radio_rapida:
                if (checkedArmaMagica) {
                    resposta += "\n \n Errado. A capa concede um outro poder.";
                    break;
                }

            case R.id.radio_inteligente:
                if (checkedArmaMagica) {
                    resposta += "\n \n Errado. A capa concede um outro poder.";
                    break;
                }

            case R.id.radio_invisivel:
                if (checkedArmaMagica) {
                    pontos += 5;
                    resposta += " \n \n Correto! Deixar ela invisível.";
                    break;
                }
        }
    }

    public void nome(View view) {
        boolean checkedNome = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_eric_e_diana:
                if (checkedNome) {
                    resposta += "\n \n Tente de novo:  Eric é o escudeiro e Diana é a acrobata!\n ";
                    break;
                }

            case R.id.radio_eric_e_presto:
                if (checkedNome) {
                    resposta += " \n \n  Tente de novo:  Eric é o escudeiro e Presto é o aprendiz de mago! ";
                    break;
                }

            case R.id.radio_bobby_e_diana:
                if (checkedNome) {
                    resposta += " \n \n Correto!Bobby: É um bárbaro e Diana é uma acrobata. ";
                    pontos += 5;
                    break;
                }

            case R.id.radio_diana_e_sheila:
                if (checkedNome) {
                    resposta += " \n \n Tente de novo: Diana é a acrobata e Sheila é a garota invisível! ";
                    break;
                }
        }
    }

    public void display(String resposta) {
        resposta += "\n \n Sua pontuação: " + pontos;
        TextView apresentacao = (TextView) findViewById(R.id.txt_resposta);
        apresentacao.setText(resposta);

    }
}
