package com.manojbhadane.kotlinmvpdemo.activity.anagramGame;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.manojbhadane.kotlinmvpdemo.activity.BaseActivity;
import com.manojbhadane.kotlinmvpdemo.R;

/**
 * Created by manoj.bhadane on 27-09-2017.
 */
public class AnagramActivity extends BaseActivity implements View.OnClickListener
{
    private TextView wordTv;
    private EditText wordEnteredTv;
    private Button validate, newGame;
    private String wordToFind;

    @Override
    protected int getLayoutResId()
    {
        return R.layout.activity_anagram;
    }

    @Override
    protected void init()
    {
        wordTv = (TextView) findViewById(R.id.wordTv);
        wordEnteredTv = (EditText) findViewById(R.id.wordEnteredEt);
        validate = (Button) findViewById(R.id.validate);
        validate.setOnClickListener(this);
        newGame = (Button) findViewById(R.id.newGame);
        newGame.setOnClickListener(this);

        newGame();
    }

    @Override
    public void onClick(View view)
    {
        if (view == validate)
        {
            validate();
        } else if (view == newGame)
        {
            newGame();
        }
    }

    private void validate()
    {
        String w = wordEnteredTv.getText().toString();

        if (wordToFind.equals(w))
        {
            Toast.makeText(this, "Congratulations ! You found the word " + wordToFind, Toast.LENGTH_SHORT).show();
            newGame();
        } else
        {
            Toast.makeText(this, "Retry !", Toast.LENGTH_SHORT).show();
        }
    }

    private void newGame()
    {
        wordToFind = Anagram.randomWord();
        String wordShuffled = Anagram.shuffleWord(wordToFind);
        wordTv.setText(wordShuffled);
        wordEnteredTv.setText("");
    }
}
