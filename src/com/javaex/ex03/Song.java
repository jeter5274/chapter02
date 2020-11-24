package com.javaex.ex03;

public class Song {
	
	private String title, artist, album, composer, year; //노래제목, 가수, 앨범명, 작곡가, 발표연도
	private int track; //트랙번호
	
	//생성자
	//문법이 메소드와 유사함, 이름은 클래스명이며, 리턴값이 없다.
	public Song() {
		//메모리에 올린다.
	}
	
	public Song(String title, String artist, String album, String composer, String year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	/*
	//노래제목
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	//가수
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getArtist() {
		return artist;
	}
	
	//앨범명
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public String getAlbum() {
		return album;
	}
	
	//작곡가
	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	public String getComposer() {
		return composer;
	}
	
	//노래발표연도
	public void setYear(String year) {
		this.year = year;
	}
	
	public String getYear() {
		return year;
	}
	
	//트랙번호
	public void setTrack(int track) {
		this.track = track;
	}
	
	public int getTrack() {
		return track;
	}
	*/
	
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


	//정보출력 메소드
	public void showInfo() {
		System.out.println(artist+ ", " +title+ " ( " +album+ ", " +year+ ", " +track+ "번 track, " +composer+ " 작곡 )");
	}
}
