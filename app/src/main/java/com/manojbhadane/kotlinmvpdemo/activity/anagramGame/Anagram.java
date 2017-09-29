package com.manojbhadane.kotlinmvpdemo.activity.anagramGame;

import java.util.Random;

/**
 * Created by manoj.bhadane on 27-09-2017.
 */
public class Anagram
{

    public static final Random RANDOM = new Random();
    public static final String[] WORDS = {"ACCOUNT", "ADDITION",
            "AGREEMENT", "ANGRY", "ANIMAL", "BEHAVIOUR", "BETWEEN", "BLACK", "CHEMICAL", "FOOLISH",
            "FREQUENT", "GOVERNMENT", "GRAIN", "GRASS", "HOSPITAL", "PAYMENT", "POLITICAL",
            "PROCESS", "SHAME", "SMASH", "SMOOTH", "STATEMENT", "SUBSTANCE", "TEACHING", "TENDENCY",
            "TOMORROW", "TOUCH", "UMBRELLA", "WEATHER", "YESTERDAY"};

    public static String randomWord()
    {
        return WORDS[RANDOM.nextInt(WORDS.length)];
    }

    public static String shuffleWord(String word)
    {
        if (word != null && !"".equals(word))
        {
            char a[] = word.toCharArray();

            for (int i = 0; i < a.length; i++)
            {
                int j = RANDOM.nextInt(a.length);
                char tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }

            return new String(a);
        }

        return word;
    }
}