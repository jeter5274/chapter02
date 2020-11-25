package com.javaex.ex07;

public class Song {
	
	//필드 6개
	private String title, artist, album, composer, year;
	private int track;
	
	//생성자 0
	public Song() {}
	
	//생성자 6
	public Song(String title, String artist, String album, String composer, String year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	//생성자 2 title, artist
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	//생성자 2 title, composer 비교 → 생성 안됨 확인
	/*
	public Song(String title, String composer) {
		this.title = title;
		this.composer = composer;
	}
	*/
	
	//생성자 2 title, track 비교 → 생성 확인
	public Song(String title, int track) {
		this.title = title;
		this.track = track;
	}

	
	//getter, setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}
	
	
	//메소드 - 일반메소드 showInfo
	public void showInfo() {
		System.out.println(artist+ ", " +title+ " ( " +album+ ", " +track+"번 track, " +composer+ " 작곡 )");
	}

	//메소드 - 일반메소드 toString() → 테스트용
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
}
