/**
 * [삽입정렬]
 * 두 번째 인덱스부터 해당 인덱스(key 값) 앞에 있는 데이터(B)부터 비교해서 key 값이 더 작으면, 
 * B값을 뒤 인덱스로 복사하고 이를 key 값이 더 큰 데이터를 만날때까지 반복, 
 * 그리고 큰 데이터를 만난 위치 바로 뒤에 key 값을 이동시킨다.
 */
import java.util.ArrayList;
import java.util.Collections;

public class InsertionSort 
{
    public ArrayList<Integer> sort(ArrayList<Integer> dataList) 
	  {
        for (int i = 0; i < dataList.size() - 1; i++) 
			{
            for (int k = i + 1; k > 0; k--) 
				{
                if (dataList.get(k) < dataList.get(k - 1)) 
				{
                    Collections.swap(dataList, k, k - 1);
                } 
				else 
				{
                    break;
                }
            }
        }
        return dataList;
    }
}