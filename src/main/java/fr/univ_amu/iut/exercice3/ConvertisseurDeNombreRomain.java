package fr.univ_amu.iut.exercice3;

import java.util.HashMap;

public class ConvertisseurDeNombreRomain {
    public int enNombreArabe(String i) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

<<<<<<< HEAD
        int retour = 0;
        int retenue = 0;

        for (char c : i.toCharArray()) {
            if (retenue >= map.get(c) || retenue == 0)
                retour += map.get(c);
            else
                retour += map.get(c) - 2 * retenue;
            retenue = map.get(c);
        }

        return retour;
=======
        int res = 0;

        for (char c : i.toCharArray()) {
            if
            res += map.get(c);
        }

        return res;
>>>>>>> origin/master
    }
}