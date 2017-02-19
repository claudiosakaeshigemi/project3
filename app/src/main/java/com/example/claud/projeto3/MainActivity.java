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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resposta = "";
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

    public void validar(View view) {

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
        display(resposta);
        resposta = "";
        pontos = 0;
    }

    public String checkboxValidacao(boolean hasHank, boolean hasEric, boolean hasDiana, boolean hasShela, boolean hasBobby, boolean hasPresto) {


        if (hasHank) {
            resposta += "\n \n Hank:Boa escolha ! Um verdadeiro líder! ";
        }

        if (hasEric) {
            resposta += "\n \n Eric:Palhaço do grupo mas, no final ele está lá pelos seus amigos!";
        }

        if (hasDiana) {
            resposta += "\n \n Diana:Uma das minhas favoritas também:Segundo em comando. Sabe tomar as decisões quando é necessário.  ";
        }

        if (hasShela) {
            resposta += "\n \n Sheila:Bom gosto! Ela é o Coração da equipe.";
        }

        if (hasBobby) {
            resposta += "\n \n Bobby:O meu favorito: Meio esquentadinho do grupo,mas, está sempre disposto a proteger a sua irmã!";
        }

        if (hasPresto) {
            resposta += "\n \n O nerd do grupo.";
        }
        return resposta;
    }

    public void armaMagica(View view) {
        boolean checkedArmaMagica = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radio_forte:
                if (checkedArmaMagica) {
                    resposta += "\n \n Errado. A capa concede um outro poder. \n ";
                    break;
                }

            case R.id.radio_rapida:
                if (checkedArmaMagica) {
                    resposta += "\n \n Errado. A capa concede um outro poder. \n ";
                    break;
                }

            case R.id.radio_inteligente:
                if (checkedArmaMagica) {
                    resposta += "\n \n Errado. A capa concede um outro poder. \n ";
                    break;
                }

            case R.id.radio_invisivel:
                if (checkedArmaMagica) {
                    pontos += 5;
                    resposta += " \n \n Correto! Deixar ela invisível. ";
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
        EditText nome = (EditText) findViewById(R.id.edit_text_nome);

        resposta += "\n \n Sua pontuação: " + pontos;

        resposta += "\n \n Realizado por : " + nome.getText().toString();

        TextView apresentacao = (TextView) findViewById(R.id.txt_resposta);

        apresentacao.setText(resposta);


    }

}
