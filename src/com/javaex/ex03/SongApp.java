package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {

		Song betterDay = new Song();
		Song lie = new Song();
		Song endingOfCherryBlossoms = new Song();
		
		betterDay.setTitle("좋은날");
		betterDay.setArtist("아이유");
		betterDay.setAlbum("Real");
		betterDay.setComposer("이민수");
		betterDay.setYear("2010");
		betterDay.setTrack(3);
		
		/*
		//setter, getter chk
		String title = betterDay.getTitle();
		String artist = betterDay.getArtist();
		String album = betterDay.getAlbum();
		String composer = betterDay.getComposer();
		int year = betterDay.getYear();
		int track = betterDay.getTrack();
		
		System.out.println(title);
		System.out.println(artist);
		System.out.println(album);
		System.out.println(composer);
		System.out.println(year);
		System.out.println(track);
		*/

		betterDay.showInfo();
		
		lie.setTitle("거짓말");
		lie.setArtist("BIG BANG");
		lie.setAlbum("Always");
		lie.setComposer("G-DRAGON");
		lie.setYear("2007");
		lie.setTrack(2);
		
		lie.showInfo();
		
		endingOfCherryBlossoms.setTitle("벚꽃엔딩");
		endingOfCherryBlossoms.setArtist("버스커버스커");
		endingOfCherryBlossoms.setAlbum("버스커버스커1집");
		endingOfCherryBlossoms.setComposer("장범준");
		endingOfCherryBlossoms.setYear("2012");
		endingOfCherryBlossoms.setTrack(4); 
		
		endingOfCherryBlossoms.showInfo();
		
		Song giveMind = new Song("마음을 드려요", "아이유", "사랑의 불시착 OST Part 11", "남혜승, 박진호", "2020", 1);
		giveMind.showInfo();
	}

}
