package comp3350.g3.tasteBud.data.hsqldb;

import comp3350.g3.tasteBud.object.Ingredient;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class UtilitiesForDB {
    public static final String FIELD_SEP = "\n";


    public static String encoding(List<String> stringList) {
        if (stringList == null) {
            throw new IllegalArgumentException("String list must not be null");
        }

        StringBuilder sb = new StringBuilder();

        int size = stringList.size();
        int i = 0;

        while (size > 0) {
            sb.append(stringList.get(i));

            size--;
            i++;

            if (size > 0) {
                sb.append(FIELD_SEP);
            }
        }

        return sb.toString();
    }

}