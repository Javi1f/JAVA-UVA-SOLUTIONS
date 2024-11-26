import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WhatsCryptanalysis {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		LinkedHashMap<Character, Integer> mapto = new LinkedHashMap<>();
		int n = Integer.parseInt(bf.readLine());

		for (int i = 0; i < n; i++) {

			String line = bf.readLine().toUpperCase();

			for (int j = 0; j < line.length(); j++) {
				char temp = line.charAt(j);
				if (Character.isLetter(temp) && !Character.isWhitespace(temp)) {

					if (!mapto.containsKey(temp)) {
						mapto.put(temp, 0);
					}
					mapto.put(temp, mapto.get(temp) + 1);
				}
			}

		}

		mapto = sort(mapto);

		for (Map.Entry<Character, Integer> entry : mapto.entrySet()) {

			System.out.println(entry.getKey() + " " + entry.getValue());

		}

	}

	public static LinkedHashMap<Character, Integer> sort(LinkedHashMap<Character, Integer> map) {
		List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort(new Comparator<Map.Entry<Character, Integer>>() {
			@Override
			public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
				int valueCompare = o2.getValue().compareTo(o1.getValue());
				if (valueCompare != 0) {
					return valueCompare;
				} else {
					return o1.getKey().compareTo(o2.getKey());
				}
			}
		});

		LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<>();
		for (Map.Entry<Character, Integer> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		return sortedMap;
	}
}
