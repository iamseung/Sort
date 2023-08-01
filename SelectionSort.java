/**
 * [선택정렬]
 * 주어진 데이터 중, 최소값을 찾을 찾고 해당 최소값을 데이터 맨 앞에 위치한 값과 교체한다.
 * 이러한 방식으로 맨 앞의 위치를 뺀 나머지 데이터를 동일한 방법으로 반복함
 */
import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort 
{
    public ArrayList<Integer> sort(ArrayList<Integer> dataList) 
	{
		// 인덱스 번호
        int lowest; 
        for (int i = 0; i < dataList.size() - 1; i++) 
		{
			// 검색하는 인덱스를 최소로 잡아두고 값을 비교하며 최소값을 저장
            lowest = i;
            for (int k = i + 1; i < dataList.size(); k++) 
			{
                if (dataList.get(lowest) > dataList.get(k)) 
				{
                    lowest = k;
                }
            }
            Collections.swap(dataList, lowest, i);
        }
        return dataList;
    }
}