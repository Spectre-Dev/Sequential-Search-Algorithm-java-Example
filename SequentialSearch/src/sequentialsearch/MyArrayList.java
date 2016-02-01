/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequentialsearch;
import java.util.ArrayList;

/**
 *
 * @author Rich
 * @param <ElemType>
 */
public class MyArrayList<ElemType> extends ArrayList<ElemType> {
    //key is an elemType
    public int OrderedSequential(ElemType key) {
        int i = 0;
        while (((Comparable) get(i)).compareTo((Comparable) key) < 0 && i < size()) {
            i = i + 1;
            System.out.println(get(i));
        }
        if (((Comparable) get(i)).compareTo((Comparable) key) == 0) {
            return i;
        } else {
            return -1;
        }
    }
    
    //key is an elemType
    public int UnorderedSequential(ElemType key) {
        for (int k = 0; k < size(); k++) {
            if (((Comparable) get(k)).compareTo((Comparable) key) == 0) {
                return k;
            }
        }
        return -1;
    }
}
