package java_study.co.kr.joongbu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L17SteamEx3 {

	public static void main(String[] args) {
		/*
		 Stream 의 중간연산
	 	 sort() : steam 자료를 정렬
		  */
		// Array 배열의 기본이 되는 타입 : 필드가 Index뿐인 자료형, 선언한 길이를 변경할 수 없다.
		int []numArr = {99, -5,1,2,3}; 	
		
		Arrays.sort(numArr);
		System.out.println(Arrays.toString(numArr));
		
		// List 배열을 제어하기 위한 자료형 	: 필드가 Index와 제어에 유용핝 함수를 포함, 배열의 아이템을 추가 삭제 기능 (길이가 변경 가능)
		List<Integer> numList=new ArrayList<>();
		numList.add(99);
		numList.add(-5);
		numList.add(1);
		numList.add(2);
		numList.add(33);
		numList.add(-7);
		numList.sort(null); // 기본값이 오름차순  정렬 (배열 자신을 변경하는 함수)
		System.out.println(numList);
		
		int []numArr2 = {99, -5, 1, 2, 33, -7};
		// Stream 자료형의 목표는 모든 자료형의 반복문을 통일
		
		Arrays.stream(numArr2)
		.sorted()
		.forEach(System.out::println);
		
		String [] strArr = {"Abc", "zzz","zzz","zzz","zzz", "Bcd","Bcd","Bcd","Bcd", "abc", "aaa", "bbc"};
		
		Arrays.stream(strArr)
		.distinct()	// 중복을 제거하는 중간연산
		.sorted(String.CASE_INSENSITIVE_ORDER)
		.forEach(System.out::println);
		
		int [] intArr3 = {0,2,3,4,3,4,5,6,7,8,9};
		Arrays.stream(intArr3)
		.skip(3)	// 건너뛰는 중간연산
		.limit(3) 	// 길이만큼 잘라내는 연산
		.forEach(System.out::println);
	}

}
