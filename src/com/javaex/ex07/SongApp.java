package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {
		
		//테스트
		Song s01 = new Song("좋은날", "아이유", "Real", "이민수", "2010", 3);
		System.out.println(s01.toString());
		s01.showInfo();
		
		//생성자 Song()
		//setter 사용
		//showInfo() 확인
		
		Song s02 = new Song();
		
		s02.setTitle("거짓말");
		s02.setArtist("BIC BANG");
		s02.setAlbum("Always");
		s02.setComposer("G-DRAGON");
		s02.setYear("2007");
		s02.setTrack(2);
		
		s02.showInfo();
		

		//생성자 Song(매개변수 6개)
		//setter 사용하지 않음
		//showInfo() 확인
		Song s03 = new Song("벚꽃엔딩", "버스커버스커", "버스커버스커 1집", "장범준", "2012", 4);
		s03.showInfo();
		
		
		//생성자 Song(매개변수 2개, 2가지)
		//setter 사용
		//showInfo() 확인
		Song s04 = new Song("마음을드려요", "아이유");
		s04.setAlbum("사랑의 불시착 OST Part 11");
		s04.setComposer("남혜승, 박진호");
		s04.setYear("2020");
		s04.setTrack(1);
		
		s04.showInfo();
		
		Song s05 = new Song("Dynamite", 1);
		s05.setArtist("방탄소년단(BTS)");
		s05.setAlbum("Dynamite (DayTime Version)");
		s05.setComposer("David Stewart, Jessica Agombar");
		s05.setYear("2020");
		
		s05.showInfo();

	}

}
