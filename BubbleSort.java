/**
 * [버블정렬]
 * 두 인접한 데이터를 비교해서, 앞에 있는 데이터가 뒤에 있는 데이터보다 크면, 자리를 바꾸는 정렬 알고리즘
 * 배열의 전체를 순회하면서 앞, 뒤의 데이터를 비교후 Collections.swap으로 자리를 바꿔준다.
 * swap 여부를 체크하며 없을 경우 더 이상 비교할 필요가 없다고 간주하여 해당 루프를 종료한다.
 */
import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort 
{
    public ArrayList<Integer> sort(ArrayList<Integer> dataList) 
	{
        for (int i = 0; i < dataList.size() - 1; i++) 
			{
            boolean swap = false;
            
            for (int k = 0; k < dataList.size() - 1 - i; k++) 
			{
                if (dataList.get(k) > dataList.get(k + 1)) 
				{
                    Collections.swap(dataList, k, k + 1);
                    swap = true;
                }
            }
            
            if (swap == false) break;
        }
        
        return dataList;
    }
}