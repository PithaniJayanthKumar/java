package com.wipro.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public StreamApi() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String a[]) {
		
		List<String> list = Arrays.asList("jayanth","naveen","kumar");
		List<String> stream = list.stream().
				filter(name->name.startsWith("j")).
				collect(Collectors.toList());
		System.out.println(stream);
		
		List<String> stream1 = list.stream().
				map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(stream1);
				
		
	}
}
