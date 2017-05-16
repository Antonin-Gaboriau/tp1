package fr.univ_amu.iut.exercice2;

public class FizzBuzzer {

    public String computeString(int i) {
        if (i % 3 == 0 && i % 5 == 0)
            return "FizzBuzz";
        else if (i % 3 == 0)
            return "Fizz";
        else if (i % 5 == 0)
            return "Buzz";
        else
            return Integer.toString(i);
    }

    public String[] computeList(int i) {
        String[] tab = new String[i];
        for (int j = 0; j < i; ++j) {
            tab[j] = computeString(j + 1);
        }
        return tab;
    }
}
