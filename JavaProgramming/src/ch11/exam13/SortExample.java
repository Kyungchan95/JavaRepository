package ch11.exam13;

import java.util.Arrays;
import java.util.Collections;

public class SortExample {
	public static void main(String[] args) {
		String[] names = { "홍길동", "김민수", "박동수" };

		// 올림차순으로 정렬
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));

		// 내림차순으로 정렬
		Arrays.sort(names, Collections.reverseOrder());
		System.out.println(Arrays.toString(names));

		Member[] members = { new Member("정세미", 25), new Member("장성근", 200), new Member("세종대왕", 621) };

		// 올림차순으로 정렬
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));

		// 내림차순으로 정렬
		Arrays.sort(members, Collections.reverseOrder());
		System.out.println(Arrays.toString(members));
	}

}
