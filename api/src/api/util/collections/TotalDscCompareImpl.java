package api.util.collections;

import java.util.Comparator;

public class TotalDscCompareImpl implements Comparator<GradeVO>{
	// 총점 내림차순 정렬
	@Override
	public int compare(GradeVO first, GradeVO second) {
		return (first.getTotal() > second.getTotal()) ? 
				-1 : (first.getTotal() < second.getTotal()) ?
						1 :0 ;
	}

}
