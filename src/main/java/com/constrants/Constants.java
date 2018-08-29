package com.constrants;

import java.util.ArrayList;
import java.util.List;

public interface Constants {
	/**
	 * 
	 * 分页大小
	 *
	 */
	interface pageSize{
		
		int SMALL_SIZE = 5;
		
		int MIDDLE_SIZE = 10;
		
		int LARGE_SIZE = 20;
	}
	
	interface result{
		int ok = 1;
		
		int err = 0;
	}
	
	interface EXCEL_HEAD{
		List<String> order = new ArrayList<>();
	}
}
